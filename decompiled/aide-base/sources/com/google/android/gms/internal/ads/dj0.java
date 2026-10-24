package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class dj0 implements Runnable {
    private final bq0 WB;
    private final Runnable jw;
    private final iw0 mb;

    public dj0(bq0 bq0Var, iw0 iw0Var, Runnable runnable) {
        this.WB = bq0Var;
        this.mb = iw0Var;
        this.jw = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.WB.v5();
        if (this.mb.FH == null) {
            this.WB.XL(this.mb.j6);
        } else {
            this.WB.aM(this.mb.FH);
        }
        if (this.mb.Hw) {
            this.WB.Mr("intermediate-response");
        } else {
            this.WB.U2("done");
        }
        Runnable runnable = this.jw;
        if (runnable != null) {
            runnable.run();
        }
    }
}
