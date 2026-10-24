package org.codehaus.groovy.antlr.treewalker;

import groovyjarjarantlr.collections.AST;
import java.util.Iterator;
import java.util.List;
import org.codehaus.groovy.antlr.GroovySourceAST;

/* loaded from: classes.dex */
public class FlatNodeListTraversal extends TraversalHelper {
    @Override // org.codehaus.groovy.antlr.treewalker.TraversalHelper
    protected void DW(GroovySourceAST groovySourceAST) {
        rN(groovySourceAST);
        lg(groovySourceAST);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.TraversalHelper, org.codehaus.groovy.antlr.AntlrASTProcessor
    public AST j6(AST ast) {
        GroovySourceAST groovySourceAST = (GroovySourceAST) ast;
        NodeCollector nodeCollector = new NodeCollector();
        new PreOrderTraversal(nodeCollector).j6(ast);
        List listP8 = nodeCollector.p8();
        BT(groovySourceAST);
        Iterator it = listP8.iterator();
        while (it.hasNext()) {
            DW((GroovySourceAST) it.next());
        }
        ei(groovySourceAST);
        return null;
    }
}
