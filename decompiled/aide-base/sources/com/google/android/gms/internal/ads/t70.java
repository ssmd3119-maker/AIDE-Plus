package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class t70 {
    private static final Class<?> j6 = a8();
    private static final j80<?, ?> DW = gW(false);
    private static final j80<?, ?> FH = gW(true);
    private static final j80<?, ?> Hw = new l80();

    static int BT(int i, Object obj, r70 r70Var) {
        return obj instanceof f60 ? x40.Hw(i, (f60) obj) : x40.er(i, (z60) obj, r70Var);
    }

    static <UT, UB> UB DW(int i, List<Integer> list, v50 v50Var, UB ub, j80<UT, UB> j80Var) {
        if (v50Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iIntValue = list.get(i3).intValue();
                if (v50Var.j6(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(iIntValue));
                    }
                    i2++;
                } else {
                    ub = (UB) j6(i, iIntValue, ub, j80Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!v50Var.j6(iIntValue2)) {
                    ub = (UB) j6(i, iIntValue2, ub, j80Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    static int EQ(List<Long> list) {
        int iKD;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof m60) {
            m60 m60Var = (m60) list;
            iKD = 0;
            while (i < size) {
                iKD += x40.KD(m60Var.DW(i));
                i++;
            }
        } else {
            iKD = 0;
            while (i < size) {
                iKD += x40.KD(list.get(i).longValue());
                i++;
            }
        }
        return iKD;
    }

    public static void FH(int i, List<String> list, f90 f90Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f90Var.U2(i, list);
    }

    public static void Hw(int i, List<?> list, f90 f90Var, r70 r70Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f90Var.er(i, list, r70Var);
    }

    public static void I(int i, List<Boolean> list, f90 f90Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f90Var.DW(i, list, z);
    }

    static int J0(List<Integer> list) {
        int iYO;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s50) {
            s50 s50Var = (s50) list;
            iYO = 0;
            while (i < size) {
                iYO += x40.yO(s50Var.DW(i));
                i++;
            }
        } else {
            iYO = 0;
            while (i < size) {
                iYO += x40.yO(list.get(i).intValue());
                i++;
            }
        }
        return iYO;
    }

    static int J8(List<Integer> list) {
        int iXG;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s50) {
            s50 s50Var = (s50) list;
            iXG = 0;
            while (i < size) {
                iXG += x40.XG(s50Var.DW(i));
                i++;
            }
        } else {
            iXG = 0;
            while (i < size) {
                iXG += x40.XG(list.get(i).intValue());
                i++;
            }
        }
        return iXG;
    }

    public static void KD(int i, List<Long> list, f90 f90Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f90Var.QX(i, list, z);
    }

    public static j80<?, ?> Mr() {
        return FH;
    }

    public static void Mz(int i, List<Integer> list, f90 f90Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f90Var.Hw(i, list, z);
    }

    static int OW(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Ws(list) + (size * x40.kQ(i));
    }

    static int P8(int i, List<?> list, r70 r70Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iKQ = x40.kQ(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            iKQ += obj instanceof f60 ? x40.v5((f60) obj) : x40.yS((z60) obj, r70Var);
        }
        return iKQ;
    }

    static int QX(List<?> list) {
        return list.size() << 2;
    }

    static int Qq(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return EQ(list) + (size * x40.kQ(i));
    }

    static int SI(int i, List<z60> list, r70 r70Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iG3 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iG3 += x40.g3(i, list.get(i2), r70Var);
        }
        return iG3;
    }

    public static void Sf(int i, List<Integer> list, f90 f90Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f90Var.XL(i, list, z);
    }

    public static j80<?, ?> U2() {
        return Hw;
    }

    static <T> void VH(u60 u60Var, T t, T t2, long j) {
        q80.VH(t, j, u60Var.j6(q80.sh(t, j), q80.sh(t2, j)));
    }

    static int Ws(List<Integer> list) {
        int iJJ;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s50) {
            s50 s50Var = (s50) list;
            iJJ = 0;
            while (i < size) {
                iJJ += x40.jJ(s50Var.DW(i));
                i++;
            }
        } else {
            iJJ = 0;
            while (i < size) {
                iJJ += x40.jJ(list.get(i).intValue());
                i++;
            }
        }
        return iJJ;
    }

    static int XL(List<?> list) {
        return list.size() << 3;
    }

    static int XX(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * x40.AL(i, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <T, FT extends j50<FT>> void Zo(e50<FT> e50Var, T t, T t2) {
        h50<T> h50VarGn = e50Var.gn(t2);
        if (h50VarGn.DW()) {
            return;
        }
        e50Var.u7(t).u7(h50VarGn);
    }

    private static Class<?> a8() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    static int aM(List<?> list) {
        return list.size();
    }

    static int aj(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return J0(list) + (size * x40.kQ(i));
    }

    static int br(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * x40.J0(i, 0);
    }

    static int ca(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return u7(list) + (list.size() * x40.kQ(i));
    }

    public static void cb(int i, List<Long> list, f90 f90Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f90Var.gn(i, list, z);
    }

    static boolean cn(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void dx(Class<?> cls) {
        Class<?> cls2;
        if (!r50.class.isAssignableFrom(cls) && (cls2 = j6) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void ef(int i, List<Integer> list, f90 f90Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f90Var.tp(i, list, z);
    }

    public static void ei(int i, List<Long> list, f90 f90Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f90Var.VH(i, list, z);
    }

    public static void er(int i, List<?> list, f90 f90Var, r70 r70Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f90Var.vy(i, list, r70Var);
    }

    public static void g3(int i, List<Integer> list, f90 f90Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f90Var.EQ(i, list, z);
    }

    private static j80<?, ?> gW(boolean z) {
        try {
            Class<?> clsLg = lg();
            if (clsLg == null) {
                return null;
            }
            return (j80) clsLg.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    static <T, UT, UB> void gn(j80<UT, UB> j80Var, T t, T t2) {
        j80Var.Ws(t, j80Var.XL(j80Var.gn(t), j80Var.gn(t2)));
    }

    public static j80<?, ?> j3() {
        return DW;
    }

    static <UT, UB> UB j6(int i, int i2, UB ub, j80<UT, UB> j80Var) {
        if (ub == null) {
            ub = j80Var.EQ();
        }
        j80Var.j6(ub, i, i2);
        return ub;
    }

    static int kQ(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * x40.ye(i, true);
    }

    private static Class<?> lg() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static int lp(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return J8(list) + (size * x40.kQ(i));
    }

    static int nw(int i, List<i40> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iKQ = size * x40.kQ(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            iKQ += x40.Mr(list.get(i2));
        }
        return iKQ;
    }

    public static void rN(int i, List<i40> list, f90 f90Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f90Var.j3(i, list);
    }

    public static void ro(int i, List<Long> list, f90 f90Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f90Var.Ws(i, list, z);
    }

    public static void sG(int i, List<Integer> list, f90 f90Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f90Var.FH(i, list, z);
    }

    public static void sh(int i, List<Long> list, f90 f90Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f90Var.J8(i, list, z);
    }

    static int sy(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return we(list) + (size * x40.kQ(i));
    }

    static int tp(List<Long> list) {
        int iSI;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof m60) {
            m60 m60Var = (m60) list;
            iSI = 0;
            while (i < size) {
                iSI += x40.SI(m60Var.DW(i));
                i++;
            }
        } else {
            iSI = 0;
            while (i < size) {
                iSI += x40.SI(list.get(i).longValue());
                i++;
            }
        }
        return iSI;
    }

    static int u7(List<Long> list) {
        int iNw;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof m60) {
            m60 m60Var = (m60) list;
            iNw = 0;
            while (i < size) {
                iNw += x40.nw(m60Var.DW(i));
                i++;
            }
        } else {
            iNw = 0;
            while (i < size) {
                iNw += x40.nw(list.get(i).longValue());
                i++;
            }
        }
        return iNw;
    }

    public static void v5(int i, List<Double> list, f90 f90Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f90Var.aM(i, list, z);
    }

    public static void vJ(int i, List<Integer> list, f90 f90Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f90Var.u7(i, list, z);
    }

    static int vy(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iKQ = x40.kQ(i) * size;
        if (list instanceof h60) {
            h60 h60Var = (h60) list;
            while (i2 < size) {
                Object objBT = h60Var.BT(i2);
                iKQ += objBT instanceof i40 ? x40.Mr((i40) objBT) : x40.aq((String) objBT);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                iKQ += obj instanceof i40 ? x40.Mr((i40) obj) : x40.aq((String) obj);
                i2++;
            }
        }
        return iKQ;
    }

    static int we(List<Integer> list) {
        int iCU;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s50) {
            s50 s50Var = (s50) list;
            iCU = 0;
            while (i < size) {
                iCU += x40.CU(s50Var.DW(i));
                i++;
            }
        } else {
            iCU = 0;
            while (i < size) {
                iCU += x40.CU(list.get(i).intValue());
                i++;
            }
        }
        return iCU;
    }

    static int x9(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return tp(list) + (size * x40.kQ(i));
    }

    public static void yS(int i, List<Float> list, f90 f90Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f90Var.Mr(i, list, z);
    }
}
