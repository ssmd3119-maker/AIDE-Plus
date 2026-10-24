package abcd;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class lj0 implements xh0 {
    private ck0 WB;

    public lj0(ck0 ck0Var) {
        this.WB = ck0Var;
    }

    @Override // abcd.mh0
    public ai0 DW() {
        try {
            return Hw();
        } catch (IOException e) {
            throw new zh0("IOException converting stream to byte array: " + e.getMessage(), e);
        }
    }

    @Override // abcd.dk0
    public ai0 Hw() {
        return new kj0(this.WB.FH());
    }

    @Override // abcd.xh0
    public InputStream j6() {
        return this.WB;
    }
}
