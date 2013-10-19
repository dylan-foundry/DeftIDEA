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

package org.dylanfoundry.deft.filetypes.dylan.highlight;

import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DylanBraceMatcher implements PairedBraceMatcher {

  private static final BracePair[] PAIRS = {
    new BracePair(DylanTypes.LPAREN, DylanTypes.RPAREN, false),
    new BracePair(DylanTypes.LBRACKET, DylanTypes.RBRACKET, false),
    new BracePair(DylanTypes.LBRACE, DylanTypes.RBRACE, false),
  };

  public BracePair[] getPairs() {
    return PAIRS;
  }

  public boolean isPairedBracesAllowedBeforeType(@NotNull IElementType braceType, @Nullable IElementType tokenType) {
    return true;
  }

  public int getCodeConstructStart(PsiFile file, int openingBraceOffset) {
    return openingBraceOffset;
  }
}
