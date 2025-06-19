package com.jmcbutter.shopifyliquid.psi

import com.intellij.psi.tree.IElementType
import com.jmcbutter.shopifyliquid.ShopifyLiquidLanguage
import org.jetbrains.annotations.NonNls
import org.jetbrains.annotations.NotNull

class ShopifyLiquidElementType(@NonNls @NotNull debugName: String) : IElementType(debugName, ShopifyLiquidLanguage)