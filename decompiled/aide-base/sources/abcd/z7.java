package abcd;

import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.abstraction.FormatOption;
import com.aide.codemodel.api.abstraction.Tools;
import com.aide.codemodel.api.collections.FunctionOfIntInt;
import com.aide.codemodel.api.collections.HashtableOfInt;
import com.aide.codemodel.language.xml.XmlFormatterOption;
import com.aide.codemodel.language.xml.XmlLanguage;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@cy(clazz = -3573630667916939871L, container = -3573630667916939871L, user = true)
/* loaded from: classes.dex */
public class z7 {

    @fy
    private static /* synthetic */ boolean Mr;

    @gy
    private static /* synthetic */ boolean U2;

    @dy(field = -1841665376560236084L)
    private final XmlLanguage DW;

    @dy(field = -3735145937038346567L)
    private int EQ;

    @dy(field = 1521550138869684480L)
    private f2 FH;

    @dy(field = 1518002446582116300L)
    private SyntaxTree Hw;

    @dy(field = 5996807393847178456L)
    private int J0;

    @dy(field = 469516987566909780L)
    private int J8;

    @dy(field = -3301345713744551123L)
    private Map<XmlFormatterOption, Integer> QX;

    @dy(field = 2951666611134107200L)
    private int VH;

    @dy(field = 1514525058985542912L)
    private Map<XmlFormatterOption, Integer> Ws;

    @dy(field = -1270516717018179432L)
    private HashtableOfInt<Tools.a> XL;

    @dy(field = -5290936389857925444L)
    private int Zo;

    @dy(field = -5659688168814485575L)
    private HashtableOfInt<Tools.a> aM;

    @dy(field = -218252828300153504L)
    private boolean gn;

    @dy(field = 2906461360691250208L)
    private int j3;

    @dy(field = -2185745509647707883L)
    private final Model j6;

    @dy(field = 215325330033259905L)
    private int tp;

    @dy(field = 1702172343871092184L)
    private int u7;

    @dy(field = -2793857620188847940L)
    private Set<? extends FormatOption> v5;

    @dy(field = -2524815213021819315L)
    private int we;

    static {
        iy.Zo(z7.class);
    }

    @ey(method = -8018741058187113L)
    public z7(Model model, XmlLanguage xmlLanguage) {
        try {
            if (Mr) {
                iy.EQ(-4908823024787170944L, null, model, xmlLanguage);
            }
            this.j6 = model;
            this.DW = xmlLanguage;
            this.XL = new HashtableOfInt<>();
            this.aM = new HashtableOfInt<>();
        } catch (Throwable th) {
            if (U2) {
                iy.Mr(th, -4908823024787170944L, null, model, xmlLanguage);
            }
            throw th;
        }
    }

