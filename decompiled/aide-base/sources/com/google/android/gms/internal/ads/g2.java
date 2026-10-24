package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class g2 extends ae0 implements f2 {
    public g2() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static f2 Mt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof f2 ? (f2) iInterfaceQueryLocalInterface : new h2(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            abcd.wu wuVarK0 = K0();
            parcel2.writeNoException();
            be0.FH(parcel2, wuVarK0);
        } else if (i == 2) {
            Uri uriJm = Jm();
            parcel2.writeNoException();
            be0.VH(parcel2, uriJm);
        } else {
            if (i != 3) {
                return false;
            }
            double dPA = PA();
            parcel2.writeNoException();
            parcel2.writeDouble(dPA);
        }
        return true;
    }
}
