package com.google.android.gms.internal.measurement;

import abcd.xu;
import com.google.android.gms.internal.measurement.m;

/* loaded from: classes.dex */
public final class h0 extends m.b {
    private final /* synthetic */ boolean AL = true;
    private final /* synthetic */ String k2;
    private final /* synthetic */ String qp;
    private final /* synthetic */ m w9;
    private final /* synthetic */ Object zh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h0(m mVar, String str, String str2, Object obj, boolean z) {
        super(mVar);
        this.w9 = mVar;
        this.qp = str;
        this.k2 = str2;
        this.zh = obj;
    }

    @Override // com.google.android.gms.internal.measurement.m.b
    final void j6() {
        this.w9.u7.Y9(this.qp, this.k2, xu.sy(this.zh), this.AL, this.WB);
    }
}
