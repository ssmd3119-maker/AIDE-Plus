package org.codehaus.groovy.ast;

/* loaded from: classes.dex */
public class DynamicVariable implements Variable {
    private String WB;

    @Override // org.codehaus.groovy.ast.Variable
    public boolean DW() {
        return true;
    }

    @Override // org.codehaus.groovy.ast.Variable
    public String getName() {
        return this.WB;
    }

    @Override // org.codehaus.groovy.ast.Variable
    public ClassNode j6() {
        return ClassHelper.DW;
    }
}
