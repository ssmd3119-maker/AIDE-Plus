package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class js implements Runnable {
    private final /* synthetic */ boolean WB;
    private final /* synthetic */ es mb;

    js(es esVar, boolean z) {
        this.mb = esVar;
        this.WB = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.mb.yS("windowVisibilityChanged", "isVisible", String.valueOf(this.WB));
    }
}
