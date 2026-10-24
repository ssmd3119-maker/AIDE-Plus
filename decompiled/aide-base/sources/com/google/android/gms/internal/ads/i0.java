package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class i0 extends zd0 implements g0 {
    i0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final String Sq() {
        Parcel parcelDx = dx(1, sh());
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void VH() {
        g3(5, sh());
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final String getContent() {
        Parcel parcelDx = dx(2, sh());
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void oC() {
        g3(4, sh());
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void rC(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        g3(3, parcelSh);
    }
}
