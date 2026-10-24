package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@jg
/* loaded from: classes.dex */
public final class ej {
    private static final ja VH = new ja();
    private final com.google.android.gms.ads.internal.x0 DW;
    private final Map<String, rk> FH = new HashMap();
    private final kk Hw;
    private final je Zo;
    private final ka j6;
    private final com.google.android.gms.ads.internal.gmsg.i v5;

    public ej(com.google.android.gms.ads.internal.x0 x0Var, ka kaVar, kk kkVar, com.google.android.gms.ads.internal.gmsg.i iVar, je jeVar) {
        this.DW = x0Var;
        this.j6 = kaVar;
        this.Hw = kkVar;
        this.v5 = iVar;
        this.Zo = jeVar;
    }

    public static boolean v5(yl ylVar, yl ylVar2) {
        return true;
    }

    public final void DW(Context context) {
        Iterator<rk> it = this.FH.values().iterator();
        while (it.hasNext()) {
            try {
                it.next().j6().bI(abcd.xu.sy(context));
            } catch (RemoteException e) {
                xp.Hw("Unable to call Adapter.onContextChanged.", e);
            }
        }
    }

    public final void EQ() {
        com.google.android.gms.ads.internal.x0 x0Var = this.DW;
        x0Var.BR = 0;
        com.google.android.gms.ads.internal.w0.Hw();
        com.google.android.gms.ads.internal.x0 x0Var2 = this.DW;
        nk nkVar = new nk(x0Var2.jw, x0Var2.cT, this);
        String strValueOf = String.valueOf(nk.class.getName());
        xp.VH(strValueOf.length() != 0 ? "AdRenderer: ".concat(strValueOf) : new String("AdRenderer: "));
        nkVar.VH();
        x0Var.AL = nkVar;
    }

    public final void FH() {
        com.google.android.gms.common.internal.p.Hw("pause must be called on the main UI thread.");
        Iterator<String> it = this.FH.keySet().iterator();
        while (it.hasNext()) {
            try {
                rk rkVar = this.FH.get(it.next());
                if (rkVar != null && rkVar.j6() != null) {
                    rkVar.j6().Mr();
                }
            } catch (RemoteException e) {
                xp.Zo("#007 Could not call remote method.", e);
            }
        }
    }

    public final void Hw() {
        com.google.android.gms.common.internal.p.Hw("resume must be called on the main UI thread.");
        Iterator<String> it = this.FH.keySet().iterator();
        while (it.hasNext()) {
            try {
                rk rkVar = this.FH.get(it.next());
                if (rkVar != null && rkVar.j6() != null) {
                    rkVar.j6().XL();
                }
            } catch (RemoteException e) {
                xp.Zo("#007 Could not call remote method.", e);
            }
        }
    }

    public final void J0() {
        yl ylVar = this.DW.hK;
        if (ylVar == null || ylVar.QX == null) {
            return;
        }
        com.google.android.gms.ads.internal.w0.er();
        com.google.android.gms.ads.internal.x0 x0Var = this.DW;
        Context context = x0Var.jw;
        String str = x0Var.qp.WB;
        yl ylVar2 = x0Var.hK;
        ca.FH(context, str, ylVar2, x0Var.mb, false, ylVar2.QX.J8);
    }

    public final zzawd VH(zzawd zzawdVar) {
        u9 u9Var;
        yl ylVar = this.DW.hK;
        if (ylVar != null && (u9Var = ylVar.j3) != null && !TextUtils.isEmpty(u9Var.EQ)) {
            u9 u9Var2 = this.DW.hK.j3;
            zzawdVar = new zzawd(u9Var2.EQ, u9Var2.we);
        }
        yl ylVar2 = this.DW.hK;
        if (ylVar2 != null && ylVar2.QX != null) {
            com.google.android.gms.ads.internal.w0.er();
            com.google.android.gms.ads.internal.x0 x0Var = this.DW;
            ca.Hw(x0Var.jw, x0Var.qp.WB, x0Var.hK.QX.J0, x0Var.a5, x0Var.ys, zzawdVar);
        }
        return zzawdVar;
    }

    public final void Zo(boolean z) {
        rk rkVarGn = gn(this.DW.hK.aM);
        if (rkVarGn == null || rkVarGn.j6() == null) {
            return;
        }
        try {
            rkVarGn.j6().sG(z);
            rkVarGn.j6().showVideo();
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    public final rk gn(String str) {
        rk rkVar;
        rk rkVar2 = this.FH.get(str);
        if (rkVar2 != null) {
            return rkVar2;
        }
        try {
            ka kaVar = this.j6;
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                kaVar = VH;
            }
            rkVar = new rk(kaVar.wu(str), this.Hw);
        } catch (Exception e) {
            e = e;
        }
        try {
            this.FH.put(str, rkVar);
            return rkVar;
        } catch (Exception e2) {
            e = e2;
            rkVar2 = rkVar;
            String strValueOf = String.valueOf(str);
            xp.v5(strValueOf.length() != 0 ? "Fail to instantiate adapter ".concat(strValueOf) : new String("Fail to instantiate adapter "), e);
            return rkVar2;
        }
    }

    public final void j6() {
        com.google.android.gms.common.internal.p.Hw("destroy must be called on the main UI thread.");
        Iterator<String> it = this.FH.keySet().iterator();
        while (it.hasNext()) {
            try {
                rk rkVar = this.FH.get(it.next());
                if (rkVar != null && rkVar.j6() != null) {
                    rkVar.j6().destroy();
                }
            } catch (RemoteException e) {
                xp.Zo("#007 Could not call remote method.", e);
            }
        }
    }

    public final je tp() {
        return this.Zo;
    }

    public final com.google.android.gms.ads.internal.gmsg.i u7() {
        return this.v5;
    }

    public final void we() {
        yl ylVar = this.DW.hK;
        if (ylVar == null || ylVar.QX == null) {
            return;
        }
        com.google.android.gms.ads.internal.w0.er();
        com.google.android.gms.ads.internal.x0 x0Var = this.DW;
        Context context = x0Var.jw;
        String str = x0Var.qp.WB;
        yl ylVar2 = x0Var.hK;
        ca.FH(context, str, ylVar2, x0Var.mb, false, ylVar2.QX.we);
    }
}
