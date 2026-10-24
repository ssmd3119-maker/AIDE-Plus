package com.google.android.gms.internal.ads;

import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class d70<T> implements r70<T> {
    private static final int[] aM = new int[0];
    private static final Unsafe j3 = q80.J8();
    private final Object[] DW;
    private final int EQ;
    private final int FH;
    private final int Hw;
    private final h70 J0;
    private final i60 J8;
    private final e50<?> QX;
    private final boolean VH;
    private final j80<?, ?> Ws;
    private final u60 XL;
    private final boolean Zo;
    private final boolean gn;
    private final int[] j6;
    private final int[] tp;
    private final boolean u7;
    private final z60 v5;
    private final int we;

    private d70(int[] iArr, Object[] objArr, int i, int i2, z60 z60Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, h70 h70Var, i60 i60Var, j80<?, ?> j80Var, e50<?> e50Var, u60 u60Var) {
        this.j6 = iArr;
        this.DW = objArr;
        this.FH = i;
        this.Hw = i2;
        this.VH = z60Var instanceof r50;
        this.gn = z;
        this.Zo = e50Var != null && e50Var.VH(z60Var);
        this.u7 = false;
        this.tp = iArr2;
        this.EQ = i3;
        this.we = i4;
        this.J0 = h70Var;
        this.J8 = i60Var;
        this.Ws = j80Var;
        this.QX = e50Var;
        this.v5 = z60Var;
        this.XL = u60Var;
    }

    private final void BT(Object obj, int i, q70 q70Var) {
        if (Qq(i)) {
            q80.VH(obj, i & 1048575, q70Var.er());
        } else if (this.VH) {
            q80.VH(obj, i & 1048575, q70Var.u7());
        } else {
            q80.VH(obj, i & 1048575, q70Var.vy());
        }
    }

    private static int DW(int i, byte[] bArr, int i2, int i3, Object obj, f40 f40Var) {
        return e40.FH(i, bArr, i2, i3, SI(obj), f40Var);
    }

    private final v50 I(int i) {
        return (v50) this.DW[((i / 3) << 1) + 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int J0(r70 r70Var, byte[] bArr, int i, int i2, int i3, f40 f40Var) throws y50 {
        d70 d70Var = (d70) r70Var;
        Object objV5 = d70Var.v5();
        int iJ3 = d70Var.j3(objV5, bArr, i, i2, i3, f40Var);
        d70Var.u7(objV5);
        f40Var.FH = objV5;
        return iJ3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int J8(r70 r70Var, byte[] bArr, int i, int i2, f40 f40Var) throws y50 {
        int iHw = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iHw = e40.Hw(i3, bArr, iHw, f40Var);
            i3 = f40Var.j6;
        }
        int i4 = iHw;
        if (i3 < 0 || i3 > i2 - i4) {
            throw y50.j6();
        }
        Object objV5 = r70Var.v5();
        int i5 = i3 + i4;
        r70Var.gn(objV5, bArr, i4, i5, f40Var);
        r70Var.u7(objV5);
        f40Var.FH = objV5;
        return i5;
    }

    private final int KD(int i, int i2) {
        if (i < this.FH || i > this.Hw) {
            return -1;
        }
        return ro(i, i2);
    }

    private static int Mr(byte[] bArr, int i, int i2, z80 z80Var, Class<?> cls, f40 f40Var) {
        switch (e70.j6[z80Var.ordinal()]) {
            case 1:
                int iVH = e40.VH(bArr, i, f40Var);
                f40Var.FH = Boolean.valueOf(f40Var.DW != 0);
                return iVH;
            case 2:
                return e40.tp(bArr, i, f40Var);
            case 3:
                f40Var.FH = Double.valueOf(e40.J0(bArr, i));
                return i + 8;
            case 4:
            case 5:
                f40Var.FH = Integer.valueOf(e40.EQ(bArr, i));
                return i + 4;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
            case UserTouchAction.CLICK_KIND /* 7 */:
                f40Var.FH = Long.valueOf(e40.we(bArr, i));
                return i + 8;
            case 8:
                f40Var.FH = Float.valueOf(e40.J8(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int iV5 = e40.v5(bArr, i, f40Var);
                f40Var.FH = Integer.valueOf(f40Var.j6);
                return iV5;
            case 12:
            case 13:
                int iVH2 = e40.VH(bArr, i, f40Var);
                f40Var.FH = Long.valueOf(f40Var.DW);
                return iVH2;
            case 14:
                return J8(m70.DW().FH(cls), bArr, i, i2, f40Var);
            case 15:
                int iV52 = e40.v5(bArr, i, f40Var);
                f40Var.FH = Integer.valueOf(s40.P8(f40Var.j6));
                return iV52;
            case 16:
                int iVH3 = e40.VH(bArr, i, f40Var);
                f40Var.FH = Long.valueOf(s40.a8(f40Var.DW));
                return iVH3;
            case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                return e40.u7(bArr, i, f40Var);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final Object Mz(int i) {
        return this.DW[(i / 3) << 1];
    }

    private static <T> long OW(T t, long j) {
        return ((Long) q80.sh(t, j)).longValue();
    }

    private final boolean P8(T t, int i, int i2) {
        return q80.ei(t, (long) (x9(i2) & 1048575)) == i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int QX(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, f40 f40Var) throws y50 {
        int iVH;
        Unsafe unsafe = j3;
        long j2 = this.j6[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(e40.J0(bArr, i)));
                    iVH = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return iVH;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(e40.J8(bArr, i)));
                    iVH = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return iVH;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    iVH = e40.VH(bArr, i, f40Var);
                    unsafe.putObject(t, j, Long.valueOf(f40Var.DW));
                    unsafe.putInt(t, j2, i4);
                    return iVH;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    iVH = e40.v5(bArr, i, f40Var);
                    unsafe.putObject(t, j, Integer.valueOf(f40Var.j6));
                    unsafe.putInt(t, j2, i4);
                    return iVH;
                }
                return i;
            case 56:
            case ProxyTextView.INPUTTYPE_textShortMessage /* 65 */:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(e40.we(bArr, i)));
                    iVH = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return iVH;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(e40.EQ(bArr, i)));
                    iVH = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return iVH;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    iVH = e40.VH(bArr, i, f40Var);
                    unsafe.putObject(t, j, Boolean.valueOf(f40Var.DW != 0));
                    unsafe.putInt(t, j2, i4);
                    return iVH;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int iV5 = e40.v5(bArr, i, f40Var);
                    int i9 = f40Var.j6;
                    if (i9 == 0) {
                        unsafe.putObject(t, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !s80.tp(bArr, iV5, iV5 + i9)) {
                            throw y50.u7();
                        }
                        unsafe.putObject(t, j, new String(bArr, iV5, i9, t50.j6));
                        iV5 += i9;
                    }
                    unsafe.putInt(t, j2, i4);
                    return iV5;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int iJ8 = J8(g3(i8), bArr, i, i2, f40Var);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, f40Var.FH);
                    } else {
                        unsafe.putObject(t, j, t50.v5(object, f40Var.FH));
                    }
                    unsafe.putInt(t, j2, i4);
                    return iJ8;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    iVH = e40.tp(bArr, i, f40Var);
                    unsafe.putObject(t, j, f40Var.FH);
                    unsafe.putInt(t, j2, i4);
                    return iVH;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int iV52 = e40.v5(bArr, i, f40Var);
                    int i10 = f40Var.j6;
                    v50 v50VarI = I(i8);
                    if (v50VarI != null && !v50VarI.j6(i10)) {
                        SI(t).EQ(i3, Long.valueOf(i10));
                        return iV52;
                    }
                    unsafe.putObject(t, j, Integer.valueOf(i10));
                    iVH = iV52;
                    unsafe.putInt(t, j2, i4);
                    return iVH;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    iVH = e40.v5(bArr, i, f40Var);
                    unsafe.putObject(t, j, Integer.valueOf(s40.P8(f40Var.j6)));
                    unsafe.putInt(t, j2, i4);
                    return iVH;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    iVH = e40.VH(bArr, i, f40Var);
                    unsafe.putObject(t, j, Long.valueOf(s40.a8(f40Var.DW)));
                    unsafe.putInt(t, j2, i4);
                    return iVH;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    iVH = J0(g3(i8), bArr, i, i2, (i3 & (-8)) | 4, f40Var);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, f40Var.FH);
                    } else {
                        unsafe.putObject(t, j, t50.v5(object2, f40Var.FH));
                    }
                    unsafe.putInt(t, j2, i4);
                    return iVH;
                }
                return i;
            default:
                return i;
        }
    }

    private static boolean Qq(int i) {
        return (i & 536870912) != 0;
    }

    private static k80 SI(Object obj) {
        r50 r50Var = (r50) obj;
        k80 k80Var = r50Var.zzfpu;
        if (k80Var != k80.Zo()) {
            return k80Var;
        }
        k80 k80VarVH = k80.VH();
        r50Var.zzfpu = k80VarVH;
        return k80VarVH;
    }

    private final void Sf(T t, int i) {
        if (this.gn) {
            return;
        }
        int iX9 = x9(i);
        long j = iX9 & 1048575;
        q80.U2(t, j, q80.ei(t, j) | (1 << (iX9 >>> 20)));
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x042a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> com.google.android.gms.internal.ads.d70<T> U2(java.lang.Class<T> r33, com.google.android.gms.internal.ads.x60 r34, com.google.android.gms.internal.ads.h70 r35, com.google.android.gms.internal.ads.i60 r36, com.google.android.gms.internal.ads.j80<?, ?> r37, com.google.android.gms.internal.ads.e50<?> r38, com.google.android.gms.internal.ads.u60 r39) {
        /*
            Method dump skipped, instructions count: 1150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d70.U2(java.lang.Class, com.google.android.gms.internal.ads.x60, com.google.android.gms.internal.ads.h70, com.google.android.gms.internal.ads.i60, com.google.android.gms.internal.ads.j80, com.google.android.gms.internal.ads.e50, com.google.android.gms.internal.ads.u60):com.google.android.gms.internal.ads.d70");
    }

    private static <UT, UB> int Ws(j80<UT, UB> j80Var, T t) {
        return j80Var.VH(j80Var.gn(t));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    private final int XL(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, f40 f40Var) throws y50 {
        int iV5;
        int iV52 = i;
        x50 x50VarYS = (x50) j3.getObject(t, j2);
        if (!x50VarYS.XL()) {
            int size = x50VarYS.size();
            x50VarYS = x50VarYS.yS(size == 0 ? 10 : size << 1);
            j3.putObject(t, j2, x50VarYS);
        }
        switch (i7) {
            case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
            case 35:
                if (i5 == 2) {
                    a50 a50Var = (a50) x50VarYS;
                    int iV53 = e40.v5(bArr, iV52, f40Var);
                    int i8 = f40Var.j6 + iV53;
                    while (iV53 < i8) {
                        a50Var.DW(e40.J0(bArr, iV53));
                        iV53 += 8;
                    }
                    if (iV53 == i8) {
                        return iV53;
                    }
                    throw y50.j6();
                }
                if (i5 == 1) {
                    a50 a50Var2 = (a50) x50VarYS;
                    a50Var2.DW(e40.J0(bArr, i));
                    while (true) {
                        int i9 = iV52 + 8;
                        if (i9 >= i2) {
                            return i9;
                        }
                        iV52 = e40.v5(bArr, i9, f40Var);
                        if (i3 != f40Var.j6) {
                            return i9;
                        }
                        a50Var2.DW(e40.J0(bArr, iV52));
                    }
                }
                return iV52;
            case 19:
            case ProxyTextView.INPUTTYPE_time /* 36 */:
                if (i5 == 2) {
                    o50 o50Var = (o50) x50VarYS;
                    int iV54 = e40.v5(bArr, iV52, f40Var);
                    int i10 = f40Var.j6 + iV54;
                    while (iV54 < i10) {
                        o50Var.VH(e40.J8(bArr, iV54));
                        iV54 += 4;
                    }
                    if (iV54 == i10) {
                        return iV54;
                    }
                    throw y50.j6();
                }
                if (i5 == 5) {
                    o50 o50Var2 = (o50) x50VarYS;
                    o50Var2.VH(e40.J8(bArr, i));
                    while (true) {
                        int i11 = iV52 + 4;
                        if (i11 >= i2) {
                            return i11;
                        }
                        iV52 = e40.v5(bArr, i11, f40Var);
                        if (i3 != f40Var.j6) {
                            return i11;
                        }
                        o50Var2.VH(e40.J8(bArr, iV52));
                    }
                }
                return iV52;
            case ProxyTextView.INPUTTYPE_date /* 20 */:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    m60 m60Var = (m60) x50VarYS;
                    int iV55 = e40.v5(bArr, iV52, f40Var);
                    int i12 = f40Var.j6 + iV55;
                    while (iV55 < i12) {
                        iV55 = e40.VH(bArr, iV55, f40Var);
                        m60Var.Hw(f40Var.DW);
                    }
                    if (iV55 == i12) {
                        return iV55;
                    }
                    throw y50.j6();
                }
                if (i5 == 0) {
                    m60 m60Var2 = (m60) x50VarYS;
                    int iVH = e40.VH(bArr, iV52, f40Var);
                    m60Var2.Hw(f40Var.DW);
                    while (iVH < i2) {
                        int iV56 = e40.v5(bArr, iVH, f40Var);
                        if (i3 != f40Var.j6) {
                            return iVH;
                        }
                        iVH = e40.VH(bArr, iV56, f40Var);
                        m60Var2.Hw(f40Var.DW);
                    }
                    return iVH;
                }
                return iV52;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return e40.Zo(bArr, iV52, x50VarYS, f40Var);
                }
                if (i5 == 0) {
                    return e40.DW(i3, bArr, i, i2, x50VarYS, f40Var);
                }
                return iV52;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    m60 m60Var3 = (m60) x50VarYS;
                    int iV57 = e40.v5(bArr, iV52, f40Var);
                    int i13 = f40Var.j6 + iV57;
                    while (iV57 < i13) {
                        m60Var3.Hw(e40.we(bArr, iV57));
                        iV57 += 8;
                    }
                    if (iV57 == i13) {
                        return iV57;
                    }
                    throw y50.j6();
                }
                if (i5 == 1) {
                    m60 m60Var4 = (m60) x50VarYS;
                    m60Var4.Hw(e40.we(bArr, i));
                    while (true) {
                        int i14 = iV52 + 8;
                        if (i14 >= i2) {
                            return i14;
                        }
                        iV52 = e40.v5(bArr, i14, f40Var);
                        if (i3 != f40Var.j6) {
                            return i14;
                        }
                        m60Var4.Hw(e40.we(bArr, iV52));
                    }
                }
                return iV52;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    s50 s50Var = (s50) x50VarYS;
                    int iV58 = e40.v5(bArr, iV52, f40Var);
                    int i15 = f40Var.j6 + iV58;
                    while (iV58 < i15) {
                        s50Var.EQ(e40.EQ(bArr, iV58));
                        iV58 += 4;
                    }
                    if (iV58 == i15) {
                        return iV58;
                    }
                    throw y50.j6();
                }
                if (i5 == 5) {
                    s50 s50Var2 = (s50) x50VarYS;
                    s50Var2.EQ(e40.EQ(bArr, i));
                    while (true) {
                        int i16 = iV52 + 4;
                        if (i16 >= i2) {
                            return i16;
                        }
                        iV52 = e40.v5(bArr, i16, f40Var);
                        if (i3 != f40Var.j6) {
                            return i16;
                        }
                        s50Var2.EQ(e40.EQ(bArr, iV52));
                    }
                }
                return iV52;
            case 25:
            case 42:
                if (i5 == 2) {
                    g40 g40Var = (g40) x50VarYS;
                    iV5 = e40.v5(bArr, iV52, f40Var);
                    int i17 = f40Var.j6 + iV5;
                    while (iV5 < i17) {
                        iV5 = e40.VH(bArr, iV5, f40Var);
                        g40Var.DW(f40Var.DW != 0);
                    }
                    if (iV5 != i17) {
                        throw y50.j6();
                    }
                    return iV5;
                }
                if (i5 == 0) {
                    g40 g40Var2 = (g40) x50VarYS;
                    iV52 = e40.VH(bArr, iV52, f40Var);
                    g40Var2.DW(f40Var.DW != 0);
                    while (iV52 < i2) {
                        int iV59 = e40.v5(bArr, iV52, f40Var);
                        if (i3 == f40Var.j6) {
                            iV52 = e40.VH(bArr, iV59, f40Var);
                            g40Var2.DW(f40Var.DW != 0);
                        }
                    }
                }
                return iV52;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        iV52 = e40.v5(bArr, iV52, f40Var);
                        int i18 = f40Var.j6;
                        if (i18 < 0) {
                            throw y50.DW();
                        }
                        if (i18 == 0) {
                            x50VarYS.add("");
                        } else {
                            x50VarYS.add(new String(bArr, iV52, i18, t50.j6));
                            iV52 += i18;
                        }
                        while (iV52 < i2) {
                            int iV510 = e40.v5(bArr, iV52, f40Var);
                            if (i3 == f40Var.j6) {
                                iV52 = e40.v5(bArr, iV510, f40Var);
                                int i19 = f40Var.j6;
                                if (i19 < 0) {
                                    throw y50.DW();
                                }
                                if (i19 == 0) {
                                    x50VarYS.add("");
                                } else {
                                    x50VarYS.add(new String(bArr, iV52, i19, t50.j6));
                                    iV52 += i19;
                                }
                            }
                        }
                    } else {
                        iV52 = e40.v5(bArr, iV52, f40Var);
                        int i20 = f40Var.j6;
                        if (i20 < 0) {
                            throw y50.DW();
                        }
                        if (i20 == 0) {
                            x50VarYS.add("");
                        } else {
                            int i21 = iV52 + i20;
                            if (!s80.tp(bArr, iV52, i21)) {
                                throw y50.u7();
                            }
                            x50VarYS.add(new String(bArr, iV52, i20, t50.j6));
                            iV52 = i21;
                        }
                        while (iV52 < i2) {
                            int iV511 = e40.v5(bArr, iV52, f40Var);
                            if (i3 == f40Var.j6) {
                                iV52 = e40.v5(bArr, iV511, f40Var);
                                int i22 = f40Var.j6;
                                if (i22 < 0) {
                                    throw y50.DW();
                                }
                                if (i22 == 0) {
                                    x50VarYS.add("");
                                } else {
                                    int i23 = iV52 + i22;
                                    if (!s80.tp(bArr, iV52, i23)) {
                                        throw y50.u7();
                                    }
                                    x50VarYS.add(new String(bArr, iV52, i22, t50.j6));
                                    iV52 = i23;
                                }
                            }
                        }
                    }
                }
                return iV52;
            case 27:
                if (i5 == 2) {
                    return we(g3(i6), i3, bArr, i, i2, x50VarYS, f40Var);
                }
                return iV52;
            case 28:
                if (i5 == 2) {
                    int iV512 = e40.v5(bArr, iV52, f40Var);
                    int i24 = f40Var.j6;
                    if (i24 < 0) {
                        throw y50.DW();
                    }
                    if (i24 > bArr.length - iV512) {
                        throw y50.j6();
                    }
                    if (i24 == 0) {
                        x50VarYS.add(i40.mb);
                    } else {
                        x50VarYS.add(i40.a8(bArr, iV512, i24));
                        iV512 += i24;
                    }
                    while (iV512 < i2) {
                        int iV513 = e40.v5(bArr, iV512, f40Var);
                        if (i3 != f40Var.j6) {
                            return iV512;
                        }
                        iV512 = e40.v5(bArr, iV513, f40Var);
                        int i25 = f40Var.j6;
                        if (i25 < 0) {
                            throw y50.DW();
                        }
                        if (i25 > bArr.length - iV512) {
                            throw y50.j6();
                        }
                        if (i25 == 0) {
                            x50VarYS.add(i40.mb);
                        } else {
                            x50VarYS.add(i40.a8(bArr, iV512, i25));
                            iV512 += i25;
                        }
                    }
                    return iV512;
                }
                return iV52;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iV5 = e40.DW(i3, bArr, i, i2, x50VarYS, f40Var);
                    }
                    return iV52;
                }
                iV5 = e40.Zo(bArr, iV52, x50VarYS, f40Var);
                r50 r50Var = (r50) t;
                k80 k80Var = r50Var.zzfpu;
                if (k80Var == k80.Zo()) {
                    k80Var = null;
                }
                k80 k80Var2 = (k80) t70.DW(i4, x50VarYS, I(i6), k80Var, this.Ws);
                if (k80Var2 != null) {
                    r50Var.zzfpu = k80Var2;
                }
                return iV5;
            case ProxyTextView.INPUTTYPE_textEmailAddress /* 33 */:
            case 47:
                if (i5 == 2) {
                    s50 s50Var3 = (s50) x50VarYS;
                    int iV514 = e40.v5(bArr, iV52, f40Var);
                    int i26 = f40Var.j6 + iV514;
                    while (iV514 < i26) {
                        iV514 = e40.v5(bArr, iV514, f40Var);
                        s50Var3.EQ(s40.P8(f40Var.j6));
                    }
                    if (iV514 == i26) {
                        return iV514;
                    }
                    throw y50.j6();
                }
                if (i5 == 0) {
                    s50 s50Var4 = (s50) x50VarYS;
                    int iV515 = e40.v5(bArr, iV52, f40Var);
                    s50Var4.EQ(s40.P8(f40Var.j6));
                    while (iV515 < i2) {
                        int iV516 = e40.v5(bArr, iV515, f40Var);
                        if (i3 != f40Var.j6) {
                            return iV515;
                        }
                        iV515 = e40.v5(bArr, iV516, f40Var);
                        s50Var4.EQ(s40.P8(f40Var.j6));
                    }
                    return iV515;
                }
                return iV52;
            case 34:
            case 48:
                if (i5 == 2) {
                    m60 m60Var5 = (m60) x50VarYS;
                    int iV517 = e40.v5(bArr, iV52, f40Var);
                    int i27 = f40Var.j6 + iV517;
                    while (iV517 < i27) {
                        iV517 = e40.VH(bArr, iV517, f40Var);
                        m60Var5.Hw(s40.a8(f40Var.DW));
                    }
                    if (iV517 == i27) {
                        return iV517;
                    }
                    throw y50.j6();
                }
                if (i5 == 0) {
                    m60 m60Var6 = (m60) x50VarYS;
                    int iVH2 = e40.VH(bArr, iV52, f40Var);
                    m60Var6.Hw(s40.a8(f40Var.DW));
                    while (iVH2 < i2) {
                        int iV518 = e40.v5(bArr, iVH2, f40Var);
                        if (i3 != f40Var.j6) {
                            return iVH2;
                        }
                        iVH2 = e40.VH(bArr, iV518, f40Var);
                        m60Var6.Hw(s40.a8(f40Var.DW));
                    }
                    return iVH2;
                }
                return iV52;
            case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                if (i5 == 3) {
                    r70 r70VarG3 = g3(i6);
                    int i28 = (i3 & (-8)) | 4;
                    iV52 = J0(r70VarG3, bArr, i, i2, i28, f40Var);
                    x50VarYS.add(f40Var.FH);
                    while (iV52 < i2) {
                        int iV519 = e40.v5(bArr, iV52, f40Var);
                        if (i3 == f40Var.j6) {
                            iV52 = J0(r70VarG3, bArr, iV519, i2, i28, f40Var);
                            x50VarYS.add(f40Var.FH);
                        }
                    }
                }
                return iV52;
            default:
                return iV52;
        }
    }

    private final <K, V, UT, UB> UB a8(int i, int i2, Map<K, V> map, v50 v50Var, UB ub, j80<UT, UB> j80Var) {
        s60<?, ?> s60VarZo = this.XL.Zo(Mz(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!v50Var.j6(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = j80Var.EQ();
                }
                o40 o40VarQX = i40.QX(r60.j6(s60VarZo, next.getKey(), next.getValue()));
                try {
                    r60.DW(o40VarQX.DW(), s60VarZo, next.getKey(), next.getValue());
                    j80Var.DW(ub, i2, o40VarQX.j6());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private final <K, V> int aM(T t, byte[] bArr, int i, int i2, int i3, long j, f40 f40Var) throws y50 {
        Unsafe unsafe = j3;
        Object objMz = Mz(i3);
        Object object = unsafe.getObject(t, j);
        if (this.XL.FH(object)) {
            Object objV5 = this.XL.v5(objMz);
            this.XL.j6(objV5, object);
            unsafe.putObject(t, j, objV5);
            object = objV5;
        }
        s60<?, ?> s60VarZo = this.XL.Zo(objMz);
        Map<?, ?> mapHw = this.XL.Hw(object);
        int iV5 = e40.v5(bArr, i, f40Var);
        int i4 = f40Var.j6;
        if (i4 < 0 || i4 > i2 - iV5) {
            throw y50.j6();
        }
        int i5 = i4 + iV5;
        K k = s60VarZo.DW;
        V v = s60VarZo.Hw;
        while (iV5 < i5) {
            int iHw = iV5 + 1;
            int i6 = bArr[iV5];
            if (i6 < 0) {
                iHw = e40.Hw(i6, bArr, iHw, f40Var);
                i6 = f40Var.j6;
            }
            int i7 = iHw;
            int i8 = i6 >>> 3;
            int i9 = i6 & 7;
            if (i8 != 1) {
                if (i8 == 2 && i9 == s60VarZo.FH.DW()) {
                    iV5 = Mr(bArr, i7, i2, s60VarZo.FH, s60VarZo.Hw.getClass(), f40Var);
                    v = f40Var.FH;
                } else {
                    iV5 = e40.j6(i6, bArr, i7, i2, f40Var);
                }
            } else if (i9 == s60VarZo.j6.DW()) {
                iV5 = Mr(bArr, i7, i2, s60VarZo.j6, null, f40Var);
                k = (K) f40Var.FH;
            } else {
                iV5 = e40.j6(i6, bArr, i7, i2, f40Var);
            }
        }
        if (iV5 != i5) {
            throw y50.gn();
        }
        mapHw.put(k, v);
        return i5;
    }

    private static <T> float aj(T t, long j) {
        return ((Float) q80.sh(t, j)).floatValue();
    }

    private static <T> boolean br(T t, long j) {
        return ((Boolean) q80.sh(t, j)).booleanValue();
    }

    private final int ca(int i) {
        return this.j6[i + 1];
    }

    private final void cb(T t, T t2, int i) {
        int iCa = ca(i);
        int i2 = this.j6[i];
        long j = iCa & 1048575;
        if (P8(t2, i2, i)) {
            Object objSh = q80.sh(t, j);
            Object objSh2 = q80.sh(t2, j);
            if (objSh != null && objSh2 != null) {
                q80.VH(t, j, t50.v5(objSh, objSh2));
                cn(t, i2, i);
            } else if (objSh2 != null) {
                q80.VH(t, j, objSh2);
                cn(t, i2, i);
            }
        }
    }

    private final void cn(T t, int i, int i2) {
        q80.U2(t, x9(i2) & 1048575, i);
    }

    private final boolean dx(T t, T t2, int i) {
        return sG(t, i) == sG(t2, i);
    }

    private static <E> List<E> ef(Object obj, long j) {
        return (List) q80.sh(obj, j);
    }

    private final boolean ei(T t, int i, int i2, int i3) {
        return this.gn ? sG(t, i) : (i2 & i3) != 0;
    }

    private static void er(int i, Object obj, f90 f90Var) {
        if (obj instanceof String) {
            f90Var.g3(i, (String) obj);
        } else {
            f90Var.sh(i, (i40) obj);
        }
    }

    private final r70 g3(int i) {
        int i2 = (i / 3) << 1;
        r70 r70Var = (r70) this.DW[i2];
        if (r70Var != null) {
            return r70Var;
        }
        r70<T> r70VarFH = m70.DW().FH((Class) this.DW[i2 + 1]);
        this.DW[i2] = r70VarFH;
        return r70VarFH;
    }

    private final <K, V> void gW(f90 f90Var, int i, Object obj, int i2) {
        if (obj != null) {
            f90Var.ro(i, this.XL.Zo(Mz(i2)), this.XL.gn(obj));
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x007f. Please report as an issue. */
    private final int j3(T t, byte[] bArr, int i, int i2, int i3, f40 f40Var) throws y50 {
        Unsafe unsafe;
        int i4;
        T t2;
        int i5;
        int iHw;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        f40 f40Var2;
        f40 f40Var3;
        int iVH;
        int i13;
        int i14;
        int i15;
        int i16;
        d70<T> d70Var = this;
        T t3 = t;
        byte[] bArr2 = bArr;
        int i17 = i2;
        int i18 = i3;
        f40 f40Var4 = f40Var;
        Unsafe unsafe2 = j3;
        int iDW = i;
        int i19 = -1;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = -1;
        while (true) {
            if (iDW < i17) {
                int i24 = iDW + 1;
                byte b = bArr2[iDW];
                if (b < 0) {
                    iHw = e40.Hw(b, bArr2, i24, f40Var4);
                    i5 = f40Var4.j6;
                } else {
                    i5 = b;
                    iHw = i24;
                }
                int i25 = i5 >>> 3;
                int i26 = i5 & 7;
                int iKD = i25 > i19 ? d70Var.KD(i25, i20 / 3) : d70Var.sy(i25);
                if (iKD == -1) {
                    i6 = i25;
                    i7 = iHw;
                    i8 = i5;
                    unsafe = unsafe2;
                    i4 = i18;
                    i9 = 0;
                } else {
                    int[] iArr = d70Var.j6;
                    int i27 = iArr[iKD + 1];
                    int i28 = (i27 & 267386880) >>> 20;
                    int i29 = i5;
                    long j = i27 & 1048575;
                    if (i28 <= 17) {
                        int i30 = iArr[iKD + 2];
                        int i31 = 1 << (i30 >>> 20);
                        int i32 = i30 & 1048575;
                        if (i32 != i23) {
                            if (i23 != -1) {
                                unsafe2.putInt(t3, i23, i22);
                            }
                            i22 = unsafe2.getInt(t3, i32);
                            i23 = i32;
                        }
                        switch (i28) {
                            case 0:
                                f40Var2 = f40Var;
                                i10 = iKD;
                                i6 = i25;
                                i12 = i29;
                                bArr2 = bArr;
                                i11 = iHw;
                                if (i26 != 1) {
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                } else {
                                    q80.Hw(t3, j, e40.J0(bArr2, i11));
                                    iDW = i11 + 8;
                                    i22 |= i31;
                                    i17 = i2;
                                    i21 = i12;
                                    i20 = i10;
                                    f40Var4 = f40Var2;
                                    i19 = i6;
                                    i18 = i3;
                                }
                            case 1:
                                f40Var2 = f40Var;
                                i10 = iKD;
                                i6 = i25;
                                i12 = i29;
                                bArr2 = bArr;
                                i11 = iHw;
                                if (i26 != 5) {
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                } else {
                                    q80.v5(t3, j, e40.J8(bArr2, i11));
                                    iDW = i11 + 4;
                                    i22 |= i31;
                                    i17 = i2;
                                    i21 = i12;
                                    i20 = i10;
                                    f40Var4 = f40Var2;
                                    i19 = i6;
                                    i18 = i3;
                                }
                            case 2:
                            case 3:
                                f40Var3 = f40Var;
                                i10 = iKD;
                                i6 = i25;
                                i12 = i29;
                                bArr2 = bArr;
                                i11 = iHw;
                                if (i26 != 0) {
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                } else {
                                    iVH = e40.VH(bArr2, i11, f40Var3);
                                    unsafe2.putLong(t, j, f40Var3.DW);
                                    i22 |= i31;
                                    i21 = i12;
                                    i20 = i10;
                                    f40Var4 = f40Var3;
                                    iDW = iVH;
                                    i19 = i6;
                                    i17 = i2;
                                    i18 = i3;
                                }
                            case 4:
                            case 11:
                                f40Var2 = f40Var;
                                i10 = iKD;
                                i6 = i25;
                                i12 = i29;
                                bArr2 = bArr;
                                i11 = iHw;
                                if (i26 != 0) {
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                } else {
                                    iDW = e40.v5(bArr2, i11, f40Var2);
                                    unsafe2.putInt(t3, j, f40Var2.j6);
                                    i22 |= i31;
                                    i17 = i2;
                                    i21 = i12;
                                    i20 = i10;
                                    f40Var4 = f40Var2;
                                    i19 = i6;
                                    i18 = i3;
                                }
                            case 5:
                            case 14:
                                f40Var2 = f40Var;
                                i10 = iKD;
                                i6 = i25;
                                i12 = i29;
                                bArr2 = bArr;
                                if (i26 != 1) {
                                    i11 = iHw;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                } else {
                                    i11 = iHw;
                                    unsafe2.putLong(t, j, e40.we(bArr2, iHw));
                                    iDW = i11 + 8;
                                    i22 |= i31;
                                    i17 = i2;
                                    i21 = i12;
                                    i20 = i10;
                                    f40Var4 = f40Var2;
                                    i19 = i6;
                                    i18 = i3;
                                }
                            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                            case 13:
                                f40Var2 = f40Var;
                                i10 = iKD;
                                i6 = i25;
                                i12 = i29;
                                bArr2 = bArr;
                                i17 = i2;
                                if (i26 != 5) {
                                    i11 = iHw;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                } else {
                                    unsafe2.putInt(t3, j, e40.EQ(bArr2, iHw));
                                    iDW = iHw + 4;
                                    i22 |= i31;
                                    i21 = i12;
                                    i20 = i10;
                                    f40Var4 = f40Var2;
                                    i19 = i6;
                                    i18 = i3;
                                }
                            case UserTouchAction.CLICK_KIND /* 7 */:
                                f40Var2 = f40Var;
                                i10 = iKD;
                                i6 = i25;
                                i12 = i29;
                                bArr2 = bArr;
                                i17 = i2;
                                if (i26 != 0) {
                                    i11 = iHw;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                } else {
                                    iDW = e40.VH(bArr2, iHw, f40Var2);
                                    q80.gn(t3, j, f40Var2.DW != 0);
                                    i22 |= i31;
                                    i21 = i12;
                                    i20 = i10;
                                    f40Var4 = f40Var2;
                                    i19 = i6;
                                    i18 = i3;
                                }
                            case 8:
                                f40Var2 = f40Var;
                                i10 = iKD;
                                i6 = i25;
                                i12 = i29;
                                bArr2 = bArr;
                                i17 = i2;
                                if (i26 != 2) {
                                    i11 = iHw;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                } else {
                                    iDW = (i27 & 536870912) == 0 ? e40.gn(bArr2, iHw, f40Var2) : e40.u7(bArr2, iHw, f40Var2);
                                    unsafe2.putObject(t3, j, f40Var2.FH);
                                    i22 |= i31;
                                    i21 = i12;
                                    i20 = i10;
                                    f40Var4 = f40Var2;
                                    i19 = i6;
                                    i18 = i3;
                                }
                            case 9:
                                f40Var2 = f40Var;
                                i10 = iKD;
                                i6 = i25;
                                i12 = i29;
                                bArr2 = bArr;
                                if (i26 != 2) {
                                    i11 = iHw;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                } else {
                                    i17 = i2;
                                    iDW = J8(d70Var.g3(i10), bArr2, iHw, i17, f40Var2);
                                    if ((i22 & i31) == 0) {
                                        unsafe2.putObject(t3, j, f40Var2.FH);
                                    } else {
                                        unsafe2.putObject(t3, j, t50.v5(unsafe2.getObject(t3, j), f40Var2.FH));
                                    }
                                    i22 |= i31;
                                    i21 = i12;
                                    i20 = i10;
                                    f40Var4 = f40Var2;
                                    i19 = i6;
                                    i18 = i3;
                                }
                            case 10:
                                f40Var2 = f40Var;
                                i10 = iKD;
                                i6 = i25;
                                i12 = i29;
                                bArr2 = bArr;
                                if (i26 != 2) {
                                    i11 = iHw;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                } else {
                                    iDW = e40.tp(bArr2, iHw, f40Var2);
                                    unsafe2.putObject(t3, j, f40Var2.FH);
                                    i22 |= i31;
                                    i17 = i2;
                                    i21 = i12;
                                    i20 = i10;
                                    f40Var4 = f40Var2;
                                    i19 = i6;
                                    i18 = i3;
                                }
                            case 12:
                                f40Var2 = f40Var;
                                i10 = iKD;
                                i6 = i25;
                                i12 = i29;
                                bArr2 = bArr;
                                if (i26 != 0) {
                                    i11 = iHw;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                } else {
                                    iDW = e40.v5(bArr2, iHw, f40Var2);
                                    int i33 = f40Var2.j6;
                                    v50 v50VarI = d70Var.I(i10);
                                    if (v50VarI == null || v50VarI.j6(i33)) {
                                        unsafe2.putInt(t3, j, i33);
                                        i22 |= i31;
                                        i17 = i2;
                                        i21 = i12;
                                        i20 = i10;
                                        f40Var4 = f40Var2;
                                        i19 = i6;
                                        i18 = i3;
                                    } else {
                                        SI(t).EQ(i12, Long.valueOf(i33));
                                        i17 = i2;
                                        i21 = i12;
                                        i20 = i10;
                                        f40Var4 = f40Var2;
                                        i19 = i6;
                                        i18 = i3;
                                    }
                                }
                                break;
                            case 15:
                                f40Var2 = f40Var;
                                i10 = iKD;
                                i6 = i25;
                                i12 = i29;
                                bArr2 = bArr;
                                if (i26 != 0) {
                                    i11 = iHw;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                } else {
                                    iDW = e40.v5(bArr2, iHw, f40Var2);
                                    unsafe2.putInt(t3, j, s40.P8(f40Var2.j6));
                                    i22 |= i31;
                                    i17 = i2;
                                    i21 = i12;
                                    i20 = i10;
                                    f40Var4 = f40Var2;
                                    i19 = i6;
                                    i18 = i3;
                                }
                            case 16:
                                f40Var3 = f40Var;
                                i10 = iKD;
                                i6 = i25;
                                i12 = i29;
                                if (i26 != 0) {
                                    i11 = iHw;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                } else {
                                    bArr2 = bArr;
                                    iVH = e40.VH(bArr2, iHw, f40Var3);
                                    unsafe2.putLong(t, j, s40.a8(f40Var3.DW));
                                    i22 |= i31;
                                    i21 = i12;
                                    i20 = i10;
                                    f40Var4 = f40Var3;
                                    iDW = iVH;
                                    i19 = i6;
                                    i17 = i2;
                                    i18 = i3;
                                }
                            case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                                if (i26 != 3) {
                                    i10 = iKD;
                                    i6 = i25;
                                    i12 = i29;
                                    i11 = iHw;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                } else {
                                    i10 = iKD;
                                    i6 = i25;
                                    i12 = i29;
                                    iDW = J0(d70Var.g3(iKD), bArr, iHw, i2, (i25 << 3) | 4, f40Var);
                                    if ((i22 & i31) == 0) {
                                        f40Var2 = f40Var;
                                        unsafe2.putObject(t3, j, f40Var2.FH);
                                    } else {
                                        f40Var2 = f40Var;
                                        unsafe2.putObject(t3, j, t50.v5(unsafe2.getObject(t3, j), f40Var2.FH));
                                    }
                                    i22 |= i31;
                                    bArr2 = bArr;
                                    i17 = i2;
                                    i21 = i12;
                                    i20 = i10;
                                    f40Var4 = f40Var2;
                                    i19 = i6;
                                    i18 = i3;
                                }
                            default:
                                i10 = iKD;
                                i6 = i25;
                                i11 = iHw;
                                i12 = i29;
                                i9 = i10;
                                unsafe = unsafe2;
                                i7 = i11;
                                i8 = i12;
                                i4 = i3;
                                break;
                        }
                    } else {
                        i6 = i25;
                        bArr2 = bArr;
                        int i34 = iHw;
                        if (i28 != 27) {
                            i13 = i22;
                            if (i28 <= 49) {
                                i14 = i23;
                                i15 = i29;
                                i9 = iKD;
                                unsafe = unsafe2;
                                iDW = XL(t, bArr, i34, i2, i29, i6, i26, iKD, i27, i28, j, f40Var);
                                if (iDW == i34) {
                                    i4 = i3;
                                    i7 = iDW;
                                    i22 = i13;
                                    i23 = i14;
                                    i8 = i15;
                                } else {
                                    d70Var = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i17 = i2;
                                    i18 = i3;
                                    f40Var4 = f40Var;
                                    i22 = i13;
                                    i19 = i6;
                                    i20 = i9;
                                    i23 = i14;
                                    i21 = i15;
                                    unsafe2 = unsafe;
                                }
                            } else {
                                i14 = i23;
                                i15 = i29;
                                i9 = iKD;
                                unsafe = unsafe2;
                                i16 = i34;
                                if (i28 != 50) {
                                    iDW = QX(t, bArr, i16, i2, i15, i6, i26, i27, i28, j, i9, f40Var);
                                    if (iDW != i16) {
                                        d70Var = this;
                                        t3 = t;
                                        bArr2 = bArr;
                                        i17 = i2;
                                        i18 = i3;
                                        i21 = i15;
                                        i22 = i13;
                                        i19 = i6;
                                        i20 = i9;
                                        i23 = i14;
                                        unsafe2 = unsafe;
                                    }
                                } else if (i26 == 2) {
                                    iDW = aM(t, bArr, i16, i2, i9, j, f40Var);
                                    if (iDW != i16) {
                                        d70Var = this;
                                        t3 = t;
                                        bArr2 = bArr;
                                        i17 = i2;
                                        i18 = i3;
                                        f40Var4 = f40Var;
                                        i22 = i13;
                                        i19 = i6;
                                        i20 = i9;
                                        i23 = i14;
                                        i21 = i15;
                                        unsafe2 = unsafe;
                                    }
                                }
                                i4 = i3;
                                i7 = iDW;
                                i22 = i13;
                                i23 = i14;
                                i8 = i15;
                            }
                        } else if (i26 == 2) {
                            x50 x50VarYS = (x50) unsafe2.getObject(t3, j);
                            if (!x50VarYS.XL()) {
                                int size = x50VarYS.size();
                                x50VarYS = x50VarYS.yS(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(t3, j, x50VarYS);
                            }
                            iDW = we(d70Var.g3(iKD), i29, bArr, i34, i2, x50VarYS, f40Var);
                            i17 = i2;
                            i18 = i3;
                            i21 = i29;
                            i20 = iKD;
                            i22 = i22;
                            i19 = i6;
                        } else {
                            i13 = i22;
                            i14 = i23;
                            i15 = i29;
                            i9 = iKD;
                            unsafe = unsafe2;
                            i16 = i34;
                        }
                        i4 = i3;
                        i7 = i16;
                        i22 = i13;
                        i23 = i14;
                        i8 = i15;
                    }
                    f40Var4 = f40Var;
                }
                if (i8 != i4 || i4 == 0) {
                    iDW = DW(i8, bArr, i7, i2, t, f40Var);
                    d70Var = this;
                    t3 = t;
                    bArr2 = bArr;
                    i17 = i2;
                    i18 = i4;
                    i21 = i8;
                    i19 = i6;
                    i20 = i9;
                    unsafe2 = unsafe;
                    f40Var4 = f40Var;
                } else {
                    iDW = i7;
                    i21 = i8;
                }
            } else {
                unsafe = unsafe2;
                i4 = i18;
            }
        }
        if (i23 != -1) {
            t2 = t;
            unsafe.putInt(t2, i23, i22);
        } else {
            t2 = t;
        }
        k80 k80Var = null;
        for (int i35 = this.EQ; i35 < this.we; i35++) {
            k80Var = (k80) lg(t2, this.tp[i35], k80Var, this.Ws);
        }
        if (k80Var != null) {
            this.Ws.QX(t2, k80Var);
        }
        if (i4 == 0) {
            if (iDW != i2) {
                throw y50.gn();
            }
        } else if (iDW > i2 || i21 != i4) {
            throw y50.gn();
        }
        return iDW;
    }

    private final <UT, UB> UB lg(Object obj, int i, UB ub, j80<UT, UB> j80Var) {
        v50 v50VarI;
        int i2 = this.j6[i];
        Object objSh = q80.sh(obj, ca(i) & 1048575);
        return (objSh == null || (v50VarI = I(i)) == null) ? ub : (UB) a8(i, i2, this.XL.Hw(objSh), v50VarI, ub, j80Var);
    }

    private static <T> int lp(T t, long j) {
        return ((Integer) q80.sh(t, j)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean nw(Object obj, int i, r70 r70Var) {
        return r70Var.Zo(q80.sh(obj, i & 1048575));
    }

    private static Field rN(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(string).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(string);
            throw new RuntimeException(sb.toString());
        }
    }

    private final int ro(int i, int i2) {
        int length = (this.j6.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.j6[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private final boolean sG(T t, int i) {
        if (!this.gn) {
            int iX9 = x9(i);
            return (q80.ei(t, (long) (iX9 & 1048575)) & (1 << (iX9 >>> 20))) != 0;
        }
        int iCa = ca(i);
        long j = iCa & 1048575;
        switch ((iCa & 267386880) >>> 20) {
            case 0:
                return q80.ro(t, j) != 0.0d;
            case 1:
                return q80.KD(t, j) != 0.0f;
            case 2:
                return q80.nw(t, j) != 0;
            case 3:
                return q80.nw(t, j) != 0;
            case 4:
                return q80.ei(t, j) != 0;
            case 5:
                return q80.nw(t, j) != 0;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                return q80.ei(t, j) != 0;
            case UserTouchAction.CLICK_KIND /* 7 */:
                return q80.SI(t, j);
            case 8:
                Object objSh = q80.sh(t, j);
                if (objSh instanceof String) {
                    return !((String) objSh).isEmpty();
                }
                if (objSh instanceof i40) {
                    return !i40.mb.equals(objSh);
                }
                throw new IllegalArgumentException();
            case 9:
                return q80.sh(t, j) != null;
            case 10:
                return !i40.mb.equals(q80.sh(t, j));
            case 11:
                return q80.ei(t, j) != 0;
            case 12:
                return q80.ei(t, j) != 0;
            case 13:
                return q80.ei(t, j) != 0;
            case 14:
                return q80.nw(t, j) != 0;
            case 15:
                return q80.ei(t, j) != 0;
            case 16:
                return q80.nw(t, j) != 0;
            case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                return q80.sh(t, j) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void sh(T r19, com.google.android.gms.internal.ads.f90 r20) {
        /*
            Method dump skipped, instructions count: 1312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d70.sh(java.lang.Object, com.google.android.gms.internal.ads.f90):void");
    }

    private final int sy(int i) {
        if (i < this.FH || i > this.Hw) {
            return -1;
        }
        return ro(i, 0);
    }

    private static <T> double vJ(T t, long j) {
        return ((Double) q80.sh(t, j)).doubleValue();
    }

    private final void vy(T t, T t2, int i) {
        long jCa = ca(i) & 1048575;
        if (sG(t2, i)) {
            Object objSh = q80.sh(t, jCa);
            Object objSh2 = q80.sh(t2, jCa);
            if (objSh != null && objSh2 != null) {
                q80.VH(t, jCa, t50.v5(objSh, objSh2));
                Sf(t, i);
            } else if (objSh2 != null) {
                q80.VH(t, jCa, objSh2);
                Sf(t, i);
            }
        }
    }

    private static int we(r70<?> r70Var, int i, byte[] bArr, int i2, int i3, x50<?> x50Var, f40 f40Var) throws y50 {
        int iJ8 = J8(r70Var, bArr, i2, i3, f40Var);
        x50Var.add(f40Var.FH);
        while (iJ8 < i3) {
            int iV5 = e40.v5(bArr, iJ8, f40Var);
            if (i != f40Var.j6) {
                break;
            }
            iJ8 = J8(r70Var, bArr, iV5, i3, f40Var);
            x50Var.add(f40Var.FH);
        }
        return iJ8;
    }

    private final int x9(int i) {
        return this.j6[i + 2];
    }

    private static <UT, UB> void yS(j80<UT, UB> j80Var, T t, f90 f90Var) {
        j80Var.Hw(j80Var.gn(t), f90Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @Override // com.google.android.gms.internal.ads.r70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EQ(T r13, com.google.android.gms.internal.ads.f90 r14) {
        /*
            Method dump skipped, instructions count: 2710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d70.EQ(java.lang.Object, com.google.android.gms.internal.ads.f90):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0908 A[PHI: r6
      0x0908: PHI (r6v4 int) = 
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v13 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v14 int)
      (r6v1 int)
     binds: [B:256:0x0545, B:460:0x09b6, B:457:0x09ac, B:451:0x0990, B:448:0x097e, B:445:0x096f, B:442:0x0962, B:439:0x0955, B:435:0x094a, B:432:0x093f, B:429:0x0932, B:426:0x0925, B:423:0x0912, B:396:0x081e, B:390:0x0801, B:384:0x07e4, B:378:0x07c7, B:372:0x07a9, B:366:0x078b, B:360:0x076d, B:354:0x074f, B:348:0x0731, B:342:0x0713, B:336:0x06f5, B:330:0x06d7, B:324:0x06b9, B:318:0x069b, B:313:0x0667, B:310:0x065a, B:307:0x064a, B:304:0x063a, B:301:0x062a, B:298:0x061c, B:295:0x060f, B:292:0x0603, B:286:0x05e5, B:283:0x05d1, B:280:0x05bf, B:277:0x05af, B:274:0x059f, B:437:0x0951, B:271:0x0592, B:268:0x0584, B:265:0x0574, B:262:0x0564, B:419:0x0907, B:259:0x054e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.r70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int FH(T r20) {
        /*
            Method dump skipped, instructions count: 2904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d70.FH(java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01b1  */
    @Override // com.google.android.gms.internal.ads.r70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Hw(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d70.Hw(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.ads.r70
    public final int VH(T t) {
        int i;
        int iVH;
        int length = this.j6.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iCa = ca(i3);
            int i4 = this.j6[i3];
            long j = 1048575 & iCa;
            int iHashCode = 37;
            switch ((iCa & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    iVH = t50.VH(Double.doubleToLongBits(q80.ro(t, j)));
                    i2 = i + iVH;
                    break;
                case 1:
                    i = i2 * 53;
                    iVH = Float.floatToIntBits(q80.KD(t, j));
                    i2 = i + iVH;
                    break;
                case 2:
                    i = i2 * 53;
                    iVH = t50.VH(q80.nw(t, j));
                    i2 = i + iVH;
                    break;
                case 3:
                    i = i2 * 53;
                    iVH = t50.VH(q80.nw(t, j));
                    i2 = i + iVH;
                    break;
                case 4:
                    i = i2 * 53;
                    iVH = q80.ei(t, j);
                    i2 = i + iVH;
                    break;
                case 5:
                    i = i2 * 53;
                    iVH = t50.VH(q80.nw(t, j));
                    i2 = i + iVH;
                    break;
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    i = i2 * 53;
                    iVH = q80.ei(t, j);
                    i2 = i + iVH;
                    break;
                case UserTouchAction.CLICK_KIND /* 7 */:
                    i = i2 * 53;
                    iVH = t50.Zo(q80.SI(t, j));
                    i2 = i + iVH;
                    break;
                case 8:
                    i = i2 * 53;
                    iVH = ((String) q80.sh(t, j)).hashCode();
                    i2 = i + iVH;
                    break;
                case 9:
                    Object objSh = q80.sh(t, j);
                    if (objSh != null) {
                        iHashCode = objSh.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iVH = q80.sh(t, j).hashCode();
                    i2 = i + iVH;
                    break;
                case 11:
                    i = i2 * 53;
                    iVH = q80.ei(t, j);
                    i2 = i + iVH;
                    break;
                case 12:
                    i = i2 * 53;
                    iVH = q80.ei(t, j);
                    i2 = i + iVH;
                    break;
                case 13:
                    i = i2 * 53;
                    iVH = q80.ei(t, j);
                    i2 = i + iVH;
                    break;
                case 14:
                    i = i2 * 53;
                    iVH = t50.VH(q80.nw(t, j));
                    i2 = i + iVH;
                    break;
                case 15:
                    i = i2 * 53;
                    iVH = q80.ei(t, j);
                    i2 = i + iVH;
                    break;
                case 16:
                    i = i2 * 53;
                    iVH = t50.VH(q80.nw(t, j));
                    i2 = i + iVH;
                    break;
                case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                    Object objSh2 = q80.sh(t, j);
                    if (objSh2 != null) {
                        iHashCode = objSh2.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                case 19:
                case ProxyTextView.INPUTTYPE_date /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case ProxyTextView.INPUTTYPE_textEmailAddress /* 33 */:
                case 34:
                case 35:
                case ProxyTextView.INPUTTYPE_time /* 36 */:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                    i = i2 * 53;
                    iVH = q80.sh(t, j).hashCode();
                    i2 = i + iVH;
                    break;
                case 50:
                    i = i2 * 53;
                    iVH = q80.sh(t, j).hashCode();
                    i2 = i + iVH;
                    break;
                case 51:
                    if (P8(t, i4, i3)) {
                        i = i2 * 53;
                        iVH = t50.VH(Double.doubleToLongBits(vJ(t, j)));
                        i2 = i + iVH;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (P8(t, i4, i3)) {
                        i = i2 * 53;
                        iVH = Float.floatToIntBits(aj(t, j));
                        i2 = i + iVH;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (P8(t, i4, i3)) {
                        i = i2 * 53;
                        iVH = t50.VH(OW(t, j));
                        i2 = i + iVH;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (P8(t, i4, i3)) {
                        i = i2 * 53;
                        iVH = t50.VH(OW(t, j));
                        i2 = i + iVH;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (P8(t, i4, i3)) {
                        i = i2 * 53;
                        iVH = lp(t, j);
                        i2 = i + iVH;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (P8(t, i4, i3)) {
                        i = i2 * 53;
                        iVH = t50.VH(OW(t, j));
                        i2 = i + iVH;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (P8(t, i4, i3)) {
                        i = i2 * 53;
                        iVH = lp(t, j);
                        i2 = i + iVH;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (P8(t, i4, i3)) {
                        i = i2 * 53;
                        iVH = t50.Zo(br(t, j));
                        i2 = i + iVH;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (P8(t, i4, i3)) {
                        i = i2 * 53;
                        iVH = ((String) q80.sh(t, j)).hashCode();
                        i2 = i + iVH;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (P8(t, i4, i3)) {
                        i = i2 * 53;
                        iVH = q80.sh(t, j).hashCode();
                        i2 = i + iVH;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (P8(t, i4, i3)) {
                        i = i2 * 53;
                        iVH = q80.sh(t, j).hashCode();
                        i2 = i + iVH;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (P8(t, i4, i3)) {
                        i = i2 * 53;
                        iVH = lp(t, j);
                        i2 = i + iVH;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (P8(t, i4, i3)) {
                        i = i2 * 53;
                        iVH = lp(t, j);
                        i2 = i + iVH;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (P8(t, i4, i3)) {
                        i = i2 * 53;
                        iVH = lp(t, j);
                        i2 = i + iVH;
                        break;
                    } else {
                        break;
                    }
                case ProxyTextView.INPUTTYPE_textShortMessage /* 65 */:
                    if (P8(t, i4, i3)) {
                        i = i2 * 53;
                        iVH = t50.VH(OW(t, j));
                        i2 = i + iVH;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (P8(t, i4, i3)) {
                        i = i2 * 53;
                        iVH = lp(t, j);
                        i2 = i + iVH;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (P8(t, i4, i3)) {
                        i = i2 * 53;
                        iVH = t50.VH(OW(t, j));
                        i2 = i + iVH;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (P8(t, i4, i3)) {
                        i = i2 * 53;
                        iVH = q80.sh(t, j).hashCode();
                        i2 = i + iVH;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i2 * 53) + this.Ws.gn(t).hashCode();
        return this.Zo ? (iHashCode2 * 53) + this.QX.gn(t).hashCode() : iHashCode2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.google.android.gms.internal.ads.r70] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.ads.r70] */
    @Override // com.google.android.gms.internal.ads.r70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Zo(T r14) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d70.Zo(java.lang.Object):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x022e, code lost:
    
        if (r0 == r15) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0230, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e2, code lost:
    
        if (r0 == r15) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x020f, code lost:
    
        if (r0 == r15) goto L104;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0061. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    @Override // com.google.android.gms.internal.ads.r70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void gn(T r28, byte[] r29, int r30, int r31, com.google.android.gms.internal.ads.f40 r32) throws com.google.android.gms.internal.ads.y50 {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d70.gn(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.f40):void");
    }

    @Override // com.google.android.gms.internal.ads.r70
    public final void j6(T t, T t2) {
        if (t2 == null) {
            throw null;
        }
        for (int i = 0; i < this.j6.length; i += 3) {
            int iCa = ca(i);
            long j = 1048575 & iCa;
            int i2 = this.j6[i];
            switch ((iCa & 267386880) >>> 20) {
                case 0:
                    if (sG(t2, i)) {
                        q80.Hw(t, j, q80.ro(t2, j));
                        Sf(t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (sG(t2, i)) {
                        q80.v5(t, j, q80.KD(t2, j));
                        Sf(t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (sG(t2, i)) {
                        q80.Zo(t, j, q80.nw(t2, j));
                        Sf(t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (sG(t2, i)) {
                        q80.Zo(t, j, q80.nw(t2, j));
                        Sf(t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (sG(t2, i)) {
                        q80.U2(t, j, q80.ei(t2, j));
                        Sf(t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (sG(t2, i)) {
                        q80.Zo(t, j, q80.nw(t2, j));
                        Sf(t, i);
                        break;
                    } else {
                        break;
                    }
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    if (sG(t2, i)) {
                        q80.U2(t, j, q80.ei(t2, j));
                        Sf(t, i);
                        break;
                    } else {
                        break;
                    }
                case UserTouchAction.CLICK_KIND /* 7 */:
                    if (sG(t2, i)) {
                        q80.gn(t, j, q80.SI(t2, j));
                        Sf(t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (sG(t2, i)) {
                        q80.VH(t, j, q80.sh(t2, j));
                        Sf(t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    vy(t, t2, i);
                    break;
                case 10:
                    if (sG(t2, i)) {
                        q80.VH(t, j, q80.sh(t2, j));
                        Sf(t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (sG(t2, i)) {
                        q80.U2(t, j, q80.ei(t2, j));
                        Sf(t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (sG(t2, i)) {
                        q80.U2(t, j, q80.ei(t2, j));
                        Sf(t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (sG(t2, i)) {
                        q80.U2(t, j, q80.ei(t2, j));
                        Sf(t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (sG(t2, i)) {
                        q80.Zo(t, j, q80.nw(t2, j));
                        Sf(t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (sG(t2, i)) {
                        q80.U2(t, j, q80.ei(t2, j));
                        Sf(t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (sG(t2, i)) {
                        q80.Zo(t, j, q80.nw(t2, j));
                        Sf(t, i);
                        break;
                    } else {
                        break;
                    }
                case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                    vy(t, t2, i);
                    break;
                case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                case 19:
                case ProxyTextView.INPUTTYPE_date /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case ProxyTextView.INPUTTYPE_textEmailAddress /* 33 */:
                case 34:
                case 35:
                case ProxyTextView.INPUTTYPE_time /* 36 */:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                    this.J8.DW(t, t2, j);
                    break;
                case 50:
                    t70.VH(this.XL, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (P8(t2, i2, i)) {
                        q80.VH(t, j, q80.sh(t2, j));
                        cn(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    cb(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case ProxyTextView.INPUTTYPE_textShortMessage /* 65 */:
                case 66:
                case 67:
                    if (P8(t2, i2, i)) {
                        q80.VH(t, j, q80.sh(t2, j));
                        cn(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    cb(t, t2, i);
                    break;
            }
        }
        if (this.gn) {
            return;
        }
        t70.gn(this.Ws, t, t2);
        if (this.Zo) {
            t70.Zo(this.QX, t, t2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x05c3 A[LOOP:5: B:163:0x05bf->B:165:0x05c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05d0  */
    @Override // com.google.android.gms.internal.ads.r70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tp(T r11, com.google.android.gms.internal.ads.q70 r12, com.google.android.gms.internal.ads.d50 r13) {
        /*
            Method dump skipped, instructions count: 1638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d70.tp(java.lang.Object, com.google.android.gms.internal.ads.q70, com.google.android.gms.internal.ads.d50):void");
    }

    @Override // com.google.android.gms.internal.ads.r70
    public final void u7(T t) {
        int i;
        int i2 = this.EQ;
        while (true) {
            i = this.we;
            if (i2 >= i) {
                break;
            }
            long jCa = ca(this.tp[i2]) & 1048575;
            Object objSh = q80.sh(t, jCa);
            if (objSh != null) {
                q80.VH(t, jCa, this.XL.VH(objSh));
            }
            i2++;
        }
        int length = this.tp.length;
        while (i < length) {
            this.J8.v5(t, this.tp[i]);
            i++;
        }
        this.Ws.aM(t);
        if (this.Zo) {
            this.QX.tp(t);
        }
    }

    @Override // com.google.android.gms.internal.ads.r70
    public final T v5() {
        return (T) this.J0.j6(this.v5);
    }
}
