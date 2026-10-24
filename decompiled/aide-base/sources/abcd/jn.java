package abcd;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class jn {
    private final km DW;
    private final int FH;
    private int Hw;
    private final String j6;
    private boolean v5;

    public jn(String str, km kmVar, int i) {
        if (kmVar == null) {
            throw new NullPointerException("file == null");
        }
        J0(i);
        this.j6 = str;
        this.DW = kmVar;
        this.FH = i;
        this.Hw = -1;
        this.v5 = false;
    }

    public static void J0(int i) {
        if (i <= 0 || (i & (i - 1)) != 0) {
            throw new IllegalArgumentException("invalid alignment");
        }
    }

    public abstract int DW(wm wmVar);

    public final void EQ() {
        if (!this.v5) {
            throw new RuntimeException("not prepared");
        }
    }

    public final int FH(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("relative < 0");
        }
        int i2 = this.Hw;
        if (i2 >= 0) {
            return i2 + i;
        }
        throw new RuntimeException("fileOffset not yet set");
    }

    public final int Hw() {
        return this.FH;
    }

    public abstract int J8();

    public abstract void QX(ls lsVar);

    public abstract Collection<? extends wm> VH();

    public final void Ws(ls lsVar) {
        EQ();
        j6(lsVar);
        int iFH = lsVar.FH();
        int i = this.Hw;
        if (i < 0) {
            this.Hw = iFH;
        } else if (i != iFH) {
            throw new RuntimeException("alignment mismatch: for " + this + ", at " + iFH + ", but expected " + this.Hw);
        }
        if (lsVar.EQ()) {
            if (this.j6 != null) {
                lsVar.Hw(0, "\n" + this.j6 + ":");
            } else if (iFH != 0) {
                lsVar.Hw(0, "\n");
            }
        }
        QX(lsVar);
    }

    public final int Zo() {
        int i = this.Hw;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("fileOffset not set");
    }

    public final void gn() {
        we();
        u7();
        this.v5 = true;
    }

    public final void j6(ls lsVar) {
        lsVar.we(this.FH);
    }

    public final int tp(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("fileOffset < 0");
        }
        if (this.Hw >= 0) {
            throw new RuntimeException("fileOffset already set");
        }
        int i2 = this.FH - 1;
        int i3 = (i + i2) & (i2 ^ (-1));
        this.Hw = i3;
        return i3;
    }

    public abstract void u7();

    public final km v5() {
        return this.DW;
    }

    public final void we() {
        if (this.v5) {
            throw new RuntimeException("already prepared");
        }
    }
}
