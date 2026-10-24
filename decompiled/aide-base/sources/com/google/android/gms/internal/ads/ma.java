package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ma extends zd0 implements ka {
    ma(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.ka
    public final boolean GW(String str) {
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        Parcel parcelDx = dx(2, parcelSh);
        boolean zV5 = be0.v5(parcelDx);
        parcelDx.recycle();
        return zV5;
    }

    @Override // com.google.android.gms.internal.ads.ka
    public final dc MX(String str) {
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        Parcel parcelDx = dx(3, parcelSh);
        dc dcVarMt = ec.Mt(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return dcVarMt;
    }

    @Override // com.google.android.gms.internal.ads.ka
    public final na wu(String str) {
        na paVar;
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        Parcel parcelDx = dx(1, parcelSh);
        IBinder strongBinder = parcelDx.readStrongBinder();
        if (strongBinder == null) {
            paVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            paVar = iInterfaceQueryLocalInterface instanceof na ? (na) iInterfaceQueryLocalInterface : new pa(strongBinder);
        }
        parcelDx.recycle();
        return paVar;
    }
}
