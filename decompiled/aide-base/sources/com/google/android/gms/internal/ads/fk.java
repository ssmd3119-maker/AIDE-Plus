package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class fk implements Runnable {
    private final /* synthetic */ na WB;
    private final /* synthetic */ dk fY;
    private final /* synthetic */ lk jw;
    private final /* synthetic */ zzwb mb;

    fk(dk dkVar, na naVar, zzwb zzwbVar, lk lkVar) {
        this.fY = dkVar;
        this.WB = naVar;
        this.mb = zzwbVar;
        this.jw = lkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.WB.lz(abcd.xu.sy(this.fY.k2), this.mb, null, this.jw, this.fY.hK);
        } catch (RemoteException e) {
            String strValueOf = String.valueOf(this.fY.fY);
            xp.v5(strValueOf.length() != 0 ? "Fail to initialize adapter ".concat(strValueOf) : new String("Fail to initialize adapter "), e);
            dk dkVar = this.fY;
            dkVar.Hw(dkVar.fY, 0);
        }
    }
}
