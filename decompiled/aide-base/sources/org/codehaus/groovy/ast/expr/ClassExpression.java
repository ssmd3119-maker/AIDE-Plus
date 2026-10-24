package org.codehaus.groovy.ast.expr;

import org.codehaus.groovy.ast.ClassNode;

/* loaded from: classes.dex */
public class ClassExpression extends Expression {
    public ClassExpression(ClassNode classNode) {
        super.aM(classNode);
    }

    public String toString() {
        return super.toString() + "[type: " + j6().getName() + "]";
    }
}
