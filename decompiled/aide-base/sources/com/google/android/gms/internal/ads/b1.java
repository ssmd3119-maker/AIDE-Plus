package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class b1 implements Runnable {
    private final /* synthetic */ z0 WB;

    b1(z0 z0Var) {
        this.WB = z0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.WB.AL != null) {
            this.WB.AL.E4();
            this.WB.AL.PH();
        }
        z0.CO(this.WB, null);
    }
}
