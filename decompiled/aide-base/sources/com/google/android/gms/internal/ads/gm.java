package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class gm {
    private volatile int DW;
    private volatile long FH;
    private final Object j6;

    private gm() {
        this.j6 = new Object();
        this.DW = hm.j6;
        this.FH = 0L;
    }

    private final void DW(int i, int i2) {
        Zo();
        long jJ6 = com.google.android.gms.ads.internal.w0.we().j6();
        synchronized (this.j6) {
            if (this.DW != i) {
                return;
            }
            this.DW = i2;
            if (this.DW == hm.FH) {
                this.FH = jJ6;
            }
        }
    }

    private final void Zo() {
        long jJ6 = com.google.android.gms.ads.internal.w0.we().j6();
        synchronized (this.j6) {
            if (this.DW == hm.FH) {
                if (this.FH + ((Long) cw0.v5().FH(p.ji)).longValue() <= jJ6) {
                    this.DW = hm.j6;
                }
            }
        }
    }

    public final boolean FH() {
        Zo();
        return this.DW == hm.DW;
    }

    public final boolean Hw() {
        Zo();
        return this.DW == hm.FH;
    }

    public final void j6(boolean z) {
        if (z) {
            DW(hm.j6, hm.DW);
        } else {
            DW(hm.DW, hm.j6);
        }
    }

    public final void v5() {
        DW(hm.DW, hm.FH);
    }

    /* synthetic */ gm(fm fmVar) {
        this();
    }
}
