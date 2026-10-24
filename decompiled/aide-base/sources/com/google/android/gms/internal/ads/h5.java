package com.google.android.gms.internal.ads;

import android.content.Context;

@jg
/* loaded from: classes.dex */
public final class h5 {
    private final ka DW;
    private final zzbbi FH;
    private final com.google.android.gms.ads.internal.s1 Hw;
    private final Context j6;

    h5(Context context, ka kaVar, zzbbi zzbbiVar, com.google.android.gms.ads.internal.s1 s1Var) {
        this.j6 = context;
        this.DW = kaVar;
        this.FH = zzbbiVar;
        this.Hw = s1Var;
    }

    public final com.google.android.gms.ads.internal.m DW(String str) {
        return new com.google.android.gms.ads.internal.m(this.j6, new zzwf(), str, this.DW, this.FH, this.Hw);
    }

    public final com.google.android.gms.ads.internal.m FH(String str) {
        return new com.google.android.gms.ads.internal.m(this.j6.getApplicationContext(), new zzwf(), str, this.DW, this.FH, this.Hw);
    }

    public final h5 Hw() {
        return new h5(this.j6.getApplicationContext(), this.DW, this.FH, this.Hw);
    }

    public final Context j6() {
        return this.j6.getApplicationContext();
    }
}
