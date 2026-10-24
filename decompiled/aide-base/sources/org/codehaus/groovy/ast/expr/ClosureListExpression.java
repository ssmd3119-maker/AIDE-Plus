package org.codehaus.groovy.ast.expr;

import java.util.ArrayList;
import java.util.List;
import org.codehaus.groovy.ast.VariableScope;

/* loaded from: classes.dex */
public class ClosureListExpression extends ListExpression {
    public ClosureListExpression(List<Expression> list) {
        super(list);
        new VariableScope();
    }

    public ClosureListExpression() {
        this(new ArrayList(3));
    }
}
