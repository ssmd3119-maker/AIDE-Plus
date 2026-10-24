package org.codehaus.groovy.ast.expr;

import org.codehaus.groovy.ast.ClassNode;

/* loaded from: classes.dex */
public class CastExpression extends Expression {
    private final Expression zh;

    @Override // org.codehaus.groovy.ast.expr.Expression
    public void aM(ClassNode classNode) {
        super.aM(classNode);
    }

    public String toString() {
        return super.toString() + "[(" + j6().getName() + ") " + this.zh + "]";
    }
}
