package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class aa0 extends j90<aa0> {
    private static volatile aa0[] v5;
    public byte[] FH = null;
    public byte[] Hw = null;

    public aa0() {
        this.DW = null;
        this.j6 = -1;
    }

    public static aa0[] tp() {
        if (v5 == null) {
            synchronized (n90.DW) {
                if (v5 == null) {
                    v5 = new aa0[0];
                }
            }
        }
        return v5;
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    public final void Hw(h90 h90Var) throws i90 {
        h90Var.FH(1, this.FH);
        byte[] bArr = this.Hw;
        if (bArr != null) {
            h90Var.FH(2, bArr);
        }
        super.Hw(h90Var);
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    protected final int gn() {
        int iGn = super.gn() + h90.Zo(1, this.FH);
        byte[] bArr = this.Hw;
        return bArr != null ? iGn + h90.Zo(2, bArr) : iGn;
    }

    @Override // com.google.android.gms.internal.ads.p90
    public final /* synthetic */ p90 j6(g90 g90Var) throws o90 {
        while (true) {
            int iZo = g90Var.Zo();
            if (iZo == 0) {
                return this;
            }
            if (iZo == 10) {
                this.FH = g90Var.DW();
            } else if (iZo == 18) {
                this.Hw = g90Var.DW();
            } else if (!super.u7(g90Var, iZo)) {
                return this;
            }
        }
    }
}
