package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ai implements Runnable {
    private final /* synthetic */ zl WB;
    private final /* synthetic */ zh mb;

    ai(zh zhVar, zl zlVar) {
        this.mb = zhVar;
        this.WB = zlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.mb.fY.eQ(this.WB);
        if (this.mb.AL != null) {
            this.mb.AL.v5();
            this.mb.AL = null;
        }
    }
}
