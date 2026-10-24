package com.google.ads.mediation;

import abcd.ku;
import android.app.Activity;
import android.view.View;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;

@Deprecated
/* loaded from: classes.dex */
public interface MediationBannerAdapter<ADDITIONAL_PARAMETERS extends f, SERVER_PARAMETERS extends e> extends b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    @Override // com.google.ads.mediation.b
    /* synthetic */ void destroy();

    @Override // com.google.ads.mediation.b
    /* synthetic */ Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    View getBannerView();

    @Override // com.google.ads.mediation.b
    /* synthetic */ Class<SERVER_PARAMETERS> getServerParametersType();

    void requestBannerAd(c cVar, Activity activity, SERVER_PARAMETERS server_parameters, ku kuVar, a aVar, ADDITIONAL_PARAMETERS additional_parameters);
}
