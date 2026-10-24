package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
public final class q implements Runnable {
    private final /* synthetic */ p WB;

    q(p pVar) {
        this.WB = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.WB.j6.mb.disconnect();
    }
}
