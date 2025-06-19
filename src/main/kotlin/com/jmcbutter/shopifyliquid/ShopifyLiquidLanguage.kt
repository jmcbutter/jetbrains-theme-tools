package com.jmcbutter.shopifyliquid
import com.intellij.lang.Language

object ShopifyLiquidLanguage: Language("ShopifyLiquid") {
    private fun readResolve(): Any = ShopifyLiquidLanguage
}