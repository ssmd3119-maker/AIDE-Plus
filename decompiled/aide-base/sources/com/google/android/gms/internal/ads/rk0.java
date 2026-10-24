package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class rk0 implements mh0 {
    private final int DW;
    private zzfs EQ;
    private long J0;
    private int J8;
    private sk0 VH;
    private tk0 Ws;
    private sk0 gn;
    private final vn0 j6;
    private boolean tp;
    private zzfs u7;
    private long we;
    private final pk0 FH = new pk0();
    private final qk0 Hw = new qk0();
    private final ap0 v5 = new ap0(32);
    private final AtomicInteger Zo = new AtomicInteger();

    public rk0(vn0 vn0Var) {
        this.j6 = vn0Var;
        this.DW = vn0Var.DW();
        int i = this.DW;
        this.J8 = i;
        sk0 sk0Var = new sk0(0L, i);
        this.VH = sk0Var;
        this.gn = sk0Var;
    }

    private final int J0(int i) {
        if (this.J8 == this.DW) {
            this.J8 = 0;
            sk0 sk0Var = this.gn;
            if (sk0Var.FH) {
                this.gn = sk0Var.v5;
            }
            sk0 sk0Var2 = this.gn;
            un0 un0VarJ6 = this.j6.j6();
            sk0 sk0Var3 = new sk0(this.gn.DW, this.DW);
            sk0Var2.Hw = un0VarJ6;
            sk0Var2.v5 = sk0Var3;
            sk0Var2.FH = true;
        }
        return Math.min(i, this.DW - this.J8);
    }

    private final void QX() {
        this.FH.VH();
        gn(this.VH);
        sk0 sk0Var = new sk0(0L, this.DW);
        this.VH = sk0Var;
        this.gn = sk0Var;
        this.J0 = 0L;
        this.J8 = this.DW;
        this.j6.FH();
    }

    private final void VH(long j, byte[] bArr, int i) {
        tp(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.VH.j6);
            int iMin = Math.min(i - i2, this.DW - i3);
            un0 un0Var = this.VH.Hw;
            System.arraycopy(un0Var.j6, un0Var.j6(i3), bArr, i2, iMin);
            j += iMin;
            i2 += iMin;
            if (j == this.VH.DW) {
                this.j6.v5(un0Var);
                this.VH = this.VH.j6();
            }
        }
    }

    private final boolean a8() {
        return this.Zo.compareAndSet(0, 1);
    }

    private final void gn(sk0 sk0Var) {
        if (sk0Var.FH) {
            sk0 sk0Var2 = this.gn;
            boolean z = sk0Var2.FH;
            int i = (z ? 1 : 0) + (((int) (sk0Var2.j6 - sk0Var.j6)) / this.DW);
            un0[] un0VarArr = new un0[i];
            for (int i2 = 0; i2 < i; i2++) {
                un0VarArr[i2] = sk0Var.Hw;
                sk0Var = sk0Var.j6();
            }
            this.j6.Hw(un0VarArr);
        }
    }

    private final void lg() {
        if (this.Zo.compareAndSet(1, 0)) {
            return;
        }
        QX();
    }

    private final void tp(long j) {
        while (true) {
            sk0 sk0Var = this.VH;
            if (j < sk0Var.DW) {
                return;
            }
            this.j6.v5(sk0Var.Hw);
            this.VH = this.VH.j6();
        }
    }

    @Override // com.google.android.gms.internal.ads.mh0
    public final int DW(fh0 fh0Var, int i, boolean z) throws EOFException {
        if (!a8()) {
            int iDW = fh0Var.DW(i);
            if (iDW != -1) {
                return iDW;
            }
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        try {
            int iJ0 = J0(i);
            un0 un0Var = this.gn.Hw;
            int iJ6 = fh0Var.j6(un0Var.j6, un0Var.j6(this.J8), iJ0);
            if (iJ6 == -1) {
                if (z) {
                    return -1;
                }
                throw new EOFException();
            }
            this.J8 += iJ6;
            this.J0 += iJ6;
            return iJ6;
        } finally {
            lg();
        }
    }

    public final void EQ(long j) {
        if (this.we != j) {
            this.we = j;
            this.tp = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.mh0
    public final void FH(long j, int i, int i2, int i3, nh0 nh0Var) {
        if (this.tp) {
            j6(this.EQ);
        }
        if (!a8()) {
            this.FH.FH(j);
            return;
        }
        try {
            this.FH.DW(j + this.we, i, (this.J0 - i2) - i3, i2, nh0Var);
        } finally {
            lg();
        }
    }

    @Override // com.google.android.gms.internal.ads.mh0
    public final void Hw(ap0 ap0Var, int i) {
        if (!a8()) {
            ap0Var.J0(i);
            return;
        }
        while (i > 0) {
            int iJ0 = J0(i);
            un0 un0Var = this.gn.Hw;
            ap0Var.QX(un0Var.j6, un0Var.j6(this.J8), iJ0);
            this.J8 += iJ0;
            this.J0 += iJ0;
            i -= iJ0;
        }
        lg();
    }

    public final boolean J8(long j, boolean z) {
        long jV5 = this.FH.v5(j, z);
        if (jV5 == -1) {
            return false;
        }
        tp(jV5);
        return true;
    }

    public final zzfs Mr() {
        return this.FH.we();
    }

    public final void U2() {
        long jJ0 = this.FH.J0();
        if (jJ0 != -1) {
            tp(jJ0);
        }
    }

    public final long Ws() {
        return this.FH.Zo();
    }

    public final int XL() {
        return this.FH.u7();
    }

    public final int Zo(xe0 xe0Var, tg0 tg0Var, boolean z, boolean z2, long j) {
        int iGn;
        int iJ6 = this.FH.j6(xe0Var, tg0Var, z, z2, this.u7, this.Hw);
        if (iJ6 == -5) {
            this.u7 = xe0Var.j6;
            return -5;
        }
        if (iJ6 != -4) {
            if (iJ6 == -3) {
                return -3;
            }
            throw new IllegalStateException();
        }
        if (!tg0Var.Hw()) {
            if (tg0Var.Hw < j) {
                tg0Var.Zo(Integer.MIN_VALUE);
            }
            if (tg0Var.gn()) {
                qk0 qk0Var = this.Hw;
                long j2 = qk0Var.DW;
                this.v5.tp(1);
                VH(j2, this.v5.j6, 1);
                long j3 = j2 + 1;
                byte b = this.v5.j6[0];
                boolean z3 = (b & 128) != 0;
                int i = b & 127;
                pg0 pg0Var = tg0Var.DW;
                if (pg0Var.j6 == null) {
                    pg0Var.j6 = new byte[16];
                }
                VH(j3, tg0Var.DW.j6, i);
                long j4 = j3 + i;
                if (z3) {
                    this.v5.tp(2);
                    VH(j4, this.v5.j6, 2);
                    j4 += 2;
                    iGn = this.v5.gn();
                } else {
                    iGn = 1;
                }
                int[] iArr = tg0Var.DW.Hw;
                if (iArr == null || iArr.length < iGn) {
                    iArr = new int[iGn];
                }
                int[] iArr2 = iArr;
                int[] iArr3 = tg0Var.DW.v5;
                if (iArr3 == null || iArr3.length < iGn) {
                    iArr3 = new int[iGn];
                }
                int[] iArr4 = iArr3;
                if (z3) {
                    int i2 = iGn * 6;
                    this.v5.tp(i2);
                    VH(j4, this.v5.j6, i2);
                    j4 += i2;
                    this.v5.EQ(0);
                    for (int i3 = 0; i3 < iGn; i3++) {
                        iArr2[i3] = this.v5.gn();
                        iArr4[i3] = this.v5.a8();
                    }
                } else {
                    iArr2[0] = 0;
                    iArr4[0] = qk0Var.j6 - ((int) (j4 - qk0Var.DW));
                }
                nh0 nh0Var = qk0Var.Hw;
                pg0 pg0Var2 = tg0Var.DW;
                pg0Var2.j6(iGn, iArr2, iArr4, nh0Var.DW, pg0Var2.j6, nh0Var.j6);
                long j5 = qk0Var.DW;
                int i4 = (int) (j4 - j5);
                qk0Var.DW = j5 + i4;
                qk0Var.j6 -= i4;
            }
            tg0Var.u7(this.Hw.j6);
            qk0 qk0Var2 = this.Hw;
            long j6 = qk0Var2.DW;
            ByteBuffer byteBuffer = tg0Var.FH;
            int i5 = qk0Var2.j6;
            tp(j6);
            while (i5 > 0) {
                int i6 = (int) (j6 - this.VH.j6);
                int iMin = Math.min(i5, this.DW - i6);
                un0 un0Var = this.VH.Hw;
                byteBuffer.put(un0Var.j6, un0Var.j6(i6), iMin);
                j6 += iMin;
                i5 -= iMin;
                if (j6 == this.VH.DW) {
                    this.j6.v5(un0Var);
                    this.VH = this.VH.j6();
                }
            }
            tp(this.Hw.FH);
        }
        return -4;
    }

    public final int aM() {
        return this.FH.tp();
    }

    public final boolean j3() {
        return this.FH.EQ();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    @Override // com.google.android.gms.internal.ads.mh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j6(com.google.android.gms.internal.ads.zzfs r8) {
        /*
            r7 = this;
            long r0 = r7.we
            if (r8 != 0) goto L6
            r0 = 0
            goto L1e
        L6:
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1d
            long r2 = r8.pO
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L1d
            long r2 = r2 + r0
            com.google.android.gms.internal.ads.zzfs r0 = r8.U2(r2)
            goto L1e
        L1d:
            r0 = r8
        L1e:
            com.google.android.gms.internal.ads.pk0 r1 = r7.FH
            boolean r1 = r1.J8(r0)
            r7.EQ = r8
            r8 = 0
            r7.tp = r8
            com.google.android.gms.internal.ads.tk0 r8 = r7.Ws
            if (r8 == 0) goto L32
            if (r1 == 0) goto L32
            r8.XL(r0)
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rk0.j6(com.google.android.gms.internal.ads.zzfs):void");
    }

    public final void rN(boolean z) {
        int andSet = this.Zo.getAndSet(z ? 0 : 2);
        QX();
        this.FH.gn();
        if (andSet == 2) {
            this.u7 = null;
        }
    }

    public final void u7(tk0 tk0Var) {
        this.Ws = tk0Var;
    }

    public final void v5() {
        if (this.Zo.getAndSet(2) == 0) {
            QX();
        }
    }

    public final void we(int i) {
        long jHw = this.FH.Hw(i);
        this.J0 = jHw;
        sk0 sk0Var = this.VH;
        if (jHw == sk0Var.j6) {
            gn(sk0Var);
            sk0 sk0Var2 = new sk0(jHw, this.DW);
            this.VH = sk0Var2;
            this.gn = sk0Var2;
            return;
        }
        sk0 sk0Var3 = sk0Var.v5;
        while (true) {
            sk0 sk0Var4 = sk0Var3;
            sk0 sk0Var5 = sk0Var;
            sk0Var = sk0Var4;
            if (jHw <= sk0Var.j6) {
                gn(sk0Var);
                this.gn = sk0Var5;
                sk0Var5.v5 = new sk0(sk0Var5.DW, this.DW);
                this.J8 = (int) (jHw - this.gn.j6);
                return;
            }
            sk0Var3 = sk0Var.v5;
        }
    }
}
