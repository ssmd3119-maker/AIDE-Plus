package org.codehaus.groovy.ast;

import groovyjarjarasm.asm.Opcodes;
import org.codehaus.groovy.ast.expr.Expression;

/* loaded from: classes.dex */
public class FieldNode extends AnnotatedNode implements Opcodes, Variable {
    private boolean AL;
    private String k2;
    private ClassNode zh;

    public FieldNode(String str, int i, ClassNode classNode, ClassNode classNode2, Expression expression) {
        ClassNode classNode3 = ClassHelper.DW;
        this.k2 = str;
        this.zh = classNode;
        if (classNode == classNode3 && expression != null) {
            j3(expression.j6());
        }
        j3(classNode);
    }

    @Override // org.codehaus.groovy.ast.Variable
    public boolean DW() {
        return this.AL;
    }

    public void aM(ClassNode classNode) {
    }

    @Override // org.codehaus.groovy.ast.Variable
    public String getName() {
        return this.k2;
    }

    public void j3(ClassNode classNode) {
        this.zh = classNode;
        this.AL = (classNode == ClassHelper.DW) | this.AL;
    }

    @Override // org.codehaus.groovy.ast.Variable
    public ClassNode j6() {
        return this.zh;
    }
}
