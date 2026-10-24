package org.codehaus.groovy.antlr.treewalker;

import org.codehaus.groovy.antlr.GroovySourceAST;

/* loaded from: classes.dex */
public class PreOrderTraversal extends TraversalHelper {
    public PreOrderTraversal(Visitor visitor) {
        super(visitor);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.TraversalHelper
    public void DW(GroovySourceAST groovySourceAST) {
        yS(groovySourceAST);
        rN(groovySourceAST);
        FH(groovySourceAST);
        lg(groovySourceAST);
        er();
    }
}
