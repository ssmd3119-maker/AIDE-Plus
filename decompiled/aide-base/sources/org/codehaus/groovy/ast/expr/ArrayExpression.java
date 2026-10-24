package org.codehaus.groovy.ast.expr;

import java.util.List;

/* loaded from: classes.dex */
public class ArrayExpression extends Expression {
    private List<Expression> zh;

    public String toString() {
        return super.toString() + this.zh;
    }
}
