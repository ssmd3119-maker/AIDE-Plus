package com.google.android.gms.internal.measurement;

import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;
import java.util.List;

/* loaded from: classes.dex */
public final class i3 implements b6 {
    private int DW;
    private int FH;
    private int Hw = 0;
    private final f3 j6;

    private i3(f3 f3Var) {
        g4.Hw(f3Var, "input");
        f3 f3Var2 = f3Var;
        this.j6 = f3Var2;
        f3Var2.FH = this;
    }

    private final Object KD(j7 j7Var, Class<?> cls, r3 r3Var) throws l4 {
        switch (j3.j6[j7Var.ordinal()]) {
            case 1:
                return Boolean.valueOf(rN());
            case 2:
                return jJ();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(An());
            case 5:
                return Integer.valueOf(gW());
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                return Long.valueOf(vy());
            case UserTouchAction.CLICK_KIND /* 7 */:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(ei());
            case 9:
                return Long.valueOf(PT());
            case 10:
                cn(2);
                return sG(y5.FH().DW(cls), r3Var);
            case 11:
                return Integer.valueOf(sM());
            case 12:
                return Long.valueOf(e3());
            case 13:
                return Integer.valueOf(zzuw());
            case 14:
                return Long.valueOf(iW());
            case 15:
                return a8();
            case 16:
                return Integer.valueOf(J8());
            case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                return Long.valueOf(QX());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    public static i3 SI(f3 f3Var) {
        i3 i3Var = f3Var.FH;
        return i3Var != null ? i3Var : new i3(f3Var);
    }

    private static void cb(int i) throws k4 {
        if ((i & 3) != 0) {
            throw k4.gn();
        }
    }

    private final void cn(int i) throws l4 {
        if ((this.DW & 7) != i) {
            throw k4.Zo();
        }
    }

    private final void dx(int i) throws k4 {
        if (this.j6.vy() != i) {
            throw k4.DW();
        }
    }

    private final <T> T ef(c6<T> c6Var, r3 r3Var) {
        int i = this.FH;
        this.FH = ((this.DW >>> 3) << 3) | 4;
        try {
            T tV5 = c6Var.v5();
            c6Var.u7(tV5, this, r3Var);
            c6Var.FH(tV5);
            if (this.DW == this.FH) {
                return tV5;
            }
            throw k4.gn();
        } finally {
            this.FH = i;
        }
    }

    private final void ro(List<String> list, boolean z) throws l4 {
        int iJ0;
        int iJ02;
        if ((this.DW & 7) != 2) {
            throw k4.Zo();
        }
        if (!(list instanceof u4) || z) {
            do {
                list.add(z ? a8() : u7());
                if (this.j6.BT()) {
                    return;
                } else {
                    iJ0 = this.j6.J0();
                }
            } while (iJ0 == this.DW);
            this.Hw = iJ0;
            return;
        }
        u4 u4Var = (u4) list;
        do {
            u4Var.U2(jJ());
            if (this.j6.BT()) {
                return;
            } else {
                iJ02 = this.j6.J0();
            }
        } while (iJ02 == this.DW);
        this.Hw = iJ02;
    }

    private final <T> T sG(c6<T> c6Var, r3 r3Var) throws k4 {
        int iA8 = this.j6.a8();
        f3 f3Var = this.j6;
        if (f3Var.j6 >= f3Var.DW) {
            throw k4.VH();
        }
        int iU7 = f3Var.u7(iA8);
        T tV5 = c6Var.v5();
        this.j6.j6++;
        c6Var.u7(tV5, this, r3Var);
        c6Var.FH(tV5);
        this.j6.Zo(0);
        r5.j6--;
        this.j6.tp(iU7);
        return tV5;
    }

    private static void sh(int i) throws k4 {
        if ((i & 7) != 0) {
            throw k4.gn();
        }
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final int An() throws l4 {
        cn(0);
        return this.j6.lg();
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final void BT(List<Long> list) throws k4 {
        int iJ0;
        int iJ02;
        if (!(list instanceof z4)) {
            int i = this.DW & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.j6.J8()));
                    if (this.j6.BT()) {
                        return;
                    } else {
                        iJ0 = this.j6.J0();
                    }
                } while (iJ0 == this.DW);
                this.Hw = iJ0;
                return;
            }
            if (i != 2) {
                throw k4.Zo();
            }
            int iVy = this.j6.vy() + this.j6.a8();
            do {
                list.add(Long.valueOf(this.j6.J8()));
            } while (this.j6.vy() < iVy);
            dx(iVy);
            return;
        }
        z4 z4Var = (z4) list;
        int i2 = this.DW & 7;
        if (i2 == 0) {
            do {
                z4Var.VH(this.j6.J8());
                if (this.j6.BT()) {
                    return;
                } else {
                    iJ02 = this.j6.J0();
                }
            } while (iJ02 == this.DW);
            this.Hw = iJ02;
            return;
        }
        if (i2 != 2) {
            throw k4.Zo();
        }
        int iVy2 = this.j6.vy() + this.j6.a8();
        do {
            z4Var.VH(this.j6.J8());
        } while (this.j6.vy() < iVy2);
        dx(iVy2);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final void DW(List<Long> list) throws k4 {
        int iJ0;
        int iJ02;
        if (!(list instanceof z4)) {
            int i = this.DW & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.j6.gW()));
                    if (this.j6.BT()) {
                        return;
                    } else {
                        iJ0 = this.j6.J0();
                    }
                } while (iJ0 == this.DW);
                this.Hw = iJ0;
                return;
            }
            if (i != 2) {
                throw k4.Zo();
            }
            int iVy = this.j6.vy() + this.j6.a8();
            do {
                list.add(Long.valueOf(this.j6.gW()));
            } while (this.j6.vy() < iVy);
            dx(iVy);
            return;
        }
        z4 z4Var = (z4) list;
        int i2 = this.DW & 7;
        if (i2 == 0) {
            do {
                z4Var.VH(this.j6.gW());
                if (this.j6.BT()) {
                    return;
                } else {
                    iJ02 = this.j6.J0();
                }
            } while (iJ02 == this.DW);
            this.Hw = iJ02;
            return;
        }
        if (i2 != 2) {
            throw k4.Zo();
        }
        int iVy2 = this.j6.vy() + this.j6.a8();
        do {
            z4Var.VH(this.j6.gW());
        } while (this.j6.vy() < iVy2);
        dx(iVy2);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final void EQ(List<String> list) throws l4 {
        ro(list, false);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final void FH(List<Integer> list) throws k4 {
        int iJ0;
        int iJ02;
        if (!(list instanceof f4)) {
            int i = this.DW & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.j6.yS()));
                    if (this.j6.BT()) {
                        return;
                    } else {
                        iJ0 = this.j6.J0();
                    }
                } while (iJ0 == this.DW);
                this.Hw = iJ0;
                return;
            }
            if (i != 2) {
                throw k4.Zo();
            }
            int iVy = this.j6.vy() + this.j6.a8();
            do {
                list.add(Integer.valueOf(this.j6.yS()));
            } while (this.j6.vy() < iVy);
            dx(iVy);
            return;
        }
        f4 f4Var = (f4) list;
        int i2 = this.DW & 7;
        if (i2 == 0) {
            do {
                f4Var.VH(this.j6.yS());
                if (this.j6.BT()) {
                    return;
                } else {
                    iJ02 = this.j6.J0();
                }
            } while (iJ02 == this.DW);
            this.Hw = iJ02;
            return;
        }
        if (i2 != 2) {
            throw k4.Zo();
        }
        int iVy2 = this.j6.vy() + this.j6.a8();
        do {
            f4Var.VH(this.j6.yS());
        } while (this.j6.vy() < iVy2);
        dx(iVy2);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final void Hw(List<u2> list) throws l4 {
        int iJ0;
        if ((this.DW & 7) != 2) {
            throw k4.Zo();
        }
        do {
            list.add(jJ());
            if (this.j6.BT()) {
                return;
            } else {
                iJ0 = this.j6.J0();
            }
        } while (iJ0 == this.DW);
        this.Hw = iJ0;
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final void J0(List<Integer> list) throws k4 {
        int iJ0;
        int iJ02;
        if (!(list instanceof f4)) {
            int i = this.DW & 7;
            if (i == 2) {
                int iA8 = this.j6.a8();
                cb(iA8);
                int iVy = this.j6.vy() + iA8;
                do {
                    list.add(Integer.valueOf(this.j6.rN()));
                } while (this.j6.vy() < iVy);
                return;
            }
            if (i != 5) {
                throw k4.Zo();
            }
            do {
                list.add(Integer.valueOf(this.j6.rN()));
                if (this.j6.BT()) {
                    return;
                } else {
                    iJ0 = this.j6.J0();
                }
            } while (iJ0 == this.DW);
            this.Hw = iJ0;
            return;
        }
        f4 f4Var = (f4) list;
        int i2 = this.DW & 7;
        if (i2 == 2) {
            int iA82 = this.j6.a8();
            cb(iA82);
            int iVy2 = this.j6.vy() + iA82;
            do {
                f4Var.VH(this.j6.rN());
            } while (this.j6.vy() < iVy2);
            return;
        }
        if (i2 != 5) {
            throw k4.Zo();
        }
        do {
            f4Var.VH(this.j6.rN());
            if (this.j6.BT()) {
                return;
            } else {
                iJ02 = this.j6.J0();
            }
        } while (iJ02 == this.DW);
        this.Hw = iJ02;
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final int J8() throws l4 {
        cn(0);
        return this.j6.a8();
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final <T> T Mr(c6<T> c6Var, r3 r3Var) throws l4 {
        cn(2);
        return (T) sG(c6Var, r3Var);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final void P8(List<Long> list) throws k4 {
        int iJ0;
        int iJ02;
        if (!(list instanceof z4)) {
            int i = this.DW & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(this.j6.XL()));
                    if (this.j6.BT()) {
                        return;
                    } else {
                        iJ0 = this.j6.J0();
                    }
                } while (iJ0 == this.DW);
                this.Hw = iJ0;
                return;
            }
            if (i != 2) {
                throw k4.Zo();
            }
            int iA8 = this.j6.a8();
            sh(iA8);
            int iVy = this.j6.vy() + iA8;
            do {
                list.add(Long.valueOf(this.j6.XL()));
            } while (this.j6.vy() < iVy);
            return;
        }
        z4 z4Var = (z4) list;
        int i2 = this.DW & 7;
        if (i2 == 1) {
            do {
                z4Var.VH(this.j6.XL());
                if (this.j6.BT()) {
                    return;
                } else {
                    iJ02 = this.j6.J0();
                }
            } while (iJ02 == this.DW);
            this.Hw = iJ02;
            return;
        }
        if (i2 != 2) {
            throw k4.Zo();
        }
        int iA82 = this.j6.a8();
        sh(iA82);
        int iVy2 = this.j6.vy() + iA82;
        do {
            z4Var.VH(this.j6.XL());
        } while (this.j6.vy() < iVy2);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final long PT() throws l4 {
        cn(0);
        return this.j6.Ws();
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final boolean QO() {
        int i;
        if (this.j6.BT() || (i = this.DW) == this.FH) {
            return false;
        }
        return this.j6.VH(i);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final long QX() throws l4 {
        cn(0);
        return this.j6.J8();
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final void U2(List<Float> list) throws k4 {
        int iJ0;
        int iJ02;
        if (!(list instanceof b4)) {
            int i = this.DW & 7;
            if (i == 2) {
                int iA8 = this.j6.a8();
                cb(iA8);
                int iVy = this.j6.vy() + iA8;
                do {
                    list.add(Float.valueOf(this.j6.DW()));
                } while (this.j6.vy() < iVy);
                return;
            }
            if (i != 5) {
                throw k4.Zo();
            }
            do {
                list.add(Float.valueOf(this.j6.DW()));
                if (this.j6.BT()) {
                    return;
                } else {
                    iJ0 = this.j6.J0();
                }
            } while (iJ0 == this.DW);
            this.Hw = iJ0;
            return;
        }
        b4 b4Var = (b4) list;
        int i2 = this.DW & 7;
        if (i2 == 2) {
            int iA82 = this.j6.a8();
            cb(iA82);
            int iVy2 = this.j6.vy() + iA82;
            do {
                b4Var.v5(this.j6.DW());
            } while (this.j6.vy() < iVy2);
            return;
        }
        if (i2 != 5) {
            throw k4.Zo();
        }
        do {
            b4Var.v5(this.j6.DW());
            if (this.j6.BT()) {
                return;
            } else {
                iJ02 = this.j6.J0();
            }
        } while (iJ02 == this.DW);
        this.Hw = iJ02;
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final void VH(List<Integer> list) throws k4 {
        int iJ0;
        int iJ02;
        if (!(list instanceof f4)) {
            int i = this.DW & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.j6.lg()));
                    if (this.j6.BT()) {
                        return;
                    } else {
                        iJ0 = this.j6.J0();
                    }
                } while (iJ0 == this.DW);
                this.Hw = iJ0;
                return;
            }
            if (i != 2) {
                throw k4.Zo();
            }
            int iVy = this.j6.vy() + this.j6.a8();
            do {
                list.add(Integer.valueOf(this.j6.lg()));
            } while (this.j6.vy() < iVy);
            dx(iVy);
            return;
        }
        f4 f4Var = (f4) list;
        int i2 = this.DW & 7;
        if (i2 == 0) {
            do {
                f4Var.VH(this.j6.lg());
                if (this.j6.BT()) {
                    return;
                } else {
                    iJ02 = this.j6.J0();
                }
            } while (iJ02 == this.DW);
            this.Hw = iJ02;
            return;
        }
        if (i2 != 2) {
            throw k4.Zo();
        }
        int iVy2 = this.j6.vy() + this.j6.a8();
        do {
            f4Var.VH(this.j6.lg());
        } while (this.j6.vy() < iVy2);
        dx(iVy2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.b6
    public final <T> void Ws(List<T> list, c6<T> c6Var, r3 r3Var) throws l4 {
        int iJ0;
        int i = this.DW;
        if ((i & 7) != 3) {
            throw k4.Zo();
        }
        do {
            list.add(ef(c6Var, r3Var));
            if (this.j6.BT() || this.Hw != 0) {
                return;
            } else {
                iJ0 = this.j6.J0();
            }
        } while (iJ0 == i);
        this.Hw = iJ0;
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final <T> T XL(c6<T> c6Var, r3 r3Var) throws l4 {
        cn(3);
        return (T) ef(c6Var, r3Var);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final int Zo() {
        return this.DW;
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final String a8() throws l4 {
        cn(2);
        return this.j6.Mr();
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final void aM(List<Integer> list) throws k4 {
        int iJ0;
        int iJ02;
        if (!(list instanceof f4)) {
            int i = this.DW & 7;
            if (i == 2) {
                int iA8 = this.j6.a8();
                cb(iA8);
                int iVy = this.j6.vy() + iA8;
                do {
                    list.add(Integer.valueOf(this.j6.aM()));
                } while (this.j6.vy() < iVy);
                return;
            }
            if (i != 5) {
                throw k4.Zo();
            }
            do {
                list.add(Integer.valueOf(this.j6.aM()));
                if (this.j6.BT()) {
                    return;
                } else {
                    iJ0 = this.j6.J0();
                }
            } while (iJ0 == this.DW);
            this.Hw = iJ0;
            return;
        }
        f4 f4Var = (f4) list;
        int i2 = this.DW & 7;
        if (i2 == 2) {
            int iA82 = this.j6.a8();
            cb(iA82);
            int iVy2 = this.j6.vy() + iA82;
            do {
                f4Var.VH(this.j6.aM());
            } while (this.j6.vy() < iVy2);
            return;
        }
        if (i2 != 5) {
            throw k4.Zo();
        }
        do {
            f4Var.VH(this.j6.aM());
            if (this.j6.BT()) {
                return;
            } else {
                iJ02 = this.j6.J0();
            }
        } while (iJ02 == this.DW);
        this.Hw = iJ02;
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final long e3() throws l4 {
        cn(1);
        return this.j6.er();
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final int ei() throws l4 {
        cn(0);
        return this.j6.QX();
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final void er(List<Double> list) throws k4 {
        int iJ0;
        int iJ02;
        if (!(list instanceof n3)) {
            int i = this.DW & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(this.j6.j6()));
                    if (this.j6.BT()) {
                        return;
                    } else {
                        iJ0 = this.j6.J0();
                    }
                } while (iJ0 == this.DW);
                this.Hw = iJ0;
                return;
            }
            if (i != 2) {
                throw k4.Zo();
            }
            int iA8 = this.j6.a8();
            sh(iA8);
            int iVy = this.j6.vy() + iA8;
            do {
                list.add(Double.valueOf(this.j6.j6()));
            } while (this.j6.vy() < iVy);
            return;
        }
        n3 n3Var = (n3) list;
        int i2 = this.DW & 7;
        if (i2 == 1) {
            do {
                n3Var.VH(this.j6.j6());
                if (this.j6.BT()) {
                    return;
                } else {
                    iJ02 = this.j6.J0();
                }
            } while (iJ02 == this.DW);
            this.Hw = iJ02;
            return;
        }
        if (i2 != 2) {
            throw k4.Zo();
        }
        int iA82 = this.j6.a8();
        sh(iA82);
        int iVy2 = this.j6.vy() + iA82;
        do {
            n3Var.VH(this.j6.j6());
        } while (this.j6.vy() < iVy2);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final int gW() throws l4 {
        cn(5);
        return this.j6.aM();
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final int gn() {
        int i = this.Hw;
        if (i != 0) {
            this.DW = i;
            this.Hw = 0;
        } else {
            this.DW = this.j6.J0();
        }
        int i2 = this.DW;
        if (i2 == 0 || i2 == this.FH) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final long iW() throws l4 {
        cn(0);
        return this.j6.gW();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.b6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <K, V> void j3(java.util.Map<K, V> r8, com.google.android.gms.internal.measurement.e5<K, V> r9, com.google.android.gms.internal.measurement.r3 r10) throws com.google.android.gms.internal.measurement.l4 {
        /*
            r7 = this;
            r0 = 2
            r7.cn(r0)
            com.google.android.gms.internal.measurement.f3 r1 = r7.j6
            int r1 = r1.a8()
            com.google.android.gms.internal.measurement.f3 r2 = r7.j6
            int r1 = r2.u7(r1)
            K r2 = r9.DW
            V r3 = r9.Hw
        L14:
            int r4 = r7.gn()     // Catch: java.lang.Throwable -> L64
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5b
            com.google.android.gms.internal.measurement.f3 r5 = r7.j6     // Catch: java.lang.Throwable -> L64
            boolean r5 = r5.BT()     // Catch: java.lang.Throwable -> L64
            if (r5 != 0) goto L5b
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L46
            if (r4 == r0) goto L39
            boolean r4 = r7.QO()     // Catch: com.google.android.gms.internal.measurement.l4 -> L4e java.lang.Throwable -> L64
            if (r4 == 0) goto L33
            goto L14
        L33:
            com.google.android.gms.internal.measurement.k4 r4 = new com.google.android.gms.internal.measurement.k4     // Catch: com.google.android.gms.internal.measurement.l4 -> L4e java.lang.Throwable -> L64
            r4.<init>(r6)     // Catch: com.google.android.gms.internal.measurement.l4 -> L4e java.lang.Throwable -> L64
            throw r4     // Catch: com.google.android.gms.internal.measurement.l4 -> L4e java.lang.Throwable -> L64
        L39:
            com.google.android.gms.internal.measurement.j7 r4 = r9.FH     // Catch: com.google.android.gms.internal.measurement.l4 -> L4e java.lang.Throwable -> L64
            V r5 = r9.Hw     // Catch: com.google.android.gms.internal.measurement.l4 -> L4e java.lang.Throwable -> L64
            java.lang.Class r5 = r5.getClass()     // Catch: com.google.android.gms.internal.measurement.l4 -> L4e java.lang.Throwable -> L64
            java.lang.Object r3 = r7.KD(r4, r5, r10)     // Catch: com.google.android.gms.internal.measurement.l4 -> L4e java.lang.Throwable -> L64
            goto L14
        L46:
            com.google.android.gms.internal.measurement.j7 r4 = r9.j6     // Catch: com.google.android.gms.internal.measurement.l4 -> L4e java.lang.Throwable -> L64
            r5 = 0
            java.lang.Object r2 = r7.KD(r4, r5, r5)     // Catch: com.google.android.gms.internal.measurement.l4 -> L4e java.lang.Throwable -> L64
            goto L14
        L4e:
            boolean r4 = r7.QO()     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L55
            goto L14
        L55:
            com.google.android.gms.internal.measurement.k4 r8 = new com.google.android.gms.internal.measurement.k4     // Catch: java.lang.Throwable -> L64
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L64
            throw r8     // Catch: java.lang.Throwable -> L64
        L5b:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L64
            com.google.android.gms.internal.measurement.f3 r8 = r7.j6
            r8.tp(r1)
            return
        L64:
            r8 = move-exception
            com.google.android.gms.internal.measurement.f3 r9 = r7.j6
            r9.tp(r1)
            goto L6c
        L6b:
            throw r8
        L6c:
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.i3.j3(java.util.Map, com.google.android.gms.internal.measurement.e5, com.google.android.gms.internal.measurement.r3):void");
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final void j6(List<Boolean> list) throws k4 {
        int iJ0;
        int iJ02;
        if (!(list instanceof s2)) {
            int i = this.DW & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(this.j6.j3()));
                    if (this.j6.BT()) {
                        return;
                    } else {
                        iJ0 = this.j6.J0();
                    }
                } while (iJ0 == this.DW);
                this.Hw = iJ0;
                return;
            }
            if (i != 2) {
                throw k4.Zo();
            }
            int iVy = this.j6.vy() + this.j6.a8();
            do {
                list.add(Boolean.valueOf(this.j6.j3()));
            } while (this.j6.vy() < iVy);
            dx(iVy);
            return;
        }
        s2 s2Var = (s2) list;
        int i2 = this.DW & 7;
        if (i2 == 0) {
            do {
                s2Var.DW(this.j6.j3());
                if (this.j6.BT()) {
                    return;
                } else {
                    iJ02 = this.j6.J0();
                }
            } while (iJ02 == this.DW);
            this.Hw = iJ02;
            return;
        }
        if (i2 != 2) {
            throw k4.Zo();
        }
        int iVy2 = this.j6.vy() + this.j6.a8();
        do {
            s2Var.DW(this.j6.j3());
        } while (this.j6.vy() < iVy2);
        dx(iVy2);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final u2 jJ() throws l4 {
        cn(2);
        return this.j6.U2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.b6
    public final <T> void lg(List<T> list, c6<T> c6Var, r3 r3Var) throws l4 {
        int iJ0;
        int i = this.DW;
        if ((i & 7) != 2) {
            throw k4.Zo();
        }
        do {
            list.add(sG(c6Var, r3Var));
            if (this.j6.BT() || this.Hw != 0) {
                return;
            } else {
                iJ0 = this.j6.J0();
            }
        } while (iJ0 == i);
        this.Hw = iJ0;
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final void nw(List<Integer> list) throws k4 {
        int iJ0;
        int iJ02;
        if (!(list instanceof f4)) {
            int i = this.DW & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.j6.QX()));
                    if (this.j6.BT()) {
                        return;
                    } else {
                        iJ0 = this.j6.J0();
                    }
                } while (iJ0 == this.DW);
                this.Hw = iJ0;
                return;
            }
            if (i != 2) {
                throw k4.Zo();
            }
            int iVy = this.j6.vy() + this.j6.a8();
            do {
                list.add(Integer.valueOf(this.j6.QX()));
            } while (this.j6.vy() < iVy);
            dx(iVy);
            return;
        }
        f4 f4Var = (f4) list;
        int i2 = this.DW & 7;
        if (i2 == 0) {
            do {
                f4Var.VH(this.j6.QX());
                if (this.j6.BT()) {
                    return;
                } else {
                    iJ02 = this.j6.J0();
                }
            } while (iJ02 == this.DW);
            this.Hw = iJ02;
            return;
        }
        if (i2 != 2) {
            throw k4.Zo();
        }
        int iVy2 = this.j6.vy() + this.j6.a8();
        do {
            f4Var.VH(this.j6.QX());
        } while (this.j6.vy() < iVy2);
        dx(iVy2);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final boolean rN() throws l4 {
        cn(0);
        return this.j6.j3();
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final double readDouble() throws l4 {
        cn(1);
        return this.j6.j6();
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final float readFloat() throws l4 {
        cn(5);
        return this.j6.DW();
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final int sM() throws l4 {
        cn(5);
        return this.j6.rN();
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final void tp(List<Integer> list) throws k4 {
        int iJ0;
        int iJ02;
        if (!(list instanceof f4)) {
            int i = this.DW & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.j6.a8()));
                    if (this.j6.BT()) {
                        return;
                    } else {
                        iJ0 = this.j6.J0();
                    }
                } while (iJ0 == this.DW);
                this.Hw = iJ0;
                return;
            }
            if (i != 2) {
                throw k4.Zo();
            }
            int iVy = this.j6.vy() + this.j6.a8();
            do {
                list.add(Integer.valueOf(this.j6.a8()));
            } while (this.j6.vy() < iVy);
            dx(iVy);
            return;
        }
        f4 f4Var = (f4) list;
        int i2 = this.DW & 7;
        if (i2 == 0) {
            do {
                f4Var.VH(this.j6.a8());
                if (this.j6.BT()) {
                    return;
                } else {
                    iJ02 = this.j6.J0();
                }
            } while (iJ02 == this.DW);
            this.Hw = iJ02;
            return;
        }
        if (i2 != 2) {
            throw k4.Zo();
        }
        int iVy2 = this.j6.vy() + this.j6.a8();
        do {
            f4Var.VH(this.j6.a8());
        } while (this.j6.vy() < iVy2);
        dx(iVy2);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final String u7() throws l4 {
        cn(2);
        return this.j6.FH();
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final void v5(List<String> list) throws l4 {
        ro(list, true);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final long vy() throws l4 {
        cn(1);
        return this.j6.XL();
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final void we(List<Long> list) throws k4 {
        int iJ0;
        int iJ02;
        if (!(list instanceof z4)) {
            int i = this.DW & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(this.j6.er()));
                    if (this.j6.BT()) {
                        return;
                    } else {
                        iJ0 = this.j6.J0();
                    }
                } while (iJ0 == this.DW);
                this.Hw = iJ0;
                return;
            }
            if (i != 2) {
                throw k4.Zo();
            }
            int iA8 = this.j6.a8();
            sh(iA8);
            int iVy = this.j6.vy() + iA8;
            do {
                list.add(Long.valueOf(this.j6.er()));
            } while (this.j6.vy() < iVy);
            return;
        }
        z4 z4Var = (z4) list;
        int i2 = this.DW & 7;
        if (i2 == 1) {
            do {
                z4Var.VH(this.j6.er());
                if (this.j6.BT()) {
                    return;
                } else {
                    iJ02 = this.j6.J0();
                }
            } while (iJ02 == this.DW);
            this.Hw = iJ02;
            return;
        }
        if (i2 != 2) {
            throw k4.Zo();
        }
        int iA82 = this.j6.a8();
        sh(iA82);
        int iVy2 = this.j6.vy() + iA82;
        do {
            z4Var.VH(this.j6.er());
        } while (this.j6.vy() < iVy2);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final void yS(List<Long> list) throws k4 {
        int iJ0;
        int iJ02;
        if (!(list instanceof z4)) {
            int i = this.DW & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.j6.Ws()));
                    if (this.j6.BT()) {
                        return;
                    } else {
                        iJ0 = this.j6.J0();
                    }
                } while (iJ0 == this.DW);
                this.Hw = iJ0;
                return;
            }
            if (i != 2) {
                throw k4.Zo();
            }
            int iVy = this.j6.vy() + this.j6.a8();
            do {
                list.add(Long.valueOf(this.j6.Ws()));
            } while (this.j6.vy() < iVy);
            dx(iVy);
            return;
        }
        z4 z4Var = (z4) list;
        int i2 = this.DW & 7;
        if (i2 == 0) {
            do {
                z4Var.VH(this.j6.Ws());
                if (this.j6.BT()) {
                    return;
                } else {
                    iJ02 = this.j6.J0();
                }
            } while (iJ02 == this.DW);
            this.Hw = iJ02;
            return;
        }
        if (i2 != 2) {
            throw k4.Zo();
        }
        int iVy2 = this.j6.vy() + this.j6.a8();
        do {
            z4Var.VH(this.j6.Ws());
        } while (this.j6.vy() < iVy2);
        dx(iVy2);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final int zzuw() throws l4 {
        cn(0);
        return this.j6.yS();
    }
}
