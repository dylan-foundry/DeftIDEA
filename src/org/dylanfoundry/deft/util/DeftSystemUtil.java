/*
 * Copyright 2010 Jon S Akhtar (Sylvanaar)
 *  
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *  
 *   http://www.apache.org/licenses/LICENSE-2.0
 *  
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

// This was borrowed from the Lua plugin.

package org.dylanfoundry.deft.util;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.impl.ConsoleViewImpl;
import com.intellij.execution.process.CapturingProcessHandler;
import com.intellij.execution.process.ProcessOutput;
import com.intellij.execution.ui.ConsoleView;
import com.intellij.execution.ui.ConsoleViewContentType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.roots.OrderRootType;
import com.intellij.openapi.util.Key;
import com.intellij.openapi.util.SystemInfo;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowAnchor;
import com.intellij.openapi.wm.ToolWindowManager;
import com.intellij.openapi.wm.ex.ToolWindowManagerEx;
import com.intellij.openapi.wm.ex.ToolWindowManagerListener;
import com.intellij.ui.content.impl.ContentImpl;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.*;

/**
 * @author Maxim.Manuylov
 *         Date: 03.04.2010
 */
public class DeftSystemUtil {
    public static final  int              STANDARD_TIMEOUT = 10 * 1000;

    @NotNull
    public static ProcessOutput getProcessOutput(@NotNull final String workDir, @NotNull final String exePath,
                                                 @NotNull final String... arguments) throws ExecutionException {
        return getProcessOutput(STANDARD_TIMEOUT, workDir, exePath, arguments);
    }

    @NotNull
    public static ProcessOutput getProcessOutput(final int timeout, @NotNull final String workDir,
                                                 @NotNull final String exePath,
                                                 @NotNull final String... arguments) throws ExecutionException {
        if (!new File(workDir).isDirectory() || !new File(exePath).canExecute()) {
            return new ProcessOutput();
        }

        final GeneralCommandLine cmd = new GeneralCommandLine();
        cmd.setWorkDirectory(workDir);
        cmd.setExePath(exePath);
        cmd.addParameters(arguments);

        return execute(cmd, timeout);
    }

    @NotNull
    public static ProcessOutput execute(@NotNull final GeneralCommandLine cmd) throws ExecutionException {
        return execute(cmd, STANDARD_TIMEOUT);
    }

    @NotNull
    public static ProcessOutput execute(@NotNull final GeneralCommandLine cmd,
                                        final int timeout) throws ExecutionException {
        final CapturingProcessHandler processHandler = new CapturingProcessHandler(cmd.createProcess());
        return timeout < 0 ? processHandler.runProcess() : processHandler.runProcess(timeout);
    }
}
