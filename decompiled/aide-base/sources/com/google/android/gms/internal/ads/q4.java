package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public abstract class q4 extends ae0 implements p4 {
    public q4() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        jg((ParcelFileDescriptor) be0.DW(parcel, ParcelFileDescriptor.CREATOR));
        return true;
    }
}
