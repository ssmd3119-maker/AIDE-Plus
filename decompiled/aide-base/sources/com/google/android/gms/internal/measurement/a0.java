package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.m;

/* loaded from: classes.dex */
public final class a0 extends m.b {
    private final /* synthetic */ m.a AL;
    private final /* synthetic */ String k2;
    private final /* synthetic */ String qp;
    private final /* synthetic */ m w9;
    private final /* synthetic */ boolean zh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a0(m mVar, String str, String str2, boolean z, m.a aVar) {
        super(mVar);
        this.w9 = mVar;
        this.qp = str;
        this.k2 = str2;
        this.zh = z;
        this.AL = aVar;
    }

    @Override // com.google.android.gms.internal.measurement.m.b
    protected final void DW() {
        this.AL.xL(null);
    }

    @Override // com.google.android.gms.internal.measurement.m.b
    final void j6() {
        this.w9.u7.po(this.qp, this.k2, this.zh, this.AL);
    }
}
