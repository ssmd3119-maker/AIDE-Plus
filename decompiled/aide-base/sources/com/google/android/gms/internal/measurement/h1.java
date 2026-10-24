package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class h1 extends t7<h1> {
    public i1[] FH = i1.gn();

    public h1() {
        this.DW = null;
        this.j6 = -1;
    }

    @Override // com.google.android.gms.internal.measurement.t7, com.google.android.gms.internal.measurement.z7
    public final void DW(r7 r7Var) throws s7, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        i1[] i1VarArr = this.FH;
        if (i1VarArr != null && i1VarArr.length > 0) {
            int i = 0;
            while (true) {
                i1[] i1VarArr2 = this.FH;
                if (i >= i1VarArr2.length) {
                    break;
                }
                i1 i1Var = i1VarArr2[i];
                if (i1Var != null) {
                    r7Var.v5(1, i1Var);
                }
                i++;
            }
        }
        super.DW(r7Var);
    }

    @Override // com.google.android.gms.internal.measurement.t7, com.google.android.gms.internal.measurement.z7
    protected final int FH() {
        int iFH = super.FH();
        i1[] i1VarArr = this.FH;
        if (i1VarArr != null && i1VarArr.length > 0) {
            int i = 0;
            while (true) {
                i1[] i1VarArr2 = this.FH;
                if (i >= i1VarArr2.length) {
                    break;
                }
                i1 i1Var = i1VarArr2[i];
                if (i1Var != null) {
                    iFH += r7.Zo(1, i1Var);
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
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (!x7.FH(this.FH, h1Var.FH)) {
            return false;
        }
        v7 v7Var = this.DW;
        if (v7Var != null && !v7Var.FH()) {
            return this.DW.equals(h1Var.DW);
        }
        v7 v7Var2 = h1Var.DW;
        return v7Var2 == null || v7Var2.FH();
    }

    public final int hashCode() {
        int iHashCode = (((h1.class.getName().hashCode() + 527) * 31) + x7.Zo(this.FH)) * 31;
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
            if (iJ8 == 10) {
                int iJ6 = c8.j6(q7Var, 10);
                i1[] i1VarArr = this.FH;
                int length = i1VarArr == null ? 0 : i1VarArr.length;
                int i = iJ6 + length;
                i1[] i1VarArr2 = new i1[i];
                if (length != 0) {
                    System.arraycopy(this.FH, 0, i1VarArr2, 0, length);
                }
                while (length < i - 1) {
                    i1VarArr2[length] = new i1();
                    q7Var.Hw(i1VarArr2[length]);
                    q7Var.J8();
                    length++;
                }
                i1VarArr2[length] = new i1();
                q7Var.Hw(i1VarArr2[length]);
                this.FH = i1VarArr2;
            } else if (!super.VH(q7Var, iJ8)) {
                return this;
            }
        }
    }
}
