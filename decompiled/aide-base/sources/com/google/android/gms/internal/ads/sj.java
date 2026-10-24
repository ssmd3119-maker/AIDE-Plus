package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class sj extends zd0 implements qj {
    sj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void Bz() {
        g3(2, sh());
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void C(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        g3(9, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void HV(oj ojVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, ojVar);
        g3(16, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void Mr() {
        g3(6, sh());
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void NF(String str) {
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        g3(19, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void XL() {
        g3(7, sh());
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final Bundle XX() {
        Parcel parcelDx = dx(15, sh());
        Bundle bundle = (Bundle) be0.DW(parcelDx, Bundle.CREATOR);
        parcelDx.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void Xa(String str) {
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        g3(13, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void YM(zzavh zzavhVar) {
        Parcel parcelSh = sh();
        be0.Hw(parcelSh, zzavhVar);
        g3(1, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void b(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        g3(10, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void br(wj wjVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wjVar);
        g3(3, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void destroy() {
        g3(8, sh());
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void e7(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        g3(11, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final boolean kJ() {
        Parcel parcelDx = dx(5, sh());
        boolean zV5 = be0.v5(parcelDx);
        parcelDx.recycle();
        return zV5;
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void o4(String str) {
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        g3(17, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void sG(boolean z) {
        Parcel parcelSh = sh();
        be0.j6(parcelSh, z);
        g3(34, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final String u7() {
        Parcel parcelDx = dx(12, sh());
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void wV(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        g3(18, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void ye(zw0 zw0Var) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, zw0Var);
        g3(14, parcelSh);
    }
}
