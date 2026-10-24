package abcd;

@cy(clazz = -763031331629171476L, container = -763031331629171476L, user = true)
/* loaded from: classes.dex */
public abstract class h4 {

    @dy(field = -523064720799552701L)
    private static h4 DW;

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = 2296690719094790161L)
    private static Object j6;

    static {
        try {
            iy.Zo(h4.class);
            if (FH) {
                iy.gn(1230057188939856771L, null);
            }
            j6 = new Object();
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 1230057188939856771L, null);
            }
            throw th;
        }
    }

    @ey(method = 2427049888053046911L)
    public h4() {
        try {
            if (FH) {
                iy.gn(-2819042032058163600L, null);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -2819042032058163600L, null);
            }
            throw th;
        }
    }

    @ey(method = 3964964070851907152L)
    public static h4 j6() {
        h4 h4Var;
        try {
            if (FH) {
                iy.gn(-3787814060744596520L, null);
            }
            synchronized (j6) {
                h4Var = DW;
            }
            return h4Var;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -3787814060744596520L, null);
            }
            throw th;
        }
    }

    @ey(method = 1200248369671454872L)
    public abstract float DW(String str);
}
