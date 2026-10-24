package abcd;

import abcd.p30;

/* loaded from: classes.dex */
public class h30<S extends p30> {
    private final S DW;
    private final S FH;
    private f30<S> Hw;
    private final q30<? super S> j6;
    private f30<S> v5;

    public h30(q30<? super S> q30Var, S s, S s2) {
        this.j6 = q30Var;
        this.DW = s;
        this.FH = s2;
    }

    private f30<S> Hw(S s) {
        int iJ6 = s.j6();
        int[] iArr = new int[iJ6];
        for (int i = 0; i < iJ6; i++) {
            iArr[i] = this.j6.DW(s, i);
        }
        return new f30<>(s, iArr);
    }

    public f30<S> DW() {
        if (this.v5 == null) {
            this.v5 = Hw(this.FH);
        }
        return this.v5;
    }

    public g30<S> FH() {
        return new g30<>(this.j6);
    }

    public f30<S> j6() {
        if (this.Hw == null) {
            this.Hw = Hw(this.DW);
        }
        return this.Hw;
    }
}
