package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class eh0 implements b {
    private final Executor j6;

    public eh0(Handler handler) {
        this.j6 = new ei0(this, handler);
    }

    @Override // com.google.android.gms.internal.ads.b
    public final void DW(bq0<?> bq0Var, iw0<?> iw0Var) {
        j6(bq0Var, iw0Var, null);
    }

    @Override // com.google.android.gms.internal.ads.b
    public final void FH(bq0<?> bq0Var, e3 e3Var) {
        bq0Var.Mr("post-error");
        this.j6.execute(new dj0(bq0Var, iw0.DW(e3Var), null));
    }

    @Override // com.google.android.gms.internal.ads.b
    public final void j6(bq0<?> bq0Var, iw0<?> iw0Var, Runnable runnable) {
        bq0Var.sh();
        bq0Var.Mr("post-response");
        this.j6.execute(new dj0(bq0Var, iw0Var, runnable));
    }
}
