package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class b1 extends t7<b1> {
    public Long FH = null;
    public String Hw = null;
    private Integer v5 = null;
    public c1[] Zo = c1.gn();
    public a1[] VH = a1.gn();
    public u0[] gn = u0.gn();
    private String u7 = null;
    private Boolean tp = null;

    public b1() {
        this.DW = null;
        this.j6 = -1;
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
        Integer num = this.v5;
        if (num != null) {
            r7Var.Mr(3, num.intValue());
        }
        c1[] c1VarArr = this.Zo;
        int i = 0;
        if (c1VarArr != null && c1VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                c1[] c1VarArr2 = this.Zo;
                if (i2 >= c1VarArr2.length) {
                    break;
                }
                c1 c1Var = c1VarArr2[i2];
                if (c1Var != null) {
                    r7Var.v5(4, c1Var);
                }
                i2++;
            }
        }
        a1[] a1VarArr = this.VH;
        if (a1VarArr != null && a1VarArr.length > 0) {
            int i3 = 0;
            while (true) {
                a1[] a1VarArr2 = this.VH;
                if (i3 >= a1VarArr2.length) {
                    break;
                }
                a1 a1Var = a1VarArr2[i3];
                if (a1Var != null) {
                    r7Var.v5(5, a1Var);
                }
                i3++;
            }
        }
        u0[] u0VarArr = this.gn;
        if (u0VarArr != null && u0VarArr.length > 0) {
            while (true) {
                u0[] u0VarArr2 = this.gn;
                if (i >= u0VarArr2.length) {
                    break;
                }
                u0 u0Var = u0VarArr2[i];
                if (u0Var != null) {
                    r7Var.v5(6, u0Var);
                }
                i++;
            }
        }
        String str2 = this.u7;
        if (str2 != null) {
            r7Var.VH(7, str2);
        }
        Boolean bool = this.tp;
        if (bool != null) {
            r7Var.gn(8, bool.booleanValue());
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
        Integer num = this.v5;
        if (num != null) {
            iFH += r7.rN(3, num.intValue());
        }
        c1[] c1VarArr = this.Zo;
        int i = 0;
        if (c1VarArr != null && c1VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                c1[] c1VarArr2 = this.Zo;
                if (i2 >= c1VarArr2.length) {
                    break;
                }
                c1 c1Var = c1VarArr2[i2];
                if (c1Var != null) {
                    iFH += r7.Zo(4, c1Var);
                }
                i2++;
            }
        }
        a1[] a1VarArr = this.VH;
        if (a1VarArr != null && a1VarArr.length > 0) {
            int i3 = 0;
            while (true) {
                a1[] a1VarArr2 = this.VH;
                if (i3 >= a1VarArr2.length) {
                    break;
                }
                a1 a1Var = a1VarArr2[i3];
                if (a1Var != null) {
                    iFH += r7.Zo(5, a1Var);
                }
                i3++;
            }
        }
        u0[] u0VarArr = this.gn;
        if (u0VarArr != null && u0VarArr.length > 0) {
            while (true) {
                u0[] u0VarArr2 = this.gn;
                if (i >= u0VarArr2.length) {
                    break;
                }
                u0 u0Var = u0VarArr2[i];
                if (u0Var != null) {
                    iFH += r7.Zo(6, u0Var);
                }
                i++;
            }
        }
        String str2 = this.u7;
        if (str2 != null) {
            iFH += r7.Ws(7, str2);
        }
        Boolean bool = this.tp;
        if (bool == null) {
            return iFH;
        }
        bool.booleanValue();
        return iFH + r7.tp(8) + 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        Long l = this.FH;
        if (l == null) {
            if (b1Var.FH != null) {
                return false;
            }
        } else if (!l.equals(b1Var.FH)) {
            return false;
        }
        String str = this.Hw;
        if (str == null) {
            if (b1Var.Hw != null) {
                return false;
            }
        } else if (!str.equals(b1Var.Hw)) {
            return false;
        }
        Integer num = this.v5;
        if (num == null) {
            if (b1Var.v5 != null) {
                return false;
            }
        } else if (!num.equals(b1Var.v5)) {
            return false;
        }
        if (!x7.FH(this.Zo, b1Var.Zo) || !x7.FH(this.VH, b1Var.VH) || !x7.FH(this.gn, b1Var.gn)) {
            return false;
        }
        String str2 = this.u7;
        if (str2 == null) {
            if (b1Var.u7 != null) {
                return false;
            }
        } else if (!str2.equals(b1Var.u7)) {
            return false;
        }
        Boolean bool = this.tp;
        if (bool == null) {
            if (b1Var.tp != null) {
                return false;
            }
        } else if (!bool.equals(b1Var.tp)) {
            return false;
        }
        v7 v7Var = this.DW;
        if (v7Var != null && !v7Var.FH()) {
            return this.DW.equals(b1Var.DW);
        }
        v7 v7Var2 = b1Var.DW;
        return v7Var2 == null || v7Var2.FH();
    }

    public final int hashCode() {
        int iHashCode = (b1.class.getName().hashCode() + 527) * 31;
        Long l = this.FH;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.Hw;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.v5;
        int iHashCode5 = (((((((iHashCode4 + (num == null ? 0 : num.hashCode())) * 31) + x7.Zo(this.Zo)) * 31) + x7.Zo(this.VH)) * 31) + x7.Zo(this.gn)) * 31;
        String str2 = this.u7;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.tp;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
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
            if (iJ8 == 8) {
                this.FH = Long.valueOf(q7Var.XL());
            } else if (iJ8 == 18) {
                this.Hw = q7Var.DW();
            } else if (iJ8 == 24) {
                this.v5 = Integer.valueOf(q7Var.QX());
            } else if (iJ8 == 34) {
                int iJ6 = c8.j6(q7Var, 34);
                c1[] c1VarArr = this.Zo;
                int length = c1VarArr == null ? 0 : c1VarArr.length;
                int i = iJ6 + length;
                c1[] c1VarArr2 = new c1[i];
                if (length != 0) {
                    System.arraycopy(this.Zo, 0, c1VarArr2, 0, length);
                }
                while (length < i - 1) {
                    c1VarArr2[length] = new c1();
                    q7Var.Hw(c1VarArr2[length]);
                    q7Var.J8();
                    length++;
                }
                c1VarArr2[length] = new c1();
                q7Var.Hw(c1VarArr2[length]);
                this.Zo = c1VarArr2;
            } else if (iJ8 == 42) {
                int iJ62 = c8.j6(q7Var, 42);
                a1[] a1VarArr = this.VH;
                int length2 = a1VarArr == null ? 0 : a1VarArr.length;
                int i2 = iJ62 + length2;
                a1[] a1VarArr2 = new a1[i2];
                if (length2 != 0) {
                    System.arraycopy(this.VH, 0, a1VarArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    a1VarArr2[length2] = new a1();
                    q7Var.Hw(a1VarArr2[length2]);
                    q7Var.J8();
                    length2++;
                }
                a1VarArr2[length2] = new a1();
                q7Var.Hw(a1VarArr2[length2]);
                this.VH = a1VarArr2;
            } else if (iJ8 == 50) {
                int iJ63 = c8.j6(q7Var, 50);
                u0[] u0VarArr = this.gn;
                int length3 = u0VarArr == null ? 0 : u0VarArr.length;
                int i3 = iJ63 + length3;
                u0[] u0VarArr2 = new u0[i3];
                if (length3 != 0) {
                    System.arraycopy(this.gn, 0, u0VarArr2, 0, length3);
                }
                while (length3 < i3 - 1) {
                    u0VarArr2[length3] = new u0();
                    q7Var.Hw(u0VarArr2[length3]);
                    q7Var.J8();
                    length3++;
                }
                u0VarArr2[length3] = new u0();
                q7Var.Hw(u0VarArr2[length3]);
                this.gn = u0VarArr2;
            } else if (iJ8 == 58) {
                this.u7 = q7Var.DW();
            } else if (iJ8 == 64) {
                this.tp = Boolean.valueOf(q7Var.Ws());
            } else if (!super.VH(q7Var, iJ8)) {
                return this;
            }
        }
    }
}
