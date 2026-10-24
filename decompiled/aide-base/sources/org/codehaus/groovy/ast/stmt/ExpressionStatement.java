package org.codehaus.groovy.ast.stmt;

import org.codehaus.groovy.ast.expr.Expression;

/* loaded from: classes.dex */
public class ExpressionStatement extends Statement {
    private Expression qp;

    public String toString() {
        return super.toString() + "[expression:" + this.qp + "]";
    }
}
