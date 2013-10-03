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
    if (root_ == ARGUMENT) {
      result_ = argument(builder_, level_ + 1);
    }
    else if (root_ == ARGUMENTS) {
      result_ = arguments(builder_, level_ + 1);
    }
    else if (root_ == AUX_RULE) {
      result_ = aux_rule(builder_, level_ + 1);
    }
    else if (root_ == AUX_RULE_SET) {
      result_ = aux_rule_set(builder_, level_ + 1);
    }
    else if (root_ == AUX_RULE_SETS) {
      result_ = aux_rule_sets(builder_, level_ + 1);
    }
    else if (root_ == AUX_RULES) {
      result_ = aux_rules(builder_, level_ + 1);
    }
    else if (root_ == BASIC_FRAGMENT) {
      result_ = basic_fragment(builder_, level_ + 1);
    }
    else if (root_ == BEGIN_WORD) {
      result_ = begin_word(builder_, level_ + 1);
    }
    else if (root_ == BINARY_OPERAND) {
      result_ = binary_operand(builder_, level_ + 1);
    }
    else if (root_ == BINARY_OPERAND_NO_SYMBOL) {
      result_ = binary_operand_no_symbol(builder_, level_ + 1);
    }
    else if (root_ == BINARY_OPERATOR) {
      result_ = binary_operator(builder_, level_ + 1);
    }
    else if (root_ == BINDING_PATTERN) {
      result_ = binding_pattern(builder_, level_ + 1);
    }
    else if (root_ == BINDINGS) {
      result_ = bindings(builder_, level_ + 1);
    }
    else if (root_ == BODY) {
      result_ = body(builder_, level_ + 1);
    }
    else if (root_ == BODY_FRAGMENT) {
      result_ = body_fragment(builder_, level_ + 1);
    }
    else if (root_ == BODY_STYLE_DEFINITION_RULE) {
      result_ = body_style_definition_rule(builder_, level_ + 1);
    }
    else if (root_ == BODY_STYLE_DEFINITION_RULES) {
      result_ = body_style_definition_rules(builder_, level_ + 1);
    }
    else if (root_ == BRACKETED_FRAGMENT) {
      result_ = bracketed_fragment(builder_, level_ + 1);
    }
    else if (root_ == BRACKETED_PATTERN) {
      result_ = bracketed_pattern(builder_, level_ + 1);
    }
    else if (root_ == BRACKETING_PUNCTUATION) {
      result_ = bracketing_punctuation(builder_, level_ + 1);
    }
    else if (root_ == CASE_BODY) {
      result_ = case_body(builder_, level_ + 1);
    }
    else if (root_ == CASE_TAIL) {
      result_ = case_tail(builder_, level_ + 1);
    }
    else if (root_ == CONDITION) {
      result_ = condition(builder_, level_ + 1);
    }
    else if (root_ == CONSTANT) {
      result_ = constant(builder_, level_ + 1);
    }
    else if (root_ == CONSTANT_FRAGMENT) {
      result_ = constant_fragment(builder_, level_ + 1);
    }
    else if (root_ == CONSTANTS) {
      result_ = constants(builder_, level_ + 1);
    }
    else if (root_ == CONSTITUENT) {
      result_ = constituent(builder_, level_ + 1);
    }
    else if (root_ == CONSTITUENTS) {
      result_ = constituents(builder_, level_ + 1);
    }
    else if (root_ == CORE_WORD) {
      result_ = core_word(builder_, level_ + 1);
    }
    else if (root_ == DEFAULT) {
      result_ = default(builder_, level_ + 1);
    }
    else if (root_ == DEFINE_BODY_WORD) {
      result_ = define_body_word(builder_, level_ + 1);
    }
    else if (root_ == DEFINE_LIST_WORD) {
      result_ = define_list_word(builder_, level_ + 1);
    }
    else if (root_ == DEFINITION) {
      result_ = definition(builder_, level_ + 1);
    }
    else if (root_ == DEFINITION_MACRO_CALL) {
      result_ = definition_macro_call(builder_, level_ + 1);
    }
    else if (root_ == DEFINITION_TAIL) {
      result_ = definition_tail(builder_, level_ + 1);
    }
    else if (root_ == END_CLAUSE) {
      result_ = end_clause(builder_, level_ + 1);
    }
    else if (root_ == ESCAPED_NAME) {
      result_ = escaped_name(builder_, level_ + 1);
    }
    else if (root_ == EXPRESSION) {
      result_ = expression(builder_, level_ + 1);
    }
    else if (root_ == EXPRESSION_NO_SYMBOL) {
      result_ = expression_no_symbol(builder_, level_ + 1);
    }
    else if (root_ == EXPRESSIONS) {
      result_ = expressions(builder_, level_ + 1);
    }
    else if (root_ == FUNCTION_MACRO_CALL) {
      result_ = function_macro_call(builder_, level_ + 1);
    }
    else if (root_ == FUNCTION_RULE) {
      result_ = function_rule(builder_, level_ + 1);
    }
    else if (root_ == FUNCTION_RULES) {
      result_ = function_rules(builder_, level_ + 1);
    }
    else if (root_ == FUNCTION_WORD) {
      result_ = function_word(builder_, level_ + 1);
    }
    else if (root_ == HANDLER) {
      result_ = handler(builder_, level_ + 1);
    }
    else if (root_ == HASH_WORD) {
      result_ = hash_word(builder_, level_ + 1);
    }
    else if (root_ == HEADER) {
      result_ = header(builder_, level_ + 1);
    }
    else if (root_ == HEADER_KEY) {
      result_ = header_key(builder_, level_ + 1);
    }
    else if (root_ == HEADER_VALUE) {
      result_ = header_value(builder_, level_ + 1);
    }
    else if (root_ == HEADERS) {
      result_ = headers(builder_, level_ + 1);
    }
    else if (root_ == KEY_PARAMETER_LIST) {
      result_ = key_parameter_list(builder_, level_ + 1);
    }
    else if (root_ == KEYWORD_PARAMETER) {
      result_ = keyword_parameter(builder_, level_ + 1);
    }
    else if (root_ == KEYWORD_PARAMETERS) {
      result_ = keyword_parameters(builder_, level_ + 1);
    }
    else if (root_ == LEAF) {
      result_ = leaf(builder_, level_ + 1);
    }
    else if (root_ == LIST_FRAGMENT) {
      result_ = list_fragment(builder_, level_ + 1);
    }
    else if (root_ == LIST_STYLE_DEFINITION_RULE) {
      result_ = list_style_definition_rule(builder_, level_ + 1);
    }
    else if (root_ == LIST_STYLE_DEFINITION_RULES) {
      result_ = list_style_definition_rules(builder_, level_ + 1);
    }
    else if (root_ == LITERAL) {
      result_ = literal(builder_, level_ + 1);
    }
    else if (root_ == LOCAL_DECLARATION) {
      result_ = local_declaration(builder_, level_ + 1);
    }
    else if (root_ == LOCAL_METHODS) {
      result_ = local_methods(builder_, level_ + 1);
    }
    else if (root_ == MACRO) {
      result_ = macro(builder_, level_ + 1);
    }
    else if (root_ == MACRO_DEFINITION) {
      result_ = macro_definition(builder_, level_ + 1);
    }
    else if (root_ == MACRO_NAME) {
      result_ = macro_name(builder_, level_ + 1);
    }
    else if (root_ == MAIN_RULE_SET) {
      result_ = main_rule_set(builder_, level_ + 1);
    }
    else if (root_ == MAYBE_PATTERN_AND_SEMICOLON) {
      result_ = maybe_pattern_and_semicolon(builder_, level_ + 1);
    }
    else if (root_ == METHOD_DEFINITION) {
      result_ = method_definition(builder_, level_ + 1);
    }
    else if (root_ == METHOD_NAME) {
      result_ = method_name(builder_, level_ + 1);
    }
    else if (root_ == MODIFIER) {
      result_ = modifier(builder_, level_ + 1);
    }
    else if (root_ == MODIFIERS) {
      result_ = modifiers(builder_, level_ + 1);
    }
    else if (root_ == NAME) {
      result_ = name(builder_, level_ + 1);
    }
    else if (root_ == NAME_NOT_END) {
      result_ = name_not_end(builder_, level_ + 1);
    }
    else if (root_ == NAME_PREFIX) {
      result_ = name_prefix(builder_, level_ + 1);
    }
    else if (root_ == NAME_STRING_OR_SYMBOL) {
      result_ = name_string_or_symbol(builder_, level_ + 1);
    }
    else if (root_ == NAME_SUFFIX) {
      result_ = name_suffix(builder_, level_ + 1);
    }
    else if (root_ == NEXT_REST_KEY_PARAMETER_LIST) {
      result_ = next_rest_key_parameter_list(builder_, level_ + 1);
    }
    else if (root_ == NON_BRACKETING_PUNCTUATION) {
      result_ = non_bracketing_punctuation(builder_, level_ + 1);
    }
    else if (root_ == NON_END_CORE_WORD) {
      result_ = non_end_core_word(builder_, level_ + 1);
    }
    else if (root_ == NON_EXPRESSION_CONSTITUENT) {
      result_ = non_expression_constituent(builder_, level_ + 1);
    }
    else if (root_ == NON_STATEMENT_BASIC_FRAGMENT) {
      result_ = non_statement_basic_fragment(builder_, level_ + 1);
    }
    else if (root_ == NON_STATEMENT_BODY_FRAGMENT) {
      result_ = non_statement_body_fragment(builder_, level_ + 1);
    }
    else if (root_ == NON_STATEMENT_LIST_FRAGMENT) {
      result_ = non_statement_list_fragment(builder_, level_ + 1);
    }
    else if (root_ == NONDEFINING_NAME) {
      result_ = nondefining_name(builder_, level_ + 1);
    }
    else if (root_ == NONDEFINING_WORD) {
      result_ = nondefining_word(builder_, level_ + 1);
    }
    else if (root_ == NONEXPRESSION_WORD) {
      result_ = nonexpression_word(builder_, level_ + 1);
    }
    else if (root_ == OPERAND) {
      result_ = operand(builder_, level_ + 1);
    }
    else if (root_ == OPERAND_TAIL) {
      result_ = operand_tail(builder_, level_ + 1);
    }
    else if (root_ == OPERAND_TAILS) {
      result_ = operand_tails(builder_, level_ + 1);
    }
    else if (root_ == OPERATOR) {
      result_ = operator(builder_, level_ + 1);
    }
    else if (root_ == ORDINARY_NAME) {
      result_ = ordinary_name(builder_, level_ + 1);
    }
    else if (root_ == PARAMETER_LIST) {
      result_ = parameter_list(builder_, level_ + 1);
    }
    else if (root_ == PARAMETERS) {
      result_ = parameters(builder_, level_ + 1);
    }
    else if (root_ == PATTERN) {
      result_ = pattern(builder_, level_ + 1);
    }
    else if (root_ == PATTERN_KEYWORD) {
      result_ = pattern_keyword(builder_, level_ + 1);
    }
    else if (root_ == PATTERN_KEYWORDS) {
      result_ = pattern_keywords(builder_, level_ + 1);
    }
    else if (root_ == PATTERN_LIST) {
      result_ = pattern_list(builder_, level_ + 1);
    }
    else if (root_ == PATTERN_SEQUENCE) {
      result_ = pattern_sequence(builder_, level_ + 1);
    }
    else if (root_ == PATTERN_VARIABLE) {
      result_ = pattern_variable(builder_, level_ + 1);
    }
    else if (root_ == PROPERTY) {
      result_ = property(builder_, level_ + 1);
    }
    else if (root_ == PROPERTY_LIST) {
      result_ = property_list(builder_, level_ + 1);
    }
    else if (root_ == PROPERTY_LIST_PATTERN) {
      result_ = property_list_pattern(builder_, level_ + 1);
    }
    else if (root_ == PUNCTUATION) {
      result_ = punctuation(builder_, level_ + 1);
    }
    else if (root_ == REQUIRED_PARAMETER) {
      result_ = required_parameter(builder_, level_ + 1);
    }
    else if (root_ == REQUIRED_PARAMETERS) {
      result_ = required_parameters(builder_, level_ + 1);
    }
    else if (root_ == RESERVED_WORD) {
      result_ = reserved_word(builder_, level_ + 1);
    }
    else if (root_ == REST_KEY_PARAMETER_LIST) {
      result_ = rest_key_parameter_list(builder_, level_ + 1);
    }
    else if (root_ == RHS) {
      result_ = rhs(builder_, level_ + 1);
    }
    else if (root_ == SEMICOLON_FRAGMENT) {
      result_ = semicolon_fragment(builder_, level_ + 1);
    }
    else if (root_ == SEPARATOR) {
      result_ = separator(builder_, level_ + 1);
    }
    else if (root_ == SIMPLE_FRAGMENT) {
      result_ = simple_fragment(builder_, level_ + 1);
    }
    else if (root_ == SIMPLE_PATTERN) {
      result_ = simple_pattern(builder_, level_ + 1);
    }
    else if (root_ == SOURCE_RECORD) {
      result_ = source_record(builder_, level_ + 1);
    }
    else if (root_ == SOURCE_RECORDS) {
      result_ = source_records(builder_, level_ + 1);
    }
    else if (root_ == STATEMENT) {
      result_ = statement(builder_, level_ + 1);
    }
    else if (root_ == STATEMENT_RULE) {
      result_ = statement_rule(builder_, level_ + 1);
    }
    else if (root_ == STATEMENT_RULES) {
      result_ = statement_rules(builder_, level_ + 1);
    }
    else if (root_ == STRING_LITERAL) {
      result_ = string_literal(builder_, level_ + 1);
    }
    else if (root_ == SUBSTITUTION) {
      result_ = substitution(builder_, level_ + 1);
    }
    else if (root_ == TEMPLATE) {
      result_ = template(builder_, level_ + 1);
    }
    else if (root_ == TEMPLATE_ELEMENT) {
      result_ = template_element(builder_, level_ + 1);
    }
    else if (root_ == TOKEN) {
      result_ = token(builder_, level_ + 1);
    }
    else if (root_ == UNARY_OPERATOR) {
      result_ = unary_operator(builder_, level_ + 1);
    }
    else if (root_ == UNPARENTHESIZED_BINARY_OPERAND) {
      result_ = unparenthesized_binary_operand(builder_, level_ + 1);
    }
    else if (root_ == UNPARENTHESIZED_EXPRESSION) {
      result_ = unparenthesized_expression(builder_, level_ + 1);
    }
    else if (root_ == UNPARENTHESIZED_LEAF) {
      result_ = unparenthesized_leaf(builder_, level_ + 1);
    }
    else if (root_ == UNPARENTHESIZED_OPERAND) {
      result_ = unparenthesized_operand(builder_, level_ + 1);
    }
    else if (root_ == UNRESERVED_NAME) {
      result_ = unreserved_name(builder_, level_ + 1);
    }
    else if (root_ == UNRESERVED_WORD) {
      result_ = unreserved_word(builder_, level_ + 1);
    }
    else if (root_ == VALUE) {
      result_ = value(builder_, level_ + 1);
    }
    else if (root_ == VALUES) {
      result_ = values(builder_, level_ + 1);
    }
    else if (root_ == VALUES_LIST) {
      result_ = values_list(builder_, level_ + 1);
    }
    else if (root_ == VARIABLE) {
      result_ = variable(builder_, level_ + 1);
    }
    else if (root_ == VARIABLE_LIST) {
      result_ = variable_list(builder_, level_ + 1);
    }
    else if (root_ == VARIABLE_NAME) {
      result_ = variable_name(builder_, level_ + 1);
    }
    else if (root_ == VARIABLES) {
      result_ = variables(builder_, level_ + 1);
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
  // SYMBOL expression | expression_no_symbol | SYMBOL
  public static boolean argument(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument")) return false;
    if (!nextTokenIs(builder_, SYMBOL) && !nextTokenIs(builder_, UNARY_OPERATOR_OPT)
        && replaceVariants(builder_, 2, "<argument>")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<argument>");
    result_ = argument_0(builder_, level_ + 1);
    if (!result_) result_ = expression_no_symbol(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, SYMBOL);
    if (result_) {
      marker_.done(ARGUMENT);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // SYMBOL expression
  private static boolean argument_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, SYMBOL);
    result_ = result_ && expression(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // argument | arguments COMMA argument
  public static boolean arguments(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arguments")) return false;
    if (!nextTokenIs(builder_, SYMBOL) && !nextTokenIs(builder_, UNARY_OPERATOR_OPT)
        && replaceVariants(builder_, 2, "<arguments>")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<arguments>");
    result_ = argument(builder_, level_ + 1);
    if (!result_) result_ = arguments_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(ARGUMENTS);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // arguments COMMA argument
  private static boolean arguments_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arguments_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = arguments(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && argument(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // LBRACE pattern_opt RBRACE EQUAL_ARROW rhs
  public static boolean aux_rule(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "aux_rule")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, LBRACE, PATTERN_OPT, RBRACE, EQUAL_ARROW);
    result_ = result_ && rhs(builder_, level_ + 1);
    if (result_) {
      marker_.done(AUX_RULE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // SYMBOL aux_rules
  public static boolean aux_rule_set(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "aux_rule_set")) return false;
    if (!nextTokenIs(builder_, SYMBOL)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, SYMBOL);
    result_ = result_ && aux_rules(builder_, level_ + 1);
    if (result_) {
      marker_.done(AUX_RULE_SET);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // aux_rule_set | aux_rule_sets aux_rule_set
  public static boolean aux_rule_sets(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "aux_rule_sets")) return false;
    if (!nextTokenIs(builder_, SYMBOL)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = aux_rule_set(builder_, level_ + 1);
    if (!result_) result_ = aux_rule_sets_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(AUX_RULE_SETS);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // aux_rule_sets aux_rule_set
  private static boolean aux_rule_sets_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "aux_rule_sets_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = aux_rule_sets(builder_, level_ + 1);
    result_ = result_ && aux_rule_set(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // aux_rule | aux_rules aux_rule
  public static boolean aux_rules(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "aux_rules")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = aux_rule(builder_, level_ + 1);
    if (!result_) result_ = aux_rules_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(AUX_RULES);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // aux_rules aux_rule
  private static boolean aux_rules_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "aux_rules_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = aux_rules(builder_, level_ + 1);
    result_ = result_ && aux_rule(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // non_statement_basic_fragment | statement non_statement_basic_fragment_opt
  public static boolean basic_fragment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_fragment")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<basic fragment>");
    result_ = non_statement_basic_fragment(builder_, level_ + 1);
    if (!result_) result_ = basic_fragment_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(BASIC_FRAGMENT);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // statement non_statement_basic_fragment_opt
  private static boolean basic_fragment_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_fragment_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = statement(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, NON_STATEMENT_BASIC_FRAGMENT_OPT);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // NONDEFINING_BEGIN_WORD | DEFINE_BODY_BEGIN_WORD | DEFINE_LIST_BEGIN_WORD
  public static boolean begin_word(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "begin_word")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<begin word>");
    result_ = consumeToken(builder_, NONDEFINING_BEGIN_WORD);
    if (!result_) result_ = consumeToken(builder_, DEFINE_BODY_BEGIN_WORD);
    if (!result_) result_ = consumeToken(builder_, DEFINE_LIST_BEGIN_WORD);
    if (result_) {
      marker_.done(BEGIN_WORD);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // SYMBOL | binary_operand_no_symbol
  public static boolean binary_operand(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "binary_operand")) return false;
    if (!nextTokenIs(builder_, SYMBOL) && !nextTokenIs(builder_, UNARY_OPERATOR_OPT)
        && replaceVariants(builder_, 2, "<binary operand>")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<binary operand>");
    result_ = consumeToken(builder_, SYMBOL);
    if (!result_) result_ = binary_operand_no_symbol(builder_, level_ + 1);
    if (result_) {
      marker_.done(BINARY_OPERAND);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // unary_operator_opt operand
  public static boolean binary_operand_no_symbol(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "binary_operand_no_symbol")) return false;
    if (!nextTokenIs(builder_, UNARY_OPERATOR_OPT)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, UNARY_OPERATOR_OPT);
    result_ = result_ && operand(builder_, level_ + 1);
    if (result_) {
      marker_.done(BINARY_OPERAND_NO_SYMBOL);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // BINARY_OPERATOR_ONLY | UNARY_AND_BINARY_OPERATOR
  public static boolean binary_operator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "binary_operator")) return false;
    if (!nextTokenIs(builder_, BINARY_OPERATOR_ONLY) && !nextTokenIs(builder_, UNARY_AND_BINARY_OPERATOR)
        && replaceVariants(builder_, 2, "<binary operator>")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<binary operator>");
    result_ = consumeToken(builder_, BINARY_OPERATOR_ONLY);
    if (!result_) result_ = consumeToken(builder_, UNARY_AND_BINARY_OPERATOR);
    if (result_) {
      marker_.done(BINARY_OPERATOR);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // pattern_variable COLON_COLON pattern_variable
  //     | pattern_variable EQUAL pattern_variable
  //     | pattern_variable COLON_COLON pattern_variable EQUAL pattern_variable
  public static boolean binding_pattern(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "binding_pattern")) return false;
    if (!nextTokenIs(builder_, ELLIPSIS) && !nextTokenIs(builder_, QUERY)
        && replaceVariants(builder_, 2, "<binding pattern>")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<binding pattern>");
    result_ = binding_pattern_0(builder_, level_ + 1);
    if (!result_) result_ = binding_pattern_1(builder_, level_ + 1);
    if (!result_) result_ = binding_pattern_2(builder_, level_ + 1);
    if (result_) {
      marker_.done(BINDING_PATTERN);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // pattern_variable COLON_COLON pattern_variable
  private static boolean binding_pattern_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "binding_pattern_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = pattern_variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON_COLON);
    result_ = result_ && pattern_variable(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // pattern_variable EQUAL pattern_variable
  private static boolean binding_pattern_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "binding_pattern_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = pattern_variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQUAL);
    result_ = result_ && pattern_variable(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // pattern_variable COLON_COLON pattern_variable EQUAL pattern_variable
  private static boolean binding_pattern_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "binding_pattern_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = pattern_variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON_COLON);
    result_ = result_ && pattern_variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQUAL);
    result_ = result_ && pattern_variable(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // variable EQUAL expression | LPAREN variable_list RPAREN EQUAL expression
  public static boolean bindings(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bindings")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<bindings>");
    result_ = bindings_0(builder_, level_ + 1);
    if (!result_) result_ = bindings_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(BINDINGS);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // variable EQUAL expression
  private static boolean bindings_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bindings_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQUAL);
    result_ = result_ && expression(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // LPAREN variable_list RPAREN EQUAL expression
  private static boolean bindings_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bindings_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && variable_list(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, RPAREN, EQUAL);
    result_ = result_ && expression(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // constituents SEMICOLON?
  public static boolean body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<body>");
    result_ = constituents(builder_, level_ + 1);
    result_ = result_ && body_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(BODY);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // SEMICOLON?
  private static boolean body_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body_1")) return false;
    consumeToken(builder_, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // non_statement_body_fragment | statement non_statement_body_fragment_opt
  public static boolean body_fragment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body_fragment")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<body fragment>");
    result_ = non_statement_body_fragment(builder_, level_ + 1);
    if (!result_) result_ = body_fragment_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(BODY_FRAGMENT);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // statement non_statement_body_fragment_opt
  private static boolean body_fragment_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body_fragment_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = statement(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, NON_STATEMENT_BODY_FRAGMENT_OPT);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // LBRACE DEFINE pattern semicolon_opt END RBRACE EQUAL_ARROW rhs
  public static boolean body_style_definition_rule(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body_style_definition_rule")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, LBRACE, DEFINE);
    result_ = result_ && pattern(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, SEMICOLON_OPT, END, RBRACE, EQUAL_ARROW);
    result_ = result_ && rhs(builder_, level_ + 1);
    if (result_) {
      marker_.done(BODY_STYLE_DEFINITION_RULE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // body_style_definition_rule
  //     | body_style_definition_rules body_style_definition_rule
  public static boolean body_style_definition_rules(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body_style_definition_rules")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = body_style_definition_rule(builder_, level_ + 1);
    if (!result_) result_ = body_style_definition_rules_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(BODY_STYLE_DEFINITION_RULES);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // body_style_definition_rules body_style_definition_rule
  private static boolean body_style_definition_rules_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body_style_definition_rules_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = body_style_definition_rules(builder_, level_ + 1);
    result_ = result_ && body_style_definition_rule(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // LPAREN body_fragment_opt RPAREN
  //     | LBRACKET body_fragment_opt RBRACKET
  //     | LBRACE body_fragment_opt RBRACE
  public static boolean bracketed_fragment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracketed_fragment")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<bracketed fragment>");
    result_ = bracketed_fragment_0(builder_, level_ + 1);
    if (!result_) result_ = bracketed_fragment_1(builder_, level_ + 1);
    if (!result_) result_ = bracketed_fragment_2(builder_, level_ + 1);
    if (result_) {
      marker_.done(BRACKETED_FRAGMENT);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // LPAREN body_fragment_opt RPAREN
  private static boolean bracketed_fragment_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracketed_fragment_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, LPAREN, BODY_FRAGMENT_OPT, RPAREN);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // LBRACKET body_fragment_opt RBRACKET
  private static boolean bracketed_fragment_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracketed_fragment_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, LBRACKET, BODY_FRAGMENT_OPT, RBRACKET);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // LBRACE body_fragment_opt RBRACE
  private static boolean bracketed_fragment_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracketed_fragment_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, LBRACE, BODY_FRAGMENT_OPT, RBRACE);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // LPAREN pattern_opt RPAREN
  //     | LBRACKET pattern_opt RBRACKET
  //     | LBRACE pattern_opt RBRACE
  public static boolean bracketed_pattern(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracketed_pattern")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<bracketed pattern>");
    result_ = bracketed_pattern_0(builder_, level_ + 1);
    if (!result_) result_ = bracketed_pattern_1(builder_, level_ + 1);
    if (!result_) result_ = bracketed_pattern_2(builder_, level_ + 1);
    if (result_) {
      marker_.done(BRACKETED_PATTERN);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // LPAREN pattern_opt RPAREN
  private static boolean bracketed_pattern_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracketed_pattern_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, LPAREN, PATTERN_OPT, RPAREN);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // LBRACKET pattern_opt RBRACKET
  private static boolean bracketed_pattern_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracketed_pattern_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, LBRACKET, PATTERN_OPT, RBRACKET);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // LBRACE pattern_opt RBRACE
  private static boolean bracketed_pattern_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracketed_pattern_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, LBRACE, PATTERN_OPT, RBRACE);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // LPAREN | RPAREN | LBRACKET | RBRACKET | LBRACE | RBRACE | HASH_PAREN | HASH_BRACKET
  public static boolean bracketing_punctuation(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracketing_punctuation")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<bracketing punctuation>");
    result_ = consumeToken(builder_, LPAREN);
    if (!result_) result_ = consumeToken(builder_, RPAREN);
    if (!result_) result_ = consumeToken(builder_, LBRACKET);
    if (!result_) result_ = consumeToken(builder_, RBRACKET);
    if (!result_) result_ = consumeToken(builder_, LBRACE);
    if (!result_) result_ = consumeToken(builder_, RBRACE);
    if (!result_) result_ = consumeToken(builder_, HASH_PAREN);
    if (!result_) result_ = consumeToken(builder_, HASH_BRACKET);
    if (result_) {
      marker_.done(BRACKETING_PUNCTUATION);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // case_label case_constiuents
  // case_label
  //       unparenthesized_expression EQUAL_ARROW
  //     | unparenthesized_expression COMMA expressions EQUAL_ARROW
  //     | LPAREN expression RPAREN operand_tails EQUAL_ARROW
  //     | LPAREN expression RPAREN operand_tails COMMA expressions EQUAL_ARROW
  //     | LPAREN expression COMMA expressions RPAREN EQUAL_ARROW
  //     | OTHERWISE EQUAL_ARROW_opt
  // case_constiuents
  //       case_tail
  //     | LPAREN expression RPAREN case_tail
  //     | unparenthesized_expression case_tail
  //     | non_expression_constituent case_tail
  public static boolean case_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_body")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<case body>");
    result_ = case_body_0(builder_, level_ + 1);
    if (!result_) result_ = case_body_1(builder_, level_ + 1);
    if (!result_) result_ = case_body_2(builder_, level_ + 1);
    if (!result_) result_ = case_body_3(builder_, level_ + 1);
    if (!result_) result_ = case_body_4(builder_, level_ + 1);
    if (!result_) result_ = case_body_5(builder_, level_ + 1);
    if (!result_) result_ = case_body_6(builder_, level_ + 1);
    if (!result_) result_ = case_body_7(builder_, level_ + 1);
    if (!result_) result_ = case_body_8(builder_, level_ + 1);
    if (result_) {
      marker_.done(CASE_BODY);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // case_label case_constiuents
  // case_label
  //       unparenthesized_expression EQUAL_ARROW
  private static boolean case_body_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_body_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, CASE_LABEL, CASE_CONSTIUENTS, CASE_LABEL);
    result_ = result_ && unparenthesized_expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQUAL_ARROW);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // unparenthesized_expression COMMA expressions EQUAL_ARROW
  private static boolean case_body_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_body_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = unparenthesized_expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && expressions(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQUAL_ARROW);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // LPAREN expression RPAREN operand_tails EQUAL_ARROW
  private static boolean case_body_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_body_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && operand_tails(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQUAL_ARROW);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // LPAREN expression RPAREN operand_tails COMMA expressions EQUAL_ARROW
  private static boolean case_body_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_body_3")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && operand_tails(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && expressions(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQUAL_ARROW);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // LPAREN expression COMMA expressions RPAREN EQUAL_ARROW
  private static boolean case_body_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_body_4")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && expressions(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, RPAREN, EQUAL_ARROW);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // OTHERWISE EQUAL_ARROW_opt
  // case_constiuents
  //       case_tail
  private static boolean case_body_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_body_5")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, OTHERWISE, EQUAL_ARROW_OPT, CASE_CONSTIUENTS);
    result_ = result_ && case_tail(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // LPAREN expression RPAREN case_tail
  private static boolean case_body_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_body_6")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && case_tail(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // unparenthesized_expression case_tail
  private static boolean case_body_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_body_7")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = unparenthesized_expression(builder_, level_ + 1);
    result_ = result_ && case_tail(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // non_expression_constituent case_tail
  private static boolean case_body_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_body_8")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = non_expression_constituent(builder_, level_ + 1);
    result_ = result_ && case_tail(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // | SEMICOLON case_constiuents
  //     | SEMICOLON case_label case_constiuents
  public static boolean case_tail(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_tail")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<case tail>");
    result_ = case_tail_0(builder_, level_ + 1);
    if (!result_) result_ = case_tail_1(builder_, level_ + 1);
    if (!result_) result_ = case_tail_2(builder_, level_ + 1);
    if (result_) {
      marker_.done(CASE_TAIL);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  private static boolean case_tail_0(PsiBuilder builder_, int level_) {
    return true;
  }

  // SEMICOLON case_constiuents
  private static boolean case_tail_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_tail_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, SEMICOLON, CASE_CONSTIUENTS);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // SEMICOLON case_label case_constiuents
  private static boolean case_tail_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_tail_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, SEMICOLON, CASE_LABEL, CASE_CONSTIUENTS);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // unparenthesized_operand
  //     | LPAREN operand RPAREN operand_tails
  //     | LPAREN operand COMMA property_list RPAREN
  public static boolean condition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "condition")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<condition>");
    result_ = unparenthesized_operand(builder_, level_ + 1);
    if (!result_) result_ = condition_1(builder_, level_ + 1);
    if (!result_) result_ = condition_2(builder_, level_ + 1);
    if (result_) {
      marker_.done(CONDITION);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // LPAREN operand RPAREN operand_tails
  private static boolean condition_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "condition_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && operand(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && operand_tails(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // LPAREN operand COMMA property_list RPAREN
  private static boolean condition_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "condition_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && operand(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && property_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // literal | SYMBOL
  public static boolean constant(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<constant>");
    result_ = literal(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, SYMBOL);
    if (result_) {
      marker_.done(CONSTANT);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // NUMBER
  //     | CHARACTER_LITERAL
  //     | STRING
  //     | SYMBOL
  //     | HASH_PAREN constants DOT constant RPAREN
  //     | HASH_PAREN constants_opt RPAREN
  //     | HASH_BRACKET constants_opt RBRACKET
  //     | PARSED_LIST_CONSTANT
  //     | PARSED_VECTOR_CONSTANT
  public static boolean constant_fragment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_fragment")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<constant fragment>");
    result_ = consumeToken(builder_, NUMBER);
    if (!result_) result_ = consumeToken(builder_, CHARACTER_LITERAL);
    if (!result_) result_ = consumeToken(builder_, STRING);
    if (!result_) result_ = consumeToken(builder_, SYMBOL);
    if (!result_) result_ = constant_fragment_4(builder_, level_ + 1);
    if (!result_) result_ = constant_fragment_5(builder_, level_ + 1);
    if (!result_) result_ = constant_fragment_6(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, PARSED_LIST_CONSTANT);
    if (!result_) result_ = consumeToken(builder_, PARSED_VECTOR_CONSTANT);
    if (result_) {
      marker_.done(CONSTANT_FRAGMENT);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // HASH_PAREN constants DOT constant RPAREN
  private static boolean constant_fragment_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_fragment_4")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, HASH_PAREN);
    result_ = result_ && constants(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOT);
    result_ = result_ && constant(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // HASH_PAREN constants_opt RPAREN
  private static boolean constant_fragment_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_fragment_5")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, HASH_PAREN, CONSTANTS_OPT, RPAREN);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // HASH_BRACKET constants_opt RBRACKET
  private static boolean constant_fragment_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_fragment_6")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, HASH_BRACKET, CONSTANTS_OPT, RBRACKET);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // constant | constants COMMA constant
  public static boolean constants(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constants")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<constants>");
    result_ = constant(builder_, level_ + 1);
    if (!result_) result_ = constants_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(CONSTANTS);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // constants COMMA constant
  private static boolean constants_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constants_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = constants(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && constant(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // non_expression_constituent | expression
  public static boolean constituent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constituent")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<constituent>");
    result_ = non_expression_constituent(builder_, level_ + 1);
    if (!result_) result_ = expression(builder_, level_ + 1);
    if (result_) {
      marker_.done(CONSTITUENT);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // constituent | constituent SEMICOLON constituent
  public static boolean constituents(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constituents")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<constituents>");
    result_ = constituent(builder_, level_ + 1);
    if (!result_) result_ = constituents_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(CONSTITUENTS);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // constituent SEMICOLON constituent
  private static boolean constituents_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constituents_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = constituent(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    result_ = result_ && constituent(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // non_end_core_word | END
  public static boolean core_word(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "core_word")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<core word>");
    result_ = non_end_core_word(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, END);
    if (result_) {
      marker_.done(CORE_WORD);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // EQUAL expression
  public static boolean default(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "default")) return false;
    if (!nextTokenIs(builder_, EQUAL)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, EQUAL);
    result_ = result_ && expression(builder_, level_ + 1);
    if (result_) {
      marker_.done(DEFAULT);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // DEFINE_BODY_NONEXPRESSION_WORD | DEFINE_BODY_BEGIN_WORD | DEFINE_BODY_FUNCTION_WORD
  public static boolean define_body_word(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "define_body_word")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<define body word>");
    result_ = consumeToken(builder_, DEFINE_BODY_NONEXPRESSION_WORD);
    if (!result_) result_ = consumeToken(builder_, DEFINE_BODY_BEGIN_WORD);
    if (!result_) result_ = consumeToken(builder_, DEFINE_BODY_FUNCTION_WORD);
    if (result_) {
      marker_.done(DEFINE_BODY_WORD);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // DEFINE_LIST_NONEXPRESSION_WORD | DEFINE_LIST_BEGIN_WORD | DEFINE_LIST_FUNCTION_WORD
  public static boolean define_list_word(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "define_list_word")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<define list word>");
    result_ = consumeToken(builder_, DEFINE_LIST_NONEXPRESSION_WORD);
    if (!result_) result_ = consumeToken(builder_, DEFINE_LIST_BEGIN_WORD);
    if (!result_) result_ = consumeToken(builder_, DEFINE_LIST_FUNCTION_WORD);
    if (result_) {
      marker_.done(DEFINE_LIST_WORD);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // definition_macro_call | DEFINE MACRO macro_definition | PARSED_DEFINITION
  public static boolean definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "definition")) return false;
    if (!nextTokenIs(builder_, DEFINE) && !nextTokenIs(builder_, PARSED_DEFINITION)
        && replaceVariants(builder_, 2, "<definition>")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<definition>");
    result_ = definition_macro_call(builder_, level_ + 1);
    if (!result_) result_ = definition_1(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, PARSED_DEFINITION);
    if (result_) {
      marker_.done(DEFINITION);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // DEFINE MACRO macro_definition
  private static boolean definition_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "definition_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, DEFINE, MACRO);
    result_ = result_ && macro_definition(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // DEFINE modifiers_opt define_body_word body_fragment_opt definition_tail
  //     | DEFINE modifiers_opt define_list_word list_fragment_opt
  public static boolean definition_macro_call(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "definition_macro_call")) return false;
    if (!nextTokenIs(builder_, DEFINE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = definition_macro_call_0(builder_, level_ + 1);
    if (!result_) result_ = definition_macro_call_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(DEFINITION_MACRO_CALL);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // DEFINE modifiers_opt define_body_word body_fragment_opt definition_tail
  private static boolean definition_macro_call_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "definition_macro_call_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, DEFINE, MODIFIERS_OPT);
    result_ = result_ && define_body_word(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, BODY_FRAGMENT_OPT);
    result_ = result_ && definition_tail(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // DEFINE modifiers_opt define_list_word list_fragment_opt
  private static boolean definition_macro_call_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "definition_macro_call_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, DEFINE, MODIFIERS_OPT);
    result_ = result_ && define_list_word(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LIST_FRAGMENT_OPT);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // END | END macro_name | END define_body_word macro_name
  public static boolean definition_tail(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "definition_tail")) return false;
    if (!nextTokenIs(builder_, END)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, END);
    if (!result_) result_ = definition_tail_1(builder_, level_ + 1);
    if (!result_) result_ = definition_tail_2(builder_, level_ + 1);
    if (result_) {
      marker_.done(DEFINITION_TAIL);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // END macro_name
  private static boolean definition_tail_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "definition_tail_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, END);
    result_ = result_ && macro_name(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // END define_body_word macro_name
  private static boolean definition_tail_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "definition_tail_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, END);
    result_ = result_ && define_body_word(builder_, level_ + 1);
    result_ = result_ && macro_name(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
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
  // END BEGIN_WORD_opt
  public static boolean end_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "end_clause")) return false;
    if (!nextTokenIs(builder_, END)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, END, BEGIN_WORD_OPT);
    if (result_) {
      marker_.done(END_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // ESCAPED_WORD | OPERATOR_NAME
  public static boolean escaped_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "escaped_name")) return false;
    if (!nextTokenIs(builder_, ESCAPED_WORD) && !nextTokenIs(builder_, OPERATOR_NAME)
        && replaceVariants(builder_, 2, "<escaped name>")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<escaped name>");
    result_ = consumeToken(builder_, ESCAPED_WORD);
    if (!result_) result_ = consumeToken(builder_, OPERATOR_NAME);
    if (result_) {
      marker_.done(ESCAPED_NAME);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // binary_operand | expression binary_operator binary_operand
  public static boolean expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression")) return false;
    if (!nextTokenIs(builder_, SYMBOL) && !nextTokenIs(builder_, UNARY_OPERATOR_OPT)
        && replaceVariants(builder_, 2, "<expression>")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<expression>");
    result_ = binary_operand(builder_, level_ + 1);
    if (!result_) result_ = expression_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(EXPRESSION);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // expression binary_operator binary_operand
  private static boolean expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && binary_operator(builder_, level_ + 1);
    result_ = result_ && binary_operand(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // binary_operand_no_symbol | binary_operand_no_symbol binary_operator binary_operand
  public static boolean expression_no_symbol(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_no_symbol")) return false;
    if (!nextTokenIs(builder_, UNARY_OPERATOR_OPT)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = binary_operand_no_symbol(builder_, level_ + 1);
    if (!result_) result_ = expression_no_symbol_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(EXPRESSION_NO_SYMBOL);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // binary_operand_no_symbol binary_operator binary_operand
  private static boolean expression_no_symbol_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_no_symbol_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = binary_operand_no_symbol(builder_, level_ + 1);
    result_ = result_ && binary_operator(builder_, level_ + 1);
    result_ = result_ && binary_operand(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // expression | expressions COMMA expression
  public static boolean expressions(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expressions")) return false;
    if (!nextTokenIs(builder_, SYMBOL) && !nextTokenIs(builder_, UNARY_OPERATOR_OPT)
        && replaceVariants(builder_, 2, "<expressions>")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<expressions>");
    result_ = expression(builder_, level_ + 1);
    if (!result_) result_ = expressions_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(EXPRESSIONS);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // expressions COMMA expression
  private static boolean expressions_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expressions_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = expressions(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && expression(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // function_word LPAREN body_fragment_opt RPAREN
  public static boolean function_macro_call(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_macro_call")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<function macro call>");
    result_ = function_word(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, LPAREN, BODY_FRAGMENT_OPT, RPAREN);
    if (result_) {
      marker_.done(FUNCTION_MACRO_CALL);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // LBRACE macro_name LPAREN pattern_opt RPAREN RBRACE EQUAL_ARROW rhs
  public static boolean function_rule(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_rule")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && macro_name(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, LPAREN, PATTERN_OPT, RPAREN, RBRACE, EQUAL_ARROW);
    result_ = result_ && rhs(builder_, level_ + 1);
    if (result_) {
      marker_.done(FUNCTION_RULE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // function_rule
  //     | function_rules function_rule
  public static boolean function_rules(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_rules")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = function_rule(builder_, level_ + 1);
    if (!result_) result_ = function_rules_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(FUNCTION_RULES);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // function_rules function_rule
  private static boolean function_rules_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_rules_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = function_rules(builder_, level_ + 1);
    result_ = result_ && function_rule(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // NONDEFINING_FUNCTION_WORD | DEFINE_BODY_FUNCTION_WORD | DEFINE_LIST_FUNCTION_WORD
  public static boolean function_word(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_word")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<function word>");
    result_ = consumeToken(builder_, NONDEFINING_FUNCTION_WORD);
    if (!result_) result_ = consumeToken(builder_, DEFINE_BODY_FUNCTION_WORD);
    if (!result_) result_ = consumeToken(builder_, DEFINE_LIST_FUNCTION_WORD);
    if (result_) {
      marker_.done(FUNCTION_WORD);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // expression
  public static boolean handler(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "handler")) return false;
    if (!nextTokenIs(builder_, SYMBOL) && !nextTokenIs(builder_, UNARY_OPERATOR_OPT)
        && replaceVariants(builder_, 2, "<handler>")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<handler>");
    result_ = expression(builder_, level_ + 1);
    if (result_) {
      marker_.done(HANDLER);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // HASH_T | HASH_F | HASH_NEXT | HASH_REST | HASH_KEY | HASH_ALL_KEYS | HASH_INCLUDE
  public static boolean hash_word(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hash_word")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<hash word>");
    result_ = consumeToken(builder_, HASH_T);
    if (!result_) result_ = consumeToken(builder_, HASH_F);
    if (!result_) result_ = consumeToken(builder_, HASH_NEXT);
    if (!result_) result_ = consumeToken(builder_, HASH_REST);
    if (!result_) result_ = consumeToken(builder_, HASH_KEY);
    if (!result_) result_ = consumeToken(builder_, HASH_ALL_KEYS);
    if (!result_) result_ = consumeToken(builder_, HASH_INCLUDE);
    if (result_) {
      marker_.done(HASH_WORD);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // header_key SEPARATOR values
  public static boolean header(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "header")) return false;
    if (!nextTokenIs(builder_, KEY)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = header_key(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEPARATOR);
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
  // KEY
  public static boolean header_key(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "header_key")) return false;
    if (!nextTokenIs(builder_, KEY)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, KEY);
    if (result_) {
      marker_.done(HEADER_KEY);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // VALUE
  public static boolean header_value(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "header_value")) return false;
    if (!nextTokenIs(builder_, VALUE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, VALUE);
    if (result_) {
      marker_.done(HEADER_VALUE);
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
  // HASH_KEY
  //     | HASH_KEY COMMA HASH_ALL_KEYS
  //     | HASH_KEY keyword_parameters
  //     | HASH_KEY keyword_parameters COMMA HASH_ALL_KEYS
  public static boolean key_parameter_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "key_parameter_list")) return false;
    if (!nextTokenIs(builder_, HASH_KEY)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, HASH_KEY);
    if (!result_) result_ = key_parameter_list_1(builder_, level_ + 1);
    if (!result_) result_ = key_parameter_list_2(builder_, level_ + 1);
    if (!result_) result_ = key_parameter_list_3(builder_, level_ + 1);
    if (result_) {
      marker_.done(KEY_PARAMETER_LIST);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // HASH_KEY COMMA HASH_ALL_KEYS
  private static boolean key_parameter_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "key_parameter_list_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, HASH_KEY, COMMA, HASH_ALL_KEYS);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // HASH_KEY keyword_parameters
  private static boolean key_parameter_list_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "key_parameter_list_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, HASH_KEY);
    result_ = result_ && keyword_parameters(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // HASH_KEY keyword_parameters COMMA HASH_ALL_KEYS
  private static boolean key_parameter_list_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "key_parameter_list_3")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, HASH_KEY);
    result_ = result_ && keyword_parameters(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, COMMA, HASH_ALL_KEYS);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // SYMBOL_opt variable default_opt
  public static boolean keyword_parameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "keyword_parameter")) return false;
    if (!nextTokenIs(builder_, SYMBOL_OPT)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, SYMBOL_OPT);
    result_ = result_ && variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DEFAULT_OPT);
    if (result_) {
      marker_.done(KEYWORD_PARAMETER);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // keyword_parameter
  //     | keyword_parameters COMMA keyword_parameter
  public static boolean keyword_parameters(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "keyword_parameters")) return false;
    if (!nextTokenIs(builder_, SYMBOL_OPT)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = keyword_parameter(builder_, level_ + 1);
    if (!result_) result_ = keyword_parameters_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(KEYWORD_PARAMETERS);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // keyword_parameters COMMA keyword_parameter
  private static boolean keyword_parameters_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "keyword_parameters_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = keyword_parameters(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && keyword_parameter(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // LPAREN expression RPAREN | unparenthesized_leaf
  public static boolean leaf(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<leaf>");
    result_ = leaf_0(builder_, level_ + 1);
    if (!result_) result_ = unparenthesized_leaf(builder_, level_ + 1);
    if (result_) {
      marker_.done(LEAF);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // LPAREN expression RPAREN
  private static boolean leaf_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leaf_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // non_statement_list_fragment | statement non_statement_list_fragment_opt
  public static boolean list_fragment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_fragment")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<list fragment>");
    result_ = non_statement_list_fragment(builder_, level_ + 1);
    if (!result_) result_ = list_fragment_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(LIST_FRAGMENT);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // statement non_statement_list_fragment_opt
  private static boolean list_fragment_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_fragment_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = statement(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, NON_STATEMENT_LIST_FRAGMENT_OPT);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // LBRACE DEFINE pattern RBRACE EQUAL_ARROW rhs
  public static boolean list_style_definition_rule(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_style_definition_rule")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, LBRACE, DEFINE);
    result_ = result_ && pattern(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, RBRACE, EQUAL_ARROW);
    result_ = result_ && rhs(builder_, level_ + 1);
    if (result_) {
      marker_.done(LIST_STYLE_DEFINITION_RULE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // list_style_definition_rule
  //     | list_style_definition_rules list_style_definition_rule
  public static boolean list_style_definition_rules(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_style_definition_rules")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = list_style_definition_rule(builder_, level_ + 1);
    if (!result_) result_ = list_style_definition_rules_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(LIST_STYLE_DEFINITION_RULES);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // list_style_definition_rules list_style_definition_rule
  private static boolean list_style_definition_rules_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_style_definition_rules_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = list_style_definition_rules(builder_, level_ + 1);
    result_ = result_ && list_style_definition_rule(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // NUMBER
  //     | CHARACTER_LITERAL
  //     | string_literal
  //     | HASH_T
  //     | HASH_F
  //     | HASH_PAREN constants DOT constant RPAREN
  //     | HASH_PAREN constants_opt RPAREN
  //     | HASH_BRACKET constants_opt RBRACKET
  //     | PARSED_LIST_CONSTANT
  //     | PARSED_VECTOR_CONSTANT
  public static boolean literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<literal>");
    result_ = consumeToken(builder_, NUMBER);
    if (!result_) result_ = consumeToken(builder_, CHARACTER_LITERAL);
    if (!result_) result_ = string_literal(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, HASH_T);
    if (!result_) result_ = consumeToken(builder_, HASH_F);
    if (!result_) result_ = literal_5(builder_, level_ + 1);
    if (!result_) result_ = literal_6(builder_, level_ + 1);
    if (!result_) result_ = literal_7(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, PARSED_LIST_CONSTANT);
    if (!result_) result_ = consumeToken(builder_, PARSED_VECTOR_CONSTANT);
    if (result_) {
      marker_.done(LITERAL);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // HASH_PAREN constants DOT constant RPAREN
  private static boolean literal_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal_5")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, HASH_PAREN);
    result_ = result_ && constants(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOT);
    result_ = result_ && constant(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // HASH_PAREN constants_opt RPAREN
  private static boolean literal_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal_6")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, HASH_PAREN, CONSTANTS_OPT, RPAREN);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // HASH_BRACKET constants_opt RBRACKET
  private static boolean literal_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal_7")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, HASH_BRACKET, CONSTANTS_OPT, RBRACKET);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // LET bindings
  //     | LET HANDLER condition EQUAL handler
  //     | LOCAL local_methods
  //     | PARSED_LOCAL_DECLARATION
  public static boolean local_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "local_declaration")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<local declaration>");
    result_ = local_declaration_0(builder_, level_ + 1);
    if (!result_) result_ = local_declaration_1(builder_, level_ + 1);
    if (!result_) result_ = local_declaration_2(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, PARSED_LOCAL_DECLARATION);
    if (result_) {
      marker_.done(LOCAL_DECLARATION);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // LET bindings
  private static boolean local_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "local_declaration_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, LET);
    result_ = result_ && bindings(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // LET HANDLER condition EQUAL handler
  private static boolean local_declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "local_declaration_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, LET, HANDLER);
    result_ = result_ && condition(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQUAL);
    result_ = result_ && handler(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // LOCAL local_methods
  private static boolean local_declaration_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "local_declaration_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, LOCAL);
    result_ = result_ && local_methods(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // method_definition | local_methods COMMA method_definition
  public static boolean local_methods(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "local_methods")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<local methods>");
    result_ = method_definition(builder_, level_ + 1);
    if (!result_) result_ = local_methods_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(LOCAL_METHODS);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // local_methods COMMA method_definition
  private static boolean local_methods_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "local_methods_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = local_methods(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && method_definition(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // definition_macro_call | statement | function_macro_call | PARSED_MACRO_CALL
  public static boolean macro(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<macro>");
    result_ = definition_macro_call(builder_, level_ + 1);
    if (!result_) result_ = statement(builder_, level_ + 1);
    if (!result_) result_ = function_macro_call(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, PARSED_MACRO_CALL);
    if (result_) {
      marker_.done(MACRO);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // macro_name main_rule_set aux_rule_sets_opt END MACRO_opt macro_name_opt
  public static boolean macro_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_definition")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<macro definition>");
    result_ = macro_name(builder_, level_ + 1);
    result_ = result_ && main_rule_set(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, AUX_RULE_SETS_OPT, END, MACRO_OPT, MACRO_NAME_OPT);
    if (result_) {
      marker_.done(MACRO_DEFINITION);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // nondefining_name | define_body_word | define_list_word
  public static boolean macro_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_name")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<macro name>");
    result_ = nondefining_name(builder_, level_ + 1);
    if (!result_) result_ = define_body_word(builder_, level_ + 1);
    if (!result_) result_ = define_list_word(builder_, level_ + 1);
    if (result_) {
      marker_.done(MACRO_NAME);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // body_style_definition_rules
  //     | list_style_definition_rules
  //     | statement_rules
  //     | function_rules
  public static boolean main_rule_set(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "main_rule_set")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = body_style_definition_rules(builder_, level_ + 1);
    if (!result_) result_ = list_style_definition_rules(builder_, level_ + 1);
    if (!result_) result_ = statement_rules(builder_, level_ + 1);
    if (!result_) result_ = function_rules(builder_, level_ + 1);
    if (result_) {
      marker_.done(MAIN_RULE_SET);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // pattern semicolon_opt | semicolon_opt
  public static boolean maybe_pattern_and_semicolon(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "maybe_pattern_and_semicolon")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<maybe pattern and semicolon>");
    result_ = maybe_pattern_and_semicolon_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, SEMICOLON_OPT);
    if (result_) {
      marker_.done(MAYBE_PATTERN_AND_SEMICOLON);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // pattern semicolon_opt
  private static boolean maybe_pattern_and_semicolon_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "maybe_pattern_and_semicolon_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = pattern(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON_OPT);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // method_name parameter_list body_opt END method_name_opt
  public static boolean method_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_definition")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<method definition>");
    result_ = method_name(builder_, level_ + 1);
    result_ = result_ && parameter_list(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, BODY_OPT, END, METHOD_NAME_OPT);
    if (result_) {
      marker_.done(METHOD_DEFINITION);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // macro_name variable_name_opt
  public static boolean method_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_name")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<method name>");
    result_ = macro_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, VARIABLE_NAME_OPT);
    if (result_) {
      marker_.done(METHOD_NAME);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // nondefining_name
  public static boolean modifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "modifier")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<modifier>");
    result_ = nondefining_name(builder_, level_ + 1);
    if (result_) {
      marker_.done(MODIFIER);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // modifier | modifiers modifier
  public static boolean modifiers(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "modifiers")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<modifiers>");
    result_ = modifier(builder_, level_ + 1);
    if (!result_) result_ = modifiers_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(MODIFIERS);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // modifiers modifier
  private static boolean modifiers_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "modifiers_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = modifiers(builder_, level_ + 1);
    result_ = result_ && modifier(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // reserved_word | unreserved_name
  public static boolean name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "name")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<name>");
    result_ = reserved_word(builder_, level_ + 1);
    if (!result_) result_ = unreserved_name(builder_, level_ + 1);
    if (result_) {
      marker_.done(NAME);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // macro_name | non_end_core_word
  public static boolean name_not_end(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "name_not_end")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<name not end>");
    result_ = macro_name(builder_, level_ + 1);
    if (!result_) result_ = non_end_core_word(builder_, level_ + 1);
    if (result_) {
      marker_.done(NAME_NOT_END);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // STRING HASH_HASH
  public static boolean name_prefix(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "name_prefix")) return false;
    if (!nextTokenIs(builder_, STRING)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, STRING, HASH_HASH);
    if (result_) {
      marker_.done(NAME_PREFIX);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // name | STRING | SYMBOL
  public static boolean name_string_or_symbol(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "name_string_or_symbol")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<name string or symbol>");
    result_ = name(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, STRING);
    if (!result_) result_ = consumeToken(builder_, SYMBOL);
    if (result_) {
      marker_.done(NAME_STRING_OR_SYMBOL);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // HASH_HASH STRING
  public static boolean name_suffix(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "name_suffix")) return false;
    if (!nextTokenIs(builder_, HASH_HASH)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, HASH_HASH, STRING);
    if (result_) {
      marker_.done(NAME_SUFFIX);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // HASH_NEXT variable_name
  //     | HASH_NEXT variable_name COMMA rest_key_parameter_list
  //     | rest_key_parameter_list
  public static boolean next_rest_key_parameter_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "next_rest_key_parameter_list")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<next rest key parameter list>");
    result_ = next_rest_key_parameter_list_0(builder_, level_ + 1);
    if (!result_) result_ = next_rest_key_parameter_list_1(builder_, level_ + 1);
    if (!result_) result_ = rest_key_parameter_list(builder_, level_ + 1);
    if (result_) {
      marker_.done(NEXT_REST_KEY_PARAMETER_LIST);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // HASH_NEXT variable_name
  private static boolean next_rest_key_parameter_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "next_rest_key_parameter_list_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, HASH_NEXT);
    result_ = result_ && variable_name(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // HASH_NEXT variable_name COMMA rest_key_parameter_list
  private static boolean next_rest_key_parameter_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "next_rest_key_parameter_list_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, HASH_NEXT);
    result_ = result_ && variable_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && rest_key_parameter_list(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // COMMA
  //     | DOT
  //     | SEMICOLON
  //     | COLON_COLON
  //     | MINUS
  //     | EQUAL
  //     | EQUAL_EQUAL
  //     | EQUAL_ARROW
  //     | HASH_HASH
  //     | QUERY
  //     | QUERY_QUERY
  //     | QUERY_EQUAL
  //     | ELLIPSIS
  public static boolean non_bracketing_punctuation(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_bracketing_punctuation")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<non bracketing punctuation>");
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = consumeToken(builder_, DOT);
    if (!result_) result_ = consumeToken(builder_, SEMICOLON);
    if (!result_) result_ = consumeToken(builder_, COLON_COLON);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    if (!result_) result_ = consumeToken(builder_, EQUAL);
    if (!result_) result_ = consumeToken(builder_, EQUAL_EQUAL);
    if (!result_) result_ = consumeToken(builder_, EQUAL_ARROW);
    if (!result_) result_ = consumeToken(builder_, HASH_HASH);
    if (!result_) result_ = consumeToken(builder_, QUERY);
    if (!result_) result_ = consumeToken(builder_, QUERY_QUERY);
    if (!result_) result_ = consumeToken(builder_, QUERY_EQUAL);
    if (!result_) result_ = consumeToken(builder_, ELLIPSIS);
    if (result_) {
      marker_.done(NON_BRACKETING_PUNCTUATION);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // DEFINE | HANDLER | LET | LOCAL | MACRO | OTHERWISE
  public static boolean non_end_core_word(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_end_core_word")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<non end core word>");
    result_ = consumeToken(builder_, DEFINE);
    if (!result_) result_ = consumeToken(builder_, HANDLER);
    if (!result_) result_ = consumeToken(builder_, LET);
    if (!result_) result_ = consumeToken(builder_, LOCAL);
    if (!result_) result_ = consumeToken(builder_, MACRO);
    if (!result_) result_ = consumeToken(builder_, OTHERWISE);
    if (result_) {
      marker_.done(NON_END_CORE_WORD);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // definition | local_declaration
  public static boolean non_expression_constituent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_expression_constituent")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<non expression constituent>");
    result_ = definition(builder_, level_ + 1);
    if (!result_) result_ = local_declaration(builder_, level_ + 1);
    if (result_) {
      marker_.done(NON_EXPRESSION_CONSTITUENT);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // simple_fragment basic_fragment_opt
  public static boolean non_statement_basic_fragment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_statement_basic_fragment")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<non statement basic fragment>");
    result_ = simple_fragment(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, BASIC_FRAGMENT_OPT);
    if (result_) {
      marker_.done(NON_STATEMENT_BASIC_FRAGMENT);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // definition semicolon_fragment_opt
  //     | local_declaration semicolon_fragment_opt
  //     | simple_fragment body_fragment_opt
  //     | COMMA body_fragment_opt
  //     | SEMICOLON body_fragment_opt
  public static boolean non_statement_body_fragment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_statement_body_fragment")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<non statement body fragment>");
    result_ = non_statement_body_fragment_0(builder_, level_ + 1);
    if (!result_) result_ = non_statement_body_fragment_1(builder_, level_ + 1);
    if (!result_) result_ = non_statement_body_fragment_2(builder_, level_ + 1);
    if (!result_) result_ = non_statement_body_fragment_3(builder_, level_ + 1);
    if (!result_) result_ = non_statement_body_fragment_4(builder_, level_ + 1);
    if (result_) {
      marker_.done(NON_STATEMENT_BODY_FRAGMENT);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // definition semicolon_fragment_opt
  private static boolean non_statement_body_fragment_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_statement_body_fragment_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = definition(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON_FRAGMENT_OPT);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // local_declaration semicolon_fragment_opt
  private static boolean non_statement_body_fragment_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_statement_body_fragment_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = local_declaration(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON_FRAGMENT_OPT);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // simple_fragment body_fragment_opt
  private static boolean non_statement_body_fragment_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_statement_body_fragment_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = simple_fragment(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, BODY_FRAGMENT_OPT);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // COMMA body_fragment_opt
  private static boolean non_statement_body_fragment_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_statement_body_fragment_3")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, COMMA, BODY_FRAGMENT_OPT);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // SEMICOLON body_fragment_opt
  private static boolean non_statement_body_fragment_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_statement_body_fragment_4")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, SEMICOLON, BODY_FRAGMENT_OPT);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // simple_fragment list_fragment_opt | COMMA list_fragment_opt
  public static boolean non_statement_list_fragment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_statement_list_fragment")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<non statement list fragment>");
    result_ = non_statement_list_fragment_0(builder_, level_ + 1);
    if (!result_) result_ = non_statement_list_fragment_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(NON_STATEMENT_LIST_FRAGMENT);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // simple_fragment list_fragment_opt
  private static boolean non_statement_list_fragment_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_statement_list_fragment_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = simple_fragment(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LIST_FRAGMENT_OPT);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // COMMA list_fragment_opt
  private static boolean non_statement_list_fragment_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_statement_list_fragment_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, COMMA, LIST_FRAGMENT_OPT);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // nondefining_word | escaped_name
  public static boolean nondefining_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nondefining_name")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<nondefining name>");
    result_ = nondefining_word(builder_, level_ + 1);
    if (!result_) result_ = escaped_name(builder_, level_ + 1);
    if (result_) {
      marker_.done(NONDEFINING_NAME);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // NONDEFINING_BEGIN_WORD | NONDEFINING_FUNCTION_WORD | NONDEFINING_NONEXPRESSION_WORD
  public static boolean nondefining_word(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nondefining_word")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<nondefining word>");
    result_ = consumeToken(builder_, NONDEFINING_BEGIN_WORD);
    if (!result_) result_ = consumeToken(builder_, NONDEFINING_FUNCTION_WORD);
    if (!result_) result_ = consumeToken(builder_, NONDEFINING_NONEXPRESSION_WORD);
    if (result_) {
      marker_.done(NONDEFINING_WORD);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // NONDEFINING_NONEXPRESSION_WORD | DEFINE_BODY_NONEXPRESSION_WORD | DEFINE_LIST_NONEXPRESSION_WORD
  public static boolean nonexpression_word(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nonexpression_word")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<nonexpression word>");
    result_ = consumeToken(builder_, NONDEFINING_NONEXPRESSION_WORD);
    if (!result_) result_ = consumeToken(builder_, DEFINE_BODY_NONEXPRESSION_WORD);
    if (!result_) result_ = consumeToken(builder_, DEFINE_LIST_NONEXPRESSION_WORD);
    if (result_) {
      marker_.done(NONEXPRESSION_WORD);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // operand operand_tail | leaf
  public static boolean operand(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operand")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<operand>");
    result_ = operand_0(builder_, level_ + 1);
    if (!result_) result_ = leaf(builder_, level_ + 1);
    if (result_) {
      marker_.done(OPERAND);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // operand operand_tail
  private static boolean operand_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operand_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = operand(builder_, level_ + 1);
    result_ = result_ && operand_tail(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // LPAREN arguments_opt RPAREN | LBRACKET arguments_opt RBRACKET | DOT variable_name
  public static boolean operand_tail(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operand_tail")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<operand tail>");
    result_ = operand_tail_0(builder_, level_ + 1);
    if (!result_) result_ = operand_tail_1(builder_, level_ + 1);
    if (!result_) result_ = operand_tail_2(builder_, level_ + 1);
    if (result_) {
      marker_.done(OPERAND_TAIL);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // LPAREN arguments_opt RPAREN
  private static boolean operand_tail_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operand_tail_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, LPAREN, ARGUMENTS_OPT, RPAREN);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // LBRACKET arguments_opt RBRACKET
  private static boolean operand_tail_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operand_tail_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, LBRACKET, ARGUMENTS_OPT, RBRACKET);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // DOT variable_name
  private static boolean operand_tail_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operand_tail_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, DOT);
    result_ = result_ && variable_name(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // | operand_tails operand_tail
  public static boolean operand_tails(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operand_tails")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<operand tails>");
    result_ = operand_tails_0(builder_, level_ + 1);
    if (!result_) result_ = operand_tails_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(OPERAND_TAILS);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  private static boolean operand_tails_0(PsiBuilder builder_, int level_) {
    return true;
  }

  // operand_tails operand_tail
  private static boolean operand_tails_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operand_tails_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = operand_tails(builder_, level_ + 1);
    result_ = result_ && operand_tail(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // BINARY_OPERATOR_ONLY | UNARY_OPERATOR_ONLY | UNARY_AND_BINARY_OPERATOR
  public static boolean operator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operator")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<operator>");
    result_ = consumeToken(builder_, BINARY_OPERATOR_ONLY);
    if (!result_) result_ = consumeToken(builder_, UNARY_OPERATOR_ONLY);
    if (!result_) result_ = consumeToken(builder_, UNARY_AND_BINARY_OPERATOR);
    if (result_) {
      marker_.done(OPERATOR);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // nonexpression_word | escaped_name
  public static boolean ordinary_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ordinary_name")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<ordinary name>");
    result_ = nonexpression_word(builder_, level_ + 1);
    if (!result_) result_ = escaped_name(builder_, level_ + 1);
    if (result_) {
      marker_.done(ORDINARY_NAME);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // LPAREN parameters_opt RPAREN semicolon_opt
  //     | LPAREN parameters_opt RPAREN EQUAL_ARROW variable SEMICOLON
  //     | LPAREN parameters_opt RPAREN EQUAL_ARROW LPAREN values_list_opt RPAREN semicolon_opt
  public static boolean parameter_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_list")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = parameter_list_0(builder_, level_ + 1);
    if (!result_) result_ = parameter_list_1(builder_, level_ + 1);
    if (!result_) result_ = parameter_list_2(builder_, level_ + 1);
    if (result_) {
      marker_.done(PARAMETER_LIST);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // LPAREN parameters_opt RPAREN semicolon_opt
  private static boolean parameter_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_list_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, LPAREN, PARAMETERS_OPT, RPAREN, SEMICOLON_OPT);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // LPAREN parameters_opt RPAREN EQUAL_ARROW variable SEMICOLON
  private static boolean parameter_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_list_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, LPAREN, PARAMETERS_OPT, RPAREN, EQUAL_ARROW);
    result_ = result_ && variable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // LPAREN parameters_opt RPAREN EQUAL_ARROW LPAREN values_list_opt RPAREN semicolon_opt
  private static boolean parameter_list_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_list_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, LPAREN, PARAMETERS_OPT, RPAREN, EQUAL_ARROW, LPAREN, VALUES_LIST_OPT, RPAREN, SEMICOLON_OPT);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // required_parameters
  //     | required_parameters COMMA next_rest_key_parameter_list
  //     | next_rest_key_parameter_list
  public static boolean parameters(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameters")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<parameters>");
    result_ = required_parameters(builder_, level_ + 1);
    if (!result_) result_ = parameters_1(builder_, level_ + 1);
    if (!result_) result_ = next_rest_key_parameter_list(builder_, level_ + 1);
    if (result_) {
      marker_.done(PARAMETERS);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // required_parameters COMMA next_rest_key_parameter_list
  private static boolean parameters_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameters_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = required_parameters(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && next_rest_key_parameter_list(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // pattern_list | pattern SEMICOLON pattern_list
  public static boolean pattern(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<pattern>");
    result_ = pattern_list(builder_, level_ + 1);
    if (!result_) result_ = pattern_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PATTERN);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // pattern SEMICOLON pattern_list
  private static boolean pattern_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = pattern(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    result_ = result_ && pattern_list(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // QUERY name default_opt
  //     | QUERY CONSTRAINED_NAME default_opt
  //     | QUERY_QUERY name default_opt
  //     | QUERY_QUERY CONSTRAINED_NAME default_opt
  public static boolean pattern_keyword(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_keyword")) return false;
    if (!nextTokenIs(builder_, QUERY) && !nextTokenIs(builder_, QUERY_QUERY)
        && replaceVariants(builder_, 2, "<pattern keyword>")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<pattern keyword>");
    result_ = pattern_keyword_0(builder_, level_ + 1);
    if (!result_) result_ = pattern_keyword_1(builder_, level_ + 1);
    if (!result_) result_ = pattern_keyword_2(builder_, level_ + 1);
    if (!result_) result_ = pattern_keyword_3(builder_, level_ + 1);
    if (result_) {
      marker_.done(PATTERN_KEYWORD);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // QUERY name default_opt
  private static boolean pattern_keyword_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_keyword_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, QUERY);
    result_ = result_ && name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DEFAULT_OPT);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // QUERY CONSTRAINED_NAME default_opt
  private static boolean pattern_keyword_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_keyword_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, QUERY, CONSTRAINED_NAME, DEFAULT_OPT);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // QUERY_QUERY name default_opt
  private static boolean pattern_keyword_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_keyword_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, QUERY_QUERY);
    result_ = result_ && name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DEFAULT_OPT);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // QUERY_QUERY CONSTRAINED_NAME default_opt
  private static boolean pattern_keyword_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_keyword_3")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, QUERY_QUERY, CONSTRAINED_NAME, DEFAULT_OPT);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // HASH_ALL_KEYS
  //     | pattern_keyword
  //     | pattern_keyword COMMA pattern_keywords
  public static boolean pattern_keywords(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_keywords")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<pattern keywords>");
    result_ = consumeToken(builder_, HASH_ALL_KEYS);
    if (!result_) result_ = pattern_keyword(builder_, level_ + 1);
    if (!result_) result_ = pattern_keywords_2(builder_, level_ + 1);
    if (result_) {
      marker_.done(PATTERN_KEYWORDS);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // pattern_keyword COMMA pattern_keywords
  private static boolean pattern_keywords_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_keywords_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = pattern_keyword(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && pattern_keywords(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // pattern_sequence
  //     | pattern_sequence COMMA pattern_list
  //     | property_list_pattern
  public static boolean pattern_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_list")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<pattern list>");
    result_ = pattern_sequence(builder_, level_ + 1);
    if (!result_) result_ = pattern_list_1(builder_, level_ + 1);
    if (!result_) result_ = property_list_pattern(builder_, level_ + 1);
    if (result_) {
      marker_.done(PATTERN_LIST);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // pattern_sequence COMMA pattern_list
  private static boolean pattern_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_list_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = pattern_sequence(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && pattern_list(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // simple_pattern
  //     | pattern_sequence simple_pattern
  public static boolean pattern_sequence(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_sequence")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<pattern sequence>");
    result_ = simple_pattern(builder_, level_ + 1);
    if (!result_) result_ = pattern_sequence_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PATTERN_SEQUENCE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // pattern_sequence simple_pattern
  private static boolean pattern_sequence_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_sequence_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = pattern_sequence(builder_, level_ + 1);
    result_ = result_ && simple_pattern(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // QUERY name
  //     | QUERY CONSTRAINED_NAME
  //     | ELLIPSIS
  public static boolean pattern_variable(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_variable")) return false;
    if (!nextTokenIs(builder_, ELLIPSIS) && !nextTokenIs(builder_, QUERY)
        && replaceVariants(builder_, 2, "<pattern variable>")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<pattern variable>");
    result_ = pattern_variable_0(builder_, level_ + 1);
    if (!result_) result_ = pattern_variable_1(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, ELLIPSIS);
    if (result_) {
      marker_.done(PATTERN_VARIABLE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // QUERY name
  private static boolean pattern_variable_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_variable_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, QUERY);
    result_ = result_ && name(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // QUERY CONSTRAINED_NAME
  private static boolean pattern_variable_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_variable_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, QUERY, CONSTRAINED_NAME);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // SYMBOL value
  public static boolean property(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property")) return false;
    if (!nextTokenIs(builder_, SYMBOL)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, SYMBOL);
    result_ = result_ && value(builder_, level_ + 1);
    if (result_) {
      marker_.done(PROPERTY);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // property | property_list COMMA property
  public static boolean property_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_list")) return false;
    if (!nextTokenIs(builder_, SYMBOL)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = property(builder_, level_ + 1);
    if (!result_) result_ = property_list_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PROPERTY_LIST);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // property_list COMMA property
  private static boolean property_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_list_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = property_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && property(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // HASH_REST pattern_variable
  //     | HASH_KEY pattern_keywords_opt
  //     | HASH_REST pattern_variable COMMA HASH_KEY pattern_keywords_opt
  public static boolean property_list_pattern(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_list_pattern")) return false;
    if (!nextTokenIs(builder_, HASH_KEY) && !nextTokenIs(builder_, HASH_REST)
        && replaceVariants(builder_, 2, "<property list pattern>")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<property list pattern>");
    result_ = property_list_pattern_0(builder_, level_ + 1);
    if (!result_) result_ = property_list_pattern_1(builder_, level_ + 1);
    if (!result_) result_ = property_list_pattern_2(builder_, level_ + 1);
    if (result_) {
      marker_.done(PROPERTY_LIST_PATTERN);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // HASH_REST pattern_variable
  private static boolean property_list_pattern_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_list_pattern_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, HASH_REST);
    result_ = result_ && pattern_variable(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // HASH_KEY pattern_keywords_opt
  private static boolean property_list_pattern_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_list_pattern_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, HASH_KEY, PATTERN_KEYWORDS_OPT);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // HASH_REST pattern_variable COMMA HASH_KEY pattern_keywords_opt
  private static boolean property_list_pattern_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_list_pattern_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, HASH_REST);
    result_ = result_ && pattern_variable(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, COMMA, HASH_KEY, PATTERN_KEYWORDS_OPT);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // bracketing_punctuation | non_bracketing_punctuation
  public static boolean punctuation(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "punctuation")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<punctuation>");
    result_ = bracketing_punctuation(builder_, level_ + 1);
    if (!result_) result_ = non_bracketing_punctuation(builder_, level_ + 1);
    if (result_) {
      marker_.done(PUNCTUATION);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // variable
  //     | variable_name EQUAL_EQUAL expression
  public static boolean required_parameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "required_parameter")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<required parameter>");
    result_ = variable(builder_, level_ + 1);
    if (!result_) result_ = required_parameter_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(REQUIRED_PARAMETER);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // variable_name EQUAL_EQUAL expression
  private static boolean required_parameter_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "required_parameter_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = variable_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQUAL_EQUAL);
    result_ = result_ && expression(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // required_parameter
  //     | required_parameters COMMA required_parameter
  public static boolean required_parameters(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "required_parameters")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<required parameters>");
    result_ = required_parameter(builder_, level_ + 1);
    if (!result_) result_ = required_parameters_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(REQUIRED_PARAMETERS);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // required_parameters COMMA required_parameter
  private static boolean required_parameters_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "required_parameters_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = required_parameters(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && required_parameter(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // core_word | NONDEFINING_FUNCTION_WORD | NONDEFINING_BEGIN_WORD | define_body_word | define_list_word
  public static boolean reserved_word(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "reserved_word")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<reserved word>");
    result_ = core_word(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, NONDEFINING_FUNCTION_WORD);
    if (!result_) result_ = consumeToken(builder_, NONDEFINING_BEGIN_WORD);
    if (!result_) result_ = define_body_word(builder_, level_ + 1);
    if (!result_) result_ = define_list_word(builder_, level_ + 1);
    if (result_) {
      marker_.done(RESERVED_WORD);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // HASH_REST variable_name
  //     | HASH_REST variable_name COMMA key_parameter_list
  //     | key_parameter_list
  public static boolean rest_key_parameter_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rest_key_parameter_list")) return false;
    if (!nextTokenIs(builder_, HASH_KEY) && !nextTokenIs(builder_, HASH_REST)
        && replaceVariants(builder_, 2, "<rest key parameter list>")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<rest key parameter list>");
    result_ = rest_key_parameter_list_0(builder_, level_ + 1);
    if (!result_) result_ = rest_key_parameter_list_1(builder_, level_ + 1);
    if (!result_) result_ = key_parameter_list(builder_, level_ + 1);
    if (result_) {
      marker_.done(REST_KEY_PARAMETER_LIST);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // HASH_REST variable_name
  private static boolean rest_key_parameter_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rest_key_parameter_list_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, HASH_REST);
    result_ = result_ && variable_name(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // HASH_REST variable_name COMMA key_parameter_list
  private static boolean rest_key_parameter_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rest_key_parameter_list_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, HASH_REST);
    result_ = result_ && variable_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && key_parameter_list(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // LBRACE template_opt RBRACE semicolon_opt
  public static boolean rhs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rhs")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, LBRACE, TEMPLATE_OPT, RBRACE, SEMICOLON_OPT);
    if (result_) {
      marker_.done(RHS);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // SEMICOLON body_fragment_opt
  public static boolean semicolon_fragment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "semicolon_fragment")) return false;
    if (!nextTokenIs(builder_, SEMICOLON)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, SEMICOLON, BODY_FRAGMENT_OPT);
    if (result_) {
      marker_.done(SEMICOLON_FRAGMENT);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // SEMICOLON
  //     | COMMA
  //     | binary_operator
  public static boolean separator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "separator")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<separator>");
    result_ = consumeToken(builder_, SEMICOLON);
    if (!result_) result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = binary_operator(builder_, level_ + 1);
    if (result_) {
      marker_.done(SEPARATOR);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // variable_name
  //     | constant_fragment
  //     | operator
  //     | bracketed_fragment
  //     | function_macro_call
  //     | hash_word
  //     | DOT
  //     | COLON_COLON
  //     | EQUAL_ARROW
  //     | QUERY
  //     | QUERY_QUERY
  //     | QUERY_EQUAL
  //     | ELLIPSIS
  //     | HASH_HASH
  //     | OTHERWISE
  //     | PARSED_FUNCTION_CALL
  //     | PARSED_MACRO_CALL
  public static boolean simple_fragment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_fragment")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<simple fragment>");
    result_ = variable_name(builder_, level_ + 1);
    if (!result_) result_ = constant_fragment(builder_, level_ + 1);
    if (!result_) result_ = operator(builder_, level_ + 1);
    if (!result_) result_ = bracketed_fragment(builder_, level_ + 1);
    if (!result_) result_ = function_macro_call(builder_, level_ + 1);
    if (!result_) result_ = hash_word(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, DOT);
    if (!result_) result_ = consumeToken(builder_, COLON_COLON);
    if (!result_) result_ = consumeToken(builder_, EQUAL_ARROW);
    if (!result_) result_ = consumeToken(builder_, QUERY);
    if (!result_) result_ = consumeToken(builder_, QUERY_QUERY);
    if (!result_) result_ = consumeToken(builder_, QUERY_EQUAL);
    if (!result_) result_ = consumeToken(builder_, ELLIPSIS);
    if (!result_) result_ = consumeToken(builder_, HASH_HASH);
    if (!result_) result_ = consumeToken(builder_, OTHERWISE);
    if (!result_) result_ = consumeToken(builder_, PARSED_FUNCTION_CALL);
    if (!result_) result_ = consumeToken(builder_, PARSED_MACRO_CALL);
    if (result_) {
      marker_.done(SIMPLE_FRAGMENT);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // name_not_end
  //     | EQUAL_ARROW
  //     | bracketed_pattern
  //     | binding_pattern
  //     | pattern_variable
  public static boolean simple_pattern(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_pattern")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<simple pattern>");
    result_ = name_not_end(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, EQUAL_ARROW);
    if (!result_) result_ = bracketed_pattern(builder_, level_ + 1);
    if (!result_) result_ = binding_pattern(builder_, level_ + 1);
    if (!result_) result_ = pattern_variable(builder_, level_ + 1);
    if (result_) {
      marker_.done(SIMPLE_PATTERN);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // body?
  public static boolean source_record(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "source_record")) return false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<source record>");
    body(builder_, level_ + 1);
    marker_.done(SOURCE_RECORD);
    exitErrorRecordingSection(builder_, level_, true, false, _SECTION_GENERAL_, null);
    return true;
  }

  /* ********************************************************** */
  // source_record | variable | expression | name | token | body? | case_body? | macro
  public static boolean source_records(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "source_records")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<source records>");
    result_ = source_record(builder_, level_ + 1);
    if (!result_) result_ = variable(builder_, level_ + 1);
    if (!result_) result_ = expression(builder_, level_ + 1);
    if (!result_) result_ = name(builder_, level_ + 1);
    if (!result_) result_ = token(builder_, level_ + 1);
    if (!result_) result_ = source_records_5(builder_, level_ + 1);
    if (!result_) result_ = source_records_6(builder_, level_ + 1);
    if (!result_) result_ = macro(builder_, level_ + 1);
    if (result_) {
      marker_.done(SOURCE_RECORDS);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // body?
  private static boolean source_records_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "source_records_5")) return false;
    body(builder_, level_ + 1);
    return true;
  }

  // case_body?
  private static boolean source_records_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "source_records_6")) return false;
    case_body(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // begin_word body_fragment_opt end_clause
  public static boolean statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<statement>");
    result_ = begin_word(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, BODY_FRAGMENT_OPT);
    result_ = result_ && end_clause(builder_, level_ + 1);
    if (result_) {
      marker_.done(STATEMENT);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // LBRACE macro_name maybe_pattern_and_semicolon END RBRACE EQUAL_ARROW rhs
  public static boolean statement_rule(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_rule")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && macro_name(builder_, level_ + 1);
    result_ = result_ && maybe_pattern_and_semicolon(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, END, RBRACE, EQUAL_ARROW);
    result_ = result_ && rhs(builder_, level_ + 1);
    if (result_) {
      marker_.done(STATEMENT_RULE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // statement_rule
  //     | statement_rules statement_rule
  public static boolean statement_rules(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_rules")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = statement_rule(builder_, level_ + 1);
    if (!result_) result_ = statement_rules_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(STATEMENT_RULES);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // statement_rules statement_rule
  private static boolean statement_rules_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_rules_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = statement_rules(builder_, level_ + 1);
    result_ = result_ && statement_rule(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // STRING | string_literal STRING
  public static boolean string_literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "string_literal")) return false;
    if (!nextTokenIs(builder_, STRING)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, STRING);
    if (!result_) result_ = string_literal_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(STRING_LITERAL);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // string_literal STRING
  private static boolean string_literal_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "string_literal_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = string_literal(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, STRING);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // name_prefix_opt QUERY name_string_or_symbol name_suffix_opt
  //     | QUERY_QUERY name separator_opt ELLIPSIS
  //     | ELLIPSIS
  //     | QUERY_EQUAL name
  public static boolean substitution(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "substitution")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<substitution>");
    result_ = substitution_0(builder_, level_ + 1);
    if (!result_) result_ = substitution_1(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, ELLIPSIS);
    if (!result_) result_ = substitution_3(builder_, level_ + 1);
    if (result_) {
      marker_.done(SUBSTITUTION);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // name_prefix_opt QUERY name_string_or_symbol name_suffix_opt
  private static boolean substitution_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "substitution_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, NAME_PREFIX_OPT, QUERY);
    result_ = result_ && name_string_or_symbol(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, NAME_SUFFIX_OPT);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // QUERY_QUERY name separator_opt ELLIPSIS
  private static boolean substitution_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "substitution_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, QUERY_QUERY);
    result_ = result_ && name(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, SEPARATOR_OPT, ELLIPSIS);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // QUERY_EQUAL name
  private static boolean substitution_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "substitution_3")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, QUERY_EQUAL);
    result_ = result_ && name(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // template_element
  //     | template template_element
  public static boolean template(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "template")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<template>");
    result_ = template_element(builder_, level_ + 1);
    if (!result_) result_ = template_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(TEMPLATE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // template template_element
  private static boolean template_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "template_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = template(builder_, level_ + 1);
    result_ = result_ && template_element(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // name
  //     | SYMBOL
  //     | NUMBER
  //     | CHARACTER_LITERAL
  //     | STRING
  //     | UNARY_OPERATOR_ONLY
  //     | separator
  //     | hash_word
  //     | DOT
  //     | COLON_COLON
  //     | EQUAL_ARROW
  //     | LPAREN template_opt RPAREN
  //     | LBRACKET template_opt RBRACKET
  //     | LBRACE template_opt RBRACE
  //     | HASH_PAREN template_opt RPAREN
  //     | HASH_BRACKET template_opt RBRACKET
  //     | PARSED_LIST_CONSTANT
  //     | PARSED_VECTOR_CONSTANT
  //     | substitution
  public static boolean template_element(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "template_element")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<template element>");
    result_ = name(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, SYMBOL);
    if (!result_) result_ = consumeToken(builder_, NUMBER);
    if (!result_) result_ = consumeToken(builder_, CHARACTER_LITERAL);
    if (!result_) result_ = consumeToken(builder_, STRING);
    if (!result_) result_ = consumeToken(builder_, UNARY_OPERATOR_ONLY);
    if (!result_) result_ = separator(builder_, level_ + 1);
    if (!result_) result_ = hash_word(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, DOT);
    if (!result_) result_ = consumeToken(builder_, COLON_COLON);
    if (!result_) result_ = consumeToken(builder_, EQUAL_ARROW);
    if (!result_) result_ = template_element_11(builder_, level_ + 1);
    if (!result_) result_ = template_element_12(builder_, level_ + 1);
    if (!result_) result_ = template_element_13(builder_, level_ + 1);
    if (!result_) result_ = template_element_14(builder_, level_ + 1);
    if (!result_) result_ = template_element_15(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, PARSED_LIST_CONSTANT);
    if (!result_) result_ = consumeToken(builder_, PARSED_VECTOR_CONSTANT);
    if (!result_) result_ = substitution(builder_, level_ + 1);
    if (result_) {
      marker_.done(TEMPLATE_ELEMENT);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // LPAREN template_opt RPAREN
  private static boolean template_element_11(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "template_element_11")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, LPAREN, TEMPLATE_OPT, RPAREN);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // LBRACKET template_opt RBRACKET
  private static boolean template_element_12(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "template_element_12")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, LBRACKET, TEMPLATE_OPT, RBRACKET);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // LBRACE template_opt RBRACE
  private static boolean template_element_13(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "template_element_13")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, LBRACE, TEMPLATE_OPT, RBRACE);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // HASH_PAREN template_opt RPAREN
  private static boolean template_element_14(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "template_element_14")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, HASH_PAREN, TEMPLATE_OPT, RPAREN);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // HASH_BRACKET template_opt RBRACKET
  private static boolean template_element_15(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "template_element_15")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, HASH_BRACKET, TEMPLATE_OPT, RBRACKET);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // name | SYMBOL | NUMBER | CHARACTER_LITERAL | STRING | operator | punctuation | hash_word
  public static boolean token(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "token")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<token>");
    result_ = name(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, SYMBOL);
    if (!result_) result_ = consumeToken(builder_, NUMBER);
    if (!result_) result_ = consumeToken(builder_, CHARACTER_LITERAL);
    if (!result_) result_ = consumeToken(builder_, STRING);
    if (!result_) result_ = operator(builder_, level_ + 1);
    if (!result_) result_ = punctuation(builder_, level_ + 1);
    if (!result_) result_ = hash_word(builder_, level_ + 1);
    if (result_) {
      marker_.done(TOKEN);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // UNARY_OPERATOR_ONLY | UNARY_AND_BINARY_OPERATOR
  public static boolean unary_operator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unary_operator")) return false;
    if (!nextTokenIs(builder_, UNARY_AND_BINARY_OPERATOR) && !nextTokenIs(builder_, UNARY_OPERATOR_ONLY)
        && replaceVariants(builder_, 2, "<unary operator>")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<unary operator>");
    result_ = consumeToken(builder_, UNARY_OPERATOR_ONLY);
    if (!result_) result_ = consumeToken(builder_, UNARY_AND_BINARY_OPERATOR);
    if (result_) {
      marker_.done(UNARY_OPERATOR);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // SYMBOL | unparenthesized_operand | unary_operator operand
  public static boolean unparenthesized_binary_operand(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unparenthesized_binary_operand")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<unparenthesized binary operand>");
    result_ = consumeToken(builder_, SYMBOL);
    if (!result_) result_ = unparenthesized_operand(builder_, level_ + 1);
    if (!result_) result_ = unparenthesized_binary_operand_2(builder_, level_ + 1);
    if (result_) {
      marker_.done(UNPARENTHESIZED_BINARY_OPERAND);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // unary_operator operand
  private static boolean unparenthesized_binary_operand_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unparenthesized_binary_operand_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = unary_operator(builder_, level_ + 1);
    result_ = result_ && operand(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // unparenthesized_binary_operand | unparenthesized_expression binary_operator binary_operand
  public static boolean unparenthesized_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unparenthesized_expression")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<unparenthesized expression>");
    result_ = unparenthesized_binary_operand(builder_, level_ + 1);
    if (!result_) result_ = unparenthesized_expression_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(UNPARENTHESIZED_EXPRESSION);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // unparenthesized_expression binary_operator binary_operand
  private static boolean unparenthesized_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unparenthesized_expression_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = unparenthesized_expression(builder_, level_ + 1);
    result_ = result_ && binary_operator(builder_, level_ + 1);
    result_ = result_ && binary_operand(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // literal
  //     | variable_name
  //     | function_macro_call
  //     | statement
  //     | PARSED_FUNCTION_CALL
  //     | PARSED_MACRO_CALL
  public static boolean unparenthesized_leaf(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unparenthesized_leaf")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<unparenthesized leaf>");
    result_ = literal(builder_, level_ + 1);
    if (!result_) result_ = variable_name(builder_, level_ + 1);
    if (!result_) result_ = function_macro_call(builder_, level_ + 1);
    if (!result_) result_ = statement(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, PARSED_FUNCTION_CALL);
    if (!result_) result_ = consumeToken(builder_, PARSED_MACRO_CALL);
    if (result_) {
      marker_.done(UNPARENTHESIZED_LEAF);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // unparenthesized_operand operand_tail | unparenthesized_leaf
  public static boolean unparenthesized_operand(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unparenthesized_operand")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<unparenthesized operand>");
    result_ = unparenthesized_operand_0(builder_, level_ + 1);
    if (!result_) result_ = unparenthesized_leaf(builder_, level_ + 1);
    if (result_) {
      marker_.done(UNPARENTHESIZED_OPERAND);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // unparenthesized_operand operand_tail
  private static boolean unparenthesized_operand_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unparenthesized_operand_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = unparenthesized_operand(builder_, level_ + 1);
    result_ = result_ && operand_tail(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // unreserved_word | escaped_name
  public static boolean unreserved_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unreserved_name")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<unreserved name>");
    result_ = unreserved_word(builder_, level_ + 1);
    if (!result_) result_ = escaped_name(builder_, level_ + 1);
    if (result_) {
      marker_.done(UNRESERVED_NAME);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // NONDEFINING_NONEXPRESSION_WORD
  public static boolean unreserved_word(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unreserved_word")) return false;
    if (!nextTokenIs(builder_, NONDEFINING_NONEXPRESSION_WORD)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, NONDEFINING_NONEXPRESSION_WORD);
    if (result_) {
      marker_.done(UNRESERVED_WORD);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // basic_fragment
  public static boolean value(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "value")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<value>");
    result_ = basic_fragment(builder_, level_ + 1);
    if (result_) {
      marker_.done(VALUE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // (header_value? CRLF)*
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

  // header_value? CRLF
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

  // header_value?
  private static boolean values_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "values_0_0")) return false;
    header_value(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // variables
  //     | variables COMMA HASH_REST variable
  //     | HASH_REST variable
  public static boolean values_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "values_list")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<values list>");
    result_ = variables(builder_, level_ + 1);
    if (!result_) result_ = values_list_1(builder_, level_ + 1);
    if (!result_) result_ = values_list_2(builder_, level_ + 1);
    if (result_) {
      marker_.done(VALUES_LIST);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // variables COMMA HASH_REST variable
  private static boolean values_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "values_list_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = variables(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, COMMA, HASH_REST);
    result_ = result_ && variable(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // HASH_REST variable
  private static boolean values_list_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "values_list_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, HASH_REST);
    result_ = result_ && variable(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // variable_name | variable_name COLON_COLON operand
  public static boolean variable(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<variable>");
    result_ = variable_name(builder_, level_ + 1);
    if (!result_) result_ = variable_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(VARIABLE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // variable_name COLON_COLON operand
  private static boolean variable_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = variable_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON_COLON);
    result_ = result_ && operand(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // variables | variables COMMA HASH_REST variable_name | HASH_REST variable_name
  public static boolean variable_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_list")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<variable list>");
    result_ = variables(builder_, level_ + 1);
    if (!result_) result_ = variable_list_1(builder_, level_ + 1);
    if (!result_) result_ = variable_list_2(builder_, level_ + 1);
    if (result_) {
      marker_.done(VARIABLE_LIST);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // variables COMMA HASH_REST variable_name
  private static boolean variable_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_list_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = variables(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, COMMA, HASH_REST);
    result_ = result_ && variable_name(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // HASH_REST variable_name
  private static boolean variable_list_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_list_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, HASH_REST);
    result_ = result_ && variable_name(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // ordinary_name
  public static boolean variable_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_name")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<variable name>");
    result_ = ordinary_name(builder_, level_ + 1);
    if (result_) {
      marker_.done(VARIABLE_NAME);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // variable | variables COMMA variable
  public static boolean variables(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variables")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<variables>");
    result_ = variable(builder_, level_ + 1);
    if (!result_) result_ = variables_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(VARIABLES);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // variables COMMA variable
  private static boolean variables_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variables_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = variables(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && variable(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

}
