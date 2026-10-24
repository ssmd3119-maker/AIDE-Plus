package com.google.android.gms.internal.measurement;

import abcd.xu;
import android.app.Activity;
import com.google.android.gms.internal.measurement.m;

/* loaded from: classes.dex */
public final class q extends m.b {
    private final /* synthetic */ m AL;
    private final /* synthetic */ String k2;
    private final /* synthetic */ Activity qp;
    private final /* synthetic */ String zh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(m mVar, Activity activity, String str, String str2) {
        super(mVar);
        this.AL = mVar;
        this.qp = activity;
        this.k2 = str;
        this.zh = str2;
    }

    @Override // com.google.android.gms.internal.measurement.m.b
    final void j6() {
        this.AL.u7.d8(xu.sy(this.qp), this.k2, this.zh, this.WB);
    }
}
