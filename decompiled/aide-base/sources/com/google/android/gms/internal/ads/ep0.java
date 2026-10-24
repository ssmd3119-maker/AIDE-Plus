package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class ep0 implements vo0 {
    private long DW;
    private long FH;
    private bf0 Hw = bf0.Hw;
    private boolean j6;

    public final void DW() {
        if (this.j6) {
            VH(FH());
            this.j6 = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.vo0
    public final long FH() {
        long j = this.DW;
        if (!this.j6) {
            return j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.FH;
        bf0 bf0Var = this.Hw;
        return j + (bf0Var.j6 == 1.0f ? ie0.DW(jElapsedRealtime) : bf0Var.j6(jElapsedRealtime));
    }

    @Override // com.google.android.gms.internal.ads.vo0
    public final bf0 Hw(bf0 bf0Var) {
        if (this.j6) {
            VH(FH());
        }
        this.Hw = bf0Var;
        return bf0Var;
    }

    public final void VH(long j) {
        this.DW = j;
        if (this.j6) {
            this.FH = SystemClock.elapsedRealtime();
        }
    }

    public final void Zo(vo0 vo0Var) {
        VH(vo0Var.FH());
        this.Hw = vo0Var.v5();
    }

    public final void j6() {
        if (this.j6) {
            return;
        }
        this.FH = SystemClock.elapsedRealtime();
        this.j6 = true;
    }

    @Override // com.google.android.gms.internal.ads.vo0
    public final bf0 v5() {
        return this.Hw;
    }
}
