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

package org.dylanfoundry.deft.module.facet;

import com.intellij.facet.FacetConfiguration;
import com.intellij.facet.ui.FacetEditorContext;
import com.intellij.facet.ui.FacetEditorTab;
import com.intellij.facet.ui.FacetValidatorsManager;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.util.InvalidDataException;
import com.intellij.openapi.util.WriteExternalException;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;

public class DeftFacetConfiguration implements FacetConfiguration, PersistentStateComponent<DeftModuleSettings> {
  private DeftModuleSettings mySettings = new DeftModuleSettings();

  public FacetEditorTab[] createEditorTabs(final FacetEditorContext editorContext,
                                           final FacetValidatorsManager validatorsManager) {
    return new FacetEditorTab[]{new DeftFacetEditorTab(mySettings)};
  }

  public void readExternal(Element element) throws InvalidDataException {
  }

  public void writeExternal(Element element) throws WriteExternalException {
  }

  @Override
  @NotNull
  public DeftModuleSettings getState() {
    return mySettings;
  }

  public void setSdk(Sdk sdk) {
    mySettings.openDylanSdkName = sdk == null ? null : sdk.getName();
  }

  @Override
  public void loadState(DeftModuleSettings state) {
    XmlSerializerUtil.copyBean(state, mySettings);
  }
}
