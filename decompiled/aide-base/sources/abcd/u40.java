package abcd;

import java.io.IOException;

/* loaded from: classes.dex */
public class u40 extends IOException {
    public u40(String str) {
        super(str);
    }

    public u40(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
