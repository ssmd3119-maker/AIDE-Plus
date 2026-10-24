package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ph extends zd0 implements nh {
    ph(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.nh
    public final void dd(zzatb zzatbVar, th thVar) {
        Parcel parcelSh = sh();
        be0.Hw(parcelSh, zzatbVar);
        be0.FH(parcelSh, thVar);
        g3(4, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.nh
    public final void pT(zzatb zzatbVar, th thVar) {
        Parcel parcelSh = sh();
        be0.Hw(parcelSh, zzatbVar);
        be0.FH(parcelSh, thVar);
        g3(5, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.nh
    public final void x(zzasi zzasiVar, qh qhVar) {
        Parcel parcelSh = sh();
        be0.Hw(parcelSh, zzasiVar);
        be0.FH(parcelSh, qhVar);
        g3(2, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.nh
    public final zzasm xm(zzasi zzasiVar) {
        Parcel parcelSh = sh();
        be0.Hw(parcelSh, zzasiVar);
        Parcel parcelDx = dx(1, parcelSh);
        zzasm zzasmVar = (zzasm) be0.DW(parcelDx, zzasm.CREATOR);
        parcelDx.recycle();
        return zzasmVar;
    }
}
