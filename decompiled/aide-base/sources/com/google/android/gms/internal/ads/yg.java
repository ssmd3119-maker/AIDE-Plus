package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class yg implements bh {
    private final /* synthetic */ Context j6;

    yg(Context context) {
        this.j6 = context;
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final boolean j6(zzbbi zzbbiVar) {
        cw0.j6();
        boolean zA8 = mp.a8(this.j6, 12451000);
        boolean z = ((Boolean) cw0.v5().FH(p.cX)).booleanValue() && zzbbiVar.fY;
        com.google.android.gms.ads.internal.w0.v5();
        return !xg.j6(this.j6, zzbbiVar.fY) || !zA8 || z || bn.yO(this.j6.getPackageName());
    }
}
