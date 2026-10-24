package org.codehaus.groovy.ast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class AnnotatedNode extends ASTNode {
    private List<AnnotationNode> qp = Collections.emptyList();

    private void J8() {
        if (this.qp == Collections.EMPTY_LIST) {
            this.qp = new ArrayList(3);
        }
    }

    public void EQ(AnnotationNode annotationNode) {
        J8();
        this.qp.add(annotationNode);
    }

    public void QX(boolean z) {
    }

    public void Ws(ClassNode classNode) {
    }
}
