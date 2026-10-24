package org.codehaus.groovy.control;

import java.util.HashMap;
import java.util.HashSet;
import org.codehaus.groovy.ast.ClassCodeExpressionTransformer;
import org.codehaus.groovy.ast.ClassNode;

/* loaded from: classes.dex */
public class ResolveVisitor extends ClassCodeExpressionTransformer {

    private static class ConstructedClassWithPackage extends ClassNode {
        String aX;
        String oy;

        @Override // org.codehaus.groovy.ast.ClassNode
        public String getName() {
            if (OW() != this) {
                return super.getName();
            }
            return this.oy + this.aX;
        }
    }

    private static class LowerCaseClass extends ClassNode {
        String oy;

        @Override // org.codehaus.groovy.ast.ClassNode
        public String getName() {
            return OW() != this ? super.getName() : this.oy;
        }
    }

    public ResolveVisitor(CompilationUnit compilationUnit) {
        new HashMap();
        new HashSet();
        new ClassNodeResolver();
    }
}
