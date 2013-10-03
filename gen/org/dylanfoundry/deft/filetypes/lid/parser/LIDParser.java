// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.lid.parser;

import org.jetbrains.annotations.*;
import com.intellij.lang.LighterASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static org.dylanfoundry.deft.filetypes.lid.psi.LIDTypes.*;
import static org.dylanfoundry.deft.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class LIDParser implements PsiParser {

  public static Logger LOG_ = Logger.getInstance("org.dylanfoundry.deft.filetypes.lid.parser.LIDParser");

  @NotNull
  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    int level_ = 0;
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this);
    if (root_ == ITEM) {
      result_ = item(builder_, level_ + 1);
    }
    else if (root_ == ITEM_KEY) {
      result_ = item_key(builder_, level_ + 1);
    }
    else if (root_ == ITEM_VALUE) {
      result_ = item_value(builder_, level_ + 1);
    }
    else if (root_ == ITEMS) {
      result_ = items(builder_, level_ + 1);
    }
    else if (root_ == VALUES) {
      result_ = values(builder_, level_ + 1);
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
    return lidFile(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // item_key SEPARATOR values
  public static boolean item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "item")) return false;
    if (!nextTokenIs(builder_, KEY)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = item_key(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEPARATOR);
    result_ = result_ && values(builder_, level_ + 1);
    if (result_) {
      marker_.done(ITEM);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // KEY
  public static boolean item_key(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "item_key")) return false;
    if (!nextTokenIs(builder_, KEY)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, KEY);
    if (result_) {
      marker_.done(ITEM_KEY);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // VALUE
  public static boolean item_value(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "item_value")) return false;
    if (!nextTokenIs(builder_, VALUE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, VALUE);
    if (result_) {
      marker_.done(ITEM_VALUE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // item*
  public static boolean items(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "items")) return false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<items>");
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!item(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "items");
        break;
      }
      offset_ = next_offset_;
    }
    marker_.done(ITEMS);
    exitErrorRecordingSection(builder_, level_, true, false, _SECTION_GENERAL_, null);
    return true;
  }

  /* ********************************************************** */
  // items
  static boolean lidFile(PsiBuilder builder_, int level_) {
    return items(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // (item_value CRLF?)*
  public static boolean values(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "values")) return false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<values>");
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!values_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "values");
        break;
      }
      offset_ = next_offset_;
    }
    marker_.done(VALUES);
    exitErrorRecordingSection(builder_, level_, true, false, _SECTION_GENERAL_, null);
    return true;
  }

  // item_value CRLF?
  private static boolean values_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "values_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = item_value(builder_, level_ + 1);
    result_ = result_ && values_0_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // CRLF?
  private static boolean values_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "values_0_1")) return false;
    consumeToken(builder_, CRLF);
    return true;
  }

}
