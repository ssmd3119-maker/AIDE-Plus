package com.google.ads.mediation;

import com.google.ads.mediation.e;

@Deprecated
/* loaded from: classes.dex */
public interface b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS extends e> {
    void destroy();

    Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    Class<SERVER_PARAMETERS> getServerParametersType();
}
