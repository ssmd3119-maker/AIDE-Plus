package abcd;

import java.io.IOException;

/* loaded from: classes.dex */
public class ph0 extends IOException {
    private Throwable WB;

    public ph0(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.WB;
    }

    public ph0(String str, Throwable th) {
        super(str);
        this.WB = th;
    }
}
