package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class yr implements Runnable {
    private final /* synthetic */ int WB;
    private final /* synthetic */ rr jw;
    private final /* synthetic */ int mb;

    yr(rr rrVar, int i, int i2) {
        this.jw = rrVar;
        this.WB = i;
        this.mb = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.jw.kf != null) {
            this.jw.kf.u7(this.WB, this.mb);
        }
    }
}
