package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class sf0 implements Runnable {
    private final /* synthetic */ zzfs WB;
    private final /* synthetic */ pf0 mb;

    sf0(pf0 pf0Var, zzfs zzfsVar) {
        this.mb = pf0Var;
        this.WB = zzfsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.mb.DW.Hw(this.WB);
    }
}
