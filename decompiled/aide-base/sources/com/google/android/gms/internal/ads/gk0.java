package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes.dex */
public final class gk0 implements lo0 {
    private final xn0 DW;
    private final hk0 FH;
    private final to0 Hw;
    private boolean VH;
    private volatile boolean Zo;
    private long gn;
    private final Uri j6;
    private final /* synthetic */ bk0 tp;
    private long u7;
    private final jh0 v5;

    public gk0(bk0 bk0Var, Uri uri, xn0 xn0Var, hk0 hk0Var, to0 to0Var) {
        this.tp = bk0Var;
        ro0.FH(uri);
        this.j6 = uri;
        ro0.FH(xn0Var);
        this.DW = xn0Var;
        ro0.FH(hk0Var);
        this.FH = hk0Var;
        this.Hw = to0Var;
        this.v5 = new jh0();
        this.VH = true;
        this.u7 = -1L;
    }

    @Override // com.google.android.gms.internal.ads.lo0
    public final boolean DW() {
        return this.Zo;
    }

    @Override // com.google.android.gms.internal.ads.lo0
    public final void FH() {
        this.Zo = true;
    }

    @Override // com.google.android.gms.internal.ads.lo0
    public final void j6() throws Throwable {
        long jU7;
        bh0 bh0Var;
        int iDW = 0;
        while (iDW == 0 && !this.Zo) {
            bh0 bh0Var2 = null;
            try {
                jU7 = this.v5.j6;
                long jDW = this.DW.DW(new bo0(this.j6, jU7, -1L, this.tp.AL));
                this.u7 = jDW;
                if (jDW != -1) {
                    this.u7 = jDW + jU7;
                }
                bh0Var = new bh0(this.DW, jU7, this.u7);
            } catch (Throwable th) {
                th = th;
            }
            try {
                dh0 dh0VarDW = this.FH.DW(bh0Var, this.DW.Jm());
                if (this.VH) {
                    dh0VarDW.Zo(jU7, this.gn);
                    this.VH = false;
                }
                while (iDW == 0 && !this.Zo) {
                    this.Hw.j6();
                    iDW = dh0VarDW.DW(bh0Var, this.v5);
                    if (bh0Var.u7() > this.tp.w9 + jU7) {
                        jU7 = bh0Var.u7();
                        this.Hw.FH();
                        this.tp.Q6.post(this.tp.n5);
                    }
                }
                if (iDW == 1) {
                    iDW = 0;
                } else {
                    this.v5.j6 = bh0Var.u7();
                }
                ip0.VH(this.DW);
            } catch (Throwable th2) {
                th = th2;
                bh0Var2 = bh0Var;
                if (iDW != 1 && bh0Var2 != null) {
                    this.v5.j6 = bh0Var2.u7();
                }
                ip0.VH(this.DW);
                throw th;
            }
        }
    }

    public final void v5(long j, long j2) {
        this.v5.j6 = j;
        this.gn = j2;
        this.VH = true;
    }
}
