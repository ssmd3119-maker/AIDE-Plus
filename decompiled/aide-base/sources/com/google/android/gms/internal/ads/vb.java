package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class vb extends zd0 implements ub {
    vb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.ub
    public final void gW(String str) {
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        g3(2, parcelSh);
    }
}
