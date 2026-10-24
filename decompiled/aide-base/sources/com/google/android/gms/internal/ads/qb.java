package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class qb implements Runnable {
    private final /* synthetic */ abcd.iu WB;
    private final /* synthetic */ ob mb;

    qb(ob obVar, abcd.iu iuVar) {
        this.mb = obVar;
        this.WB = iuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.mb.j6.Gj(rb.j6(this.WB));
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }
}
