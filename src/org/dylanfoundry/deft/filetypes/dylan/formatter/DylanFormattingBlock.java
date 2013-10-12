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

import com.intellij.formatting.*;
import com.intellij.formatting.alignment.AlignmentStrategy;
import com.intellij.lang.ASTNode;
import com.intellij.psi.TokenType;
import com.intellij.psi.codeStyle.CommonCodeStyleSettings;
import com.intellij.psi.formatter.common.AbstractBlock;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import org.dylanfoundry.deft.filetypes.dylan.formatter.settings.DylanCodeStyleSettings;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DylanFormattingBlock extends AbstractBlock {
  private static final TokenSet BLOCK_TOKEN_SET = TokenSet.create(
    DylanTypes.BEGIN,
    DylanTypes.BLOCK,
    DylanTypes.FOR,
    DylanTypes.IF,
    DylanTypes.METHOD,
    DylanTypes.UNLESS,
    DylanTypes.UNTIL,
    DylanTypes.WHEN,
    DylanTypes.WHILE
  );
  private final AlignmentStrategy myAlignmentStrategy;
  private final SpacingBuilder mySpacingBuilder;
  private final CommonCodeStyleSettings mySettings;
  private final DylanCodeStyleSettings myDylanSettings;
  private final Indent myIndent;
  private List<Block> mySubBlocks;

  public DylanFormattingBlock(@NotNull ASTNode node,
                              @Nullable Wrap wrap,
                              @Nullable Alignment alignment,
                              @Nullable AlignmentStrategy alignmentStrategy,
                              @NotNull CommonCodeStyleSettings settings,
                              @NotNull DylanCodeStyleSettings dylanSettings,
                              @NotNull SpacingBuilder spacingBuilder) {
    super(node, wrap, alignment);
    mySpacingBuilder = spacingBuilder;
    myAlignmentStrategy = alignmentStrategy;
    mySettings = settings;
    myDylanSettings = dylanSettings;
    myIndent = new DylanIndentProcessor().getChildIndent(node);
  }

  @Override
  protected List<Block> buildChildren() {
    if (mySubBlocks == null) {
      mySubBlocks = buildSubBlocks();
    }
    return new ArrayList<Block>(mySubBlocks);
  }

  private List<Block> buildSubBlocks() {
    List<Block> blocks = new ArrayList<Block>();
    for (ASTNode child = myNode.getFirstChildNode(); child != null; child = child.getTreeNext()) {
      IElementType childType = child.getElementType();
      if (child.getTextRange().getLength() == 0 || childType == TokenType.WHITE_SPACE) continue;

      Alignment alignment = Alignment.createAlignment();
      blocks.add(new DylanFormattingBlock(child, Wrap.createWrap(WrapType.NONE, false), alignment, null, mySettings, myDylanSettings, mySpacingBuilder));
    }
    return Collections.unmodifiableList(blocks);
  }

  @Override
  public Indent getIndent() {
    return myIndent;
  }

  @Nullable
  @Override
  public Spacing getSpacing(@Nullable Block child1, @NotNull Block child2) {
    return mySpacingBuilder.getSpacing(this, child1, child2);
  }

  @Override
  public boolean isLeaf() {
    return myNode.getFirstChildNode() == null;
  }
}
