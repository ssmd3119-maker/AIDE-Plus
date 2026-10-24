package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class is implements Runnable {
    private final /* synthetic */ es WB;

    is(es esVar) {
        this.WB = esVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.WB.yS("surfaceDestroyed", new String[0]);
    }
}
