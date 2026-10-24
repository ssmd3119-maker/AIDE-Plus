package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.xp;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class w implements com.google.android.gms.ads.internal.gmsg.b0<cv> {
    private final /* synthetic */ CountDownLatch j6;

    w(CountDownLatch countDownLatch) {
        this.j6 = countDownLatch;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final /* synthetic */ void zza(cv cvVar, Map map) {
        xp.u7("Adapter returned an ad, but assets substitution failed");
        this.j6.countDown();
        cvVar.destroy();
    }
}
