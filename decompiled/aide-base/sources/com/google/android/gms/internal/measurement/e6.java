package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class e6 {
    private static final Class<?> j6 = br();
    private static final u6<?, ?> DW = ca(false);
    private static final u6<?, ?> FH = ca(true);
    private static final u6<?, ?> Hw = new w6();

    static boolean BT(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static <UT, UB> UB DW(int i, List<Integer> list, i4 i4Var, UB ub, u6<UT, UB> u6Var) {
        if (i4Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iIntValue = list.get(i3).intValue();
                if (i4Var.j6(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(iIntValue));
                    }
                    i2++;
                } else {
                    ub = (UB) j6(i, iIntValue, ub, u6Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!i4Var.j6(iIntValue2)) {
                    ub = (UB) j6(i, iIntValue2, ub, u6Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    static int EQ(List<Integer> list) {
        int iG3;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f4) {
            f4 f4Var = (f4) list;
            iG3 = 0;
            while (i < size) {
                iG3 += k3.g3(f4Var.DW(i));
                i++;
            }
        } else {
            iG3 = 0;
            while (i < size) {
                iG3 += k3.g3(list.get(i).intValue());
                i++;
            }
        }
        return iG3;
    }

    public static void FH(int i, List<String> list, p7 p7Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p7Var.U2(i, list);
    }

    public static void Hw(int i, List<?> list, p7 p7Var, c6 c6Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p7Var.rN(i, list, c6Var);
    }

    static int I(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * k3.w9(i, 0);
    }

    static int J0(List<Integer> list) {
        int I;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f4) {
            f4 f4Var = (f4) list;
            I = 0;
            while (i < size) {
                I += k3.I(f4Var.DW(i));
                i++;
            }
        } else {
            I = 0;
            while (i < size) {
                I += k3.I(list.get(i).intValue());
                i++;
            }
        }
        return I;
    }

    static int J8(List<?> list) {
        return list.size() << 2;
    }

    public static void KD(Class<?> cls) {
        Class<?> cls2;
        if (!e4.class.isAssignableFrom(cls) && (cls2 = j6) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static int Mr(int i, Object obj, c6 c6Var) {
        return obj instanceof s4 ? k3.Hw(i, (s4) obj) : k3.BT(i, (l5) obj, c6Var);
    }

    static int Mz(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return J0(list) + (size * k3.vJ(i));
    }

    static int OW(List<Long> list) {
        int iJ3;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z4) {
            z4 z4Var = (z4) list;
            iJ3 = 0;
            while (i < size) {
                iJ3 += k3.j3(z4Var.DW(i));
                i++;
            }
        } else {
            iJ3 = 0;
            while (i < size) {
                iJ3 += k3.j3(list.get(i).longValue());
                i++;
            }
        }
        return iJ3;
    }

    public static void P8(int i, List<Long> list, p7 p7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p7Var.gn(i, list, z);
    }

    static int QX(List<?> list) {
        return list.size();
    }

    static int Qq(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * k3.yO(i, true);
    }

    public static void SI(int i, List<Integer> list, p7 p7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p7Var.XL(i, list, z);
    }

    static int Sf(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return tp(list) + (size * k3.vJ(i));
    }

    static int U2(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iVJ = k3.vJ(i) * size;
        if (list instanceof u4) {
            u4 u4Var = (u4) list;
            while (i2 < size) {
                Object objZo = u4Var.Zo(i2);
                iVJ += objZo instanceof u2 ? k3.vy((u2) objZo) : k3.jw((String) objZo);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                iVJ += obj instanceof u2 ? k3.vy((u2) obj) : k3.jw((String) obj);
                i2++;
            }
        }
        return iVJ;
    }

    static <T> void VH(g5 g5Var, T t, T t2, long j) {
        a7.VH(t, j, g5Var.j6(a7.P8(t, j), a7.P8(t2, j)));
    }

    static int Ws(List<?> list) {
        return list.size() << 3;
    }

    public static void XL(int i, List<u2> list, p7 p7Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p7Var.j3(i, list);
    }

    private static Class<?> XX() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <T, FT extends x3<FT>> void Zo(s3<FT> s3Var, T t, T t2) {
        v3<T> v3VarGn = s3Var.gn(t2);
        if (v3VarGn.DW()) {
            return;
        }
        s3Var.u7(t).u7(v3VarGn);
    }

    static int a8(int i, List<?> list, c6 c6Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iVJ = k3.vJ(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            iVJ += obj instanceof s4 ? k3.v5((s4) obj) : k3.P8((l5) obj, c6Var);
        }
        return iVJ;
    }

    public static void aM(int i, List<?> list, p7 p7Var, c6 c6Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p7Var.a8(i, list, c6Var);
    }

    public static u6<?, ?> aj() {
        return FH;
    }

    private static Class<?> br() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static u6<?, ?> ca(boolean z) {
        try {
            Class<?> clsXX = XX();
            if (clsXX == null) {
                return null;
            }
            return (u6) clsXX.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void cb(int i, List<Boolean> list, p7 p7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p7Var.DW(i, list, z);
    }

    public static void cn(int i, List<Integer> list, p7 p7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p7Var.EQ(i, list, z);
    }

    static int dx(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return OW(list) + (list.size() * k3.vJ(i));
    }

    static int ef(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return u7(list) + (size * k3.vJ(i));
    }

    public static void ei(int i, List<Integer> list, p7 p7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p7Var.FH(i, list, z);
    }

    static int er(int i, List<l5> list, c6 c6Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iXX = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iXX += k3.XX(i, list.get(i2), c6Var);
        }
        return iXX;
    }

    static int g3(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return we(list) + (size * k3.vJ(i));
    }

    public static void gW(int i, List<Long> list, p7 p7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p7Var.Ws(i, list, z);
    }

    static <T, UT, UB> void gn(u6<UT, UB> u6Var, T t, T t2) {
        u6Var.Ws(t, u6Var.XL(u6Var.u7(t), u6Var.u7(t2)));
    }

    public static void j3(int i, List<Float> list, p7 p7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p7Var.Mr(i, list, z);
    }

    static <UT, UB> UB j6(int i, int i2, UB ub, u6<UT, UB> u6Var) {
        if (ub == null) {
            ub = u6Var.j3();
        }
        u6Var.j6(ub, i, i2);
        return ub;
    }

    static int kQ(List<Long> list) {
        int iMr;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z4) {
            z4 z4Var = (z4) list;
            iMr = 0;
            while (i < size) {
                iMr += k3.Mr(z4Var.DW(i));
                i++;
            }
        } else {
            iMr = 0;
            while (i < size) {
                iMr += k3.Mr(list.get(i).longValue());
                i++;
            }
        }
        return iMr;
    }

    public static void lg(int i, List<Long> list, p7 p7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p7Var.VH(i, list, z);
    }

    public static u6<?, ?> lp() {
        return Hw;
    }

    public static void nw(int i, List<Integer> list, p7 p7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p7Var.tp(i, list, z);
    }

    static int rN(int i, List<u2> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iVJ = size * k3.vJ(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            iVJ += k3.vy(list.get(i2));
        }
        return iVJ;
    }

    public static void ro(int i, List<Integer> list, p7 p7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p7Var.u7(i, list, z);
    }

    static int sG(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return kQ(list) + (size * k3.vJ(i));
    }

    public static void sh(int i, List<Integer> list, p7 p7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p7Var.Hw(i, list, z);
    }

    public static u6<?, ?> sy() {
        return DW;
    }

    static int tp(List<Integer> list) {
        int iQq;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f4) {
            f4 f4Var = (f4) list;
            iQq = 0;
            while (i < size) {
                iQq += k3.Qq(f4Var.DW(i));
                i++;
            }
        } else {
            iQq = 0;
            while (i < size) {
                iQq += k3.Qq(list.get(i).intValue());
                i++;
            }
        }
        return iQq;
    }

    static int u7(List<Long> list) {
        int iU2;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z4) {
            z4 z4Var = (z4) list;
            iU2 = 0;
            while (i < size) {
                iU2 += k3.U2(z4Var.DW(i));
                i++;
            }
        } else {
            iU2 = 0;
            while (i < size) {
                iU2 += k3.U2(list.get(i).longValue());
                i++;
            }
        }
        return iU2;
    }

    public static void v5(int i, List<Double> list, p7 p7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p7Var.aM(i, list, z);
    }

    static int vJ(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return EQ(list) + (size * k3.vJ(i));
    }

    public static void vy(int i, List<Long> list, p7 p7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p7Var.J8(i, list, z);
    }

    static int we(List<Integer> list) {
        int iMz;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f4) {
            f4 f4Var = (f4) list;
            iMz = 0;
            while (i < size) {
                iMz += k3.Mz(f4Var.DW(i));
                i++;
            }
        } else {
            iMz = 0;
            while (i < size) {
                iMz += k3.Mz(list.get(i).intValue());
                i++;
            }
        }
        return iMz;
    }

    static int x9(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * k3.ye(i, 0L);
    }

    public static void yS(int i, List<Long> list, p7 p7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p7Var.QX(i, list, z);
    }
}
