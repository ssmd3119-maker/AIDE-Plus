package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class uf0 implements Runnable {
    private final /* synthetic */ sg0 WB;
    private final /* synthetic */ pf0 mb;

    uf0(pf0 pf0Var, sg0 sg0Var) {
        this.mb = pf0Var;
        this.WB = sg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.WB.j6();
        this.mb.DW.Zo(this.WB);
    }
}
