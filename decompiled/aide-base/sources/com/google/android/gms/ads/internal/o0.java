package com.google.android.gms.ads.internal;

import android.os.Handler;

/* loaded from: classes.dex */
public final class o0 {
    private final Handler j6;

    public o0(Handler handler) {
        this.j6 = handler;
    }

    public final void DW(Runnable runnable) {
        this.j6.removeCallbacks(runnable);
    }

    public final boolean j6(Runnable runnable, long j) {
        return this.j6.postDelayed(runnable, j);
    }
}
