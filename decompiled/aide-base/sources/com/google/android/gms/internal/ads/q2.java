package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class q2 extends zd0 implements o2 {
    q2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final void Za(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        g3(3, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final void aX(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        g3(1, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final void sJ() {
        g3(2, sh());
    }
}
