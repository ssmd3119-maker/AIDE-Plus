package abcd;

import java.io.IOException;

/* loaded from: classes.dex */
public class nm0 extends IOException {
    private Throwable WB;

    public nm0(String str, Throwable th) {
        super(str);
        this.WB = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.WB;
    }
}
