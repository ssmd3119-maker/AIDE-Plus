package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.m;

/* loaded from: classes.dex */
public final class p extends m.b {
    private final /* synthetic */ m AL;
    private final /* synthetic */ String k2;
    private final /* synthetic */ String qp;
    private final /* synthetic */ m.a zh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(m mVar, String str, String str2, m.a aVar) {
        super(mVar);
        this.AL = mVar;
        this.qp = str;
        this.k2 = str2;
        this.zh = aVar;
    }

    @Override // com.google.android.gms.internal.measurement.m.b
    protected final void DW() {
        this.zh.xL(null);
    }

    @Override // com.google.android.gms.internal.measurement.m.b
    final void j6() {
        this.AL.u7.Uc(this.qp, this.k2, this.zh);
    }
}
