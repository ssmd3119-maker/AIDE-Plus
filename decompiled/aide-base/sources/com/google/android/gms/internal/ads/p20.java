package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class p20 extends j90<p20> {
    private Long FH = null;
    private Integer Hw = null;
    private Boolean v5 = null;
    private int[] Zo = t90.j6;
    private Long VH = null;

    public p20() {
        this.j6 = -1;
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    public final void Hw(h90 h90Var) throws i90 {
        Long l = this.FH;
        if (l != null) {
            h90Var.rN(1, l.longValue());
        }
        Integer num = this.Hw;
        if (num != null) {
            h90Var.yS(2, num.intValue());
        }
        Boolean bool = this.v5;
        if (bool != null) {
            h90Var.Mr(3, bool.booleanValue());
        }
        int[] iArr = this.Zo;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.Zo;
                if (i >= iArr2.length) {
                    break;
                }
                h90Var.yS(4, iArr2[i]);
                i++;
            }
        }
        Long l2 = this.VH;
        if (l2 != null) {
            h90Var.j3(5, l2.longValue());
        }
        super.Hw(h90Var);
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    protected final int gn() {
        int[] iArr;
        int iGn = super.gn();
        Long l = this.FH;
        if (l != null) {
            iGn += h90.U2(1, l.longValue());
        }
        Integer num = this.Hw;
        if (num != null) {
            iGn += h90.vy(2, num.intValue());
        }
        Boolean bool = this.v5;
        if (bool != null) {
            bool.booleanValue();
            iGn += h90.we(3) + 1;
        }
        int[] iArr2 = this.Zo;
        if (iArr2 != null && iArr2.length > 0) {
            int i = 0;
            int iJ0 = 0;
            while (true) {
                iArr = this.Zo;
                if (i >= iArr.length) {
                    break;
                }
                iJ0 += h90.J0(iArr[i]);
                i++;
            }
            iGn = iGn + iJ0 + (iArr.length * 1);
        }
        Long l2 = this.VH;
        return l2 != null ? iGn + h90.a8(5, l2.longValue()) : iGn;
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
            } else if (iZo == 16) {
                this.Hw = Integer.valueOf(g90Var.tp());
            } else if (iZo == 24) {
                this.v5 = Boolean.valueOf(g90Var.u7());
            } else if (iZo == 32) {
                int iJ6 = t90.j6(g90Var, 32);
                int[] iArr = this.Zo;
                int length = iArr == null ? 0 : iArr.length;
                int i = iJ6 + length;
                int[] iArr2 = new int[i];
                if (length != 0) {
                    System.arraycopy(this.Zo, 0, iArr2, 0, length);
                }
                while (length < i - 1) {
                    iArr2[length] = g90Var.tp();
                    g90Var.Zo();
                    length++;
                }
                iArr2[length] = g90Var.tp();
                this.Zo = iArr2;
            } else if (iZo == 34) {
                int iJ3 = g90Var.j3(g90Var.tp());
                int iJ62 = g90Var.j6();
                int i2 = 0;
                while (g90Var.QX() > 0) {
                    g90Var.tp();
                    i2++;
                }
                g90Var.a8(iJ62);
                int[] iArr3 = this.Zo;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int i3 = i2 + length2;
                int[] iArr4 = new int[i3];
                if (length2 != 0) {
                    System.arraycopy(this.Zo, 0, iArr4, 0, length2);
                }
                while (length2 < i3) {
                    iArr4[length2] = g90Var.tp();
                    length2++;
                }
                this.Zo = iArr4;
                g90Var.Mr(iJ3);
            } else if (iZo == 40) {
                this.VH = Long.valueOf(g90Var.EQ());
            } else if (!super.u7(g90Var, iZo)) {
                return this;
            }
        }
    }
}
