package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class n60 extends j90<n60> {
    public byte[][] FH = t90.Hw;
    public byte[] Hw = null;
    public Integer Zo;
    private Integer v5;

    public n60() {
        this.j6 = -1;
    }

    private final n60 tp(g90 g90Var) throws o90 {
        while (true) {
            int iZo = g90Var.Zo();
            if (iZo == 0) {
                return this;
            }
            if (iZo == 10) {
                int iJ6 = t90.j6(g90Var, 10);
                byte[][] bArr = this.FH;
                int length = bArr == null ? 0 : bArr.length;
                int i = iJ6 + length;
                byte[][] bArr2 = new byte[i][];
                if (length != 0) {
                    System.arraycopy(this.FH, 0, bArr2, 0, length);
                }
                while (length < i - 1) {
                    bArr2[length] = g90Var.DW();
                    g90Var.Zo();
                    length++;
                }
                bArr2[length] = g90Var.DW();
                this.FH = bArr2;
            } else if (iZo == 18) {
                this.Hw = g90Var.DW();
            } else if (iZo == 24) {
                int iJ62 = g90Var.j6();
                try {
                    int iTp = g90Var.tp();
                    ry.DW(iTp);
                    this.v5 = Integer.valueOf(iTp);
                } catch (IllegalArgumentException unused) {
                    g90Var.a8(iJ62);
                    u7(g90Var, iZo);
                }
            } else if (iZo == 32) {
                int iJ63 = g90Var.j6();
                try {
                    int iTp2 = g90Var.tp();
                    ry.FH(iTp2);
                    this.Zo = Integer.valueOf(iTp2);
                } catch (IllegalArgumentException unused2) {
                    g90Var.a8(iJ63);
                    u7(g90Var, iZo);
                }
            } else if (!super.u7(g90Var, iZo)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    public final void Hw(h90 h90Var) throws i90 {
        byte[][] bArr = this.FH;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.FH;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    h90Var.FH(1, bArr3);
                }
                i++;
            }
        }
        byte[] bArr4 = this.Hw;
        if (bArr4 != null) {
            h90Var.FH(2, bArr4);
        }
        Integer num = this.v5;
        if (num != null) {
            h90Var.yS(3, num.intValue());
        }
        Integer num2 = this.Zo;
        if (num2 != null) {
            h90Var.yS(4, num2.intValue());
        }
        super.Hw(h90Var);
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    protected final int gn() {
        int iGn = super.gn();
        byte[][] bArr = this.FH;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            int iBT = 0;
            int i2 = 0;
            while (true) {
                byte[][] bArr2 = this.FH;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    i2++;
                    iBT += h90.BT(bArr3);
                }
                i++;
            }
            iGn = iGn + iBT + (i2 * 1);
        }
        byte[] bArr4 = this.Hw;
        if (bArr4 != null) {
            iGn += h90.Zo(2, bArr4);
        }
        Integer num = this.v5;
        if (num != null) {
            iGn += h90.vy(3, num.intValue());
        }
        Integer num2 = this.Zo;
        return num2 != null ? iGn + h90.vy(4, num2.intValue()) : iGn;
    }

    @Override // com.google.android.gms.internal.ads.p90
    public final /* synthetic */ p90 j6(g90 g90Var) throws o90 {
        tp(g90Var);
        return this;
    }
}
