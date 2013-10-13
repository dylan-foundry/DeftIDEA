package org.dylanfoundry.deft.filetypes.dylan;

import com.intellij.lang.PsiBuilder;
import org.dylanfoundry.deft.filetypes.dylan.parser.DylanParser;
import org.dylanfoundry.deft.parser.GeneratedParserUtilBase;

public class DylanParserUtil extends GeneratedParserUtilBase {

  public static boolean clauseOption(PsiBuilder builder, int level) {
    String tokenText = builder.getTokenText();
    final String lowercaseTokenText = tokenText.toLowerCase();
    if ("import:".equals(lowercaseTokenText)) {
      return DylanParser.import_option(builder, level);
    } else if ("exclude:".equals(lowercaseTokenText)) {
      return DylanParser.exclude_option(builder, level);
    } else if ("prefix:".equals(lowercaseTokenText)) {
      return DylanParser.prefix_option(builder, level);
    } else if ("rename:".equals(lowercaseTokenText)) {
      return DylanParser.rename_option(builder, level);
    } else if ("export:".equals(lowercaseTokenText)) {
      return DylanParser.export_clause(builder, level);
    }
    return false;
  }
}
