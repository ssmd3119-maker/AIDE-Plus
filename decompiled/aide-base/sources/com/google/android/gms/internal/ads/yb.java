package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class yb extends zd0 implements xb {
    yb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.xb
    public final void gW(String str) {
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        g3(3, parcelSh);
    }
}
