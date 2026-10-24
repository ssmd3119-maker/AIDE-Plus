package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class ia implements Runnable {
    private final /* synthetic */ aa WB;

    ia(ha haVar, aa aaVar) {
        this.WB = aaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.WB.FH.destroy();
        } catch (RemoteException e) {
            xp.v5("Could not destroy mediation adapter.", e);
        }
    }
}
