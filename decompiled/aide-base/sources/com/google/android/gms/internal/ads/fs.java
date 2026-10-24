package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class fs implements Runnable {
    private final zzbdi WB;

    private fs(zzbdi zzbdiVar) {
        this.WB = zzbdiVar;
    }

    static Runnable j6(zzbdi zzbdiVar) {
        return new fs(zzbdiVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.WB.u7();
    }
}
