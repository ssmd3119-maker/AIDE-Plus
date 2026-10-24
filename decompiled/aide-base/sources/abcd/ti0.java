package abcd;

import java.io.IOException;

/* loaded from: classes.dex */
public class ti0 implements mh0, dk0 {
    private boolean WB;
    private fi0 jw;
    private int mb;

    public ti0(boolean z, int i, fi0 fi0Var) {
        this.WB = z;
        this.mb = i;
        this.jw = fi0Var;
    }

    @Override // abcd.mh0
    public ai0 DW() {
        try {
            return Hw();
        } catch (IOException e) {
            throw new zh0(e.getMessage());
        }
    }

    @Override // abcd.dk0
    public ai0 Hw() {
        return this.jw.FH(this.WB, this.mb);
    }
}
