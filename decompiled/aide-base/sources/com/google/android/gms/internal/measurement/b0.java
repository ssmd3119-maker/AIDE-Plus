package com.google.android.gms.internal.measurement;

import abcd.xu;
import com.google.android.gms.internal.measurement.m;

/* loaded from: classes.dex */
public final class b0 extends m.b {
    private final /* synthetic */ Object AL;
    private final /* synthetic */ m hK;
    private final /* synthetic */ String k2;
    private final /* synthetic */ int qp = 5;
    private final /* synthetic */ Object w9;
    private final /* synthetic */ Object zh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b0(m mVar, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.hK = mVar;
        this.k2 = str;
        this.zh = obj;
        this.AL = obj2;
        this.w9 = obj3;
    }

    @Override // com.google.android.gms.internal.measurement.m.b
    final void j6() {
        this.hK.u7.HO(this.qp, this.k2, xu.sy(this.zh), xu.sy(this.AL), xu.sy(this.w9));
    }
}
