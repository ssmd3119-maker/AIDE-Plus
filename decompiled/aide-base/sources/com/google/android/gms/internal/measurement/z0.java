package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class z0 extends t7<z0> {
    public Integer FH = null;
    public String Hw = null;
    public Boolean v5 = null;
    public String[] Zo = c8.FH;

    public z0() {
        this.DW = null;
        this.j6 = -1;
    }

    private final z0 gn(q7 q7Var) throws y7 {
        while (true) {
            int iJ8 = q7Var.J8();
            if (iJ8 == 0) {
                return this;
            }
            if (iJ8 == 8) {
                int iJ6 = q7Var.j6();
                try {
                    int iQX = q7Var.QX();
                    if (iQX < 0 || iQX > 6) {
                        StringBuilder sb = new StringBuilder(41);
                        sb.append(iQX);
                        sb.append(" is not a valid enum MatchType");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.FH = Integer.valueOf(iQX);
                } catch (IllegalArgumentException unused) {
                    q7Var.tp(iJ6);
                    VH(q7Var, iJ8);
                }
            } else if (iJ8 == 18) {
                this.Hw = q7Var.DW();
            } else if (iJ8 == 24) {
                this.v5 = Boolean.valueOf(q7Var.Ws());
            } else if (iJ8 == 34) {
                int iJ62 = c8.j6(q7Var, 34);
                String[] strArr = this.Zo;
                int length = strArr == null ? 0 : strArr.length;
                int i = iJ62 + length;
                String[] strArr2 = new String[i];
                if (length != 0) {
                    System.arraycopy(this.Zo, 0, strArr2, 0, length);
                }
                while (length < i - 1) {
                    strArr2[length] = q7Var.DW();
                    q7Var.J8();
                    length++;
                }
                strArr2[length] = q7Var.DW();
                this.Zo = strArr2;
            } else if (!super.VH(q7Var, iJ8)) {
                return this;
            }
        }
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
        Boolean bool = this.v5;
        if (bool != null) {
            r7Var.gn(3, bool.booleanValue());
        }
        String[] strArr = this.Zo;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.Zo;
                if (i >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i];
                if (str2 != null) {
                    r7Var.VH(4, str2);
                }
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
        String str = this.Hw;
        if (str != null) {
            iFH += r7.Ws(2, str);
        }
        Boolean bool = this.v5;
        if (bool != null) {
            bool.booleanValue();
            iFH += r7.tp(3) + 1;
        }
        String[] strArr = this.Zo;
        if (strArr == null || strArr.length <= 0) {
            return iFH;
        }
        int i = 0;
        int iLg = 0;
        int i2 = 0;
        while (true) {
            String[] strArr2 = this.Zo;
            if (i >= strArr2.length) {
                return iFH + iLg + (i2 * 1);
            }
            String str2 = strArr2[i];
            if (str2 != null) {
                i2++;
                iLg += r7.lg(str2);
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        Integer num = this.FH;
        if (num == null) {
            if (z0Var.FH != null) {
                return false;
            }
        } else if (!num.equals(z0Var.FH)) {
            return false;
        }
        String str = this.Hw;
        if (str == null) {
            if (z0Var.Hw != null) {
                return false;
            }
        } else if (!str.equals(z0Var.Hw)) {
            return false;
        }
        Boolean bool = this.v5;
        if (bool == null) {
            if (z0Var.v5 != null) {
                return false;
            }
        } else if (!bool.equals(z0Var.v5)) {
            return false;
        }
        if (!x7.FH(this.Zo, z0Var.Zo)) {
            return false;
        }
        v7 v7Var = this.DW;
        if (v7Var != null && !v7Var.FH()) {
            return this.DW.equals(z0Var.DW);
        }
        v7 v7Var2 = z0Var.DW;
        return v7Var2 == null || v7Var2.FH();
    }

    public final int hashCode() {
        int iHashCode = (z0.class.getName().hashCode() + 527) * 31;
        Integer num = this.FH;
        int iHashCode2 = 0;
        int iIntValue = (iHashCode + (num == null ? 0 : num.intValue())) * 31;
        String str = this.Hw;
        int iHashCode3 = (iIntValue + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.v5;
        int iHashCode4 = (((iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31) + x7.Zo(this.Zo)) * 31;
        v7 v7Var = this.DW;
        if (v7Var != null && !v7Var.FH()) {
            iHashCode2 = this.DW.hashCode();
        }
        return iHashCode4 + iHashCode2;
    }

    @Override // com.google.android.gms.internal.measurement.z7
    public final /* synthetic */ z7 j6(q7 q7Var) throws y7 {
        gn(q7Var);
        return this;
    }
}
