package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class wr implements Runnable {
    private final /* synthetic */ String WB;
    private final /* synthetic */ rr jw;
    private final /* synthetic */ String mb;

    wr(rr rrVar, String str, String str2) {
        this.jw = rrVar;
        this.WB = str;
        this.mb = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.jw.kf != null) {
            this.jw.kf.v5(this.WB, this.mb);
        }
    }
}
