package com.aide.codemodel.language.xml;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.u3;
import com.aide.codemodel.api.ErrorTable;
import com.aide.codemodel.api.IdentifierSpace;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.abstraction.CodeAnalyzer;
import com.aide.codemodel.api.collections.SetOfInt;

@cy(clazz = -6303342884220565261L, container = -6303342884220565261L, user = true)
/* loaded from: classes.dex */
public class XmlCodeAnalyzer implements CodeAnalyzer {

    @gy
    private static /* synthetic */ boolean VH;

    @fy
    private static /* synthetic */ boolean Zo;

    @dy(field = -2121646051574835371L)
    private final IdentifierSpace DW;

    @dy(field = 362066278402030291L)
    private SyntaxTree FH;

    @dy(field = -387692083319208915L)
    private u3 Hw;

    @dy(field = -2457218520314231219L)
    private final ErrorTable j6;

    @dy(field = 884599727032315696L)
    private int v5;

    static {
        iy.Zo(XmlCodeAnalyzer.class);
    }

    @ey(method = 1271372569261081249L)
    public XmlCodeAnalyzer(ErrorTable errorTable, IdentifierSpace identifierSpace) {
        try {
            if (Zo) {
                iy.EQ(4532839849691056320L, null, errorTable, identifierSpace);
            }
            this.j6 = errorTable;
            this.DW = identifierSpace;
            this.Hw = new u3();
            this.v5 = identifierSpace.get("xmlns");
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 4532839849691056320L, null, errorTable, identifierSpace);
            }
            throw th;
        }
    }

    @ey(method = -4175114510377022997L)
    private void EQ(int i) {
        try {
            if (Zo) {
                iy.u7(-1416187240993763056L, this, i);
            }
            if (this.FH.getSyntaxTag(i) == 18 || this.FH.getSyntaxTag(i) == 14) {
                tp(i);
            }
            int childCount = this.FH.getChildCount(i);
            for (int i2 = 0; i2 < childCount; i2++) {
                EQ(this.FH.getChildNode(i, i2));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -1416187240993763056L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -4347713830487704192L)
    private void J0(int i) {
        try {
            if (Zo) {
                iy.u7(1496776533644234979L, this, i);
            }
            int syntaxTag = this.FH.getSyntaxTag(i);
            if (syntaxTag == 217) {
                int childNode = this.FH.getChildNode(i, 0);
                this.FH.getChildNode(i, 2);
                int syntaxTag2 = this.FH.getSyntaxTag(this.FH.getParentNode(i));
                if ((syntaxTag2 == 200 || syntaxTag2 == 201 || syntaxTag2 == 207) && this.Hw.DW(this.FH.getIdentifier(childNode))) {
                    this.FH.declareAttrReferenceKind(childNode, 5, this.Hw.v5(this.FH.getIdentifier(childNode)));
                    return;
                }
                return;
            }
            if (syntaxTag != 218) {
                for (int i2 = 0; i2 < this.FH.getChildCount(i); i2++) {
                    J0(this.FH.getChildNode(i, i2));
                }
                return;
            }
            int childNode2 = this.FH.getChildNode(i, 0);
            int childNode3 = this.FH.getChildNode(i, 2);
            if (this.FH.getSyntaxTag(this.FH.getParentNode(i)) == 203 && this.FH.getIdentifier(childNode2) != this.v5) {
                if ((this.FH.getIdentifier(childNode2) == this.DW.get("") && this.FH.getIdentifier(childNode3) == this.v5) || this.FH.getIdentifier(childNode2) == this.DW.get("") || !this.Hw.DW(this.FH.getIdentifier(childNode2))) {
                    return;
                }
                this.FH.declareAttrReferenceKind(childNode2, 5, this.Hw.v5(this.FH.getIdentifier(childNode2)));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 1496776533644234979L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1465376136458753895L)
    private void J8(int i) {
        try {
            if (Zo) {
                iy.u7(4098308378943511932L, this, i);
            }
            int syntaxTag = this.FH.getSyntaxTag(i);
            int i2 = 0;
            if (syntaxTag == 200 || syntaxTag == 201) {
                for (int i3 = 0; i3 < this.FH.getChildCount(i); i3++) {
                    we(this.FH.getChildNode(i, i3));
                }
                while (i2 < this.FH.getChildCount(i)) {
                    J0(this.FH.getChildNode(i, i2));
                    i2++;
                }
                return;
            }
            if (syntaxTag != 211) {
                while (i2 < this.FH.getChildCount(i)) {
                    J8(this.FH.getChildNode(i, i2));
                    i2++;
                }
            } else {
                this.Hw.Hw();
                while (i2 < this.FH.getChildCount(i)) {
                    J8(this.FH.getChildNode(i, i2));
                    i2++;
                }
                this.Hw.Zo();
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 4098308378943511932L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -374554006911359640L)
    private void Mr(int i) {
        try {
            if (Zo) {
                iy.u7(162441715432599911L, this, i);
            }
            this.j6.Ws(this.FH.getFile(), this.FH.getLanguage(), this.FH.getStartLine(i), this.FH.getStartColumn(i), this.FH.getEndLine(i), this.FH.getEndColumn(i), '\"' + this.DW.getString(this.FH.getIdentifier(i)) + '\"', "Surround with quotes");
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 162441715432599911L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2515049541353134453L)
    private void QX(int i) {
        try {
            if (Zo) {
                iy.u7(-4339375957432340520L, this, i);
            }
            int syntaxTag = this.FH.getSyntaxTag(i);
            if (syntaxTag != 50) {
                if (syntaxTag == 200 && this.FH.isSyntheticNode(i)) {
                    int childNode = this.FH.getChildNode(i, 1);
                    int identifier = this.FH.getIdentifier(this.FH.getChildNode(childNode, 0));
                    int identifier2 = this.FH.getIdentifier(this.FH.getChildNode(childNode, 2));
                    int childNode2 = this.FH.getChildNode(this.FH.getParentNode(i), 2);
                    aM(childNode2, "Unexpected closing tag </" + (identifier == this.DW.get("") ? this.DW.getString(identifier2) : this.DW.getString(identifier) + ":" + this.DW.getString(identifier2)) + ">");
                    j3(childNode2);
                }
            } else if (!this.FH.isSyntheticNode(i)) {
                int syntaxTag2 = this.FH.getSyntaxTag(this.FH.getParentNode(i));
                if (syntaxTag2 == 203) {
                    aM(i, "Invalid character in attribute name");
                } else if (syntaxTag2 == 204) {
                    aM(i, "Invalid character in attribute value");
                    Mr(i);
                }
            }
            for (int i2 = 0; i2 < this.FH.getChildCount(i); i2++) {
                QX(this.FH.getChildNode(i, i2));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -4339375957432340520L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3802245027703540623L)
    private void aM(int i, String str) {
        try {
            if (Zo) {
                iy.EQ(6481589472545114560L, this, new Integer(i), str);
            }
            this.j6.j3(this.FH.getFile(), this.FH.getLanguage(), this.FH.getStartLine(i), this.FH.getStartColumn(i), this.FH.getEndLine(i), this.FH.getEndColumn(i), str, 0);
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 6481589472545114560L, this, new Integer(i), str);
            }
            throw th;
        }
    }

    @ey(method = 1875900523109946235L)
    private void j3(int i) {
        try {
            if (Zo) {
                iy.u7(644393957173794152L, this, i);
            }
            this.j6.Ws(this.FH.getFile(), this.FH.getLanguage(), this.FH.getStartLine(i), this.FH.getStartColumn(i), this.FH.getEndLine(i), this.FH.getEndColumn(i), "", "Delete");
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 644393957173794152L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 7855499971035481257L)
    private void tp(int i) {
        try {
            if (Zo) {
                iy.u7(-7176068216373796388L, this, i);
            }
            try {
                if (this.FH.getLiteralLen(i) == 9) {
                    if (this.FH.getLiteralChars(i)[this.FH.getLiteralOff(i)] == '#') {
                        u7(i, (int) Long.parseLong(this.FH.getLiteralString(i).substring(1), 16));
                    }
                } else if (this.FH.getLiteralLen(i) == 7 && this.FH.getLiteralChars(i)[this.FH.getLiteralOff(i)] == '#') {
                    u7(i, (-16777216) | ((int) Long.parseLong(this.FH.getLiteralString(i).substring(1), 16)));
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -7176068216373796388L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1645507869708877225L)
    private void u7(int i, int i2) {
        try {
            if (Zo) {
                iy.EQ(-262769859159566724L, this, new Integer(i), new Integer(i2));
            }
            this.j6.FH(this.FH.getFile(), this.FH.getLanguage(), this.FH.getStartLine(i), this.FH.getStartColumn(i), this.FH.getEndLine(i), this.FH.getEndColumn(i), i2);
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -262769859159566724L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 264670858506603315L)
    private void we(int i) {
        try {
            if (Zo) {
                iy.u7(-316926377553091236L, this, i);
            }
            if (this.FH.getSyntaxTag(i) != 218) {
                for (int i2 = 0; i2 < this.FH.getChildCount(i); i2++) {
                    we(this.FH.getChildNode(i, i2));
                }
                return;
            }
            int childNode = this.FH.getChildNode(i, 0);
            int childNode2 = this.FH.getChildNode(i, 2);
            int parentNode = this.FH.getParentNode(i);
            if (this.FH.getSyntaxTag(parentNode) == 203) {
                if (this.FH.getIdentifier(childNode) == this.v5) {
                    this.Hw.FH(this.FH.getIdentifier(childNode2), parentNode);
                    this.FH.declareAttrReferenceKind(childNode2, 4, parentNode);
                } else if (this.FH.getIdentifier(childNode) == this.DW.get("") && this.FH.getIdentifier(childNode2) == this.v5) {
                    this.Hw.FH(this.DW.get(""), parentNode);
                    this.FH.declareAttrReferenceKind(childNode, 4, parentNode);
                }
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -316926377553091236L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = 4565079804189770943L)
    public void FH(SyntaxTree syntaxTree) {
        try {
            if (Zo) {
                iy.tp(5534975060369763700L, this, syntaxTree);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 5534975060369763700L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = 4502747881591646848L)
    public void Hw(SyntaxTree syntaxTree, int i) {
        try {
            if (Zo) {
                iy.EQ(3160985893982847933L, this, syntaxTree, new Integer(i));
            }
            Ws(syntaxTree);
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 3160985893982847933L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = 2578260159089646592L)
    public void VH(SyntaxTree syntaxTree, int i) {
        try {
            if (Zo) {
                iy.EQ(-2565173158668832005L, this, syntaxTree, new Integer(i));
            }
            Ws(syntaxTree);
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -2565173158668832005L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4951642367381991275L)
    public void Ws(SyntaxTree syntaxTree) {
        try {
            if (Zo) {
                iy.tp(-3278294815952505024L, this, syntaxTree);
            }
            try {
                this.FH = syntaxTree;
                J8(syntaxTree.getRootNode());
                this.FH = null;
            } finally {
                this.Hw.j6();
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -3278294815952505024L, this, syntaxTree);
            }
            throw th;
        }
    }

    @ey(method = 417024928305456624L)
    public void XL(SyntaxTree syntaxTree, boolean z) {
        try {
            if (Zo) {
                iy.EQ(392270810860227195L, this, syntaxTree, new Boolean(z));
            }
            this.FH = syntaxTree;
            QX(syntaxTree.getRootNode());
            EQ(syntaxTree.getRootNode());
            this.FH = null;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 392270810860227195L, this, syntaxTree, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = 4699850994759712273L)
    public void Zo(SyntaxTree syntaxTree) {
        try {
            if (Zo) {
                iy.tp(-680506452741300768L, this, syntaxTree);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -680506452741300768L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = 2917912983522121431L)
    public void analyzeEveryIdentifiers(SyntaxTree syntaxTree, SetOfInt setOfInt) {
        try {
            if (Zo) {
                iy.EQ(3173125330205744304L, this, syntaxTree, setOfInt);
            }
            Ws(syntaxTree);
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 3173125330205744304L, this, syntaxTree, setOfInt);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = -1050433290678786484L)
    public Type analyzeTypeName(SyntaxTree syntaxTree, int i, int i2, String str) {
        try {
            if (!Zo) {
                return null;
            }
            iy.J0(9466891099700145L, this, syntaxTree, new Integer(i), new Integer(i2), str);
            return null;
        } catch (Throwable th) {
            if (VH) {
                iy.a8(th, 9466891099700145L, this, syntaxTree, new Integer(i), new Integer(i2), str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = -2104092620800313440L)
    public void j6(SyntaxTree syntaxTree, int i) {
        try {
            if (Zo) {
                iy.EQ(-2231287000311332457L, this, syntaxTree, new Integer(i));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -2231287000311332457L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeAnalyzer
    @ey(method = 3999082517726924068L)
    public void v5(SyntaxTree syntaxTree) {
        try {
            if (Zo) {
                iy.tp(-2028451740229514963L, this, syntaxTree);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -2028451740229514963L, this, syntaxTree);
            }
            throw th;
        }
    }
}
