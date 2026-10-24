package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class l1 extends t7<l1> {
    private static volatile l1[] u7;
    public Long FH = null;
    public String Hw = null;
    public String v5 = null;
    public Long Zo = null;
    private Float VH = null;
    public Double gn = null;

    public l1() {
        this.DW = null;
        this.j6 = -1;
    }

    public static l1[] gn() {
        if (u7 == null) {
            synchronized (x7.DW) {
                if (u7 == null) {
                    u7 = new l1[0];
                }
            }
        }
        return u7;
    }

    @Override // com.google.android.gms.internal.measurement.t7, com.google.android.gms.internal.measurement.z7
    public final void DW(r7 r7Var) throws s7, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        Long l = this.FH;
        if (l != null) {
            r7Var.er(1, l.longValue());
        }
        String str = this.Hw;
        if (str != null) {
            r7Var.VH(2, str);
        }
        String str2 = this.v5;
        if (str2 != null) {
            r7Var.VH(3, str2);
        }
        Long l2 = this.Zo;
        if (l2 != null) {
            r7Var.er(4, l2.longValue());
        }
        Float f = this.VH;
        if (f != null) {
            r7Var.FH(5, f.floatValue());
        }
        Double d = this.gn;
        if (d != null) {
            r7Var.DW(6, d.doubleValue());
        }
        super.DW(r7Var);
    }

    @Override // com.google.android.gms.internal.measurement.t7, com.google.android.gms.internal.measurement.z7
    protected final int FH() {
        int iFH = super.FH();
        Long l = this.FH;
        if (l != null) {
            iFH += r7.j3(1, l.longValue());
        }
        String str = this.Hw;
        if (str != null) {
            iFH += r7.Ws(2, str);
        }
        String str2 = this.v5;
        if (str2 != null) {
            iFH += r7.Ws(3, str2);
        }
        Long l2 = this.Zo;
        if (l2 != null) {
            iFH += r7.j3(4, l2.longValue());
        }
        Float f = this.VH;
        if (f != null) {
            f.floatValue();
            iFH += r7.tp(5) + 4;
        }
        Double d = this.gn;
        if (d == null) {
            return iFH;
        }
        d.doubleValue();
        return iFH + r7.tp(6) + 8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        Long l = this.FH;
        if (l == null) {
            if (l1Var.FH != null) {
                return false;
            }
        } else if (!l.equals(l1Var.FH)) {
            return false;
        }
        String str = this.Hw;
        if (str == null) {
            if (l1Var.Hw != null) {
                return false;
            }
        } else if (!str.equals(l1Var.Hw)) {
            return false;
        }
        String str2 = this.v5;
        if (str2 == null) {
            if (l1Var.v5 != null) {
                return false;
            }
        } else if (!str2.equals(l1Var.v5)) {
            return false;
        }
        Long l2 = this.Zo;
        if (l2 == null) {
            if (l1Var.Zo != null) {
                return false;
            }
        } else if (!l2.equals(l1Var.Zo)) {
            return false;
        }
        Float f = this.VH;
        if (f == null) {
            if (l1Var.VH != null) {
                return false;
            }
        } else if (!f.equals(l1Var.VH)) {
            return false;
        }
        Double d = this.gn;
        if (d == null) {
            if (l1Var.gn != null) {
                return false;
            }
        } else if (!d.equals(l1Var.gn)) {
            return false;
        }
        v7 v7Var = this.DW;
        if (v7Var != null && !v7Var.FH()) {
            return this.DW.equals(l1Var.DW);
        }
        v7 v7Var2 = l1Var.DW;
        return v7Var2 == null || v7Var2.FH();
    }

    public final int hashCode() {
        int iHashCode = (l1.class.getName().hashCode() + 527) * 31;
        Long l = this.FH;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.Hw;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.v5;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.Zo;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Float f = this.VH;
        int iHashCode7 = (iHashCode6 + (f == null ? 0 : f.hashCode())) * 31;
        Double d = this.gn;
        int iHashCode8 = (iHashCode7 + (d == null ? 0 : d.hashCode())) * 31;
        v7 v7Var = this.DW;
        if (v7Var != null && !v7Var.FH()) {
            iHashCode2 = this.DW.hashCode();
        }
        return iHashCode8 + iHashCode2;
    }

    @Override // com.google.android.gms.internal.measurement.z7
    public final /* synthetic */ z7 j6(q7 q7Var) throws y7 {
        while (true) {
            int iJ8 = q7Var.J8();
            if (iJ8 == 0) {
                return this;
            }
            if (iJ8 == 8) {
                this.FH = Long.valueOf(q7Var.XL());
            } else if (iJ8 == 18) {
                this.Hw = q7Var.DW();
            } else if (iJ8 == 26) {
                this.v5 = q7Var.DW();
            } else if (iJ8 == 32) {
                this.Zo = Long.valueOf(q7Var.XL());
            } else if (iJ8 == 45) {
                this.VH = Float.valueOf(Float.intBitsToFloat(q7Var.aM()));
            } else if (iJ8 == 49) {
                this.gn = Double.valueOf(Double.longBitsToDouble(q7Var.j3()));
            } else if (!super.VH(q7Var, iJ8)) {
                return this;
            }
        }
    }
}
