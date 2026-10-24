package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class n2 extends zd0 implements m2 {
    n2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final IBinder kj(abcd.wu wuVar, abcd.wu wuVar2, abcd.wu wuVar3, int i) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        be0.FH(parcelSh, wuVar2);
        be0.FH(parcelSh, wuVar3);
        parcelSh.writeInt(14300000);
        Parcel parcelDx = dx(1, parcelSh);
        IBinder strongBinder = parcelDx.readStrongBinder();
        parcelDx.recycle();
        return strongBinder;
    }
}
