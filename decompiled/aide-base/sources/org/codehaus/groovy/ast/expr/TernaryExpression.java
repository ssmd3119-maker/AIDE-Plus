package org.codehaus.groovy.ast.expr;

import org.codehaus.groovy.ast.ClassHelper;
import org.codehaus.groovy.ast.ClassNode;

/* loaded from: classes.dex */
public class TernaryExpression extends Expression {
    private Expression AL;
    private Expression w9;
    private BooleanExpression zh;

    @Override // org.codehaus.groovy.ast.expr.Expression
    public ClassNode j6() {
        return ClassHelper.FH;
    }

    public String toString() {
        return super.toString() + "[" + this.zh + " ? " + this.AL + " : " + this.w9 + "]";
    }
}
