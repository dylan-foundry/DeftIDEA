package org.dylanfoundry.deft.actions;

import com.intellij.CommonBundle;
import com.intellij.ide.actions.CreateElementActionBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.util.IncorrectOperationException;
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
        return doCreate(newName, directory);
    }

    @NotNull
    protected  abstract FileType getFileType();

    @NotNull
    protected PsiElement[] doCreate(String newName, PsiDirectory directory) {
        PsiFile file = createFileFromTemplate(directory, newName, getTemplateName());
        PsiElement child = file.getLastChild();
        return (child != null) ? new PsiElement[]{file, child} : new PsiElement[]{file};
    }

    @NotNull
    protected abstract String getTemplateName();

    @NotNull
    protected String getFileName(String newName) {
        String defaultExtension = getFileType().getDefaultExtension();
        if (newName.endsWith(defaultExtension))
            return newName;
        return newName + "." + defaultExtension;
    }

    protected PsiFile createFileFromTemplate(final PsiDirectory directory,
                                                    String newName,
                                                    String templateName,
                                                    String... parameters) throws IncorrectOperationException {
        String fileName = getFileName(newName);
        return DeftTemplatesFactory.createFromTemplate(directory, newName, fileName, getFileType(),
                templateName, parameters);
    }

    protected String getErrorTitle() {
        return CommonBundle.getErrorTitle();
    }
}
