// This is a generated file. Not intended for manual editing.
package com.jmcbutter.shopifyliquid.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.jmcbutter.shopifyliquid.psi.ShopifyLiquidTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.jmcbutter.shopifyliquid.psi.*;

public abstract class ShopifyLiquidStatementImpl extends ASTWrapperPsiElement implements ShopifyLiquidStatement {

  public ShopifyLiquidStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ShopifyLiquidVisitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ShopifyLiquidVisitor) accept((ShopifyLiquidVisitor)visitor);
    else super.accept(visitor);
  }

}
