package com.google.android.gms.internal.ads;

import abcd.wu;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class p2 extends ae0 implements o2 {
    public p2() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static o2 Mt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return iInterfaceQueryLocalInterface instanceof o2 ? (o2) iInterfaceQueryLocalInterface : new q2(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            aX(wu.a.dx(parcel.readStrongBinder()));
        } else if (i == 2) {
            sJ();
        } else {
            if (i != 3) {
                return false;
            }
            Za(wu.a.dx(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
