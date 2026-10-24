package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b2 extends ae0 implements a2 {
    public b2() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static a2 Mt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return iInterfaceQueryLocalInterface instanceof a2 ? (a2) iInterfaceQueryLocalInterface : new c2(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            String strOW = OW();
            parcel2.writeNoException();
            parcel2.writeString(strOW);
            return true;
        }
        if (i != 3) {
            return false;
        }
        List<f2> listMH = MH();
        parcel2.writeNoException();
        parcel2.writeList(listMH);
        return true;
    }
}
