package abcd;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class mj0 extends yh0 {
    public mj0(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // abcd.yh0
    public yh0 DW() {
        return this;
    }

    @Override // abcd.yh0
    public yh0 j6() {
        return this;
    }

    @Override // abcd.yh0
    public void tp(mh0 mh0Var) {
        if (mh0Var == null) {
            throw new IOException("null object detected");
        }
        mh0Var.DW().we().gn(this);
    }
}
