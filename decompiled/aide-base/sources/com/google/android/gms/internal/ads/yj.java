package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class yj extends zd0 implements wj {
    yj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.wj
    public final void AE() {
        g3(1, sh());
    }

    @Override // com.google.android.gms.internal.ads.wj
    public final void Mz() {
        g3(4, sh());
    }

    @Override // com.google.android.gms.internal.ads.wj
    public final void P8() {
        g3(3, sh());
    }

    @Override // com.google.android.gms.internal.ads.wj
    public final void SI() {
        g3(6, sh());
    }

    @Override // com.google.android.gms.internal.ads.wj
    public final void ca() {
        g3(2, sh());
    }

    @Override // com.google.android.gms.internal.ads.wj
    public final void ei() {
        g3(8, sh());
    }

    @Override // com.google.android.gms.internal.ads.wj
    public final void wc(int i) {
        Parcel parcelSh = sh();
        parcelSh.writeInt(i);
        g3(7, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.wj
    public final void zG(lj ljVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, ljVar);
        g3(5, parcelSh);
    }
}
