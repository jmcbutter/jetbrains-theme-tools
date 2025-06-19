// This is a generated file. Not intended for manual editing.
package com.jmcbutter.shopifyliquid.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.jmcbutter.shopifyliquid.psi.impl.*;

public interface ShopifyLiquidTypes {

  IElementType COMMENT = new ShopifyLiquidElementType("COMMENT");
  IElementType OUTPUT_STATEMENT = new ShopifyLiquidElementType("OUTPUT_STATEMENT");
  IElementType STATEMENT = new ShopifyLiquidElementType("STATEMENT");
  IElementType TAG_STATEMENT = new ShopifyLiquidElementType("TAG_STATEMENT");

  IElementType COMMENT_CONTENT = new ShopifyLiquidTokenType("COMMENT_CONTENT");
  IElementType COMMENT_END = new ShopifyLiquidTokenType("#}");
  IElementType COMMENT_START = new ShopifyLiquidTokenType("{#");
  IElementType CONTENT = new ShopifyLiquidTokenType("CONTENT");
  IElementType OUTPUT_END = new ShopifyLiquidTokenType("}}");
  IElementType OUTPUT_START = new ShopifyLiquidTokenType("{{");
  IElementType TAG_END = new ShopifyLiquidTokenType("%}");
  IElementType TAG_START = new ShopifyLiquidTokenType("{%");
  IElementType TEXT = new ShopifyLiquidTokenType("TEXT");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == COMMENT) {
        return new ShopifyLiquidCommentImpl(node);
      }
      else if (type == OUTPUT_STATEMENT) {
        return new ShopifyLiquidOutputStatementImpl(node);
      }
      else if (type == TAG_STATEMENT) {
        return new ShopifyLiquidTagStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
