package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.i;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.xp;

@KeepName
/* loaded from: classes.dex */
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    private CustomEventBanner DW;
    private CustomEventInterstitial FH;
    private CustomEventNative Hw;
    private View j6;

    static final class a implements com.google.android.gms.ads.mediation.customevent.b {
        public a(CustomEventAdapter customEventAdapter, com.google.android.gms.ads.mediation.c cVar) {
        }
    }

    class b implements d {
        public b(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, com.google.android.gms.ads.mediation.d dVar) {
        }
    }

    static class c implements e {
        public c(CustomEventAdapter customEventAdapter, com.google.android.gms.ads.mediation.e eVar) {
        }
    }

    private static <T> T j6(String str) {
        try {
            return (T) Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            xp.u7(sb.toString());
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public final View getBannerView() {
        return this.j6;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, com.google.android.gms.ads.mediation.b, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter, com.google.android.gms.internal.ads.zzbiy, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void onDestroy() {
        CustomEventBanner customEventBanner = this.DW;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.FH;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.Hw;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, com.google.android.gms.ads.mediation.b, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter, com.google.android.gms.internal.ads.zzbiy, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void onPause() {
        CustomEventBanner customEventBanner = this.DW;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.FH;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.Hw;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, com.google.android.gms.ads.mediation.b, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter, com.google.android.gms.internal.ads.zzbiy, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void onResume() {
        CustomEventBanner customEventBanner = this.DW;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.FH;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.Hw;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public final void requestBannerAd(Context context, com.google.android.gms.ads.mediation.c cVar, Bundle bundle, com.google.android.gms.ads.d dVar, com.google.android.gms.ads.mediation.a aVar, Bundle bundle2) {
        CustomEventBanner customEventBanner = (CustomEventBanner) j6(bundle.getString("class_name"));
        this.DW = customEventBanner;
        if (customEventBanner == null) {
            cVar.lg(this, 0);
        } else {
            this.DW.requestBannerAd(context, new a(this, cVar), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), dVar, aVar, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, com.google.android.gms.ads.mediation.d dVar, Bundle bundle, com.google.android.gms.ads.mediation.a aVar, Bundle bundle2) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) j6(bundle.getString("class_name"));
        this.FH = customEventInterstitial;
        if (customEventInterstitial == null) {
            dVar.Hw(this, 0);
        } else {
            this.FH.requestInterstitialAd(context, new b(this, this, dVar), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), aVar, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void requestNativeAd(Context context, com.google.android.gms.ads.mediation.e eVar, Bundle bundle, i iVar, Bundle bundle2) {
        CustomEventNative customEventNative = (CustomEventNative) j6(bundle.getString("class_name"));
        this.Hw = customEventNative;
        if (customEventNative == null) {
            eVar.gn(this, 0);
        } else {
            this.Hw.requestNativeAd(context, new c(this, eVar), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), iVar, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        this.FH.showInterstitial();
    }
}
