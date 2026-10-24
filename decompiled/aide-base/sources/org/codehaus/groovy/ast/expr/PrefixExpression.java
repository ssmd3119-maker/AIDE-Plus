package org.codehaus.groovy.ast.expr;

import org.codehaus.groovy.ast.ClassNode;
import org.codehaus.groovy.syntax.Token;

/* loaded from: classes.dex */
public class PrefixExpression extends Expression {
    private Expression AL;
    private Token zh;

    @Override // org.codehaus.groovy.ast.expr.Expression
    public ClassNode j6() {
        return this.AL.j6();
    }

    public String toString() {
        return super.toString() + "[" + this.zh + this.AL + "]";
    }
}
