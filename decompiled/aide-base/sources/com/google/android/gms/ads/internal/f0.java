package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.internal.ads.ih;
import com.google.android.gms.internal.ads.jq;
import com.google.android.gms.internal.ads.zl;
import com.google.android.gms.internal.ads.zzasi;
import com.google.android.gms.internal.ads.zzwb;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f0 implements Callable<com.google.android.gms.internal.ads.j1> {
    private final /* synthetic */ JSONArray DW;
    private final /* synthetic */ int FH;
    private final /* synthetic */ zl Hw;
    private final /* synthetic */ int j6;
    private final /* synthetic */ c0 v5;

    f0(c0 c0Var, int i, JSONArray jSONArray, int i2, zl zlVar) {
        this.v5 = c0Var;
        this.j6 = i;
        this.DW = jSONArray;
        this.FH = i2;
        this.Hw = zlVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ com.google.android.gms.internal.ads.j1 call() throws JSONException {
        if (this.j6 >= this.DW.length()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.DW.get(this.j6));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ads", jSONArray);
        c0 c0Var = this.v5;
        x0 x0Var = c0Var.k2;
        c0 c0Var2 = new c0(x0Var.jw, c0Var.q7, x0Var.w9, x0Var.mb, c0Var.Z1, x0Var.qp, true);
        c0.se(this.v5.k2, c0Var2.k2);
        c0Var2.iy();
        c0Var2.k6(this.v5.mb);
        com.google.android.gms.internal.ads.d0 d0Var = c0Var2.WB;
        int i = this.j6;
        d0Var.Zo("num_ads_requested", String.valueOf(this.FH));
        d0Var.Zo("ad_index", String.valueOf(i));
        zzasi zzasiVar = this.Hw.j6;
        String string = jSONObject.toString();
        Bundle bundle = zzasiVar.jw.jw != null ? new Bundle(zzasiVar.jw.jw) : new Bundle();
        bundle.putString("_ad", string);
        zzwb zzwbVar = zzasiVar.jw;
        c0Var2.B9(new ih(zzasiVar.mb, new zzwb(zzwbVar.WB, zzwbVar.mb, bundle, zzwbVar.fY, zzwbVar.qp, zzwbVar.k2, zzwbVar.zh, zzwbVar.AL, zzwbVar.w9, zzwbVar.hK, zzwbVar.cT, zzwbVar.q7, zzwbVar.Z1, zzwbVar.n5, zzwbVar.Q6, zzwbVar.kf, zzwbVar.Jl, zzwbVar.iW, null, zzwbVar.e3, zzwbVar.sE), zzasiVar.fY, zzasiVar.qp, zzasiVar.k2, zzasiVar.zh, zzasiVar.w9, zzasiVar.hK, zzasiVar.cT, zzasiVar.q7, zzasiVar.n5, zzasiVar.Cz, zzasiVar.Q6, zzasiVar.kf, zzasiVar.Jl, zzasiVar.iW, zzasiVar.eU, zzasiVar.e3, zzasiVar.sE, zzasiVar.sg, zzasiVar.pO, zzasiVar.fN, zzasiVar.Gj, zzasiVar.oy, zzasiVar.aX, zzasiVar.IS, zzasiVar.e9, zzasiVar.QO, zzasiVar.sM, zzasiVar.a5, jq.J0(zzasiVar.ys), zzasiVar.gG, zzasiVar.Nh, zzasiVar.BR, zzasiVar.AE, zzasiVar.Za, zzasiVar.An, zzasiVar.Pa, zzasiVar.ce, zzasiVar.qP, jq.J0(zzasiVar.AL), zzasiVar.MP, zzasiVar.Of, zzasiVar.PT, 1, zzasiVar.AR, zzasiVar.TI, zzasiVar.ct, zzasiVar.Fd, zzasiVar.Lz, zzasiVar.sT, zzasiVar.xg), c0Var2.WB);
        return c0Var2.wZ().get();
    }
}
