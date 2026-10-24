package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ca0 extends j90<ca0> {
    private w90 FH = null;
    private aa0[] Hw = aa0.tp();
    private byte[] v5 = null;
    private byte[] Zo = null;
    private Integer VH = null;
    private byte[] gn = null;

    public ca0() {
        this.DW = null;
        this.j6 = -1;
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    public final void Hw(h90 h90Var) throws i90 {
        w90 w90Var = this.FH;
        if (w90Var != null) {
            h90Var.tp(1, w90Var);
        }
        aa0[] aa0VarArr = this.Hw;
        if (aa0VarArr != null && aa0VarArr.length > 0) {
            int i = 0;
            while (true) {
                aa0[] aa0VarArr2 = this.Hw;
                if (i >= aa0VarArr2.length) {
                    break;
                }
                aa0 aa0Var = aa0VarArr2[i];
                if (aa0Var != null) {
                    h90Var.DW(2, aa0Var);
                }
                i++;
            }
        }
        byte[] bArr = this.v5;
        if (bArr != null) {
            h90Var.FH(3, bArr);
        }
        byte[] bArr2 = this.Zo;
        if (bArr2 != null) {
            h90Var.FH(4, bArr2);
        }
        Integer num = this.VH;
        if (num != null) {
            h90Var.yS(5, num.intValue());
        }
        byte[] bArr3 = this.gn;
        if (bArr3 != null) {
            h90Var.FH(6, bArr3);
        }
        super.Hw(h90Var);
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    protected final int gn() {
        int iGn = super.gn();
        w90 w90Var = this.FH;
        if (w90Var != null) {
            iGn += x40.vJ(1, w90Var);
        }
        aa0[] aa0VarArr = this.Hw;
        if (aa0VarArr != null && aa0VarArr.length > 0) {
            int i = 0;
            while (true) {
                aa0[] aa0VarArr2 = this.Hw;
                if (i >= aa0VarArr2.length) {
                    break;
                }
                aa0 aa0Var = aa0VarArr2[i];
                if (aa0Var != null) {
                    iGn += h90.v5(2, aa0Var);
                }
                i++;
            }
        }
        byte[] bArr = this.v5;
        if (bArr != null) {
            iGn += h90.Zo(3, bArr);
        }
        byte[] bArr2 = this.Zo;
        if (bArr2 != null) {
            iGn += h90.Zo(4, bArr2);
        }
        Integer num = this.VH;
        if (num != null) {
            iGn += h90.vy(5, num.intValue());
        }
        byte[] bArr3 = this.gn;
        return bArr3 != null ? iGn + h90.Zo(6, bArr3) : iGn;
    }

    @Override // com.google.android.gms.internal.ads.p90
    public final /* synthetic */ p90 j6(g90 g90Var) throws o90 {
        while (true) {
            int iZo = g90Var.Zo();
            if (iZo == 0) {
                return this;
            }
            if (iZo == 10) {
                this.FH = (w90) g90Var.Hw(w90.yS());
            } else if (iZo == 18) {
                int iJ6 = t90.j6(g90Var, 18);
                aa0[] aa0VarArr = this.Hw;
                int length = aa0VarArr == null ? 0 : aa0VarArr.length;
                int i = iJ6 + length;
                aa0[] aa0VarArr2 = new aa0[i];
                if (length != 0) {
                    System.arraycopy(this.Hw, 0, aa0VarArr2, 0, length);
                }
                while (length < i - 1) {
                    aa0VarArr2[length] = new aa0();
                    g90Var.v5(aa0VarArr2[length]);
                    g90Var.Zo();
                    length++;
                }
                aa0VarArr2[length] = new aa0();
                g90Var.v5(aa0VarArr2[length]);
                this.Hw = aa0VarArr2;
            } else if (iZo == 26) {
                this.v5 = g90Var.DW();
            } else if (iZo == 34) {
                this.Zo = g90Var.DW();
            } else if (iZo == 40) {
                this.VH = Integer.valueOf(g90Var.gn());
            } else if (iZo == 50) {
                this.gn = g90Var.DW();
            } else if (!super.u7(g90Var, iZo)) {
                return this;
            }
        }
    }
}
