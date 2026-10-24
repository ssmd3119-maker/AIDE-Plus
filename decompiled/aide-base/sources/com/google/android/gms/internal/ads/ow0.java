package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ow0 extends zd0 implements mw0 {
    ow0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.mw0
    public final String Jl() {
        Parcel parcelDx = dx(4, sh());
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.mw0
    public final boolean cT() {
        Parcel parcelDx = dx(3, sh());
        boolean zV5 = be0.v5(parcelDx);
        parcelDx.recycle();
        return zV5;
    }

    @Override // com.google.android.gms.internal.ads.mw0
    public final void eT(zzwb zzwbVar, int i) {
        Parcel parcelSh = sh();
        be0.Hw(parcelSh, zzwbVar);
        parcelSh.writeInt(i);
        g3(5, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.mw0
    public final void p4(zzwb zzwbVar) {
        Parcel parcelSh = sh();
        be0.Hw(parcelSh, zzwbVar);
        g3(1, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.mw0
    public final String u7() {
        Parcel parcelDx = dx(2, sh());
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }
}
