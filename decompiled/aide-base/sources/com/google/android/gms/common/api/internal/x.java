package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class x implements Runnable {
    private final /* synthetic */ w WB;

    x(w wVar) {
        this.WB = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.WB.zh.FH(new ConnectionResult(4));
    }
}
