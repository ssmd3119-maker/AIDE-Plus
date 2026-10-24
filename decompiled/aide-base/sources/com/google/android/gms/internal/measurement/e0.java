package com.google.android.gms.internal.measurement;

import android.util.Log;
import com.google.android.gms.internal.measurement.m;
import com.google.android.gms.measurement.internal.zzcy;

/* loaded from: classes.dex */
public final class e0 extends m.b {
    private final /* synthetic */ m k2;
    private final /* synthetic */ zzcy qp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e0(m mVar, zzcy zzcyVar) {
        super(mVar);
        this.k2 = mVar;
        this.qp = zzcyVar;
    }

    @Override // com.google.android.gms.internal.measurement.m.b
    final void j6() {
        if (this.k2.v5.containsKey(this.qp)) {
            Log.w(this.k2.j6, "OnEventListener already registered.");
            return;
        }
        m.d dVar = new m.d(this.qp);
        this.k2.v5.put(this.qp, dVar);
        this.k2.u7.bH(dVar);
    }
}
