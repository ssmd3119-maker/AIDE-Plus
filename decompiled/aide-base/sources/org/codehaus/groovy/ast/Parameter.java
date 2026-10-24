package org.codehaus.groovy.ast;

/* loaded from: classes.dex */
public class Parameter extends AnnotatedNode implements Variable {
    public static final Parameter[] hK = new Parameter[0];
    private boolean AL;
    private ClassNode k2;
    private boolean w9;
    private final String zh;

    public Parameter(ClassNode classNode, String str) {
        ClassNode classNode2 = ClassHelper.DW;
        this.zh = str;
        Mr(classNode);
        this.w9 = false;
    }

    @Override // org.codehaus.groovy.ast.Variable
    public boolean DW() {
        return this.AL;
    }

    public void Mr(ClassNode classNode) {
        this.k2 = classNode;
        this.AL = (classNode == ClassHelper.DW) | this.AL;
    }

    public boolean aM() {
        return this.w9;
    }

    @Override // org.codehaus.groovy.ast.Variable
    public String getName() {
        return this.zh;
    }

    public void j3(boolean z) {
    }

    @Override // org.codehaus.groovy.ast.Variable
    public ClassNode j6() {
        return this.k2;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[name:");
        sb.append(this.zh);
        if (this.k2 == null) {
            str = "";
        } else {
            str = " type: " + this.k2.getName();
        }
        sb.append(str);
        sb.append(", hasDefaultValue: ");
        sb.append(aM());
        sb.append("]");
        return sb.toString();
    }
}
