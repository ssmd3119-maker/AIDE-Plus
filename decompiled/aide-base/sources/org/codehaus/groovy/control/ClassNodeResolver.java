package org.codehaus.groovy.control;

import java.util.HashMap;
import org.codehaus.groovy.GroovyBugError;
import org.codehaus.groovy.ast.ClassHelper;
import org.codehaus.groovy.ast.ClassNode;

/* loaded from: classes.dex */
public class ClassNodeResolver {

    public static class LookupResult {
    }

    static {
        new ClassNode("NO_CLASS", 1, ClassHelper.FH) { // from class: org.codehaus.groovy.control.ClassNodeResolver.1
            @Override // org.codehaus.groovy.ast.ClassNode
            public void yO(ClassNode classNode) {
                throw new GroovyBugError("This is a dummy class node only! Never use it for real classes.");
            }
        };
    }

    public ClassNodeResolver() {
        new HashMap();
    }
}
