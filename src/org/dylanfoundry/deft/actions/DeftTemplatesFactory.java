package org.dylanfoundry.deft.actions;

import com.intellij.ide.fileTemplates.*;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.util.Pair;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiFileFactory;
import com.intellij.util.IncorrectOperationException;
import org.dylanfoundry.deft.DeftBundle;
import org.dylanfoundry.deft.DeftIcons;

import javax.swing.*;
import java.util.Properties;

public class DeftTemplatesFactory implements FileTemplateGroupDescriptorFactory {
    public static final String NEW_LID_FILE_NAME = "LID File.lid";
    public static final String NEW_DYLAN_FILE_NAME = "Dylan File.dylan";
    public static final String NEW_INTR_FILE_NAME = "Melange Interface File.intr";

    public static final Pair[] DEFT_TEMPLATES = {
            new Pair<String, Icon>(NEW_LID_FILE_NAME, DeftIcons.LID_FILE),
            new Pair<String, Icon>(NEW_DYLAN_FILE_NAME, DeftIcons.DYLAN_FILE),
            new Pair<String, Icon>(NEW_INTR_FILE_NAME, DeftIcons.MELANGE_INTERFACE_FILE)
    };

    public static final String NAME_TEMPLATE_PROPERTY = "NAME";

    @Override
    public FileTemplateGroupDescriptor getFileTemplatesDescriptor() {
        FileTemplateGroupDescriptor group =
                new FileTemplateGroupDescriptor(DeftBundle.message("file.template.group.title"),
                                                DeftIcons.DYLAN_FILE);
        for (Pair<String, Icon> p : DEFT_TEMPLATES) {
            group.addTemplate(new FileTemplateDescriptor(p.getFirst(), p.getSecond()));
        }
        return group;
    }

    public static PsiFile createFromTemplate(final PsiDirectory directory,
                                             final String name,
                                             String fileName,
                                             FileType fileType,
                                             String templateName,
                                             String... parameters) throws IncorrectOperationException {
        final FileTemplate template = FileTemplateManager.getInstance().getTemplate(templateName);
        Properties properties = new Properties(FileTemplateManager.getInstance().getDefaultProperties());
        properties.setProperty(NAME_TEMPLATE_PROPERTY, name);
        JavaTemplateUtil.setPackageNameAttribute(properties, directory);

        for (int i = 0; i < parameters.length; i += 2) {
            properties.setProperty(parameters[i], parameters[i+1]);
        }

        String text;

        try {
            text = template.getText(properties);
        } catch (Exception e) {
            throw new RuntimeException("Unable to load template " +
                                       FileTemplateManager.getInstance().internalTemplateToSubject(templateName),
                                       e);
        }

        final PsiFileFactory factory = PsiFileFactory.getInstance(directory.getProject());

        final PsiFile file = factory.createFileFromText(fileName, fileType, text);

        return (PsiFile) directory.add(file);
    }
}
