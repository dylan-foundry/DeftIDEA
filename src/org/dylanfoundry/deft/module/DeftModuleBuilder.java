/*
 * Copyright 2013, Konstantin Bulenkov.
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

import com.intellij.facet.FacetManager;
import com.intellij.facet.FacetType;
import com.intellij.facet.FacetTypeRegistry;
import com.intellij.facet.ModifiableFacetModel;
import com.intellij.ide.util.projectWizard.*;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.projectRoots.ProjectJdkTable;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;
import com.intellij.openapi.util.text.StringUtil;
import org.dylanfoundry.deft.DeftBundle;
import org.jetbrains.annotations.NotNull;
import org.dylanfoundry.deft.DeftIcons;
import org.dylanfoundry.deft.module.facet.DeftFacet;
import org.dylanfoundry.deft.module.facet.DeftFacetType;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class DeftModuleBuilder extends JavaModuleBuilder implements ModuleBuilderListener {
  private Sdk mySdk;

  public DeftModuleBuilder() {
    addListener(this);
  }

  @Override
  public String getBuilderId() {
    return "dylan";
  }

  @Override
  public Icon getBigIcon() {
    return null;
  }

  @Override
  public Icon getNodeIcon() {
    return DeftIcons.DEFT;
  }

  @Override
  public String getDescription() {
    if (ProjectJdkTable.getInstance().getSdksOfType(DeftSdkType.getInstance()).isEmpty()) {
      return DeftBundle.message("module.description.no_sdk");
    } else {
      return DeftBundle.message("module.description");
    }
  }

  @Override
  public String getPresentableName() {
    return DeftBundle.message("module.name.presentable");
  }

  @Override
  public String getGroupName() {
    return DeftBundle.message("module.name.group");
  }

  @Override
  public ModuleWizardStep[] createWizardSteps(WizardContext wizardContext, ModulesProvider modulesProvider) {
    return new ModuleWizardStep[]{new DeftModuleWizardStep(this)};
  }

  public void moduleCreated(@NotNull final Module module) {
    if (mySdk != null && mySdk.getSdkType() instanceof DeftSdkType) {
      setupFacet(module, mySdk);
    }
  }

  public static void setupFacet(Module module, Sdk sdk) {
    final String facetId = DeftFacetType.getInstance().getStringId();
    if (!StringUtil.isEmptyOrSpaces(facetId)) {

      final FacetManager facetManager = FacetManager.getInstance(module);
      final FacetType<?, ?> type = FacetTypeRegistry.getInstance().findFacetType(facetId);

      if (type != null) {
        if (facetManager.getFacetByType(type.getId()) == null) {
          final ModifiableFacetModel model = facetManager.createModifiableModel();

          final DeftFacet facet = (DeftFacet) facetManager.addFacet(type, type.getDefaultFacetName(), null);
          facet.getConfiguration().setSdk(sdk);
          model.addFacet(facet);
          model.commit();
        }
      }
    }
  }

  public void setSdk(Sdk sdk) {
    mySdk = sdk;
  }

  @Override
  protected List<WizardInputField> getAdditionalFields() {
    return Arrays.<WizardInputField>asList(new DeftWizardInputField());
  }
}
