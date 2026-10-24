package org.codehaus.groovy.tools.javac;

import java.io.File;
import org.codehaus.groovy.control.CompilationUnit;
import org.codehaus.groovy.control.CompilerConfiguration;

/* loaded from: classes.dex */
public class JavaAwareCompilationUnit extends CompilationUnit {

    /* renamed from: org.codehaus.groovy.tools.javac.JavaAwareCompilationUnit$1, reason: invalid class name */
    public class AnonymousClass1 extends CompilationUnit.PrimaryClassNodeOperation {
    }

    /* renamed from: org.codehaus.groovy.tools.javac.JavaAwareCompilationUnit$2, reason: invalid class name */
    public class AnonymousClass2 extends CompilationUnit.PrimaryClassNodeOperation {
    }

    @Override // org.codehaus.groovy.control.CompilationUnit, org.codehaus.groovy.control.ProcessingUnit
    public void j6(CompilerConfiguration compilerConfiguration) {
        super.j6(compilerConfiguration);
        File fileHw = compilerConfiguration.Hw();
        if (fileHw != null) {
            DW().addClasspath(fileHw.getAbsolutePath());
        }
    }
}
