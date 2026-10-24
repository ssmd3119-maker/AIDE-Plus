package abcd;

@cy(clazz = -220214977736913120L, container = -220214977736913120L, user = true)
/* loaded from: classes.dex */
public abstract class i4 {

    @dy(field = 3635854830533470211L)
    private static i4 DW;

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = -922319701128509175L)
    private static Object j6;

    @cy(clazz = 1236042494955155008L, container = 1236042494955155008L, user = true)
    public class a extends Exception {
    }

    @cy(clazz = 3327965818590233856L, container = 3327965818590233856L, user = true)
    public interface b {
        @ey(method = 125379189443566560L)
        void j6(char[] cArr, int i, int i2);
    }

    @cy(clazz = 819200680259741595L, container = 819200680259741595L, user = true)
    public interface c {
        @ey(method = 1991117103797114249L)
        boolean DW();

        @ey(method = -8080735027960355264L)
        void FH(b bVar);

        @ey(method = 58551797794037075L)
        int j6();

        @ey(method = -977107660771789500L)
        int start();
    }

    @cy(clazz = -618720815012376225L, container = -618720815012376225L, user = true)
    public interface d {
        @ey(method = -3035256393426997617L)
        c j6();
    }

    static {
        try {
            iy.Zo(i4.class);
            if (FH) {
                iy.gn(1895400739506206011L, null);
            }
            j6 = new Object();
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 1895400739506206011L, null);
            }
            throw th;
        }
    }

    @ey(method = 2747455855375486773L)
    public i4() {
        try {
            if (FH) {
                iy.gn(-5050141221366318676L, null);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -5050141221366318676L, null);
            }
            throw th;
        }
    }

    @ey(method = -144025025820780944L)
    public static i4 FH() {
        i4 i4Var;
        try {
            if (FH) {
                iy.gn(-1850313852432464160L, null);
            }
            synchronized (j6) {
                i4Var = DW;
            }
            return i4Var;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -1850313852432464160L, null);
            }
            throw th;
        }
    }

    @ey(method = 1009207494918465875L)
    public abstract d DW(String str);

    @ey(method = 5806142105907800000L)
    public abstract b Hw();

    @ey(method = -178972120395482800L)
    public abstract d j6(String str);
}
