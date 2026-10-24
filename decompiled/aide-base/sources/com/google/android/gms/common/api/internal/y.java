package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zaj;

/* loaded from: classes.dex */
public final class y implements Runnable {
    private final /* synthetic */ zaj WB;
    private final /* synthetic */ w mb;

    y(w wVar, zaj zajVar) {
        this.mb = wVar;
        this.WB = zajVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.mb.aq(this.WB);
    }
}
