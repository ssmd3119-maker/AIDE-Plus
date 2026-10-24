package com.google.android.gms.internal.measurement;

import android.util.Log;
import com.google.android.gms.internal.measurement.m;
import com.google.android.gms.measurement.internal.zzcy;

/* loaded from: classes.dex */
public final class f0 extends m.b {
    private final /* synthetic */ m k2;
    private final /* synthetic */ zzcy qp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f0(m mVar, zzcy zzcyVar) {
        super(mVar);
        this.k2 = mVar;
        this.qp = zzcyVar;
    }

    @Override // com.google.android.gms.internal.measurement.m.b
    final void j6() {
        m.d dVar = (m.d) this.k2.v5.get(this.qp);
        if (dVar == null) {
            Log.w(this.k2.j6, "OnEventListener had not been registered.");
        } else {
            this.k2.u7.zE(dVar);
            this.k2.v5.remove(this.qp);
        }
    }
}
