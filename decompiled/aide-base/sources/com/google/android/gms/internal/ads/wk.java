package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;

@jg
/* loaded from: classes.dex */
public final class wk implements com.google.android.gms.ads.reward.mediation.a {
    private final sk j6;

    public wk(sk skVar) {
        this.j6 = skVar;
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void I(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        xp.VH("Adapter called onAdLoaded.");
        try {
            this.j6.kM(abcd.xu.sy(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void Mz(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        xp.VH("Adapter called onVideoStarted.");
        try {
            this.j6.N2(abcd.xu.sy(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void Qq(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        xp.VH("Adapter called onInitializationSucceeded.");
        try {
            this.j6.qY(abcd.xu.sy(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void Sf(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        xp.VH("Adapter called onVideoCompleted.");
        try {
            this.j6.Tc(abcd.xu.sy(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void ca(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, abcd.ou ouVar) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        xp.VH("Adapter called onRewarded.");
        try {
            if (ouVar != null) {
                this.j6.QM(abcd.xu.sy(mediationRewardedVideoAdAdapter), new zzawd(ouVar));
            } else {
                this.j6.QM(abcd.xu.sy(mediationRewardedVideoAdAdapter), new zzawd("", 1));
            }
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void ef(Bundle bundle) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        xp.VH("Adapter called onAdMetadataChanged.");
        try {
            this.j6.ef(bundle);
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void g3(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        xp.VH("Adapter called onAdOpened.");
        try {
            this.j6.Rd(abcd.xu.sy(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void sy(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        xp.VH("Adapter called onAdClosed.");
        try {
            this.j6.u9(abcd.xu.sy(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void vJ(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        xp.VH("Adapter called onAdFailedToLoad.");
        try {
            this.j6.K3(abcd.xu.sy(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void x9(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.");
        xp.VH("Adapter called onAdLeftApplication.");
        try {
            this.j6.Qk(abcd.xu.sy(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }
}
