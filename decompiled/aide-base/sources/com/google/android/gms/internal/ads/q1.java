package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class q1 implements com.google.android.gms.ads.internal.gmsg.b0<Object> {
    private final /* synthetic */ n1 DW;
    private final /* synthetic */ nf j6;

    q1(n1 n1Var, nf nfVar) {
        this.DW = n1Var;
        this.j6 = nfVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final void zza(Object obj, Map<String, String> map) {
        cv cvVar = (cv) this.DW.j6.get();
        if (cvVar == null) {
            this.j6.g3("/showOverlay", this);
        } else {
            cvVar.getView().setVisibility(0);
        }
    }
}
