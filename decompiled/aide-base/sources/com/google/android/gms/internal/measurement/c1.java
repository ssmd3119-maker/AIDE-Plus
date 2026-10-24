package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class c1 extends t7<c1> {
    private static volatile c1[] v5;
    public String FH = null;
    public String Hw = null;

    public c1() {
        this.DW = null;
        this.j6 = -1;
    }

    public static c1[] gn() {
        if (v5 == null) {
            synchronized (x7.DW) {
                if (v5 == null) {
                    v5 = new c1[0];
                }
            }
        }
        return v5;
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
        return str2 != null ? iFH + r7.Ws(2, str2) : iFH;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        String str = this.FH;
        if (str == null) {
            if (c1Var.FH != null) {
                return false;
            }
        } else if (!str.equals(c1Var.FH)) {
            return false;
        }
        String str2 = this.Hw;
        if (str2 == null) {
            if (c1Var.Hw != null) {
                return false;
            }
        } else if (!str2.equals(c1Var.Hw)) {
            return false;
        }
        v7 v7Var = this.DW;
        if (v7Var != null && !v7Var.FH()) {
            return this.DW.equals(c1Var.DW);
        }
        v7 v7Var2 = c1Var.DW;
        return v7Var2 == null || v7Var2.FH();
    }

    public final int hashCode() {
        int iHashCode = (c1.class.getName().hashCode() + 527) * 31;
        String str = this.FH;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.Hw;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        v7 v7Var = this.DW;
        if (v7Var != null && !v7Var.FH()) {
            iHashCode2 = this.DW.hashCode();
        }
        return iHashCode4 + iHashCode2;
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
            } else if (!super.VH(q7Var, iJ8)) {
                return this;
            }
        }
    }
}
