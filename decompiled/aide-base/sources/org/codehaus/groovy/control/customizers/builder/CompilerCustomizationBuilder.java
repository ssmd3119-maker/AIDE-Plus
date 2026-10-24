package org.codehaus.groovy.control.customizers.builder;

import groovy.util.FactoryBuilderSupport;

/* loaded from: classes.dex */
public class CompilerCustomizationBuilder extends FactoryBuilderSupport {
    static {
        j6();
        Long l = 0L;
        l.longValue();
        Long l2 = 1402495628015L;
        l2.longValue();
    }

    public CompilerCustomizationBuilder() {
        DW();
    }

    private void DW() {
        registerFactory("ast", new ASTTransformationCustomizerFactory());
        registerFactory("customizers", new CustomizersFactory());
        registerFactory("imports", new ImportCustomizerFactory());
        registerFactory("inline", new InlinedASTCustomizerFactory());
        registerFactory("secureAst", new SecureASTCustomizerFactory());
        registerFactory("source", new SourceAwareCustomizerFactory());
    }

    public static /* synthetic */ void j6() {
    }
}
