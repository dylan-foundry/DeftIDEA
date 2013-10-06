package org.dylanfoundry.deft.filetypes.dylan;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
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
