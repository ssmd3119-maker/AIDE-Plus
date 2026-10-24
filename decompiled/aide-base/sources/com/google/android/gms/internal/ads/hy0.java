package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicBoolean;

@jg
/* loaded from: classes.dex */
public final class hy0 {
    private final com.google.android.gms.ads.g DW;
    private com.google.android.gms.ads.h EQ;
    private final ew0 FH;
    private hv0 Hw;
    private ViewGroup J0;
    private int J8;
    private com.google.android.gms.ads.doubleclick.a VH;
    private boolean Ws;
    private com.google.android.gms.ads.d[] Zo;
    private com.google.android.gms.ads.e gn;
    private final ja j6;
    private com.google.android.gms.ads.doubleclick.c tp;
    private uw0 u7;
    private com.google.android.gms.ads.a v5;
    private String we;

    public hy0(ViewGroup viewGroup) {
        this(viewGroup, null, false, rv0.j6, 0);
    }

    private static zzwf a8(Context context, com.google.android.gms.ads.d[] dVarArr, int i) {
        zzwf zzwfVar = new zzwf(context, dVarArr);
        zzwfVar.hK = gW(i);
        return zzwfVar;
    }

    private static boolean gW(int i) {
        return i == 1;
    }

    public final com.google.android.gms.ads.a DW() {
        return this.v5;
    }

