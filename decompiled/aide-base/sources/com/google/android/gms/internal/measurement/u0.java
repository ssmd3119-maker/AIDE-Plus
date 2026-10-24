package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class u0 extends t7<u0> {
    private static volatile u0[] gn;
    public Integer FH = null;
    public y0[] Hw = y0.gn();
    public v0[] v5 = v0.gn();
    private Boolean Zo = null;
    private Boolean VH = null;

    public u0() {
        this.DW = null;
        this.j6 = -1;
    }

    public static u0[] gn() {
        if (gn == null) {
            synchronized (x7.DW) {
                if (gn == null) {
                    gn = new u0[0];
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
        y0[] y0VarArr = this.Hw;
        int i = 0;
        if (y0VarArr != null && y0VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                y0[] y0VarArr2 = this.Hw;
                if (i2 >= y0VarArr2.length) {
                    break;
                }
                y0 y0Var = y0VarArr2[i2];
                if (y0Var != null) {
                    r7Var.v5(2, y0Var);
                }
                i2++;
            }
        }
        v0[] v0VarArr = this.v5;
        if (v0VarArr != null && v0VarArr.length > 0) {
            while (true) {
                v0[] v0VarArr2 = this.v5;
                if (i >= v0VarArr2.length) {
                    break;
                }
                v0 v0Var = v0VarArr2[i];
                if (v0Var != null) {
                    r7Var.v5(3, v0Var);
                }
                i++;
            }
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
        y0[] y0VarArr = this.Hw;
        int i = 0;
        if (y0VarArr != null && y0VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                y0[] y0VarArr2 = this.Hw;
                if (i2 >= y0VarArr2.length) {
                    break;
                }
                y0 y0Var = y0VarArr2[i2];
                if (y0Var != null) {
                    iFH += r7.Zo(2, y0Var);
                }
                i2++;
            }
        }
        v0[] v0VarArr = this.v5;
        if (v0VarArr != null && v0VarArr.length > 0) {
            while (true) {
                v0[] v0VarArr2 = this.v5;
                if (i >= v0VarArr2.length) {
                    break;
                }
                v0 v0Var = v0VarArr2[i];
                if (v0Var != null) {
                    iFH += r7.Zo(3, v0Var);
                }
                i++;
            }
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
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        Integer num = this.FH;
        if (num == null) {
            if (u0Var.FH != null) {
                return false;
            }
        } else if (!num.equals(u0Var.FH)) {
            return false;
        }
        if (!x7.FH(this.Hw, u0Var.Hw) || !x7.FH(this.v5, u0Var.v5)) {
            return false;
        }
        Boolean bool = this.Zo;
        if (bool == null) {
            if (u0Var.Zo != null) {
                return false;
            }
        } else if (!bool.equals(u0Var.Zo)) {
            return false;
        }
        Boolean bool2 = this.VH;
        if (bool2 == null) {
            if (u0Var.VH != null) {
                return false;
            }
        } else if (!bool2.equals(u0Var.VH)) {
            return false;
        }
        v7 v7Var = this.DW;
        if (v7Var != null && !v7Var.FH()) {
            return this.DW.equals(u0Var.DW);
        }
        v7 v7Var2 = u0Var.DW;
        return v7Var2 == null || v7Var2.FH();
    }

    public final int hashCode() {
        int iHashCode = (u0.class.getName().hashCode() + 527) * 31;
        Integer num = this.FH;
        int iHashCode2 = 0;
        int iHashCode3 = (((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + x7.Zo(this.Hw)) * 31) + x7.Zo(this.v5)) * 31;
        Boolean bool = this.Zo;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.VH;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        v7 v7Var = this.DW;
        if (v7Var != null && !v7Var.FH()) {
            iHashCode2 = this.DW.hashCode();
        }
        return iHashCode5 + iHashCode2;
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
                int iJ6 = c8.j6(q7Var, 18);
                y0[] y0VarArr = this.Hw;
                int length = y0VarArr == null ? 0 : y0VarArr.length;
                int i = iJ6 + length;
                y0[] y0VarArr2 = new y0[i];
                if (length != 0) {
                    System.arraycopy(this.Hw, 0, y0VarArr2, 0, length);
                }
                while (length < i - 1) {
                    y0VarArr2[length] = new y0();
                    q7Var.Hw(y0VarArr2[length]);
                    q7Var.J8();
                    length++;
                }
                y0VarArr2[length] = new y0();
                q7Var.Hw(y0VarArr2[length]);
                this.Hw = y0VarArr2;
            } else if (iJ8 == 26) {
                int iJ62 = c8.j6(q7Var, 26);
                v0[] v0VarArr = this.v5;
                int length2 = v0VarArr == null ? 0 : v0VarArr.length;
                int i2 = iJ62 + length2;
                v0[] v0VarArr2 = new v0[i2];
                if (length2 != 0) {
                    System.arraycopy(this.v5, 0, v0VarArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    v0VarArr2[length2] = new v0();
                    q7Var.Hw(v0VarArr2[length2]);
                    q7Var.J8();
                    length2++;
                }
                v0VarArr2[length2] = new v0();
                q7Var.Hw(v0VarArr2[length2]);
                this.v5 = v0VarArr2;
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
