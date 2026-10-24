package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ei0 implements Executor {
    private final /* synthetic */ Handler j6;

    ei0(eh0 eh0Var, Handler handler) {
        this.j6 = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.j6.post(runnable);
    }
}
