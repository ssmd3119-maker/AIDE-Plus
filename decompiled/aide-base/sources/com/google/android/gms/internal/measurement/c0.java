package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.m;

/* loaded from: classes.dex */
public final class c0 extends m.b {
    private final /* synthetic */ m.a k2;
    private final /* synthetic */ Bundle qp;
    private final /* synthetic */ m zh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c0(m mVar, Bundle bundle, m.a aVar) {
        super(mVar);
        this.zh = mVar;
        this.qp = bundle;
        this.k2 = aVar;
    }

    @Override // com.google.android.gms.internal.measurement.m.b
    protected final void DW() {
        this.k2.xL(null);
    }

    @Override // com.google.android.gms.internal.measurement.m.b
    final void j6() {
        this.zh.u7.qU(this.qp, this.k2, this.WB);
    }
}
