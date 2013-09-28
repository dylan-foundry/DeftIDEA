// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.parser;

import org.jetbrains.annotations.*;
import com.intellij.lang.LighterASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static org.dylanfoundry.deft.filetypes.dylan.psi.DylanTypes.*;
import static org.dylanfoundry.deft.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class DylanParser implements PsiParser {

  public static Logger LOG_ = Logger.getInstance("org.dylanfoundry.deft.filetypes.dylan.parser.DylanParser");

  @NotNull
  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    int level_ = 0;
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this);
    if (root_ == PROPERTY) {
      result_ = property(builder_, level_ + 1);
    }
    else if (root_ == VALUE_LIST) {
      result_ = value_list(builder_, level_ + 1);
    }
    else {
      Marker marker_ = builder_.mark();
      enterErrorRecordingSection(builder_, level_, _SECTION_RECOVER_, null);
      result_ = parse_root_(root_, builder_, level_);
      exitErrorRecordingSection(builder_, level_, result_, true, _SECTION_RECOVER_, TOKEN_ADVANCER);
      marker_.done(root_);
    }
    return builder_.getTreeBuilt();
  }

  protected boolean parse_root_(final IElementType root_, final PsiBuilder builder_, final int level_) {
    return dylanFile(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // item_*
  static boolean dylanFile(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dylanFile")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!item_(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "dylanFile");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  /* ********************************************************** */
  // property|COMMENT|CRLF
  static boolean item_(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "item_")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = property(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, COMMENT);
    if (!result_) result_ = consumeToken(builder_, CRLF);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // KEY? SEPARATOR value_list
  public static boolean property(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property")) return false;
    if (!nextTokenIs(builder_, KEY) && !nextTokenIs(builder_, SEPARATOR)
        && replaceVariants(builder_, 2, "<property>")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<property>");
    result_ = property_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEPARATOR);
    result_ = result_ && value_list(builder_, level_ + 1);
    if (result_) {
      marker_.done(PROPERTY);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // KEY?
  private static boolean property_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_0")) return false;
    consumeToken(builder_, KEY);
    return true;
  }

  /* ********************************************************** */
  // VALUE*
  public static boolean value_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "value_list")) return false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<value list>");
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!consumeToken(builder_, VALUE)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "value_list");
        break;
      }
      offset_ = next_offset_;
    }
    marker_.done(VALUE_LIST);
    exitErrorRecordingSection(builder_, level_, true, false, _SECTION_GENERAL_, null);
    return true;
  }

}
