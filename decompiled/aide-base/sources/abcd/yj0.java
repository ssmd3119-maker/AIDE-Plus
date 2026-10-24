package abcd;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class yj0 extends yh0 {
    public yj0(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // abcd.yh0
    public void tp(mh0 mh0Var) {
        if (mh0Var == null) {
            throw new IOException("null object detected");
        }
        mh0Var.DW().J0().gn(this);
    }
}
