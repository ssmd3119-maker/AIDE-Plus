package abcd;

/* loaded from: classes.dex */
public final class tv extends qv {
    private final rv j6 = new rv();

    @Override // abcd.qv
    public final void j6(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        this.j6.j6(th, true).add(th2);
    }
}
