package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements Executor {
    static final Executor j6 = new j0();

    private j0() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
