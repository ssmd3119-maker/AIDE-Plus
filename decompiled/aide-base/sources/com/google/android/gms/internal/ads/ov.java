package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ov implements Runnable {
    private final /* synthetic */ nv WB;

    ov(nv nvVar) {
        this.WB = nvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.WB.WB.destroy();
    }
}
