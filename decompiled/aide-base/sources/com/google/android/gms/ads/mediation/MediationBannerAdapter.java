package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* loaded from: classes.dex */
public interface MediationBannerAdapter extends b {
    View getBannerView();

    @Override // com.google.android.gms.ads.mediation.b, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter, com.google.android.gms.internal.ads.zzbiy, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    /* synthetic */ void onDestroy();

    @Override // com.google.android.gms.ads.mediation.b, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter, com.google.android.gms.internal.ads.zzbiy, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    /* synthetic */ void onPause();

    @Override // com.google.android.gms.ads.mediation.b, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter, com.google.android.gms.internal.ads.zzbiy, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    /* synthetic */ void onResume();

    void requestBannerAd(Context context, c cVar, Bundle bundle, com.google.android.gms.ads.d dVar, a aVar, Bundle bundle2);
}
