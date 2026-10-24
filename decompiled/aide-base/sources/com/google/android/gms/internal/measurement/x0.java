package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class x0 extends t7<x0> {
    public Integer FH = null;
    public Boolean Hw = null;
    public String v5 = null;
    public String Zo = null;
    public String VH = null;

    public x0() {
        this.DW = null;
        this.j6 = -1;
    }

    private final x0 gn(q7 q7Var) throws y7 {
        while (true) {
            int iJ8 = q7Var.J8();
            if (iJ8 == 0) {
                return this;
            }
            if (iJ8 == 8) {
                int iJ6 = q7Var.j6();
                try {
                    int iQX = q7Var.QX();
                    if (iQX < 0 || iQX > 4) {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append(iQX);
                        sb.append(" is not a valid enum ComparisonType");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.FH = Integer.valueOf(iQX);
                } catch (IllegalArgumentException unused) {
                    q7Var.tp(iJ6);
                    VH(q7Var, iJ8);
                }
            } else if (iJ8 == 16) {
                this.Hw = Boolean.valueOf(q7Var.Ws());
            } else if (iJ8 == 26) {
                this.v5 = q7Var.DW();
            } else if (iJ8 == 34) {
                this.Zo = q7Var.DW();
            } else if (iJ8 == 42) {
                this.VH = q7Var.DW();
            } else if (!super.VH(q7Var, iJ8)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.t7, com.google.android.gms.internal.measurement.z7
    public final void DW(r7 r7Var) throws s7, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        Integer num = this.FH;
        if (num != null) {
            r7Var.Mr(1, num.intValue());
        }
        Boolean bool = this.Hw;
        if (bool != null) {
            r7Var.gn(2, bool.booleanValue());
        }
        String str = this.v5;
        if (str != null) {
            r7Var.VH(3, str);
        }
        String str2 = this.Zo;
        if (str2 != null) {
            r7Var.VH(4, str2);
        }
        String str3 = this.VH;
        if (str3 != null) {
            r7Var.VH(5, str3);
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
        Boolean bool = this.Hw;
        if (bool != null) {
            bool.booleanValue();
            iFH += r7.tp(2) + 1;
        }
        String str = this.v5;
        if (str != null) {
            iFH += r7.Ws(3, str);
        }
        String str2 = this.Zo;
        if (str2 != null) {
            iFH += r7.Ws(4, str2);
        }
        String str3 = this.VH;
        return str3 != null ? iFH + r7.Ws(5, str3) : iFH;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        Integer num = this.FH;
        if (num == null) {
            if (x0Var.FH != null) {
                return false;
            }
        } else if (!num.equals(x0Var.FH)) {
            return false;
        }
        Boolean bool = this.Hw;
        if (bool == null) {
            if (x0Var.Hw != null) {
                return false;
            }
        } else if (!bool.equals(x0Var.Hw)) {
            return false;
        }
        String str = this.v5;
        if (str == null) {
            if (x0Var.v5 != null) {
                return false;
            }
        } else if (!str.equals(x0Var.v5)) {
            return false;
        }
        String str2 = this.Zo;
        if (str2 == null) {
            if (x0Var.Zo != null) {
                return false;
            }
        } else if (!str2.equals(x0Var.Zo)) {
            return false;
        }
        String str3 = this.VH;
        if (str3 == null) {
            if (x0Var.VH != null) {
                return false;
            }
        } else if (!str3.equals(x0Var.VH)) {
            return false;
        }
        v7 v7Var = this.DW;
        if (v7Var != null && !v7Var.FH()) {
            return this.DW.equals(x0Var.DW);
        }
        v7 v7Var2 = x0Var.DW;
        return v7Var2 == null || v7Var2.FH();
    }

    public final int hashCode() {
        int iHashCode = (x0.class.getName().hashCode() + 527) * 31;
        Integer num = this.FH;
        int iHashCode2 = 0;
        int iIntValue = (iHashCode + (num == null ? 0 : num.intValue())) * 31;
        Boolean bool = this.Hw;
        int iHashCode3 = (iIntValue + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.v5;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.Zo;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.VH;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        v7 v7Var = this.DW;
        if (v7Var != null && !v7Var.FH()) {
            iHashCode2 = this.DW.hashCode();
        }
        return iHashCode6 + iHashCode2;
    }

    @Override // com.google.android.gms.internal.measurement.z7
    public final /* synthetic */ z7 j6(q7 q7Var) throws y7 {
        gn(q7Var);
        return this;
    }
}
