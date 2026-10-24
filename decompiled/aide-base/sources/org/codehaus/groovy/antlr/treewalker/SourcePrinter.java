package org.codehaus.groovy.antlr.treewalker;

import groovyjarjarantlr.collections.AST;
import java.io.PrintStream;
import java.util.Stack;
import org.codehaus.groovy.antlr.GroovySourceAST;

/* loaded from: classes.dex */
public class SourcePrinter extends VisitorAdapter {
    private int DW;
    private int FH;
    private final boolean Hw;
    private final Stack VH;
    private String Zo;
    private int gn;
    private final String[] j6;
    protected final PrintStream v5;

    public SourcePrinter(PrintStream printStream, String[] strArr) {
        this(printStream, strArr, true);
    }

    private GroovySourceAST Z3() {
        Object objPop = this.VH.pop();
        Object objPeek = this.VH.peek();
        this.VH.push(objPop);
        return (GroovySourceAST) objPeek;
    }

    private String p8(String str) {
        return str.replaceAll("\n", "\\\\<<REMOVE>>n").replaceAll("<<REMOVE>>", "");
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void AE(GroovySourceAST groovySourceAST, int i) {
        if (groovySourceAST.DW() > 0) {
            oP(groovySourceAST, i, "synchronized (", null, ") ");
        } else {
            oP(groovySourceAST, i, "synchronized ", null, null);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void AL(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "*", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void Ak(GroovySourceAST groovySourceAST, int i) {
        if ("<command>".equals(groovySourceAST.getText())) {
            yu(groovySourceAST, i, " ", " ", null);
        } else {
            yu(groovySourceAST, i, "(", " ", ")");
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void An(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "interface ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void BJ(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "(", "; ", ")");
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void BR(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " instanceof ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void BT(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "..<", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void Bx(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "transient ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void C(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " >>>= ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void CN(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " != ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void CU(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "+", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void Cz(GroovySourceAST groovySourceAST, int i) {
        yu(groovySourceAST, i, "this(", " ", ")");
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void DW(GroovySourceAST groovySourceAST, int i) {
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void DY(GroovySourceAST groovySourceAST, int i) {
        GroovySourceAST groovySourceASTZ3 = Z3();
        GroovySourceAST groovySourceASTBT = groovySourceASTZ3.BT(5);
        if (groovySourceASTBT != null && groovySourceASTBT.DW() != 0) {
            if (i != 4 || groovySourceAST.DW() == 0) {
                return;
            }
            mu(groovySourceAST, i, " ");
            return;
        }
        if (i == 1 && groovySourceAST.DW() == 0 && groovySourceASTZ3.getType() != 21) {
            mu(groovySourceAST, i, "def");
        }
        if (i == 4) {
            if (groovySourceASTZ3.getType() == 9 || groovySourceASTZ3.getType() == 8 || groovySourceASTZ3.getType() == 68 || (groovySourceASTZ3.getType() == 21 && groovySourceAST.DW() != 0)) {
                mu(groovySourceAST, i, " ");
            }
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void Dm(GroovySourceAST groovySourceAST, int i) {
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void E4(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " << ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void EQ(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "package ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void Ej(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "double", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void Eq(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " ; ", null, ")");
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void Ev(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "strictfp ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void F3(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " >> ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void FH(GroovySourceAST groovySourceAST, int i) {
        if (groovySourceAST.DW() == 0) {
            oP(groovySourceAST, i, "[:]", null, null);
        } else {
            yu(groovySourceAST, i, "[", null, "]");
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void FN(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "for ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void Fd(GroovySourceAST groovySourceAST, int i) {
        if (i == 1) {
            this.DW++;
        }
        if (i == 4) {
            this.DW--;
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void GK(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " /= ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void GT(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "import static ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void Gj(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, ":", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void HE(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "@interface ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void HO(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " -= ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void Hl(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "!", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void Hw(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "public ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void I(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "native ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void IM(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " in ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void IS(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " == ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void J0(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "char", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void J1(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, groovySourceAST.getText(), null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void Jl(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " &= ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void Jm(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "int", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void K3(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "*.", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void KD(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "*:", null, null);
    }

    protected void LA(GroovySourceAST groovySourceAST, int i) {
        int line = groovySourceAST.getLine();
        if (this.FH == 0) {
            this.FH = line;
        }
        if (this.FH != line) {
            if (this.Hw && (i != 1 || groovySourceAST.getType() != 7)) {
                for (int i2 = this.FH; i2 < line; i2++) {
                    this.v5.println();
                }
                if (this.FH > line) {
                    this.v5.println();
                    this.FH = line;
                }
                if (i == 1 || (i == 4 && this.FH > line)) {
                    for (int i3 = 0; i3 < this.DW; i3++) {
                        this.v5.print("    ");
                    }
                }
            }
            this.FH = Math.max(line, this.FH);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void Lz(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " ; ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void ME(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, groovySourceAST.getText(), null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void MP(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " <=> ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void Mr(GroovySourceAST groovySourceAST, int i) {
        yu(groovySourceAST, i, "while (", null, ") ");
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void Mz(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "threadsafe ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void N0(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "abstract ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void NZ(GroovySourceAST groovySourceAST, int i) {
        if (i == 4) {
            AST firstChild = groovySourceAST.getFirstChild();
            if ("MULTICATCH_TYPES".equals(firstChild.getText())) {
                oP(groovySourceAST, i, null, null, " " + firstChild.getNextSibling().getText());
                return;
            }
            oP(groovySourceAST, i, null, null, " " + firstChild.getFirstChild().getText());
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void Nh(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "static ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void OM(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " & ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void OW(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " > ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void Od(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " | ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void Of(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "throws ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void P8(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "?.", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void PT(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, groovySourceAST.getText(), null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void QO(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " = ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void QX(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "<", ", ", ">");
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void Qq(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " ^= ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void Qs(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, groovySourceAST.getText(), null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void S4(GroovySourceAST groovySourceAST, int i) {
        if (Z3().getType() == 12 || Z3().getType() == 23) {
            oP(groovySourceAST, i, null, null, "[]");
        } else {
            oP(groovySourceAST, i, "[", null, "]");
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void SI(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "volatile ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void Sc(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "**", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void Sf(GroovySourceAST groovySourceAST, int i) {
        yu(groovySourceAST, i, "[", null, "]");
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void T6(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "byte", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void TE(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "finally ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void TI(GroovySourceAST groovySourceAST, int i) {
        if (i == 1) {
            mu(groovySourceAST, i, "switch (");
            this.DW++;
        }
        if (i == 3) {
            mu(groovySourceAST, i, ") {");
        }
        if (i == 4) {
            this.DW--;
            mu(groovySourceAST, i, "}");
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void U2(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " >>> ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void UF(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " >= ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void VH(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "throw ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void Vq(GroovySourceAST groovySourceAST, int i) {
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void Ws(GroovySourceAST groovySourceAST, int i) {
        if (groovySourceAST.DW() > 1) {
            oP(groovySourceAST, i, "assert ", null, " : ");
        } else {
            oP(groovySourceAST, i, "assert ", null, null);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void XG(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "break ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void XL(GroovySourceAST groovySourceAST, int i) {
        yu(groovySourceAST, i, "(", " in ", ") ");
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void XX(GroovySourceAST groovySourceAST, int i) {
        if (i == 1 && groovySourceAST.DW() != 0) {
            mu(groovySourceAST, i, " implements ");
        }
        if (i == 4) {
            mu(groovySourceAST, i, " ");
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void Yi(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "static ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void Za(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "try ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void aX(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " as ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void b(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "continue ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void b1(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " / ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void br(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "(", null, ")");
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void ca(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " **= ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void cb(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, groovySourceAST.getText(), null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void ce(GroovySourceAST groovySourceAST) {
        this.VH.push(groovySourceAST);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void cn(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "final ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void ct(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "default", null, ":");
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void d8(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " |= ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void dW(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "*", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void df(GroovySourceAST groovySourceAST, int i) {
        yu(groovySourceAST, i, "if (", " else ", ") ");
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void dx(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " += ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void eN(GroovySourceAST groovySourceAST, int i) {
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void eU(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "?", ":", null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void ee(GroovySourceAST groovySourceAST, int i) {
        if (i == 1) {
            String strP8 = p8(groovySourceAST.getText());
            if (Z3().getType() != 54 && Z3().getType() != 48) {
                strP8 = "\"" + strP8 + "\"";
            }
            mu(groovySourceAST, i, strP8);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void ef(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "() ", "default ", null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void ei(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " = ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void ep(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " ^ ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public GroovySourceAST fP() {
        if (this.VH.empty()) {
            return null;
        }
        return (GroovySourceAST) this.VH.pop();
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void fd(GroovySourceAST groovySourceAST, int i) {
        if (i == 1) {
            this.DW++;
            mu(groovySourceAST, i, "{");
        } else {
            this.DW--;
            mu(groovySourceAST, i, "}");
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void fh(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " && ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void gM(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " >>= ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void gW(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "class ", null, null);
        if (i == 1) {
            this.Zo = groovySourceAST.BT(87).getText();
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void gy(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " + ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void h2(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " % ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void hG(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "import ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void hK(GroovySourceAST groovySourceAST, int i) {
        if (Z3().getType() == 50) {
            yu(groovySourceAST, i, null, ",", " ");
        } else {
            yu(groovySourceAST, i, "(", ", ", ") ");
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void hp(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, ".&", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void hx(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "return ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void hz(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "true", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void iK(GroovySourceAST groovySourceAST, int i) {
        yu(groovySourceAST, i, " catch (", null, ") ");
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void iW(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, groovySourceAST.getText(), null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void ir(GroovySourceAST groovySourceAST, int i) {
        if (groovySourceAST.BT(48) == null) {
            yu(groovySourceAST, i, "(", null, ")");
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void j3(GroovySourceAST groovySourceAST, int i) {
        yu(groovySourceAST, i, "[", null, "]");
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void j6(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, null, null, "--");
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void jD(GroovySourceAST groovySourceAST, int i) {
        if (Z3().getType() == 62) {
            oP(groovySourceAST, i, "(", ", ", ")");
        } else {
            oP(groovySourceAST, i, null, ", ", null);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void jJ(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "protected ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void jO(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "--", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void jg(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, ".", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void ji(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "short", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void jn(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "?", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void jw(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "..", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void k1(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "-", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void k2(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "boolean", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void k4(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "null", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void kQ(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " *= ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void kf(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " - ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void ko(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " %= ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void lg(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "trait ", null, null);
        if (i == 1) {
            this.Zo = groovySourceAST.BT(87).getText();
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void mb(GroovySourceAST groovySourceAST, int i) {
    }

    protected void mu(GroovySourceAST groovySourceAST, int i, String str) {
        if (i == 1) {
            LA(groovySourceAST, i);
        }
        if (i == 4) {
            LA(groovySourceAST, i);
        }
        this.v5.print(str);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void nl(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "super", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void nw(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "case ", null, ":");
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void oC(GroovySourceAST groovySourceAST, int i) {
    }

    protected void oP(GroovySourceAST groovySourceAST, int i, String str, String str2, String str3) {
        if (i == 1 && str != null) {
            mu(groovySourceAST, i, str);
        }
        if (i == 3 && str2 != null) {
            mu(groovySourceAST, i, str2);
        }
        if (i != 4 || str3 == null) {
            return;
        }
        mu(groovySourceAST, i, str3);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void oT(GroovySourceAST groovySourceAST, int i) {
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void oY(GroovySourceAST groovySourceAST, int i) {
        if (groovySourceAST.BT(17) == null) {
            oP(groovySourceAST, i, "new ", "(", ")");
        } else {
            oP(groovySourceAST, i, "new ", null, null);
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void oh(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "~", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void oy(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, this.Zo, null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void pN(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " <<= ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void pO(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "@", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void q7(GroovySourceAST groovySourceAST, int i) {
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void qI(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "void", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void qP(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, null, "... ", null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void qp(GroovySourceAST groovySourceAST, int i) {
        if (i == 1) {
            mu(groovySourceAST, i, "@");
        }
        if (i == 2) {
            mu(groovySourceAST, i, "(");
        }
        if (i == 3) {
            mu(groovySourceAST, i, ", ");
        }
        if (i == 4) {
            if (groovySourceAST.DW() > 1) {
                mu(groovySourceAST, i, ") ");
            } else {
                mu(groovySourceAST, i, " ");
            }
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void rB(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "<", ", ", ">");
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void rN(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "++", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void re(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, ":", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void ro(GroovySourceAST groovySourceAST, int i) {
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void sE(GroovySourceAST groovySourceAST, int i) {
        if (i == 1) {
            this.gn = 0;
            mu(groovySourceAST, i, "\"");
        }
        if (i == 3) {
            if (this.gn % 2 == 0) {
                mu(groovySourceAST, i, "$");
            }
            this.gn++;
        }
        if (i == 4) {
            mu(groovySourceAST, i, "\"");
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void sM(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "enum ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void sg(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "long", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void sv(GroovySourceAST groovySourceAST, int i) {
        if (i != 1 || groovySourceAST.DW() == 0) {
            return;
        }
        mu(groovySourceAST, i, " extends ");
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void sy(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "private ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void tR(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " <= ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void ti(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " || ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void tp(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "(", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void u7(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " < ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void u9(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " extends ", " & ", null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void uC(GroovySourceAST groovySourceAST, int i) {
        if (i == 1) {
            mu(groovySourceAST, i, "<" + this.j6[groovySourceAST.getType()] + ">");
            return;
        }
        mu(groovySourceAST, i, "</" + this.j6[groovySourceAST.getType()] + ">");
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void uD(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, groovySourceAST.getText(), null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void v5(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " =~ ", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void wC(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, null, null, "++");
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void wE(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "float", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void wc(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " super ", " & ", null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void we(GroovySourceAST groovySourceAST, int i) {
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void x6(GroovySourceAST groovySourceAST, int i) {
        yu(groovySourceAST, i, "{", "-> ", "}");
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void x9(GroovySourceAST groovySourceAST, int i) {
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void xg(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "this", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void yS(GroovySourceAST groovySourceAST, int i) {
        yu(groovySourceAST, i, "super(", " ", ")");
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void ya(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, "false", null, null);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void ye(GroovySourceAST groovySourceAST, int i) {
        if (i == 1) {
            this.DW++;
            mu(groovySourceAST, i, "{");
        } else {
            this.DW--;
            mu(groovySourceAST, i, "}");
        }
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void ys(GroovySourceAST groovySourceAST, int i) {
        oP(groovySourceAST, i, " ==~ ", null, null);
    }

    protected void yu(GroovySourceAST groovySourceAST, int i, String str, String str2, String str3) {
        if (i == 1 && str != null) {
            mu(groovySourceAST, i, str);
            this.DW++;
        }
        if (i == 3 && str2 != null) {
            mu(groovySourceAST, i, str2);
        }
        if (i != 4 || str3 == null) {
            return;
        }
        this.DW--;
        mu(groovySourceAST, i, str3);
    }

    @Override // org.codehaus.groovy.antlr.treewalker.VisitorAdapter, org.codehaus.groovy.antlr.treewalker.Visitor
    public void zg(GroovySourceAST groovySourceAST, int i) {
        GroovySourceAST groovySourceAST2 = (GroovySourceAST) groovySourceAST.getNextSibling();
        if (groovySourceAST2 == null || groovySourceAST2.getType() != 62) {
            return;
        }
        oP(groovySourceAST, i, null, null, ", ");
    }

    public SourcePrinter(PrintStream printStream, String[] strArr, boolean z) {
        this.j6 = strArr;
        this.DW = 0;
        this.FH = 0;
        this.v5 = printStream;
        this.Hw = z;
        this.VH = new Stack();
    }
}
