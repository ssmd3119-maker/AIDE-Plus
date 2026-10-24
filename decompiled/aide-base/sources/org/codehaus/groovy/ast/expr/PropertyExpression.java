package org.codehaus.groovy.ast.expr;

/* loaded from: classes.dex */
public class PropertyExpression extends Expression {
    private Expression AL;
    private Expression zh;

    public PropertyExpression(Expression expression, String str) {
        this(expression, new ConstantExpression(str), false);
    }

    public String toString() {
        return super.toString() + "[object: " + this.zh + " property: " + this.AL + "]";
    }

    public PropertyExpression(Expression expression, Expression expression2, boolean z) {
        this.zh = expression;
        this.AL = expression2;
    }
}
