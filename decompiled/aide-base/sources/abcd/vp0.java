package abcd;

/* loaded from: classes.dex */
public class vp0 extends Exception {
    private Throwable WB;

    public vp0(String str, Throwable th) {
        super(str);
        this.WB = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.WB;
    }

    public vp0(String str) {
        super(str);
    }
}
