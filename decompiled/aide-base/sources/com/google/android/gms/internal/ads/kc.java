package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class kc implements lx<Object, Object> {
    private final /* synthetic */ ub j6;

    kc(jc jcVar, ub ubVar, qa qaVar) {
        this.j6 = ubVar;
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
