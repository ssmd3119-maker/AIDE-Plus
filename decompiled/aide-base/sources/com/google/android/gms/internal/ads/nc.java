package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class nc implements lx<com.google.android.gms.ads.mediation.l, Object> {
    private final /* synthetic */ zb j6;

    nc(jc jcVar, zb zbVar, qa qaVar) {
        this.j6 = zbVar;
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
