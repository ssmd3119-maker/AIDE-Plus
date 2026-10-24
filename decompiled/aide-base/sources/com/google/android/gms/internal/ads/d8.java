package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class d8 implements com.google.android.gms.ads.internal.gmsg.b0<t8> {
    private final /* synthetic */ j7 DW;
    private final /* synthetic */ cp FH;
    private final /* synthetic */ u7 Hw;
    private final /* synthetic */ vb0 j6;

    d8(u7 u7Var, vb0 vb0Var, j7 j7Var, cp cpVar) {
        this.Hw = u7Var;
        this.j6 = vb0Var;
        this.DW = j7Var;
        this.FH = cpVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final /* synthetic */ void zza(t8 t8Var, Map map) {
        synchronized (this.Hw.j6) {
            xp.gn("JS Engine is requesting an update");
            if (this.Hw.gn == 0) {
                xp.gn("Starting reload.");
                this.Hw.gn = 2;
                this.Hw.FH(this.j6);
            }
            this.DW.g3("/requestReload", (com.google.android.gms.ads.internal.gmsg.b0) this.FH.j6());
        }
    }
}
