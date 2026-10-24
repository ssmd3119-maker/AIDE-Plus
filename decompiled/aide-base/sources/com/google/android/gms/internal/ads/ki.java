package com.google.android.gms.internal.ads;

import android.content.Context;

@jg
/* loaded from: classes.dex */
public final class ki {
    public final tl DW;
    public final d FH;
    public final bj Hw;
    public final rd VH;
    public final cj Zo;
    public final xl gn;
    public final dt0 j6;
    public final pi tp;
    public final boolean u7 = true;
    public final n9 v5;

    private ki(si siVar, dt0 dt0Var, tl tlVar, d dVar, bj bjVar, n9 n9Var, cj cjVar, rd rdVar, xl xlVar, boolean z, pi piVar) {
        this.j6 = dt0Var;
        this.DW = tlVar;
        this.FH = dVar;
        this.Hw = bjVar;
        this.v5 = n9Var;
        this.Zo = cjVar;
        this.VH = rdVar;
        this.gn = xlVar;
        this.tp = piVar;
    }

    public static ki j6(Context context) {
        com.google.android.gms.ads.internal.w0.XL().j6(context);
        zzauj zzaujVar = new zzauj(context);
        return new ki(null, new gt0(), new ul(), new c(), new zi(context, zzaujVar.FH()), new o9(), new dj(), new qd(), new vl(), true, zzaujVar);
    }
}
