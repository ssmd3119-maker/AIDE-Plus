package com.google.android.gms.internal.ads;

import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class le extends om {
    private final je fY;
    private final zl k2;
    private final zzasm qp;

    public le(zl zlVar, je jeVar) {
        this.k2 = zlVar;
        this.qp = zlVar.DW;
        this.fY = jeVar;
    }

    @Override // com.google.android.gms.internal.ads.om
    public final void gn() {
        zl zlVar = this.k2;
        zzasi zzasiVar = zlVar.j6;
        zzwb zzwbVar = zzasiVar.jw;
        zzasm zzasmVar = this.qp;
        int i = zzasmVar.Z1;
        long j = zzasmVar.q7;
        String str = zzasiVar.w9;
        long j2 = zzasmVar.hK;
        zzwf zzwfVar = zlVar.Hw;
        long j3 = zzasmVar.AL;
        long j4 = zlVar.Zo;
        long j5 = zzasmVar.Q6;
        String str2 = zzasmVar.kf;
        JSONObject jSONObject = zlVar.gn;
        zzasm zzasmVar2 = zlVar.DW;
        bn.gn.post(new me(this, new yl(zzwbVar, null, null, 0, null, null, i, j, str, false, null, null, null, null, null, j2, zzwfVar, j3, j4, j5, str2, jSONObject, null, null, null, null, zzasmVar2.a5, zzasmVar2.ys, null, null, null, zlVar.u7, zzasmVar2.Bx, zlVar.tp, zzasmVar2.qP, null, zzasmVar2.Of, zzasmVar2.PT, zzasmVar2.AR)));
    }

    @Override // com.google.android.gms.internal.ads.om
    public final void v5() {
    }
}
