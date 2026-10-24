package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.gmsg.zzaa;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class uq0 implements er0 {
    private final Context DW;
    private final zzaa FH;
    private k8 Hw;
    private final iq0 j6;
    private boolean v5;
    private final com.google.android.gms.ads.internal.gmsg.b0<t8> Zo = new zq0(this);
    private final com.google.android.gms.ads.internal.gmsg.b0<t8> VH = new ar0(this);
    private final com.google.android.gms.ads.internal.gmsg.b0<t8> gn = new br0(this);
    private final com.google.android.gms.ads.internal.gmsg.b0<t8> u7 = new dr0(this);

    public uq0(iq0 iq0Var, u7 u7Var, Context context) {
        this.j6 = iq0Var;
        this.DW = context;
        this.FH = new zzaa(context);
        k8 k8VarGn = u7Var.gn(null);
        this.Hw = k8VarGn;
        k8VarGn.j6(new vq0(this), new wq0(this));
        String strValueOf = String.valueOf(this.j6.fY.Hw());
        xp.VH(strValueOf.length() != 0 ? "Core JS tracking ad unit: ".concat(strValueOf) : new String("Core JS tracking ad unit: "));
    }

    static /* synthetic */ boolean Zo(uq0 uq0Var, boolean z) {
        uq0Var.v5 = true;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.er0
    public final void DW(JSONObject jSONObject, boolean z) {
        this.Hw.j6(new xq0(this, jSONObject), new jr());
    }

    @Override // com.google.android.gms.internal.ads.er0
    public final void FH() {
        this.Hw.j6(new yq0(this), new jr());
        this.Hw.v5();
    }

    final void gn(t8 t8Var) {
        t8Var.g3("/visibilityChanged", this.gn);
        t8Var.g3("/untrackActiveViewUnit", this.VH);
        t8Var.g3("/updateActiveView", this.Zo);
        if (com.google.android.gms.ads.internal.w0.ei().U2(this.DW)) {
            t8Var.g3("/logScionEvent", this.u7);
        }
    }

    @Override // com.google.android.gms.internal.ads.er0
    public final boolean j6() {
        return this.v5;
    }

    final void v5(t8 t8Var) {
        t8Var.sh("/updateActiveView", this.Zo);
        t8Var.sh("/untrackActiveViewUnit", this.VH);
        t8Var.sh("/visibilityChanged", this.gn);
        if (com.google.android.gms.ads.internal.w0.ei().U2(this.DW)) {
            t8Var.sh("/logScionEvent", this.u7);
        }
    }
}
