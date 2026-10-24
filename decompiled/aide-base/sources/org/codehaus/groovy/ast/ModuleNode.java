package org.codehaus.groovy.ast;

import groovyjarjarasm.asm.Opcodes;
import org.codehaus.groovy.control.SourceUnit;

/* loaded from: classes.dex */
public class ModuleNode extends ASTNode implements Opcodes {
    private PackageNode k2;
    private CompileUnit qp;
    private transient SourceUnit zh;

    public SourceUnit EQ() {
        return this.zh;
    }

    public PackageNode J8() {
        return this.k2;
    }

    public CompileUnit Ws() {
        return this.qp;
    }
}
