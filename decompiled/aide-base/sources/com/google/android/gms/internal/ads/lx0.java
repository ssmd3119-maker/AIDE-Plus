package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class lx0 extends zd0 implements ix0 {
    lx0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
    }

    @Override // com.google.android.gms.internal.ads.ix0
    public final long getValue() {
        Parcel parcelDx = dx(1, sh());
        long j = parcelDx.readLong();
        parcelDx.recycle();
        return j;
    }
}
