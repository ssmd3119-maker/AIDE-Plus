package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class da0 extends j90<da0> {
    public Integer FH = null;
    public String Hw = null;
    public byte[] v5 = null;

    public da0() {
        this.DW = null;
        this.j6 = -1;
    }

    private final da0 tp(g90 g90Var) throws o90 {
        while (true) {
            int iZo = g90Var.Zo();
            if (iZo == 0) {
                return this;
            }
            if (iZo == 8) {
                int iJ6 = g90Var.j6();
                try {
                    int iGn = g90Var.gn();
                    if (iGn < 0 || iGn > 1) {
                        StringBuilder sb = new StringBuilder(36);
                        sb.append(iGn);
                        sb.append(" is not a valid enum Type");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.FH = Integer.valueOf(iGn);
                } catch (IllegalArgumentException unused) {
                    g90Var.a8(iJ6);
                    u7(g90Var, iZo);
                }
            } else if (iZo == 18) {
                this.Hw = g90Var.FH();
            } else if (iZo == 26) {
                this.v5 = g90Var.DW();
            } else if (!super.u7(g90Var, iZo)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    public final void Hw(h90 h90Var) throws i90 {
        Integer num = this.FH;
        if (num != null) {
            h90Var.yS(1, num.intValue());
        }
        String str = this.Hw;
        if (str != null) {
            h90Var.EQ(2, str);
        }
        byte[] bArr = this.v5;
        if (bArr != null) {
            h90Var.FH(3, bArr);
        }
        super.Hw(h90Var);
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    protected final int gn() {
        int iGn = super.gn();
        Integer num = this.FH;
        if (num != null) {
            iGn += h90.vy(1, num.intValue());
        }
        String str = this.Hw;
        if (str != null) {
            iGn += h90.QX(2, str);
        }
        byte[] bArr = this.v5;
        return bArr != null ? iGn + h90.Zo(3, bArr) : iGn;
    }

    @Override // com.google.android.gms.internal.ads.p90
    public final /* synthetic */ p90 j6(g90 g90Var) throws o90 {
        tp(g90Var);
        return this;
    }
}
