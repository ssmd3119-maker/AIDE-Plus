package com.google.android.gms.internal.ads;

import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class zl {
    public final zzasm DW;
    public final u9 FH;
    public final zzwf Hw;
    public final long VH;
    public final long Zo;
    public final JSONObject gn;
    public final zzasi j6;
    public final boolean tp;
    public final pt0 u7;
    public final int v5;

    public zl(zzasi zzasiVar, zzasm zzasmVar, u9 u9Var, zzwf zzwfVar, int i, long j, long j2, JSONObject jSONObject, zzur zzurVar) {
        this.j6 = zzasiVar;
        this.DW = zzasmVar;
        this.FH = null;
        this.Hw = null;
        this.v5 = i;
        this.Zo = j;
        this.VH = j2;
        this.gn = null;
        this.u7 = new pt0(zzurVar);
        this.tp = false;
    }

    public zl(zzasi zzasiVar, zzasm zzasmVar, u9 u9Var, zzwf zzwfVar, int i, long j, long j2, JSONObject jSONObject, pt0 pt0Var, Boolean bool) {
        this.j6 = zzasiVar;
        this.DW = zzasmVar;
        this.FH = u9Var;
        this.Hw = zzwfVar;
        this.v5 = i;
        this.Zo = j;
        this.VH = j2;
        this.gn = jSONObject;
        this.u7 = pt0Var;
        if (bool != null) {
            this.tp = bool.booleanValue();
        } else {
            this.tp = ep.j6(zzasiVar.jw.Z1);
        }
    }
}
