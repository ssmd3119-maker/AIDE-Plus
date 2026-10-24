package com.google.android.gms.internal.ads;

@jg
/* loaded from: classes.dex */
public abstract class om implements wn<vq> {
    private final Runnable WB = new pm(this);
    private boolean jw = false;
    private volatile Thread mb;

    public om() {
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final /* synthetic */ vq VH() {
        if (!this.jw) {
            return zm.DW(this.WB);
        }
        return zm.DW.j6(this.WB);
    }

    @Override // com.google.android.gms.internal.ads.wn
    public final void cancel() {
        v5();
        if (this.mb != null) {
            this.mb.interrupt();
        }
    }

    public abstract void gn();

    public final vq u7() {
        if (!this.jw) {
            return zm.DW(this.WB);
        }
        return zm.DW.j6(this.WB);
    }

    public abstract void v5();

    public om(boolean z) {
    }
}
