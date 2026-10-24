package com.aide.codemodel.language.js;

import abcd.cy;
import abcd.dy;
import abcd.e4;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.z6;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.abstraction.SignatureAnalyzer;
import java.util.zip.CRC32;

@cy(clazz = 374076577264302756L, container = 374076577264302756L, user = true)
/* loaded from: classes.dex */
public class JavaScriptSignatureAnalyzer implements SignatureAnalyzer {

    @dy(field = -2411011583328459825L)
    private static CRC32 FH;

    @dy(field = -3356927672222556439L)
    private static byte[] Hw;

    @gy
    private static /* synthetic */ boolean VH;

    @fy
    private static /* synthetic */ boolean Zo;

    @dy(field = 2751988482683148813L)
    private static int v5;

    @dy(field = 1558666068114144180L)
    private final JavaScriptLanguage DW;

    @dy(field = -2014007165958632375L)
    private final Model j6;

    static {
        try {
            iy.Zo(JavaScriptSignatureAnalyzer.class);
            if (Zo) {
                iy.gn(-578270541748381287L, null);
            }
            FH = new CRC32();
            Hw = new byte[1024];
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -578270541748381287L, null);
            }
            throw th;
        }
    }

    @ey(method = 136553616711988968L)
    public JavaScriptSignatureAnalyzer(Model model, JavaScriptLanguage javaScriptLanguage) {
        try {
            if (Zo) {
                iy.EQ(36942952902911127L, null, model, javaScriptLanguage);
            }
            this.j6 = model;
            this.DW = javaScriptLanguage;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 36942952902911127L, null, model, javaScriptLanguage);
            }
            throw th;
        }
    }

    @ey(method = -615445277166020112L)
    private void Mr(SyntaxTree syntaxTree, int i, Member member) {
        try {
            if (Zo) {
                iy.we(148504639870191868L, this, syntaxTree, new Integer(i), member);
            }
            if (syntaxTree.getChildCount(i) == 4) {
                this.j6.entitySpace.lg(member, syntaxTree.getStartLine(syntaxTree.getChildNode(i, 1)), syntaxTree.getStartColumn(syntaxTree.getChildNode(i, 1)), syntaxTree.getEndColumn(syntaxTree.getChildNode(i, 1)), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i));
            } else {
                this.j6.entitySpace.lg(member, syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getStartColumn(i), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, 148504639870191868L, this, syntaxTree, new Integer(i), member);
            }
            throw th;
        }
    }

    @ey(method = -203801530200587480L)
    private void QX(SyntaxTree syntaxTree, int i) {
        try {
            if (Zo) {
                iy.EQ(-6519143052527685076L, this, syntaxTree, new Integer(i));
            }
            yS(syntaxTree.getChildCount(i));
            yS(syntaxTree.getSyntaxTag(i));
            if (syntaxTree.getSyntaxTag(i) == 1) {
                yS(syntaxTree.getIdentifier(i));
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i2 = 0; i2 < childCount; i2++) {
                QX(syntaxTree, syntaxTree.getChildNode(i, i2));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -6519143052527685076L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 510940519274113368L)
    private void U2(SyntaxTree syntaxTree, int i, Member member) throws Throwable {
        try {
            if (Zo) {
                iy.we(-5698397579974578752L, this, syntaxTree, new Integer(i), member);
            }
            try {
                this.j6.entitySpace.lg(member, syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndColumn(i), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i));
            } catch (Throwable th) {
                th = th;
                if (VH) {
                    iy.U2(th, -5698397579974578752L, this, syntaxTree, new Integer(i), member);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @ey(method = 2182778896435289577L)
    private static void Ws() {
        try {
            if (Zo) {
                iy.gn(-1727557539108861661L, null);
            }
            FH.update(Hw, 0, v5);
            v5 = 0;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -1727557539108861661L, null);
            }
            throw th;
        }
    }

    @ey(method = -2326690103070503659L)
    private void XL(SyntaxTree syntaxTree, int i) {
        try {
            if (Zo) {
                iy.EQ(-412992017932872789L, this, syntaxTree, new Integer(i));
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i2 = 0; i2 < childCount; i2++) {
                XL(syntaxTree, syntaxTree.getChildNode(i, i2));
            }
            int syntaxTag = syntaxTree.getSyntaxTag(i);
            if (syntaxTag == 1) {
                if (((JavaScriptSyntax) this.DW.getSyntax()).Xa(syntaxTree, i)) {
                    yS(syntaxTree.getIdentifier(i));
                    return;
                } else {
                    if (((JavaScriptSyntax) this.DW.getSyntax()).Eq(syntaxTree, i)) {
                        QX(syntaxTree, ((JavaScriptSyntax) this.DW.getSyntax()).wc(syntaxTree, i));
                        yS(syntaxTree.getIdentifier(i));
                        return;
                    }
                    return;
                }
            }
            if (syntaxTag == 125) {
                yS(syntaxTree.getIdentifier(syntaxTree.getChildNode(i, 1)));
                QX(syntaxTree, syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 2));
                yS(syntaxTree.getDeclarationNumber(i));
            } else {
                if (syntaxTag != 207) {
                    return;
                }
                yS(syntaxTree.getIdentifier(syntaxTree.getChildNode(i, 0)));
                yS(syntaxTree.getDeclarationNumber(i));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -412992017932872789L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 853280443102221100L)
    private void a8(SyntaxTree syntaxTree, int i, Member member) {
        try {
            if (Zo) {
                iy.we(1073815109106563024L, this, syntaxTree, new Integer(i), member);
            }
            int childCount = syntaxTree.getChildCount(i);
            if (childCount > 2) {
                int i2 = 0;
                for (int i3 = 1; i3 < childCount; i3 += 2) {
                    this.j6.entitySpace.ro(member, 0, syntaxTree.getIdentifier(syntaxTree.getChildNode(syntaxTree.getChildNode(i, i3), 0)), i2);
                    i2++;
                }
            }
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, 1073815109106563024L, this, syntaxTree, new Integer(i), member);
            }
            throw th;
        }
    }

    @ey(method = 2553623690812667921L)
    private long aM() {
        try {
            if (Zo) {
                iy.gn(-403124829657692529L, this);
            }
            Ws();
            return FH.getValue();
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -403124829657692529L, this);
            }
            throw th;
        }
    }

    @ey(method = 388031049328708240L)
    private void er(SyntaxTree syntaxTree, int i, Member member) throws Throwable {
        try {
            if (Zo) {
                iy.we(398161421863798980L, this, syntaxTree, new Integer(i), member);
            }
            try {
                this.j6.entitySpace.lg(member, syntaxTree.getStartLine(syntaxTree.getChildNode(i, 0)), syntaxTree.getStartColumn(syntaxTree.getChildNode(i, 0)), syntaxTree.getEndColumn(syntaxTree.getChildNode(i, 0)), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i));
            } catch (Throwable th) {
                th = th;
                if (VH) {
                    iy.U2(th, 398161421863798980L, this, syntaxTree, new Integer(i), member);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @ey(method = 4069050308345391103L)
    private static void j3() {
        try {
            if (Zo) {
                iy.gn(3520811479070790905L, null);
            }
            FH.reset();
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 3520811479070790905L, null);
            }
            throw th;
        }
    }

    @ey(method = 4020393277845495615L)
    private void lg(SyntaxTree syntaxTree, int i) {
        try {
            if (Zo) {
                iy.EQ(3250916006956638165L, this, syntaxTree, new Integer(i));
            }
            int syntaxTag = syntaxTree.getSyntaxTag(i);
            try {
                if (syntaxTag != 1) {
                    if (syntaxTag == 125) {
                        Mr(syntaxTree, i, this.j6.entitySpace.jw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(i)));
                    } else if (syntaxTag == 207) {
                        er(syntaxTree, i, this.j6.entitySpace.jw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(i)));
                    }
                } else if (((JavaScriptSyntax) this.DW.getSyntax()).Eq(syntaxTree, i) || ((JavaScriptSyntax) this.DW.getSyntax()).Xa(syntaxTree, i)) {
                    U2(syntaxTree, i, this.j6.entitySpace.jw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(i)));
                }
            } catch (e4 unused) {
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i2 = 0; i2 < childCount; i2++) {
                lg(syntaxTree, syntaxTree.getChildNode(i, i2));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 3250916006956638165L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01c2 A[Catch: all -> 0x01cd, TRY_LEAVE, TryCatch #2 {all -> 0x01cd, blocks: (B:42:0x01bc, B:44:0x01c2), top: B:61:0x01bc }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[SYNTHETIC] */
    @abcd.ey(method = -478754788896133232L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void rN(com.aide.codemodel.api.SyntaxTree r24, int r25, com.aide.codemodel.api.ClassType r26, com.aide.codemodel.api.ClassType r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.js.JavaScriptSignatureAnalyzer.rN(com.aide.codemodel.api.SyntaxTree, int, com.aide.codemodel.api.ClassType, com.aide.codemodel.api.ClassType):void");
    }

    @ey(method = 3283479714237974951L)
    private static void yS(int i) {
        try {
            if (Zo) {
                iy.u7(-1577596110202013335L, null, i);
            }
            if (v5 + 4 > Hw.length) {
                Ws();
            }
            byte[] bArr = Hw;
            int i2 = v5;
            int i3 = i2 + 1;
            v5 = i3;
            bArr[i2] = (byte) (i & 255);
            byte[] bArr2 = Hw;
            int i4 = i3 + 1;
            v5 = i4;
            bArr2[i3] = (byte) ((i >> 8) & 255);
            byte[] bArr3 = Hw;
            int i5 = i4 + 1;
            v5 = i5;
            bArr3[i4] = (byte) ((i >> 16) & 255);
            byte[] bArr4 = Hw;
            v5 = i5 + 1;
            bArr4[i5] = (byte) ((i >> 24) & 255);
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -1577596110202013335L, null, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = 34417799158951761L)
    public void DW(ClassType classType) {
        try {
            if (Zo) {
                iy.tp(-2645232865929319157L, this, classType);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -2645232865929319157L, this, classType);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = 1911068732598147759L)
    public void EQ(ClassType classType) {
        try {
            if (Zo) {
                iy.tp(-4912038280803274535L, this, classType);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -4912038280803274535L, this, classType);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = -3318424903815493744L)
    public void Hw(ClassType classType) {
        try {
            if (Zo) {
                iy.tp(1464422685763247232L, this, classType);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 1464422685763247232L, this, classType);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = 2221596938040856087L)
    public void Zo(Member member) {
        try {
            if (Zo) {
                iy.tp(596297141575138317L, this, member);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 596297141575138317L, this, member);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = -1939403415183835869L)
    public void doLoadPositions(FileEntry fileEntry) {
        try {
            if (Zo) {
                iy.tp(2546885854549646073L, this, fileEntry);
            }
            SyntaxTree syntaxTreeV5 = this.j6.syntaxTreeSpace.v5(fileEntry, this.DW);
            lg(syntaxTreeV5, syntaxTreeV5.getRootNode());
            this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTreeV5);
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 2546885854549646073L, this, fileEntry);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = 1502183876033155392L)
    public void doLoadSuperClassTypes(ClassType classType) {
        try {
            if (Zo) {
                iy.tp(2031789500873093976L, this, classType);
            }
            this.j6.entitySpace.nw(classType);
            this.j6.entitySpace.SI(classType);
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 2031789500873093976L, this, classType);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = 2368075514709231668L)
    public void doLoadSyntax(FileEntry fileEntry) {
        try {
            if (Zo) {
                iy.tp(2538852932678656416L, this, fileEntry);
            }
            SyntaxTree syntaxTreeV5 = this.j6.syntaxTreeSpace.v5(fileEntry, this.DW);
            rN(syntaxTreeV5, syntaxTreeV5.getRootNode(), null, null);
            this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTreeV5);
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 2538852932678656416L, this, fileEntry);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = -1477976891286996072L)
    public void doLoadTypes(FileEntry fileEntry) {
        try {
            if (Zo) {
                iy.tp(705932434225586764L, this, fileEntry);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 705932434225586764L, this, fileEntry);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = 3538260125497350000L)
    public long getClassDeclarationDigest(SyntaxTree syntaxTree) {
        try {
            if (!Zo) {
                return 10L;
            }
            iy.tp(-1010536494464688800L, this, syntaxTree);
            return 10L;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -1010536494464688800L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = -124937629787398400L)
    public long getDeclarationDigest(SyntaxTree syntaxTree) {
        try {
            if (Zo) {
                iy.tp(-3000785954341167960L, this, syntaxTree);
            }
            j3();
            XL(syntaxTree, syntaxTree.getRootNode());
            return aM();
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -3000785954341167960L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = -3676666289887952575L)
    public long getPublicDeclarationDigest(SyntaxTree syntaxTree) {
        try {
            if (Zo) {
                iy.tp(-578343463032491893L, this, syntaxTree);
            }
            return getDeclarationDigest(syntaxTree);
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -578343463032491893L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = -650428410377254464L)
    public long j6(SyntaxTree syntaxTree) {
        try {
            if (!Zo) {
                return 10L;
            }
            iy.tp(-51165185849284008L, this, syntaxTree);
            return 10L;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -51165185849284008L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = 6476624396619671351L)
    public void tp(FileEntry fileEntry) {
        try {
            if (Zo) {
                iy.tp(-4109783220531502675L, this, fileEntry);
            }
            this.j6.entitySpace.XL(fileEntry, this.DW, ((JavaScriptTypeSystem) this.DW.getTypeSystem()).Ws(), fileEntry.getNameIdentifier(), false, 0);
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -4109783220531502675L, this, fileEntry);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.SignatureAnalyzer
    @ey(method = -828235388415763761L)
    public void v5(SyntaxTree syntaxTree) {
        try {
            if (Zo) {
                iy.tp(7654340275114018577L, this, syntaxTree);
            }
            ((z6) syntaxTree.getLanguage().getCodeAnalyzer()).EQ(syntaxTree);
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 7654340275114018577L, this, syntaxTree);
            }
            throw th;
        }
    }
}
