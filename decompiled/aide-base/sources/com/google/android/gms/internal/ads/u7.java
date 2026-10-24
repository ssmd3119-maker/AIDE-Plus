package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class u7 {
    private final Context DW;
    private final String FH;
    private final zzbbi Hw;
    private o8 VH;
    private ho<j7> Zo;
    private int gn;
    private final Object j6;
    private ho<j7> v5;

    public u7(Context context, zzbbi zzbbiVar, String str) {
        this.j6 = new Object();
        this.gn = 1;
        this.FH = str;
        this.DW = context.getApplicationContext();
        this.Hw = zzbbiVar;
        this.v5 = new j8();
        this.Zo = new j8();
    }

    protected final o8 FH(final vb0 vb0Var) {
        final o8 o8Var = new o8(this.Zo);
        ar.j6.execute(new Runnable(this, vb0Var, o8Var) { // from class: com.google.android.gms.internal.ads.v7
            private final u7 WB;
            private final o8 jw;
            private final vb0 mb;

            {
                this.WB = this;
                this.mb = vb0Var;
                this.jw = o8Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.WB.VH(this.mb, this.jw);
            }
        });
        o8Var.j6(new g8(this, o8Var), new h8(this, o8Var));
        return o8Var;
    }

    final /* synthetic */ void VH(vb0 vb0Var, final o8 o8Var) {
        try {
            Context context = this.DW;
            zzbbi zzbbiVar = this.Hw;
            final j7 v6Var = ((Boolean) cw0.v5().FH(p.Eq)).booleanValue() ? new v6(context, zzbbiVar) : new l7(context, zzbbiVar, vb0Var, null);
            v6Var.VH(new k7(this, o8Var, v6Var) { // from class: com.google.android.gms.internal.ads.y7
                private final o8 DW;
                private final j7 FH;
                private final u7 j6;

                {
                    this.j6 = this;
                    this.DW = o8Var;
                    this.FH = v6Var;
                }

                @Override // com.google.android.gms.internal.ads.k7
                public final void j6() {
                    final u7 u7Var = this.j6;
                    final o8 o8Var2 = this.DW;
                    final j7 j7Var = this.FH;
                    bn.gn.postDelayed(new Runnable(u7Var, o8Var2, j7Var) { // from class: com.google.android.gms.internal.ads.z7
                        private final u7 WB;
                        private final j7 jw;
                        private final o8 mb;

                        {
                            this.WB = u7Var;
                            this.mb = o8Var2;
                            this.jw = j7Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.WB.Zo(this.mb, this.jw);
                        }
                    }, i8.DW);
                }
            });
            v6Var.sh("/jsLoaded", new c8(this, o8Var, v6Var));
            cp cpVar = new cp();
            d8 d8Var = new d8(this, vb0Var, v6Var, cpVar);
            cpVar.DW(d8Var);
            v6Var.sh("/requestReload", d8Var);
            if (this.FH.endsWith(".js")) {
                v6Var.Ws(this.FH);
            } else if (this.FH.startsWith("<html>")) {
                v6Var.QX(this.FH);
            } else {
                v6Var.EQ(this.FH);
            }
            bn.gn.postDelayed(new e8(this, o8Var, v6Var), i8.j6);
        } catch (Throwable th) {
            xp.Hw("Error creating webview.", th);
            com.google.android.gms.ads.internal.w0.u7().v5(th, "SdkJavascriptFactory.loadJavascriptEngine");
            o8Var.Hw();
        }
    }

    final /* synthetic */ void Zo(o8 o8Var, j7 j7Var) {
        synchronized (this.j6) {
            if (o8Var.FH() != -1 && o8Var.FH() != 1) {
                o8Var.Hw();
                Executor executor = ar.j6;
                j7Var.getClass();
                executor.execute(a8.j6(j7Var));
                sm.we("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }

    public final k8 gn(vb0 vb0Var) {
        synchronized (this.j6) {
            synchronized (this.j6) {
                if (this.VH != null && this.gn == 0) {
                    if (((Boolean) cw0.v5().FH(p.DW)).booleanValue()) {
                        this.VH.j6(new kr(this) { // from class: com.google.android.gms.internal.ads.w7
                            private final u7 j6;

                            {
                                this.j6 = this;
                            }

                            @Override // com.google.android.gms.internal.ads.kr
                            public final void j6(Object obj) {
                                this.j6.v5((j7) obj);
                            }
                        }, x7.j6);
                    }
                }
            }
            if (this.VH != null && this.VH.FH() != -1) {
                if (this.gn == 0) {
                    return this.VH.Zo();
                }
                if (this.gn == 1) {
                    this.gn = 2;
                    FH(null);
                    return this.VH.Zo();
                }
                if (this.gn == 2) {
                    return this.VH.Zo();
                }
                return this.VH.Zo();
            }
            this.gn = 2;
            o8 o8VarFH = FH(null);
            this.VH = o8VarFH;
            return o8VarFH.Zo();
        }
    }

    final /* synthetic */ void v5(j7 j7Var) {
        if (j7Var.isDestroyed()) {
            this.gn = 1;
        }
    }

    public u7(Context context, zzbbi zzbbiVar, String str, ho<j7> hoVar, ho<j7> hoVar2) {
        this(context, zzbbiVar, str);
        this.v5 = hoVar;
        this.Zo = hoVar2;
    }
}
