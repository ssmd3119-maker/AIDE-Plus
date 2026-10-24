package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;

/* loaded from: classes.dex */
public final class wl implements Runnable {
    private final /* synthetic */ Context WB;
    private final /* synthetic */ fr mb;

    wl(vl vlVar, Context context, fr frVar) {
        this.WB = context;
        this.mb = frVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.mb.FH(AdvertisingIdClient.DW(this.WB));
        } catch (com.google.android.gms.common.d | com.google.android.gms.common.e | IOException | IllegalStateException e) {
            this.mb.Hw(e);
            xp.Hw("Exception while getting advertising Id info", e);
        }
    }
}
