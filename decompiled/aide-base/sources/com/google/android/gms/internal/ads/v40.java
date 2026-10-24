package com.google.android.gms.internal.ads;

import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;
import java.util.List;

/* loaded from: classes.dex */
public final class v40 implements q70 {
    private int DW;
    private int FH;
    private int Hw = 0;
    private final s40 j6;

    private v40(s40 s40Var) {
        t50.Hw(s40Var, "input");
        s40 s40Var2 = s40Var;
        this.j6 = s40Var2;
        s40Var2.FH = this;
    }

    private final void I(int i) throws z50 {
        if ((this.DW & 7) != i) {
            throw y50.Zo();
        }
    }

    private final <T> T Mz(r70<T> r70Var, d50 d50Var) {
        int i = this.FH;
        this.FH = ((this.DW >>> 3) << 3) | 4;
        try {
            T tV5 = r70Var.v5();
            r70Var.tp(tV5, this, d50Var);
            r70Var.u7(tV5);
            if (this.DW == this.FH) {
                return tV5;
            }
            throw y50.gn();
        } finally {
            this.FH = i;
        }
    }

    private final void Qq(int i) throws y50 {
        if (this.j6.U2() != i) {
            throw y50.j6();
        }
    }

    private final Object Sf(z80 z80Var, Class<?> cls, d50 d50Var) throws z50 {
        switch (w40.j6[z80Var.ordinal()]) {
            case 1:
                return Boolean.valueOf(Mr());
            case 2:
                return vy();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(ro());
            case 5:
                return Integer.valueOf(yS());
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                return Long.valueOf(lg());
            case UserTouchAction.CLICK_KIND /* 7 */:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(aM());
            case 9:
                return Long.valueOf(U2());
            case 10:
                I(2);
                return g3(m70.DW().FH(cls), d50Var);
            case 11:
                return Integer.valueOf(cb());
            case 12:
                return Long.valueOf(ef());
            case 13:
                return Integer.valueOf(XL());
            case 14:
                return Long.valueOf(J8());
            case 15:
                return er();
            case 16:
                return Integer.valueOf(ei());
            case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                return Long.valueOf(QX());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static void ca(int i) throws y50 {
        if ((i & 7) != 0) {
            throw y50.gn();
        }
    }

    private final <T> T g3(r70<T> r70Var, d50 d50Var) throws y50 {
        int iJ8 = this.j6.J8();
        s40 s40Var = this.j6;
        if (s40Var.j6 >= s40Var.DW) {
            throw y50.VH();
        }
        int iGW = s40Var.gW(iJ8);
        T tV5 = r70Var.v5();
        this.j6.j6++;
        r70Var.tp(tV5, this, d50Var);
        r70Var.u7(tV5);
        this.j6.rN(0);
        r5.j6--;
        this.j6.BT(iGW);
        return tV5;
    }

    public static v40 gn(s40 s40Var) {
        v40 v40Var = s40Var.FH;
        return v40Var != null ? v40Var : new v40(s40Var);
    }

    private final void vJ(List<String> list, boolean z) throws z50 {
        int iV5;
        int iV52;
        if ((this.DW & 7) != 2) {
            throw y50.Zo();
        }
        if (!(list instanceof h60) || z) {
            do {
                list.add(z ? er() : u7());
                if (this.j6.Mr()) {
                    return;
                } else {
                    iV5 = this.j6.v5();
                }
            } while (iV5 == this.DW);
            this.Hw = iV5;
            return;
        }
        h60 h60Var = (h60) list;
        do {
            h60Var.cn(vy());
            if (this.j6.Mr()) {
                return;
            } else {
                iV52 = this.j6.v5();
            }
        } while (iV52 == this.DW);
        this.Hw = iV52;
    }

    private static void x9(int i) throws y50 {
        if ((i & 3) != 0) {
            throw y50.gn();
        }
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final boolean BT() {
        int i;
        if (this.j6.Mr() || (i = this.DW) == this.FH) {
            return false;
        }
        return this.j6.er(i);
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void DW(List<String> list) throws z50 {
        vJ(list, true);
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void EQ(List<String> list) throws z50 {
        vJ(list, false);
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void FH(List<Boolean> list) throws y50 {
        int iV5;
        int iV52;
        if (!(list instanceof g40)) {
            int i = this.DW & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(this.j6.EQ()));
                    if (this.j6.Mr()) {
                        return;
                    } else {
                        iV5 = this.j6.v5();
                    }
                } while (iV5 == this.DW);
                this.Hw = iV5;
                return;
            }
            if (i != 2) {
                throw y50.Zo();
            }
            int iU2 = this.j6.U2() + this.j6.J8();
            do {
                list.add(Boolean.valueOf(this.j6.EQ()));
            } while (this.j6.U2() < iU2);
            Qq(iU2);
            return;
        }
        g40 g40Var = (g40) list;
        int i2 = this.DW & 7;
        if (i2 == 0) {
            do {
                g40Var.DW(this.j6.EQ());
                if (this.j6.Mr()) {
                    return;
                } else {
                    iV52 = this.j6.v5();
                }
            } while (iV52 == this.DW);
            this.Hw = iV52;
            return;
        }
        if (i2 != 2) {
            throw y50.Zo();
        }
        int iU22 = this.j6.U2() + this.j6.J8();
        do {
            g40Var.DW(this.j6.EQ());
        } while (this.j6.U2() < iU22);
        Qq(iU22);
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void Hw(List<Long> list) throws y50 {
        int iV5;
        int iV52;
        if (!(list instanceof m60)) {
            int i = this.DW & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.j6.Zo()));
                    if (this.j6.Mr()) {
                        return;
                    } else {
                        iV5 = this.j6.v5();
                    }
                } while (iV5 == this.DW);
                this.Hw = iV5;
                return;
            }
            if (i != 2) {
                throw y50.Zo();
            }
            int iU2 = this.j6.U2() + this.j6.J8();
            do {
                list.add(Long.valueOf(this.j6.Zo()));
            } while (this.j6.U2() < iU2);
            Qq(iU2);
            return;
        }
        m60 m60Var = (m60) list;
        int i2 = this.DW & 7;
        if (i2 == 0) {
            do {
                m60Var.Hw(this.j6.Zo());
                if (this.j6.Mr()) {
                    return;
                } else {
                    iV52 = this.j6.v5();
                }
            } while (iV52 == this.DW);
            this.Hw = iV52;
            return;
        }
        if (i2 != 2) {
            throw y50.Zo();
        }
        int iU22 = this.j6.U2() + this.j6.J8();
        do {
            m60Var.Hw(this.j6.Zo());
        } while (this.j6.U2() < iU22);
        Qq(iU22);
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void J0(List<Long> list) throws y50 {
        int iV5;
        int iV52;
        if (!(list instanceof m60)) {
            int i = this.DW & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(this.j6.u7()));
                    if (this.j6.Mr()) {
                        return;
                    } else {
                        iV5 = this.j6.v5();
                    }
                } while (iV5 == this.DW);
                this.Hw = iV5;
                return;
            }
            if (i != 2) {
                throw y50.Zo();
            }
            int iJ8 = this.j6.J8();
            ca(iJ8);
            int iU2 = this.j6.U2() + iJ8;
            do {
                list.add(Long.valueOf(this.j6.u7()));
            } while (this.j6.U2() < iU2);
            return;
        }
        m60 m60Var = (m60) list;
        int i2 = this.DW & 7;
        if (i2 == 1) {
            do {
                m60Var.Hw(this.j6.u7());
                if (this.j6.Mr()) {
                    return;
                } else {
                    iV52 = this.j6.v5();
                }
            } while (iV52 == this.DW);
            this.Hw = iV52;
            return;
        }
        if (i2 != 2) {
            throw y50.Zo();
        }
        int iJ82 = this.j6.J8();
        ca(iJ82);
        int iU22 = this.j6.U2() + iJ82;
        do {
            m60Var.Hw(this.j6.u7());
        } while (this.j6.U2() < iU22);
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final long J8() throws z50 {
        I(0);
        return this.j6.j3();
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void KD(List<Long> list) throws y50 {
        int iV5;
        int iV52;
        if (!(list instanceof m60)) {
            int i = this.DW & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.j6.j3()));
                    if (this.j6.Mr()) {
                        return;
                    } else {
                        iV5 = this.j6.v5();
                    }
                } while (iV5 == this.DW);
                this.Hw = iV5;
                return;
            }
            if (i != 2) {
                throw y50.Zo();
            }
            int iU2 = this.j6.U2() + this.j6.J8();
            do {
                list.add(Long.valueOf(this.j6.j3()));
            } while (this.j6.U2() < iU2);
            Qq(iU2);
            return;
        }
        m60 m60Var = (m60) list;
        int i2 = this.DW & 7;
        if (i2 == 0) {
            do {
                m60Var.Hw(this.j6.j3());
                if (this.j6.Mr()) {
                    return;
                } else {
                    iV52 = this.j6.v5();
                }
            } while (iV52 == this.DW);
            this.Hw = iV52;
            return;
        }
        if (i2 != 2) {
            throw y50.Zo();
        }
        int iU22 = this.j6.U2() + this.j6.J8();
        do {
            m60Var.Hw(this.j6.j3());
        } while (this.j6.U2() < iU22);
        Qq(iU22);
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final boolean Mr() throws z50 {
        I(0);
        return this.j6.EQ();
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final <T> T P8(r70<T> r70Var, d50 d50Var) throws z50 {
        I(2);
        return (T) g3(r70Var, d50Var);
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final long QX() throws z50 {
        I(0);
        return this.j6.Zo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.q70
    public final <T> void SI(List<T> list, r70<T> r70Var, d50 d50Var) throws z50 {
        int iV5;
        int i = this.DW;
        if ((i & 7) != 2) {
            throw y50.Zo();
        }
        do {
            list.add(g3(r70Var, d50Var));
            if (this.j6.Mr() || this.Hw != 0) {
                return;
            } else {
                iV5 = this.j6.v5();
            }
        } while (iV5 == i);
        this.Hw = iV5;
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final long U2() throws z50 {
        I(0);
        return this.j6.VH();
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void VH(List<Integer> list) throws y50 {
        int iV5;
        int iV52;
        if (!(list instanceof s50)) {
            int i = this.DW & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.j6.gn()));
                    if (this.j6.Mr()) {
                        return;
                    } else {
                        iV5 = this.j6.v5();
                    }
                } while (iV5 == this.DW);
                this.Hw = iV5;
                return;
            }
            if (i != 2) {
                throw y50.Zo();
            }
            int iU2 = this.j6.U2() + this.j6.J8();
            do {
                list.add(Integer.valueOf(this.j6.gn()));
            } while (this.j6.U2() < iU2);
            Qq(iU2);
            return;
        }
        s50 s50Var = (s50) list;
        int i2 = this.DW & 7;
        if (i2 == 0) {
            do {
                s50Var.EQ(this.j6.gn());
                if (this.j6.Mr()) {
                    return;
                } else {
                    iV52 = this.j6.v5();
                }
            } while (iV52 == this.DW);
            this.Hw = iV52;
            return;
        }
        if (i2 != 2) {
            throw y50.Zo();
        }
        int iU22 = this.j6.U2() + this.j6.J8();
        do {
            s50Var.EQ(this.j6.gn());
        } while (this.j6.U2() < iU22);
        Qq(iU22);
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void Ws(List<i40> list) throws z50 {
        int iV5;
        if ((this.DW & 7) != 2) {
            throw y50.Zo();
        }
        do {
            list.add(vy());
            if (this.j6.Mr()) {
                return;
            } else {
                iV5 = this.j6.v5();
            }
        } while (iV5 == this.DW);
        this.Hw = iV5;
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final int XL() throws z50 {
        I(0);
        return this.j6.aM();
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final int Zo() {
        return this.DW;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.q70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <K, V> void a8(java.util.Map<K, V> r8, com.google.android.gms.internal.ads.s60<K, V> r9, com.google.android.gms.internal.ads.d50 r10) throws com.google.android.gms.internal.ads.z50 {
        /*
            r7 = this;
            r0 = 2
            r7.I(r0)
            com.google.android.gms.internal.ads.s40 r1 = r7.j6
            int r1 = r1.J8()
            com.google.android.gms.internal.ads.s40 r2 = r7.j6
            int r1 = r2.gW(r1)
            K r2 = r9.DW
            V r3 = r9.Hw
        L14:
            int r4 = r7.rN()     // Catch: java.lang.Throwable -> L64
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5b
            com.google.android.gms.internal.ads.s40 r5 = r7.j6     // Catch: java.lang.Throwable -> L64
            boolean r5 = r5.Mr()     // Catch: java.lang.Throwable -> L64
            if (r5 != 0) goto L5b
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L46
            if (r4 == r0) goto L39
            boolean r4 = r7.BT()     // Catch: com.google.android.gms.internal.ads.z50 -> L4e java.lang.Throwable -> L64
            if (r4 == 0) goto L33
            goto L14
        L33:
            com.google.android.gms.internal.ads.y50 r4 = new com.google.android.gms.internal.ads.y50     // Catch: com.google.android.gms.internal.ads.z50 -> L4e java.lang.Throwable -> L64
            r4.<init>(r6)     // Catch: com.google.android.gms.internal.ads.z50 -> L4e java.lang.Throwable -> L64
            throw r4     // Catch: com.google.android.gms.internal.ads.z50 -> L4e java.lang.Throwable -> L64
        L39:
            com.google.android.gms.internal.ads.z80 r4 = r9.FH     // Catch: com.google.android.gms.internal.ads.z50 -> L4e java.lang.Throwable -> L64
            V r5 = r9.Hw     // Catch: com.google.android.gms.internal.ads.z50 -> L4e java.lang.Throwable -> L64
            java.lang.Class r5 = r5.getClass()     // Catch: com.google.android.gms.internal.ads.z50 -> L4e java.lang.Throwable -> L64
            java.lang.Object r3 = r7.Sf(r4, r5, r10)     // Catch: com.google.android.gms.internal.ads.z50 -> L4e java.lang.Throwable -> L64
            goto L14
        L46:
            com.google.android.gms.internal.ads.z80 r4 = r9.j6     // Catch: com.google.android.gms.internal.ads.z50 -> L4e java.lang.Throwable -> L64
            r5 = 0
            java.lang.Object r2 = r7.Sf(r4, r5, r5)     // Catch: com.google.android.gms.internal.ads.z50 -> L4e java.lang.Throwable -> L64
            goto L14
        L4e:
            boolean r4 = r7.BT()     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L55
            goto L14
        L55:
            com.google.android.gms.internal.ads.y50 r8 = new com.google.android.gms.internal.ads.y50     // Catch: java.lang.Throwable -> L64
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L64
            throw r8     // Catch: java.lang.Throwable -> L64
        L5b:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L64
            com.google.android.gms.internal.ads.s40 r8 = r7.j6
            r8.BT(r1)
            return
        L64:
            r8 = move-exception
            com.google.android.gms.internal.ads.s40 r9 = r7.j6
            r9.BT(r1)
            goto L6c
        L6b:
            throw r8
        L6c:
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v40.a8(java.util.Map, com.google.android.gms.internal.ads.s60, com.google.android.gms.internal.ads.d50):void");
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final int aM() throws z50 {
        I(0);
        return this.j6.gn();
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final int cb() throws z50 {
        I(5);
        return this.j6.QX();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.q70
    public final <T> void cn(List<T> list, r70<T> r70Var, d50 d50Var) throws z50 {
        int iV5;
        int i = this.DW;
        if ((i & 7) != 3) {
            throw y50.Zo();
        }
        do {
            list.add(Mz(r70Var, d50Var));
            if (this.j6.Mr() || this.Hw != 0) {
                return;
            } else {
                iV5 = this.j6.v5();
            }
        } while (iV5 == i);
        this.Hw = iV5;
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final <T> T dx(r70<T> r70Var, d50 d50Var) throws z50 {
        I(3);
        return (T) Mz(r70Var, d50Var);
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final long ef() throws z50 {
        I(1);
        return this.j6.XL();
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final int ei() throws z50 {
        I(0);
        return this.j6.J8();
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final String er() throws z50 {
        I(2);
        return this.j6.we();
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void gW(List<Integer> list) throws y50 {
        int iV5;
        int iV52;
        if (!(list instanceof s50)) {
            int i = this.DW & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.j6.J8()));
                    if (this.j6.Mr()) {
                        return;
                    } else {
                        iV5 = this.j6.v5();
                    }
                } while (iV5 == this.DW);
                this.Hw = iV5;
                return;
            }
            if (i != 2) {
                throw y50.Zo();
            }
            int iU2 = this.j6.U2() + this.j6.J8();
            do {
                list.add(Integer.valueOf(this.j6.J8()));
            } while (this.j6.U2() < iU2);
            Qq(iU2);
            return;
        }
        s50 s50Var = (s50) list;
        int i2 = this.DW & 7;
        if (i2 == 0) {
            do {
                s50Var.EQ(this.j6.J8());
                if (this.j6.Mr()) {
                    return;
                } else {
                    iV52 = this.j6.v5();
                }
            } while (iV52 == this.DW);
            this.Hw = iV52;
            return;
        }
        if (i2 != 2) {
            throw y50.Zo();
        }
        int iU22 = this.j6.U2() + this.j6.J8();
        do {
            s50Var.EQ(this.j6.J8());
        } while (this.j6.U2() < iU22);
        Qq(iU22);
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void j3(List<Integer> list) throws y50 {
        int iV5;
        int iV52;
        if (!(list instanceof s50)) {
            int i = this.DW & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.j6.Ws()));
                    if (this.j6.Mr()) {
                        return;
                    } else {
                        iV5 = this.j6.v5();
                    }
                } while (iV5 == this.DW);
                this.Hw = iV5;
                return;
            }
            if (i != 2) {
                throw y50.Zo();
            }
            int iU2 = this.j6.U2() + this.j6.J8();
            do {
                list.add(Integer.valueOf(this.j6.Ws()));
            } while (this.j6.U2() < iU2);
            Qq(iU2);
            return;
        }
        s50 s50Var = (s50) list;
        int i2 = this.DW & 7;
        if (i2 == 0) {
            do {
                s50Var.EQ(this.j6.Ws());
                if (this.j6.Mr()) {
                    return;
                } else {
                    iV52 = this.j6.v5();
                }
            } while (iV52 == this.DW);
            this.Hw = iV52;
            return;
        }
        if (i2 != 2) {
            throw y50.Zo();
        }
        int iU22 = this.j6.U2() + this.j6.J8();
        do {
            s50Var.EQ(this.j6.Ws());
        } while (this.j6.U2() < iU22);
        Qq(iU22);
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void j6(List<Double> list) throws y50 {
        int iV5;
        int iV52;
        if (!(list instanceof a50)) {
            int i = this.DW & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(this.j6.j6()));
                    if (this.j6.Mr()) {
                        return;
                    } else {
                        iV5 = this.j6.v5();
                    }
                } while (iV5 == this.DW);
                this.Hw = iV5;
                return;
            }
            if (i != 2) {
                throw y50.Zo();
            }
            int iJ8 = this.j6.J8();
            ca(iJ8);
            int iU2 = this.j6.U2() + iJ8;
            do {
                list.add(Double.valueOf(this.j6.j6()));
            } while (this.j6.U2() < iU2);
            return;
        }
        a50 a50Var = (a50) list;
        int i2 = this.DW & 7;
        if (i2 == 1) {
            do {
                a50Var.DW(this.j6.j6());
                if (this.j6.Mr()) {
                    return;
                } else {
                    iV52 = this.j6.v5();
                }
            } while (iV52 == this.DW);
            this.Hw = iV52;
            return;
        }
        if (i2 != 2) {
            throw y50.Zo();
        }
        int iJ82 = this.j6.J8();
        ca(iJ82);
        int iU22 = this.j6.U2() + iJ82;
        do {
            a50Var.DW(this.j6.j6());
        } while (this.j6.U2() < iU22);
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final long lg() throws z50 {
        I(1);
        return this.j6.u7();
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void nw(List<Integer> list) throws y50 {
        int iV5;
        int iV52;
        if (!(list instanceof s50)) {
            int i = this.DW & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.j6.aM()));
                    if (this.j6.Mr()) {
                        return;
                    } else {
                        iV5 = this.j6.v5();
                    }
                } while (iV5 == this.DW);
                this.Hw = iV5;
                return;
            }
            if (i != 2) {
                throw y50.Zo();
            }
            int iU2 = this.j6.U2() + this.j6.J8();
            do {
                list.add(Integer.valueOf(this.j6.aM()));
            } while (this.j6.U2() < iU2);
            Qq(iU2);
            return;
        }
        s50 s50Var = (s50) list;
        int i2 = this.DW & 7;
        if (i2 == 0) {
            do {
                s50Var.EQ(this.j6.aM());
                if (this.j6.Mr()) {
                    return;
                } else {
                    iV52 = this.j6.v5();
                }
            } while (iV52 == this.DW);
            this.Hw = iV52;
            return;
        }
        if (i2 != 2) {
            throw y50.Zo();
        }
        int iU22 = this.j6.U2() + this.j6.J8();
        do {
            s50Var.EQ(this.j6.aM());
        } while (this.j6.U2() < iU22);
        Qq(iU22);
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final int rN() {
        int i = this.Hw;
        if (i != 0) {
            this.DW = i;
            this.Hw = 0;
        } else {
            this.DW = this.j6.v5();
        }
        int i2 = this.DW;
        if (i2 == 0 || i2 == this.FH) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final double readDouble() throws z50 {
        I(1);
        return this.j6.j6();
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final float readFloat() throws z50 {
        I(5);
        return this.j6.DW();
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final int ro() throws z50 {
        I(0);
        return this.j6.Ws();
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void sG(List<Long> list) throws y50 {
        int iV5;
        int iV52;
        if (!(list instanceof m60)) {
            int i = this.DW & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(this.j6.XL()));
                    if (this.j6.Mr()) {
                        return;
                    } else {
                        iV5 = this.j6.v5();
                    }
                } while (iV5 == this.DW);
                this.Hw = iV5;
                return;
            }
            if (i != 2) {
                throw y50.Zo();
            }
            int iJ8 = this.j6.J8();
            ca(iJ8);
            int iU2 = this.j6.U2() + iJ8;
            do {
                list.add(Long.valueOf(this.j6.XL()));
            } while (this.j6.U2() < iU2);
            return;
        }
        m60 m60Var = (m60) list;
        int i2 = this.DW & 7;
        if (i2 == 1) {
            do {
                m60Var.Hw(this.j6.XL());
                if (this.j6.Mr()) {
                    return;
                } else {
                    iV52 = this.j6.v5();
                }
            } while (iV52 == this.DW);
            this.Hw = iV52;
            return;
        }
        if (i2 != 2) {
            throw y50.Zo();
        }
        int iJ82 = this.j6.J8();
        ca(iJ82);
        int iU22 = this.j6.U2() + iJ82;
        do {
            m60Var.Hw(this.j6.XL());
        } while (this.j6.U2() < iU22);
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void sh(List<Integer> list) throws y50 {
        int iV5;
        int iV52;
        if (!(list instanceof s50)) {
            int i = this.DW & 7;
            if (i == 2) {
                int iJ8 = this.j6.J8();
                x9(iJ8);
                int iU2 = this.j6.U2() + iJ8;
                do {
                    list.add(Integer.valueOf(this.j6.QX()));
                } while (this.j6.U2() < iU2);
                return;
            }
            if (i != 5) {
                throw y50.Zo();
            }
            do {
                list.add(Integer.valueOf(this.j6.QX()));
                if (this.j6.Mr()) {
                    return;
                } else {
                    iV5 = this.j6.v5();
                }
            } while (iV5 == this.DW);
            this.Hw = iV5;
            return;
        }
        s50 s50Var = (s50) list;
        int i2 = this.DW & 7;
        if (i2 == 2) {
            int iJ82 = this.j6.J8();
            x9(iJ82);
            int iU22 = this.j6.U2() + iJ82;
            do {
                s50Var.EQ(this.j6.QX());
            } while (this.j6.U2() < iU22);
            return;
        }
        if (i2 != 5) {
            throw y50.Zo();
        }
        do {
            s50Var.EQ(this.j6.QX());
            if (this.j6.Mr()) {
                return;
            } else {
                iV52 = this.j6.v5();
            }
        } while (iV52 == this.DW);
        this.Hw = iV52;
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void tp(List<Long> list) throws y50 {
        int iV5;
        int iV52;
        if (!(list instanceof m60)) {
            int i = this.DW & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.j6.VH()));
                    if (this.j6.Mr()) {
                        return;
                    } else {
                        iV5 = this.j6.v5();
                    }
                } while (iV5 == this.DW);
                this.Hw = iV5;
                return;
            }
            if (i != 2) {
                throw y50.Zo();
            }
            int iU2 = this.j6.U2() + this.j6.J8();
            do {
                list.add(Long.valueOf(this.j6.VH()));
            } while (this.j6.U2() < iU2);
            Qq(iU2);
            return;
        }
        m60 m60Var = (m60) list;
        int i2 = this.DW & 7;
        if (i2 == 0) {
            do {
                m60Var.Hw(this.j6.VH());
                if (this.j6.Mr()) {
                    return;
                } else {
                    iV52 = this.j6.v5();
                }
            } while (iV52 == this.DW);
            this.Hw = iV52;
            return;
        }
        if (i2 != 2) {
            throw y50.Zo();
        }
        int iU22 = this.j6.U2() + this.j6.J8();
        do {
            m60Var.Hw(this.j6.VH());
        } while (this.j6.U2() < iU22);
        Qq(iU22);
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final String u7() throws z50 {
        I(2);
        return this.j6.FH();
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void v5(List<Float> list) throws y50 {
        int iV5;
        int iV52;
        if (!(list instanceof o50)) {
            int i = this.DW & 7;
            if (i == 2) {
                int iJ8 = this.j6.J8();
                x9(iJ8);
                int iU2 = this.j6.U2() + iJ8;
                do {
                    list.add(Float.valueOf(this.j6.DW()));
                } while (this.j6.U2() < iU2);
                return;
            }
            if (i != 5) {
                throw y50.Zo();
            }
            do {
                list.add(Float.valueOf(this.j6.DW()));
                if (this.j6.Mr()) {
                    return;
                } else {
                    iV5 = this.j6.v5();
                }
            } while (iV5 == this.DW);
            this.Hw = iV5;
            return;
        }
        o50 o50Var = (o50) list;
        int i2 = this.DW & 7;
        if (i2 == 2) {
            int iJ82 = this.j6.J8();
            x9(iJ82);
            int iU22 = this.j6.U2() + iJ82;
            do {
                o50Var.VH(this.j6.DW());
            } while (this.j6.U2() < iU22);
            return;
        }
        if (i2 != 5) {
            throw y50.Zo();
        }
        do {
            o50Var.VH(this.j6.DW());
            if (this.j6.Mr()) {
                return;
            } else {
                iV52 = this.j6.v5();
            }
        } while (iV52 == this.DW);
        this.Hw = iV52;
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final i40 vy() throws z50 {
        I(2);
        return this.j6.J0();
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void we(List<Integer> list) throws y50 {
        int iV5;
        int iV52;
        if (!(list instanceof s50)) {
            int i = this.DW & 7;
            if (i == 2) {
                int iJ8 = this.j6.J8();
                x9(iJ8);
                int iU2 = this.j6.U2() + iJ8;
                do {
                    list.add(Integer.valueOf(this.j6.tp()));
                } while (this.j6.U2() < iU2);
                return;
            }
            if (i != 5) {
                throw y50.Zo();
            }
            do {
                list.add(Integer.valueOf(this.j6.tp()));
                if (this.j6.Mr()) {
                    return;
                } else {
                    iV5 = this.j6.v5();
                }
            } while (iV5 == this.DW);
            this.Hw = iV5;
            return;
        }
        s50 s50Var = (s50) list;
        int i2 = this.DW & 7;
        if (i2 == 2) {
            int iJ82 = this.j6.J8();
            x9(iJ82);
            int iU22 = this.j6.U2() + iJ82;
            do {
                s50Var.EQ(this.j6.tp());
            } while (this.j6.U2() < iU22);
            return;
        }
        if (i2 != 5) {
            throw y50.Zo();
        }
        do {
            s50Var.EQ(this.j6.tp());
            if (this.j6.Mr()) {
                return;
            } else {
                iV52 = this.j6.v5();
            }
        } while (iV52 == this.DW);
        this.Hw = iV52;
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final int yS() throws z50 {
        I(5);
        return this.j6.tp();
    }
}
