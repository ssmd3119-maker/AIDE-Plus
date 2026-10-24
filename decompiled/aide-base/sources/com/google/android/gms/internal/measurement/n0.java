package com.google.android.gms.internal.measurement;

import abcd.xu;
import android.app.Activity;
import com.google.android.gms.internal.measurement.m;

/* loaded from: classes.dex */
public final class n0 extends m.b {
    private final /* synthetic */ m.e k2;
    private final /* synthetic */ Activity qp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n0(m.e eVar, Activity activity) {
        super(m.this);
        this.k2 = eVar;
        this.qp = activity;
    }

    @Override // com.google.android.gms.internal.measurement.m.b
    final void j6() {
        m.this.u7.C1(xu.sy(this.qp), this.mb);
    }
}
