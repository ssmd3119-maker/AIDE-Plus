package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class qe extends om {
    private final Object AL;
    private final je fY;
    private final zl k2;
    private final zzasm qp;
    private Future<yl> w9;
    private final te zh;

    public qe(Context context, com.google.android.gms.ads.internal.c0 c0Var, zl zlVar, vb0 vb0Var, je jeVar, d0 d0Var) {
        this(zlVar, jeVar, new te(context, c0Var, new zzazs(context), vb0Var, zlVar, d0Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.om
    public final void gn() {
        int i;
        vq vqVarJ6;
        yl ylVar = null;
        try {
            try {
                synchronized (this.AL) {
                    vqVarJ6 = zm.j6(this.zh);
                    this.w9 = vqVarJ6;
                }
                ylVar = (yl) vqVarJ6.get(60000L, TimeUnit.MILLISECONDS);
                i = -2;
            } catch (TimeoutException unused) {
                xp.u7("Timed out waiting for native ad.");
                this.w9.cancel(true);
                i = 2;
            }
        } catch (InterruptedException | CancellationException | ExecutionException unused2) {
            i = 0;
        }
        if (ylVar == null) {
            zl zlVar = this.k2;
            zzasi zzasiVar = zlVar.j6;
            zzwb zzwbVar = zzasiVar.jw;
            zzasm zzasmVar = this.qp;
            int i2 = zzasmVar.Z1;
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
            ylVar = new yl(zzwbVar, null, null, i, null, null, i2, j, str, false, null, null, null, null, null, j2, zzwfVar, j3, j4, j5, str2, jSONObject, null, null, null, null, zzasmVar2.a5, zzasmVar2.ys, null, null, zzasmVar.An, zlVar.u7, zzasmVar2.Bx, false, zzasmVar2.qP, null, zzasmVar2.Of, zzasmVar2.PT, zzasmVar2.AR);
        }
        bn.gn.post(new re(this, ylVar));
    }

    @Override // com.google.android.gms.internal.ads.om
    public final void v5() {
        synchronized (this.AL) {
            if (this.w9 != null) {
                this.w9.cancel(true);
            }
        }
    }

    private qe(zl zlVar, je jeVar, te teVar) {
        this.AL = new Object();
        this.k2 = zlVar;
        this.qp = zlVar.DW;
        this.fY = jeVar;
        this.zh = teVar;
    }
}
