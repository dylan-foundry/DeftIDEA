package org.dylanfoundry.deft.actions;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.PsiDirectory;
import org.dylanfoundry.deft.DeftBundle;
import org.dylanfoundry.deft.DeftIcons;
import org.dylanfoundry.deft.filetypes.intr.MelangeInterfaceFileType;
import org.jetbrains.annotations.NotNull;

public class CreateMelangeInterfaceFileAction extends BaseCreateDeftFileAction {

    public CreateMelangeInterfaceFileAction() {
        super(DeftBundle.message("newfile.intr.menu.action.text"),
              DeftBundle.message("newfile.intr.menu.action.description"),
                DeftIcons.MELANGE_INTERFACE_FILE);
    }

    @NotNull
    @Override
    protected String getTemplateName() {
        return DeftTemplatesFactory.NEW_INTR_FILE_NAME;
    }

    @Override
    protected String getCommandName() {
        return DeftBundle.message("newfile.intr.command.name");
    }

    @Override
    protected String getActionName(PsiDirectory psiDirectory, String s) {
        return DeftBundle.message("newfile.intr.menu.action.text");
    }

    @Override
    @NotNull
    protected String getDialogPrompt() {
        return DeftBundle.message("newfile.intr.dlg.prompt");
    }

    @Override
    @NotNull
    protected String getDialogTitle() {
        return DeftBundle.message("newfile.intr.dlg.title");
    }

    @Override
    @NotNull
    protected FileType getFileType() {
        return MelangeInterfaceFileType.INSTANCE;
    }
}
