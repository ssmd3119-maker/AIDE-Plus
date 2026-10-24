package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class va extends zd0 implements ta {
    va(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    @Override // com.google.android.gms.internal.ads.ta
    public final int jJ() {
        Parcel parcelDx = dx(1, sh());
        int i = parcelDx.readInt();
        parcelDx.recycle();
        return i;
    }
}
