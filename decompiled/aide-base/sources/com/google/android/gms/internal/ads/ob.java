package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;

@jg
/* loaded from: classes.dex */
public final class ob<NETWORK_EXTRAS extends com.google.ads.mediation.f, SERVER_PARAMETERS extends com.google.ads.mediation.e> implements com.google.ads.mediation.c, com.google.ads.mediation.d {
    private final qa j6;

    public ob(qa qaVar) {
        this.j6 = qaVar;
    }

    @Override // com.google.ads.mediation.d
    public final void DW(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, abcd.iu iuVar) {
        String strValueOf = String.valueOf(iuVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(strValueOf);
        sb.append(".");
        xp.VH(sb.toString());
        cw0.j6();
        if (!mp.EQ()) {
            xp.Zo("#008 Must be called on the main UI thread.", null);
            mp.j6.post(new qb(this, iuVar));
        } else {
            try {
                this.j6.Gj(rb.j6(iuVar));
            } catch (RemoteException e) {
                xp.Zo("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.ads.mediation.c
    public final void j6(MediationBannerAdapter<?, ?> mediationBannerAdapter, abcd.iu iuVar) {
        String strValueOf = String.valueOf(iuVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error. ");
        sb.append(strValueOf);
        xp.VH(sb.toString());
        cw0.j6();
        if (!mp.EQ()) {
            xp.Zo("#008 Must be called on the main UI thread.", null);
            mp.j6.post(new pb(this, iuVar));
        } else {
            try {
                this.j6.Gj(rb.j6(iuVar));
            } catch (RemoteException e) {
                xp.Zo("#007 Could not call remote method.", e);
            }
        }
    }
}
