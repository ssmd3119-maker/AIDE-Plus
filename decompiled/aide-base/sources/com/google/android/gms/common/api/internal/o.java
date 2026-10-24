package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.b;

/* loaded from: classes.dex */
public final class o implements Runnable {
    private final /* synthetic */ b.a WB;

    o(b.a aVar) {
        this.WB = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.WB.aM();
    }
}
