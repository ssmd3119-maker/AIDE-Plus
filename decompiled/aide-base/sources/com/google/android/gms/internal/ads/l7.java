package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class l7 implements d7, j7 {
    private final cv WB;

    public l7(Context context, zzbbi zzbbiVar, vb0 vb0Var, com.google.android.gms.ads.internal.s1 s1Var) {
        com.google.android.gms.ads.internal.w0.Zo();
        cv cvVarDW = iv.DW(context, pw.DW(), "", false, false, vb0Var, zzbbiVar, null, null, null, pt0.Zo());
        this.WB = cvVarDW;
        cvVarDW.getView().setWillNotDraw(true);
    }

    private static void FH(Runnable runnable) {
        cw0.j6();
        if (mp.EQ()) {
            runnable.run();
        } else {
            bn.gn.post(runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.d7, com.google.android.gms.internal.ads.t7
    public final void DW(final String str) {
        FH(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.m7
            private final l7 WB;
            private final String mb;

            {
                this.WB = this;
                this.mb = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.WB.gn(this.mb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.j7
    public final void EQ(String str) {
        FH(new r7(this, str));
    }

    @Override // com.google.android.gms.internal.ads.j7
    public final void QX(String str) {
        FH(new q7(this, str));
    }

    @Override // com.google.android.gms.internal.ads.j7
    public final void VH(k7 k7Var) {
        kw kwVarAF = this.WB.AF();
        k7Var.getClass();
        kwVarAF.u7(o7.DW(k7Var));
    }

    @Override // com.google.android.gms.internal.ads.j7
    public final void Ws(String str) {
        FH(new p7(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str)));
    }

    @Override // com.google.android.gms.internal.ads.j7
    public final u8 Zo() {
        return new v8(this);
    }

    @Override // com.google.android.gms.internal.ads.j7
    public final void destroy() {
        this.WB.destroy();
    }

    @Override // com.google.android.gms.internal.ads.t8
    public final void g3(String str, final com.google.android.gms.ads.internal.gmsg.b0<? super t8> b0Var) {
        this.WB.ya(str, new com.google.android.gms.common.util.p(b0Var) { // from class: com.google.android.gms.internal.ads.n7
            private final com.google.android.gms.ads.internal.gmsg.b0 j6;

            {
                this.j6 = b0Var;
            }

            @Override // com.google.android.gms.common.util.p
            public final boolean j6(Object obj) {
                com.google.android.gms.ads.internal.gmsg.b0 b0Var2 = (com.google.android.gms.ads.internal.gmsg.b0) obj;
                return (b0Var2 instanceof s7) && ((s7) b0Var2).j6.equals(this.j6);
            }
        });
    }

    final /* synthetic */ void gn(String str) {
        this.WB.DW(str);
    }

    @Override // com.google.android.gms.internal.ads.j7
    public final boolean isDestroyed() {
        return this.WB.isDestroyed();
    }

    @Override // com.google.android.gms.internal.ads.d7, com.google.android.gms.internal.ads.u6
    public final void j6(String str, JSONObject jSONObject) {
        e7.Hw(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.t8
    public final void sh(String str, com.google.android.gms.ads.internal.gmsg.b0<? super t8> b0Var) {
        this.WB.sh(str, new s7(this, b0Var));
    }

    @Override // com.google.android.gms.internal.ads.t7
    public final void tp(String str, JSONObject jSONObject) {
        e7.FH(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.u6
    public final void v5(String str, Map map) {
        e7.DW(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.d7
    public final void we(String str, String str2) {
        e7.j6(this, str, str2);
    }
}
