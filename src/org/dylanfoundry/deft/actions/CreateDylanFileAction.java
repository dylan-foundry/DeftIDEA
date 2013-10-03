package org.dylanfoundry.deft.actions;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.PsiDirectory;
import org.dylanfoundry.deft.DeftBundle;
import org.dylanfoundry.deft.DeftIcons;
import org.dylanfoundry.deft.filetypes.dylan.DylanFileType;
import org.jetbrains.annotations.NotNull;

public class CreateDylanFileAction extends BaseCreateDeftFileAction {

    public CreateDylanFileAction() {
        super(DeftBundle.message("newfile.dylan.menu.action.text"),
              DeftBundle.message("newfile.dylan.menu.action.description"),
                DeftIcons.DYLAN_FILE);
    }

    @NotNull
    @Override
    protected String getTemplateName() {
        return DeftTemplatesFactory.NEW_DYLAN_FILE_NAME;
    }

    @Override
    protected String getCommandName() {
        return DeftBundle.message("newfile.dylan.command.name");
    }

    @Override
    protected String getActionName(PsiDirectory psiDirectory, String s) {
        return DeftBundle.message("newfile.dylan.menu.action.text");
    }

    @Override
    @NotNull
    protected String getDialogPrompt() {
        return DeftBundle.message("newfile.dylan.dlg.prompt");
    }

    @Override
    @NotNull
    protected String getDialogTitle() {
        return DeftBundle.message("newfile.dylan.dlg.title");
    }

    @Override
    @NotNull
    protected FileType getFileType() {
        return DylanFileType.INSTANCE;
    }
}
