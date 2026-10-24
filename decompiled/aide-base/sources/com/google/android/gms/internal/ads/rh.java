package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class rh extends ae0 implements qh {
    public rh() {
        super("com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        e9((zzasm) be0.DW(parcel, zzasm.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
