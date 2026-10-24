package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class f1 extends t7<f1> {
    private static volatile f1[] gn;
    public g1[] FH = g1.gn();
    public String Hw = null;
    public Long v5 = null;
    public Long Zo = null;
    public Integer VH = null;

    public f1() {
        this.DW = null;
        this.j6 = -1;
    }

    public static f1[] gn() {
        if (gn == null) {
            synchronized (x7.DW) {
                if (gn == null) {
                    gn = new f1[0];
                }
            }
        }
        return gn;
    }

    @Override // com.google.android.gms.internal.measurement.t7, com.google.android.gms.internal.measurement.z7
    public final void DW(r7 r7Var) throws s7, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        g1[] g1VarArr = this.FH;
        if (g1VarArr != null && g1VarArr.length > 0) {
            int i = 0;
            while (true) {
                g1[] g1VarArr2 = this.FH;
                if (i >= g1VarArr2.length) {
                    break;
                }
                g1 g1Var = g1VarArr2[i];
                if (g1Var != null) {
                    r7Var.v5(1, g1Var);
                }
                i++;
            }
        }
        String str = this.Hw;
        if (str != null) {
            r7Var.VH(2, str);
        }
        Long l = this.v5;
        if (l != null) {
            r7Var.er(3, l.longValue());
        }
        Long l2 = this.Zo;
        if (l2 != null) {
            r7Var.er(4, l2.longValue());
        }
        Integer num = this.VH;
        if (num != null) {
            r7Var.Mr(5, num.intValue());
        }
        super.DW(r7Var);
    }

    @Override // com.google.android.gms.internal.measurement.t7, com.google.android.gms.internal.measurement.z7
    protected final int FH() {
        int iFH = super.FH();
        g1[] g1VarArr = this.FH;
        if (g1VarArr != null && g1VarArr.length > 0) {
            int i = 0;
            while (true) {
                g1[] g1VarArr2 = this.FH;
                if (i >= g1VarArr2.length) {
                    break;
                }
                g1 g1Var = g1VarArr2[i];
                if (g1Var != null) {
                    iFH += r7.Zo(1, g1Var);
                }
                i++;
            }
        }
        String str = this.Hw;
        if (str != null) {
            iFH += r7.Ws(2, str);
        }
        Long l = this.v5;
        if (l != null) {
            iFH += r7.j3(3, l.longValue());
        }
        Long l2 = this.Zo;
        if (l2 != null) {
            iFH += r7.j3(4, l2.longValue());
        }
        Integer num = this.VH;
        return num != null ? iFH + r7.rN(5, num.intValue()) : iFH;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        if (!x7.FH(this.FH, f1Var.FH)) {
            return false;
        }
        String str = this.Hw;
        if (str == null) {
            if (f1Var.Hw != null) {
                return false;
            }
        } else if (!str.equals(f1Var.Hw)) {
            return false;
        }
        Long l = this.v5;
        if (l == null) {
            if (f1Var.v5 != null) {
                return false;
            }
        } else if (!l.equals(f1Var.v5)) {
            return false;
        }
        Long l2 = this.Zo;
        if (l2 == null) {
            if (f1Var.Zo != null) {
                return false;
            }
        } else if (!l2.equals(f1Var.Zo)) {
            return false;
        }
        Integer num = this.VH;
        if (num == null) {
            if (f1Var.VH != null) {
                return false;
            }
        } else if (!num.equals(f1Var.VH)) {
            return false;
        }
        v7 v7Var = this.DW;
        if (v7Var != null && !v7Var.FH()) {
            return this.DW.equals(f1Var.DW);
        }
        v7 v7Var2 = f1Var.DW;
        return v7Var2 == null || v7Var2.FH();
    }

    public final int hashCode() {
        int iHashCode = (((f1.class.getName().hashCode() + 527) * 31) + x7.Zo(this.FH)) * 31;
        String str = this.Hw;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.v5;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.Zo;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.VH;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        v7 v7Var = this.DW;
        if (v7Var != null && !v7Var.FH()) {
            iHashCode2 = this.DW.hashCode();
        }
        return iHashCode6 + iHashCode2;
    }

    @Override // com.google.android.gms.internal.measurement.z7
    public final /* synthetic */ z7 j6(q7 q7Var) throws y7 {
        while (true) {
            int iJ8 = q7Var.J8();
            if (iJ8 == 0) {
                return this;
            }
            if (iJ8 == 10) {
                int iJ6 = c8.j6(q7Var, 10);
                g1[] g1VarArr = this.FH;
                int length = g1VarArr == null ? 0 : g1VarArr.length;
                int i = iJ6 + length;
                g1[] g1VarArr2 = new g1[i];
                if (length != 0) {
                    System.arraycopy(this.FH, 0, g1VarArr2, 0, length);
                }
                while (length < i - 1) {
                    g1VarArr2[length] = new g1();
                    q7Var.Hw(g1VarArr2[length]);
                    q7Var.J8();
                    length++;
                }
                g1VarArr2[length] = new g1();
                q7Var.Hw(g1VarArr2[length]);
                this.FH = g1VarArr2;
            } else if (iJ8 == 18) {
                this.Hw = q7Var.DW();
            } else if (iJ8 == 24) {
                this.v5 = Long.valueOf(q7Var.XL());
            } else if (iJ8 == 32) {
                this.Zo = Long.valueOf(q7Var.XL());
            } else if (iJ8 == 40) {
                this.VH = Integer.valueOf(q7Var.QX());
            } else if (!super.VH(q7Var, iJ8)) {
                return this;
            }
        }
    }
}
