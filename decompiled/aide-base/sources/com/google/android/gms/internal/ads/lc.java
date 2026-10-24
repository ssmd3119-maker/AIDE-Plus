package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class lc implements lx<mx, Object> {
    private final /* synthetic */ xb j6;

    lc(jc jcVar, xb xbVar, qa qaVar) {
        this.j6 = xbVar;
    }

    @Override // com.google.android.gms.internal.ads.lx
    public final void j6(String str) {
        try {
            this.j6.gW(str);
        } catch (RemoteException e) {
            xp.Hw("", e);
        }
    }
}
