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

package org.dylanfoundry.deft.filetypes.dylan.formatter;

import com.intellij.formatting.Indent;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.IElementType;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanSlotDeclarations;

import static org.dylanfoundry.deft.filetypes.dylan.psi.DylanTypes.*;

public class DylanIndentProcessor {

  public Indent getChildIndent(ASTNode node) {
    IElementType elementType = node.getElementType();
    ASTNode parent = node.getTreeParent();

    if (parent == null || parent.getTreeParent() == null) {
      return Indent.getNoneIndent();
    }

    if (parent.getTreeParent().getElementType() == IF_STATEMENT) {
      if (elementType == END) return Indent.getNoneIndent();
      return Indent.getContinuationIndent();
    }

    if (parent.getPsi() instanceof DylanSlotDeclarations)
      return Indent.getSpaceIndent(20);

    return Indent.getNoneIndent();
  }
}
