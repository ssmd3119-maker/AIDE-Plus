package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class y0 extends t7<y0> {
    private static volatile y0[] gn;
    public Integer FH = null;
    public String Hw = null;
    public w0 v5 = null;
    public Boolean Zo = null;
    public Boolean VH = null;

    public y0() {
        this.DW = null;
        this.j6 = -1;
    }

    public static y0[] gn() {
        if (gn == null) {
            synchronized (x7.DW) {
                if (gn == null) {
                    gn = new y0[0];
                }
            }
        }
        return gn;
    }

    @Override // com.google.android.gms.internal.measurement.t7, com.google.android.gms.internal.measurement.z7
    public final void DW(r7 r7Var) throws s7, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        Integer num = this.FH;
        if (num != null) {
            r7Var.Mr(1, num.intValue());
        }
        String str = this.Hw;
        if (str != null) {
            r7Var.VH(2, str);
        }
        w0 w0Var = this.v5;
        if (w0Var != null) {
            r7Var.v5(3, w0Var);
        }
        Boolean bool = this.Zo;
        if (bool != null) {
            r7Var.gn(4, bool.booleanValue());
        }
        Boolean bool2 = this.VH;
        if (bool2 != null) {
            r7Var.gn(5, bool2.booleanValue());
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
        String str = this.Hw;
        if (str != null) {
            iFH += r7.Ws(2, str);
        }
        w0 w0Var = this.v5;
        if (w0Var != null) {
            iFH += r7.Zo(3, w0Var);
        }
        Boolean bool = this.Zo;
        if (bool != null) {
            bool.booleanValue();
            iFH += r7.tp(4) + 1;
        }
        Boolean bool2 = this.VH;
        if (bool2 == null) {
            return iFH;
        }
        bool2.booleanValue();
        return iFH + r7.tp(5) + 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        Integer num = this.FH;
        if (num == null) {
            if (y0Var.FH != null) {
                return false;
            }
        } else if (!num.equals(y0Var.FH)) {
            return false;
        }
        String str = this.Hw;
        if (str == null) {
            if (y0Var.Hw != null) {
                return false;
            }
        } else if (!str.equals(y0Var.Hw)) {
            return false;
        }
        w0 w0Var = this.v5;
        if (w0Var == null) {
            if (y0Var.v5 != null) {
                return false;
            }
        } else if (!w0Var.equals(y0Var.v5)) {
            return false;
        }
        Boolean bool = this.Zo;
        if (bool == null) {
            if (y0Var.Zo != null) {
                return false;
            }
        } else if (!bool.equals(y0Var.Zo)) {
            return false;
        }
        Boolean bool2 = this.VH;
        if (bool2 == null) {
            if (y0Var.VH != null) {
                return false;
            }
        } else if (!bool2.equals(y0Var.VH)) {
            return false;
        }
        v7 v7Var = this.DW;
        if (v7Var != null && !v7Var.FH()) {
            return this.DW.equals(y0Var.DW);
        }
        v7 v7Var2 = y0Var.DW;
        return v7Var2 == null || v7Var2.FH();
    }

    public final int hashCode() {
        int iHashCode = (y0.class.getName().hashCode() + 527) * 31;
        Integer num = this.FH;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.Hw;
        int iHashCode4 = iHashCode3 + (str == null ? 0 : str.hashCode());
        w0 w0Var = this.v5;
        int iHashCode5 = ((iHashCode4 * 31) + (w0Var == null ? 0 : w0Var.hashCode())) * 31;
        Boolean bool = this.Zo;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.VH;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        v7 v7Var = this.DW;
        if (v7Var != null && !v7Var.FH()) {
            iHashCode2 = this.DW.hashCode();
        }
        return iHashCode7 + iHashCode2;
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
                this.Hw = q7Var.DW();
            } else if (iJ8 == 26) {
                if (this.v5 == null) {
                    this.v5 = new w0();
                }
                q7Var.Hw(this.v5);
            } else if (iJ8 == 32) {
                this.Zo = Boolean.valueOf(q7Var.Ws());
            } else if (iJ8 == 40) {
                this.VH = Boolean.valueOf(q7Var.Ws());
            } else if (!super.VH(q7Var, iJ8)) {
                return this;
            }
        }
    }
}
