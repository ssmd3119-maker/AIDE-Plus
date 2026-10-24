package org.codehaus.groovy.control.customizers;

import java.util.LinkedList;
import org.codehaus.groovy.ast.GroovyCodeVisitor;
import org.codehaus.groovy.control.CompilePhase;

/* loaded from: classes.dex */
public class SecureASTCustomizer extends CompilationCustomizer {

    public interface ExpressionChecker {
    }

    private class SecuringCodeVisitor implements GroovyCodeVisitor {
    }

    public interface StatementChecker {
    }

    public SecureASTCustomizer() {
        super(CompilePhase.CANONICALIZATION);
        new LinkedList();
        new LinkedList();
    }
}
