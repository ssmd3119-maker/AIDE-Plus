package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public final class fk0 implements Runnable {
    private final /* synthetic */ IOException WB;
    private final /* synthetic */ bk0 mb;

    fk0(bk0 bk0Var, IOException iOException) {
        this.mb = bk0Var;
        this.WB = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.mb.qp.Zo(this.WB);
    }
}
