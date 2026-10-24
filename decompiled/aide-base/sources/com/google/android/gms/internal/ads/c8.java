package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class c8 implements com.google.android.gms.ads.internal.gmsg.b0<t8> {
    private final /* synthetic */ j7 DW;
    private final /* synthetic */ u7 FH;
    private final /* synthetic */ o8 j6;

    c8(u7 u7Var, o8 o8Var, j7 j7Var) {
        this.FH = u7Var;
        this.j6 = o8Var;
        this.DW = j7Var;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final /* synthetic */ void zza(t8 t8Var, Map map) {
        synchronized (this.FH.j6) {
            if (this.j6.FH() != -1 && this.j6.FH() != 1) {
                this.FH.gn = 0;
                this.FH.v5.j6(this.DW);
                this.j6.DW(this.DW);
                this.FH.VH = this.j6;
                sm.we("Successfully loaded JS Engine.");
            }
        }
    }
}
