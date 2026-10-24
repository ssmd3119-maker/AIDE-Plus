package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.internal.ads.yl;

/* loaded from: classes.dex */
public final class k0 implements Runnable {
    private final /* synthetic */ String WB;
    private final /* synthetic */ c0 jw;
    private final /* synthetic */ yl mb;

    k0(c0 c0Var, String str, yl ylVar) {
        this.jw = c0Var;
        this.WB = str;
        this.mb = ylVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.jw.k2.pO.get(this.WB).Fz((com.google.android.gms.internal.ads.z0) this.mb.P8);
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }
}
