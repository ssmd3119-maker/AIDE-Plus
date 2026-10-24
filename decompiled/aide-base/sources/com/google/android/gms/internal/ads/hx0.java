package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class hx0 extends zd0 implements fx0 {
    hx0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.fx0
    public final pw0 createAdLoaderBuilder(abcd.wu wuVar, String str, ka kaVar, int i) {
        pw0 rw0Var;
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        parcelSh.writeString(str);
        be0.FH(parcelSh, kaVar);
        parcelSh.writeInt(i);
        Parcel parcelDx = dx(3, parcelSh);
        IBinder strongBinder = parcelDx.readStrongBinder();
        if (strongBinder == null) {
            rw0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            rw0Var = iInterfaceQueryLocalInterface instanceof pw0 ? (pw0) iInterfaceQueryLocalInterface : new rw0(strongBinder);
        }
        parcelDx.recycle();
        return rw0Var;
    }

    @Override // com.google.android.gms.internal.ads.fx0
    public final ld createAdOverlay(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        Parcel parcelDx = dx(8, parcelSh);
        ld ldVarMt = md.Mt(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return ldVarMt;
    }

    @Override // com.google.android.gms.internal.ads.fx0
    public final uw0 createBannerAdManager(abcd.wu wuVar, zzwf zzwfVar, String str, ka kaVar, int i) {
        uw0 ww0Var;
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        be0.Hw(parcelSh, zzwfVar);
        parcelSh.writeString(str);
        be0.FH(parcelSh, kaVar);
        parcelSh.writeInt(i);
        Parcel parcelDx = dx(1, parcelSh);
        IBinder strongBinder = parcelDx.readStrongBinder();
        if (strongBinder == null) {
            ww0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            ww0Var = iInterfaceQueryLocalInterface instanceof uw0 ? (uw0) iInterfaceQueryLocalInterface : new ww0(strongBinder);
        }
        parcelDx.recycle();
        return ww0Var;
    }

    @Override // com.google.android.gms.internal.ads.fx0
    public final vd createInAppPurchaseManager(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        Parcel parcelDx = dx(7, parcelSh);
        vd vdVarMt = xd.Mt(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return vdVarMt;
    }

    @Override // com.google.android.gms.internal.ads.fx0
    public final uw0 createInterstitialAdManager(abcd.wu wuVar, zzwf zzwfVar, String str, ka kaVar, int i) {
        uw0 ww0Var;
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        be0.Hw(parcelSh, zzwfVar);
        parcelSh.writeString(str);
        be0.FH(parcelSh, kaVar);
        parcelSh.writeInt(i);
        Parcel parcelDx = dx(2, parcelSh);
        IBinder strongBinder = parcelDx.readStrongBinder();
        if (strongBinder == null) {
            ww0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            ww0Var = iInterfaceQueryLocalInterface instanceof uw0 ? (uw0) iInterfaceQueryLocalInterface : new ww0(strongBinder);
        }
        parcelDx.recycle();
        return ww0Var;
    }

    @Override // com.google.android.gms.internal.ads.fx0
    public final j2 createNativeAdViewDelegate(abcd.wu wuVar, abcd.wu wuVar2) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        be0.FH(parcelSh, wuVar2);
        Parcel parcelDx = dx(5, parcelSh);
        j2 j2VarMt = k2.Mt(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return j2VarMt;
    }

    @Override // com.google.android.gms.internal.ads.fx0
    public final o2 createNativeAdViewHolderDelegate(abcd.wu wuVar, abcd.wu wuVar2, abcd.wu wuVar3) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        be0.FH(parcelSh, wuVar2);
        be0.FH(parcelSh, wuVar3);
        Parcel parcelDx = dx(11, parcelSh);
        o2 o2VarMt = p2.Mt(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return o2VarMt;
    }

    @Override // com.google.android.gms.internal.ads.fx0
    public final qj createRewardedVideoAd(abcd.wu wuVar, ka kaVar, int i) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        be0.FH(parcelSh, kaVar);
        parcelSh.writeInt(i);
        Parcel parcelDx = dx(6, parcelSh);
        qj qjVarMt = rj.Mt(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return qjVarMt;
    }

    @Override // com.google.android.gms.internal.ads.fx0
    public final qj createRewardedVideoAdSku(abcd.wu wuVar, int i) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        parcelSh.writeInt(i);
        Parcel parcelDx = dx(12, parcelSh);
        qj qjVarMt = rj.Mt(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return qjVarMt;
    }

    @Override // com.google.android.gms.internal.ads.fx0
    public final uw0 createSearchAdManager(abcd.wu wuVar, zzwf zzwfVar, String str, int i) {
        uw0 ww0Var;
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        be0.Hw(parcelSh, zzwfVar);
        parcelSh.writeString(str);
        parcelSh.writeInt(i);
        Parcel parcelDx = dx(10, parcelSh);
        IBinder strongBinder = parcelDx.readStrongBinder();
        if (strongBinder == null) {
            ww0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            ww0Var = iInterfaceQueryLocalInterface instanceof uw0 ? (uw0) iInterfaceQueryLocalInterface : new ww0(strongBinder);
        }
        parcelDx.recycle();
        return ww0Var;
    }

    @Override // com.google.android.gms.internal.ads.fx0
    public final mx0 getMobileAdsSettingsManager(abcd.wu wuVar) {
        mx0 ox0Var;
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        Parcel parcelDx = dx(4, parcelSh);
        IBinder strongBinder = parcelDx.readStrongBinder();
        if (strongBinder == null) {
            ox0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            ox0Var = iInterfaceQueryLocalInterface instanceof mx0 ? (mx0) iInterfaceQueryLocalInterface : new ox0(strongBinder);
        }
        parcelDx.recycle();
        return ox0Var;
    }

    @Override // com.google.android.gms.internal.ads.fx0
    public final mx0 getMobileAdsSettingsManagerWithClientJarVersion(abcd.wu wuVar, int i) {
        mx0 ox0Var;
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        parcelSh.writeInt(i);
        Parcel parcelDx = dx(9, parcelSh);
        IBinder strongBinder = parcelDx.readStrongBinder();
        if (strongBinder == null) {
            ox0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            ox0Var = iInterfaceQueryLocalInterface instanceof mx0 ? (mx0) iInterfaceQueryLocalInterface : new ox0(strongBinder);
        }
        parcelDx.recycle();
        return ox0Var;
    }
}
