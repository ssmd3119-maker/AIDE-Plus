package com.google.android.gms.internal.ads;

import abcd.wu;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c4 extends zd0 implements a4 {
    c4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final void DV(ux0 ux0Var) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, ux0Var);
        g3(25, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.a4, com.google.android.gms.internal.ads.k1
    public final List DW() {
        Parcel parcelDx = dx(3, sh());
        ArrayList arrayListZo = be0.Zo(parcelDx);
        parcelDx.recycle();
        return arrayListZo;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final String FH() {
        Parcel parcelDx = dx(2, sh());
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final a2 Hw() {
        a2 c2Var;
        Parcel parcelDx = dx(14, sh());
        IBinder strongBinder = parcelDx.readStrongBinder();
        if (strongBinder == null) {
            c2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            c2Var = iInterfaceQueryLocalInterface instanceof a2 ? (a2) iInterfaceQueryLocalInterface : new c2(strongBinder);
        }
        parcelDx.recycle();
        return c2Var;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final void Pa() {
        g3(28, sh());
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final void Q6() {
        g3(27, sh());
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final abcd.wu QX() {
        Parcel parcelDx = dx(18, sh());
        abcd.wu wuVarDx = wu.a.dx(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return wuVarDx;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final void Ws(Bundle bundle) {
        Parcel parcelSh = sh();
        be0.Hw(parcelSh, bundle);
        g3(15, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final void XG() {
        g3(22, sh());
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final void Yt(rx0 rx0Var) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, rx0Var);
        g3(26, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final String Zo() {
        Parcel parcelDx = dx(6, sh());
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final double a8() {
        Parcel parcelDx = dx(8, sh());
        double d = parcelDx.readDouble();
        parcelDx.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final String aM() {
        Parcel parcelDx = dx(10, sh());
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final void destroy() {
        g3(13, sh());
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final String er() {
        Parcel parcelDx = dx(7, sh());
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final boolean fr() {
        Parcel parcelDx = dx(24, sh());
        boolean zV5 = be0.v5(parcelDx);
        parcelDx.recycle();
        return zV5;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final yx0 getVideoController() {
        Parcel parcelDx = dx(11, sh());
        yx0 yx0VarMt = zx0.Mt(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return yx0VarMt;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final String gn() {
        Parcel parcelDx = dx(4, sh());
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final f2 j3() {
        f2 h2Var;
        Parcel parcelDx = dx(5, sh());
        IBinder strongBinder = parcelDx.readStrongBinder();
        if (strongBinder == null) {
            h2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            h2Var = iInterfaceQueryLocalInterface instanceof f2 ? (f2) iInterfaceQueryLocalInterface : new h2(strongBinder);
        }
        parcelDx.recycle();
        return h2Var;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final List kD() {
        Parcel parcelDx = dx(23, sh());
        ArrayList arrayListZo = be0.Zo(parcelDx);
        parcelDx.recycle();
        return arrayListZo;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final boolean lg(Bundle bundle) {
        Parcel parcelSh = sh();
        be0.Hw(parcelSh, bundle);
        Parcel parcelDx = dx(16, parcelSh);
        boolean zV5 = be0.v5(parcelDx);
        parcelDx.recycle();
        return zV5;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final void rN(Bundle bundle) {
        Parcel parcelSh = sh();
        be0.Hw(parcelSh, bundle);
        g3(17, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final void sE(y3 y3Var) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, y3Var);
        g3(21, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final Bundle tp() {
        Parcel parcelDx = dx(20, sh());
        Bundle bundle = (Bundle) be0.DW(parcelDx, Bundle.CREATOR);
        parcelDx.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final String u7() {
        Parcel parcelDx = dx(12, sh());
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final abcd.wu v5() {
        Parcel parcelDx = dx(19, sh());
        abcd.wu wuVarDx = wu.a.dx(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return wuVarDx;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final String yS() {
        Parcel parcelDx = dx(9, sh());
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }
}
