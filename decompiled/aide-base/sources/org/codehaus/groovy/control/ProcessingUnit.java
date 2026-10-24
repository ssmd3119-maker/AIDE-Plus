package org.codehaus.groovy.control;

import groovy.lang.GroovyClassLoader;

/* loaded from: classes.dex */
public abstract class ProcessingUnit {
    protected GroovyClassLoader DW;
    protected ErrorCollector FH;
    protected CompilerConfiguration j6;

    public ProcessingUnit(CompilerConfiguration compilerConfiguration, GroovyClassLoader groovyClassLoader, ErrorCollector errorCollector) {
        this.j6 = compilerConfiguration;
        v5(groovyClassLoader);
        j6(compilerConfiguration == null ? new CompilerConfiguration() : compilerConfiguration);
        this.FH = errorCollector == null ? new ErrorCollector(FH()) : errorCollector;
    }

    public GroovyClassLoader DW() {
        return this.DW;
    }

    public CompilerConfiguration FH() {
        return this.j6;
    }

    public ErrorCollector Hw() {
        return this.FH;
    }

    public void j6(CompilerConfiguration compilerConfiguration) {
        this.j6 = compilerConfiguration;
    }

    public void v5(GroovyClassLoader groovyClassLoader) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            contextClassLoader = ProcessingUnit.class.getClassLoader();
        }
        if (groovyClassLoader == null) {
            groovyClassLoader = new GroovyClassLoader(contextClassLoader, this.j6);
        }
        this.DW = groovyClassLoader;
    }
}
