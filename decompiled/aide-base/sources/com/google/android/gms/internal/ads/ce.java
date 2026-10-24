package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public abstract class ce implements wn<Void>, lw {
    private final je WB;
    private final zl fY;
    protected final cv jw;
    private Runnable k2;
    protected final Context mb;
    protected zzasm qp;
    private AtomicBoolean zh = new AtomicBoolean(true);

    protected ce(Context context, zl zlVar, cv cvVar, je jeVar) {
        this.mb = context;
        this.fY = zlVar;
        this.qp = zlVar.DW;
        this.jw = cvVar;
        this.WB = jeVar;
    }

    protected void FH(int i) {
        if (i != -2) {
            this.qp = new zzasm(i, this.qp.q7);
        }
        this.jw.qN();
        je jeVar = this.WB;
        zl zlVar = this.fY;
        zzasi zzasiVar = zlVar.j6;
        zzwb zzwbVar = zzasiVar.jw;
        cv cvVar = this.jw;
        zzasm zzasmVar = this.qp;
        List<String> list = zzasmVar.qp;
        List<String> list2 = zzasmVar.zh;
        List<String> list3 = zzasmVar.cT;
        int i2 = zzasmVar.Z1;
        long j = zzasmVar.q7;
        String str = zzasiVar.w9;
        boolean z = zzasmVar.w9;
        long j2 = zzasmVar.hK;
        zzwf zzwfVar = zlVar.Hw;
        long j3 = zzasmVar.AL;
        long j4 = zlVar.Zo;
        long j5 = zzasmVar.Q6;
        String str2 = zzasmVar.kf;
        JSONObject jSONObject = zlVar.gn;
        zzawd zzawdVar = zzasmVar.e9;
        List<String> list4 = zzasmVar.QO;
        List<String> list5 = zzasmVar.sM;
        boolean z2 = zzasmVar.a5;
        zzaso zzasoVar = zzasmVar.ys;
        List<String> list6 = zzasmVar.Nh;
        String str3 = zzasmVar.An;
        pt0 pt0Var = zlVar.u7;
        zzasm zzasmVar2 = zlVar.DW;
        jeVar.BJ(new yl(zzwbVar, cvVar, list, i, list2, list3, i2, j, str, z, null, null, null, null, null, j2, zzwfVar, j3, j4, j5, str2, jSONObject, null, zzawdVar, list4, list5, z2, zzasoVar, null, list6, str3, pt0Var, zzasmVar2.Bx, zlVar.tp, zzasmVar2.qP, zzasmVar.MP, zzasmVar2.Of, zzasmVar2.PT, zzasmVar2.AR));
    }

    protected abstract void Hw();

    @Override // com.google.android.gms.internal.ads.wn
    public final /* synthetic */ Void VH() {
        com.google.android.gms.common.internal.p.Hw("Webview render task needs to be called on UI thread.");
        de deVar = new de(this);
        this.k2 = deVar;
        bn.gn.postDelayed(deVar, ((Long) cw0.v5().FH(p.ys)).longValue());
        Hw();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wn
    public void cancel() {
        if (this.zh.getAndSet(false)) {
            this.jw.stopLoading();
            com.google.android.gms.ads.internal.w0.VH();
            jn.aM(this.jw);
            FH(-1);
            bn.gn.removeCallbacks(this.k2);
        }
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void j6(boolean z) {
        xp.VH("WebView finished loading.");
        if (this.zh.getAndSet(false)) {
            FH(z ? -2 : 0);
            bn.gn.removeCallbacks(this.k2);
        }
    }
}
