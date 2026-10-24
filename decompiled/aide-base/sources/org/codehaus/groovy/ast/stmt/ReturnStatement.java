package org.codehaus.groovy.ast.stmt;

import org.codehaus.groovy.ast.expr.ConstantExpression;
import org.codehaus.groovy.ast.expr.Expression;

/* loaded from: classes.dex */
public class ReturnStatement extends Statement {
    static {
        new ReturnStatement(ConstantExpression.AL);
    }

    public ReturnStatement(Expression expression) {
    }
}
