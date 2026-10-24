package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class vr implements Runnable {
    private final /* synthetic */ rr WB;

    vr(rr rrVar) {
        this.WB = rrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.WB.kf != null) {
            this.WB.kf.Zo();
        }
    }
}
