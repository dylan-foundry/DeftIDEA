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

import com.intellij.ide.util.projectWizard.*;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.projectRoots.ProjectJdkTable;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.projectRoots.SdkTypeId;
import com.intellij.openapi.roots.CompilerModuleExtension;
import com.intellij.openapi.roots.ModifiableRootModel;
import com.intellij.openapi.roots.ModuleRootManager;
import org.dylanfoundry.deft.DeftBundle;
import org.jetbrains.annotations.NotNull;
import org.dylanfoundry.deft.DeftIcons;

import javax.swing.*;

public class DeftModuleBuilder extends JavaModuleBuilder implements SourcePathsBuilder, ModuleBuilderListener {
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
  public void setupRootModel(ModifiableRootModel modifiableRootModel) throws ConfigurationException {
    addListener(this);
    super.setupRootModel(modifiableRootModel);
  }

  public void moduleCreated(@NotNull final Module module) {
    ModifiableRootModel modifiableModel = ModuleRootManager.getInstance(module).getModifiableModel();
    try {
      CompilerModuleExtension extension = modifiableModel.getModuleExtension(CompilerModuleExtension.class);
      extension.setCompilerOutputPath(extension.getCompilerOutputUrl());
      extension.inheritCompilerOutputPath(false);
    }
    finally {
      modifiableModel.commit();
    }
  }

  @Override
  public boolean isSuitableSdkType(SdkTypeId sdkType) {
    return sdkType instanceof DeftSdkType;
  }
}
