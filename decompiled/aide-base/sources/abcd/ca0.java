package abcd;

import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class ca0 extends ba0 {
    private final int FH;
    private int Hw;

    private ca0(int i) {
        this.FH = i;
    }

    public static ba0 Hw(int i) {
        if (i >= 0) {
            return new ca0(i);
        }
        throw new IllegalArgumentException(JGitText.DW().skipMustBeNonNegative);
    }

    @Override // abcd.ba0
    public boolean DW(t90 t90Var, k90 k90Var) {
        int i = this.FH;
        int i2 = this.Hw;
        this.Hw = i2 + 1;
        return i <= i2;
    }

    @Override // abcd.ba0
    /* renamed from: j6 */
    public ba0 clone() {
        return new ca0(this.FH);
    }
}
