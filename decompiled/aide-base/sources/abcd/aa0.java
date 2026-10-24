package abcd;

import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class aa0 extends ba0 {
    private int FH;
    private int Hw = 0;

    private aa0(int i) {
        this.FH = i;
    }

    public static ba0 Hw(int i) {
        if (i >= 0) {
            return new aa0(i);
        }
        throw new IllegalArgumentException(JGitText.DW().maxCountMustBeNonNegative);
    }

    @Override // abcd.ba0
    public boolean DW(t90 t90Var, k90 k90Var) {
        int i = this.Hw + 1;
        this.Hw = i;
        if (i <= this.FH) {
            return true;
        }
        throw d50.WB;
    }

    @Override // abcd.ba0
    /* renamed from: j6 */
    public ba0 clone() {
        return new aa0(this.FH);
    }
}
