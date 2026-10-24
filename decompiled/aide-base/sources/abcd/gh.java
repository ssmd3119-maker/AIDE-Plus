package abcd;

/* loaded from: classes.dex */
public abstract class gh implements ti {
    private final String j6;

    public gh(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        this.j6 = str;
    }

    @Override // abcd.ti
    public String getName() {
        return this.j6;
    }
}
