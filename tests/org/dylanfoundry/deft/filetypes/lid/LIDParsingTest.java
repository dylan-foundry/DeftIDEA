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

