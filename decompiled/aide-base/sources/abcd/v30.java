package abcd;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class v30 {
    protected b40[] DW;
    protected int FH;
    protected w30 j6;

    public v30(w30 w30Var, int i) {
        this.j6 = w30Var;
        this.DW = new b40[i];
    }

    public void DW(b40 b40Var) {
        b40[] b40VarArr = this.DW;
        int length = b40VarArr.length;
        int i = this.FH;
        if (length == i) {
            b40[] b40VarArr2 = new b40[((i + 16) * 3) / 2];
            System.arraycopy(b40VarArr, 0, b40VarArr2, 0, i);
            this.DW = b40VarArr2;
        }
        b40[] b40VarArr3 = this.DW;
        int i2 = this.FH;
        this.FH = i2 + 1;
        b40VarArr3[i2] = b40Var;
    }

    public void FH(int i, int i2) {
        int i3 = this.FH;
        if (i3 + i2 > this.DW.length) {
            b40[] b40VarArr = new b40[Math.max(((i3 + 16) * 3) / 2, i3 + i2)];
            System.arraycopy(this.DW, 0, b40VarArr, 0, this.FH);
            this.DW = b40VarArr;
        }
        this.j6.vy(i, this.DW, this.FH, i2);
        this.FH += i2;
    }

    public abstract void Hw();

    public void Zo() {
        int i = this.FH;
        b40[] b40VarArr = this.DW;
        if (i < b40VarArr.length / 2) {
            b40[] b40VarArr2 = new b40[i];
            System.arraycopy(b40VarArr, 0, b40VarArr2, 0, i);
            this.DW = b40VarArr2;
        }
        this.j6.yS(this.DW, this.FH);
    }

    public boolean j6() throws IOException {
        Hw();
        this.j6.ei();
        return this.j6.Zo();
    }

    public w30 v5() {
        return this.j6;
    }
}
