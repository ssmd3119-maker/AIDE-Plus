package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class pj extends zd0 implements oj {
    pj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    @Override // com.google.android.gms.internal.ads.oj
    public final void nI(lj ljVar, String str) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, ljVar);
        parcelSh.writeString(str);
        g3(1, parcelSh);
    }
}
