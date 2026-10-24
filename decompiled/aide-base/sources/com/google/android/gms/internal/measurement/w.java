package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.m;

/* loaded from: classes.dex */
public final class w extends m.b {
    private final /* synthetic */ m k2;
    private final /* synthetic */ m.a qp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(m mVar, m.a aVar) {
        super(mVar);
        this.k2 = mVar;
        this.qp = aVar;
    }

    @Override // com.google.android.gms.internal.measurement.m.b
    protected final void DW() {
        this.qp.xL(null);
    }

    @Override // com.google.android.gms.internal.measurement.m.b
    final void j6() {
        this.k2.u7.pu(this.qp);
    }
}
