package com.jmcbutter.shopifyliquid.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.jmcbutter.shopifyliquid.ShopifyLiquidFileType
import com.jmcbutter.shopifyliquid.ShopifyLiquidLanguage

class ShopifyLiquidFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, ShopifyLiquidLanguage) {
    override fun getFileType(): FileType = ShopifyLiquidFileType
    override fun toString(): String = "Shopify Liquid File"
}