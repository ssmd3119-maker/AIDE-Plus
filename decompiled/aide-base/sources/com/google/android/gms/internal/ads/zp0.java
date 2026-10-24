package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zp0 implements Runnable {
    private final /* synthetic */ zzfs WB;
    private final /* synthetic */ wp0 mb;

    zp0(wp0 wp0Var, zzfs zzfsVar) {
        this.mb = wp0Var;
        this.WB = zzfsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.mb.DW.tp(this.WB);
    }
}
