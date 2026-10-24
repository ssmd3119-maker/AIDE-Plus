package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class vk extends zd0 implements sk {
    vk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void K3(abcd.wu wuVar, int i) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        parcelSh.writeInt(i);
        g3(9, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void N0(abcd.wu wuVar, int i) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        parcelSh.writeInt(i);
        g3(2, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void N2(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        g3(5, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void QM(abcd.wu wuVar, zzawd zzawdVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        be0.Hw(parcelSh, zzawdVar);
        g3(7, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void Qk(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        g3(10, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void Rd(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        g3(4, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void Tc(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        g3(11, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void ef(Bundle bundle) {
        Parcel parcelSh = sh();
        be0.Hw(parcelSh, bundle);
        g3(12, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void kM(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        g3(3, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void l2(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        g3(8, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void qY(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        g3(1, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void u9(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        g3(6, parcelSh);
    }
}
