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

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.dylanfoundry.deft.DeftIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class DylanColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Header Key", DylanSyntaxHighlighterColors.HEADER_KEY),
            new AttributesDescriptor("Header Separator", DylanSyntaxHighlighterColors.SEPARATOR),
            new AttributesDescriptor("Header Value", DylanSyntaxHighlighterColors.HEADER_VALUE),
            new AttributesDescriptor("Comment", DylanSyntaxHighlighterColors.COMMENT),
            new AttributesDescriptor("Number", DylanSyntaxHighlighterColors.NUMBER),
            new AttributesDescriptor("Identifier", DylanSyntaxHighlighterColors.IDENTIFIER),
            new AttributesDescriptor("Class", DylanSyntaxHighlighterColors.CLASS),
            new AttributesDescriptor("Constant", DylanSyntaxHighlighterColors.CONSTANT),
            new AttributesDescriptor("Variable", DylanSyntaxHighlighterColors.VARIABLE),
            new AttributesDescriptor("Character", DylanSyntaxHighlighterColors.CHARACTER),
            new AttributesDescriptor("Escape Character", DylanSyntaxHighlighterColors.ESCAPE_CHARACTER),
            new AttributesDescriptor("String", DylanSyntaxHighlighterColors.STRING),
            new AttributesDescriptor("Bad Character", DylanSyntaxHighlighterColors.BAD_CHARACTER),
            new AttributesDescriptor("Hash Word", DylanSyntaxHighlighterColors.HASH_WORD),
            new AttributesDescriptor("Constant String", DylanSyntaxHighlighterColors.CONSTANT_STRING),
            new AttributesDescriptor("Operator", DylanSyntaxHighlighterColors.OPERATOR),
            new AttributesDescriptor("Keyword", DylanSyntaxHighlighterColors.KEYWORD),
            new AttributesDescriptor("Parenthesis", DylanSyntaxHighlighterColors.PAREN),
            new AttributesDescriptor("Bracket", DylanSyntaxHighlighterColors.BRACKET),
            new AttributesDescriptor("Brace", DylanSyntaxHighlighterColors.BRACE),
            new AttributesDescriptor("Semicolon", DylanSyntaxHighlighterColors.SEMICOLON),
            new AttributesDescriptor("Dot / Period", DylanSyntaxHighlighterColors.DOT),
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return DeftIcons.DYLAN_FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new DylanSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "Module:    plonker\n" +
               "Synopsis:  Play with MIDI\n" +
               "Author:    Keith Playford\n" +
               "Copyright:    Original Code is Copyright (c) 1995-2004 Functional Objects, Inc.\n" +
               "              All rights reserved.\n" +
               "License:      See License.txt in this distribution for details.\n" +
               "Warranty:     Distributed WITHOUT WARRANTY OF ANY KIND\n" +
               "\n" +
               "//// A hack at some scale utilities.\n" +
               "\n" +
               "define method cycle (val, #rest vals) => (cycle :: <list>)\n" +
               "  let l = pair(val, as(<list>, vals));\n" +
               "  for (cursor = l then cursor.tail, until: cursor.tail == #())\n" +
               "  finally\n" +
               "    cursor.tail := l;\n" +
               "  end;\n" +
               "  l\n" +
               "end method;\n" +
               "\n" +
               "define method scale-to-naturals\n" +
               "    (scale :: <sequence>) => (naturals :: <sequence>)\n" +
               "  let naturals = make(<simple-object-vector>, size: 7, fill: #());\n" +
               "  for (i from 0 below 7)\n" +
               "    let prev-i = modulo(i - 1, 7);\n" +
               "    let step = modulo(scale[i] - scale[prev-i], 12);\n" +
               "    if (step > 1)\n" +
               "      naturals[i]      := pair(#\"flat\", naturals[i]);\n" +
               "      naturals[prev-i] := pair(#\"sharp\", naturals[prev-i]);\n" +
               "    end;\n" +
               "  end;\n" +
               "  naturals\n" +
               "end method;\n" +
               "\n" +
               "//// The major pentatonic (I think!)\n" +
               "\n" +
               "define constant $major-scale\n" +
               "  = #[0, 2, 4, 5, 7, 9, 11, 12];\n" +
               "\n" +
               "define constant $major-scale-naturals\n" +
               "  = scale-to-naturals($major-scale);\n" +
               "\n" +
               "define constant $major-scale-naturals-cycle\n" +
               "  = apply(cycle, $major-scale-naturals);\n";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Dylan";
    }
}
