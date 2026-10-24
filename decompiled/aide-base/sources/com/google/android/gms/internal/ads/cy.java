package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class cy extends zd0 implements by {
    cy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    @Override // com.google.android.gms.internal.ads.by
    public final zzbji j7(zzbjg zzbjgVar) {
        Parcel parcelSh = sh();
        be0.Hw(parcelSh, zzbjgVar);
        Parcel parcelDx = dx(1, parcelSh);
        zzbji zzbjiVar = (zzbji) be0.DW(parcelDx, zzbji.CREATOR);
        parcelDx.recycle();
        return zzbjiVar;
    }
}
