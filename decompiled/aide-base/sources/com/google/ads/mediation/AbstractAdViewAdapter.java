package com.google.ads.mediation;

import abcd.pu;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.b;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.formats.d;
import com.google.android.gms.ads.formats.e;
import com.google.android.gms.ads.formats.f;
import com.google.android.gms.ads.formats.g;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.b;
import com.google.android.gms.ads.mediation.i;
import com.google.android.gms.ads.mediation.k;
import com.google.android.gms.ads.mediation.l;
import com.google.android.gms.ads.mediation.n;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.internal.ads.cw0;
import com.google.android.gms.internal.ads.hv0;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.mp;
import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.internal.ads.yx0;
import com.google.android.gms.internal.ads.zzbiy;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@jg
/* loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements com.google.android.gms.ads.mediation.MediationBannerAdapter, MediationNativeAdapter, k, n, MediationRewardedVideoAdAdapter, zzbiy {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdView zzhs;
    private InterstitialAd zzht;
    private com.google.android.gms.ads.b zzhu;
    private Context zzhv;
    private InterstitialAd zzhw;
    private com.google.android.gms.ads.reward.mediation.a zzhx;
    private final pu zzhy = new g(this);

    static class a extends com.google.android.gms.ads.mediation.g {
        private final com.google.android.gms.ads.formats.d QX;

        public a(com.google.android.gms.ads.formats.d dVar) {
            this.QX = dVar;
            yS(dVar.Hw().toString());
            BT(dVar.Zo());
            rN(dVar.DW().toString());
            gW(dVar.v5());
            er(dVar.FH().toString());
            if (dVar.gn() != null) {
                P8(dVar.gn().doubleValue());
            }
            if (dVar.u7() != null) {
                ei(dVar.u7().toString());
            }
            if (dVar.VH() != null) {
                vy(dVar.VH().toString());
            }
            tp(true);
            u7(true);
            J8(dVar.tp());
        }

        @Override // com.google.android.gms.ads.mediation.f
        public final void EQ(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.QX);
            }
            com.google.android.gms.ads.formats.c cVar = com.google.android.gms.ads.formats.c.FH.get(view);
            if (cVar != null) {
                cVar.j6(this.QX);
            }
        }
    }

    static class b extends com.google.android.gms.ads.mediation.h {
        private final com.google.android.gms.ads.formats.e J8;

        public b(com.google.android.gms.ads.formats.e eVar) {
            this.J8 = eVar;
            er(eVar.v5().toString());
            yS(eVar.Zo());
            lg(eVar.FH().toString());
            if (eVar.VH() != null) {
                gW(eVar.VH());
            }
            rN(eVar.Hw().toString());
            a8(eVar.DW().toString());
            tp(true);
            u7(true);
            J8(eVar.gn());
        }

        @Override // com.google.android.gms.ads.mediation.f
        public final void EQ(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.J8);
            }
            com.google.android.gms.ads.formats.c cVar = com.google.android.gms.ads.formats.c.FH.get(view);
            if (cVar != null) {
                cVar.j6(this.J8);
            }
        }
    }

    static class c extends l {
        private final com.google.android.gms.ads.formats.g aM;

        public c(com.google.android.gms.ads.formats.g gVar) {
            this.aM = gVar;
            U2(gVar.Hw());
            lg(gVar.Zo());
            j3(gVar.DW());
            a8(gVar.v5());
            Mr(gVar.FH());
            aM(gVar.j6());
            gW(gVar.gn());
            BT(gVar.u7());
            yS(gVar.VH());
            KD(gVar.we());
            er(true);
            rN(true);
            ei(gVar.tp());
        }

        @Override // com.google.android.gms.ads.mediation.l
        public final void vy(View view, Map<String, View> map, Map<String, View> map2) {
            if (view instanceof UnifiedNativeAdView) {
                ((UnifiedNativeAdView) view).setNativeAd(this.aM);
                return;
            }
            com.google.android.gms.ads.formats.c cVar = com.google.android.gms.ads.formats.c.FH.get(view);
            if (cVar != null) {
                cVar.DW(this.aM);
            }
        }
    }

    static final class d extends com.google.android.gms.ads.a implements com.google.android.gms.ads.doubleclick.a, hv0 {
        private final AbstractAdViewAdapter WB;
        private final com.google.android.gms.ads.mediation.c mb;

        public d(AbstractAdViewAdapter abstractAdViewAdapter, com.google.android.gms.ads.mediation.c cVar) {
            this.WB = abstractAdViewAdapter;
            this.mb = cVar;
        }

        @Override // com.google.android.gms.ads.a, com.google.android.gms.internal.ads.hv0
        public final void EQ() {
            this.mb.v5(this.WB);
        }

        @Override // com.google.android.gms.ads.doubleclick.a
        public final void U2(String str, String str2) {
            this.mb.EQ(this.WB, str, str2);
        }

        @Override // com.google.android.gms.ads.a
        public final void VH(int i) {
            this.mb.lg(this.WB, i);
        }

        @Override // com.google.android.gms.ads.a
        public final void Zo() {
            this.mb.j6(this.WB);
        }

        @Override // com.google.android.gms.ads.a
        public final void tp() {
            this.mb.VH(this.WB);
        }

        @Override // com.google.android.gms.ads.a
        public final void u7() {
            this.mb.J8(this.WB);
        }

        @Override // com.google.android.gms.ads.a
        public final void we() {
            this.mb.QX(this.WB);
        }
    }

    static final class e extends com.google.android.gms.ads.a implements hv0 {
        private final AbstractAdViewAdapter WB;
        private final com.google.android.gms.ads.mediation.d mb;

        public e(AbstractAdViewAdapter abstractAdViewAdapter, com.google.android.gms.ads.mediation.d dVar) {
            this.WB = abstractAdViewAdapter;
            this.mb = dVar;
        }

        @Override // com.google.android.gms.ads.a, com.google.android.gms.internal.ads.hv0
        public final void EQ() {
            this.mb.we(this.WB);
        }

        @Override // com.google.android.gms.ads.a
        public final void VH(int i) {
            this.mb.Hw(this.WB, i);
        }

        @Override // com.google.android.gms.ads.a
        public final void Zo() {
            this.mb.XL(this.WB);
        }

        @Override // com.google.android.gms.ads.a
        public final void tp() {
            this.mb.Ws(this.WB);
        }

        @Override // com.google.android.gms.ads.a
        public final void u7() {
            this.mb.FH(this.WB);
        }

        @Override // com.google.android.gms.ads.a
        public final void we() {
            this.mb.a8(this.WB);
        }
    }

    static final class f extends com.google.android.gms.ads.a implements d.a, e.a, f.a, f.b, g.a {
        private final AbstractAdViewAdapter WB;
        private final com.google.android.gms.ads.mediation.e mb;

        public f(AbstractAdViewAdapter abstractAdViewAdapter, com.google.android.gms.ads.mediation.e eVar) {
            this.WB = abstractAdViewAdapter;
            this.mb = eVar;
        }

        @Override // com.google.android.gms.ads.formats.g.a
        public final void DW(com.google.android.gms.ads.formats.g gVar) {
            this.mb.j3(this.WB, new c(gVar));
        }

        @Override // com.google.android.gms.ads.a, com.google.android.gms.internal.ads.hv0
        public final void EQ() {
            this.mb.u7(this.WB);
        }

        @Override // com.google.android.gms.ads.formats.f.b
        public final void FH(com.google.android.gms.ads.formats.f fVar) {
            this.mb.tp(this.WB, fVar);
        }

        @Override // com.google.android.gms.ads.formats.e.a
        public final void Hw(com.google.android.gms.ads.formats.e eVar) {
            this.mb.aM(this.WB, new b(eVar));
        }

        @Override // com.google.android.gms.ads.a
        public final void VH(int i) {
            this.mb.gn(this.WB, i);
        }

        @Override // com.google.android.gms.ads.a
        public final void Zo() {
            this.mb.Zo(this.WB);
        }

        @Override // com.google.android.gms.ads.a
        public final void gn() {
            this.mb.U2(this.WB);
        }

        @Override // com.google.android.gms.ads.formats.d.a
        public final void j6(com.google.android.gms.ads.formats.d dVar) {
            this.mb.aM(this.WB, new a(dVar));
        }

        @Override // com.google.android.gms.ads.a
        public final void tp() {
        }

        @Override // com.google.android.gms.ads.a
        public final void u7() {
            this.mb.J0(this.WB);
        }

        @Override // com.google.android.gms.ads.formats.f.a
        public final void v5(com.google.android.gms.ads.formats.f fVar, String str) {
            this.mb.Mr(this.WB, fVar, str);
        }

        @Override // com.google.android.gms.ads.a
        public final void we() {
            this.mb.DW(this.WB);
        }
    }

    private final com.google.android.gms.ads.c zza(Context context, com.google.android.gms.ads.mediation.a aVar, Bundle bundle, Bundle bundle2) {
        c.a aVar2 = new c.a();
        Date dateFH = aVar.FH();
        if (dateFH != null) {
            aVar2.v5(dateFH);
        }
        int iVH = aVar.VH();
        if (iVH != 0) {
            aVar2.Zo(iVH);
        }
        Set<String> setV5 = aVar.v5();
        if (setV5 != null) {
            Iterator<String> it = setV5.iterator();
            while (it.hasNext()) {
                aVar2.j6(it.next());
            }
        }
        Location locationZo = aVar.Zo();
        if (locationZo != null) {
            aVar2.gn(locationZo);
        }
        if (aVar.Hw()) {
            cw0.j6();
            aVar2.FH(mp.Ws(context));
        }
        if (aVar.j6() != -1) {
            aVar2.u7(aVar.j6() == 1);
        }
        aVar2.VH(aVar.DW());
        aVar2.DW(AdMobAdapter.class, zza(bundle, bundle2));
        return aVar2.Hw();
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.zzhs;
    }

    @Override // com.google.android.gms.internal.ads.zzbiy
    public Bundle getInterstitialAdapterInfo() {
        b.a aVar = new b.a();
        aVar.DW(1);
        return aVar.j6();
    }

    @Override // com.google.android.gms.ads.mediation.n
    public yx0 getVideoController() {
        com.google.android.gms.ads.g videoController;
        AdView adView = this.zzhs;
        if (adView == null || (videoController = adView.getVideoController()) == null) {
            return null;
        }
        return videoController.FH();
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void initialize(Context context, com.google.android.gms.ads.mediation.a aVar, String str, com.google.android.gms.ads.reward.mediation.a aVar2, Bundle bundle, Bundle bundle2) {
        this.zzhv = context.getApplicationContext();
        this.zzhx = aVar2;
        aVar2.Qq(this);
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public boolean isInitialized() {
        return this.zzhx != null;
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void loadAd(com.google.android.gms.ads.mediation.a aVar, Bundle bundle, Bundle bundle2) {
        Context context = this.zzhv;
        if (context == null || this.zzhx == null) {
            xp.j6("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        InterstitialAd interstitialAd = new InterstitialAd(context);
        this.zzhw = interstitialAd;
        interstitialAd.u7(true);
        this.zzhw.v5(getAdUnitId(bundle));
        this.zzhw.VH(this.zzhy);
        this.zzhw.Hw(new h(this));
        this.zzhw.DW(zza(this.zzhv, aVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, com.google.android.gms.ads.mediation.b, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter, com.google.android.gms.internal.ads.zzbiy, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void onDestroy() {
        AdView adView = this.zzhs;
        if (adView != null) {
            adView.j6();
            this.zzhs = null;
        }
        if (this.zzht != null) {
            this.zzht = null;
        }
        if (this.zzhu != null) {
            this.zzhu = null;
        }
        if (this.zzhw != null) {
            this.zzhw = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.k
    public void onImmersiveModeUpdated(boolean z) {
        InterstitialAd interstitialAd = this.zzht;
        if (interstitialAd != null) {
            interstitialAd.Zo(z);
        }
        InterstitialAd interstitialAd2 = this.zzhw;
        if (interstitialAd2 != null) {
            interstitialAd2.Zo(z);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, com.google.android.gms.ads.mediation.b, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter, com.google.android.gms.internal.ads.zzbiy, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void onPause() {
        AdView adView = this.zzhs;
        if (adView != null) {
            adView.FH();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, com.google.android.gms.ads.mediation.b, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter, com.google.android.gms.internal.ads.zzbiy, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void onResume() {
        AdView adView = this.zzhs;
        if (adView != null) {
            adView.Hw();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, com.google.android.gms.ads.mediation.c cVar, Bundle bundle, com.google.android.gms.ads.d dVar, com.google.android.gms.ads.mediation.a aVar, Bundle bundle2) {
        AdView adView = new AdView(context);
        this.zzhs = adView;
        adView.setAdSize(new com.google.android.gms.ads.d(dVar.FH(), dVar.j6()));
        this.zzhs.setAdUnitId(getAdUnitId(bundle));
        this.zzhs.setAdListener(new d(this, cVar));
        this.zzhs.DW(zza(context, aVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, com.google.android.gms.ads.mediation.d dVar, Bundle bundle, com.google.android.gms.ads.mediation.a aVar, Bundle bundle2) {
        InterstitialAd interstitialAd = new InterstitialAd(context);
        this.zzht = interstitialAd;
        interstitialAd.v5(getAdUnitId(bundle));
        this.zzht.FH(new e(this, dVar));
        this.zzht.DW(zza(context, aVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, com.google.android.gms.ads.mediation.e eVar, Bundle bundle, i iVar, Bundle bundle2) {
        f fVar = new f(this, eVar);
        b.a aVar = new b.a(context, bundle.getString(AD_UNIT_ID_PARAMETER));
        aVar.Zo(fVar);
        com.google.android.gms.ads.formats.b bVarEQ = iVar.EQ();
        if (bVarEQ != null) {
            aVar.VH(bVarEQ);
        }
        if (iVar.u7()) {
            aVar.v5(fVar);
        }
        if (iVar.tp()) {
            aVar.DW(fVar);
        }
        if (iVar.J0()) {
            aVar.FH(fVar);
        }
        if (iVar.we()) {
            for (String str : iVar.gn().keySet()) {
                aVar.Hw(str, fVar, iVar.gn().get(str).booleanValue() ? fVar : null);
            }
        }
        com.google.android.gms.ads.b bVarJ6 = aVar.j6();
        this.zzhu = bVarJ6;
        bVarJ6.j6(zza(context, iVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        this.zzht.gn();
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void showVideo() {
        this.zzhw.gn();
    }

    protected abstract Bundle zza(Bundle bundle, Bundle bundle2);

    static /* synthetic */ InterstitialAd zza(AbstractAdViewAdapter abstractAdViewAdapter, InterstitialAd interstitialAd) {
        abstractAdViewAdapter.zzhw = null;
        return null;
    }
}
