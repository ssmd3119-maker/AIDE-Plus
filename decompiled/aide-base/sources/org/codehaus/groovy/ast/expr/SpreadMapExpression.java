package org.codehaus.groovy.ast.expr;

import org.codehaus.groovy.ast.ClassNode;

/* loaded from: classes.dex */
public class SpreadMapExpression extends Expression {
    private Expression zh;

    @Override // org.codehaus.groovy.ast.expr.Expression
    public ClassNode j6() {
        return this.zh.j6();
    }
}
