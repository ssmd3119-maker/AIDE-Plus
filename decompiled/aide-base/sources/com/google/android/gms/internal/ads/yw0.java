package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class yw0 extends zd0 implements xw0 {
    yw0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.xw0
    public final IBinder Rt(abcd.wu wuVar, zzwf zzwfVar, String str, ka kaVar, int i, int i2) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        be0.Hw(parcelSh, zzwfVar);
        parcelSh.writeString(str);
        be0.FH(parcelSh, kaVar);
        parcelSh.writeInt(14300000);
        parcelSh.writeInt(i2);
        Parcel parcelDx = dx(2, parcelSh);
        IBinder strongBinder = parcelDx.readStrongBinder();
        parcelDx.recycle();
        return strongBinder;
    }
}
