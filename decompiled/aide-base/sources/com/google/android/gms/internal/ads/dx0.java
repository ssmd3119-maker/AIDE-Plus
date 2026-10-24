package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class dx0 extends ae0 implements cx0 {
    public dx0() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static cx0 Mt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return iInterfaceQueryLocalInterface instanceof cx0 ? (cx0) iInterfaceQueryLocalInterface : new ex0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        U2(parcel.readString(), parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
