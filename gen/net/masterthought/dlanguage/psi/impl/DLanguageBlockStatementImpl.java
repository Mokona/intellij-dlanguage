// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static net.masterthought.dlanguage.psi.DLanguageTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import net.masterthought.dlanguage.psi.*;

public class DLanguageBlockStatementImpl extends ASTWrapperPsiElement implements DLanguageBlockStatement {

  public DLanguageBlockStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DLanguageVisitor visitor) {
    visitor.visitBlockStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLanguageVisitor) accept((DLanguageVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLanguageStatementList getStatementList() {
    return PsiTreeUtil.getChildOfType(this, DLanguageStatementList.class);
  }

  @Override
  @NotNull
  public PsiElement getOpBracesLeft() {
    return notNullChild(findChildByType(OP_BRACES_LEFT));
  }

  @Override
  @NotNull
  public PsiElement getOpBracesRight() {
    return notNullChild(findChildByType(OP_BRACES_RIGHT));
  }

}
