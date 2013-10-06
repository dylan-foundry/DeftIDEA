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

package org.dylanfoundry.deft.filetypes.lid.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiElementFilter;
import com.intellij.psi.util.PsiTreeUtil;
import org.dylanfoundry.deft.filetypes.lid.psi.LIDItem;
import org.dylanfoundry.deft.filetypes.lid.psi.LIDTypes;
import org.dylanfoundry.deft.filetypes.lid.psi.LIDValues;

public class LIDPsiImplUtil {
    public static String getKey(LIDItem element) {
      ASTNode keyNode = element.getNode().findChildByType(LIDTypes.KEY);
      if (keyNode != null) {
        return keyNode.getText();
      } else {
        return null;
      }
    }

    public static PsiElement[] getValues(LIDValues element) {
      return PsiTreeUtil.collectElements(element, new PsiElementFilter() {
        @Override
        public boolean isAccepted(PsiElement e) {
          return (e.getNode().getElementType() == LIDTypes.VALUE);
        }
      });
    }
}
