package com.google.android.gms.internal.ads;

import abcd.wu;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class fb extends zd0 implements cb {
    fb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final List DW() {
        Parcel parcelDx = dx(3, sh());
        ArrayList arrayListZo = be0.Zo(parcelDx);
        parcelDx.recycle();
        return arrayListZo;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final String FH() {
        Parcel parcelDx = dx(2, sh());
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final a2 Hw() {
        Parcel parcelDx = dx(12, sh());
        a2 a2VarMt = b2.Mt(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return a2VarMt;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final void I(abcd.wu wuVar, abcd.wu wuVar2, abcd.wu wuVar3) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        be0.FH(parcelSh, wuVar2);
        be0.FH(parcelSh, wuVar3);
        g3(21, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final boolean Qq() {
        Parcel parcelDx = dx(18, sh());
        boolean zV5 = be0.v5(parcelDx);
        parcelDx.recycle();
        return zV5;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final void Sf(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        g3(20, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final void VH() {
        g3(19, sh());
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final String Zo() {
        Parcel parcelDx = dx(6, sh());
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final double a8() {
        Parcel parcelDx = dx(8, sh());
        double d = parcelDx.readDouble();
        parcelDx.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final String aM() {
        Parcel parcelDx = dx(10, sh());
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final abcd.wu cb() {
        Parcel parcelDx = dx(13, sh());
        abcd.wu wuVarDx = wu.a.dx(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return wuVarDx;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final boolean cn() {
        Parcel parcelDx = dx(17, sh());
        boolean zV5 = be0.v5(parcelDx);
        parcelDx.recycle();
        return zV5;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final String er() {
        Parcel parcelDx = dx(7, sh());
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final yx0 getVideoController() {
        Parcel parcelDx = dx(11, sh());
        yx0 yx0VarMt = zx0.Mt(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return yx0VarMt;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final String gn() {
        Parcel parcelDx = dx(4, sh());
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final f2 j3() {
        Parcel parcelDx = dx(5, sh());
        f2 f2VarMt = g2.Mt(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return f2VarMt;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final abcd.wu ro() {
        Parcel parcelDx = dx(14, sh());
        abcd.wu wuVarDx = wu.a.dx(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return wuVarDx;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final Bundle tp() {
        Parcel parcelDx = dx(16, sh());
        Bundle bundle = (Bundle) be0.DW(parcelDx, Bundle.CREATOR);
        parcelDx.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final abcd.wu v5() {
        Parcel parcelDx = dx(15, sh());
        abcd.wu wuVarDx = wu.a.dx(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return wuVarDx;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final void x9(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        g3(22, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final String yS() {
        Parcel parcelDx = dx(9, sh());
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }
}
