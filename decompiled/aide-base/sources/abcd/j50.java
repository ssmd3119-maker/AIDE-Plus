package abcd;

import java.io.IOException;

/* loaded from: classes.dex */
public class j50 extends IOException {
    public j50(ue0 ue0Var, String str) {
        super(ue0Var.Ws(null) + ": " + str);
    }

    public j50(ue0 ue0Var, String str, Throwable th) {
        this(ue0Var.Ws(null) + ": " + str, th);
    }

    public j50(String str) {
        super(str);
    }

    public j50(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
