package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class gl0 implements mh0 {
    private final int DW;
    private final zzfs FH;
    public zzfs Hw;
    private final int j6;
    private mh0 v5;

    public gl0(int i, int i2, zzfs zzfsVar) {
        this.j6 = i;
        this.DW = i2;
        this.FH = zzfsVar;
    }

    @Override // com.google.android.gms.internal.ads.mh0
    public final int DW(fh0 fh0Var, int i, boolean z) {
        return this.v5.DW(fh0Var, i, z);
    }

    @Override // com.google.android.gms.internal.ads.mh0
    public final void FH(long j, int i, int i2, int i3, nh0 nh0Var) {
        this.v5.FH(j, i, i2, i3, nh0Var);
    }

    @Override // com.google.android.gms.internal.ads.mh0
    public final void Hw(ap0 ap0Var, int i) {
        this.v5.Hw(ap0Var, i);
    }

    @Override // com.google.android.gms.internal.ads.mh0
    public final void j6(zzfs zzfsVar) {
        zzfs zzfsVarDW = zzfsVar.DW(this.FH);
        this.Hw = zzfsVarDW;
        this.v5.j6(zzfsVarDW);
    }

    public final void v5(hl0 hl0Var) {
        if (hl0Var == null) {
            this.v5 = new ch0();
            return;
        }
        mh0 mh0VarJ6 = hl0Var.j6(this.j6, this.DW);
        this.v5 = mh0VarJ6;
        if (mh0VarJ6 != null) {
            mh0VarJ6.j6(this.Hw);
        }
    }
}
