package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;

@jg
/* loaded from: classes.dex */
public final class jb implements com.google.android.gms.ads.mediation.c, com.google.android.gms.ads.mediation.d, com.google.android.gms.ads.mediation.e {
    private com.google.android.gms.ads.mediation.f DW;
    private com.google.android.gms.ads.mediation.l FH;
    private com.google.android.gms.ads.formats.f Hw;
    private final qa j6;

    public jb(qa qaVar) {
        this.j6 = qaVar;
    }

    private static void rN(MediationNativeAdapter mediationNativeAdapter, com.google.android.gms.ads.mediation.l lVar, com.google.android.gms.ads.mediation.f fVar) {
        if (mediationNativeAdapter instanceof AdMobAdapter) {
            return;
        }
        com.google.android.gms.ads.g gVar = new com.google.android.gms.ads.g();
        gVar.DW(new gb());
        if (lVar != null && lVar.QX()) {
            lVar.ei(gVar);
        }
        if (fVar == null || !fVar.VH()) {
            return;
        }
        fVar.J8(gVar);
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void DW(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        xp.VH("Adapter called onAdOpened.");
        try {
            this.j6.ko();
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.c
    public final void EQ(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        xp.VH("Adapter called onAppEvent.");
        try {
            this.j6.U2(str, str2);
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.d
    public final void FH(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        xp.VH("Adapter called onAdLeftApplication.");
        try {
            this.j6.mb();
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.d
    public final void Hw(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        xp.VH(sb.toString());
        try {
            this.j6.Gj(i);
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void J0(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        xp.VH("Adapter called onAdLeftApplication.");
        try {
            this.j6.mb();
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.c
    public final void J8(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        xp.VH("Adapter called onAdLeftApplication.");
        try {
            this.j6.mb();
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void Mr(MediationNativeAdapter mediationNativeAdapter, com.google.android.gms.ads.formats.f fVar, String str) {
        if (!(fVar instanceof f3)) {
            xp.u7("Unexpected native custom template ad type.");
            return;
        }
        try {
            this.j6.lp(((f3) fVar).DW(), str);
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.c
    public final void QX(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        xp.VH("Adapter called onAdOpened.");
        try {
            this.j6.ko();
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void U2(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.mediation.f fVar = this.DW;
        com.google.android.gms.ads.mediation.l lVar = this.FH;
        if (this.Hw == null) {
            if (fVar == null && lVar == null) {
                xp.Zo("#007 Could not call remote method.", null);
                return;
            }
            if (lVar != null && !lVar.tp()) {
                xp.VH("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            } else if (fVar != null && !fVar.Hw()) {
                xp.VH("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        xp.VH("Adapter called onAdImpression.");
        try {
            this.j6.hK();
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.c
    public final void VH(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        xp.VH("Adapter called onAdLoaded.");
        try {
            this.j6.k2();
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.d
    public final void Ws(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        xp.VH("Adapter called onAdLoaded.");
        try {
            this.j6.k2();
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.d
    public final void XL(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        xp.VH("Adapter called onAdClosed.");
        try {
            this.j6.fN();
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void Zo(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        xp.VH("Adapter called onAdClosed.");
        try {
            this.j6.fN();
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.d
    public final void a8(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        xp.VH("Adapter called onAdOpened.");
        try {
            this.j6.ko();
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void aM(MediationNativeAdapter mediationNativeAdapter, com.google.android.gms.ads.mediation.f fVar) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        xp.VH("Adapter called onAdLoaded.");
        this.DW = fVar;
        this.FH = null;
        rN(mediationNativeAdapter, null, fVar);
        try {
            this.j6.k2();
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    public final com.google.android.gms.ads.mediation.f er() {
        return this.DW;
    }

    public final com.google.android.gms.ads.formats.f gW() {
        return this.Hw;
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void gn(MediationNativeAdapter mediationNativeAdapter, int i) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        xp.VH(sb.toString());
        try {
            this.j6.Gj(i);
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void j3(MediationNativeAdapter mediationNativeAdapter, com.google.android.gms.ads.mediation.l lVar) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        xp.VH("Adapter called onAdLoaded.");
        this.FH = lVar;
        this.DW = null;
        rN(mediationNativeAdapter, lVar, null);
        try {
            this.j6.k2();
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.c
    public final void j6(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        xp.VH("Adapter called onAdClosed.");
        try {
            this.j6.fN();
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.c
    public final void lg(MediationBannerAdapter mediationBannerAdapter, int i) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error. ");
        sb.append(i);
        xp.VH(sb.toString());
        try {
            this.j6.Gj(i);
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void tp(MediationNativeAdapter mediationNativeAdapter, com.google.android.gms.ads.formats.f fVar) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        String strValueOf = String.valueOf(fVar.vy());
        xp.VH(strValueOf.length() != 0 ? "Adapter called onAdLoaded with template id ".concat(strValueOf) : new String("Adapter called onAdLoaded with template id "));
        this.Hw = fVar;
        try {
            this.j6.k2();
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void u7(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.mediation.f fVar = this.DW;
        com.google.android.gms.ads.mediation.l lVar = this.FH;
        if (this.Hw == null) {
            if (fVar == null && lVar == null) {
                xp.Zo("#007 Could not call remote method.", null);
                return;
            }
            if (lVar != null && !lVar.u7()) {
                xp.VH("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            } else if (fVar != null && !fVar.FH()) {
                xp.VH("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        xp.VH("Adapter called onAdClicked.");
        try {
            this.j6.EQ();
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.c
    public final void v5(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        xp.VH("Adapter called onAdClicked.");
        try {
            this.j6.EQ();
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.d
    public final void we(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        xp.VH("Adapter called onAdClicked.");
        try {
            this.j6.EQ();
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    public final com.google.android.gms.ads.mediation.l yS() {
        return this.FH;
    }
}
