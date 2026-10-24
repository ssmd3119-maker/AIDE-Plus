package abcd;

@cy(clazz = -2082722865401551347L, container = -2082722865401551347L, user = true)
/* loaded from: classes.dex */
public class c4 extends Exception {

    @fy
    private static /* synthetic */ boolean WB;

    @gy
    private static /* synthetic */ boolean mb;

    static {
        iy.Zo(c4.class);
    }

    @ey(method = -1562070666450559920L)
    public c4() {
        try {
            if (WB) {
                iy.gn(-754332000946180020L, null);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, -754332000946180020L, null);
            }
            throw th;
        }
    }

    @Override // java.lang.Throwable
    @ey(method = -3285583396951449041L)
    public Throwable fillInStackTrace() {
        try {
            if (WB) {
                iy.gn(4611448037114233084L, this);
            }
            return this;
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, 4611448037114233084L, this);
            }
            throw th;
        }
    }
}
