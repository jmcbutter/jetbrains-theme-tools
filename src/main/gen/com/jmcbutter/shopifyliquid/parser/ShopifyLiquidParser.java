// This is a generated file. Not intended for manual editing.
package com.jmcbutter.shopifyliquid.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.jmcbutter.shopifyliquid.psi.ShopifyLiquidTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class ShopifyLiquidParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return liquidFile(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(OUTPUT_STATEMENT, STATEMENT, TAG_STATEMENT),
  };

  /* ********************************************************** */
  // COMMENT_START COMMENT_CONTENT? COMMENT_END
  public static boolean COMMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COMMENT")) return false;
    if (!nextTokenIs(b, COMMENT_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMENT_START);
    r = r && COMMENT_1(b, l + 1);
    r = r && consumeToken(b, COMMENT_END);
    exit_section_(b, m, COMMENT, r);
    return r;
  }

  // COMMENT_CONTENT?
  private static boolean COMMENT_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COMMENT_1")) return false;
    consumeToken(b, COMMENT_CONTENT);
    return true;
  }

  /* ********************************************************** */
  // CONTENT
  static boolean content(PsiBuilder b, int l) {
    return consumeToken(b, CONTENT);
  }

  /* ********************************************************** */
  // COMMENT | statement  | TEXT
  static boolean item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item")) return false;
    boolean r;
    r = COMMENT(b, l + 1);
    if (!r) r = statement(b, l + 1);
    if (!r) r = consumeToken(b, TEXT);
    return r;
  }

  /* ********************************************************** */
  // item*
  static boolean liquidFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liquidFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "liquidFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // OUTPUT_START content? OUTPUT_END
  public static boolean output_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "output_statement")) return false;
    if (!nextTokenIs(b, OUTPUT_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OUTPUT_START);
    r = r && output_statement_1(b, l + 1);
    r = r && consumeToken(b, OUTPUT_END);
    exit_section_(b, m, OUTPUT_STATEMENT, r);
    return r;
  }

  // content?
  private static boolean output_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "output_statement_1")) return false;
    content(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // output_statement | tag_statement
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    if (!nextTokenIs(b, "<statement>", OUTPUT_START, TAG_START)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, STATEMENT, "<statement>");
    r = output_statement(b, l + 1);
    if (!r) r = tag_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TAG_START content? TAG_END
  public static boolean tag_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tag_statement")) return false;
    if (!nextTokenIs(b, TAG_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TAG_START);
    r = r && tag_statement_1(b, l + 1);
    r = r && consumeToken(b, TAG_END);
    exit_section_(b, m, TAG_STATEMENT, r);
    return r;
  }

  // content?
  private static boolean tag_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tag_statement_1")) return false;
    content(b, l + 1);
    return true;
  }

}
