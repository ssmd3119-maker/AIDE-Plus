package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class vw {
    public static cv j6(final Context context, final pw pwVar, final String str, final boolean z, final boolean z2, final vb0 vb0Var, final zzbbi zzbbiVar, final d0 d0Var, final com.google.android.gms.ads.internal.p0 p0Var, final com.google.android.gms.ads.internal.s1 s1Var, pt0 pt0Var) throws mv {
        try {
            return (cv) dp.DW(new Callable(context, pwVar, str, z, z2, vb0Var, zzbbiVar, d0Var, p0Var, s1Var) { // from class: com.google.android.gms.internal.ads.xw
                private final pw DW;
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
                    qw qwVar = new qw();
                    yw ywVar = new yw(new zzbhs(context2), qwVar, pwVar2, str2, z3, z4, vb0Var2, zzbbiVar2, d0Var2, p0Var2, s1Var2);
                    nv nvVar = new nv(ywVar);
                    ywVar.setWebChromeClient(new tu(nvVar));
                    qwVar.ef(nvVar, z4);
                    return nvVar;
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.w0.u7().v5(th, "AdWebViewFactory.newAdWebView2");
            throw new mv("Webview initialization failed.", th);
        }
    }
}
