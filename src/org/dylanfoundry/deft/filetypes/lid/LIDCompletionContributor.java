package org.dylanfoundry.deft.filetypes.lid;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import org.dylanfoundry.deft.filetypes.lid.psi.LIDTypes;
import org.jetbrains.annotations.NotNull;

public class LIDCompletionContributor extends CompletionContributor {
    // See: http://opendylan.org/documentation/library-reference/lid.html#lid-keyword-statements
    private static final String[] STANDARD_KEYWORDS = {
        "Library:",
        "Files:",
        "Synopsis:",
        "Keywords:",
        "Author:",
        "Version:",
        "Description:",
        "Comment:",
        "C-Source-Files:",
        "C-Header-Files:",
        "C-Object-Files:",
        "RC-Files:",
        "C-Libraries:",
        "LID:",
        "Jam-Includes:",
        "Executable:",
        "Base-Address:",
        "Linker-Options:",
        "Copyright:",
        "License:",
        "Warranty:",
        "Major-Version:",
        "Minor-Version:"
    };

    public LIDCompletionContributor() {
        // LID Keywords Statements, complete with standard keywords
        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement(LIDTypes.KEY).withLanguage(LIDLanguage.INSTANCE),
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
