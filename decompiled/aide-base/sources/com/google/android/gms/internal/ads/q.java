package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class q implements Callable<Void> {
    private final /* synthetic */ Context j6;

    q(Context context) {
        this.j6 = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Void call() {
        cw0.v5().j6(this.j6);
        return null;
    }
}
