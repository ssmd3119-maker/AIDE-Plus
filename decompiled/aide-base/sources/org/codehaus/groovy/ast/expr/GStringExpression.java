package org.codehaus.groovy.ast.expr;

import java.util.List;

/* loaded from: classes.dex */
public class GStringExpression extends Expression {
    private List<Expression> AL;
    private List<ConstantExpression> zh;

    public String toString() {
        return super.toString() + "[strings: " + this.zh + " values: " + this.AL + "]";
    }
}
