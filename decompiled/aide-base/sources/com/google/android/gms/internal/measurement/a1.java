package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class a1 extends t7<a1> {
    private static volatile a1[] VH;
    public String FH = null;
    public Boolean Hw = null;
    public Boolean v5 = null;
    public Integer Zo = null;

    public a1() {
        this.DW = null;
        this.j6 = -1;
    }

    public static a1[] gn() {
        if (VH == null) {
            synchronized (x7.DW) {
                if (VH == null) {
                    VH = new a1[0];
                }
            }
        }
        return VH;
    }

    @Override // com.google.android.gms.internal.measurement.t7, com.google.android.gms.internal.measurement.z7
    public final void DW(r7 r7Var) throws s7, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        String str = this.FH;
        if (str != null) {
            r7Var.VH(1, str);
        }
        Boolean bool = this.Hw;
        if (bool != null) {
            r7Var.gn(2, bool.booleanValue());
        }
        Boolean bool2 = this.v5;
        if (bool2 != null) {
            r7Var.gn(3, bool2.booleanValue());
        }
        Integer num = this.Zo;
        if (num != null) {
            r7Var.Mr(4, num.intValue());
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
        Boolean bool = this.Hw;
        if (bool != null) {
            bool.booleanValue();
            iFH += r7.tp(2) + 1;
        }
        Boolean bool2 = this.v5;
        if (bool2 != null) {
            bool2.booleanValue();
            iFH += r7.tp(3) + 1;
        }
        Integer num = this.Zo;
        return num != null ? iFH + r7.rN(4, num.intValue()) : iFH;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        String str = this.FH;
        if (str == null) {
            if (a1Var.FH != null) {
                return false;
            }
        } else if (!str.equals(a1Var.FH)) {
            return false;
        }
        Boolean bool = this.Hw;
        if (bool == null) {
            if (a1Var.Hw != null) {
                return false;
            }
        } else if (!bool.equals(a1Var.Hw)) {
            return false;
        }
        Boolean bool2 = this.v5;
        if (bool2 == null) {
            if (a1Var.v5 != null) {
                return false;
            }
        } else if (!bool2.equals(a1Var.v5)) {
            return false;
        }
        Integer num = this.Zo;
        if (num == null) {
            if (a1Var.Zo != null) {
                return false;
            }
        } else if (!num.equals(a1Var.Zo)) {
            return false;
        }
        v7 v7Var = this.DW;
        if (v7Var != null && !v7Var.FH()) {
            return this.DW.equals(a1Var.DW);
        }
        v7 v7Var2 = a1Var.DW;
        return v7Var2 == null || v7Var2.FH();
    }

    public final int hashCode() {
        int iHashCode = (a1.class.getName().hashCode() + 527) * 31;
        String str = this.FH;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.Hw;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.v5;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.Zo;
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
                this.FH = q7Var.DW();
            } else if (iJ8 == 16) {
                this.Hw = Boolean.valueOf(q7Var.Ws());
            } else if (iJ8 == 24) {
                this.v5 = Boolean.valueOf(q7Var.Ws());
            } else if (iJ8 == 32) {
                this.Zo = Integer.valueOf(q7Var.QX());
            } else if (!super.VH(q7Var, iJ8)) {
                return this;
            }
        }
    }
}
