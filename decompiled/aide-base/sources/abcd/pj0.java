package abcd;

import java.io.IOException;

/* loaded from: classes.dex */
public class pj0 implements ci0 {
    private fi0 WB;

    public pj0(fi0 fi0Var) {
        this.WB = fi0Var;
    }

    @Override // abcd.mh0
    public ai0 DW() {
        try {
            return Hw();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    @Override // abcd.dk0
    public ai0 Hw() {
        return new oj0(this.WB.Hw());
    }
}
