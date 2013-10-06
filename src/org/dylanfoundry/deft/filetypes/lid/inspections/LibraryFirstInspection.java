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
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.dylanfoundry.deft.DeftBundle;
import org.dylanfoundry.deft.filetypes.lid.psi.LIDItem;
import org.dylanfoundry.deft.filetypes.lid.psi.LIDItems;
import org.dylanfoundry.deft.filetypes.lid.psi.LIDVisitor;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class LibraryFirstInspection extends AbstractLIDInspection {
  @Override
  public String getStaticDescription() {
    return DeftBundle.message("inspections.lid.library-first.static-description");
  }

  @Override
  @Nls
  @NotNull
  public String getDisplayName() {
    return DeftBundle.message("inspections.lid.library-first.display-name");
  }

  @NotNull
  public PsiElementVisitor buildVisitor(@NotNull final ProblemsHolder holder, boolean isOnTheFly) {
    return new LIDVisitor() {
      @Override
      public void visitItems(@NotNull LIDItems items) {
        for (LIDItem item : items.getItemList()) {
          if (item.getKey().toLowerCase().equals("files")) {
            PsiElement itemValues[] = item.getValues().getValues();
            if (itemValues.length > 0) {
              String firstFileName = itemValues[0].getText().toLowerCase();
              if (firstFileName.contains(".")) {
                firstFileName = firstFileName.substring(0, firstFileName.indexOf(".") - 1);
              }
              if (!firstFileName.matches("library") && !firstFileName.endsWith("-library") && !firstFileName.endsWith("-lib")) {
                holder.registerProblem(itemValues[0], DeftBundle.message("inspections.lid.library-first.register-problem", ProblemHighlightType.ERROR));
              }
            }
            break;
          }
        }
      }
    };
  }
}
