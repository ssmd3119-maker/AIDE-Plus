package com.google.android.gms.internal.ads;

import android.content.Context;

@jg
/* loaded from: classes.dex */
public class ke extends ce {
    ke(Context context, zl zlVar, cv cvVar, je jeVar) {
        super(context, zlVar, cvVar, jeVar);
    }

    @Override // com.google.android.gms.internal.ads.ce
    protected final void Hw() {
        if (this.qp.k2 != -2) {
            return;
        }
        this.jw.AF().J8(this);
        v5();
        xp.VH("Loading HTML in WebView.");
        cv cvVar = this.jw;
        zzasm zzasmVar = this.qp;
        cvVar.wM(zzasmVar.jw, zzasmVar.fY, null);
    }

    protected void v5() {
    }
}
