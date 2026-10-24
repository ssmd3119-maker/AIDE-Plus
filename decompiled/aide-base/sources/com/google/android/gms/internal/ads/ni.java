package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class ni implements Runnable {
    private final /* synthetic */ zzasi WB;
    private final /* synthetic */ li jw;
    private final /* synthetic */ qh mb;

    ni(li liVar, zzasi zzasiVar, qh qhVar) {
        this.jw = liVar;
        this.WB = zzasiVar;
        this.mb = qhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzasm zzasmVar;
        try {
            zzasmVar = this.jw.xm(this.WB);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.w0.u7().v5(e, "AdRequestServiceImpl.loadAdAsync");
            xp.v5("Could not fetch ad response due to an Exception.", e);
            zzasmVar = null;
        }
        if (zzasmVar == null) {
            zzasmVar = new zzasm(0);
        }
        try {
            this.mb.e9(zzasmVar);
        } catch (RemoteException e2) {
            xp.v5("Fail to forward ad response.", e2);
        }
    }
}
