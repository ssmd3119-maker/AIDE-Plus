package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ik0 implements uk0 {
    private final int WB;
    private final /* synthetic */ bk0 mb;

    public ik0(bk0 bk0Var, int i) {
        this.mb = bk0Var;
        this.WB = i;
    }

    @Override // com.google.android.gms.internal.ads.uk0
    public final int Hw(xe0 xe0Var, tg0 tg0Var, boolean z) {
        return this.mb.Mr(this.WB, xe0Var, tg0Var, z);
    }

    @Override // com.google.android.gms.internal.ads.uk0
    public final boolean KD() {
        return this.mb.lg(this.WB);
    }

    @Override // com.google.android.gms.internal.ads.uk0
    public final void j6() {
        this.mb.vy();
    }

    @Override // com.google.android.gms.internal.ads.uk0
    public final void u7(long j) {
        this.mb.gW(this.WB, j);
    }
}
