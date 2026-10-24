package org.codehaus.groovy.ast.expr;

/* loaded from: classes.dex */
public class MapEntryExpression extends Expression {
    private Expression AL;
    private Expression zh;

    public String toString() {
        return super.toString() + "(key: " + this.zh + ", value: " + this.AL + ")";
    }
}
