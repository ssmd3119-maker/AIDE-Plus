package org.codehaus.groovy.ast.stmt;

import org.codehaus.groovy.ast.expr.Expression;

/* loaded from: classes.dex */
public class CaseStatement extends Statement {
    private Expression k2;
    private Statement qp;

    public String toString() {
        return super.toString() + "[expression: " + this.k2 + "; code: " + this.qp + "]";
    }
}
