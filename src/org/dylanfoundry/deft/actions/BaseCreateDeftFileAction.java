package org.dylanfoundry.deft.actions;

import com.intellij.CommonBundle;
import com.intellij.ide.actions.CreateElementActionBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

abstract public class BaseCreateDeftFileAction extends CreateElementActionBase {

    protected BaseCreateDeftFileAction(String text, String description, Icon icon) {
        super(text, description, icon);
    }

    @NotNull
    protected final PsiElement[] invokeDialog(Project project, PsiDirectory directory) {
        MyInputValidator validator = new MyInputValidator(project, directory);
        Messages.showInputDialog(project, getDialogPrompt(), getDialogTitle(), Messages.getQuestionIcon(), "", validator);

        return validator.getCreatedElements();
    }

    @NotNull
    protected abstract String getDialogPrompt();

    @NotNull
    protected abstract String getDialogTitle();

    @NotNull
    protected PsiElement[] create(String newName, PsiDirectory directory) throws Exception {
        return new PsiElement[] { directory.createFile(getFileName(newName)) };
    }

    @NotNull
    protected  abstract FileType getFileType();

    @NotNull
    protected String getFileName(String newName) {
        String defaultExtension = getFileType().getDefaultExtension();
        if (newName.endsWith(defaultExtension))
            return newName;
        return newName + "." + defaultExtension;
    }

    protected String getErrorTitle() {
        return CommonBundle.getErrorTitle();
    }
}
