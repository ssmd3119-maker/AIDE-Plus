package abcd;

import java.io.IOException;

/* loaded from: classes.dex */
public class ki0 implements mh0, dk0 {
    private final int WB;
    private final fi0 mb;

    public ki0(int i, fi0 fi0Var) {
        this.WB = i;
        this.mb = fi0Var;
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
        return new ji0(this.WB, this.mb.Hw());
    }
}
