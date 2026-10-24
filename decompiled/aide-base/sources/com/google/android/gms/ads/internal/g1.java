package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.yl;
import com.google.android.gms.internal.ads.zl;

/* loaded from: classes.dex */
public final class g1 implements Runnable {
    private final /* synthetic */ zl WB;
    private final /* synthetic */ e1 mb;

    g1(e1 e1Var, zl zlVar) {
        this.mb = e1Var;
        this.WB = zlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.mb.BJ(new yl(this.WB, null, null, null, null, null, null, null));
    }
}
