package abcd;

/* loaded from: classes.dex */
public class tm0 extends Exception {
    Exception WB;

    public tm0(String str, Exception exc) {
        super(str);
        this.WB = exc;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.WB;
    }
}
