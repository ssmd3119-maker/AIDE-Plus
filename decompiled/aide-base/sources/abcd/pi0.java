package abcd;

import java.io.IOException;

/* loaded from: classes.dex */
public class pi0 implements ci0 {
    private fi0 WB;

    public pi0(fi0 fi0Var) {
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
        return new oi0(this.WB.Hw());
    }
}
