package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class n30 extends j90<n30> {
    public byte[] FH = null;
    public byte[] Hw = null;
    public byte[] v5 = null;
    public byte[] Zo = null;

    public n30() {
        this.j6 = -1;
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    public final void Hw(h90 h90Var) throws i90 {
        byte[] bArr = this.FH;
        if (bArr != null) {
            h90Var.FH(1, bArr);
        }
        byte[] bArr2 = this.Hw;
        if (bArr2 != null) {
            h90Var.FH(2, bArr2);
        }
        byte[] bArr3 = this.v5;
        if (bArr3 != null) {
            h90Var.FH(3, bArr3);
        }
        byte[] bArr4 = this.Zo;
        if (bArr4 != null) {
            h90Var.FH(4, bArr4);
        }
        super.Hw(h90Var);
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    protected final int gn() {
        int iGn = super.gn();
        byte[] bArr = this.FH;
        if (bArr != null) {
            iGn += h90.Zo(1, bArr);
        }
        byte[] bArr2 = this.Hw;
        if (bArr2 != null) {
            iGn += h90.Zo(2, bArr2);
        }
        byte[] bArr3 = this.v5;
        if (bArr3 != null) {
            iGn += h90.Zo(3, bArr3);
        }
        byte[] bArr4 = this.Zo;
        return bArr4 != null ? iGn + h90.Zo(4, bArr4) : iGn;
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
            } else if (iZo == 26) {
                this.v5 = g90Var.DW();
            } else if (iZo == 34) {
                this.Zo = g90Var.DW();
            } else if (!super.u7(g90Var, iZo)) {
                return this;
            }
        }
    }
}
