package org.codehaus.groovy.ast.expr;

import java.util.ArrayList;
import java.util.List;
import org.codehaus.groovy.ast.ClassHelper;

/* loaded from: classes.dex */
public class ListExpression extends Expression {
    private List<Expression> zh;

    public ListExpression() {
        this(new ArrayList());
    }

    public void j3(Expression expression) {
        this.zh.add(expression);
    }

    public String toString() {
        return super.toString() + this.zh;
    }

    public ListExpression(List<Expression> list) {
        this.zh = list;
        aM(ClassHelper.VH);
    }
}
