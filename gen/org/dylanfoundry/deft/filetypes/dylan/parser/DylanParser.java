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
    if (root_ == HEADER) {
      result_ = header(builder_, level_ + 1);
    }
    else if (root_ == HEADERS) {
      result_ = headers(builder_, level_ + 1);
    }
    else if (root_ == SOURCE_RECORD) {
      result_ = source_record(builder_, level_ + 1);
    }
    else if (root_ == SOURCE_RECORDS) {
      result_ = source_records(builder_, level_ + 1);
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
    return dylanFile(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // headers source_records
  static boolean dylanFile(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dylanFile")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = headers(builder_, level_ + 1);
    result_ = result_ && source_records(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // KEY SEPARATOR values
  public static boolean header(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "header")) return false;
    if (!nextTokenIs(builder_, KEY)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, KEY, SEPARATOR);
    result_ = result_ && values(builder_, level_ + 1);
    if (result_) {
      marker_.done(HEADER);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // header*
  public static boolean headers(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "headers")) return false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<headers>");
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!header(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "headers");
        break;
      }
      offset_ = next_offset_;
    }
    marker_.done(HEADERS);
    exitErrorRecordingSection(builder_, level_, true, false, _SECTION_GENERAL_, null);
    return true;
  }

  /* ********************************************************** */
  // statement_
  public static boolean source_record(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "source_record")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<source record>");
    result_ = statement_(builder_, level_ + 1);
    if (result_) {
      marker_.done(SOURCE_RECORD);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // source_record*
  public static boolean source_records(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "source_records")) return false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<source records>");
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!source_record(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "source_records");
        break;
      }
      offset_ = next_offset_;
    }
    marker_.done(SOURCE_RECORDS);
    exitErrorRecordingSection(builder_, level_, true, false, _SECTION_GENERAL_, null);
    return true;
  }

  /* ********************************************************** */
  // KEYWORD|BUILTIN|OPERATOR|FUNCTION|SHARP_WORD|NUMBER|PUNCTUATION|IDENTIFIER|CHARACTER|STRING|CLASS|CONSTANT|SYMBOL|COMMENT|CRLF
  static boolean statement_(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, KEYWORD);
    if (!result_) result_ = consumeToken(builder_, BUILTIN);
    if (!result_) result_ = consumeToken(builder_, OPERATOR);
    if (!result_) result_ = consumeToken(builder_, FUNCTION);
    if (!result_) result_ = consumeToken(builder_, SHARP_WORD);
    if (!result_) result_ = consumeToken(builder_, NUMBER);
    if (!result_) result_ = consumeToken(builder_, PUNCTUATION);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    if (!result_) result_ = consumeToken(builder_, CHARACTER);
    if (!result_) result_ = consumeToken(builder_, STRING);
    if (!result_) result_ = consumeToken(builder_, CLASS);
    if (!result_) result_ = consumeToken(builder_, CONSTANT);
    if (!result_) result_ = consumeToken(builder_, SYMBOL);
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
  // (VALUE? CRLF)*
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

  // VALUE? CRLF
  private static boolean values_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "values_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = values_0_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CRLF);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // VALUE?
  private static boolean values_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "values_0_0")) return false;
    consumeToken(builder_, VALUE);
    return true;
  }

}
