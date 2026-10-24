package com.google.android.gms.internal.ads;

import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class qq0 implements er0 {
    private final cv DW;
    private final iq0 j6;
    private final com.google.android.gms.ads.internal.gmsg.b0<cv> FH = new rq0(this);
    private final com.google.android.gms.ads.internal.gmsg.b0<cv> Hw = new sq0(this);
    private final com.google.android.gms.ads.internal.gmsg.b0<cv> v5 = new tq0(this);

    public qq0(iq0 iq0Var, cv cvVar) {
        this.j6 = iq0Var;
        this.DW = cvVar;
        cvVar.sh("/updateActiveView", this.FH);
        cvVar.sh("/untrackActiveViewUnit", this.Hw);
        cvVar.sh("/visibilityChanged", this.v5);
        String strValueOf = String.valueOf(this.j6.fY.Hw());
        xp.VH(strValueOf.length() != 0 ? "Custom JS tracking ad unit: ".concat(strValueOf) : new String("Custom JS tracking ad unit: "));
    }

    @Override // com.google.android.gms.internal.ads.er0
    public final void DW(JSONObject jSONObject, boolean z) {
        if (z) {
            this.j6.we(this);
        } else {
            this.DW.tp("AFMA_updateActiveView", jSONObject);
        }
    }

    @Override // com.google.android.gms.internal.ads.er0
    public final void FH() {
        cv cvVar = this.DW;
        cvVar.g3("/visibilityChanged", this.v5);
        cvVar.g3("/untrackActiveViewUnit", this.Hw);
        cvVar.g3("/updateActiveView", this.FH);
    }

    @Override // com.google.android.gms.internal.ads.er0
    public final boolean j6() {
        return true;
    }
}
