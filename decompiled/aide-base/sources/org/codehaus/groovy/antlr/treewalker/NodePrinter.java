package org.codehaus.groovy.antlr.treewalker;

import java.io.PrintStream;
import org.codehaus.groovy.antlr.GroovySourceAST;

/* loaded from: classes.dex */
public class NodePrinter extends VisitorAdapter {
    private PrintStream DW;
    private String[] j6;

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void uC(GroovySourceAST groovySourceAST, int i) {
        if (i == 1) {
            this.DW.print("<" + this.j6[groovySourceAST.getType()] + ">");
            return;
        }
        this.DW.print("</" + this.j6[groovySourceAST.getType()] + ">");
    }
}
