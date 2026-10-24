package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class kx extends zd0 implements ix {
    kx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // com.google.android.gms.internal.ads.ix
    public final void jc(gx gxVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, gxVar);
        g3(1, parcelSh);
    }
}
