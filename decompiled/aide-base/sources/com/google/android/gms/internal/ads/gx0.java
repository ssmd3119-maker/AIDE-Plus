package com.google.android.gms.internal.ads;

import abcd.wu;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.probelytics.api.UserTouchAction;

/* loaded from: classes.dex */
public abstract class gx0 extends ae0 implements fx0 {
    public gx0() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    public static fx0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
        return iInterfaceQueryLocalInterface instanceof fx0 ? (fx0) iInterfaceQueryLocalInterface : new hx0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae0
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                uw0 uw0VarCreateBannerAdManager = createBannerAdManager(wu.a.dx(parcel.readStrongBinder()), (zzwf) be0.DW(parcel, zzwf.CREATOR), parcel.readString(), la.Mt(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                be0.FH(parcel2, uw0VarCreateBannerAdManager);
                return true;
            case 2:
                uw0 uw0VarCreateInterstitialAdManager = createInterstitialAdManager(wu.a.dx(parcel.readStrongBinder()), (zzwf) be0.DW(parcel, zzwf.CREATOR), parcel.readString(), la.Mt(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                be0.FH(parcel2, uw0VarCreateInterstitialAdManager);
                return true;
            case 3:
                pw0 pw0VarCreateAdLoaderBuilder = createAdLoaderBuilder(wu.a.dx(parcel.readStrongBinder()), parcel.readString(), la.Mt(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                be0.FH(parcel2, pw0VarCreateAdLoaderBuilder);
                return true;
            case 4:
                mx0 mobileAdsSettingsManager = getMobileAdsSettingsManager(wu.a.dx(parcel.readStrongBinder()));
                parcel2.writeNoException();
                be0.FH(parcel2, mobileAdsSettingsManager);
                return true;
            case 5:
                j2 j2VarCreateNativeAdViewDelegate = createNativeAdViewDelegate(wu.a.dx(parcel.readStrongBinder()), wu.a.dx(parcel.readStrongBinder()));
                parcel2.writeNoException();
                be0.FH(parcel2, j2VarCreateNativeAdViewDelegate);
                return true;
            case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                qj qjVarCreateRewardedVideoAd = createRewardedVideoAd(wu.a.dx(parcel.readStrongBinder()), la.Mt(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                be0.FH(parcel2, qjVarCreateRewardedVideoAd);
                return true;
            case UserTouchAction.CLICK_KIND /* 7 */:
                vd vdVarCreateInAppPurchaseManager = createInAppPurchaseManager(wu.a.dx(parcel.readStrongBinder()));
                parcel2.writeNoException();
                be0.FH(parcel2, vdVarCreateInAppPurchaseManager);
                return true;
            case 8:
                ld ldVarCreateAdOverlay = createAdOverlay(wu.a.dx(parcel.readStrongBinder()));
                parcel2.writeNoException();
                be0.FH(parcel2, ldVarCreateAdOverlay);
                return true;
            case 9:
                mx0 mobileAdsSettingsManagerWithClientJarVersion = getMobileAdsSettingsManagerWithClientJarVersion(wu.a.dx(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                be0.FH(parcel2, mobileAdsSettingsManagerWithClientJarVersion);
                return true;
            case 10:
                uw0 uw0VarCreateSearchAdManager = createSearchAdManager(wu.a.dx(parcel.readStrongBinder()), (zzwf) be0.DW(parcel, zzwf.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                be0.FH(parcel2, uw0VarCreateSearchAdManager);
                return true;
            case 11:
                o2 o2VarCreateNativeAdViewHolderDelegate = createNativeAdViewHolderDelegate(wu.a.dx(parcel.readStrongBinder()), wu.a.dx(parcel.readStrongBinder()), wu.a.dx(parcel.readStrongBinder()));
                parcel2.writeNoException();
                be0.FH(parcel2, o2VarCreateNativeAdViewHolderDelegate);
                return true;
            case 12:
                qj qjVarCreateRewardedVideoAdSku = createRewardedVideoAdSku(wu.a.dx(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                be0.FH(parcel2, qjVarCreateRewardedVideoAdSku);
                return true;
            default:
                return false;
        }
    }
}
