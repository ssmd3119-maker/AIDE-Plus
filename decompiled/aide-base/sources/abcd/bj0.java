package abcd;

import java.io.IOException;

/* loaded from: classes.dex */
public class bj0 implements mh0, dk0 {
    private fi0 WB;

    public bj0(fi0 fi0Var) {
        this.WB = fi0Var;
    }

    @Override // abcd.mh0
    public ai0 DW() {
        try {
            return Hw();
        } catch (IOException e) {
            throw new zh0("unable to get DER object", e);
        } catch (IllegalArgumentException e2) {
            throw new zh0("unable to get DER object", e2);
        }
    }

    @Override // abcd.dk0
    public ai0 Hw() throws ph0 {
        try {
            return new aj0(this.WB.Hw());
        } catch (IllegalArgumentException e) {
            throw new ph0(e.getMessage(), e);
        }
    }
}
