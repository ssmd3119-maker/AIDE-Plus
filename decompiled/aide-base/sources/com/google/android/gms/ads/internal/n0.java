package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.internal.ads.zzwb;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class n0 implements Runnable {
    private final /* synthetic */ WeakReference WB;
    private final /* synthetic */ m0 mb;

    n0(m0 m0Var, WeakReference weakReference) {
        this.mb = m0Var;
        this.WB = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m0.v5(this.mb, false);
        a aVar = (a) this.WB.get();
        if (aVar != null) {
            zzwb zzwbVar = this.mb.FH;
            if (aVar.xu(zzwbVar)) {
                aVar.p8(zzwbVar);
            } else {
                xp.gn("Ad is not visible. Not refreshing ad.");
                aVar.qp.gn(zzwbVar);
            }
        }
    }
}
