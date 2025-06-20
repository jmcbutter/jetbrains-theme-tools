package com.jmcbutter.shopifyliquid
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon


object ShopifyLiquidFileType : LanguageFileType(ShopifyLiquidLanguage) {
    override fun getName(): String = "Liquid File"
    override fun getDescription(): String = "Shopify Liquid template file"
    override fun getDefaultExtension(): String = "liquid"
    override fun getIcon(): Icon = ShopifyLiquidIcons().FILE
}