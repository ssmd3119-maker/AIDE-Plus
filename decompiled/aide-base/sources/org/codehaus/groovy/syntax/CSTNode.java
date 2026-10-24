package org.codehaus.groovy.syntax;

import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes.dex */
public abstract class CSTNode {
    public abstract CSTNode DW(int i);

    protected void EQ(PrintWriter printWriter, String str) {
        printWriter.print("(");
        if (!gn()) {
            Token tokenV5 = v5(true);
            int iJ8 = tokenV5.J8();
            int iWe = tokenV5.we();
            printWriter.print(Types.Hw(iJ8));
            if (iWe != iJ8) {
                printWriter.print(" as ");
                printWriter.print(Types.Hw(iWe));
            }
            if (VH() > -1) {
                printWriter.print(" at " + VH() + ":" + Zo());
            }
            String strJ0 = tokenV5.J0();
            int length = strJ0.length();
            if (length > 0) {
                printWriter.print(": ");
                if (length > 40) {
                    strJ0 = strJ0.substring(0, 17) + "..." + strJ0.substring(length - 17, length);
                }
                printWriter.print(" \"");
                printWriter.print(strJ0);
                printWriter.print("\" ");
            } else if (j6() > 0) {
                printWriter.print(": ");
            }
            int iU7 = u7();
            if (iU7 > 1) {
                printWriter.println("");
                String str2 = str + "  ";
                String str3 = str + "   ";
                for (int i = 1; i < iU7; i++) {
                    printWriter.print(str2);
                    printWriter.print(i);
                    printWriter.print(": ");
                    FH(i, true).EQ(printWriter, str3);
                }
                printWriter.print(str);
            }
        }
        if (str.length() > 0) {
            printWriter.println(")");
        } else {
            printWriter.print(")");
        }
    }

    public CSTNode FH(int i, boolean z) {
        CSTNode cSTNodeDW = DW(i);
        return (cSTNodeDW == null && z) ? Token.Zo : cSTNodeDW;
    }

    public abstract Token Hw();

    public int VH() {
        return v5(true).VH();
    }

    public int Zo() {
        return v5(true).Zo();
    }

    public boolean gn() {
        return false;
    }

    public int j6() {
        int iU7 = u7();
        if (iU7 > 1) {
            return iU7 - 1;
        }
        return 0;
    }

    public String toString() {
        StringWriter stringWriter = new StringWriter();
        tp(new PrintWriter(stringWriter));
        stringWriter.flush();
        return stringWriter.toString();
    }

    public void tp(PrintWriter printWriter) {
        EQ(printWriter, "");
    }

    public abstract int u7();

    public Token v5(boolean z) {
        Token tokenHw = Hw();
        return (tokenHw == null && z) ? Token.Zo : tokenHw;
    }
}
