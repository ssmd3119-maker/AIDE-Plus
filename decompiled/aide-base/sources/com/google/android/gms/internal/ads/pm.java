package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class pm implements Runnable {
    private final /* synthetic */ om WB;

    pm(om omVar) {
        this.WB = omVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.WB.mb = Thread.currentThread();
        this.WB.gn();
    }
}
