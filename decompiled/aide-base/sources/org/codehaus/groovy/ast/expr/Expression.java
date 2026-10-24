package org.codehaus.groovy.ast.expr;

import org.codehaus.groovy.ast.AnnotatedNode;
import org.codehaus.groovy.ast.ClassHelper;
import org.codehaus.groovy.ast.ClassNode;

/* loaded from: classes.dex */
public abstract class Expression extends AnnotatedNode {
    private ClassNode k2 = ClassHelper.DW;

    public void aM(ClassNode classNode) {
        this.k2 = classNode;
    }

    public ClassNode j6() {
        return this.k2;
    }
}
