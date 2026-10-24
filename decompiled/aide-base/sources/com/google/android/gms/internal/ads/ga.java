package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ga implements Runnable {
    private final /* synthetic */ vq WB;
    private final /* synthetic */ ea mb;

    ga(ea eaVar, vq vqVar) {
        this.mb = eaVar;
        this.WB = vqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (vq vqVar : this.mb.EQ.keySet()) {
            if (vqVar != this.WB) {
                ((x9) this.mb.EQ.get(vqVar)).FH();
            }
        }
    }
}