    public final void EQ() {
        try {
            if (this.u7 != null) {
                this.u7.Mr();
            }
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    public final com.google.android.gms.ads.d FH() {
        zzwf zzwfVarI8;
        try {
            if (this.u7 != null && (zzwfVarI8 = this.u7.I8()) != null) {
                return zzwfVarI8.aM();
            }
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
        com.google.android.gms.ads.d[] dVarArr = this.Zo;
        if (dVarArr != null) {
            return dVarArr[0];
        }
        return null;
    }

    public final com.google.android.gms.ads.d[] Hw() {
        return this.Zo;
    }

    public final void J0(com.google.android.gms.ads.a aVar) {
        this.v5 = aVar;
        this.FH.J0(aVar);
    }

    public final void J8(com.google.android.gms.ads.d... dVarArr) {
        if (this.Zo != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        er(dVarArr);
    }

    public final void Mr(com.google.android.gms.ads.h hVar) {
        this.EQ = hVar;
        try {
            if (this.u7 != null) {
                this.u7.Zz(hVar == null ? null : new zzzw(hVar));
            }
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    public final void QX(com.google.android.gms.ads.doubleclick.a aVar) {
        try {
            this.VH = aVar;
            if (this.u7 != null) {
                this.u7.lR(aVar != null ? new tv0(aVar) : null);
            }
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    public final String VH() {
        try {
            if (this.u7 != null) {
                return this.u7.Jl();
            }
            return null;
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final void Ws(String str) {
        if (this.we != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.we = str;
    }

    public final void XL(com.google.android.gms.ads.e eVar) {
        this.gn = eVar;
        try {
            if (this.u7 != null) {
                uw0 uw0Var = this.u7;
                if (eVar == null) {
                    uw0Var.ek(null);
                } else {
                    eVar.j6();
                    throw null;
                }
            }
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    public final com.google.android.gms.ads.doubleclick.a Zo() {
        return this.VH;
    }

    public final void aM(boolean z) {
        this.Ws = z;
        try {
            if (this.u7 != null) {
                this.u7.ir(z);
            }
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    public final void er(com.google.android.gms.ads.d... dVarArr) {
        this.Zo = dVarArr;
        try {
            if (this.u7 != null) {
                this.u7.dz(a8(this.J0.getContext(), this.Zo, this.J8));
            }
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
        this.J0.requestLayout();
    }

    public final com.google.android.gms.ads.doubleclick.c gn() {
        return this.tp;
    }

    public final void j3(com.google.android.gms.ads.doubleclick.c cVar) {
        this.tp = cVar;
        try {
            if (this.u7 != null) {
                this.u7.rB(cVar != null ? new m0(cVar) : null);
            }
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    public final void j6() {
        try {
            if (this.u7 != null) {
                this.u7.destroy();
            }
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    public final void lg(hv0 hv0Var) {
        try {
            this.Hw = hv0Var;
            if (this.u7 != null) {
                this.u7.JX(hv0Var != null ? new iv0(hv0Var) : null);
            }
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    public final void rN(fy0 fy0Var) {
        try {
            if (this.u7 == null) {
                if ((this.Zo == null || this.we == null) && this.u7 == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.J0.getContext();
                zzwf zzwfVarA8 = a8(context, this.Zo, this.J8);
                uw0 uw0VarDW = "search_v2".equals(zzwfVarA8.WB) ? new xv0(cw0.DW(), context, zzwfVarA8, this.we).DW(context, false) : new vv0(cw0.DW(), context, zzwfVarA8, this.we, this.j6).DW(context, false);
                this.u7 = uw0VarDW;
                uw0VarDW.xt(new kv0(this.FH));
                if (this.Hw != null) {
                    this.u7.JX(new iv0(this.Hw));
                }
                if (this.VH != null) {
                    this.u7.lR(new tv0(this.VH));
                }
                if (this.tp != null) {
                    this.u7.rB(new m0(this.tp));
                }
                if (this.gn != null) {
                    this.gn.j6();
                    throw null;
                }
                if (this.EQ != null) {
                    this.u7.Zz(new zzzw(this.EQ));
                }
                this.u7.ir(this.Ws);
                try {
                    abcd.wu wuVarTv = this.u7.Tv();
                    if (wuVarTv != null) {
                        this.J0.addView((View) abcd.xu.g3(wuVarTv));
                    }
                } catch (RemoteException e) {
                    xp.Zo("#007 Could not call remote method.", e);
                }
            }
            if (this.u7.p8(rv0.j6(this.J0.getContext(), fy0Var))) {
                this.j6.MU(fy0Var.J8());
            }
        } catch (RemoteException e2) {
            xp.Zo("#007 Could not call remote method.", e2);
        }
    }

    public final com.google.android.gms.ads.h tp() {
        return this.EQ;
    }

    public final com.google.android.gms.ads.g u7() {
        return this.DW;
    }

    public final String v5() {
        uw0 uw0Var;
        if (this.we == null && (uw0Var = this.u7) != null) {
            try {
                this.we = uw0Var.Nh();
            } catch (RemoteException e) {
                xp.Zo("#007 Could not call remote method.", e);
            }
        }
        return this.we;
    }

    public final void we() {
        try {
            if (this.u7 != null) {
                this.u7.XL();
            }
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    public final yx0 yS() {
        uw0 uw0Var = this.u7;
        if (uw0Var == null) {
            return null;
        }
        try {
            return uw0Var.getVideoController();
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
            return null;
        }
    }

    public hy0(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, rv0.j6, i);
    }

    public hy0(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, rv0.j6, 0);
    }

    public hy0(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, false, rv0.j6, i);
    }

    private hy0(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, rv0 rv0Var, uw0 uw0Var, int i) {
        this.j6 = new ja();
        this.DW = new com.google.android.gms.ads.g();
        this.FH = new jy0(this);
        this.J0 = viewGroup;
        this.u7 = null;
        new AtomicBoolean(false);
        this.J8 = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzwi zzwiVar = new zzwi(context, attributeSet);
                this.Zo = zzwiVar.FH(z);
                this.we = zzwiVar.j6();
                if (viewGroup.isInEditMode()) {
                    mp mpVarJ6 = cw0.j6();
                    com.google.android.gms.ads.d dVar = this.Zo[0];
                    int i2 = this.J8;
                    zzwf zzwfVar = new zzwf(context, dVar);
                    zzwfVar.hK = gW(i2);
                    mpVarJ6.Zo(viewGroup, zzwfVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                cw0.j6().gn(viewGroup, new zzwf(context, com.google.android.gms.ads.d.Hw), e.getMessage(), e.getMessage());
            }
        }
    }

    private hy0(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, rv0 rv0Var, int i) {
        this(viewGroup, attributeSet, z, rv0Var, null, i);
    }
}
