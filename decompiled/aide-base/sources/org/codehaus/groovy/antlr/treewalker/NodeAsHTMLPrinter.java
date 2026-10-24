package org.codehaus.groovy.antlr.treewalker;

import java.io.PrintStream;
import java.util.Stack;
import org.codehaus.groovy.antlr.GroovySourceAST;

/* loaded from: classes.dex */
public class NodeAsHTMLPrinter extends VisitorAdapter {
    private final PrintStream DW;
    private final Stack FH = new Stack();
    private final String[] j6;

    public NodeAsHTMLPrinter(PrintStream printStream, String[] strArr) {
        this.j6 = strArr;
        this.DW = printStream;
    }

    private String Z3(String str) {
        if (str.length() <= 0 || str.charAt(0) == '\'') {
            return "\"" + str + "\"";
        }
        return "'" + str + "'";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037 A[FALL_THROUGH, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String p8(org.codehaus.groovy.antlr.GroovySourceAST r2) {
        /*
            r1 = this;
            int r2 = r2.getType()
            r0 = 12
            if (r2 == r0) goto L37
            r0 = 13
            if (r2 == r0) goto L37
            r0 = 18
            if (r2 == r0) goto L37
            r0 = 19
            if (r2 == r0) goto L37
            r0 = 98
            if (r2 == r0) goto L37
            r0 = 99
            if (r2 == r0) goto L37
            switch(r2) {
                case 16: goto L37;
                case 29: goto L37;
                case 88: goto L34;
                case 137: goto L37;
                case 138: goto L37;
                case 139: goto L37;
                case 140: goto L37;
                case 141: goto L37;
                case 142: goto L37;
                case 143: goto L37;
                case 144: goto L37;
                case 145: goto L37;
                case 146: goto L37;
                case 147: goto L37;
                case 157: goto L37;
                case 158: goto L37;
                case 159: goto L37;
                case 160: goto L37;
                case 161: goto L37;
                case 212: goto L34;
                case 213: goto L34;
                default: goto L1f;
            }
        L1f:
            switch(r2) {
                case 81: goto L37;
                case 82: goto L37;
                case 83: goto L37;
                case 84: goto L37;
                default: goto L22;
            }
        L22:
            switch(r2) {
                case 92: goto L37;
                case 93: goto L37;
                case 94: goto L37;
                default: goto L25;
            }
        L25:
            switch(r2) {
                case 104: goto L37;
                case 105: goto L37;
                case 106: goto L37;
                case 107: goto L37;
                case 108: goto L37;
                case 109: goto L37;
                case 110: goto L37;
                case 111: goto L37;
                case 112: goto L37;
                default: goto L28;
            }
        L28:
            switch(r2) {
                case 114: goto L37;
                case 115: goto L37;
                case 116: goto L37;
                case 117: goto L37;
                case 118: goto L37;
                case 119: goto L37;
                case 120: goto L37;
                case 121: goto L37;
                case 122: goto L37;
                default: goto L2b;
            }
        L2b:
            switch(r2) {
                case 129: goto L37;
                case 130: goto L37;
                case 131: goto L37;
                case 132: goto L37;
                default: goto L2e;
            }
        L2e:
            switch(r2) {
                case 150: goto L37;
                case 151: goto L37;
                case 152: goto L37;
                case 153: goto L37;
                default: goto L31;
            }
        L31:
            java.lang.String r2 = "000000"
            goto L39
        L34:
            java.lang.String r2 = "008000"
            goto L39
        L37:
            java.lang.String r2 = "17178B"
        L39:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.treewalker.NodeAsHTMLPrinter.p8(org.codehaus.groovy.antlr.GroovySourceAST):java.lang.String");
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void WB() {
        this.DW.println("<html><head></head><body><pre>");
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void ce(GroovySourceAST groovySourceAST) {
        this.FH.push(groovySourceAST);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public GroovySourceAST fP() {
        if (this.FH.empty()) {
            return null;
        }
        return (GroovySourceAST) this.FH.pop();
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void oa() {
        this.DW.println("</pre></body></html>");
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void uC(GroovySourceAST groovySourceAST, int i) {
        if (i != 1) {
            if (i == 4) {
                this.DW.print("</font></code>");
                return;
            }
            return;
        }
        this.DW.print("<code title=" + Z3(this.j6[groovySourceAST.getType()]) + "><font color='#" + p8(groovySourceAST) + "'>");
    }
}
