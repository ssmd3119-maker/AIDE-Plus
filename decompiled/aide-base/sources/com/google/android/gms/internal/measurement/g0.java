package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.m;

/* loaded from: classes.dex */
public final class g0 extends m.b {
    private final /* synthetic */ Bundle AL;
    private final /* synthetic */ m cT;
    private final /* synthetic */ boolean hK;
    private final /* synthetic */ String k2;
    private final /* synthetic */ Long qp;
    private final /* synthetic */ boolean w9 = true;
    private final /* synthetic */ String zh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g0(m mVar, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(mVar);
        this.cT = mVar;
        this.qp = l;
        this.k2 = str;
        this.zh = str2;
        this.AL = bundle;
        this.hK = z2;
    }

    @Override // com.google.android.gms.internal.measurement.m.b
    final void j6() {
        Long l = this.qp;
        this.cT.u7.CN(this.k2, this.zh, this.AL, this.w9, this.hK, l == null ? this.WB : l.longValue());
    }
}
