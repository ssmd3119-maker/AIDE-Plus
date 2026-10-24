package org.codehaus.groovy.antlr.java;

import org.codehaus.groovy.antlr.GroovySourceAST;
import org.codehaus.groovy.antlr.treewalker.VisitorAdapter;

/* loaded from: classes.dex */
public class Java2GroovyConverter extends VisitorAdapter {
    private int[] j6;

    private boolean Z3(String str) {
        return str != null && str.length() > 2 && str.charAt(0) == '\'' && str.charAt(str.length() - 1) == '\'';
    }

    private boolean p8(String str) {
        return str != null && str.length() > 2 && str.charAt(0) == '\"' && str.charAt(str.length() - 1) == '\"';
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void uC(GroovySourceAST groovySourceAST, int i) {
        if (i == 1) {
            groovySourceAST.Mr(this.j6[groovySourceAST.getType()]);
            if (groovySourceAST.getType() == 88) {
                String text = groovySourceAST.getText();
                if (Z3(text)) {
                    groovySourceAST.v5(text.substring(1, text.length() - 1));
                } else if (p8(text)) {
                    groovySourceAST.v5(text.substring(1, text.length() - 1));
                }
            }
        }
    }
}
