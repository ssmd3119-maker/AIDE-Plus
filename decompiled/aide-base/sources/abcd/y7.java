package abcd;

import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.abstraction.CodeModel;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.collections.SetOfInt;
import com.aide.codemodel.language.dtd.DtdCodeModel;
import com.aide.codemodel.language.dtd.DtdLanguage;
import com.aide.codemodel.language.xml.XmlLanguage;

@cy(clazz = -6553469251524998088L, container = -6553469251524998088L, user = true)
/* loaded from: classes.dex */
public class y7 {

    @fy
    private static /* synthetic */ boolean VH;

    @gy
    private static /* synthetic */ boolean gn;

    @dy(field = 2554765310051338752L)
    private final XmlLanguage DW;

    @dy(field = 678526181287876227L)
    private boolean FH;

    @dy(field = -4208507420190709308L)
    private s7 Hw;

    @dy(field = -766012252737081964L)
    private f5 Zo;

    @dy(field = 1088467051816134375L)
    private final Model j6;

    @dy(field = 5584195388314179868L)
    private v7 v5;

    static {
        iy.Zo(y7.class);
    }

    @ey(method = 1567510674933326552L)
    public y7(Model model, XmlLanguage xmlLanguage, boolean z) {
        try {
            if (VH) {
                iy.we(-4110858550758843664L, null, model, xmlLanguage, new Boolean(z));
            }
            this.j6 = model;
            this.DW = xmlLanguage;
            this.FH = z;
            this.Hw = new s7(model);
            if (z) {
                this.v5 = new v7(model);
            } else {
                this.Zo = new f5(model);
            }
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, -4110858550758843664L, null, model, xmlLanguage, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 1214900759881820089L)
    private int Hw(FileEntry fileEntry, int i, int i2) {
        try {
            if (VH) {
                iy.we(1670941231758741536L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            String strMr = fileEntry.Mr(i, i2);
            int length = strMr.length() + 1;
            while (true) {
                int i3 = length - 2;
                if (i3 < 0 || !J0(strMr.charAt(i3))) {
                    break;
                }
                length--;
            }
            return length;
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, 1670941231758741536L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 65939156058863780L)
    private boolean J0(char c) {
        try {
            if (VH) {
                iy.tp(-828839546769494003L, this, new Character(c));
            }
            return Character.isJavaIdentifierPart(c) || c == ':';
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, -828839546769494003L, this, new Character(c));
            }
            throw th;
        }
    }

    @ey(method = 7553680814992589155L)
    private DtdCodeModel VH() {
        try {
            if (VH) {
                iy.gn(-805057356734530920L, this);
            }
            for (CodeModel codeModel : this.j6.fileSpace.getCodeModels()) {
                if (codeModel instanceof DtdCodeModel) {
                    return (DtdCodeModel) codeModel;
                }
            }
            return null;
        } catch (Throwable th) {
            if (gn) {
                iy.aM(th, -805057356734530920L, this);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    @abcd.ey(method = -907795314572897751L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private abcd.n5 Zo(com.aide.codemodel.api.SyntaxTree r10) {
        /*
            r9 = this;
            r0 = -82699689126199140(0xfeda31122699009c, double:-1.1225845597971494E303)
            boolean r2 = abcd.y7.VH     // Catch: java.lang.Throwable -> La3
            if (r2 == 0) goto Lc
            abcd.iy.tp(r0, r9, r10)     // Catch: java.lang.Throwable -> La3
        Lc:
            com.aide.codemodel.language.dtd.DtdCodeModel r2 = r9.VH()     // Catch: java.lang.Throwable -> La3
            r3 = 0
            if (r2 != 0) goto L14
            return r3
        L14:
            int r4 = r10.getRootNode()     // Catch: java.lang.Throwable -> La3
            int r4 = r9.u7(r10, r4)     // Catch: java.lang.Throwable -> La3
            if (r4 <= 0) goto L73
            r5 = 2
            int r6 = r10.getChildNode(r4, r5)     // Catch: java.lang.Throwable -> La3
            int r6 = r10.getSyntaxTag(r6)     // Catch: java.lang.Throwable -> La3
            r7 = 215(0xd7, float:3.01E-43)
            r8 = 1
            if (r6 != r7) goto L49
            int r4 = r10.getChildNode(r4, r5)     // Catch: java.lang.Throwable -> La3
            int r4 = r10.getChildNode(r4, r8)     // Catch: java.lang.Throwable -> La3
            java.lang.String r4 = r10.getLiteralString(r4)     // Catch: java.lang.Throwable -> La3
            int r6 = r4.length()     // Catch: java.lang.Throwable -> La3
            if (r6 < r5) goto L47
            int r5 = r4.length()     // Catch: java.lang.Throwable -> La3
            int r5 = r5 - r8
            java.lang.String r4 = r4.substring(r8, r5)     // Catch: java.lang.Throwable -> La3
        L47:
            r5 = r3
            goto L75
        L49:
            int r6 = r10.getChildNode(r4, r5)     // Catch: java.lang.Throwable -> La3
            int r6 = r10.getSyntaxTag(r6)     // Catch: java.lang.Throwable -> La3
            r7 = 214(0xd6, float:3.0E-43)
            if (r6 != r7) goto L73
            int r4 = r10.getChildNode(r4, r5)     // Catch: java.lang.Throwable -> La3
            int r4 = r10.getChildNode(r4, r8)     // Catch: java.lang.Throwable -> La3
            java.lang.String r4 = r10.getLiteralString(r4)     // Catch: java.lang.Throwable -> La3
            int r6 = r4.length()     // Catch: java.lang.Throwable -> La3
            if (r6 < r5) goto L70
            int r5 = r4.length()     // Catch: java.lang.Throwable -> La3
            int r5 = r5 - r8
            java.lang.String r4 = r4.substring(r8, r5)     // Catch: java.lang.Throwable -> La3
        L70:
            r5 = r4
            r4 = r3
            goto L75
        L73:
            r4 = r3
            r5 = r4
        L75:
            boolean r6 = r9.FH     // Catch: java.lang.Throwable -> La3
            if (r6 == 0) goto L88
            if (r4 == 0) goto L80
            abcd.n5 r10 = r9.EQ(r4)     // Catch: java.lang.Throwable -> La3
            return r10
        L80:
            if (r5 == 0) goto L87
            abcd.n5 r10 = r9.we(r5)     // Catch: java.lang.Throwable -> La3
            return r10
        L87:
            return r3
        L88:
            if (r4 != 0) goto L93
            java.lang.String r3 = r2.j3()     // Catch: java.lang.Throwable -> La3
            abcd.n5 r10 = r2.U2(r3)     // Catch: java.lang.Throwable -> La3
            return r10
        L93:
            abcd.n5 r3 = r2.U2(r4)     // Catch: java.lang.Throwable -> La3
            if (r3 == 0) goto L9a
            return r3
        L9a:
            java.lang.String r3 = r2.j3()     // Catch: java.lang.Throwable -> La3
            abcd.n5 r10 = r2.U2(r3)     // Catch: java.lang.Throwable -> La3
            return r10
        La3:
            r2 = move-exception
            boolean r3 = abcd.y7.gn
            if (r3 == 0) goto Lab
            abcd.iy.j3(r2, r0, r9, r10)
        Lab:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.y7.Zo(com.aide.codemodel.api.SyntaxTree):abcd.n5");
    }

    @ey(method = 3642098509250505743L)
    private Language gn() {
        try {
            if (VH) {
                iy.gn(-5293507277878451424L, this);
            }
            for (Language language : VH().getLanguages()) {
                if (language instanceof DtdLanguage) {
                    return language;
                }
            }
            return null;
        } catch (Throwable th) {
            if (gn) {
                iy.aM(th, -5293507277878451424L, this);
            }
            throw th;
        }
    }

    @ey(method = 192219022027534224L)
    private void j6(SyntaxTree syntaxTree, int i) {
        try {
            if (VH) {
                iy.EQ(-570230714581601957L, this, syntaxTree, new Integer(i));
            }
            if (!this.FH) {
                if (syntaxTree.getIdentifier(syntaxTree.getChildNode(syntaxTree.getChildNode(i, 0), 2)) == this.j6.identifierSpace.get("class")) {
                    this.Zo.j6();
                }
            } else {
                if (this.v5 == null || !this.v5.Hw(syntaxTree.getFile())) {
                    return;
                }
                this.v5.j6(syntaxTree, i);
            }
        } catch (Throwable th) {
            if (gn) {
                iy.Mr(th, -570230714581601957L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1210751493155361875L)
    private int tp(SyntaxTree syntaxTree, int i) {
        try {
            if (VH) {
                iy.EQ(-425299482599701624L, this, syntaxTree, new Integer(i));
            }
            return syntaxTree.getChildNode(syntaxTree.getChildNode(i, 1), 2);
        } catch (Throwable th) {
            if (gn) {
                iy.Mr(th, -425299482599701624L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2914957763822349713L)
    private int u7(SyntaxTree syntaxTree, int i) {
        try {
            if (VH) {
                iy.EQ(-2194475519909563008L, this, syntaxTree, new Integer(i));
            }
            if (syntaxTree.getSyntaxTag(i) == 213) {
                return i;
            }
            for (int i2 = 0; i2 < syntaxTree.getChildCount(i); i2++) {
                int iU7 = u7(syntaxTree, syntaxTree.getChildNode(i, i2));
                if (iU7 != -1) {
                    return iU7;
                }
            }
            return -1;
        } catch (Throwable th) {
            if (gn) {
                iy.Mr(th, -2194475519909563008L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 626336715093634444L)
    private int v5(SyntaxTree syntaxTree, int i) {
        try {
            if (VH) {
                iy.EQ(218382541247910625L, this, syntaxTree, new Integer(i));
            }
            int parentNode = syntaxTree.getParentNode(syntaxTree.getParentNode(i));
            while (syntaxTree.getSyntaxTag(parentNode) != 200 && syntaxTree.getSyntaxTag(parentNode) != 201) {
                parentNode = syntaxTree.getParentNode(parentNode);
                if (parentNode == syntaxTree.getRootNode()) {
                    return -1;
                }
            }
            return parentNode;
        } catch (Throwable th) {
            if (gn) {
                iy.Mr(th, 218382541247910625L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1473844945939915192L)
    public void DW(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (VH) {
                iy.we(-737299950250461981L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            if (this.v5 != null && this.v5.Hw(syntaxTree.getFile())) {
                this.v5.DW(syntaxTree, i, i2);
                return;
            }
            n5 n5VarZo = Zo(syntaxTree);
            if (n5VarZo == null) {
                return;
            }
            int identifier = syntaxTree.getIdentifier(i2);
            SetOfInt setOfInt = new SetOfInt();
            n5VarZo.j6(identifier, setOfInt);
            setOfInt.default_Iterator.init();
            while (setOfInt.default_Iterator.hasMoreElements()) {
                this.j6.codeCompleterCallback.Zo(this.j6.identifierSpace.getString(setOfInt.default_Iterator.nextKey()) + "=");
            }
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, -737299950250461981L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -4102507418894079104L)
    public n5 EQ(String str) {
        try {
            if (VH) {
                iy.tp(-2652341579847306973L, this, str);
            }
            n5 n5VarU2 = VH().U2(str);
            if (n5VarU2 != null) {
                return n5VarU2;
            }
            FileEntry fileEntryHw = this.Hw.Hw(str);
            if (fileEntryHw == null || fileEntryHw.getCodeModel() != VH()) {
                return null;
            }
            SyntaxTree syntaxTreeV5 = this.j6.syntaxTreeSpace.v5(fileEntryHw, gn());
            n5 n5Var = new n5(this.j6, syntaxTreeV5, true);
            this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTreeV5);
            return n5Var;
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, -2652341579847306973L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 486984413212409200L)
    public void FH(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (VH) {
                iy.we(-1435207603059276475L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            if (this.v5 != null && this.v5.Hw(syntaxTree.getFile())) {
                this.v5.FH(syntaxTree, i, i2);
                return;
            }
            n5 n5VarZo = Zo(syntaxTree);
            if (n5VarZo == null) {
                return;
            }
            int parentNode = syntaxTree.getSyntaxTag(i) == 200 ? syntaxTree.getParentNode(syntaxTree.getParentNode(syntaxTree.getParentNode(i))) : syntaxTree.getParentNode(syntaxTree.getParentNode(i));
            SetOfInt setOfInt = new SetOfInt();
            if (syntaxTree.getSyntaxTag(parentNode) == 210) {
                n5VarZo.FH(syntaxTree.getIdentifier(syntaxTree.getChildNode(syntaxTree.getChildNode(syntaxTree.getChildNode(parentNode, 0), 1), 2)), setOfInt);
            } else {
                n5VarZo.DW(setOfInt);
            }
            setOfInt.default_Iterator.init();
            while (setOfInt.default_Iterator.hasMoreElements()) {
                this.j6.codeCompleterCallback.Zo(this.j6.identifierSpace.getString(setOfInt.default_Iterator.nextKey()));
            }
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, -1435207603059276475L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 202591456558100441L)
    public void J8(SyntaxTree syntaxTree, int i, int i2) {
        int iV5;
        try {
            if (VH) {
                iy.we(870253750043168064L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            this.j6.codeCompleterCallback.j6();
            int iJO = syntaxTree.jO(i, i2);
            if (iJO == -1) {
                int syntaxTagNodeAt = syntaxTree.getSyntaxTagNodeAt(204, i, i2, i, i2);
                if (syntaxTagNodeAt != -1) {
                    j6(syntaxTree, syntaxTree.getParentNode(syntaxTagNodeAt));
                }
            } else if (iJO != -1 && syntaxTree.getSyntaxTag(iJO) == 25 && (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(syntaxTree.getParentNode(iJO))) == 200 || syntaxTree.getSyntaxTag(syntaxTree.getParentNode(syntaxTree.getParentNode(iJO))) == 201)) {
                int parentNode = syntaxTree.getParentNode(syntaxTree.getParentNode(iJO));
                FH(syntaxTree, parentNode, tp(syntaxTree, parentNode));
            } else if (iJO != -1 && syntaxTree.getSyntaxTag(iJO) == 26 && (iV5 = v5(syntaxTree, iJO)) != -1) {
                DW(syntaxTree, iV5, tp(syntaxTree, iV5));
            }
            this.j6.codeCompleterCallback.J8(syntaxTree.getFile(), this.DW, i, i2, Hw(syntaxTree.getFile(), i, i2), false, false);
        } catch (Throwable th) {
            if (gn) {
                iy.U2(th, 870253750043168064L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -73474803530200800L)
    public void Ws(SyntaxTree syntaxTree, int i, int i2, int i3, boolean z) {
        try {
            if (VH) {
                iy.J8(2951900039611941873L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z));
            }
            if (i3 != -1) {
                String strJ3 = syntaxTree.getFile().j3(i);
                if (strJ3.length() < i2 - 1) {
                    return;
                }
                for (int i4 = i3 - 1; i4 < strJ3.length(); i4++) {
                    if (!J0(strJ3.charAt(i4))) {
                        if (i4 + 1 < i2) {
                            this.j6.codeCompleterCallback.QX(syntaxTree.getFile());
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            String strJ32 = syntaxTree.getFile().j3(i);
            int i5 = i2 - 1;
            if (strJ32.length() < i5) {
                return;
            }
            String strSubstring = strJ32.substring(0, i5);
            String strSubstring2 = strJ32.substring(i5, strJ32.length());
            if (strSubstring.length() > 0) {
                char cCharAt = strSubstring.charAt(strSubstring.length() - 1);
                if (cCharAt == '<' || J0(cCharAt)) {
                    if (strSubstring2.length() > 0 && Character.isJavaIdentifierPart(cCharAt) && Character.isJavaIdentifierPart(strSubstring2.charAt(0))) {
                        return;
                    }
                    J8(syntaxTree, i, i2);
                }
            }
        } catch (Throwable th) {
            if (gn) {
                iy.lg(th, 2951900039611941873L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 4447301349873130828L)
    public n5 we(String str) {
        try {
            if (VH) {
                iy.tp(-3627504031245800981L, this, str);
            }
            FileEntry fileEntryV5 = this.Hw.v5(str);
            if (fileEntryV5 == null || fileEntryV5.getCodeModel() != VH()) {
                return null;
            }
            SyntaxTree syntaxTreeV5 = this.j6.syntaxTreeSpace.v5(fileEntryV5, gn());
            n5 n5Var = new n5(this.j6, syntaxTreeV5, true);
            this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTreeV5);
            return n5Var;
        } catch (Throwable th) {
            if (gn) {
                iy.j3(th, -3627504031245800981L, this, str);
            }
            throw th;
        }
    }
}
