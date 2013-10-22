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

import com.intellij.codeInsight.navigation.MethodNavigationOffsetProvider;
import com.intellij.psi.*;
import gnu.trove.TIntArrayList;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanDefinition;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanFile;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collection;

public class DylanMethodNavigationOffsetProvider implements MethodNavigationOffsetProvider {
  @Override
  @Nullable
  public int[] getMethodNavigationOffsets(final PsiFile file, final int caretOffset) {
    if (file instanceof DylanFile) {
      ArrayList<PsiElement> array = new ArrayList<PsiElement>();
      addNavigationElements(array, file);
      return offsetsFromElements(array);
    }
    return null;
  }

  private static void addNavigationElements(ArrayList<PsiElement> array, PsiElement element) {
    PsiElement[] children = element.getChildren();
    for (PsiElement child : children) {
      if (child instanceof DylanDefinition) {
        array.add(child);
      } else {
        addNavigationElements(array, child);
      }
    }
  }

  private static int[] offsetsFromElements(final Collection<PsiElement> array) {
    TIntArrayList offsets = new TIntArrayList(array.size());
    for (PsiElement element : array) {
      int offset = element.getTextOffset();
      assert offset >= 0 : element + " ("+element.getClass()+"); offset: " + offset;
      offsets.add(offset);
    }
    offsets.sort();
    return offsets.toNativeArray();
  }
}
