package abcd;

import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.collections.FunctionOfIntInt;
import com.aide.codemodel.api.collections.ListOfInt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@cy(clazz = 96016040932816416L, container = 96016040932816416L, user = true)
/* loaded from: classes.dex */
public class f2 {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = 2426137970212272804L)
    private Map<SyntaxTree, FunctionOfIntInt> DW;

    @dy(field = -4408429266308845455L)
    private Map<SyntaxTree, ListOfInt> j6;

    static {
        iy.Zo(f2.class);
    }

    @ey(method = 3221920501161721668L)
    public f2() {
        try {
            if (FH) {
                iy.gn(-873453566750144912L, null);
            }
            this.j6 = new HashMap();
            this.DW = new HashMap();
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -873453566750144912L, null);
            }
            throw th;
        }
    }

    @ey(method = -2413201307543230776L)
    private void Hw(SyntaxTree syntaxTree, int i) {
        try {
            if (FH) {
                iy.EQ(1052038899316812672L, this, syntaxTree, new Integer(i));
            }
            int childCount = syntaxTree.getChildCount(i);
            if (childCount <= 0) {
                DW(syntaxTree, i);
                return;
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                Hw(syntaxTree, syntaxTree.getChildNode(i, i2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 1052038899316812672L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -6072628621030856643L)
    public void DW(SyntaxTree syntaxTree, int i) {
        try {
            if (FH) {
                iy.EQ(-1221348338000899797L, this, syntaxTree, new Integer(i));
            }
            if (!this.DW.containsKey(syntaxTree)) {
                this.DW.put(syntaxTree, new FunctionOfIntInt());
                this.j6.put(syntaxTree, new ListOfInt());
            }
            FunctionOfIntInt functionOfIntInt = this.DW.get(syntaxTree);
            ListOfInt listOfInt = this.j6.get(syntaxTree);
            if (functionOfIntInt.Hw(i)) {
                return;
            }
            functionOfIntInt.Zo(i, listOfInt.size());
            listOfInt.push(i);
            listOfInt.push(syntaxTree.getStartLine(i));
            listOfInt.push(syntaxTree.getStartColumn(i));
            listOfInt.push(syntaxTree.getEndLine(i));
            listOfInt.push(syntaxTree.getEndColumn(i));
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -1221348338000899797L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1851129407159455680L)
    public int EQ(SyntaxTree syntaxTree, int i) {
        try {
            if (FH) {
                iy.EQ(-2334318062169731040L, this, syntaxTree, new Integer(i));
            }
            if (this.DW.containsKey(syntaxTree)) {
                FunctionOfIntInt functionOfIntInt = this.DW.get(syntaxTree);
                ListOfInt listOfInt = this.j6.get(syntaxTree);
                if (functionOfIntInt.Hw(i)) {
                    return listOfInt.get(functionOfIntInt.get(i) + 1);
                }
                if (syntaxTree.getChildCount(i) > 0) {
                    return EQ(syntaxTree, syntaxTree.getChildNode(i, 0));
                }
            }
            return syntaxTree.getStartLine(i);
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -2334318062169731040L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -13188957330993555L)
    public void FH(SyntaxTree syntaxTree) {
        try {
            if (FH) {
                iy.tp(-6826933370259925461L, this, syntaxTree);
            }
            Hw(syntaxTree, syntaxTree.getRootNode());
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -6826933370259925461L, this, syntaxTree);
            }
            throw th;
        }
    }

    @ey(method = -53390221004083920L)
    public void J0(int i, int i2, String str) {
        try {
            if (FH) {
                iy.we(-2594195630149333344L, this, new Integer(i), new Integer(i2), str);
            }
            if (str.lastIndexOf(10) == -1) {
                we(i, i2, str.length());
                return;
            }
            we(i, i2, (str.length() - str.lastIndexOf(10)) - 1);
            int i3 = 0;
            for (int i4 = 0; i4 < str.length(); i4++) {
                if (str.charAt(i4) == '\n') {
                    i3++;
                }
            }
            for (int i5 = 0; i5 < i3; i5++) {
                J8(i, i2);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -2594195630149333344L, this, new Integer(i), new Integer(i2), str);
            }
            throw th;
        }
    }

    @ey(method = -2914113909852503424L)
    public void J8(int i, int i2) {
        try {
            if (FH) {
                iy.EQ(-3395920819695763320L, this, new Integer(i), new Integer(i2));
            }
            Iterator<Map.Entry<SyntaxTree, FunctionOfIntInt>> it = this.DW.entrySet().iterator();
            while (it.hasNext()) {
                ListOfInt listOfInt = this.j6.get(it.next().getKey());
                for (int i3 = 0; i3 < listOfInt.size(); i3 += 5) {
                    int i4 = i3 + 1;
                    int i5 = listOfInt.get(i4);
                    int i6 = i3 + 2;
                    int i7 = listOfInt.get(i6);
                    int i8 = i3 + 3;
                    int i9 = listOfInt.get(i8);
                    int i10 = i3 + 4;
                    int i11 = listOfInt.get(i10);
                    if (i9 >= i) {
                        if (i5 > i) {
                            listOfInt.gn(i4, i5 + 1);
                        } else if (i5 == i && i7 >= i2) {
                            listOfInt.gn(i4, i5 + 1);
                            listOfInt.gn(i6, (i7 - i2) + 1);
                        }
                        if (i9 > i) {
                            listOfInt.gn(i8, i9 + 1);
                        } else if (i9 == i && i11 > i2) {
                            listOfInt.gn(i8, i9 + 1);
                            listOfInt.gn(i10, (i11 - i2) + 1);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -3395920819695763320L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 1744559426042977920L)
    public void QX(int i, int i2, int i3) {
        try {
            if (FH) {
                iy.we(-283645023438969500L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            we(i, i2, -i3);
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -283645023438969500L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 4233315888138385573L)
    public int VH(SyntaxTree syntaxTree, int i) {
        try {
            if (FH) {
                iy.EQ(1277736828765881303L, this, syntaxTree, new Integer(i));
            }
            if (this.DW.containsKey(syntaxTree)) {
                FunctionOfIntInt functionOfIntInt = this.DW.get(syntaxTree);
                ListOfInt listOfInt = this.j6.get(syntaxTree);
                if (functionOfIntInt.Hw(i)) {
                    return listOfInt.get(functionOfIntInt.get(i) + 4);
                }
                if (syntaxTree.getChildCount(i) > 0) {
                    return VH(syntaxTree, syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1));
                }
            }
            return syntaxTree.getEndColumn(i);
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 1277736828765881303L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 72045483941798757L)
    public void Ws(int i, int i2, int i3, int i4, int i5, int i6) {
        try {
            if (FH) {
                iy.QX(-4984097205316103937L, this, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            }
            if (i3 == i5) {
                we(i, i2, i6 - i4);
                return;
            }
            we(i, i2, i6 - 1);
            for (int i7 = i3; i7 < i5; i7++) {
                J8(i, i2);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.rN(th, -4984097205316103937L, this, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            }
            throw th;
        }
    }

    @ey(method = 3188309394993088680L)
    public void XL(int i, int i2, int i3, int i4) {
        try {
            if (FH) {
                iy.J0(-2809025266160866140L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            if (i == i3) {
                QX(i, i2, i4 - i2);
                return;
            }
            QX(i3, 1, i4 - i2);
            Iterator<Map.Entry<SyntaxTree, FunctionOfIntInt>> it = this.DW.entrySet().iterator();
            while (it.hasNext()) {
                SyntaxTree key = it.next().getKey();
                this.DW.get(key);
                ListOfInt listOfInt = this.j6.get(key);
                for (int i5 = 0; i5 < listOfInt.size(); i5 += 5) {
                    int i6 = i5 + 1;
                    if (listOfInt.get(i6) > i) {
                        listOfInt.gn(i6, listOfInt.get(i6) - (i3 - i));
                    }
                    int i7 = i5 + 3;
                    if (listOfInt.get(i7) > i) {
                        listOfInt.gn(i7, listOfInt.get(i7) - (i3 - i));
                    }
                }
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, -2809025266160866140L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -1283768962681350789L)
    public void Zo() {
        try {
            if (FH) {
                iy.gn(-214772319762607887L, this);
            }
            this.j6.clear();
            this.DW.clear();
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -214772319762607887L, this);
            }
            throw th;
        }
    }

    @ey(method = -73106699490074880L)
    public void aM(int i, int i2, int i3, int i4, String str) {
        try {
            if (FH) {
                iy.J8(4866245994654730920L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str);
            }
            XL(i, i2, i3, i4);
            J0(i, i2, str);
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, 4866245994654730920L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str);
            }
            throw th;
        }
    }

    @ey(method = -2110652063330819080L)
    public int gn(int i) {
        try {
            if (FH) {
                iy.u7(-757305739484004480L, this, i);
            }
            Iterator<Map.Entry<SyntaxTree, FunctionOfIntInt>> it = this.DW.entrySet().iterator();
            while (it.hasNext()) {
                SyntaxTree key = it.next().getKey();
                FunctionOfIntInt functionOfIntInt = this.DW.get(key);
                ListOfInt listOfInt = this.j6.get(key);
                if (functionOfIntInt.Hw(i)) {
                    return listOfInt.get(functionOfIntInt.get(i) + 3);
                }
            }
            return 0;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -757305739484004480L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -915370117387646000L)
    public void j6(int i, int i2, int i3, int i4, int i5) {
        try {
            if (FH) {
                iy.J8(3205626306066977772L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5));
            }
            if (!this.DW.containsKey(null)) {
                this.DW.put(null, new FunctionOfIntInt());
                this.j6.put(null, new ListOfInt());
            }
            FunctionOfIntInt functionOfIntInt = this.DW.get(null);
            ListOfInt listOfInt = this.j6.get(null);
            functionOfIntInt.Zo(i, listOfInt.size());
            listOfInt.push(i);
            listOfInt.push(i2);
            listOfInt.push(i3);
            listOfInt.push(i4);
            listOfInt.push(i5);
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, 3205626306066977772L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5));
            }
            throw th;
        }
    }

    @ey(method = -4060409474319263400L)
    public int tp(SyntaxTree syntaxTree, int i) {
        try {
            if (FH) {
                iy.EQ(3681006031549009852L, this, syntaxTree, new Integer(i));
            }
            if (this.DW.containsKey(syntaxTree)) {
                FunctionOfIntInt functionOfIntInt = this.DW.get(syntaxTree);
                ListOfInt listOfInt = this.j6.get(syntaxTree);
                if (functionOfIntInt.Hw(i)) {
                    return listOfInt.get(functionOfIntInt.get(i) + 2);
                }
                if (syntaxTree.getChildCount(i) > 0) {
                    return tp(syntaxTree, syntaxTree.getChildNode(i, 0));
                }
            }
            return syntaxTree.getStartColumn(i);
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 3681006031549009852L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2638816202829197003L)
    public int u7(SyntaxTree syntaxTree, int i) {
        try {
            if (FH) {
                iy.EQ(1140192021243084387L, this, syntaxTree, new Integer(i));
            }
            if (this.DW.containsKey(syntaxTree)) {
                FunctionOfIntInt functionOfIntInt = this.DW.get(syntaxTree);
                ListOfInt listOfInt = this.j6.get(syntaxTree);
                if (functionOfIntInt.Hw(i)) {
                    return listOfInt.get(functionOfIntInt.get(i) + 3);
                }
                if (syntaxTree.getChildCount(i) > 0) {
                    return u7(syntaxTree, syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1));
                }
            }
            return syntaxTree.getEndLine(i);
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 1140192021243084387L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 225503763646038316L)
    public void v5(List<SyntaxTree> list) {
        try {
            if (FH) {
                iy.tp(372526027980523928L, this, list);
            }
            Iterator<SyntaxTree> it = list.iterator();
            while (it.hasNext()) {
                FH(it.next());
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 372526027980523928L, this, list);
            }
            throw th;
        }
    }

    @ey(method = 5344042165665363783L)
    public void we(int i, int i2, int i3) {
        try {
            if (FH) {
                iy.we(2162255955349383045L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            Iterator<Map.Entry<SyntaxTree, FunctionOfIntInt>> it = this.DW.entrySet().iterator();
            while (it.hasNext()) {
                SyntaxTree key = it.next().getKey();
                this.DW.get(key);
                ListOfInt listOfInt = this.j6.get(key);
                for (int i4 = 0; i4 < listOfInt.size(); i4 += 5) {
                    if (listOfInt.get(i4 + 1) == i) {
                        int i5 = i4 + 2;
                        if (listOfInt.get(i5) >= i2) {
                            listOfInt.gn(i5, listOfInt.get(i5) + i3);
                        }
                    }
                    if (listOfInt.get(i4 + 3) == i) {
                        int i6 = i4 + 4;
                        if (listOfInt.get(i6) > i2) {
                            listOfInt.gn(i6, listOfInt.get(i6) + i3);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 2162255955349383045L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }
}
