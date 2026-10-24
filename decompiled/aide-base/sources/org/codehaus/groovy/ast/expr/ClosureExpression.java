package org.codehaus.groovy.ast.expr;

import org.codehaus.groovy.ast.Parameter;
import org.codehaus.groovy.ast.stmt.Statement;
import org.codehaus.groovy.runtime.InvokerHelper;

/* loaded from: classes.dex */
public class ClosureExpression extends Expression {
    private Statement AL;
    private Parameter[] zh;

    public String toString() {
        return super.toString() + InvokerHelper.toString(this.zh) + "{ " + this.AL + " }";
    }
}
