package abcd;

/* loaded from: classes.dex */
public class u90 extends d90 {
    private final d90 j6;

    public u90(d90 d90Var) {
        this.j6 = d90Var;
    }

    private k90[] Hw(k90[] k90VarArr) {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < k90VarArr.length; i3++) {
            k90 k90Var = k90VarArr[i3];
            if (k90Var != null) {
                int i4 = k90Var.cT;
                if ((i4 & 16) != 0) {
                    k90VarArr[i3] = null;
                } else {
                    k90Var.cT = i4 | 16;
                    i2++;
                }
            }
        }
        if (i2 == k90VarArr.length) {
            int length = k90VarArr.length;
            while (i < length) {
                k90VarArr[i].cT &= -17;
                i++;
            }
            return k90VarArr;
        }
        k90[] k90VarArr2 = new k90[i2];
        int length2 = k90VarArr.length;
        int i5 = 0;
        while (i < length2) {
            k90 k90Var2 = k90VarArr[i];
            if (k90Var2 != null) {
                k90VarArr2[i5] = k90Var2;
                k90Var2.cT &= -17;
                i5++;
            }
            i++;
        }
        return k90VarArr2;
    }

    private k90 v5(k90 k90Var) {
        while (true) {
            k90[] k90VarArr = k90Var.Z1;
            if (k90VarArr.length > 1) {
                return k90Var;
            }
            int i = k90Var.cT;
            if ((i & 4) != 0 || (i & 8) == 0) {
                return k90Var;
            }
            if (k90VarArr.length == 0) {
                return null;
            }
            k90Var = k90VarArr[0];
        }
    }

    @Override // abcd.d90
    public int DW() {
        return this.j6.DW() & (-5);
    }

    @Override // abcd.d90
    public void FH(u80 u80Var) {
        this.j6.FH(u80Var);
    }

    @Override // abcd.d90
    public k90 j6() {
        k90 k90VarJ6 = this.j6.j6();
        if (k90VarJ6 == null) {
            return null;
        }
        k90[] k90VarArr = k90VarJ6.Z1;
        int length = k90VarArr.length;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            k90 k90Var = k90VarArr[i];
            k90 k90VarV5 = v5(k90Var);
            if (k90Var != k90VarV5) {
                k90VarArr[i] = k90VarV5;
                z = true;
            }
        }
        if (z) {
            k90VarJ6.Z1 = Hw(k90VarArr);
        }
        return k90VarJ6;
    }
}
