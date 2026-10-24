package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class ax0 extends ae0 implements zw0 {
    public ax0() {
        super("com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    public static zw0 Mt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return iInterfaceQueryLocalInterface instanceof zw0 ? (zw0) iInterfaceQueryLocalInterface : new bx0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mq();
        parcel2.writeNoException();
        return true;
    }
}
