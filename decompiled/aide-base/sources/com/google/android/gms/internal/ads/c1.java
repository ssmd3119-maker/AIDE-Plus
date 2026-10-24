package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class c1 extends b4 implements k1 {
    private String AL;
    private h1 Jl;
    private Bundle Q6;
    private String WB;
    private abcd.wu Z1;
    private yx0 cT;
    private f2 fY;
    private p0 hK;
    private String jw;
    private String k2;
    private final Object kf = new Object();
    private List<u0> mb;
    private String n5;
    private View q7;
    private String qp;
    private String w9;
    private double zh;

    public c1(String str, List<u0> list, String str2, f2 f2Var, String str3, String str4, double d, String str5, String str6, p0 p0Var, yx0 yx0Var, View view, abcd.wu wuVar, String str7, Bundle bundle) {
        this.WB = str;
        this.mb = list;
        this.jw = str2;
        this.fY = f2Var;
        this.qp = str3;
        this.k2 = str4;
        this.zh = d;
        this.AL = str5;
        this.w9 = str6;
        this.hK = p0Var;
        this.cT = yx0Var;
        this.q7 = view;
        this.Z1 = wuVar;
        this.n5 = str7;
        this.Q6 = bundle;
    }

    static /* synthetic */ h1 Mt(c1 c1Var, h1 h1Var) {
        c1Var.Jl = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final void DV(ux0 ux0Var) {
    }

    @Override // com.google.android.gms.internal.ads.a4, com.google.android.gms.internal.ads.k1
    public final List DW() {
        return this.mb;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final String FH() {
        return this.WB;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final a2 Hw() {
        return this.hK;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final p0 KX() {
        return this.hK;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final void Pa() {
        synchronized (this.kf) {
            if (this.Jl == null) {
                return;
            }
            this.Jl.Pa();
        }
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final void Q6() {
        synchronized (this.kf) {
            if (this.Jl == null) {
                return;
            }
            this.Jl.Q6();
        }
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final abcd.wu QX() {
        return abcd.xu.sy(this.Jl);
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final String Vm() {
        return "6";
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final void Ws(Bundle bundle) {
        synchronized (this.kf) {
            if (this.Jl == null) {
                xp.j6("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.Jl.Ws(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final void XG() {
        this.Jl.XG();
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final void Yt(rx0 rx0Var) {
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final String Zo() {
        return this.qp;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final double a8() {
        return this.zh;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final String aM() {
        return this.w9;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final void destroy() {
        bn.gn.post(new e1(this));
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final String er() {
        return this.k2;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final boolean fr() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final yx0 getVideoController() {
        return this.cT;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final String gn() {
        return this.jw;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final f2 j3() {
        return this.fY;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final List kD() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final boolean lg(Bundle bundle) {
        synchronized (this.kf) {
            if (this.Jl == null) {
                xp.j6("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            return this.Jl.lg(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final void rN(Bundle bundle) {
        synchronized (this.kf) {
            if (this.Jl == null) {
                xp.j6("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.Jl.rN(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void s5(h1 h1Var) {
        synchronized (this.kf) {
            this.Jl = h1Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final void sE(y3 y3Var) {
        this.Jl.sE(y3Var);
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final View tX() {
        return this.q7;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final Bundle tp() {
        return this.Q6;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final String u7() {
        return this.n5;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final abcd.wu v5() {
        return this.Z1;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final String vy() {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final String yS() {
        return this.AL;
    }
}
