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

package org.dylanfoundry.deft.module;

import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.ide.util.projectWizard.ProjectJdkForModuleStep;
import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;
import org.dylanfoundry.deft.DeftIcons;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class DeftModuleType extends ModuleType<DeftModuleBuilder> {
  private static final DeftModuleType INSTANCE = new DeftModuleType();

  public DeftModuleType() {
    super("DEFT_MODULE");
  }

  @Override
  public DeftModuleBuilder createModuleBuilder() {
    return new DeftModuleBuilder();
  }

  @Override
  public String getName() {
    return "Dylan";
  }

  @Override
  public String getDescription() {
    return "Add support for Dylan";
  }

  @Override
  public Icon getBigIcon() {
    return null;
  }

  @Override
  public Icon getNodeIcon(@Deprecated boolean isOpened) {
    return DeftIcons.DEFT;
  }

  public static DeftModuleType getInstance() {
    return INSTANCE;
  }

  @NotNull
  public ModuleWizardStep[] createWizardSteps(@NotNull final WizardContext wizardContext,
                                              @NotNull final DeftModuleBuilder moduleBuilder,
                                              @NotNull final ModulesProvider modulesProvider) {
    return new ModuleWizardStep[]{new ProjectJdkForModuleStep(wizardContext, DeftSdkType.getInstance()) {
      public void updateDataModel() {
        super.updateDataModel();
        moduleBuilder.setModuleJdk(getJdk());
      }
    }};
  }
}
