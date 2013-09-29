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
import com.intellij.facet.FacetManager;
import com.intellij.facet.FacetType;
import com.intellij.openapi.module.Module;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DeftFacet extends Facet<DeftFacetConfiguration> {
  public DeftFacet(@NotNull final FacetType facetType,
                 @NotNull final Module module,
                 final String name,
                 @NotNull final DeftFacetConfiguration configuration,
                 Facet underlyingFacet) {
    super(facetType, module, name, configuration, underlyingFacet);
  }

  @Nullable
  public static DeftFacet getInstance(Module module) {
    return FacetManager.getInstance(module).getFacetByType(DeftFacetType.FACET_TYPE_ID);
  }
}

