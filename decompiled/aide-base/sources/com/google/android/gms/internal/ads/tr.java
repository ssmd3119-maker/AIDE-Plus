package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class tr implements Runnable {
    private final /* synthetic */ rr WB;

    tr(rr rrVar) {
        this.WB = rrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.WB.kf != null) {
            this.WB.kf.j6();
        }
    }
}
