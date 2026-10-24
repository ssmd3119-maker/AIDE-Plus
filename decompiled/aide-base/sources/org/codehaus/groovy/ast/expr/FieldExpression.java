package org.codehaus.groovy.ast.expr;

import org.codehaus.groovy.ast.ClassNode;
import org.codehaus.groovy.ast.FieldNode;

/* loaded from: classes.dex */
public class FieldExpression extends Expression {
    private final FieldNode zh;

    @Override // org.codehaus.groovy.ast.expr.Expression
    public void aM(ClassNode classNode) {
        super.aM(classNode);
        this.zh.j3(classNode);
    }

    public String j3() {
        return this.zh.getName();
    }

    @Override // org.codehaus.groovy.ast.expr.Expression
    public ClassNode j6() {
        return this.zh.j6();
    }

    public String toString() {
        return "field(" + j6() + " " + j3() + ")";
    }
}
