package abcd;

/* loaded from: classes.dex */
public enum xo implements kt {
    RUNTIME("runtime"),
    BUILD("build"),
    SYSTEM("system"),
    EMBEDDED("embedded");

    private final String WB;

    xo(String str) {
        this.WB = str;
    }

    @Override // abcd.kt
    public String Zo() {
        return this.WB;
    }
}
