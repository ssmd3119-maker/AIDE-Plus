package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class d1 extends t7<d1> {
    private static volatile d1[] VH;
    public Integer FH = null;
    public j1 Hw = null;
    public j1 v5 = null;
    public Boolean Zo = null;

    public d1() {
        this.DW = null;
        this.j6 = -1;
    }

    public static d1[] gn() {
        if (VH == null) {
            synchronized (x7.DW) {
                if (VH == null) {
                    VH = new d1[0];
                }
            }
        }
        return VH;
    }

    @Override // com.google.android.gms.internal.measurement.t7, com.google.android.gms.internal.measurement.z7
    public final void DW(r7 r7Var) throws s7, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        Integer num = this.FH;
        if (num != null) {
            r7Var.Mr(1, num.intValue());
        }
        j1 j1Var = this.Hw;
        if (j1Var != null) {
            r7Var.v5(2, j1Var);
        }
        j1 j1Var2 = this.v5;
        if (j1Var2 != null) {
            r7Var.v5(3, j1Var2);
        }
        Boolean bool = this.Zo;
        if (bool != null) {
            r7Var.gn(4, bool.booleanValue());
        }
        super.DW(r7Var);
    }

    @Override // com.google.android.gms.internal.measurement.t7, com.google.android.gms.internal.measurement.z7
    protected final int FH() {
        int iFH = super.FH();
        Integer num = this.FH;
        if (num != null) {
            iFH += r7.rN(1, num.intValue());
        }
        j1 j1Var = this.Hw;
        if (j1Var != null) {
            iFH += r7.Zo(2, j1Var);
        }
        j1 j1Var2 = this.v5;
        if (j1Var2 != null) {
            iFH += r7.Zo(3, j1Var2);
        }
        Boolean bool = this.Zo;
        if (bool == null) {
            return iFH;
        }
        bool.booleanValue();
        return iFH + r7.tp(4) + 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        Integer num = this.FH;
        if (num == null) {
            if (d1Var.FH != null) {
                return false;
            }
        } else if (!num.equals(d1Var.FH)) {
            return false;
        }
        j1 j1Var = this.Hw;
        if (j1Var == null) {
            if (d1Var.Hw != null) {
                return false;
            }
        } else if (!j1Var.equals(d1Var.Hw)) {
            return false;
        }
        j1 j1Var2 = this.v5;
        if (j1Var2 == null) {
            if (d1Var.v5 != null) {
                return false;
            }
        } else if (!j1Var2.equals(d1Var.v5)) {
            return false;
        }
        Boolean bool = this.Zo;
        if (bool == null) {
            if (d1Var.Zo != null) {
                return false;
            }
        } else if (!bool.equals(d1Var.Zo)) {
            return false;
        }
        v7 v7Var = this.DW;
        if (v7Var != null && !v7Var.FH()) {
            return this.DW.equals(d1Var.DW);
        }
        v7 v7Var2 = d1Var.DW;
        return v7Var2 == null || v7Var2.FH();
    }

    public final int hashCode() {
        int iHashCode = (d1.class.getName().hashCode() + 527) * 31;
        Integer num = this.FH;
        int iHashCode2 = 0;
        int iHashCode3 = iHashCode + (num == null ? 0 : num.hashCode());
        j1 j1Var = this.Hw;
        int iHashCode4 = (iHashCode3 * 31) + (j1Var == null ? 0 : j1Var.hashCode());
        j1 j1Var2 = this.v5;
        int iHashCode5 = ((iHashCode4 * 31) + (j1Var2 == null ? 0 : j1Var2.hashCode())) * 31;
        Boolean bool = this.Zo;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
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
            if (iJ8 == 8) {
                this.FH = Integer.valueOf(q7Var.QX());
            } else if (iJ8 == 18) {
                if (this.Hw == null) {
                    this.Hw = new j1();
                }
                q7Var.Hw(this.Hw);
            } else if (iJ8 == 26) {
                if (this.v5 == null) {
                    this.v5 = new j1();
                }
                q7Var.Hw(this.v5);
            } else if (iJ8 == 32) {
                this.Zo = Boolean.valueOf(q7Var.Ws());
            } else if (!super.VH(q7Var, iJ8)) {
                return this;
            }
        }
    }
}
