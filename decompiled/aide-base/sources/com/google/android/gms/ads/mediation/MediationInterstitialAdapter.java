package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public interface MediationInterstitialAdapter extends b {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, d dVar, Bundle bundle, a aVar, Bundle bundle2);

    void showInterstitial();
}
