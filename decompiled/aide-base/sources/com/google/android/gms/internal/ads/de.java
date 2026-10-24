package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class de implements Runnable {
    private final /* synthetic */ ce WB;

    de(ce ceVar) {
        this.WB = ceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.WB.zh.get()) {
            xp.j6("Timed out waiting for WebView to finish loading.");
            this.WB.cancel();
        }
    }
}
