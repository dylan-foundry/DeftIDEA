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

package org.dylanfoundry.deft.filetypes.dylan;

import com.intellij.navigation.ChooseByNameContributor;
import com.intellij.navigation.NavigationItem;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.indexing.FileBasedIndex;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanDefinition;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanFile;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanNamedElement;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanSourceRecords;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DylanChooseByNameContributor implements ChooseByNameContributor {
  @NotNull
  @Override
  public String[] getNames(Project project, boolean includeNonProjectItems) {
    List<DylanNamedElement> definitions = findDefinitions(project);
    List<String> names = new ArrayList<String>(definitions.size());
    for (DylanNamedElement definition : definitions) {
      if (definition.getName() != null && definition.getName().length() > 0) {
        names.add(definition.getName());
      }
    }
    return names.toArray(new String[names.size()]);
  }

  @NotNull
  @Override
  public NavigationItem[] getItemsByName(String name, String pattern, Project project, boolean includeNonProjectItems) {
    // todo include non project items
    List<DylanNamedElement> definitions = findDefinitions(project, name);
    return definitions.toArray(new NavigationItem[definitions.size()]);
  }

  public static List<DylanNamedElement> findDefinitions(Project project, String name) {
    List<DylanNamedElement> result = null;
    Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, DylanFileType.INSTANCE,
            GlobalSearchScope.allScope(project));
    for (VirtualFile virtualFile : virtualFiles) {
      DylanFile dylanFile = (DylanFile) PsiManager.getInstance(project).findFile(virtualFile);
      if (dylanFile != null) {
        DylanSourceRecords sourceRecords = PsiTreeUtil.getChildOfType(dylanFile, DylanSourceRecords.class);
        if (sourceRecords != null) {
          DylanDefinition[] definitions = PsiTreeUtil.getChildrenOfType(sourceRecords, DylanDefinition.class);
          if (definitions != null) {
            for (DylanDefinition definition : definitions) {
              DylanNamedElement definer = PsiTreeUtil.getChildOfType(definition, DylanNamedElement.class);
              if (definer != null) {
                if (name.equals(definer.getName())) {
                  if (result == null) {
                    result = new ArrayList<DylanNamedElement>();
                  }
                  result.add(definer);
                }
              }
            }
          }
        }
      }
    }
    return result != null ? result : Collections.<DylanNamedElement>emptyList();
  }

  public static List<DylanNamedElement> findDefinitions(Project project) {
    List<DylanNamedElement> result = new ArrayList<DylanNamedElement>();
    Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, DylanFileType.INSTANCE,
            GlobalSearchScope.allScope(project));
    for (VirtualFile virtualFile : virtualFiles) {
      DylanFile dylanFile = (DylanFile) PsiManager.getInstance(project).findFile(virtualFile);
      if (dylanFile != null) {
        DylanSourceRecords sourceRecords = PsiTreeUtil.getChildOfType(dylanFile, DylanSourceRecords.class);
        if (sourceRecords != null) {
          DylanDefinition[] definitions = PsiTreeUtil.getChildrenOfType(sourceRecords, DylanDefinition.class);
          if (definitions != null) {
            for (DylanDefinition definition : definitions) {
              DylanNamedElement definer = PsiTreeUtil.getChildOfType(definition, DylanNamedElement.class);
              if (definer != null) {
                if (result == null) {
                  result = new ArrayList<DylanNamedElement>();
                }
                result.add(definer);
              }
            }
          }
        }
      }
    }
    return result;
  }
}
