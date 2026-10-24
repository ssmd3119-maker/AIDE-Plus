package com.google.android.gms.internal.ads;

import abcd.wu;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ww0 extends zd0 implements uw0 {
    ww0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final zzwf I8() {
        Parcel parcelDx = dx(12, sh());
        zzwf zzwfVar = (zzwf) be0.DW(parcelDx, zzwf.CREATOR);
        parcelDx.recycle();
        return zzwfVar;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final jw0 JP() {
        jw0 lw0Var;
        Parcel parcelDx = dx(33, sh());
        IBinder strongBinder = parcelDx.readStrongBinder();
        if (strongBinder == null) {
            lw0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            lw0Var = iInterfaceQueryLocalInterface instanceof jw0 ? (jw0) iInterfaceQueryLocalInterface : new lw0(strongBinder);
        }
        parcelDx.recycle();
        return lw0Var;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void JX(fw0 fw0Var) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, fw0Var);
        g3(20, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final String Jl() {
        Parcel parcelDx = dx(35, sh());
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final boolean KD() {
        Parcel parcelDx = dx(3, sh());
        boolean zV5 = be0.v5(parcelDx);
        parcelDx.recycle();
        return zV5;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void Mr() {
        g3(5, sh());
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final String Nh() {
        Parcel parcelDx = dx(31, sh());
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void OM() {
        g3(11, sh());
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final abcd.wu Tv() {
        Parcel parcelDx = dx(1, sh());
        abcd.wu wuVarDx = wu.a.dx(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return wuVarDx;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void XL() {
        g3(6, sh());
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final Bundle XX() {
        Parcel parcelDx = dx(37, sh());
        Bundle bundle = (Bundle) be0.DW(parcelDx, Bundle.CREATOR);
        parcelDx.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void Xa(String str) {
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        g3(25, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void Zz(zzzw zzzwVar) {
        Parcel parcelSh = sh();
        be0.Hw(parcelSh, zzzwVar);
        g3(29, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void br(wj wjVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wjVar);
        g3(24, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final boolean cT() {
        Parcel parcelDx = dx(23, sh());
        boolean zV5 = be0.v5(parcelDx);
        parcelDx.recycle();
        return zV5;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void cX(sd sdVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, sdVar);
        g3(14, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void destroy() {
        g3(2, sh());
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void dz(zzwf zzwfVar) {
        Parcel parcelSh = sh();
        be0.Hw(parcelSh, zzwfVar);
        g3(13, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void ek(ix0 ix0Var) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, ix0Var);
        g3(21, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void ew(String str) {
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        g3(38, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final yx0 getVideoController() {
        yx0 ay0Var;
        Parcel parcelDx = dx(26, sh());
        IBinder strongBinder = parcelDx.readStrongBinder();
        if (strongBinder == null) {
            ay0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            ay0Var = iInterfaceQueryLocalInterface instanceof yx0 ? (yx0) iInterfaceQueryLocalInterface : new ay0(strongBinder);
        }
        parcelDx.recycle();
        return ay0Var;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void ir(boolean z) {
        Parcel parcelSh = sh();
        be0.j6(parcelSh, z);
        g3(22, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void lR(cx0 cx0Var) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, cx0Var);
        g3(8, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final cx0 oR() {
        cx0 ex0Var;
        Parcel parcelDx = dx(32, sh());
        IBinder strongBinder = parcelDx.readStrongBinder();
        if (strongBinder == null) {
            ex0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            ex0Var = iInterfaceQueryLocalInterface instanceof cx0 ? (cx0) iInterfaceQueryLocalInterface : new ex0(strongBinder);
        }
        parcelDx.recycle();
        return ex0Var;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final boolean p8(zzwb zzwbVar) {
        Parcel parcelSh = sh();
        be0.Hw(parcelSh, zzwbVar);
        Parcel parcelDx = dx(4, parcelSh);
        boolean zV5 = be0.v5(parcelDx);
        parcelDx.recycle();
        return zV5;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void rB(j0 j0Var) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, j0Var);
        g3(19, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void sG(boolean z) {
        Parcel parcelSh = sh();
        be0.j6(parcelSh, z);
        g3(34, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void showInterstitial() {
        g3(9, sh());
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void stopLoading() {
        g3(10, sh());
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void tD(zd zdVar, String str) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, zdVar);
        parcelSh.writeString(str);
        g3(15, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final String u7() {
        Parcel parcelDx = dx(18, sh());
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void uy(zzyv zzyvVar) {
        Parcel parcelSh = sh();
        be0.Hw(parcelSh, zzyvVar);
        g3(30, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void xt(jw0 jw0Var) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, jw0Var);
        g3(7, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void ye(zw0 zw0Var) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, zw0Var);
        g3(36, parcelSh);
    }
}
