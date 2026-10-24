package org.codehaus.groovy.control;

import groovy.lang.GroovyClassLoader;
import groovy.transform.CompilationUnitAware;
import groovyjarjarasm.asm.ClassWriter;
import java.security.CodeSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import org.codehaus.groovy.ast.CompileUnit;
import org.codehaus.groovy.classgen.Verifier;
import org.codehaus.groovy.control.customizers.CompilationCustomizer;
import org.codehaus.groovy.transform.ASTTransformationVisitor;

/* loaded from: classes.dex */
public class CompilationUnit extends ProcessingUnit {
    private SourceUnitOperation EQ;
    protected Map<String, SourceUnit> Hw;
    private SourceUnitOperation J0;
    private PrimaryClassNodeOperation J8;
    LinkedList[] VH;
    protected boolean Zo;
    LinkedList[] gn;
    private PrimaryClassNodeOperation tp;
    private final SourceUnitOperation u7;
    protected Verifier v5;
    private GroovyClassOperation we;

    /* renamed from: org.codehaus.groovy.control.CompilationUnit$10, reason: invalid class name */
    public class AnonymousClass10 implements Iterator<SourceUnit> {
        Iterator<String> WB;
        final /* synthetic */ CompilationUnit mb;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.WB.hasNext();
        }

        @Override // java.util.Iterator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public SourceUnit next() {
            return this.mb.Hw.get(this.WB.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: org.codehaus.groovy.control.CompilationUnit$17, reason: invalid class name */
    public class AnonymousClass17 extends ClassWriter {
    }

    /* renamed from: org.codehaus.groovy.control.CompilationUnit$9, reason: invalid class name */
    public class AnonymousClass9 extends PrimaryClassNodeOperation {
    }

    public static abstract class ClassgenCallback {
    }

    public static abstract class GroovyClassOperation {
    }

    public static abstract class PrimaryClassNodeOperation {
    }

    public static abstract class ProgressCallback {
    }

    public static abstract class SourceUnitOperation {
    }

    public CompilationUnit() {
        this(null, null, null);
    }

    private void u7(CompilerConfiguration compilerConfiguration, GroovyClassLoader groovyClassLoader) {
    }

    public void VH(PrimaryClassNodeOperation primaryClassNodeOperation, int i) {
        if (i >= 0 && i <= 9) {
            this.VH[i].add(primaryClassNodeOperation);
            return;
        }
        throw new IllegalArgumentException("phase " + i + " is unknown");
    }

    public void Zo(GroovyClassOperation groovyClassOperation) {
        this.VH[8].addFirst(groovyClassOperation);
    }

    public void gn(SourceUnitOperation sourceUnitOperation, int i) {
        if (i >= 0 && i <= 9) {
            this.VH[i].add(sourceUnitOperation);
            return;
        }
        throw new IllegalArgumentException("phase " + i + " is unknown");
    }

    @Override // org.codehaus.groovy.control.ProcessingUnit
    public void j6(CompilerConfiguration compilerConfiguration) {
        super.j6(compilerConfiguration);
        compilerConfiguration.DW();
        if (!this.Zo) {
            GroovyClassLoader groovyClassLoader = this.DW;
            if (groovyClassLoader instanceof GroovyClassLoader) {
                u7(compilerConfiguration, groovyClassLoader);
            }
        }
        this.Zo = true;
    }

    public CompilationUnit(CompilerConfiguration compilerConfiguration, CodeSource codeSource, GroovyClassLoader groovyClassLoader) {
        this(compilerConfiguration, codeSource, groovyClassLoader, null);
    }

    public CompilationUnit(CompilerConfiguration compilerConfiguration, CodeSource codeSource, GroovyClassLoader groovyClassLoader, GroovyClassLoader groovyClassLoader2) {
        super(compilerConfiguration, groovyClassLoader, null);
        this.u7 = new SourceUnitOperation(this) { // from class: org.codehaus.groovy.control.CompilationUnit.11
        };
        this.tp = new PrimaryClassNodeOperation(this) { // from class: org.codehaus.groovy.control.CompilationUnit.12
        };
        this.EQ = new SourceUnitOperation(this) { // from class: org.codehaus.groovy.control.CompilationUnit.13
        };
        this.we = new GroovyClassOperation(this) { // from class: org.codehaus.groovy.control.CompilationUnit.14
        };
        this.J0 = new SourceUnitOperation(this) { // from class: org.codehaus.groovy.control.CompilationUnit.15
        };
        this.J8 = new PrimaryClassNodeOperation(this) { // from class: org.codehaus.groovy.control.CompilationUnit.16
        };
        new SourceUnitOperation(this) { // from class: org.codehaus.groovy.control.CompilationUnit.18
        };
        new ASTTransformationsContext(this, groovyClassLoader2);
        new ArrayList();
        new LinkedList();
        this.Hw = new HashMap();
        new HashMap();
        new HashMap();
        new HashMap();
        new CompileUnit(this.DW, codeSource, this.j6);
        new ArrayList();
        this.v5 = new Verifier();
        new ResolveVisitor(this);
        new StaticImportVisitor();
        new OptimizerVisitor(this);
        this.VH = new LinkedList[10];
        this.gn = new LinkedList[10];
        int i = 0;
        while (true) {
            LinkedList[] linkedListArr = this.VH;
            if (i >= linkedListArr.length) {
                break;
            }
            linkedListArr[i] = new LinkedList();
            this.gn[i] = new LinkedList();
            i++;
        }
        gn(new SourceUnitOperation(this) { // from class: org.codehaus.groovy.control.CompilationUnit.1
        }, 2);
        gn(this.EQ, 3);
        VH(new PrimaryClassNodeOperation(this) { // from class: org.codehaus.groovy.control.CompilationUnit.2
        }, 3);
        gn(this.u7, 4);
        VH(this.tp, 4);
        VH(new PrimaryClassNodeOperation(this) { // from class: org.codehaus.groovy.control.CompilationUnit.3
        }, 4);
        VH(new PrimaryClassNodeOperation(this) { // from class: org.codehaus.groovy.control.CompilationUnit.4
        }, 5);
        gn(this.J0, 5);
        VH(this.J8, 7);
        Zo(this.we);
        VH(new PrimaryClassNodeOperation(this) { // from class: org.codehaus.groovy.control.CompilationUnit.5
        }, 4);
        ASTTransformationVisitor.addPhaseOperations(this);
        VH(new PrimaryClassNodeOperation(this) { // from class: org.codehaus.groovy.control.CompilationUnit.6
        }, 4);
        VH(new PrimaryClassNodeOperation(this) { // from class: org.codehaus.groovy.control.CompilationUnit.7
        }, 5);
        VH(new PrimaryClassNodeOperation(this) { // from class: org.codehaus.groovy.control.CompilationUnit.8
        }, 5);
        if (compilerConfiguration != null) {
            Iterator<CompilationCustomizer> it = compilerConfiguration.j6().iterator();
            while (it.hasNext()) {
                CompilationUnitAware compilationUnitAware = (CompilationCustomizer) it.next();
                if (compilationUnitAware instanceof CompilationUnitAware) {
                    compilationUnitAware.setCompilationUnit(this);
                }
                VH(compilationUnitAware, compilationUnitAware.j6().j6());
            }
        }
        new ClassNodeResolver();
    }
}
