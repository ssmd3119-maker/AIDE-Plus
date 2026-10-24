package abcd;

import android.R;

/* loaded from: classes.dex */
public class uz {
    private static final Object DW = new Object();
    private static Boolean j6;

    public static boolean DW() {
        if ((iy.DW().getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        synchronized (DW) {
            if (j6 != null) {
                return j6.booleanValue();
            }
            j6 = Boolean.valueOf(FH());
            boolean zJ3 = tz.j3();
            tz.er(j6.booleanValue());
            if (zJ3 != j6.booleanValue()) {
                if (j6.booleanValue()) {
                    zz.DW(694086856, R.drawable.stat_notify_sync_noanim, "probelytics developer mode enabled");
                } else {
                    zz.DW(694086856, R.drawable.stat_sys_warning, "probelytics developer mode disabled");
                }
            }
            return j6.booleanValue();
        }
    }

    private static boolean FH() {
        return "true".equals(j6("debug.probelytics"));
    }

    public static void Hw() {
        synchronized (DW) {
            j6 = null;
            DW();
        }
    }

    private static String j6(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
