package org.dylanfoundry.deft.filetypes.lid;

import com.intellij.testFramework.ParsingTestCase;

public class LIDParsingTest extends ParsingTestCase {
    public LIDParsingTest() {
        super("parsing", LIDFileType.DEFAULT_EXTENSION, new LIDParserDefinition());
    }

    public void testBasics() {
      doTest(true);
    }

    @Override
    protected String getTestDataPath() {
        return "../DeftIDEA/testData/lid";
    }

    @Override
    protected boolean skipSpaces() {
        return false;
    }

    @Override
    protected boolean includeRanges() {
        return true;
    }
}

