package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class w0 extends t7<w0> {
    private static volatile w0[] VH;
    public z0 FH = null;
    public x0 Hw = null;
    public Boolean v5 = null;
    public String Zo = null;

    public w0() {
        this.DW = null;
        this.j6 = -1;
    }

    public static w0[] gn() {
        if (VH == null) {
            synchronized (x7.DW) {
                if (VH == null) {
                    VH = new w0[0];
                }
            }
        }
        return VH;
    }

    @Override // com.google.android.gms.internal.measurement.t7, com.google.android.gms.internal.measurement.z7
    public final void DW(r7 r7Var) throws s7, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        z0 z0Var = this.FH;
        if (z0Var != null) {
            r7Var.v5(1, z0Var);
        }
        x0 x0Var = this.Hw;
        if (x0Var != null) {
            r7Var.v5(2, x0Var);
        }
        Boolean bool = this.v5;
        if (bool != null) {
            r7Var.gn(3, bool.booleanValue());
        }
        String str = this.Zo;
        if (str != null) {
            r7Var.VH(4, str);
        }
        super.DW(r7Var);
    }

    @Override // com.google.android.gms.internal.measurement.t7, com.google.android.gms.internal.measurement.z7
    protected final int FH() {
        int iFH = super.FH();
        z0 z0Var = this.FH;
        if (z0Var != null) {
            iFH += r7.Zo(1, z0Var);
        }
        x0 x0Var = this.Hw;
        if (x0Var != null) {
            iFH += r7.Zo(2, x0Var);
        }
        Boolean bool = this.v5;
        if (bool != null) {
            bool.booleanValue();
            iFH += r7.tp(3) + 1;
        }
        String str = this.Zo;
        return str != null ? iFH + r7.Ws(4, str) : iFH;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        z0 z0Var = this.FH;
        if (z0Var == null) {
            if (w0Var.FH != null) {
                return false;
            }
        } else if (!z0Var.equals(w0Var.FH)) {
            return false;
        }
        x0 x0Var = this.Hw;
        if (x0Var == null) {
            if (w0Var.Hw != null) {
                return false;
            }
        } else if (!x0Var.equals(w0Var.Hw)) {
            return false;
        }
        Boolean bool = this.v5;
        if (bool == null) {
            if (w0Var.v5 != null) {
                return false;
            }
        } else if (!bool.equals(w0Var.v5)) {
            return false;
        }
        String str = this.Zo;
        if (str == null) {
            if (w0Var.Zo != null) {
                return false;
            }
        } else if (!str.equals(w0Var.Zo)) {
            return false;
        }
        v7 v7Var = this.DW;
        if (v7Var != null && !v7Var.FH()) {
            return this.DW.equals(w0Var.DW);
        }
        v7 v7Var2 = w0Var.DW;
        return v7Var2 == null || v7Var2.FH();
    }

    public final int hashCode() {
        int iHashCode = w0.class.getName().hashCode() + 527;
        z0 z0Var = this.FH;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode * 31) + (z0Var == null ? 0 : z0Var.hashCode());
        x0 x0Var = this.Hw;
        int iHashCode4 = ((iHashCode3 * 31) + (x0Var == null ? 0 : x0Var.hashCode())) * 31;
        Boolean bool = this.v5;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.Zo;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
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
                if (this.FH == null) {
                    this.FH = new z0();
                }
                q7Var.Hw(this.FH);
            } else if (iJ8 == 18) {
                if (this.Hw == null) {
                    this.Hw = new x0();
                }
                q7Var.Hw(this.Hw);
            } else if (iJ8 == 24) {
                this.v5 = Boolean.valueOf(q7Var.Ws());
            } else if (iJ8 == 34) {
                this.Zo = q7Var.DW();
            } else if (!super.VH(q7Var, iJ8)) {
                return this;
            }
        }
    }
}
