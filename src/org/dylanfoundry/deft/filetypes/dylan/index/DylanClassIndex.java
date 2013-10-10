/*
 * Copyright 2013, Bruce Mitchener, Jr.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dylanfoundry.deft.filetypes.dylan.index;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.search.PsiElementProcessor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.indexing.*;
import com.intellij.util.io.EnumeratorStringDescriptor;
import com.intellij.util.io.KeyDescriptor;
import gnu.trove.THashMap;
import gnu.trove.THashSet;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanDefinitionClassDefiner;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanDefinition;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanSourceRecords;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class DylanClassIndex extends ScalarIndexExtension<String> {
  public static final ID<String, Void> DYLAN_SYMBOL_INDEX = ID.create("DylanClassIndex");
  private static final int INDEX_VERSION = 1;
  private DataIndexer<String, Void, FileContent> myDataIndexer = new MyDataIndexer();

  @NotNull
  @Override
  public ID<String, Void> getName() {
    return DYLAN_SYMBOL_INDEX;
  }

  @Override
  public int getVersion() {
    return INDEX_VERSION;
  }

  @NotNull
  @Override
  public DataIndexer<String, Void, FileContent> getIndexer() {
    return myDataIndexer;
  }

  @Override
  public KeyDescriptor<String> getKeyDescriptor() {
    return new EnumeratorStringDescriptor();
  }

  @Override
  public FileBasedIndex.InputFilter getInputFilter() {
    return DylanIndexUtil.DYLAN_INPUT_FILTER;
  }

  @Override
  public boolean dependsOnFileContent() {
    return true;
  }

  public static Collection<String> getNames(Project project) {
    return FileBasedIndex.getInstance().getAllKeys(DYLAN_SYMBOL_INDEX, project);
  }

  public static List<DylanDefinitionClassDefiner> getItemsByName(Project project, final String name, GlobalSearchScope searchScope) {
    final Collection<VirtualFile> files = FileBasedIndex.getInstance().getContainingFiles(DYLAN_SYMBOL_INDEX, name, searchScope);
    final Set<DylanDefinitionClassDefiner> result = new THashSet<DylanDefinitionClassDefiner>();
    for (VirtualFile vFile : files) {
      final PsiFile psiFile = PsiManager.getInstance(project).findFile(vFile);
      if (psiFile == null || !DylanIndexUtil.isDylanFileType(psiFile.getFileType())) {
        continue;
      }
      processComponents(psiFile, new PsiElementProcessor<DylanDefinitionClassDefiner>() {
        @Override
        public boolean execute(@NotNull DylanDefinitionClassDefiner component) {
          if (name.equals(component.getNameIdentifier().getText())) {
            result.add(component);
          }
          return true;
        }
      });
    }
    return new ArrayList<DylanDefinitionClassDefiner>(result);
  }

  private static class MyDataIndexer implements DataIndexer<String, Void, FileContent> {
    @Override
    @NotNull
    public Map<String, Void> map(final FileContent inputData) {
      final PsiFile psiFile = inputData.getPsiFile();
      final Map<String, Void> result = new THashMap<String, Void>();
      processComponents(psiFile, new PsiElementProcessor<DylanDefinitionClassDefiner>() {
        @Override
        public boolean execute(@NotNull DylanDefinitionClassDefiner component) {
          if (component.getNameIdentifier() != null) {
            result.put(component.getNameIdentifier().getText(), null);
          }
          return true;
        }
      });
      return result;
    }
  }

  private static void processComponents(PsiFile psiFile, PsiElementProcessor<DylanDefinitionClassDefiner> processor) {
    final DylanSourceRecords records = PsiTreeUtil.getChildOfType(psiFile, DylanSourceRecords.class);
    if (records == null) {
      return;
    }
    final DylanDefinition[] definitions = PsiTreeUtil.getChildrenOfType(records, DylanDefinition.class);
    if (definitions == null) {
      return;
    }
    for (DylanDefinition definition : definitions) {
      final DylanDefinitionClassDefiner[] components = PsiTreeUtil.getChildrenOfType(definition, DylanDefinitionClassDefiner.class);
      if (components == null) {
        continue;
      }
      for (DylanDefinitionClassDefiner component : components) {
        final String componentName = component.getName();
        if (componentName != null) {
          if (!processor.execute(component)) {
            continue;
          }
        }
      }
    }
  }
}
