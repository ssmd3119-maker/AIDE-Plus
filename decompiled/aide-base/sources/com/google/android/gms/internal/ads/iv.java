package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class iv {
    public static cv DW(final Context context, final pw pwVar, final String str, final boolean z, final boolean z2, final vb0 vb0Var, final zzbbi zzbbiVar, final d0 d0Var, final com.google.android.gms.ads.internal.p0 p0Var, final com.google.android.gms.ads.internal.s1 s1Var, final pt0 pt0Var) {
        p.j6(context);
        if (((Boolean) cw0.v5().FH(p.Xa)).booleanValue()) {
            return vw.j6(context, pwVar, str, z, z2, vb0Var, zzbbiVar, d0Var, p0Var, s1Var, pt0Var);
        }
        try {
            return (cv) dp.DW(new Callable(context, pwVar, str, z, z2, vb0Var, zzbbiVar, d0Var, p0Var, s1Var, pt0Var) { // from class: com.google.android.gms.internal.ads.kv
                private final pw DW;
                private final pt0 EQ;
                private final String FH;
                private final boolean Hw;
                private final zzbbi VH;
                private final vb0 Zo;
                private final d0 gn;
                private final Context j6;
                private final com.google.android.gms.ads.internal.s1 tp;
                private final com.google.android.gms.ads.internal.p0 u7;
                private final boolean v5;

                {
                    this.j6 = context;
                    this.DW = pwVar;
                    this.FH = str;
                    this.Hw = z;
                    this.v5 = z2;
                    this.Zo = vb0Var;
                    this.VH = zzbbiVar;
                    this.gn = d0Var;
                    this.u7 = p0Var;
                    this.tp = s1Var;
                    this.EQ = pt0Var;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context2 = this.j6;
                    pw pwVar2 = this.DW;
                    String str2 = this.FH;
                    boolean z3 = this.Hw;
                    boolean z4 = this.v5;
                    vb0 vb0Var2 = this.Zo;
                    zzbbi zzbbiVar2 = this.VH;
                    d0 d0Var2 = this.gn;
                    com.google.android.gms.ads.internal.p0 p0Var2 = this.u7;
                    com.google.android.gms.ads.internal.s1 s1Var2 = this.tp;
                    pt0 pt0Var2 = this.EQ;
                    nv nvVar = new nv(pv.P8(context2, pwVar2, str2, z3, z4, vb0Var2, zzbbiVar2, d0Var2, p0Var2, s1Var2, pt0Var2));
                    nvVar.setWebViewClient(com.google.android.gms.ads.internal.w0.VH().Zo(nvVar, pt0Var2, z4));
                    nvVar.setWebChromeClient(new tu(nvVar));
                    return nvVar;
                }
            });
        } catch (Throwable th) {
            throw new mv("Webview initialization failed.", th);
        }
    }

    public static vq<cv> j6(final Context context, final zzbbi zzbbiVar, final String str, final vb0 vb0Var, final com.google.android.gms.ads.internal.s1 s1Var) {
        return jq.DW(jq.J0(null), new eq(context, vb0Var, zzbbiVar, s1Var, str) { // from class: com.google.android.gms.internal.ads.jv
            private final vb0 DW;
            private final zzbbi FH;
            private final com.google.android.gms.ads.internal.s1 Hw;
            private final Context j6;
            private final String v5;

            {
                this.j6 = context;
                this.DW = vb0Var;
                this.FH = zzbbiVar;
                this.Hw = s1Var;
                this.v5 = str;
            }

            @Override // com.google.android.gms.internal.ads.eq
            public final vq j6(Object obj) {
                Context context2 = this.j6;
                vb0 vb0Var2 = this.DW;
                zzbbi zzbbiVar2 = this.FH;
                com.google.android.gms.ads.internal.s1 s1Var2 = this.Hw;
                String str2 = this.v5;
                com.google.android.gms.ads.internal.w0.Zo();
                cv cvVarDW = iv.DW(context2, pw.DW(), "", false, false, vb0Var2, zzbbiVar2, null, null, s1Var2, pt0.Zo());
                final er erVarVH = er.VH(cvVarDW);
                cvVarDW.AF().J8(new lw(erVarVH) { // from class: com.google.android.gms.internal.ads.lv
                    private final er WB;

                    {
                        this.WB = erVarVH;
                    }

                    @Override // com.google.android.gms.internal.ads.lw
                    public final void j6(boolean z) {
                        this.WB.Zo();
                    }
                });
                cvVarDW.loadUrl(str2);
                return erVarVH;
            }
        }, ar.j6);
    }
}
