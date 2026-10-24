package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class qc0 implements Runnable {
    private final /* synthetic */ int WB;
    private final /* synthetic */ nc0 jw;
    private final /* synthetic */ boolean mb;

    qc0(nc0 nc0Var, int i, boolean z) {
        this.jw = nc0Var;
        this.WB = i;
        this.mb = z;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        sz szVarRN = this.jw.rN(this.WB, this.mb);
        this.jw.tp = szVarRN;
        if (nc0.u7(this.WB, szVarRN)) {
            this.jw.Zo(this.WB + 1, this.mb);
        }
    }
}
