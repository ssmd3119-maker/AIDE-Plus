package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class k1 extends t7<k1> {
    private static volatile k1[] v5;
    public Integer FH = null;
    public long[] Hw = c8.DW;

    public k1() {
        this.DW = null;
        this.j6 = -1;
    }

    public static k1[] gn() {
        if (v5 == null) {
            synchronized (x7.DW) {
                if (v5 == null) {
                    v5 = new k1[0];
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
        long[] jArr = this.Hw;
        if (jArr != null && jArr.length > 0) {
            int i = 0;
            while (true) {
                long[] jArr2 = this.Hw;
                if (i >= jArr2.length) {
                    break;
                }
                r7Var.er(2, jArr2[i]);
                i++;
            }
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
        long[] jArr = this.Hw;
        if (jArr == null || jArr.length <= 0) {
            return iFH;
        }
        int i = 0;
        int iJ0 = 0;
        while (true) {
            long[] jArr2 = this.Hw;
            if (i >= jArr2.length) {
                return iFH + iJ0 + (jArr2.length * 1);
            }
            iJ0 += r7.J0(jArr2[i]);
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        Integer num = this.FH;
        if (num == null) {
            if (k1Var.FH != null) {
                return false;
            }
        } else if (!num.equals(k1Var.FH)) {
            return false;
        }
        if (!x7.DW(this.Hw, k1Var.Hw)) {
            return false;
        }
        v7 v7Var = this.DW;
        if (v7Var != null && !v7Var.FH()) {
            return this.DW.equals(k1Var.DW);
        }
        v7 v7Var2 = k1Var.DW;
        return v7Var2 == null || v7Var2.FH();
    }

    public final int hashCode() {
        int iHashCode = (k1.class.getName().hashCode() + 527) * 31;
        Integer num = this.FH;
        int iHashCode2 = 0;
        int iHashCode3 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + x7.v5(this.Hw)) * 31;
        v7 v7Var = this.DW;
        if (v7Var != null && !v7Var.FH()) {
            iHashCode2 = this.DW.hashCode();
        }
        return iHashCode3 + iHashCode2;
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
                int iJ6 = c8.j6(q7Var, 16);
                long[] jArr = this.Hw;
                int length = jArr == null ? 0 : jArr.length;
                int i = iJ6 + length;
                long[] jArr2 = new long[i];
                if (length != 0) {
                    System.arraycopy(this.Hw, 0, jArr2, 0, length);
                }
                while (length < i - 1) {
                    jArr2[length] = q7Var.XL();
                    q7Var.J8();
                    length++;
                }
                jArr2[length] = q7Var.XL();
                this.Hw = jArr2;
            } else if (iJ8 == 18) {
                int iVH = q7Var.VH(q7Var.QX());
                int iJ62 = q7Var.j6();
                int i2 = 0;
                while (q7Var.lg() > 0) {
                    q7Var.XL();
                    i2++;
                }
                q7Var.tp(iJ62);
                long[] jArr3 = this.Hw;
                int length2 = jArr3 == null ? 0 : jArr3.length;
                int i3 = i2 + length2;
                long[] jArr4 = new long[i3];
                if (length2 != 0) {
                    System.arraycopy(this.Hw, 0, jArr4, 0, length2);
                }
                while (length2 < i3) {
                    jArr4[length2] = q7Var.XL();
                    length2++;
                }
                this.Hw = jArr4;
                q7Var.gn(iVH);
            } else if (!super.VH(q7Var, iJ8)) {
                return this;
            }
        }
    }
}
