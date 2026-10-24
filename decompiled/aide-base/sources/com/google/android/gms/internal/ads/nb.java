package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class nb<NETWORK_EXTRAS extends com.google.ads.mediation.f, SERVER_PARAMETERS extends com.google.ads.mediation.e> extends oa {
    private final com.google.ads.mediation.b<NETWORK_EXTRAS, SERVER_PARAMETERS> WB;
    private final NETWORK_EXTRAS mb;

    public nb(com.google.ads.mediation.b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar, NETWORK_EXTRAS network_extras) {
        this.WB = bVar;
        this.mb = network_extras;
    }

    private final SERVER_PARAMETERS Mt(String str, int i, String str2) throws RemoteException {
        HashMap map;
        try {
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                map = new HashMap(jSONObject.length());
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.getString(next));
                }
            } else {
                map = new HashMap(0);
            }
            Class<SERVER_PARAMETERS> serverParametersType = this.WB.getServerParametersType();
            if (serverParametersType == null) {
                return null;
            }
            SERVER_PARAMETERS server_parametersNewInstance = serverParametersType.newInstance();
            server_parametersNewInstance.j6(map);
            return server_parametersNewInstance;
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
        com.google.ads.mediation.b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.WB;
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
    public final void DP(zzwb zzwbVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void Jy(zzwb zzwbVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void Mr() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void Oo(abcd.wu wuVar, zzwb zzwbVar, String str, qa qaVar) throws RemoteException {
        Vw(wuVar, zzwbVar, str, null, qaVar);
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void T6(abcd.wu wuVar, zzwb zzwbVar, String str, String str2, qa qaVar, zzacp zzacpVar, List<String> list) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.na
    public final void Vw(abcd.wu wuVar, zzwb zzwbVar, String str, String str2, qa qaVar) throws RemoteException {
        com.google.ads.mediation.b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.WB;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String strValueOf = String.valueOf(bVar.getClass().getCanonicalName());
            xp.u7(strValueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(strValueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        xp.VH("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.WB).requestInterstitialAd(new ob(qaVar), (Activity) abcd.xu.g3(wuVar), Mt(str, zzwbVar.zh, str2), rb.DW(zzwbVar, k6(zzwbVar)), this.mb);
        } catch (Throwable th) {
            xp.Hw("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void XL() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void aa(abcd.wu wuVar, sk skVar, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void bI(abcd.wu wuVar) {
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void destroy() throws RemoteException {
        try {
            this.WB.destroy();
        } catch (Throwable th) {
            xp.Hw("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.na
    public final za e3() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.na
    public final Bundle getInterstitialAdapterInfo() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.na
    public final yx0 getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.na
    public final Bundle iW() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.na
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void ix(abcd.wu wuVar, zzwf zzwfVar, zzwb zzwbVar, String str, qa qaVar) throws RemoteException {
        uW(wuVar, zzwfVar, zzwbVar, str, null, qaVar);
    }

    @Override // com.google.android.gms.internal.ads.na
    public final b3 lJ() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void lz(abcd.wu wuVar, zzwb zzwbVar, String str, sk skVar, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.na
    public final cb m0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.na
    public final boolean mm() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void sG(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.na
    public final wa sM() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void showInterstitial() throws RemoteException {
        com.google.ads.mediation.b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.WB;
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
    public final void showVideo() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.na
    public final void uW(abcd.wu wuVar, zzwf zzwfVar, zzwb zzwbVar, String str, String str2, qa qaVar) throws RemoteException {
        abcd.ku kuVar;
        com.google.ads.mediation.b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.WB;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String strValueOf = String.valueOf(bVar.getClass().getCanonicalName());
            xp.u7(strValueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(strValueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        xp.VH("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.WB;
            ob obVar = new ob(qaVar);
            Activity activity = (Activity) abcd.xu.g3(wuVar);
            com.google.ads.mediation.e eVarMt = Mt(str, zzwbVar.zh, str2);
            int i = 0;
            abcd.ku[] kuVarArr = {abcd.ku.DW, abcd.ku.FH, abcd.ku.Hw, abcd.ku.v5, abcd.ku.Zo, abcd.ku.VH};
            while (true) {
                if (i >= 6) {
                    kuVar = new abcd.ku(com.google.android.gms.ads.k.j6(zzwfVar.qp, zzwfVar.mb, zzwfVar.WB));
                    break;
                } else {
                    if (kuVarArr[i].DW() == zzwfVar.qp && kuVarArr[i].j6() == zzwfVar.mb) {
                        kuVar = kuVarArr[i];
                        break;
                    }
                    i++;
                }
            }
            mediationBannerAdapter.requestBannerAd(obVar, activity, eVarMt, kuVar, rb.DW(zzwbVar, k6(zzwbVar)), this.mb);
        } catch (Throwable th) {
            xp.Hw("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.na
    public final Bundle zzuw() {
        return new Bundle();
    }
}
