package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* loaded from: classes.dex */
public final class k9 implements kr<t8> {
    private final /* synthetic */ Object DW;
    private final /* synthetic */ fr FH;
    private final /* synthetic */ j9 Hw;
    private final /* synthetic */ k8 j6;

    k9(j9 j9Var, k8 k8Var, Object obj, fr frVar) {
        this.Hw = j9Var;
        this.j6 = k8Var;
        this.DW = obj;
        this.FH = frVar;
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final /* synthetic */ void j6(t8 t8Var) throws JSONException {
        this.Hw.Hw(this.j6, t8Var, this.DW, this.FH);
    }
}
