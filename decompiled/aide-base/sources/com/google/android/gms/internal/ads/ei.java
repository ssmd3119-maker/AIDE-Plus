package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ei implements Runnable {
    private final /* synthetic */ zh WB;

    ei(zh zhVar) {
        this.WB = zhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.WB.AL != null) {
            this.WB.AL.v5();
            this.WB.AL = null;
        }
    }
}
