package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class la extends ae0 implements ka {
    public la() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static ka Mt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof ka ? (ka) iInterfaceQueryLocalInterface : new ma(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            na naVarWu = wu(parcel.readString());
            parcel2.writeNoException();
            be0.FH(parcel2, naVarWu);
        } else if (i == 2) {
            boolean zGW = GW(parcel.readString());
            parcel2.writeNoException();
            be0.j6(parcel2, zGW);
        } else {
            if (i != 3) {
                return false;
            }
            dc dcVarMX = MX(parcel.readString());
            parcel2.writeNoException();
            be0.FH(parcel2, dcVarMX);
        }
        return true;
    }
}
