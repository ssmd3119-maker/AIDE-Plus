package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class ua extends ae0 implements ta {
    public ua() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        int iJJ = jJ();
        parcel2.writeNoException();
        parcel2.writeInt(iJJ);
        return true;
    }
}
