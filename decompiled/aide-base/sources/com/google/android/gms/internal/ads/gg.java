package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class gg implements Runnable {
    private final /* synthetic */ bq WB;
    private final /* synthetic */ String mb;

    gg(dg dgVar, bq bqVar, String str) {
        this.WB = bqVar;
        this.mb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.WB.j6(this.mb);
    }
}
