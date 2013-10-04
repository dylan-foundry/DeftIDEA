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

package org.dylanfoundry.deft.filetypes.dylan.inspections;

import com.intellij.codeInspection.ProblemHighlightType;
import com.intellij.codeInspection.ProblemsHolder;
import com.intellij.psi.PsiElementVisitor;
import org.dylanfoundry.deft.DeftBundle;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanHeader;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanHeaders;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanVisitor;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

class MustContainModuleInspection extends AbstractDylanInspection {
  @Override
  public String getStaticDescription() {
    return DeftBundle.message("inspections.dylan.must-contain-module.static-description");
  }

  @Override
  @Nls
  @NotNull
  public String getDisplayName() {
    return DeftBundle.message("inspections.dylan.must-contain-module.display-name");
  }

  @NotNull
  public PsiElementVisitor buildVisitor(@NotNull final ProblemsHolder holder, boolean isOnTheFly) {
    return new DylanVisitor() {
      @Override
      public void visitHeaders(@NotNull DylanHeaders items) {
        boolean hasModuleProperty = false;
        for (DylanHeader item : items.getHeaderList()) {
          if (item.getHeaderKey().getText().toLowerCase().equals("module")) {
            hasModuleProperty = true;
            break;
          }
        }
        if (!hasModuleProperty) {
          holder.registerProblem(items.getFirstChild(), DeftBundle.message("inspections.dylan.must-contain-module.register-problem"), ProblemHighlightType.ERROR);
        }
      }
    };
  }
}
