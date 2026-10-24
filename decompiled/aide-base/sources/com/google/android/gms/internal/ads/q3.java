package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class q3 extends ae0 implements p3 {
    public q3() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public static p3 Mt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof p3 ? (p3) iInterfaceQueryLocalInterface : new r3(iBinder);
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
        Fz(d3Var);
        parcel2.writeNoException();
        return true;
    }
}
