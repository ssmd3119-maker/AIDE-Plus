package org.codehaus.groovy.ast.stmt;

import java.util.ArrayList;
import java.util.List;
import org.codehaus.groovy.ast.VariableScope;

/* loaded from: classes.dex */
public class BlockStatement extends Statement {
    private List<Statement> qp;

    public BlockStatement() {
        this(new ArrayList(), new VariableScope());
    }

    public String toString() {
        return super.toString() + this.qp;
    }

    public BlockStatement(List<Statement> list, VariableScope variableScope) {
        this.qp = new ArrayList();
        this.qp = list;
    }
}
