package org.codehaus.groovy.ast;

import java.util.HashMap;
import java.util.Map;
import org.codehaus.groovy.ast.expr.Expression;

/* loaded from: classes.dex */
public class AnnotationNode extends ASTNode {
    private Map<String, Expression> qp = new HashMap();

    public AnnotationNode(ClassNode classNode) {
    }

    public void EQ(boolean z) {
    }

    public void J8(String str, Expression expression) {
        this.qp.put(str, expression);
    }

    public void QX(boolean z) {
    }

    public void Ws(boolean z) {
    }
}
