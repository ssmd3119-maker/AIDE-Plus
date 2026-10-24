package abcd;

@cy(clazz = -1296913041208050112L, container = -1296913041208050112L, user = true)
/* loaded from: classes.dex */
public class e4 extends Exception {

    @fy
    private static /* synthetic */ boolean WB;

    @gy
    private static /* synthetic */ boolean mb;

    static {
        iy.Zo(e4.class);
    }

    @ey(method = 46442342945391991L)
    public e4() {
        try {
            if (WB) {
                iy.gn(5129006468270544164L, null);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, 5129006468270544164L, null);
            }
            throw th;
        }
    }

    @Override // java.lang.Throwable
    @ey(method = -5758789807850127552L)
    public Throwable fillInStackTrace() {
        try {
            if (WB) {
                iy.gn(1948001683127506551L, this);
            }
            return this;
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, 1948001683127506551L, this);
            }
            throw th;
        }
    }
}
