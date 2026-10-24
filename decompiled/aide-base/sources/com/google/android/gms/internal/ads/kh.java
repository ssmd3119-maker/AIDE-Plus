package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

@jg
/* loaded from: classes.dex */
public final class kh extends rh {
    private final WeakReference<ah> WB;

    public kh(ah ahVar) {
        this.WB = new WeakReference<>(ahVar);
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final void e9(zzasm zzasmVar) {
        ah ahVar = this.WB.get();
        if (ahVar != null) {
            ahVar.e9(zzasmVar);
        }
    }
}
