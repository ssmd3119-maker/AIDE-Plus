package com.google.android.gms.internal.ads;

import abcd.wu;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class b5 extends ae0 implements a5 {
    public b5() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        c5 d5Var;
        if (i == 3) {
            yx0 videoController = getVideoController();
            parcel2.writeNoException();
            be0.FH(parcel2, videoController);
            return true;
        }
        if (i == 4) {
            destroy();
            parcel2.writeNoException();
            return true;
        }
        if (i != 5) {
            return false;
        }
        abcd.wu wuVarDx = wu.a.dx(parcel.readStrongBinder());
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            d5Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
            d5Var = iInterfaceQueryLocalInterface instanceof c5 ? (c5) iInterfaceQueryLocalInterface : new d5(strongBinder);
        }
        DY(wuVarDx, d5Var);
        parcel2.writeNoException();
        return true;
    }
}
