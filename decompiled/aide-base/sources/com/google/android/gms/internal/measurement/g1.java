package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class g1 extends t7<g1> {
    private static volatile g1[] gn;
    public String FH = null;
    public String Hw = null;
    public Long v5 = null;
    private Float Zo = null;
    public Double VH = null;

    public g1() {
        this.DW = null;
        this.j6 = -1;
    }

    public static g1[] gn() {
        if (gn == null) {
            synchronized (x7.DW) {
                if (gn == null) {
                    gn = new g1[0];
                }
            }
        }
        return gn;
    }

    @Override // com.google.android.gms.internal.measurement.t7, com.google.android.gms.internal.measurement.z7
    public final void DW(r7 r7Var) throws s7, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        String str = this.FH;
        if (str != null) {
            r7Var.VH(1, str);
        }
        String str2 = this.Hw;
        if (str2 != null) {
            r7Var.VH(2, str2);
        }
        Long l = this.v5;
        if (l != null) {
            r7Var.er(3, l.longValue());
        }
        Float f = this.Zo;
        if (f != null) {
            r7Var.FH(4, f.floatValue());
        }
        Double d = this.VH;
        if (d != null) {
            r7Var.DW(5, d.doubleValue());
        }
        super.DW(r7Var);
    }

    @Override // com.google.android.gms.internal.measurement.t7, com.google.android.gms.internal.measurement.z7
    protected final int FH() {
        int iFH = super.FH();
        String str = this.FH;
        if (str != null) {
            iFH += r7.Ws(1, str);
        }
        String str2 = this.Hw;
        if (str2 != null) {
            iFH += r7.Ws(2, str2);
        }
        Long l = this.v5;
        if (l != null) {
            iFH += r7.j3(3, l.longValue());
        }
        Float f = this.Zo;
        if (f != null) {
            f.floatValue();
            iFH += r7.tp(4) + 4;
        }
        Double d = this.VH;
        if (d == null) {
            return iFH;
        }
        d.doubleValue();
        return iFH + r7.tp(5) + 8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        String str = this.FH;
        if (str == null) {
            if (g1Var.FH != null) {
                return false;
            }
        } else if (!str.equals(g1Var.FH)) {
            return false;
        }
        String str2 = this.Hw;
        if (str2 == null) {
            if (g1Var.Hw != null) {
                return false;
            }
        } else if (!str2.equals(g1Var.Hw)) {
            return false;
        }
        Long l = this.v5;
        if (l == null) {
            if (g1Var.v5 != null) {
                return false;
            }
        } else if (!l.equals(g1Var.v5)) {
            return false;
        }
        Float f = this.Zo;
        if (f == null) {
            if (g1Var.Zo != null) {
                return false;
            }
        } else if (!f.equals(g1Var.Zo)) {
            return false;
        }
        Double d = this.VH;
        if (d == null) {
            if (g1Var.VH != null) {
                return false;
            }
        } else if (!d.equals(g1Var.VH)) {
            return false;
        }
        v7 v7Var = this.DW;
        if (v7Var != null && !v7Var.FH()) {
            return this.DW.equals(g1Var.DW);
        }
        v7 v7Var2 = g1Var.DW;
        return v7Var2 == null || v7Var2.FH();
    }

    public final int hashCode() {
        int iHashCode = (g1.class.getName().hashCode() + 527) * 31;
        String str = this.FH;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.Hw;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.v5;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Float f = this.Zo;
        int iHashCode6 = (iHashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        Double d = this.VH;
        int iHashCode7 = (iHashCode6 + (d == null ? 0 : d.hashCode())) * 31;
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
            if (iJ8 == 10) {
                this.FH = q7Var.DW();
            } else if (iJ8 == 18) {
                this.Hw = q7Var.DW();
            } else if (iJ8 == 24) {
                this.v5 = Long.valueOf(q7Var.XL());
            } else if (iJ8 == 37) {
                this.Zo = Float.valueOf(Float.intBitsToFloat(q7Var.aM()));
            } else if (iJ8 == 41) {
                this.VH = Double.valueOf(Double.longBitsToDouble(q7Var.j3()));
            } else if (!super.VH(q7Var, iJ8)) {
                return this;
            }
        }
    }
}
