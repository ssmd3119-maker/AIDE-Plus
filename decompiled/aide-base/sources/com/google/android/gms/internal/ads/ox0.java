package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ox0 extends zd0 implements mx0 {
    ox0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.mx0
    public final void AV(String str, abcd.wu wuVar) {
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        be0.FH(parcelSh, wuVar);
        g3(6, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.mx0
    public final void CA(String str) {
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        g3(3, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.mx0
    public final String Cp() {
        Parcel parcelDx = dx(9, sh());
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.mx0
    public final float F0() {
        Parcel parcelDx = dx(7, sh());
        float f = parcelDx.readFloat();
        parcelDx.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.mx0
    public final void KC(float f) {
        Parcel parcelSh = sh();
        parcelSh.writeFloat(f);
        g3(2, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.mx0
    public final void PH(abcd.wu wuVar, String str) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        parcelSh.writeString(str);
        g3(5, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.mx0
    public final void a5() {
        g3(1, sh());
    }

    @Override // com.google.android.gms.internal.ads.mx0
    public final void ep(String str) {
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        g3(10, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.mx0
    public final void gk(ka kaVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, kaVar);
        g3(11, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.mx0
    public final void jH(boolean z) {
        Parcel parcelSh = sh();
        be0.j6(parcelSh, z);
        g3(4, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.mx0
    public final boolean uF() {
        Parcel parcelDx = dx(8, sh());
        boolean zV5 = be0.v5(parcelDx);
        parcelDx.recycle();
        return zV5;
    }
}
