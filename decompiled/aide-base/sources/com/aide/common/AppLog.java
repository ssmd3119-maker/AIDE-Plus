package com.aide.common;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.util.Log;

@cy(clazz = -2971875981285046080L, container = -2971875981285046080L, user = true)
/* loaded from: classes.dex */
public class AppLog {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(AppLog.class);
    }

    @ey(method = -2875509290070060696L)
    public AppLog() {
        try {
            if (j6) {
                iy.gn(938405262453514800L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 938405262453514800L, null);
            }
            throw th;
        }
    }

    @ey(method = 4648646841001126320L)
    public static void DW(String str) {
        try {
            if (j6) {
                iy.tp(-1782250885237908825L, null, str);
            }
            Log.d("AIDE", str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1782250885237908825L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -2547821379887245299L)
    public static void FH(String str) {
        try {
            if (j6) {
                iy.tp(5697655480844229132L, null, str);
            }
            Log.e("AIDE", str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 5697655480844229132L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -4028016482953012635L)
    public static void Hw(String str, Throwable th) {
        try {
            if (j6) {
                iy.EQ(2032685343831427996L, null, str, th);
            }
            Log.e("AIDE", str, th);
        } catch (Throwable th2) {
            if (DW) {
                iy.Mr(th2, 2032685343831427996L, null, str, th);
            }
            throw th2;
        }
    }

    @ey(method = 2878660193611249553L)
    public static void VH(String str) {
        try {
            if (j6) {
                iy.tp(-3480512270941837312L, null, str);
            }
            Log.i("AIDE", str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -3480512270941837312L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -2607068033853091368L)
    public static void Zo(Object obj, String str) {
        try {
            if (j6) {
                iy.EQ(3426655042856397151L, null, obj, str);
            }
            Log.i("AIDE", obj.getClass().getName() + "." + str);
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 3426655042856397151L, null, obj, str);
            }
            throw th;
        }
    }

    @ey(method = 4439926712479804161L)
    public static void gn(String str) {
        try {
            if (j6) {
                iy.tp(-2024606057127944304L, null, str);
            }
            Log.w("AIDE", str);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2024606057127944304L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -379118870430056075L)
    public static void j6(Throwable th) {
        try {
            if (j6) {
                iy.tp(5532495532818890108L, null, th);
            }
            Log.e("AIDE", th.toString(), th);
        } catch (Throwable th2) {
            if (DW) {
                iy.j3(th2, 5532495532818890108L, null, th);
            }
            throw th2;
        }
    }

    @ey(method = 1551158404071312831L)
    public static void v5(Throwable th) {
        try {
            if (j6) {
                iy.tp(-4656685344115823904L, null, th);
            }
            Log.e("AIDE", th.toString(), th);
        } catch (Throwable th2) {
            if (DW) {
                iy.j3(th2, -4656685344115823904L, null, th);
            }
            throw th2;
        }
    }
}
