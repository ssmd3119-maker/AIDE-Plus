package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class fn implements Runnable {
    private final /* synthetic */ Context WB;
    private final /* synthetic */ bn mb;

    fn(bn bnVar, Context context) {
        this.mb = bnVar;
        this.WB = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.mb.j6) {
            this.mb.FH = bn.BT(this.WB);
            this.mb.j6.notifyAll();
        }
    }
}
