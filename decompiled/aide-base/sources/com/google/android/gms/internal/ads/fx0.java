package com.google.android.gms.internal.ads;

import android.os.IInterface;

/* loaded from: classes.dex */
public interface fx0 extends IInterface {
    pw0 createAdLoaderBuilder(abcd.wu wuVar, String str, ka kaVar, int i);

    ld createAdOverlay(abcd.wu wuVar);

    uw0 createBannerAdManager(abcd.wu wuVar, zzwf zzwfVar, String str, ka kaVar, int i);

    vd createInAppPurchaseManager(abcd.wu wuVar);

    uw0 createInterstitialAdManager(abcd.wu wuVar, zzwf zzwfVar, String str, ka kaVar, int i);

    j2 createNativeAdViewDelegate(abcd.wu wuVar, abcd.wu wuVar2);

    o2 createNativeAdViewHolderDelegate(abcd.wu wuVar, abcd.wu wuVar2, abcd.wu wuVar3);

    qj createRewardedVideoAd(abcd.wu wuVar, ka kaVar, int i);

    qj createRewardedVideoAdSku(abcd.wu wuVar, int i);

    uw0 createSearchAdManager(abcd.wu wuVar, zzwf zzwfVar, String str, int i);

    mx0 getMobileAdsSettingsManager(abcd.wu wuVar);

    mx0 getMobileAdsSettingsManagerWithClientJarVersion(abcd.wu wuVar, int i);
}
