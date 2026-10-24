package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class e1 extends t7<e1> {
    private static volatile e1[] v5;
    public Integer FH = null;
    public Long Hw = null;

    public e1() {
        this.DW = null;
        this.j6 = -1;
    }

    public static e1[] gn() {
        if (v5 == null) {
            synchronized (x7.DW) {
                if (v5 == null) {
                    v5 = new e1[0];
                }
            }
        }
        return v5;
    }

    @Override // com.google.android.gms.internal.measurement.t7, com.google.android.gms.internal.measurement.z7
    public final void DW(r7 r7Var) throws s7, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        Integer num = this.FH;
        if (num != null) {
            r7Var.Mr(1, num.intValue());
        }
        Long l = this.Hw;
        if (l != null) {
            r7Var.er(2, l.longValue());
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
        Long l = this.Hw;
        return l != null ? iFH + r7.j3(2, l.longValue()) : iFH;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        Integer num = this.FH;
        if (num == null) {
            if (e1Var.FH != null) {
                return false;
            }
        } else if (!num.equals(e1Var.FH)) {
            return false;
        }
        Long l = this.Hw;
        if (l == null) {
            if (e1Var.Hw != null) {
                return false;
            }
        } else if (!l.equals(e1Var.Hw)) {
            return false;
        }
        v7 v7Var = this.DW;
        if (v7Var != null && !v7Var.FH()) {
            return this.DW.equals(e1Var.DW);
        }
        v7 v7Var2 = e1Var.DW;
        return v7Var2 == null || v7Var2.FH();
    }

    public final int hashCode() {
        int iHashCode = (e1.class.getName().hashCode() + 527) * 31;
        Integer num = this.FH;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.Hw;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
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
            if (iJ8 == 8) {
                this.FH = Integer.valueOf(q7Var.QX());
            } else if (iJ8 == 16) {
                this.Hw = Long.valueOf(q7Var.XL());
            } else if (!super.VH(q7Var, iJ8)) {
                return this;
            }
        }
    }
}
