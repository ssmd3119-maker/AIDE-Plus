package abcd;

import java.io.IOException;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public abstract class e80 {
    protected final g70 DW;
    protected final t90 FH;
    private e70 Hw;
    protected s90[] VH;
    protected k90[] Zo;
    protected final p70 j6;
    protected o90[] v5;

    public e80(p70 p70Var) {
        this.j6 = p70Var;
        g70 g70VarYS = p70Var.yS();
        this.DW = g70VarYS;
        this.FH = new t90(g70VarYS);
    }

    public e70 DW() {
        if (this.Hw == null) {
            this.Hw = FH().er();
        }
        return this.Hw;
    }

    public p70 FH() {
        return this.j6;
    }

    public abstract a70 Hw();

    public abstract boolean VH();

    public ef0 Zo(int i, int i2) throws IOException {
        k90 k90VarJ6 = j6(i, i2);
        return k90VarJ6 == null ? new gf0() : gn(k90VarJ6.Eq());
    }

    public ef0 gn(j60 j60Var) {
        return new ff0(null, this.DW, j60Var);
    }

    public k90 j6(int i, int i2) throws IOException {
        k90[] k90VarArr = this.Zo;
        if (k90VarArr[i] == null) {
            throw new j40(this.v5[i], "commit");
        }
        if (k90VarArr[i2] == null) {
            throw new j40(this.v5[i2], "commit");
        }
        this.FH.OW();
        this.FH.XG(ba0.DW);
        this.FH.ef(this.Zo[i]);
        this.FH.ef(this.Zo[i2]);
        k90 k90VarG3 = this.FH.g3();
        if (k90VarG3 == null) {
            return null;
        }
        k90 k90VarG32 = this.FH.g3();
        if (k90VarG32 == null) {
            return k90VarG3;
        }
        throw new IOException(MessageFormat.format(JGitText.DW().multipleMergeBasesFor, this.Zo[i].BT(), this.Zo[i2].BT(), k90VarG3.BT(), k90VarG32.BT()));
    }

    public boolean v5(j60... j60VarArr) {
        o90[] o90VarArr;
        this.v5 = new o90[j60VarArr.length];
        int i = 0;
        for (int i2 = 0; i2 < j60VarArr.length; i2++) {
            this.v5[i2] = this.FH.I(j60VarArr[i2]);
        }
        this.Zo = new k90[this.v5.length];
        int i3 = 0;
        while (true) {
            o90VarArr = this.v5;
            if (i3 >= o90VarArr.length) {
                break;
            }
            try {
                this.Zo[i3] = this.FH.ca(o90VarArr[i3]);
            } catch (j40 unused) {
                this.Zo[i3] = null;
            }
            i3++;
        }
        this.VH = new s90[o90VarArr.length];
        while (true) {
            o90[] o90VarArr2 = this.v5;
            if (i >= o90VarArr2.length) {
                try {
                    break;
                } finally {
                    e70 e70Var = this.Hw;
                    if (e70Var != null) {
                        e70Var.we();
                    }
                    this.DW.XL();
                }
            }
            this.VH[i] = this.FH.sy(o90VarArr2[i]);
            i++;
        }
        boolean zVH = VH();
        if (zVH && this.Hw != null) {
            this.Hw.FH();
        }
        return zVH;
    }
}
