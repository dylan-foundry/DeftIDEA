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

import com.intellij.facet.Facet;
import com.intellij.facet.FacetType;
import com.intellij.facet.FacetTypeId;
import com.intellij.openapi.module.JavaModuleType;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleType;
import org.dylanfoundry.deft.DeftIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class DeftFacetType extends FacetType<DeftFacet, DeftFacetConfiguration> {
  public final static FacetTypeId<DeftFacet> FACET_TYPE_ID = new FacetTypeId<DeftFacet>("Deft");

  public DeftFacetType() {
    super(FACET_TYPE_ID, DeftModuleSettings.FACET_ID, DeftModuleSettings.FACET_NAME);
  }

  @Override
  public DeftFacetConfiguration createDefaultConfiguration() {
    return new DeftFacetConfiguration();
  }

  @Override
  public DeftFacet createFacet(@NotNull final Module module,
                             final String name,
                             @NotNull final DeftFacetConfiguration configuration,
                             @Nullable final Facet underlyingFacet) {
    return new DeftFacet(this, module, name, configuration, underlyingFacet);
  }

  @Override
  public boolean isSuitableModuleType(final ModuleType moduleType) {
    return moduleType instanceof JavaModuleType;
  }

  @Override
  public Icon getIcon() {
    return DeftIcons.DEFT;
  }

  public static DeftFacetType getInstance() {
    return findInstance(DeftFacetType.class);
  }

}
