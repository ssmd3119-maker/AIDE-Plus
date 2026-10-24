package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class zzauj implements pi {
    private x8<JSONObject, JSONObject> DW;
    private x8<JSONObject, JSONObject> j6;

    public zzauj(Context context) {
        g9 g9VarJ6 = com.google.android.gms.ads.internal.w0.Mr().j6(context, zzbbi.gn());
        b9<JSONObject> b9Var = d9.DW;
        this.j6 = g9VarJ6.j6("google.afma.request.getAdDictionary", b9Var, b9Var);
        g9 g9VarJ62 = com.google.android.gms.ads.internal.w0.Mr().j6(context, zzbbi.gn());
        b9<JSONObject> b9Var2 = d9.DW;
        this.DW = g9VarJ62.j6("google.afma.sdkConstants.getSdkConstants", b9Var2, b9Var2);
    }

    @Override // com.google.android.gms.internal.ads.pi
    public final x8<JSONObject, JSONObject> DW() {
        return this.j6;
    }

    @Override // com.google.android.gms.internal.ads.pi
    public final x8<JSONObject, JSONObject> FH() {
        return this.DW;
    }
}
