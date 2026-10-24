package org.codehaus.groovy.antlr.java;

import java.util.Stack;
import org.codehaus.groovy.antlr.GroovySourceAST;
import org.codehaus.groovy.antlr.treewalker.VisitorAdapter;

/* loaded from: classes.dex */
public class PreJava2GroovyConverter extends VisitorAdapter {
    private Stack j6;

    private void mu(GroovySourceAST groovySourceAST) {
        if (this.j6.size() > 2) {
            GroovySourceAST groovySourceASTP8 = p8();
            if (groovySourceASTP8.getType() == 27) {
                groovySourceASTP8.Mr(28);
                groovySourceASTP8.U2(groovySourceAST);
                groovySourceAST.Mr(33);
            }
        }
    }

    private void oP(GroovySourceAST groovySourceAST) {
        Z3(groovySourceAST);
    }

    private GroovySourceAST p8() {
        Object objPop = this.j6.pop();
        Object objPop2 = this.j6.pop();
        Object objPeek = this.j6.peek();
        this.j6.push(objPop2);
        this.j6.push(objPop);
        return (GroovySourceAST) objPeek;
    }

    public void Z3(GroovySourceAST groovySourceAST) {
        GroovySourceAST groovySourceAST2 = (GroovySourceAST) groovySourceAST.getFirstChild();
        GroovySourceAST groovySourceAST3 = (GroovySourceAST) groovySourceAST2.getNextSibling();
        groovySourceAST.U2(groovySourceAST3);
        groovySourceAST2.tp(null);
        groovySourceAST3.tp(groovySourceAST2);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void ce(GroovySourceAST groovySourceAST) {
        this.j6.push(groovySourceAST);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public GroovySourceAST fP() {
        if (this.j6.empty()) {
            return null;
        }
        return (GroovySourceAST) this.j6.pop();
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void uC(GroovySourceAST groovySourceAST, int i) {
        if (i == 1) {
            if (groovySourceAST.getType() == 114) {
                oP(groovySourceAST);
            } else if (groovySourceAST.getType() == 28) {
                mu(groovySourceAST);
            }
        }
    }
}
