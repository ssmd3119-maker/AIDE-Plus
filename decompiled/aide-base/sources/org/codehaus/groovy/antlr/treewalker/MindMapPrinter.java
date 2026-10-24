package org.codehaus.groovy.antlr.treewalker;

import java.io.PrintStream;
import org.codehaus.groovy.antlr.GroovySourceAST;
import org.codehaus.groovy.antlr.LineColumn;
import org.codehaus.groovy.antlr.SourceBuffer;

/* loaded from: classes.dex */
public class MindMapPrinter extends VisitorAdapter {
    private final PrintStream DW;
    private int FH;
    private SourceBuffer Hw;
    private final String[] j6;

    public MindMapPrinter(PrintStream printStream, String[] strArr) {
        this.j6 = strArr;
        this.DW = printStream;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String Z3(org.codehaus.groovy.antlr.GroovySourceAST r5) {
        /*
            r4 = this;
            int r0 = r5.getType()
            r1 = 12
            java.lang.String r2 = " COLOR=\"#000000\""
            java.lang.String r3 = " COLOR=\"#006699\""
            if (r0 == r1) goto L41
            r1 = 13
            if (r0 == r1) goto L41
            r1 = 18
            if (r0 == r1) goto L41
            r1 = 19
            if (r0 == r1) goto L41
            r1 = 87
            if (r0 == r1) goto L3f
            r1 = 88
            if (r0 == r1) goto L3c
            r1 = 98
            if (r0 == r1) goto L41
            r1 = 99
            if (r0 == r1) goto L41
            switch(r0) {
                case 16: goto L41;
                case 29: goto L41;
                case 137: goto L41;
                case 138: goto L41;
                case 139: goto L41;
                case 140: goto L41;
                case 141: goto L41;
                case 142: goto L41;
                case 143: goto L41;
                case 144: goto L41;
                case 145: goto L41;
                case 146: goto L41;
                case 147: goto L41;
                case 150: goto L41;
                case 151: goto L41;
                case 152: goto L41;
                case 153: goto L41;
                case 157: goto L41;
                case 158: goto L41;
                case 159: goto L41;
                case 160: goto L41;
                case 161: goto L41;
                case 212: goto L3c;
                case 213: goto L3c;
                default: goto L2b;
            }
        L2b:
            switch(r0) {
                case 81: goto L41;
                case 82: goto L41;
                case 83: goto L41;
                case 84: goto L41;
                default: goto L2e;
            }
        L2e:
            switch(r0) {
                case 92: goto L41;
                case 93: goto L41;
                case 94: goto L41;
                default: goto L31;
            }
        L31:
            switch(r0) {
                case 104: goto L41;
                case 105: goto L41;
                case 106: goto L41;
                case 107: goto L41;
                case 108: goto L41;
                case 109: goto L41;
                case 110: goto L41;
                case 111: goto L41;
                case 112: goto L41;
                default: goto L34;
            }
        L34:
            switch(r0) {
                case 114: goto L41;
                case 115: goto L41;
                case 116: goto L41;
                case 117: goto L41;
                case 118: goto L41;
                case 119: goto L41;
                case 120: goto L41;
                case 121: goto L41;
                case 122: goto L41;
                default: goto L37;
            }
        L37:
            switch(r0) {
                case 129: goto L41;
                case 130: goto L41;
                case 131: goto L41;
                case 132: goto L41;
                default: goto L3a;
            }
        L3a:
            r0 = r2
            goto L43
        L3c:
            java.lang.String r0 = " COLOR=\"#008000\""
            goto L43
        L3f:
            r0 = r3
            goto L43
        L41:
            java.lang.String r0 = " COLOR=\"#17178B\""
        L43:
            boolean r1 = r2.equals(r0)
            if (r1 == 0) goto L50
            int r5 = r5.DW()
            if (r5 != 0) goto L50
            goto L51
        L50:
            r3 = r0
        L51:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.treewalker.MindMapPrinter.Z3(org.codehaus.groovy.antlr.GroovySourceAST):java.lang.String");
    }

    private String mu(GroovySourceAST groovySourceAST) {
        int type;
        return ((this.FH <= 2 || groovySourceAST.DW() <= 0 || !((type = groovySourceAST.getType()) == 8 || type == 9 || type == 28)) && groovySourceAST.getType() != 29) ? "" : " FOLDED='true'";
    }

    private String oP(GroovySourceAST groovySourceAST) {
        GroovySourceAST groovySourceASTBT;
        String str = this.j6[groovySourceAST.getType()] + " <" + groovySourceAST.getType() + ">";
        if (!p8(this.j6[groovySourceAST.getType()]).equals(p8(groovySourceAST.getText()))) {
            str = str + " : " + groovySourceAST.getText();
        }
        int type = groovySourceAST.getType();
        if ((type == 8 || type == 9) && (groovySourceASTBT = groovySourceAST.BT(87)) != null) {
            str = str + " : " + groovySourceASTBT.getText() + "";
        }
        String strP8 = p8(str);
        if (this.Hw == null) {
            return strP8;
        }
        return (((strP8 + "&#xa;") + groovySourceAST.getLine() + "," + groovySourceAST.Zo() + " - " + groovySourceAST.XL() + "," + groovySourceAST.rN()) + "&#xa;") + p8(this.Hw.j6(new LineColumn(groovySourceAST.getLine(), groovySourceAST.Zo()), new LineColumn(groovySourceAST.XL(), groovySourceAST.rN())));
    }

    private String p8(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() > 200) {
            str = str.substring(0, 100) + " ..... " + str.substring(str.length() - 100);
        }
        return str.replace('\"', ' ').replace('\'', ' ').replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;").trim();
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void WB() {
        this.FH = 0;
        this.DW.println("<map version='0.7.1'><node TEXT='AST'>");
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void oa() {
        this.DW.println("</node></map>");
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void uC(GroovySourceAST groovySourceAST, int i) {
        if (i != 1) {
            if (i == 4) {
                this.DW.println("</node>");
                this.FH--;
                return;
            }
            return;
        }
        this.FH++;
        String strOP = oP(groovySourceAST);
        String strZ3 = Z3(groovySourceAST);
        String strMu = mu(groovySourceAST);
        this.DW.print("<node TEXT='" + strOP + "' POSITION='right'" + strZ3 + strMu + ">");
    }

    public MindMapPrinter(PrintStream printStream, String[] strArr, SourceBuffer sourceBuffer) {
        this.j6 = strArr;
        this.DW = printStream;
        this.Hw = sourceBuffer;
    }
}
