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

package org.dylanfoundry.deft.filetypes.dylan.completion;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import org.dylanfoundry.deft.filetypes.dylan.DylanLanguage;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanTypes;
import org.jetbrains.annotations.NotNull;

public class DylanHeaderCompletionContributor extends CompletionContributor {
    private static final String[] STANDARD_KEYWORDS = {
        "Module:",
        "Synopsis:",
        "Keywords:",
        "Author:",
        "Description:",
        "Comment:",
        "Copyright:",
        "License:",
        "Warranty:",
    };

    public DylanHeaderCompletionContributor() {
        // Dylan header keywords
        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement(DylanTypes.KEY).withLanguage(DylanLanguage.INSTANCE),
                new CompletionProvider<CompletionParameters>() {
                    @Override
                    protected void addCompletions(@NotNull CompletionParameters completionParameters,
                                                  ProcessingContext processingContext,
                                                  @NotNull CompletionResultSet completionResultSet) {
                        for (String s : STANDARD_KEYWORDS) {
                            completionResultSet.addElement(LookupElementBuilder.create(s));
                        }
                    }
                });
    }
}
