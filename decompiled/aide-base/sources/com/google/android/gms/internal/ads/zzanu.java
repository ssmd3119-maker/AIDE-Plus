package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;

@jg
/* loaded from: classes.dex */
public final class zzanu implements MediationInterstitialAdapter {
    private com.google.android.gms.ads.mediation.d DW;
    private Uri FH;
    private Activity j6;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void onDestroy() {
        xp.VH("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void onPause() {
        xp.VH("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void onResume() {
        xp.VH("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, com.google.android.gms.ads.mediation.d dVar, Bundle bundle, com.google.android.gms.ads.mediation.a aVar, Bundle bundle2) {
        this.DW = dVar;
        if (dVar == null) {
            xp.u7("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            xp.u7("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.DW.Hw(this, 0);
            return;
        }
        if (!(com.google.android.gms.common.util.o.DW() && n0.VH(context))) {
            xp.u7("Default browser does not support custom tabs. Bailing out.");
            this.DW.Hw(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            xp.u7("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.DW.Hw(this, 0);
        } else {
            this.j6 = (Activity) context;
            this.FH = Uri.parse(string);
            this.DW.Ws(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder().build();
        customTabsIntentBuild.intent.setData(this.FH);
        bn.gn.post(new rc(this, new AdOverlayInfoParcel(new zzc(customTabsIntentBuild.intent), null, new qc(this), null, new zzbbi(0, 0, false))));
        com.google.android.gms.ads.internal.w0.u7().XL();
    }
}
