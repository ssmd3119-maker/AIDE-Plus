package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;

@jg
/* loaded from: classes.dex */
public final class zzzb {
    private final Context DW;
    private abcd.pu EQ;
    private com.google.android.gms.ads.a FH;
    private hv0 Hw;
    private boolean J0;
    private abcd.nu VH;
    private String Zo;
    private com.google.android.gms.ads.doubleclick.a gn;
    private final ja j6;
    private com.google.android.gms.ads.e tp;
    private com.google.android.gms.ads.doubleclick.c u7;
    private uw0 v5;
    private boolean we;

    public zzzb(Context context) {
        this(context, rv0.j6, null);
    }

    private final void EQ(String str) {
        if (this.v5 != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63);
        sb.append("The ad unit ID must be set on InterstitialAd before ");
        sb.append(str);
        sb.append(" is called.");
        throw new IllegalStateException(sb.toString());
    }

    public final void DW(com.google.android.gms.ads.a aVar) {
        try {
            this.FH = aVar;
            if (this.v5 != null) {
                this.v5.xt(aVar != null ? new kv0(aVar) : null);
            }
        } catch (RemoteException e) {
            xp.Zo("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void FH(abcd.nu nuVar) {
        try {
            this.VH = nuVar;
            if (this.v5 != null) {
                this.v5.ye(nuVar != null ? new ov0(nuVar) : null);
            }
        } catch (RemoteException e) {
            xp.Zo("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void Hw(String str) {
        if (this.Zo != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        }
        this.Zo = str;
    }

    public final void VH() {
        try {
            EQ("show");
            this.v5.showInterstitial();
        } catch (RemoteException e) {
            xp.Zo("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void Zo(abcd.pu puVar) {
        try {
            this.EQ = puVar;
            if (this.v5 != null) {
                this.v5.br(puVar != null ? new bk(puVar) : null);
            }
        } catch (RemoteException e) {
            xp.Zo("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void gn(hv0 hv0Var) {
        try {
            this.Hw = hv0Var;
            if (this.v5 != null) {
                this.v5.JX(hv0Var != null ? new iv0(hv0Var) : null);
            }
        } catch (RemoteException e) {
            xp.Zo("#008 Must be called on the main UI thread.", e);
        }
    }

    public final Bundle j6() {
        try {
            if (this.v5 != null) {
                return this.v5.XX();
            }
        } catch (RemoteException e) {
            xp.Zo("#008 Must be called on the main UI thread.", e);
        }
        return new Bundle();
    }

    public final void tp(boolean z) {
        this.we = true;
    }

    public final void u7(fy0 fy0Var) {
        try {
            if (this.v5 == null) {
                if (this.Zo == null) {
                    EQ("loadAd");
                }
                zzwf zzwfVarQX = this.we ? zzwf.QX() : new zzwf();
                uv0 uv0VarDW = cw0.DW();
                Context context = this.DW;
                uw0 uw0VarDW = new yv0(uv0VarDW, context, zzwfVarQX, this.Zo, this.j6).DW(context, false);
                this.v5 = uw0VarDW;
                if (this.FH != null) {
                    uw0VarDW.xt(new kv0(this.FH));
                }
                if (this.Hw != null) {
                    this.v5.JX(new iv0(this.Hw));
                }
                if (this.VH != null) {
                    this.v5.ye(new ov0(this.VH));
                }
                if (this.gn != null) {
                    this.v5.lR(new tv0(this.gn));
                }
                if (this.u7 != null) {
                    this.v5.rB(new m0(this.u7));
                }
                if (this.tp != null) {
                    this.tp.j6();
                    throw null;
                }
                if (this.EQ != null) {
                    this.v5.br(new bk(this.EQ));
                }
                this.v5.sG(this.J0);
            }
            if (this.v5.p8(rv0.j6(this.DW, fy0Var))) {
                this.j6.MU(fy0Var.J8());
            }
        } catch (RemoteException e) {
            xp.Zo("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void v5(boolean z) {
        try {
            this.J0 = z;
            if (this.v5 != null) {
                this.v5.sG(z);
            }
        } catch (RemoteException e) {
            xp.Zo("#008 Must be called on the main UI thread.", e);
        }
    }

    public zzzb(Context context, PublisherInterstitialAd publisherInterstitialAd) {
        this(context, rv0.j6, publisherInterstitialAd);
    }

    private zzzb(Context context, rv0 rv0Var, PublisherInterstitialAd publisherInterstitialAd) {
        this.j6 = new ja();
        this.DW = context;
    }
}
