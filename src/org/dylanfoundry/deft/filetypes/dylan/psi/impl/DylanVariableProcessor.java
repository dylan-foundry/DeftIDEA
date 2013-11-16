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

package org.dylanfoundry.deft.filetypes.dylan.psi.impl;

import com.intellij.openapi.util.Key;
import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveState;
import com.intellij.psi.scope.BaseScopeProcessor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.containers.ContainerUtil;
import org.dylanfoundry.deft.filetypes.dylan.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DylanVariableProcessor extends BaseScopeProcessor {
  public static final Key<Map<String, DylanVariableName>> DYLAN_VARIABLE_CONTEXT = Key.create("DYLAN_VARIABLE_CONTEXT");
  private List<DylanVariableName> myVariableList = new ArrayList<DylanVariableName>(0);
  private final String myRequestedName;
  private final PsiElement myOrigin;

  public DylanVariableProcessor(String requestedName, PsiElement origin) {
    myRequestedName = requestedName;
    myOrigin = origin;
  }

  @Override
  public boolean execute(@NotNull PsiElement psiElement, ResolveState resolveState) {
    Map<String, DylanVariableName> variableContext = psiElement.getContainingFile().getOriginalFile().getUserData(DYLAN_VARIABLE_CONTEXT);
    if (variableContext != null) {
      ContainerUtil.addIfNotNull(variableContext.get(myRequestedName), myVariableList);
      return true;
    }
    if (!(psiElement instanceof DylanVariableName)) return true;

    if (!psiElement.getText().equals(myRequestedName)) return true;
    if (psiElement.equals(myOrigin)) return true;

    DylanDefinitionFunctionDefiner functionDefinition = PsiTreeUtil.getTopmostParentOfType(myOrigin, DylanDefinitionFunctionDefiner.class);
    DylanDefinitionMethodDefiner methodDefinition = PsiTreeUtil.getTopmostParentOfType(myOrigin, DylanDefinitionMethodDefiner.class);
    DylanParameters parameters = null;
    if (functionDefinition != null) {
      parameters = (functionDefinition.getParameterList() != null) ? functionDefinition.getParameterList().getParameters() : null;
    } else if (methodDefinition != null) {
      parameters = (methodDefinition.getParameterList() != null) ? methodDefinition.getParameterList().getParameters() : null;
    }

    boolean inLocalDeclaration = inLeftPartOfLocalDeclaration(psiElement);

    boolean inParameters = PsiTreeUtil.isAncestor(parameters, psiElement, false);

    if (inParameters || inLocalDeclaration) {
      return !myVariableList.add((DylanVariableName) psiElement);
    }

    return true;
  }

  private static boolean inLeftPartOfLocalDeclaration(PsiElement psiElement) {
    DylanLocalDeclaration localDeclaration = PsiTreeUtil.getParentOfType(psiElement, DylanLocalDeclaration.class);
    if (localDeclaration == null) return false;
    DylanBindings bindings = localDeclaration.getBindings();
    if (bindings == null) return false;
    return PsiTreeUtil.isAncestor(bindings.getVariable(), psiElement, true);
  }

  @Nullable
  public DylanVariableName getResult() {
    return ContainerUtil.getFirstItem(myVariableList);
  }
}
