package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class ib extends oa {
    private final com.google.android.gms.ads.mediation.b WB;
    private jb mb;

    public ib(com.google.android.gms.ads.mediation.b bVar) {
        this.WB = bVar;
    }

    private final Bundle Mt(String str, zzwb zzwbVar, String str2) throws RemoteException {
        String strValueOf = String.valueOf(str);
        xp.u7(strValueOf.length() != 0 ? "Server parameters: ".concat(strValueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.WB instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzwbVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzwbVar.zh);
                }
            }
            return bundle;
        } catch (Throwable th) {
            xp.Hw("", th);
            throw new RemoteException();
        }
    }

    private static boolean k6(zzwb zzwbVar) {
        if (zzwbVar.k2) {
            return true;
        }
        cw0.j6();
        return mp.tp();
    }

    @Override // com.google.android.gms.internal.ads.na
    public final abcd.wu An() throws RemoteException {
        com.google.android.gms.ads.mediation.b bVar = this.WB;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String strValueOf = String.valueOf(bVar.getClass().getCanonicalName());
            xp.u7(strValueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(strValueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return abcd.xu.sy(((MediationBannerAdapter) bVar).getBannerView());
        } catch (Throwable th) {
            xp.Hw("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void DP(zzwb zzwbVar, String str, String str2) throws RemoteException {
        com.google.android.gms.ads.mediation.b bVar = this.WB;
        if (!(bVar instanceof MediationRewardedVideoAdAdapter)) {
            String strValueOf = String.valueOf(bVar.getClass().getCanonicalName());
            xp.u7(strValueOf.length() != 0 ? "Not a MediationRewardedVideoAdAdapter: ".concat(strValueOf) : new String("Not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        xp.VH("Requesting rewarded video ad from adapter.");
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.WB;
            mediationRewardedVideoAdAdapter.loadAd(new hb(zzwbVar.mb == -1 ? null : new Date(zzwbVar.mb), zzwbVar.fY, zzwbVar.qp != null ? new HashSet(zzwbVar.qp) : null, zzwbVar.cT, k6(zzwbVar), zzwbVar.zh, zzwbVar.iW), Mt(str, zzwbVar, str2), zzwbVar.Z1 != null ? zzwbVar.Z1.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null);
        } catch (Throwable th) {
            xp.Hw("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void Jy(zzwb zzwbVar, String str) throws RemoteException {
        DP(zzwbVar, str, null);
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void Mr() throws RemoteException {
        try {
            this.WB.onPause();
        } catch (Throwable th) {
            xp.Hw("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void Oo(abcd.wu wuVar, zzwb zzwbVar, String str, qa qaVar) throws RemoteException {
        Vw(wuVar, zzwbVar, str, null, qaVar);
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void T6(abcd.wu wuVar, zzwb zzwbVar, String str, String str2, qa qaVar, zzacp zzacpVar, List<String> list) throws RemoteException {
        com.google.android.gms.ads.mediation.b bVar = this.WB;
        if (!(bVar instanceof MediationNativeAdapter)) {
            String strValueOf = String.valueOf(bVar.getClass().getCanonicalName());
            xp.u7(strValueOf.length() != 0 ? "Not a MediationNativeAdapter: ".concat(strValueOf) : new String("Not a MediationNativeAdapter: "));
            throw new RemoteException();
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) bVar;
            mb mbVar = new mb(zzwbVar.mb == -1 ? null : new Date(zzwbVar.mb), zzwbVar.fY, zzwbVar.qp != null ? new HashSet(zzwbVar.qp) : null, zzwbVar.cT, k6(zzwbVar), zzwbVar.zh, zzacpVar, list, zzwbVar.iW);
            Bundle bundle = zzwbVar.Z1 != null ? zzwbVar.Z1.getBundle(mediationNativeAdapter.getClass().getName()) : null;
            this.mb = new jb(qaVar);
            mediationNativeAdapter.requestNativeAd((Context) abcd.xu.g3(wuVar), this.mb, Mt(str, zzwbVar, str2), mbVar, bundle);
        } catch (Throwable th) {
            xp.Hw("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void Vw(abcd.wu wuVar, zzwb zzwbVar, String str, String str2, qa qaVar) throws RemoteException {
        com.google.android.gms.ads.mediation.b bVar = this.WB;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String strValueOf = String.valueOf(bVar.getClass().getCanonicalName());
            xp.u7(strValueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(strValueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        xp.VH("Requesting interstitial ad from adapter.");
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.WB;
            mediationInterstitialAdapter.requestInterstitialAd((Context) abcd.xu.g3(wuVar), new jb(qaVar), Mt(str, zzwbVar, str2), new hb(zzwbVar.mb == -1 ? null : new Date(zzwbVar.mb), zzwbVar.fY, zzwbVar.qp != null ? new HashSet(zzwbVar.qp) : null, zzwbVar.cT, k6(zzwbVar), zzwbVar.zh, zzwbVar.iW), zzwbVar.Z1 != null ? zzwbVar.Z1.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th) {
            xp.Hw("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void XL() throws RemoteException {
        try {
            this.WB.onResume();
        } catch (Throwable th) {
            xp.Hw("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void aa(abcd.wu wuVar, sk skVar, List<String> list) throws RemoteException {
        com.google.android.gms.ads.mediation.b bVar = this.WB;
        if (!(bVar instanceof InitializableMediationRewardedVideoAdAdapter)) {
            String strValueOf = String.valueOf(bVar.getClass().getCanonicalName());
            xp.u7(strValueOf.length() != 0 ? "Not an InitializableMediationRewardedVideoAdAdapter: ".concat(strValueOf) : new String("Not an InitializableMediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        xp.VH("Initialize rewarded video adapter.");
        try {
            InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.WB;
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Mt(it.next(), null, null));
            }
            initializableMediationRewardedVideoAdAdapter.initialize((Context) abcd.xu.g3(wuVar), new wk(skVar), arrayList);
        } catch (Throwable th) {
            xp.v5("Could not initialize rewarded video adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void bI(abcd.wu wuVar) {
        Context context = (Context) abcd.xu.g3(wuVar);
        com.google.android.gms.ads.mediation.b bVar = this.WB;
        if (bVar instanceof com.google.android.gms.ads.mediation.j) {
            ((com.google.android.gms.ads.mediation.j) bVar).j6(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void destroy() throws RemoteException {
        try {
            this.WB.onDestroy();
        } catch (Throwable th) {
            xp.Hw("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.na
    public final za e3() {
        com.google.android.gms.ads.mediation.f fVarEr = this.mb.er();
        if (fVarEr instanceof com.google.android.gms.ads.mediation.h) {
            return new lb((com.google.android.gms.ads.mediation.h) fVarEr);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.na
    public final Bundle getInterstitialAdapterInfo() {
        com.google.android.gms.ads.mediation.b bVar = this.WB;
        if (bVar instanceof zzbiy) {
            return ((zzbiy) bVar).getInterstitialAdapterInfo();
        }
        String strValueOf = String.valueOf(bVar.getClass().getCanonicalName());
        xp.u7(strValueOf.length() != 0 ? "Not a v2 MediationInterstitialAdapter: ".concat(strValueOf) : new String("Not a v2 MediationInterstitialAdapter: "));
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.na
    public final yx0 getVideoController() {
        com.google.android.gms.ads.mediation.b bVar = this.WB;
        if (!(bVar instanceof com.google.android.gms.ads.mediation.n)) {
            return null;
        }
        try {
            return ((com.google.android.gms.ads.mediation.n) bVar).getVideoController();
        } catch (Throwable th) {
            xp.Hw("", th);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.na
    public final Bundle iW() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.na
    public final boolean isInitialized() throws RemoteException {
        com.google.android.gms.ads.mediation.b bVar = this.WB;
        if (!(bVar instanceof MediationRewardedVideoAdAdapter)) {
            String strValueOf = String.valueOf(bVar.getClass().getCanonicalName());
            xp.u7(strValueOf.length() != 0 ? "Not a MediationRewardedVideoAdAdapter: ".concat(strValueOf) : new String("Not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        xp.VH("Check if adapter is initialized.");
        try {
            return ((MediationRewardedVideoAdAdapter) this.WB).isInitialized();
        } catch (Throwable th) {
            xp.Hw("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void ix(abcd.wu wuVar, zzwf zzwfVar, zzwb zzwbVar, String str, qa qaVar) throws RemoteException {
        uW(wuVar, zzwfVar, zzwbVar, str, null, qaVar);
    }

    @Override // com.google.android.gms.internal.ads.na
    public final b3 lJ() {
        com.google.android.gms.ads.formats.f fVarGW = this.mb.gW();
        if (fVarGW instanceof f3) {
            return ((f3) fVarGW).DW();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void lz(abcd.wu wuVar, zzwb zzwbVar, String str, sk skVar, String str2) throws RemoteException {
        hb hbVar;
        Bundle bundle;
        com.google.android.gms.ads.mediation.b bVar = this.WB;
        if (!(bVar instanceof MediationRewardedVideoAdAdapter)) {
            String strValueOf = String.valueOf(bVar.getClass().getCanonicalName());
            xp.u7(strValueOf.length() != 0 ? "Not a MediationRewardedVideoAdAdapter: ".concat(strValueOf) : new String("Not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        xp.VH("Initialize rewarded video adapter.");
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.WB;
            Bundle bundleMt = Mt(str2, zzwbVar, null);
            if (zzwbVar != null) {
                hb hbVar2 = new hb(zzwbVar.mb == -1 ? null : new Date(zzwbVar.mb), zzwbVar.fY, zzwbVar.qp != null ? new HashSet(zzwbVar.qp) : null, zzwbVar.cT, k6(zzwbVar), zzwbVar.zh, zzwbVar.iW);
                bundle = zzwbVar.Z1 != null ? zzwbVar.Z1.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                hbVar = hbVar2;
            } else {
                hbVar = null;
                bundle = null;
            }
            mediationRewardedVideoAdAdapter.initialize((Context) abcd.xu.g3(wuVar), hbVar, str, new wk(skVar), bundleMt, bundle);
        } catch (Throwable th) {
            xp.Hw("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.na
    public final cb m0() {
        com.google.android.gms.ads.mediation.l lVarYS = this.mb.yS();
        if (lVarYS != null) {
            return new tb(lVarYS);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.na
    public final boolean mm() {
        return this.WB instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void sG(boolean z) {
        com.google.android.gms.ads.mediation.b bVar = this.WB;
        if (!(bVar instanceof com.google.android.gms.ads.mediation.k)) {
            String strValueOf = String.valueOf(bVar.getClass().getCanonicalName());
            xp.gn(strValueOf.length() != 0 ? "Not an OnImmersiveModeUpdatedListener: ".concat(strValueOf) : new String("Not an OnImmersiveModeUpdatedListener: "));
        } else {
            try {
                ((com.google.android.gms.ads.mediation.k) bVar).onImmersiveModeUpdated(z);
            } catch (Throwable th) {
                xp.Hw("", th);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.na
    public final wa sM() {
        com.google.android.gms.ads.mediation.f fVarEr = this.mb.er();
        if (fVarEr instanceof com.google.android.gms.ads.mediation.g) {
            return new kb((com.google.android.gms.ads.mediation.g) fVarEr);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void showInterstitial() throws RemoteException {
        com.google.android.gms.ads.mediation.b bVar = this.WB;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String strValueOf = String.valueOf(bVar.getClass().getCanonicalName());
            xp.u7(strValueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(strValueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        xp.VH("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.WB).showInterstitial();
        } catch (Throwable th) {
            xp.Hw("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void showVideo() throws RemoteException {
        com.google.android.gms.ads.mediation.b bVar = this.WB;
        if (!(bVar instanceof MediationRewardedVideoAdAdapter)) {
            String strValueOf = String.valueOf(bVar.getClass().getCanonicalName());
            xp.u7(strValueOf.length() != 0 ? "Not a MediationRewardedVideoAdAdapter: ".concat(strValueOf) : new String("Not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        xp.VH("Show rewarded video ad from adapter.");
        try {
            ((MediationRewardedVideoAdAdapter) this.WB).showVideo();
        } catch (Throwable th) {
            xp.Hw("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void uW(abcd.wu wuVar, zzwf zzwfVar, zzwb zzwbVar, String str, String str2, qa qaVar) throws RemoteException {
        com.google.android.gms.ads.mediation.b bVar = this.WB;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String strValueOf = String.valueOf(bVar.getClass().getCanonicalName());
            xp.u7(strValueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(strValueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        xp.VH("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.WB;
            mediationBannerAdapter.requestBannerAd((Context) abcd.xu.g3(wuVar), new jb(qaVar), Mt(str, zzwbVar, str2), com.google.android.gms.ads.k.j6(zzwfVar.qp, zzwfVar.mb, zzwfVar.WB), new hb(zzwbVar.mb == -1 ? null : new Date(zzwbVar.mb), zzwbVar.fY, zzwbVar.qp != null ? new HashSet(zzwbVar.qp) : null, zzwbVar.cT, k6(zzwbVar), zzwbVar.zh, zzwbVar.iW), zzwbVar.Z1 != null ? zzwbVar.Z1.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th) {
            xp.Hw("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.na
    public final Bundle zzuw() {
        com.google.android.gms.ads.mediation.b bVar = this.WB;
        if (bVar instanceof zzbix) {
            return ((zzbix) bVar).zzuw();
        }
        String strValueOf = String.valueOf(bVar.getClass().getCanonicalName());
        xp.u7(strValueOf.length() != 0 ? "Not a v2 MediationBannerAdapter: ".concat(strValueOf) : new String("Not a v2 MediationBannerAdapter: "));
        return new Bundle();
    }
}
