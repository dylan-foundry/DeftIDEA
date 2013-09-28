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

package org.dylanfoundry.deft.filetypes.lid;

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

public class LIDColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Key", LIDSyntaxHighlighter.KEY),
            new AttributesDescriptor("Separator", LIDSyntaxHighlighter.SEPARATOR),
            new AttributesDescriptor("Value", LIDSyntaxHighlighter.VALUE),
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return DeftIcons.LID_FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new LIDSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "library: dfmc-llvm-linker\n" +
               "Target-Type: dll\n" +
               "files:   llvm-linker-library\n" +
               "         llvm-linker\n" +
               "         llvm-link-object\n" +
               "         llvm-gluefile\n" +
               "Copyright:    Original Code is Copyright (c) 1995-2004 Functional Objects, Inc.\n" +
               "              Additional code is Copyright 2009-2010 Gwydion Dylan Maintainers\n" +
               "              All rights reserved.\n" +
               "License:      See License.txt in this distribution for details.\n" +
               "Warranty:     Distributed WITHOUT WARRANTY OF ANY KIND\n";
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
        return "LID";
    }
}
