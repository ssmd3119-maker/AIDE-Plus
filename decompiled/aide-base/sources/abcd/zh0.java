package abcd;

/* loaded from: classes.dex */
public class zh0 extends IllegalStateException {
    private Throwable WB;

    public zh0(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.WB;
    }

    public zh0(String str, Throwable th) {
        super(str);
        this.WB = th;
    }
}
