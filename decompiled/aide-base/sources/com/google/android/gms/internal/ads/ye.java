package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class ye implements com.google.android.gms.ads.internal.gmsg.b0<Object> {
    private final /* synthetic */ te DW;
    private final /* synthetic */ z0 j6;

    ye(te teVar, z0 z0Var) {
        this.DW = teVar;
        this.j6 = z0Var;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final void zza(Object obj, Map<String, String> map) {
        this.DW.Ws(this.j6, map.get("asset"));
    }
}
