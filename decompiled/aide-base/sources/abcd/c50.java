package abcd;

import java.io.IOException;

/* loaded from: classes.dex */
public class c50 extends IOException {
    private final String WB;

    public c50(String str) {
        this.WB = str;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return String.valueOf(super.toString()) + ":" + this.WB;
    }

    public c50(String str, String str2) {
        super(str);
        this.WB = str2;
    }
}
