package com.google.android.gms.internal.ads;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class pe implements Runnable {
    private final /* synthetic */ CountDownLatch WB;
    private final /* synthetic */ oe mb;

    pe(oe oeVar, CountDownLatch countDownLatch) {
        this.mb = oeVar;
        this.WB = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.mb.zh) {
            this.mb.kf = com.google.android.gms.ads.internal.s.VH(this.mb.Q6, this.mb.Z1, this.WB);
        }
    }
}
