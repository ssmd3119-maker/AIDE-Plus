package com.google.firebase.iid;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements ThreadFactory {
    static final ThreadFactory j6 = new i0();

    private i0() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return h0.j6(runnable);
    }
}
