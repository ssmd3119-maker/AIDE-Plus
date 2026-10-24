package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class w0 implements Runnable {
    private final /* synthetic */ v0 WB;

    w0(v0 v0Var) {
        this.WB = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.WB.kf != null) {
            this.WB.kf.E4();
            this.WB.kf.PH();
            this.WB.kf.Bx();
        }
        v0.Mt(this.WB, null);
    }
}
