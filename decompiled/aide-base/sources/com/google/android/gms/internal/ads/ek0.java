package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ek0 implements Runnable {
    private final /* synthetic */ hk0 WB;
    private final /* synthetic */ bk0 mb;

    ek0(bk0 bk0Var, hk0 hk0Var) {
        this.mb = bk0Var;
        this.WB = hk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.WB.j6();
        int size = this.mb.kf.size();
        for (int i = 0; i < size; i++) {
            ((rk0) this.mb.kf.valueAt(i)).v5();
        }
    }
}
