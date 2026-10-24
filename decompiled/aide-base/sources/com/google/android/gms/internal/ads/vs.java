package com.google.android.gms.internal.ads;

@jg
/* loaded from: classes.dex */
public final class vs implements Runnable {
    private es WB;
    private boolean mb = false;

    vs(es esVar) {
        this.WB = esVar;
    }

    private final void FH() {
        bn.gn.removeCallbacks(this);
        bn.gn.postDelayed(this, 250L);
    }

    public final void DW() {
        this.mb = false;
        FH();
    }

    public final void j6() {
        this.mb = true;
        this.WB.U2();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.mb) {
            return;
        }
        this.WB.U2();
        FH();
    }
}
