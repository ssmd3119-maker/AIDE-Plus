package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class pd extends zd0 implements od {
    pd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    @Override // com.google.android.gms.internal.ads.od
    public final IBinder gO(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        Parcel parcelDx = dx(1, parcelSh);
        IBinder strongBinder = parcelDx.readStrongBinder();
        parcelDx.recycle();
        return strongBinder;
    }
}
