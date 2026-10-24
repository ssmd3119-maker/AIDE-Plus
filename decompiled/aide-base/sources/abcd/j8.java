package abcd;

import android.util.Log;

@cy(clazz = 206176272971136696L, container = 206176272971136696L, user = true)
/* loaded from: classes.dex */
public class j8 {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(j8.class);
    }

    @ey(method = 2135582495840084225L)
    public j8() {
        try {
            if (j6) {
                iy.gn(-2862225670322808339L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2862225670322808339L, null);
            }
            throw th;
        }
    }

    @ey(method = -3610032539447803196L)
    public static void DW(String str) {
        try {
            if (j6) {
                iy.tp(-4991706475955051616L, null, str);
            }
            Log.e("aidelicensing", str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -4991706475955051616L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 3178940084722994020L)
    public static void FH(String str, Throwable th) {
        try {
            if (j6) {
                iy.EQ(-2867742640759520L, null, str, th);
            }
            Log.e("aidelicensing", str, th);
        } catch (Throwable th2) {
            if (DW) {
                iy.Mr(th2, -2867742640759520L, null, str, th);
            }
            throw th2;
        }
    }

    @ey(method = 537313828142177880L)
    public static void Hw(Throwable th) {
        try {
            if (j6) {
                iy.tp(-1470722606738827008L, null, th);
            }
            Log.e("aidelicensing", th.toString(), th);
        } catch (Throwable th2) {
            if (DW) {
                iy.j3(th2, -1470722606738827008L, null, th);
            }
            throw th2;
        }
    }

    @ey(method = 3661899220645195827L)
    public static void j6(String str) {
        try {
            if (j6) {
                iy.tp(1161957798103505235L, null, str);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1161957798103505235L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 3443072859259036000L)
    public static void v5(String str) {
        try {
            if (j6) {
                iy.tp(963896858250390900L, null, str);
            }
            Log.w("aidelicensing", str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 963896858250390900L, null, str);
            }
            throw th;
        }
    }
}
