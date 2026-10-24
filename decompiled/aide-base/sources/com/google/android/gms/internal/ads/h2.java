package com.google.android.gms.internal.ads;

import abcd.wu;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class h2 extends zd0 implements f2 {
    h2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.f2
    public final Uri Jm() {
        Parcel parcelDx = dx(2, sh());
        Uri uri = (Uri) be0.DW(parcelDx, Uri.CREATOR);
        parcelDx.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.f2
    public final abcd.wu K0() {
        Parcel parcelDx = dx(1, sh());
        abcd.wu wuVarDx = wu.a.dx(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return wuVarDx;
    }

    @Override // com.google.android.gms.internal.ads.f2
    public final double PA() {
        Parcel parcelDx = dx(3, sh());
        double d = parcelDx.readDouble();
        parcelDx.recycle();
        return d;
    }
}
