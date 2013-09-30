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

package org.dylanfoundry.deft.filetypes.lid.inspections;

import com.intellij.codeInspection.ProblemHighlightType;
import com.intellij.codeInspection.ProblemsHolder;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiFile;
import com.intellij.psi.util.PsiTreeUtil;
import org.dylanfoundry.deft.filetypes.lid.psi.LIDFile;
import org.dylanfoundry.deft.filetypes.lid.psi.LIDProperty;
import org.dylanfoundry.deft.filetypes.lid.psi.LIDVisitor;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

class MustContainLibraryInspection extends AbstractLIDInspection {
  @Override
  public String getStaticDescription() {
    return "LID files must have a library keyword.";
  }

  @Override
  @Nls
  @NotNull
  public String getDisplayName() {
    return "Must contain 'Library'";
  }

  public PsiElementVisitor buildVisitor(@NotNull final ProblemsHolder holder, boolean isOnTheFly) {
    return new LIDVisitor() {
      @Override
      public void visitFile(PsiFile file) {
        if (file instanceof LIDFile) {
          LIDProperty[] properties = PsiTreeUtil.getChildrenOfType(file, LIDProperty.class);
          if (properties != null) {
            boolean hasLibraryProperty = false;
            for (LIDProperty property : properties) {
              if (property.getFirstChild().getText().toLowerCase().equals("library")) {
                hasLibraryProperty = true;
                break;
              }
            }
            if (hasLibraryProperty == false) {
              holder.registerProblem(properties[0], "Must contain 'Library' property.", ProblemHighlightType.ERROR);
            }
          }
        }
      }
    };
  }
}
