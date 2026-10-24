package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class cd0 implements Runnable {
    private final /* synthetic */ bq0 WB;
    private final /* synthetic */ bc0 mb;

    cd0(bc0 bc0Var, bq0 bq0Var) {
        this.mb = bc0Var;
        this.WB = bq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        try {
            this.mb.mb.put(this.WB);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
