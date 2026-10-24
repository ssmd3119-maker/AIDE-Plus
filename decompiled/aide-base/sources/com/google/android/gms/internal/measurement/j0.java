package com.google.android.gms.internal.measurement;

import abcd.xu;
import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.m;

/* loaded from: classes.dex */
public final class j0 extends m.b {
    private final /* synthetic */ Bundle k2;
    private final /* synthetic */ Activity qp;
    private final /* synthetic */ m.e zh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j0(m.e eVar, Activity activity, Bundle bundle) {
        super(m.this);
        this.zh = eVar;
        this.qp = activity;
        this.k2 = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.m.b
    final void j6() {
        m.this.u7.lN(xu.sy(this.qp), this.k2, this.mb);
    }
}
