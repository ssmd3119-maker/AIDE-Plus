package abcd;

import java.io.File;

@cy(clazz = 1067082844909081120L, container = 1067082844909081120L, user = true)
/* loaded from: classes.dex */
public abstract class g4 {

    @dy(field = -1866576513991797627L)
    private static g4 DW;

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = 1775813849288939775L)
    private static Object j6;

    static {
        try {
            iy.Zo(g4.class);
            if (FH) {
                iy.gn(3176102765441174928L, null);
            }
            j6 = new Object();
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 3176102765441174928L, null);
            }
            throw th;
        }
    }

    @ey(method = -784550059232033765L)
    public g4() {
        try {
            if (FH) {
                iy.gn(267002143026857037L, null);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 267002143026857037L, null);
            }
            throw th;
        }
    }

    @ey(method = -4240759585752028224L)
    public static g4 j6() {
        g4 g4Var;
        try {
            if (FH) {
                iy.gn(-1705772020450490709L, null);
            }
            synchronized (j6) {
                g4Var = DW;
            }
            return g4Var;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -1705772020450490709L, null);
            }
            throw th;
        }
    }

    @ey(method = -7107887667002259136L)
    public abstract boolean DW(File file, long j);
}
