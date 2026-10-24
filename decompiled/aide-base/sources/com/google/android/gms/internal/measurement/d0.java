package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.m;

/* loaded from: classes.dex */
public final class d0 extends m.b {
    private final /* synthetic */ m.a k2;
    private final /* synthetic */ String qp;
    private final /* synthetic */ m zh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d0(m mVar, String str, m.a aVar) {
        super(mVar);
        this.zh = mVar;
        this.qp = str;
        this.k2 = aVar;
    }

    @Override // com.google.android.gms.internal.measurement.m.b
    protected final void DW() {
        this.k2.xL(null);
    }

    @Override // com.google.android.gms.internal.measurement.m.b
    final void j6() {
        this.zh.u7.re(this.qp, this.k2);
    }
}
