package org.codehaus.groovy.ast;

import org.codehaus.groovy.ast.stmt.Statement;

/* loaded from: classes.dex */
public class ConstructorNode extends MethodNode {
    public ConstructorNode(int i, Parameter[] parameterArr, ClassNode[] classNodeArr, Statement statement) {
        super("<init>", i, ClassHelper.Hw, parameterArr, classNodeArr, statement);
        VariableScope variableScope = new VariableScope();
        for (Parameter parameter : parameterArr) {
            variableScope.j6(parameter);
        }
        cb(variableScope);
    }
}
