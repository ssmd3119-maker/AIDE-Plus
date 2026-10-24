package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class he0 implements cf0, ef0 {
    private ff0 DW;
    private int FH;
    private int Hw;
    private boolean VH = true;
    private long Zo;
    private boolean gn;
    private final int j6;
    private uk0 v5;

    public he0(int i) {
        this.j6 = i;
    }

    protected abstract void EQ(long j, boolean z);

    @Override // com.google.android.gms.internal.ads.cf0
    public vo0 I() {
        return null;
    }

    protected abstract void J0(boolean z);

    protected abstract void J8();

    @Override // com.google.android.gms.internal.ads.cf0
    public final void Mz(int i) {
        this.FH = i;
    }

    protected final boolean QX() {
        return this.VH ? this.gn : this.v5.KD();
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void Qq(zzfs[] zzfsVarArr, uk0 uk0Var, long j) {
        ro0.Hw(!this.gn);
        this.v5 = uk0Var;
        this.VH = false;
        this.Zo = j;
        we(zzfsVarArr, j);
    }

    protected final int VH() {
        return this.FH;
    }

    protected final ff0 Ws() {
        return this.DW;
    }

    protected final void XL(long j) {
        this.v5.u7(j - this.Zo);
    }

    @Override // com.google.android.gms.internal.ads.me0
    public void Zo(int i, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final uk0 ca() {
        return this.v5;
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void cb() {
        this.v5.j6();
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final int cn() {
        return this.Hw;
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void dx(long j) {
        this.gn = false;
        this.VH = false;
        EQ(j, false);
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void ef(ff0 ff0Var, zzfs[] zzfsVarArr, uk0 uk0Var, long j, boolean z, long j2) {
        ro0.Hw(this.Hw == 0);
        this.DW = ff0Var;
        this.Hw = 1;
        J0(z);
        Qq(zzfsVarArr, uk0Var, j2);
        EQ(j, z);
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void g3() {
        this.gn = true;
    }

    protected abstract void gn();

    @Override // com.google.android.gms.internal.ads.cf0
    public final boolean sG() {
        return this.gn;
    }

    @Override // com.google.android.gms.internal.ads.cf0, com.google.android.gms.internal.ads.ef0
    public final int sh() {
        return this.j6;
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void start() {
        ro0.Hw(this.Hw == 1);
        this.Hw = 2;
        gn();
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void stop() {
        ro0.Hw(this.Hw == 2);
        this.Hw = 1;
        u7();
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final ef0 sy() {
        return this;
    }

    protected final int tp(xe0 xe0Var, tg0 tg0Var, boolean z) {
        int iHw = this.v5.Hw(xe0Var, tg0Var, z);
        if (iHw == -4) {
            if (tg0Var.Hw()) {
                this.VH = true;
                return this.gn ? -4 : -3;
            }
            tg0Var.Hw += this.Zo;
        } else if (iHw == -5) {
            zzfs zzfsVar = xe0Var.j6;
            long j = zzfsVar.pO;
            if (j != Long.MAX_VALUE) {
                xe0Var.j6 = zzfsVar.U2(j + this.Zo);
            }
        }
        return iHw;
    }

    protected abstract void u7();

    @Override // com.google.android.gms.internal.ads.cf0
    public final boolean vJ() {
        return this.VH;
    }

    protected void we(zzfs[] zzfsVarArr, long j) {
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void x9() {
        ro0.Hw(this.Hw == 1);
        this.Hw = 0;
        this.v5 = null;
        this.gn = false;
        J8();
    }
}
