package abcd;

import java.io.IOException;

/* loaded from: classes.dex */
public class v40 extends IOException {
    public v40(String str) {
        super(str);
    }

    public v40(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
