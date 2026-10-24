package org.codehaus.groovy.antlr;

import groovyjarjarantlr.collections.AST;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class AntlrASTProcessSnippets implements AntlrASTProcessor {
    private void DW(GroovySourceAST groovySourceAST, List list, Iterator it) {
        while (groovySourceAST != null) {
            if (list != null) {
                list.add(new LineColumn(groovySourceAST.getLine(), groovySourceAST.Zo()));
            }
            if (it != null && it.hasNext()) {
                LineColumn lineColumn = (LineColumn) it.next();
                if (groovySourceAST.XL() == 0) {
                    int iDW = lineColumn.DW();
                    int iJ6 = lineColumn.j6();
                    if (iDW < groovySourceAST.getLine() || (iDW == groovySourceAST.getLine() && iJ6 < groovySourceAST.Zo())) {
                        iDW = groovySourceAST.getLine();
                        iJ6 = groovySourceAST.Zo();
                    }
                    groovySourceAST.KD(iDW);
                    groovySourceAST.vy(iJ6);
                }
            }
            GroovySourceAST groovySourceAST2 = (GroovySourceAST) groovySourceAST.getFirstChild();
            if (groovySourceAST2 != null) {
                DW(groovySourceAST2, list, it);
            }
            groovySourceAST = (GroovySourceAST) groovySourceAST.getNextSibling();
        }
    }

    @Override // org.codehaus.groovy.antlr.AntlrASTProcessor
    public AST j6(AST ast) {
        ArrayList arrayList = new ArrayList();
        GroovySourceAST groovySourceAST = (GroovySourceAST) ast;
        DW(groovySourceAST, arrayList, null);
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next();
        }
        DW(groovySourceAST, null, it);
        return ast;
    }
}
