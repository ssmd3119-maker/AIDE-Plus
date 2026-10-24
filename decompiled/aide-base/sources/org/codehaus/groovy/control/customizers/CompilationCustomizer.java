package org.codehaus.groovy.control.customizers;

import org.codehaus.groovy.control.CompilationUnit;
import org.codehaus.groovy.control.CompilePhase;

/* loaded from: classes.dex */
public abstract class CompilationCustomizer extends CompilationUnit.PrimaryClassNodeOperation {
    private final CompilePhase j6;

    public CompilationCustomizer(CompilePhase compilePhase) {
        this.j6 = compilePhase;
    }

    public CompilePhase j6() {
        return this.j6;
    }
}
