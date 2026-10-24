package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class v0 extends u2 implements k1 {
    private String AL;
    private Object Q6 = new Object();
    private String WB;
    private abcd.wu Z1;
    private yx0 cT;
    private f2 fY;
    private Bundle hK;
    private String jw;
    private double k2;
    private h1 kf;
    private List<u0> mb;
    private String n5;
    private View q7;
    private String qp;
    private p0 w9;
    private String zh;

    public v0(String str, List<u0> list, String str2, f2 f2Var, String str3, double d, String str4, String str5, p0 p0Var, Bundle bundle, yx0 yx0Var, View view, abcd.wu wuVar, String str6) {
        this.WB = str;
        this.mb = list;
        this.jw = str2;
        this.fY = f2Var;
        this.qp = str3;
        this.k2 = d;
        this.zh = str4;
        this.AL = str5;
        this.w9 = p0Var;
        this.hK = bundle;
        this.cT = yx0Var;
        this.q7 = view;
        this.Z1 = wuVar;
        this.n5 = str6;
    }

    static /* synthetic */ h1 Mt(v0 v0Var, h1 h1Var) {
        v0Var.kf = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.t2, com.google.android.gms.internal.ads.k1
    public final List DW() {
        return this.mb;
    }

    @Override // com.google.android.gms.internal.ads.t2
    public final String FH() {
        return this.WB;
    }

    @Override // com.google.android.gms.internal.ads.t2
    public final a2 Hw() {
        return this.w9;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final p0 KX() {
        return this.w9;
    }

    @Override // com.google.android.gms.internal.ads.t2
    public final abcd.wu QX() {
        return abcd.xu.sy(this.kf);
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final String Vm() {
        return "2";
    }

    @Override // com.google.android.gms.internal.ads.t2
    public final void Ws(Bundle bundle) {
        synchronized (this.Q6) {
            if (this.kf == null) {
                xp.j6("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.kf.Ws(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t2
    public final String Zo() {
        return this.qp;
    }

    @Override // com.google.android.gms.internal.ads.t2
    public final double a8() {
        return this.k2;
    }

    @Override // com.google.android.gms.internal.ads.t2
    public final String aM() {
        return this.AL;
    }

    @Override // com.google.android.gms.internal.ads.t2
    public final void destroy() {
        bn.gn.post(new w0(this));
        this.WB = null;
        this.mb = null;
        this.jw = null;
        this.fY = null;
        this.qp = null;
        this.k2 = 0.0d;
        this.zh = null;
        this.AL = null;
        this.w9 = null;
        this.hK = null;
        this.Q6 = null;
        this.cT = null;
        this.q7 = null;
    }

    @Override // com.google.android.gms.internal.ads.t2
    public final yx0 getVideoController() {
        return this.cT;
    }

    @Override // com.google.android.gms.internal.ads.t2
    public final String gn() {
        return this.jw;
    }

    @Override // com.google.android.gms.internal.ads.t2
    public final f2 j3() {
        return this.fY;
    }

    @Override // com.google.android.gms.internal.ads.t2
    public final boolean lg(Bundle bundle) {
        synchronized (this.Q6) {
            if (this.kf == null) {
                xp.j6("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            return this.kf.lg(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.t2
    public final void rN(Bundle bundle) {
        synchronized (this.Q6) {
            if (this.kf == null) {
                xp.j6("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.kf.rN(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void s5(h1 h1Var) {
        synchronized (this.Q6) {
            this.kf = h1Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final View tX() {
        return this.q7;
    }

    @Override // com.google.android.gms.internal.ads.t2
    public final Bundle tp() {
        return this.hK;
    }

    @Override // com.google.android.gms.internal.ads.t2
    public final String u7() {
        return this.n5;
    }

    @Override // com.google.android.gms.internal.ads.t2
    public final abcd.wu v5() {
        return this.Z1;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final String vy() {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.t2
    public final String yS() {
        return this.zh;
    }
}
