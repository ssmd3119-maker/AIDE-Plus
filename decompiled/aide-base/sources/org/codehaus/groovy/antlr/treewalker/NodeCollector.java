package org.codehaus.groovy.antlr.treewalker;

import java.util.ArrayList;
import java.util.List;
import org.codehaus.groovy.antlr.GroovySourceAST;

/* loaded from: classes.dex */
public class NodeCollector extends VisitorAdapter {
    private List j6 = new ArrayList();

    public List p8() {
        return this.j6;
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void uC(GroovySourceAST groovySourceAST, int i) {
        if (i == 1) {
            this.j6.add(groovySourceAST);
        }
    }
}
