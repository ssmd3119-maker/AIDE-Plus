package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
public final class o<T> implements Callable<T> {
    private final /* synthetic */ m DW;
    private final /* synthetic */ e j6;

    o(m mVar, e eVar) {
        this.DW = mVar;
        this.j6 = eVar;
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        return (T) this.j6.gn(this.DW.qp);
    }
}
