package com.google.android.gms.internal.ads;

import abcd.wu;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public final class pa extends zd0 implements na {
    pa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.na
    public final abcd.wu An() {
        Parcel parcelDx = dx(2, sh());
        abcd.wu wuVarDx = wu.a.dx(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return wuVarDx;
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void DP(zzwb zzwbVar, String str, String str2) {
        Parcel parcelSh = sh();
        be0.Hw(parcelSh, zzwbVar);
        parcelSh.writeString(str);
        parcelSh.writeString(str2);
        g3(20, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void Jy(zzwb zzwbVar, String str) {
        Parcel parcelSh = sh();
        be0.Hw(parcelSh, zzwbVar);
        parcelSh.writeString(str);
        g3(11, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void Mr() {
        g3(8, sh());
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void Oo(abcd.wu wuVar, zzwb zzwbVar, String str, qa qaVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        be0.Hw(parcelSh, zzwbVar);
        parcelSh.writeString(str);
        be0.FH(parcelSh, qaVar);
        g3(3, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void T6(abcd.wu wuVar, zzwb zzwbVar, String str, String str2, qa qaVar, zzacp zzacpVar, List<String> list) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        be0.Hw(parcelSh, zzwbVar);
        parcelSh.writeString(str);
        parcelSh.writeString(str2);
        be0.FH(parcelSh, qaVar);
        be0.Hw(parcelSh, zzacpVar);
        parcelSh.writeStringList(list);
        g3(14, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void Vw(abcd.wu wuVar, zzwb zzwbVar, String str, String str2, qa qaVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        be0.Hw(parcelSh, zzwbVar);
        parcelSh.writeString(str);
        parcelSh.writeString(str2);
        be0.FH(parcelSh, qaVar);
        g3(7, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void XL() {
        g3(9, sh());
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void aa(abcd.wu wuVar, sk skVar, List<String> list) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        be0.FH(parcelSh, skVar);
        parcelSh.writeStringList(list);
        g3(23, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void bI(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        g3(21, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void destroy() {
        g3(5, sh());
    }

    @Override // com.google.android.gms.internal.ads.na
    public final za e3() {
        za bbVar;
        Parcel parcelDx = dx(16, sh());
        IBinder strongBinder = parcelDx.readStrongBinder();
        if (strongBinder == null) {
            bbVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            bbVar = iInterfaceQueryLocalInterface instanceof za ? (za) iInterfaceQueryLocalInterface : new bb(strongBinder);
        }
        parcelDx.recycle();
        return bbVar;
    }

    @Override // com.google.android.gms.internal.ads.na
    public final Bundle getInterstitialAdapterInfo() {
        Parcel parcelDx = dx(18, sh());
        Bundle bundle = (Bundle) be0.DW(parcelDx, Bundle.CREATOR);
        parcelDx.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.na
    public final yx0 getVideoController() {
        Parcel parcelDx = dx(26, sh());
        yx0 yx0VarMt = zx0.Mt(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return yx0VarMt;
    }

    @Override // com.google.android.gms.internal.ads.na
    public final Bundle iW() {
        Parcel parcelDx = dx(19, sh());
        Bundle bundle = (Bundle) be0.DW(parcelDx, Bundle.CREATOR);
        parcelDx.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.na
    public final boolean isInitialized() {
        Parcel parcelDx = dx(13, sh());
        boolean zV5 = be0.v5(parcelDx);
        parcelDx.recycle();
        return zV5;
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void ix(abcd.wu wuVar, zzwf zzwfVar, zzwb zzwbVar, String str, qa qaVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        be0.Hw(parcelSh, zzwfVar);
        be0.Hw(parcelSh, zzwbVar);
        parcelSh.writeString(str);
        be0.FH(parcelSh, qaVar);
        g3(1, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.na
    public final b3 lJ() {
        Parcel parcelDx = dx(24, sh());
        b3 b3VarMt = c3.Mt(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return b3VarMt;
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void lz(abcd.wu wuVar, zzwb zzwbVar, String str, sk skVar, String str2) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        be0.Hw(parcelSh, zzwbVar);
        parcelSh.writeString(str);
        be0.FH(parcelSh, skVar);
        parcelSh.writeString(str2);
        g3(10, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.na
    public final cb m0() {
        cb fbVar;
        Parcel parcelDx = dx(27, sh());
        IBinder strongBinder = parcelDx.readStrongBinder();
        if (strongBinder == null) {
            fbVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            fbVar = iInterfaceQueryLocalInterface instanceof cb ? (cb) iInterfaceQueryLocalInterface : new fb(strongBinder);
        }
        parcelDx.recycle();
        return fbVar;
    }

    @Override // com.google.android.gms.internal.ads.na
    public final boolean mm() {
        Parcel parcelDx = dx(22, sh());
        boolean zV5 = be0.v5(parcelDx);
        parcelDx.recycle();
        return zV5;
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void sG(boolean z) {
        Parcel parcelSh = sh();
        be0.j6(parcelSh, z);
        g3(25, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.na
    public final wa sM() {
        wa yaVar;
        Parcel parcelDx = dx(15, sh());
        IBinder strongBinder = parcelDx.readStrongBinder();
        if (strongBinder == null) {
            yaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            yaVar = iInterfaceQueryLocalInterface instanceof wa ? (wa) iInterfaceQueryLocalInterface : new ya(strongBinder);
        }
        parcelDx.recycle();
        return yaVar;
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void showInterstitial() {
        g3(4, sh());
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void showVideo() {
        g3(12, sh());
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void uW(abcd.wu wuVar, zzwf zzwfVar, zzwb zzwbVar, String str, String str2, qa qaVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        be0.Hw(parcelSh, zzwfVar);
        be0.Hw(parcelSh, zzwbVar);
        parcelSh.writeString(str);
        parcelSh.writeString(str2);
        be0.FH(parcelSh, qaVar);
        g3(6, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.na
    public final Bundle zzuw() {
        Parcel parcelDx = dx(17, sh());
        Bundle bundle = (Bundle) be0.DW(parcelDx, Bundle.CREATOR);
        parcelDx.recycle();
        return bundle;
    }
}
