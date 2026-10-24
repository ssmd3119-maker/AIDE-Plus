package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public interface CustomEventInterstitial extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, d dVar, String str, com.google.android.gms.ads.mediation.a aVar, Bundle bundle);

    void showInterstitial();
}
