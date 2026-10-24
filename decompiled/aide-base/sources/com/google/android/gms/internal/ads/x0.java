package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class x0 extends y2 implements k1 {
    private Bundle AL;
    private String WB;
    private Object Z1 = new Object();
    private abcd.wu cT;
    private f2 fY;
    private View hK;
    private String jw;
    private String k2;
    private List<u0> mb;
    private h1 n5;
    private String q7;
    private String qp;
    private yx0 w9;
    private p0 zh;

    public x0(String str, List<u0> list, String str2, f2 f2Var, String str3, String str4, p0 p0Var, Bundle bundle, yx0 yx0Var, View view, abcd.wu wuVar, String str5) {
        this.WB = str;
        this.mb = list;
        this.jw = str2;
        this.fY = f2Var;
        this.qp = str3;
        this.k2 = str4;
        this.zh = p0Var;
        this.AL = bundle;
        this.w9 = yx0Var;
        this.hK = view;
        this.cT = wuVar;
        this.q7 = str5;
    }

    static /* synthetic */ h1 Mt(x0 x0Var, h1 h1Var) {
        x0Var.n5 = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.x2, com.google.android.gms.internal.ads.k1
    public final List DW() {
        return this.mb;
    }

    @Override // com.google.android.gms.internal.ads.x2
    public final String FH() {
        return this.WB;
    }

    @Override // com.google.android.gms.internal.ads.x2
    public final a2 Hw() {
        return this.zh;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final p0 KX() {
        return this.zh;
    }

    @Override // com.google.android.gms.internal.ads.x2
    public final abcd.wu QX() {
        return abcd.xu.sy(this.n5);
    }

    @Override // com.google.android.gms.internal.ads.x2
    public final f2 TI() {
        return this.fY;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final String Vm() {
        return "1";
    }

    @Override // com.google.android.gms.internal.ads.x2
    public final void Ws(Bundle bundle) {
        synchronized (this.Z1) {
            if (this.n5 == null) {
                xp.j6("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.n5.Ws(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.x2
    public final String Zo() {
        return this.qp;
    }

    @Override // com.google.android.gms.internal.ads.x2
    public final void destroy() {
        bn.gn.post(new y0(this));
        this.WB = null;
        this.mb = null;
        this.jw = null;
        this.fY = null;
        this.qp = null;
        this.k2 = null;
        this.zh = null;
        this.AL = null;
        this.Z1 = null;
        this.w9 = null;
        this.hK = null;
    }

    @Override // com.google.android.gms.internal.ads.x2
    public final String er() {
        return this.k2;
    }

    @Override // com.google.android.gms.internal.ads.x2
    public final yx0 getVideoController() {
        return this.w9;
    }

    @Override // com.google.android.gms.internal.ads.x2
    public final String gn() {
        return this.jw;
    }

    @Override // com.google.android.gms.internal.ads.x2
    public final boolean lg(Bundle bundle) {
        synchronized (this.Z1) {
            if (this.n5 == null) {
                xp.j6("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            return this.n5.lg(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.x2
    public final void rN(Bundle bundle) {
        synchronized (this.Z1) {
            if (this.n5 == null) {
                xp.j6("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.n5.rN(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void s5(h1 h1Var) {
        synchronized (this.Z1) {
            this.n5 = h1Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final View tX() {
        return this.hK;
    }

    @Override // com.google.android.gms.internal.ads.x2
    public final Bundle tp() {
        return this.AL;
    }

    @Override // com.google.android.gms.internal.ads.x2
    public final String u7() {
        return this.q7;
    }

    @Override // com.google.android.gms.internal.ads.x2
    public final abcd.wu v5() {
        return this.cT;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final String vy() {
        return "";
    }
}
