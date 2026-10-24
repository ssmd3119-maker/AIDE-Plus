package org.codehaus.groovy.ast;

import org.codehaus.groovy.ast.stmt.Statement;

/* loaded from: classes.dex */
public class InnerClassNode extends ClassNode {
    private ClassNode oy;

    @Override // org.codehaus.groovy.ast.ClassNode
    public ConstructorNode aM(int i, Parameter[] parameterArr, ClassNode[] classNodeArr, Statement statement) {
        return super.aM(i, parameterArr, classNodeArr, statement);
    }

    public ClassNode et() {
        return this.oy;
    }

    @Override // org.codehaus.groovy.ast.ClassNode
    public void j3(ConstructorNode constructorNode) {
        super.j3(constructorNode);
    }
}
