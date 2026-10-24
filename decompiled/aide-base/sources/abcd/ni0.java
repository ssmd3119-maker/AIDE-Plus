package abcd;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class ni0 implements xh0 {
    private fi0 WB;

    public ni0(fi0 fi0Var) {
        this.WB = fi0Var;
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
        return new mi0(mq0.DW(j6()));
    }

    @Override // abcd.xh0
    public InputStream j6() {
        return new ui0(this.WB);
    }
}
