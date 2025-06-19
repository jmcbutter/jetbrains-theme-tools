package com.jmcbutter.shopifyliquid

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import com.jmcbutter.shopifyliquid.lexer.ShopifyLiquidLexerAdapter
import com.jmcbutter.shopifyliquid.psi.ShopifyLiquidTypes

class ShopifyLiquidSyntaxHighlighter : SyntaxHighlighterBase() {
    companion object {
        val DELIMITER: TextAttributesKey = createTextAttributesKey("LIQUID_DELIMITER", DefaultLanguageHighlighterColors.KEYWORD)
        val COMMENT: TextAttributesKey = createTextAttributesKey("LIQUID_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
    }

    override fun getHighlightingLexer(): Lexer = ShopifyLiquidLexerAdapter()
    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        return when (tokenType) {
            ShopifyLiquidTypes.OUTPUT_START, ShopifyLiquidTypes.OUTPUT_END, ShopifyLiquidTypes.TAG_START, ShopifyLiquidTypes.TAG_END -> arrayOf(DELIMITER)
            ShopifyLiquidTypes.COMMENT_START, ShopifyLiquidTypes.COMMENT_END, ShopifyLiquidTypes.COMMENT_CONTENT -> arrayOf(COMMENT)
            else -> emptyArray()
        }
    }
}