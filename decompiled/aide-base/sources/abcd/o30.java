package abcd;

import abcd.b30;
import abcd.r30;
import abcd.y20;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class o30 {
    private static /* synthetic */ int[] EQ;
    private static final Comparator<b30> tp = new a();
    private List<b30> DW;
    private List<b30> FH;
    private boolean Hw;
    private int gn;
    private List<b30> j6;
    private boolean u7;
    private final p70 v5;
    private int Zo = 60;
    private int VH = -1;

    class a implements Comparator<b30> {
        private static /* synthetic */ int[] WB;

        private String FH(b30 b30Var) {
            return b30Var.v5 == b30.a.DELETE ? b30Var.j6 : b30Var.DW;
        }

        private int Hw(b30.a aVar) {
            int i = j6()[aVar.ordinal()];
            if (i != 1) {
                return i != 3 ? 10 : 1;
            }
            return 2;
        }

        public static /* synthetic */ int[] j6() {
            int[] iArr = WB;
            if (iArr != null) {
                return iArr;
            }
            int[] iArr2 = new int[b30.a.valuesCustom().length];
            try {
                iArr2[b30.a.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr2[b30.a.COPY.ordinal()] = 5;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[b30.a.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[b30.a.MODIFY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[b30.a.RENAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            WB = iArr2;
            return iArr2;
        }

        @Override // java.util.Comparator
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public int compare(b30 b30Var, b30 b30Var2) {
            int iCompareTo = FH(b30Var).compareTo(FH(b30Var2));
            return iCompareTo == 0 ? Hw(b30Var.FH()) - Hw(b30Var2.FH()) : iCompareTo;
        }
    }

    public o30(p70 p70Var) {
        this.v5 = p70Var;
        this.gn = ((a30) p70Var.gn().tp(a30.Hw)).j6();
        U2();
    }

    private static b30 EQ(b30 b30Var, b30 b30Var2) {
        return b30.J8(b30.a.RENAME, b30Var, b30Var2, 100);
    }

    private static b30 FH(b30 b30Var, List<b30> list) {
        int iWs;
        b30 b30Var2 = null;
        int i = -1;
        for (b30 b30Var3 : list) {
            if (a8(XL(b30Var3), XL(b30Var)) && (iWs = s30.Ws(aM(b30Var3), aM(b30Var))) > i) {
                b30Var2 = b30Var3;
                i = iWs;
            }
        }
        return b30Var2;
    }

    private void Hw(y20.c cVar, j70 j70Var) throws IOException {
        ArrayList arrayList = new ArrayList(this.j6.size());
        j70Var.j6(JGitText.DW().renamesBreakingModifies, this.j6.size());
        for (int i = 0; i < this.j6.size(); i++) {
            b30 b30Var = this.j6.get(i);
            if (b30Var.FH() == b30.a.MODIFY) {
                int iV5 = v5(cVar, b30Var);
                if (iV5 < this.VH) {
                    List<b30> listDW = b30.DW(b30Var);
                    b30 b30Var2 = listDW.get(0);
                    b30Var2.Zo = iV5;
                    this.DW.add(b30Var2);
                    this.FH.add(listDW.get(1));
                } else {
                    arrayList.add(b30Var);
                }
            } else {
                arrayList.add(b30Var);
            }
            j70Var.v5(1);
        }
        this.j6 = arrayList;
    }

    private void J0(j70 j70Var) {
        b30.a aVar;
        j70Var.j6(JGitText.DW().renamesFindingExact, this.FH.size() + this.FH.size() + this.DW.size() + (this.FH.size() * this.DW.size()));
        HashMap<h60, Object> mapJ3 = j3(this.DW, j70Var);
        HashMap<h60, Object> mapJ32 = j3(this.FH, j70Var);
        ArrayList arrayList = new ArrayList(this.FH.size());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : mapJ32.values()) {
            if (obj instanceof b30) {
                arrayList.add((b30) obj);
            } else {
                arrayList2.add((List) obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(this.FH.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b30 b30Var = (b30) it.next();
            Object obj2 = mapJ3.get(b30Var.gn);
            if (obj2 instanceof b30) {
                b30 b30Var2 = (b30) obj2;
                if (a8(b30Var2.FH, b30Var.Hw)) {
                    b30Var2.v5 = b30.a.RENAME;
                    this.j6.add(EQ(b30Var2, b30Var));
                } else {
                    arrayList3.add(b30Var);
                }
            } else if (obj2 != null) {
                b30 b30VarFH = FH(b30Var, (List) obj2);
                if (b30VarFH != null) {
                    b30VarFH.v5 = b30.a.RENAME;
                    this.j6.add(EQ(b30VarFH, b30Var));
                } else {
                    arrayList3.add(b30Var);
                }
            } else {
                arrayList3.add(b30Var);
            }
            j70Var.v5(1);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            List<b30> list = (List) it2.next();
            Object obj3 = mapJ3.get(((b30) list.get(0)).gn);
            if (obj3 instanceof b30) {
                b30 b30Var3 = (b30) obj3;
                b30 b30VarFH2 = FH(b30Var3, list);
                if (b30VarFH2 != null) {
                    b30Var3.v5 = b30.a.RENAME;
                    this.j6.add(EQ(b30Var3, b30VarFH2));
                    for (b30 b30Var4 : list) {
                        if (b30Var4 != b30VarFH2) {
                            if (a8(b30Var3.FH, b30Var4.Hw)) {
                                this.j6.add(tp(b30Var3, b30Var4));
                            } else {
                                arrayList3.add(b30Var4);
                            }
                        }
                    }
                } else {
                    arrayList3.addAll(list);
                }
            } else if (obj3 != null) {
                List list2 = (List) obj3;
                long[] jArr = new long[list2.size() * list.size()];
                int i = 0;
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    String str = ((b30) list2.get(i2)).j6;
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        jArr[i] = s30.VH(s30.Ws(((b30) list.get(i3)).DW, str), i2, i3);
                        i++;
                    }
                }
                Arrays.sort(jArr);
                while (true) {
                    i--;
                    if (i < 0) {
                        break;
                    }
                    long j = jArr[i];
                    int iJ3 = s30.j3(j);
                    int iZo = s30.Zo(j);
                    b30 b30Var5 = (b30) list2.get(iJ3);
                    b30 b30Var6 = (b30) list.get(iZo);
                    if (b30Var6 == null) {
                        j70Var.v5(1);
                    } else {
                        if (b30Var5.v5 == b30.a.DELETE) {
                            aVar = b30.a.RENAME;
                            b30Var5.v5 = aVar;
                        } else {
                            aVar = b30.a.COPY;
                        }
                        this.j6.add(b30.J8(aVar, b30Var5, b30Var6, 100));
                        list.set(iZo, null);
                        j70Var.v5(1);
                    }
                }
            } else {
                arrayList3.addAll(list);
            }
        }
        this.FH = arrayList3;
        this.DW = new ArrayList(mapJ3.size());
        for (Object obj4 : mapJ3.values()) {
            if (obj4 instanceof b30) {
                b30 b30Var7 = (b30) obj4;
                if (b30Var7.v5 == b30.a.DELETE) {
                    this.DW.add(b30Var7);
                }
            } else {
                for (b30 b30Var8 : (List) obj4) {
                    if (b30Var8.v5 == b30.a.DELETE) {
                        this.DW.add(b30Var8);
                    }
                }
            }
        }
        j70Var.FH();
    }

    private void Mr(j70 j70Var) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList(this.FH.size());
        j70Var.j6(JGitText.DW().renamesRejoiningModifies, this.FH.size() + this.DW.size());
        for (b30 b30Var : this.DW) {
            map.put(b30Var.j6, b30Var);
            j70Var.v5(1);
        }
        for (b30 b30Var2 : this.FH) {
            b30 b30Var3 = (b30) map.remove(b30Var2.DW);
            if (b30Var3 == null) {
                arrayList.add(b30Var2);
            } else if (a8(b30Var3.FH, b30Var2.Hw)) {
                this.j6.add(b30.J8(b30.a.MODIFY, b30Var3, b30Var2, b30Var3.Zo));
            } else {
                map.put(b30Var3.j6, b30Var3);
                arrayList.add(b30Var2);
            }
            j70Var.v5(1);
        }
        this.FH = arrayList;
        this.DW = new ArrayList(map.values());
    }

    private static h60 QX(b30 b30Var) {
        return b30Var.v5 == b30.a.DELETE ? b30Var.VH : b30Var.gn;
    }

    private static t60 XL(b30 b30Var) {
        return b30Var.v5 == b30.a.DELETE ? b30Var.FH : b30Var.Hw;
    }

    public static boolean a8(t60 t60Var, t60 t60Var2) {
        return (t60Var.Zo() & 61440) == (t60Var2.Zo() & 61440);
    }

    private static String aM(b30 b30Var) {
        return b30Var.v5 == b30.a.DELETE ? b30Var.j6 : b30Var.DW;
    }

    private HashMap<h60, Object> j3(List<b30> list, j70 j70Var) {
        HashMap<h60, Object> map = new HashMap<>();
        for (b30 b30Var : list) {
            Object objPut = map.put(QX(b30Var), b30Var);
            if (objPut instanceof b30) {
                ArrayList arrayList = new ArrayList(2);
                arrayList.add((b30) objPut);
                arrayList.add(b30Var);
                map.put(QX(b30Var), arrayList);
            } else if (objPut != null) {
                ((List) objPut).add(b30Var);
                map.put(QX(b30Var), objPut);
            }
            j70Var.v5(1);
        }
        return map;
    }

    public static /* synthetic */ int[] j6() {
        int[] iArr = EQ;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[b30.a.valuesCustom().length];
        try {
            iArr2[b30.a.ADD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[b30.a.COPY.ordinal()] = 5;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[b30.a.DELETE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[b30.a.MODIFY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[b30.a.RENAME.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        EQ = iArr2;
        return iArr2;
    }

    private static b30 tp(b30 b30Var, b30 b30Var2) {
        return b30.J8(b30.a.COPY, b30Var, b30Var2, 100);
    }

    private int v5(y20.c cVar, b30 b30Var) throws IOException {
        try {
            r30 r30Var = new r30();
            r30Var.u7(cVar.DW(b30.b.OLD, b30Var));
            r30Var.XL();
            r30 r30Var2 = new r30();
            r30Var2.u7(cVar.DW(b30.b.NEW, b30Var));
            r30Var2.XL();
            return r30Var.J8(r30Var2, 100);
        } catch (r30.a unused) {
            this.u7 = true;
            return this.VH + 1;
        }
    }

    private void we(y20.c cVar, j70 j70Var) {
        int iMax = Math.max(this.FH.size(), this.DW.size());
        if (J8() != 0 && iMax > J8()) {
            this.u7 = true;
            return;
        }
        s30 s30Var = new s30(cVar, this.DW, this.FH);
        s30Var.XL(Ws());
        s30Var.Hw(j70Var);
        this.u7 |= s30Var.J8();
        this.DW = s30Var.tp();
        this.FH = s30Var.u7();
        this.j6.addAll(s30Var.EQ());
    }

    public void DW(Collection<b30> collection) {
        if (this.Hw) {
            throw new IllegalStateException(JGitText.DW().renamesAlreadyFound);
        }
        for (b30 b30Var : collection) {
            int i = j6()[b30Var.FH().ordinal()];
            if (i == 1) {
                this.FH.add(b30Var);
            } else if (i != 2) {
                if (i != 3) {
                    this.j6.add(b30Var);
                } else {
                    this.DW.add(b30Var);
                }
            } else if (a8(b30Var.tp(), b30Var.VH())) {
                this.j6.add(b30Var);
            } else {
                List<b30> listDW = b30.DW(b30Var);
                this.DW.add(listDW.get(0));
                this.FH.add(listDW.get(1));
            }
        }
    }

    public int J8() {
        return this.gn;
    }

    public void U2() {
        this.j6 = new ArrayList();
        this.DW = new ArrayList();
        this.FH = new ArrayList();
        this.Hw = false;
    }

    public List<b30> VH(y20.c cVar, j70 j70Var) throws IOException {
        if (!this.Hw) {
            this.Hw = true;
            if (j70Var == null) {
                j70Var = x60.j6;
            }
            if (this.VH > 0) {
                Hw(cVar, j70Var);
            }
            if (!this.FH.isEmpty() && !this.DW.isEmpty()) {
                J0(j70Var);
            }
            if (!this.FH.isEmpty() && !this.DW.isEmpty()) {
                we(cVar, j70Var);
            }
            if (this.VH > 0 && !this.FH.isEmpty() && !this.DW.isEmpty()) {
                Mr(j70Var);
            }
            this.j6.addAll(this.FH);
            this.FH = null;
            this.j6.addAll(this.DW);
            this.DW = null;
            Collections.sort(this.j6, tp);
        }
        return Collections.unmodifiableList(this.j6);
    }

    public int Ws() {
        return this.Zo;
    }

    public List<b30> Zo() {
        return u7(x60.j6);
    }

    public List<b30> gn(g70 g70Var, j70 j70Var) {
        y20 y20VarJ6 = y20.j6(g70Var);
        return VH(new y20.c(y20VarJ6, y20VarJ6), j70Var);
    }

    public List<b30> u7(j70 j70Var) {
        if (this.Hw) {
            return Collections.unmodifiableList(this.j6);
        }
        g70 g70VarYS = this.v5.yS();
        try {
            return gn(g70VarYS, j70Var);
        } finally {
            g70VarYS.XL();
        }
    }
}
