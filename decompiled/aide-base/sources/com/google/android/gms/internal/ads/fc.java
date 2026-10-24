package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class fc extends zd0 implements dc {
    fc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.dc
    public final zzans QO() {
        Parcel parcelDx = dx(2, sh());
        zzans zzansVar = (zzans) be0.DW(parcelDx, zzans.CREATOR);
        parcelDx.recycle();
        return zzansVar;
    }

    @Override // com.google.android.gms.internal.ads.dc
    public final zzans ZU() {
        Parcel parcelDx = dx(3, sh());
        zzans zzansVar = (zzans) be0.DW(parcelDx, zzans.CREATOR);
        parcelDx.recycle();
        return zzansVar;
    }

    @Override // com.google.android.gms.internal.ads.dc
    public final void fD(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        g3(10, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.dc
    public final yx0 getVideoController() {
        Parcel parcelDx = dx(5, sh());
        yx0 yx0VarMt = zx0.Mt(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return yx0VarMt;
    }

    @Override // com.google.android.gms.internal.ads.dc
    public final void hl(String str, String str2, Bundle bundle, abcd.wu wuVar, bc bcVar, qa qaVar) {
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        parcelSh.writeString(str2);
        be0.Hw(parcelSh, bundle);
        be0.FH(parcelSh, wuVar);
        be0.FH(parcelSh, bcVar);
        be0.FH(parcelSh, qaVar);
        g3(8, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.dc
    public final void i9(String str, String str2, Bundle bundle, abcd.wu wuVar, zb zbVar, qa qaVar) {
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        parcelSh.writeString(str2);
        be0.Hw(parcelSh, bundle);
        be0.FH(parcelSh, wuVar);
        be0.FH(parcelSh, zbVar);
        be0.FH(parcelSh, qaVar);
        g3(12, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.dc
    public final void iU(String[] strArr, Bundle[] bundleArr) {
        Parcel parcelSh = sh();
        parcelSh.writeStringArray(strArr);
        parcelSh.writeTypedArray(bundleArr, 0);
        g3(11, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.dc
    public final void pl(abcd.wu wuVar, String str, Bundle bundle, Bundle bundle2, zzwf zzwfVar, gc gcVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        parcelSh.writeString(str);
        be0.Hw(parcelSh, bundle);
        be0.Hw(parcelSh, bundle2);
        be0.Hw(parcelSh, zzwfVar);
        be0.FH(parcelSh, gcVar);
        g3(1, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.dc
    public final void qh(String str, String str2, Bundle bundle, abcd.wu wuVar, xb xbVar, qa qaVar) {
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        parcelSh.writeString(str2);
        be0.Hw(parcelSh, bundle);
        be0.FH(parcelSh, wuVar);
        be0.FH(parcelSh, xbVar);
        be0.FH(parcelSh, qaVar);
        g3(6, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.dc
    public final void sN(String str, String str2, Bundle bundle, abcd.wu wuVar, ub ubVar, qa qaVar, zzwf zzwfVar) {
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        parcelSh.writeString(str2);
        be0.Hw(parcelSh, bundle);
        be0.FH(parcelSh, wuVar);
        be0.FH(parcelSh, ubVar);
        be0.FH(parcelSh, qaVar);
        be0.Hw(parcelSh, zzwfVar);
        g3(4, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.dc
    public final void showInterstitial() {
        g3(7, sh());
    }

    @Override // com.google.android.gms.internal.ads.dc
    public final void tS() {
        g3(9, sh());
    }
}
