package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.m;

/* loaded from: classes.dex */
public final class i0 extends m.b {
    private final /* synthetic */ m k2;
    private final /* synthetic */ Bundle qp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i0(m mVar, Bundle bundle) {
        super(mVar);
        this.k2 = mVar;
        this.qp = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.m.b
    final void j6() {
        this.k2.u7.dW(this.qp, this.WB);
    }
}
