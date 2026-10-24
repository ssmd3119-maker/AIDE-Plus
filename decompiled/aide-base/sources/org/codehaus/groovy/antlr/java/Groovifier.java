package org.codehaus.groovy.antlr.java;

import org.codehaus.groovy.antlr.GroovySourceAST;
import org.codehaus.groovy.antlr.parser.GroovyTokenTypes;
import org.codehaus.groovy.antlr.treewalker.VisitorAdapter;

/* loaded from: classes.dex */
public class Groovifier extends VisitorAdapter implements GroovyTokenTypes {
    private boolean DW;
    private String j6;

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void gW(GroovySourceAST groovySourceAST, int i) {
        if (i == 1) {
            this.j6 = groovySourceAST.BT(87).getText();
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void uC(GroovySourceAST groovySourceAST, int i) {
        String text;
        if (i == 1) {
            if (groovySourceAST.getType() == 116 && this.DW) {
                groovySourceAST.Mr(28);
            }
            if (groovySourceAST.getType() != 8 || (text = groovySourceAST.BT(87).getText()) == null || text.length() <= 0 || !text.equals(this.j6)) {
                return;
            }
            groovySourceAST.Mr(46);
        }
    }
}
