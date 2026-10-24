package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.m;

/* loaded from: classes.dex */
public final class o extends m.b {
    private final /* synthetic */ m AL;
    private final /* synthetic */ String k2;
    private final /* synthetic */ String qp;
    private final /* synthetic */ Bundle zh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(m mVar, String str, String str2, Bundle bundle) {
        super(mVar);
        this.AL = mVar;
        this.qp = str;
        this.k2 = str2;
        this.zh = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.m.b
    final void j6() {
        this.AL.u7.sg(this.qp, this.k2, this.zh);
    }
}
