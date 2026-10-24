package com.google.ads.mediation.customevent;

import abcd.iu;
import abcd.ku;
import android.app.Activity;
import android.view.View;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.d;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.xp;

@KeepName
/* loaded from: classes.dex */
public final class CustomEventAdapter implements MediationBannerAdapter<com.google.android.gms.ads.mediation.customevent.c, c>, MediationInterstitialAdapter<com.google.android.gms.ads.mediation.customevent.c, c> {
    private CustomEventBanner DW;
    private CustomEventInterstitial FH;
    private View j6;

    static final class a implements com.google.ads.mediation.customevent.a {
        public a(CustomEventAdapter customEventAdapter, com.google.ads.mediation.c cVar) {
        }
    }

    class b implements com.google.ads.mediation.customevent.b {
        public b(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, d dVar) {
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

    @Override // com.google.ads.mediation.MediationBannerAdapter, com.google.ads.mediation.b
    public final void destroy() {
        CustomEventBanner customEventBanner = this.DW;
        if (customEventBanner != null) {
            customEventBanner.destroy();
        }
        CustomEventInterstitial customEventInterstitial = this.FH;
        if (customEventInterstitial != null) {
            customEventInterstitial.destroy();
        }
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter, com.google.ads.mediation.b
    public final Class<com.google.android.gms.ads.mediation.customevent.c> getAdditionalParametersType() {
        return com.google.android.gms.ads.mediation.customevent.c.class;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    public final View getBannerView() {
        return this.j6;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter, com.google.ads.mediation.b
    public final Class<c> getServerParametersType() {
        return c.class;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    public final void requestBannerAd(com.google.ads.mediation.c cVar, Activity activity, c cVar2, ku kuVar, com.google.ads.mediation.a aVar, com.google.android.gms.ads.mediation.customevent.c cVar3) {
        CustomEventBanner customEventBanner = (CustomEventBanner) j6(cVar2.DW);
        this.DW = customEventBanner;
        if (customEventBanner == null) {
            cVar.j6(this, iu.INTERNAL_ERROR);
        } else {
            this.DW.requestBannerAd(new a(this, cVar), activity, cVar2.j6, cVar2.FH, kuVar, aVar, cVar3 == null ? null : cVar3.j6(cVar2.j6));
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(d dVar, Activity activity, c cVar, com.google.ads.mediation.a aVar, com.google.android.gms.ads.mediation.customevent.c cVar2) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) j6(cVar.DW);
        this.FH = customEventInterstitial;
        if (customEventInterstitial == null) {
            dVar.DW(this, iu.INTERNAL_ERROR);
        } else {
            this.FH.requestInterstitialAd(new b(this, this, dVar), activity, cVar.j6, cVar.FH, aVar, cVar2 == null ? null : cVar2.j6(cVar.j6));
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        this.FH.showInterstitial();
    }
}
