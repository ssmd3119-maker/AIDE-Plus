package abcd;

import java.io.IOException;

/* loaded from: classes.dex */
public class rj0 implements ei0 {
    private fi0 WB;

    public rj0(fi0 fi0Var) {
        this.WB = fi0Var;
    }

    @Override // abcd.mh0
    public ai0 DW() {
        try {
            return Hw();
        } catch (IOException e) {
            throw new zh0(e.getMessage(), e);
        }
    }

    @Override // abcd.dk0
    public ai0 Hw() {
        return new qj0(this.WB.Hw(), false);
    }
}
