package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public interface CustomEventBanner extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, b bVar, String str, com.google.android.gms.ads.d dVar, com.google.android.gms.ads.mediation.a aVar, Bundle bundle);
}
