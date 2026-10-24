package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class h8 implements ir {
    private final /* synthetic */ u7 DW;
    private final /* synthetic */ o8 j6;

    h8(u7 u7Var, o8 o8Var) {
        this.DW = u7Var;
        this.j6 = o8Var;
    }

    @Override // com.google.android.gms.internal.ads.ir
    public final void run() {
        synchronized (this.DW.j6) {
            this.DW.gn = 1;
            sm.we("Failed loading new engine. Marking new engine destroyable.");
            this.j6.gn();
        }
    }
}
