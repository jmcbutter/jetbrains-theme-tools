// This is a generated file. Not intended for manual editing.
package com.jmcbutter.shopifyliquid.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class ShopifyLiquidVisitor extends PsiElementVisitor {

  public void visitComment(@NotNull ShopifyLiquidComment o) {
    visitPsiElement(o);
  }

  public void visitOutputStatement(@NotNull ShopifyLiquidOutputStatement o) {
    visitStatement(o);
    // visitStatement(o);
  }

  public void visitStatement(@NotNull ShopifyLiquidStatement o) {
    visitPsiElement(o);
  }

  public void visitTagStatement(@NotNull ShopifyLiquidTagStatement o) {
    visitStatement(o);
    // visitStatement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
