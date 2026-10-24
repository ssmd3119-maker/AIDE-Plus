package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class n3 extends ae0 implements m3 {
    public n3() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static m3 Mt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return iInterfaceQueryLocalInterface instanceof m3 ? (m3) iInterfaceQueryLocalInterface : new o3(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        b3 d3Var;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            d3Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            d3Var = iInterfaceQueryLocalInterface instanceof b3 ? (b3) iInterfaceQueryLocalInterface : new d3(strongBinder);
        }
        lp(d3Var, parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
