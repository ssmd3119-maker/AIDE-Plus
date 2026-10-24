package abcd;

/* loaded from: classes.dex */
public class d30 {
    int DW;
    int FH;
    int Hw;
    int j6;

    public enum a {
        INSERT,
        DELETE,
        REPLACE,
        EMPTY;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            int length = aVarArrValuesCustom.length;
            a[] aVarArr = new a[length];
            System.arraycopy(aVarArrValuesCustom, 0, aVarArr, 0, length);
            return aVarArr;
        }
    }

    public d30(int i, int i2) {
        this(i, i, i2, i2);
    }

    public final d30 DW(d30 d30Var) {
        return new d30(this.j6, d30Var.j6, this.FH, d30Var.FH);
    }

    public final boolean EQ() {
        return this.j6 == this.DW && this.FH == this.Hw;
    }

    public void FH() {
        this.DW++;
    }

    public void Hw() {
        this.Hw++;
    }

    public final int VH() {
        return this.DW;
    }

    public final int Zo() {
        return this.FH;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d30) {
            d30 d30Var = (d30) obj;
            if (this.j6 == d30Var.j6 && this.DW == d30Var.DW && this.FH == d30Var.FH && this.Hw == d30Var.Hw) {
                return true;
            }
        }
        return false;
    }

    public final int gn() {
        return this.Hw;
    }

    public int hashCode() {
        return this.j6 ^ this.DW;
    }

    public final d30 j6(d30 d30Var) {
        return new d30(d30Var.DW, this.DW, d30Var.Hw, this.Hw);
    }

    public String toString() {
        return tp() + "(" + this.j6 + "-" + this.DW + "," + this.FH + "-" + this.Hw + ")";
    }

    public final a tp() {
        return this.j6 < this.DW ? this.FH < this.Hw ? a.REPLACE : a.DELETE : this.FH < this.Hw ? a.INSERT : a.EMPTY;
    }

    public final int u7() {
        return this.DW - this.j6;
    }

    public final int v5() {
        return this.j6;
    }

    public d30(int i, int i2, int i3, int i4) {
        this.j6 = i;
        this.DW = i2;
        this.FH = i3;
        this.Hw = i4;
    }
}