    @ey(method = -600513701774932008L)
    private void DW(int i, boolean z) {
        boolean z2;
        try {
            if (Mr) {
                iy.EQ(663863336103250017L, this, new Integer(i), new Boolean(z));
            }
            if (this.Hw.isSyntheticNode(i)) {
                return;
            }
            boolean z3 = true;
            if (this.Hw.getSyntaxTag(i) != 210) {
                for (int childCount = this.Hw.getChildCount(i) - 1; childCount >= 0; childCount--) {
                    DW(this.Hw.getChildNode(i, childCount), z);
                }
                return;
            }
            int childNode = this.Hw.getChildNode(i, 0);
            int childNode2 = this.Hw.getChildNode(i, 1);
            int childNode3 = this.Hw.getChildNode(i, 2);
            boolean z4 = ((this.FH.EQ(this.Hw, i) == this.FH.u7(this.Hw, i) && this.FH.VH(this.Hw, i) <= this.VH) || this.Hw.isSyntheticNode(childNode) || this.Hw.isSyntheticNode(childNode3)) ? false : true;
            if (!z4 || this.Hw.getChildCount(childNode2) <= 0) {
                z2 = true;
            } else {
                int childNode4 = this.Hw.getChildNode(childNode2, 0);
                int childNode5 = this.Hw.getChildNode(childNode2, this.Hw.getChildCount(childNode2) - 1);
                switch (this.Hw.getSyntaxTag(childNode4)) {
                    case 46:
                    case 47:
                    case 48:
                        z4 = false;
                        break;
                }
                z2 = this.Hw.getSyntaxTag(childNode4) != 15 || this.FH.EQ(this.Hw, childNode4) == this.FH.u7(this.Hw, childNode4);
                if (this.Hw.getSyntaxTag(childNode5) == 15 && this.FH.EQ(this.Hw, childNode5) != this.FH.u7(this.Hw, childNode5)) {
                    z3 = false;
                }
            }
            DW(childNode3, z);
            if (this.Hw.getChildCount(childNode2) != 0) {
                if (z4 && z3) {
                    FH(childNode2, childNode3, z);
                }
                DW(childNode2, z);
                if (z4 && z2) {
                    FH(childNode, childNode2, z);
                }
            } else if (z4) {
                FH(childNode, childNode3, z);
            }
            DW(childNode, z);
        } catch (Throwable th) {
            if (U2) {
                iy.Mr(th, 663863336103250017L, this, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -6904024961570103120L)
    private void FH(int i, int i2, boolean z) {
        try {
            if (Mr) {
                iy.we(2039005361945542209L, this, new Integer(i), new Integer(i2), new Boolean(z));
            }
            if (!z && this.v5.contains(XmlFormatterOption.ADJUST_NEWLINES) && this.FH.u7(this.Hw, i) == this.FH.EQ(this.Hw, i2) && this.FH.u7(this.Hw, i) >= this.u7 && this.FH.u7(this.Hw, i) <= this.tp) {
                this.j6.refactoringCallback.nw(this.Hw.getFile(), this.FH.u7(this.Hw, i), this.FH.VH(this.Hw, i), this.FH.u7(this.Hw, i), this.FH.VH(this.Hw, i), "\n");
                this.FH.J8(this.FH.u7(this.Hw, i), this.FH.VH(this.Hw, i));
            }
        } catch (Throwable th) {
            if (U2) {
                iy.U2(th, 2039005361945542209L, this, new Integer(i), new Integer(i2), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 3308201507876917792L)
    private void Hw(int i) {
        try {
            if (Mr) {
                iy.u7(-3842703609555286665L, this, i);
            }
            if (this.Hw.isSyntheticNode(i)) {
                return;
            }
            if (this.Hw.getSyntaxTag(i) == 210) {
                if (this.FH.EQ(this.Hw, i) != this.FH.u7(this.Hw, i)) {
                    int childNode = this.Hw.getChildNode(i, 1);
                    if (this.Hw.getChildCount(childNode) > 0 && (this.Hw.getSyntaxTag(this.Hw.getChildNode(childNode, 0)) == 46 || this.Hw.getSyntaxTag(this.Hw.getChildNode(childNode, 0)) == 48)) {
                        this.XL.VH(this.FH.EQ(this.Hw, i), new Tools.a(this.DW, 0, false, false, 0));
                        this.XL.VH(this.FH.u7(this.Hw, i), new Tools.a(this.DW, 0, false, false, 0));
                    }
                }
            } else if (this.Hw.getSyntaxTag(i) == 46) {
                for (int iEQ = this.FH.EQ(this.Hw, i) + 1; iEQ < this.FH.u7(this.Hw, i); iEQ++) {
                    this.XL.VH(iEQ, new Tools.a(this.DW, 0, false, true, 2000));
                }
            } else if (this.Hw.getSyntaxTag(i) == 6) {
                for (int iEQ2 = this.FH.EQ(this.Hw, i) + 1; iEQ2 < this.FH.u7(this.Hw, i); iEQ2++) {
                    this.XL.VH(iEQ2, new Tools.a(this.DW, 0, false, true, 2000));
                }
            } else if (this.Hw.getSyntaxTag(i) == 48) {
                for (int iEQ3 = this.FH.EQ(this.Hw, i) + 1; iEQ3 < this.FH.u7(this.Hw, i); iEQ3++) {
                    this.XL.VH(iEQ3, new Tools.a(this.DW, 0, false, true, 300));
                }
            } else if (this.Hw.getSyntaxTag(i) == 77) {
                for (int iEQ4 = this.FH.EQ(this.Hw, i) + 1; iEQ4 < this.FH.u7(this.Hw, i); iEQ4++) {
                    this.XL.VH(iEQ4, new Tools.a(this.DW, 0, false, true, 2000));
                }
            }
            if (this.Hw.getSyntaxTag(i) == 47) {
                for (int iEQ5 = this.FH.EQ(this.Hw, i); iEQ5 <= this.FH.u7(this.Hw, i); iEQ5++) {
                    this.XL.VH(iEQ5, new Tools.a(this.DW, 0, false, true, 2000));
                }
            }
            int childCount = this.Hw.getChildCount(i);
            for (int i2 = 0; i2 < childCount; i2++) {
                Hw(this.Hw.getChildNode(i, i2));
            }
        } catch (Throwable th) {
            if (U2) {
                iy.j3(th, -3842703609555286665L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1033245239560220352L)
    private int VH(FunctionOfIntInt functionOfIntInt, int i) {
        try {
            if (Mr) {
                iy.EQ(-4018727931927390825L, this, functionOfIntInt, new Integer(i));
            }
            int iGn = gn(i);
            if (iGn <= 0) {
                return 0;
            }
            int iEQ = this.FH.EQ(this.Hw, iGn);
            return functionOfIntInt.get(iEQ) - this.XL.v5(iEQ).j6;
        } catch (Throwable th) {
            if (U2) {
                iy.Mr(th, -4018727931927390825L, this, functionOfIntInt, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1771357243211453184L)
    private void Ws(int i) {
        try {
            if (Mr) {
                iy.u7(-1969024008753726717L, this, i);
            }
            int iEQ = this.FH.EQ(this.Hw, i);
            if (iEQ != this.we) {
                if (this.we > iEQ) {
                    this.we = iEQ;
                }
                int i2 = 0;
                if (iEQ != this.J0 && this.J0 != -1) {
                    i2 = this.Zo;
                }
                while (this.we < iEQ - 1) {
                    int i3 = this.we + 1;
                    this.we = i3;
                    if (!this.XL.Hw(i3) || this.XL.v5(this.we).Hw > 10) {
                        this.XL.VH(this.we, new Tools.a(this.DW, this.J8 + i2, false, false, 50));
                    }
                }
                if (!this.XL.Hw(iEQ) || this.XL.v5(iEQ).Hw > 10) {
                    this.XL.VH(iEQ, new Tools.a(this.DW, this.EQ + i2, false, false, 10));
                }
                this.we = iEQ;
            }
        } catch (Throwable th) {
            if (U2) {
                iy.j3(th, -1969024008753726717L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 489307222616573952L)
    private int gn(int i) {
        int iEQ;
        try {
            if (Mr) {
                iy.u7(-108449300288056245L, this, i);
            }
            if (!tp(i)) {
                return -1;
            }
            int childCount = this.Hw.getChildCount(i);
            for (int i2 = 0; i2 < childCount; i2++) {
                int iGn = gn(this.Hw.getChildNode(i, i2));
                if (iGn > 0) {
                    return iGn;
                }
            }
            int syntaxTag = this.Hw.getSyntaxTag(i);
            if ((syntaxTag != 201 && syntaxTag != 210) || (iEQ = this.FH.EQ(this.Hw, i)) == 0 || iEQ >= this.u7) {
                return -1;
            }
            if (this.XL.Hw(iEQ)) {
                return i;
            }
            return -1;
        } catch (Throwable th) {
            if (U2) {
                iy.j3(th, -108449300288056245L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -91379094807966336L)
    private void j6(FileEntry fileEntry) {
        try {
            if (Mr) {
                iy.tp(-2996853388593211355L, this, fileEntry);
            }
            if (this.u7 == 1) {
                this.aM.gn(this.XL);
                return;
            }
            int iVH = VH(fileEntry.rN(this.j3), this.Hw.getRootNode());
            this.XL.j6.DW();
            while (this.XL.j6.j6()) {
                this.aM.VH(this.XL.j6.FH(), this.XL.j6.Hw().DW(iVH));
            }
        } catch (Throwable th) {
            if (U2) {
                iy.j3(th, -2996853388593211355L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -6210119737028949165L)
    private boolean tp(int i) {
        try {
            if (Mr) {
                iy.u7(4971205364267411304L, this, i);
            }
            if (this.tp >= this.FH.EQ(this.Hw, i)) {
                if (this.u7 > this.FH.u7(this.Hw, i)) {
                    if (this.FH.u7(this.Hw, i) == 0) {
                    }
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            if (U2) {
                iy.j3(th, 4971205364267411304L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 6014460019104207121L)
    private void u7(int i, boolean z) {
        int i2;
        try {
            if (Mr) {
                iy.EQ(-754790354767754256L, this, new Integer(i), new Boolean(z));
            }
            if (this.Hw.isSyntheticNode(i)) {
                return;
            }
            if (this.Hw.getLanguage().getSyntax().tp(this.Hw.getSyntaxTag(i)) && this.Hw.getSyntaxTag(i) != 15) {
                Ws(i);
            }
            int syntaxTag = this.Hw.getSyntaxTag(i);
            if (syntaxTag != 200 && syntaxTag != 201) {
                if (syntaxTag != 210) {
                    int childCount = this.Hw.getChildCount(i);
                    while (i < childCount) {
                        u7(this.Hw.getChildNode(i, i), z);
                        i++;
                    }
                    return;
                }
                if (tp(i)) {
                    int i3 = this.J0;
                    this.J0 = -1;
                    int childCount2 = this.Hw.getChildCount(i);
                    u7(this.Hw.getChildNode(i, 0), z);
                    i = (this.gn || this.Hw.getSyntaxTag(this.Hw.getChildNode(i, childCount2 + (-1))) != 208) ? 1 : 0;
                    if (i != 0) {
                        this.EQ += this.Zo;
                    }
                    int i4 = this.J8;
                    this.J8 = this.EQ;
                    int i5 = 1;
                    while (true) {
                        i2 = childCount2 - 1;
                        if (i5 >= i2) {
                            break;
                        }
                        u7(this.Hw.getChildNode(i, i5), z);
                        i5++;
                    }
                    if (i != 0) {
                        this.EQ -= this.Zo;
                    }
                    u7(this.Hw.getChildNode(i, i2), z);
                    this.J8 = i4;
                    this.J0 = i3;
                    return;
                }
                return;
            }
            int i6 = this.J0;
            this.J0 = -1;
            int childCount3 = this.Hw.getChildCount(i);
            u7(this.Hw.getChildNode(i, 0), z);
            int i7 = this.EQ + this.Zo;
            this.EQ = i7;
            int i8 = this.J8;
            this.J8 = i7;
            int i9 = 1;
            while (true) {
                int i10 = childCount3 - 1;
                if (i9 >= i10) {
                    this.EQ -= this.Zo;
                    u7(this.Hw.getChildNode(i, i10), z);
                    this.J8 = i8;
                    this.J0 = i6;
                    return;
                }
                u7(this.Hw.getChildNode(i, i9), z);
                i9++;
            }
        } catch (Throwable th) {
            if (U2) {
                iy.Mr(th, -754790354767754256L, this, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -6221415676547439396L)
    public HashtableOfInt<Tools.a> EQ(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3) {
        try {
            if (Mr) {
                iy.J8(4049812684755126403L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            return we(syntaxTree, f2Var, i, i2, false, i3);
        } catch (Throwable th) {
            if (U2) {
                iy.lg(th, 4049812684755126403L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -728840248291932496L)
    public HashtableOfInt<Tools.a> J0(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3) {
        try {
            if (Mr) {
                iy.J8(330936837099678735L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            return we(syntaxTree, f2Var, i, i2, true, i3);
        } catch (Throwable th) {
            if (U2) {
                iy.lg(th, 330936837099678735L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -3996393139552446315L)
    public HashtableOfInt<Tools.a> J8(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3) {
        try {
            if (Mr) {
                iy.J8(2109553454958183720L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            Set<? extends FormatOption> setJ6 = this.j6.Ws().j6(syntaxTree.getLanguage());
            this.v5 = setJ6;
            if (setJ6.contains(XmlFormatterOption.FORMAT_ONPASTE)) {
                return we(syntaxTree, f2Var, i, i2, false, i3);
            }
            return null;
        } catch (Throwable th) {
            if (U2) {
                iy.lg(th, 2109553454958183720L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 6104837175952104543L)
    public Set<? extends FormatOption> QX(SyntaxTree syntaxTree, int i) {
        try {
            if (Mr) {
                iy.EQ(4330133185906489620L, this, syntaxTree, new Integer(i));
            }
            this.v5 = this.j6.Ws().j6(syntaxTree.getLanguage());
            this.Zo = this.j6.Ws().DW(syntaxTree.getLanguage());
            this.VH = this.j6.Ws().VH;
            this.j3 = i;
            this.u7 = 1;
            this.tp = 10000000;
            this.Hw = syntaxTree;
            this.FH = new f2();
            this.Ws = new HashMap();
            this.QX = new HashMap();
            for (XmlFormatterOption xmlFormatterOption : XmlFormatterOption.values()) {
                this.Ws.put(xmlFormatterOption, 0);
                this.QX.put(xmlFormatterOption, 0);
            }
            this.XL.FH();
            this.EQ = 0;
            this.we = 0;
            this.J0 = -1;
            this.J8 = 0;
            u7(syntaxTree.getRootNode(), true);
            DW(syntaxTree.getRootNode(), true);
            HashSet hashSet = new HashSet(this.v5);
            for (XmlFormatterOption xmlFormatterOption2 : XmlFormatterOption.values()) {
                if (this.Ws.get(xmlFormatterOption2).intValue() + this.QX.get(xmlFormatterOption2).intValue() > 0) {
                    if (this.Ws.get(xmlFormatterOption2).intValue() > this.QX.get(xmlFormatterOption2).intValue()) {
                        hashSet.add(xmlFormatterOption2);
                    } else {
                        hashSet.remove(xmlFormatterOption2);
                    }
                }
            }
            return hashSet;
        } catch (Throwable th) {
            if (U2) {
                iy.Mr(th, 4330133185906489620L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 3886582416693264L)
    public int[] Zo(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        int iJO;
        String identifierString;
        try {
            if (Mr) {
                iy.J0(-1380993102729474837L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            this.v5 = this.j6.Ws().j6(syntaxTree.getLanguage());
            String strMr = syntaxTree.getFile().Mr(i, i2);
            if (strMr.endsWith(">")) {
                if (this.v5.contains(XmlFormatterOption.INDENT_ONTYPE)) {
                    return new int[]{i, i};
                }
                return null;
            }
            if (strMr.endsWith("<%")) {
                this.j6.refactoringCallback.a8(syntaxTree.getFile(), i, i2, i, i2, " %>");
                return null;
            }
            if (!strMr.endsWith("</")) {
                return null;
            }
            if (syntaxTree != null && (iJO = syntaxTree.jO(i, i2)) != -1 && syntaxTree.getSyntaxTag(iJO) == 25 && syntaxTree.getSyntaxTag(syntaxTree.getParentNode(syntaxTree.getParentNode(iJO))) == 207) {
                int parentNode = syntaxTree.getParentNode(syntaxTree.getParentNode(syntaxTree.getParentNode(iJO)));
                int childNode = syntaxTree.getChildNode(syntaxTree.getChildNode(syntaxTree.getChildNode(parentNode, 0), 1), 0);
                int childNode2 = syntaxTree.getChildNode(syntaxTree.getChildNode(syntaxTree.getChildNode(parentNode, 0), 1), 2);
                String identifierString2 = syntaxTree.getIdentifierString(childNode);
                if ("".equals(identifierString2)) {
                    identifierString = syntaxTree.getIdentifierString(childNode2);
                } else {
                    identifierString = identifierString2 + ":" + syntaxTree.getIdentifierString(childNode2);
                }
                this.j6.refactoringCallback.nw(syntaxTree.getFile(), i, i2, i, i2, identifierString + ">");
            }
            if (this.v5.contains(XmlFormatterOption.INDENT_ONTYPE)) {
                return new int[]{i, i};
            }
            return null;
        } catch (Throwable th) {
            if (U2) {
                iy.a8(th, -1380993102729474837L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 4819739918336902272L)
    public void v5(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (Mr) {
                iy.J0(-5016590105293173095L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            this.v5 = this.j6.Ws().j6(syntaxTree.getLanguage());
            this.Zo = this.j6.Ws().DW(syntaxTree.getLanguage());
            this.VH = this.j6.Ws().VH;
            this.Hw = syntaxTree;
            this.FH = f2Var;
            this.u7 = i;
            this.tp = i2;
            DW(syntaxTree.getRootNode(), false);
        } catch (Throwable th) {
            if (U2) {
                iy.a8(th, -5016590105293173095L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -1388902998882311649L)
    public HashtableOfInt<Tools.a> we(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, boolean z, int i3) {
        try {
            if (Mr) {
                iy.QX(-5633162184102837312L, this, new Object[]{syntaxTree, f2Var, new Integer(i), new Integer(i2), new Boolean(z), new Integer(i3)});
            }
            this.v5 = this.j6.Ws().j6(syntaxTree.getLanguage());
            this.Zo = this.j6.Ws().DW(syntaxTree.getLanguage());
            this.VH = this.j6.Ws().VH;
            this.j3 = i3;
            this.gn = z;
            this.u7 = i;
            this.tp = i2;
            this.Hw = syntaxTree;
            this.FH = f2Var;
            this.aM.FH();
            this.XL.FH();
            this.EQ = 0;
            this.we = 0;
            this.J0 = -1;
            this.J8 = 0;
            u7(syntaxTree.getRootNode(), false);
            Hw(syntaxTree.getRootNode());
            j6(syntaxTree.getFile());
            return this.aM;
        } catch (Throwable th) {
            if (U2) {
                iy.rN(th, -5633162184102837312L, this, new Object[]{syntaxTree, f2Var, new Integer(i), new Integer(i2), new Boolean(z), new Integer(i3)});
            }
            throw th;
        }
    }
}
