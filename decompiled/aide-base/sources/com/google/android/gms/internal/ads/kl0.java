package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class kl0 implements uk0 {
    public final jl0<T> WB;
    private final /* synthetic */ jl0 fY;
    private final int jw;
    private final rk0 mb;

    public kl0(jl0 jl0Var, jl0<T> jl0Var2, rk0 rk0Var, int i) {
        this.fY = jl0Var;
        this.WB = jl0Var2;
        this.mb = rk0Var;
        this.jw = i;
    }

    public final void DW() {
        ro0.Hw(this.fY.jw[this.jw]);
        this.fY.jw[this.jw] = false;
    }

    @Override // com.google.android.gms.internal.ads.uk0
    public final int Hw(xe0 xe0Var, tg0 tg0Var, boolean z) {
        if (this.fY.a8()) {
            return -3;
        }
        rk0 rk0Var = this.mb;
        jl0 jl0Var = this.fY;
        return rk0Var.Zo(xe0Var, tg0Var, z, jl0Var.Jl, jl0Var.kf);
    }

    @Override // com.google.android.gms.internal.ads.uk0
    public final boolean KD() {
        jl0 jl0Var = this.fY;
        if (jl0Var.Jl) {
            return true;
        }
        return !jl0Var.a8() && this.mb.j3();
    }

    @Override // com.google.android.gms.internal.ads.uk0
    public final void j6() {
    }

    @Override // com.google.android.gms.internal.ads.uk0
    public final void u7(long j) {
        if (!this.fY.Jl || j <= this.mb.Ws()) {
            this.mb.J8(j, true);
        } else {
            this.mb.U2();
        }
    }
}
