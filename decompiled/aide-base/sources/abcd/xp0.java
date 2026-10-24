package abcd;

/* loaded from: classes.dex */
public class xp0 extends RuntimeException {
    private Throwable WB;

    public xp0(String str, Throwable th) {
        super(str);
        this.WB = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.WB;
    }
}
