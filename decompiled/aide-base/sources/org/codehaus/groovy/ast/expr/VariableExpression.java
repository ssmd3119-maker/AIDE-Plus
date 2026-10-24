package org.codehaus.groovy.ast.expr;

import org.codehaus.groovy.ast.ClassHelper;
import org.codehaus.groovy.ast.ClassNode;
import org.codehaus.groovy.ast.Variable;

/* loaded from: classes.dex */
public class VariableExpression extends Expression implements Variable {
    private boolean AL = false;
    private Variable w9;
    private String zh;

    static {
        new VariableExpression("this", ClassHelper.DW);
        new VariableExpression("super", ClassHelper.DW);
    }

    public VariableExpression(String str, ClassNode classNode) {
        this.zh = str;
        aM(ClassHelper.j6(classNode));
    }

    @Override // org.codehaus.groovy.ast.Variable
    public boolean DW() {
        Variable variable = this.w9;
        return (variable == null || variable == this) ? this.AL : variable.DW();
    }

    @Override // org.codehaus.groovy.ast.expr.Expression
    public void aM(ClassNode classNode) {
        super.aM(classNode);
        this.AL = (ClassHelper.DW == classNode) | this.AL;
    }

    @Override // org.codehaus.groovy.ast.Variable
    public String getName() {
        return this.zh;
    }

    @Override // org.codehaus.groovy.ast.expr.Expression
    public ClassNode j6() {
        Variable variable = this.w9;
        return (variable == null || variable == this) ? super.j6() : variable.j6();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[variable: ");
        sb.append(this.zh);
        if (DW()) {
            str = "";
        } else {
            str = " type: " + j6();
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
