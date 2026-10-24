package org.codehaus.groovy.antlr.treewalker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.codehaus.groovy.antlr.GroovySourceAST;

/* loaded from: classes.dex */
public class SourceCodeTraversal extends TraversalHelper {
    public SourceCodeTraversal(Visitor visitor) {
        super(visitor);
    }

    private void SI(GroovySourceAST groovySourceAST) {
        if (groovySourceAST == null) {
            return;
        }
        List<GroovySourceAST> list = this.j6;
        if (list != null) {
            list.add(groovySourceAST);
        }
        GroovySourceAST groovySourceAST2 = (GroovySourceAST) groovySourceAST.getFirstChild();
        if (groovySourceAST2 != null) {
            SI(groovySourceAST2);
        }
        GroovySourceAST groovySourceAST3 = (GroovySourceAST) groovySourceAST.getNextSibling();
        if (groovySourceAST3 != null) {
            SI(groovySourceAST3);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.TraversalHelper
    public void BT(GroovySourceAST groovySourceAST) {
        super.BT(groovySourceAST);
        this.j6 = new ArrayList();
        SI(groovySourceAST);
        Collections.sort(this.j6);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00db A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00eb  */
    @Override // org.codehaus.groovy.antlr.treewalker.TraversalHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void DW(org.codehaus.groovy.antlr.GroovySourceAST r5) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.treewalker.SourceCodeTraversal.DW(org.codehaus.groovy.antlr.GroovySourceAST):void");
    }
}
