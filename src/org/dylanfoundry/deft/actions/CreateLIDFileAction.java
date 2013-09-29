package org.dylanfoundry.deft.actions;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.PsiDirectory;
import org.dylanfoundry.deft.DeftBundle;
import org.dylanfoundry.deft.DeftIcons;
import org.dylanfoundry.deft.filetypes.lid.LIDFileType;

public class CreateLIDFileAction extends BaseCreateDeftFileAction {

    public CreateLIDFileAction() {
        super(DeftBundle.message("newfile.lid.menu.action.text"),
              DeftBundle.message("newfile.lid.menu.action.description"),
                DeftIcons.LID_FILE);
    }

    @Override
    protected String getCommandName() {
        return DeftBundle.message("newfile.lid.command.name");
    }

    @Override
    protected String getActionName(PsiDirectory psiDirectory, String s) {
        return DeftBundle.message("newfile.lid.menu.action.text");
    }

    @Override
    protected String getDialogPrompt() {
        return DeftBundle.message("newfile.lid.dlg.prompt");
    }

    @Override
    protected String getDialogTitle() {
        return DeftBundle.message("newfile.lid.dlg.title");
    }

    @Override
    protected FileType getFileType() {
        return LIDFileType.INSTANCE;
    }
}
