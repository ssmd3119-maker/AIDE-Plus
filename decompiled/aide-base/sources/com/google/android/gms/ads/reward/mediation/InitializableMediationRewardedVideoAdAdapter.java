package com.google.android.gms.ads.reward.mediation;

import android.content.Context;
import android.os.Bundle;
import java.util.List;

/* loaded from: classes.dex */
public interface InitializableMediationRewardedVideoAdAdapter extends MediationRewardedVideoAdAdapter {
    void initialize(Context context, a aVar, List<Bundle> list);

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter, com.google.android.gms.internal.ads.zzbiy, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    /* synthetic */ void onDestroy();

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter, com.google.android.gms.internal.ads.zzbiy, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    /* synthetic */ void onPause();

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter, com.google.android.gms.internal.ads.zzbiy, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    /* synthetic */ void onResume();
}
