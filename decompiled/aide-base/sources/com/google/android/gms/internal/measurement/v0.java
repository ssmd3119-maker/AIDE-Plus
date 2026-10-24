package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class v0 extends t7<v0> {
    private static volatile v0[] tp;
    public Integer FH = null;
    public String Hw = null;
    public w0[] v5 = w0.gn();
    private Boolean Zo = null;
    public x0 VH = null;
    public Boolean gn = null;
    public Boolean u7 = null;

    public v0() {
        this.DW = null;
        this.j6 = -1;
    }

    public static v0[] gn() {
        if (tp == null) {
            synchronized (x7.DW) {
                if (tp == null) {
                    tp = new v0[0];
                }
            }
        }
        return tp;
    }

    @Override // com.google.android.gms.internal.measurement.t7, com.google.android.gms.internal.measurement.z7
    public final void DW(r7 r7Var) throws s7, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        Integer num = this.FH;
        if (num != null) {
            r7Var.Mr(1, num.intValue());
        }
        String str = this.Hw;
        if (str != null) {
            r7Var.VH(2, str);
        }
        w0[] w0VarArr = this.v5;
        if (w0VarArr != null && w0VarArr.length > 0) {
            int i = 0;
            while (true) {
                w0[] w0VarArr2 = this.v5;
                if (i >= w0VarArr2.length) {
                    break;
                }
                w0 w0Var = w0VarArr2[i];
                if (w0Var != null) {
                    r7Var.v5(3, w0Var);
                }
                i++;
            }
        }
        Boolean bool = this.Zo;
        if (bool != null) {
            r7Var.gn(4, bool.booleanValue());
        }
        x0 x0Var = this.VH;
        if (x0Var != null) {
            r7Var.v5(5, x0Var);
        }
        Boolean bool2 = this.gn;
        if (bool2 != null) {
            r7Var.gn(6, bool2.booleanValue());
        }
        Boolean bool3 = this.u7;
        if (bool3 != null) {
            r7Var.gn(7, bool3.booleanValue());
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
        String str = this.Hw;
        if (str != null) {
            iFH += r7.Ws(2, str);
        }
        w0[] w0VarArr = this.v5;
        if (w0VarArr != null && w0VarArr.length > 0) {
            int i = 0;
            while (true) {
                w0[] w0VarArr2 = this.v5;
                if (i >= w0VarArr2.length) {
                    break;
                }
                w0 w0Var = w0VarArr2[i];
                if (w0Var != null) {
                    iFH += r7.Zo(3, w0Var);
                }
                i++;
            }
        }
        Boolean bool = this.Zo;
        if (bool != null) {
            bool.booleanValue();
            iFH += r7.tp(4) + 1;
        }
        x0 x0Var = this.VH;
        if (x0Var != null) {
            iFH += r7.Zo(5, x0Var);
        }
        Boolean bool2 = this.gn;
        if (bool2 != null) {
            bool2.booleanValue();
            iFH += r7.tp(6) + 1;
        }
        Boolean bool3 = this.u7;
        if (bool3 == null) {
            return iFH;
        }
        bool3.booleanValue();
        return iFH + r7.tp(7) + 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        Integer num = this.FH;
        if (num == null) {
            if (v0Var.FH != null) {
                return false;
            }
        } else if (!num.equals(v0Var.FH)) {
            return false;
        }
        String str = this.Hw;
        if (str == null) {
            if (v0Var.Hw != null) {
                return false;
            }
        } else if (!str.equals(v0Var.Hw)) {
            return false;
        }
        if (!x7.FH(this.v5, v0Var.v5)) {
            return false;
        }
        Boolean bool = this.Zo;
        if (bool == null) {
            if (v0Var.Zo != null) {
                return false;
            }
        } else if (!bool.equals(v0Var.Zo)) {
            return false;
        }
        x0 x0Var = this.VH;
        if (x0Var == null) {
            if (v0Var.VH != null) {
                return false;
            }
        } else if (!x0Var.equals(v0Var.VH)) {
            return false;
        }
        Boolean bool2 = this.gn;
        if (bool2 == null) {
            if (v0Var.gn != null) {
                return false;
            }
        } else if (!bool2.equals(v0Var.gn)) {
            return false;
        }
        Boolean bool3 = this.u7;
        if (bool3 == null) {
            if (v0Var.u7 != null) {
                return false;
            }
        } else if (!bool3.equals(v0Var.u7)) {
            return false;
        }
        v7 v7Var = this.DW;
        if (v7Var != null && !v7Var.FH()) {
            return this.DW.equals(v0Var.DW);
        }
        v7 v7Var2 = v0Var.DW;
        return v7Var2 == null || v7Var2.FH();
    }

    public final int hashCode() {
        int iHashCode = (v0.class.getName().hashCode() + 527) * 31;
        Integer num = this.FH;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.Hw;
        int iHashCode4 = (((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + x7.Zo(this.v5)) * 31;
        Boolean bool = this.Zo;
        int iHashCode5 = iHashCode4 + (bool == null ? 0 : bool.hashCode());
        x0 x0Var = this.VH;
        int iHashCode6 = ((iHashCode5 * 31) + (x0Var == null ? 0 : x0Var.hashCode())) * 31;
        Boolean bool2 = this.gn;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.u7;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
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
                this.FH = Integer.valueOf(q7Var.QX());
            } else if (iJ8 == 18) {
                this.Hw = q7Var.DW();
            } else if (iJ8 == 26) {
                int iJ6 = c8.j6(q7Var, 26);
                w0[] w0VarArr = this.v5;
                int length = w0VarArr == null ? 0 : w0VarArr.length;
                int i = iJ6 + length;
                w0[] w0VarArr2 = new w0[i];
                if (length != 0) {
                    System.arraycopy(this.v5, 0, w0VarArr2, 0, length);
                }
                while (length < i - 1) {
                    w0VarArr2[length] = new w0();
                    q7Var.Hw(w0VarArr2[length]);
                    q7Var.J8();
                    length++;
                }
                w0VarArr2[length] = new w0();
                q7Var.Hw(w0VarArr2[length]);
                this.v5 = w0VarArr2;
            } else if (iJ8 == 32) {
                this.Zo = Boolean.valueOf(q7Var.Ws());
            } else if (iJ8 == 42) {
                if (this.VH == null) {
                    this.VH = new x0();
                }
                q7Var.Hw(this.VH);
            } else if (iJ8 == 48) {
                this.gn = Boolean.valueOf(q7Var.Ws());
            } else if (iJ8 == 56) {
                this.u7 = Boolean.valueOf(q7Var.Ws());
            } else if (!super.VH(q7Var, iJ8)) {
                return this;
            }
        }
    }
}
