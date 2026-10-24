package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class cc extends zd0 implements bc {
    cc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    @Override // com.google.android.gms.internal.ads.bc
    public final void gW(String str) {
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        g3(3, parcelSh);
    }
}
