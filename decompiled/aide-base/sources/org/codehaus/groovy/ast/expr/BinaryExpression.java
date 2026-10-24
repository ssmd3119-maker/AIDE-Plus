package org.codehaus.groovy.ast.expr;

import org.codehaus.groovy.syntax.Token;

/* loaded from: classes.dex */
public class BinaryExpression extends Expression {
    private Expression AL;
    private final Token w9;
    private Expression zh;

    public String toString() {
        return super.toString() + "[" + this.zh + this.w9 + this.AL + "]";
    }
}
