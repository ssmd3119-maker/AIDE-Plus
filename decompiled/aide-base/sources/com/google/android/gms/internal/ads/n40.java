package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class n40 extends j90<n40> {
    public Long FH = null;
    private String Hw = null;
    private byte[] v5 = null;

    public n40() {
        this.j6 = -1;
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    public final void Hw(h90 h90Var) throws i90 {
        Long l = this.FH;
        if (l != null) {
            h90Var.rN(1, l.longValue());
        }
        String str = this.Hw;
        if (str != null) {
            h90Var.EQ(3, str);
        }
        byte[] bArr = this.v5;
        if (bArr != null) {
            h90Var.FH(4, bArr);
        }
        super.Hw(h90Var);
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    protected final int gn() {
        int iGn = super.gn();
        Long l = this.FH;
        if (l != null) {
            iGn += h90.U2(1, l.longValue());
        }
        String str = this.Hw;
        if (str != null) {
            iGn += h90.QX(3, str);
        }
        byte[] bArr = this.v5;
        return bArr != null ? iGn + h90.Zo(4, bArr) : iGn;
    }

    @Override // com.google.android.gms.internal.ads.p90
    public final /* synthetic */ p90 j6(g90 g90Var) throws o90 {
        while (true) {
            int iZo = g90Var.Zo();
            if (iZo == 0) {
                return this;
            }
            if (iZo == 8) {
                this.FH = Long.valueOf(g90Var.EQ());
            } else if (iZo == 26) {
                this.Hw = g90Var.FH();
            } else if (iZo == 34) {
                this.v5 = g90Var.DW();
            } else if (!super.u7(g90Var, iZo)) {
                return this;
            }
        }
    }
}
