// src/main/kotlin/com/jmcbutter/shopifyliquid/ShopifyLiquidParserDefinition.kt
package com.jmcbutter.shopifyliquid

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import com.jmcbutter.shopifyliquid.lexer.ShopifyLiquidLexerAdapter
import com.jmcbutter.shopifyliquid.parser.ShopifyLiquidParser
import com.jmcbutter.shopifyliquid.psi.ShopifyLiquidFile
import com.jmcbutter.shopifyliquid.psi.ShopifyLiquidTypes

// --- CORRECTED IMPLEMENTATION ---
// These are now top-level, file-private constants. They are instantiated
// lazily and safely, complying with the platform's best practices.
private val FILE = IFileElementType(ShopifyLiquidLanguage)
private val WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE)
private val COMMENTS = TokenSet.create(
    ShopifyLiquidTypes.COMMENT_CONTENT,
    ShopifyLiquidTypes.COMMENT_START,
    ShopifyLiquidTypes.COMMENT_END
)
// --- END CORRECTION ---


class ShopifyLiquidParserDefinition : ParserDefinition {

    override fun createLexer(project: Project?): Lexer = ShopifyLiquidLexerAdapter()

    override fun createParser(project: Project?): PsiParser = ShopifyLiquidParser()

    // These methods now refer to the top-level constants.
    override fun getFileNodeType(): IFileElementType = FILE

    override fun getCommentTokens(): TokenSet = COMMENTS

    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY

    override fun getWhitespaceTokens(): TokenSet = WHITE_SPACES

    override fun createElement(node: ASTNode?): PsiElement = ShopifyLiquidTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile = ShopifyLiquidFile(viewProvider)

    // The companion object is no longer needed for these constants.
}