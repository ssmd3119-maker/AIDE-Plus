package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class mc implements lx<nx, Object> {
    private final /* synthetic */ bc j6;

    mc(jc jcVar, bc bcVar, qa qaVar) {
        this.j6 = bcVar;
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
