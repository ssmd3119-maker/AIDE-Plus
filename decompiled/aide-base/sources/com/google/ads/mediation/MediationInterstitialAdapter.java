package com.google.ads.mediation;

import android.app.Activity;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;

@Deprecated
/* loaded from: classes.dex */
public interface MediationInterstitialAdapter<ADDITIONAL_PARAMETERS extends f, SERVER_PARAMETERS extends e> extends b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    @Override // com.google.ads.mediation.b
    /* synthetic */ void destroy();

    @Override // com.google.ads.mediation.b
    /* synthetic */ Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    @Override // com.google.ads.mediation.b
    /* synthetic */ Class<SERVER_PARAMETERS> getServerParametersType();

    void requestInterstitialAd(d dVar, Activity activity, SERVER_PARAMETERS server_parameters, a aVar, ADDITIONAL_PARAMETERS additional_parameters);

    void showInterstitial();
}
