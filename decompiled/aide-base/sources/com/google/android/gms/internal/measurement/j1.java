package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class j1 extends t7<j1> {
    public long[] FH;
    public long[] Hw;
    public k1[] Zo;
    public e1[] v5;

    public j1() {
        long[] jArr = c8.DW;
        this.FH = jArr;
        this.Hw = jArr;
        this.v5 = e1.gn();
        this.Zo = k1.gn();
        this.DW = null;
        this.j6 = -1;
    }

    @Override // com.google.android.gms.internal.measurement.t7, com.google.android.gms.internal.measurement.z7
    public final void DW(r7 r7Var) throws s7, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        long[] jArr = this.FH;
        int i = 0;
        if (jArr != null && jArr.length > 0) {
            int i2 = 0;
            while (true) {
                long[] jArr2 = this.FH;
                if (i2 >= jArr2.length) {
                    break;
                }
                r7Var.Hw(1, jArr2[i2]);
                i2++;
            }
        }
        long[] jArr3 = this.Hw;
        if (jArr3 != null && jArr3.length > 0) {
            int i3 = 0;
            while (true) {
                long[] jArr4 = this.Hw;
                if (i3 >= jArr4.length) {
                    break;
                }
                r7Var.Hw(2, jArr4[i3]);
                i3++;
            }
        }
        e1[] e1VarArr = this.v5;
        if (e1VarArr != null && e1VarArr.length > 0) {
            int i4 = 0;
            while (true) {
                e1[] e1VarArr2 = this.v5;
                if (i4 >= e1VarArr2.length) {
                    break;
                }
                e1 e1Var = e1VarArr2[i4];
                if (e1Var != null) {
                    r7Var.v5(3, e1Var);
                }
                i4++;
            }
        }
        k1[] k1VarArr = this.Zo;
        if (k1VarArr != null && k1VarArr.length > 0) {
            while (true) {
                k1[] k1VarArr2 = this.Zo;
                if (i >= k1VarArr2.length) {
                    break;
                }
                k1 k1Var = k1VarArr2[i];
                if (k1Var != null) {
                    r7Var.v5(4, k1Var);
                }
                i++;
            }
        }
        super.DW(r7Var);
    }

    @Override // com.google.android.gms.internal.measurement.t7, com.google.android.gms.internal.measurement.z7
    protected final int FH() {
        long[] jArr;
        long[] jArr2;
        int iFH = super.FH();
        long[] jArr3 = this.FH;
        int i = 0;
        if (jArr3 != null && jArr3.length > 0) {
            int i2 = 0;
            int iJ0 = 0;
            while (true) {
                jArr2 = this.FH;
                if (i2 >= jArr2.length) {
                    break;
                }
                iJ0 += r7.J0(jArr2[i2]);
                i2++;
            }
            iFH = iFH + iJ0 + (jArr2.length * 1);
        }
        long[] jArr4 = this.Hw;
        if (jArr4 != null && jArr4.length > 0) {
            int i3 = 0;
            int iJ02 = 0;
            while (true) {
                jArr = this.Hw;
                if (i3 >= jArr.length) {
                    break;
                }
                iJ02 += r7.J0(jArr[i3]);
                i3++;
            }
            iFH = iFH + iJ02 + (jArr.length * 1);
        }
        e1[] e1VarArr = this.v5;
        if (e1VarArr != null && e1VarArr.length > 0) {
            int i4 = 0;
            while (true) {
                e1[] e1VarArr2 = this.v5;
                if (i4 >= e1VarArr2.length) {
                    break;
                }
                e1 e1Var = e1VarArr2[i4];
                if (e1Var != null) {
                    iFH += r7.Zo(3, e1Var);
                }
                i4++;
            }
        }
        k1[] k1VarArr = this.Zo;
        if (k1VarArr != null && k1VarArr.length > 0) {
            while (true) {
                k1[] k1VarArr2 = this.Zo;
                if (i >= k1VarArr2.length) {
                    break;
                }
                k1 k1Var = k1VarArr2[i];
                if (k1Var != null) {
                    iFH += r7.Zo(4, k1Var);
                }
                i++;
            }
        }
        return iFH;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        if (!x7.DW(this.FH, j1Var.FH) || !x7.DW(this.Hw, j1Var.Hw) || !x7.FH(this.v5, j1Var.v5) || !x7.FH(this.Zo, j1Var.Zo)) {
            return false;
        }
        v7 v7Var = this.DW;
        if (v7Var != null && !v7Var.FH()) {
            return this.DW.equals(j1Var.DW);
        }
        v7 v7Var2 = j1Var.DW;
        return v7Var2 == null || v7Var2.FH();
    }

    public final int hashCode() {
        int iHashCode = (((((((((j1.class.getName().hashCode() + 527) * 31) + x7.v5(this.FH)) * 31) + x7.v5(this.Hw)) * 31) + x7.Zo(this.v5)) * 31) + x7.Zo(this.Zo)) * 31;
        v7 v7Var = this.DW;
        return iHashCode + ((v7Var == null || v7Var.FH()) ? 0 : this.DW.hashCode());
    }

    @Override // com.google.android.gms.internal.measurement.z7
    public final /* synthetic */ z7 j6(q7 q7Var) throws y7 {
        while (true) {
            int iJ8 = q7Var.J8();
            if (iJ8 == 0) {
                return this;
            }
            if (iJ8 == 8) {
                int iJ6 = c8.j6(q7Var, 8);
                long[] jArr = this.FH;
                int length = jArr == null ? 0 : jArr.length;
                int i = iJ6 + length;
                long[] jArr2 = new long[i];
                if (length != 0) {
                    System.arraycopy(this.FH, 0, jArr2, 0, length);
                }
                while (length < i - 1) {
                    jArr2[length] = q7Var.XL();
                    q7Var.J8();
                    length++;
                }
                jArr2[length] = q7Var.XL();
                this.FH = jArr2;
            } else if (iJ8 == 10) {
                int iVH = q7Var.VH(q7Var.QX());
                int iJ62 = q7Var.j6();
                int i2 = 0;
                while (q7Var.lg() > 0) {
                    q7Var.XL();
                    i2++;
                }
                q7Var.tp(iJ62);
                long[] jArr3 = this.FH;
                int length2 = jArr3 == null ? 0 : jArr3.length;
                int i3 = i2 + length2;
                long[] jArr4 = new long[i3];
                if (length2 != 0) {
                    System.arraycopy(this.FH, 0, jArr4, 0, length2);
                }
                while (length2 < i3) {
                    jArr4[length2] = q7Var.XL();
                    length2++;
                }
                this.FH = jArr4;
                q7Var.gn(iVH);
            } else if (iJ8 == 16) {
                int iJ63 = c8.j6(q7Var, 16);
                long[] jArr5 = this.Hw;
                int length3 = jArr5 == null ? 0 : jArr5.length;
                int i4 = iJ63 + length3;
                long[] jArr6 = new long[i4];
                if (length3 != 0) {
                    System.arraycopy(this.Hw, 0, jArr6, 0, length3);
                }
                while (length3 < i4 - 1) {
                    jArr6[length3] = q7Var.XL();
                    q7Var.J8();
                    length3++;
                }
                jArr6[length3] = q7Var.XL();
                this.Hw = jArr6;
            } else if (iJ8 == 18) {
                int iVH2 = q7Var.VH(q7Var.QX());
                int iJ64 = q7Var.j6();
                int i5 = 0;
                while (q7Var.lg() > 0) {
                    q7Var.XL();
                    i5++;
                }
                q7Var.tp(iJ64);
                long[] jArr7 = this.Hw;
                int length4 = jArr7 == null ? 0 : jArr7.length;
                int i6 = i5 + length4;
                long[] jArr8 = new long[i6];
                if (length4 != 0) {
                    System.arraycopy(this.Hw, 0, jArr8, 0, length4);
                }
                while (length4 < i6) {
                    jArr8[length4] = q7Var.XL();
                    length4++;
                }
                this.Hw = jArr8;
                q7Var.gn(iVH2);
            } else if (iJ8 == 26) {
                int iJ65 = c8.j6(q7Var, 26);
                e1[] e1VarArr = this.v5;
                int length5 = e1VarArr == null ? 0 : e1VarArr.length;
                int i7 = iJ65 + length5;
                e1[] e1VarArr2 = new e1[i7];
                if (length5 != 0) {
                    System.arraycopy(this.v5, 0, e1VarArr2, 0, length5);
                }
                while (length5 < i7 - 1) {
                    e1VarArr2[length5] = new e1();
                    q7Var.Hw(e1VarArr2[length5]);
                    q7Var.J8();
                    length5++;
                }
                e1VarArr2[length5] = new e1();
                q7Var.Hw(e1VarArr2[length5]);
                this.v5 = e1VarArr2;
            } else if (iJ8 == 34) {
                int iJ66 = c8.j6(q7Var, 34);
                k1[] k1VarArr = this.Zo;
                int length6 = k1VarArr == null ? 0 : k1VarArr.length;
                int i8 = iJ66 + length6;
                k1[] k1VarArr2 = new k1[i8];
                if (length6 != 0) {
                    System.arraycopy(this.Zo, 0, k1VarArr2, 0, length6);
                }
                while (length6 < i8 - 1) {
                    k1VarArr2[length6] = new k1();
                    q7Var.Hw(k1VarArr2[length6]);
                    q7Var.J8();
                    length6++;
                }
                k1VarArr2[length6] = new k1();
                q7Var.Hw(k1VarArr2[length6]);
                this.Zo = k1VarArr2;
            } else if (!super.VH(q7Var, iJ8)) {
                return this;
            }
        }
    }
}
