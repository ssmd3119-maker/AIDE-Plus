package org.codehaus.groovy.vmplugin;

import org.codehaus.groovy.ast.ClassNode;
import org.codehaus.groovy.ast.CompileUnit;

/* loaded from: classes.dex */
public interface VMPlugin {
    void DW(ClassNode classNode);

    void j6(CompileUnit compileUnit, ClassNode classNode);
}
