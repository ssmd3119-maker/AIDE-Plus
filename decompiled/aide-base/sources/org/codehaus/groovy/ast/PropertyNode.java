package org.codehaus.groovy.ast;

import groovyjarjarasm.asm.Opcodes;

/* loaded from: classes.dex */
public class PropertyNode extends AnnotatedNode implements Opcodes, Variable {
    private FieldNode k2;

    @Override // org.codehaus.groovy.ast.Variable
    public boolean DW() {
        return this.k2.DW();
    }

    @Override // org.codehaus.groovy.ast.Variable
    public String getName() {
        return this.k2.getName();
    }

    @Override // org.codehaus.groovy.ast.Variable
    public ClassNode j6() {
        return this.k2.j6();
    }
}
