package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class tw0 extends zd0 implements sw0 {
    tw0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    @Override // com.google.android.gms.internal.ads.sw0
    public final IBinder Fd(abcd.wu wuVar, String str, ka kaVar, int i) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        parcelSh.writeString(str);
        be0.FH(parcelSh, kaVar);
        parcelSh.writeInt(14300000);
        Parcel parcelDx = dx(1, parcelSh);
        IBinder strongBinder = parcelDx.readStrongBinder();
        parcelDx.recycle();
        return strongBinder;
    }
}
