package com.aide.ui.firebase;

import abcd.b0;
import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.f00;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;

@cy(clazz = 5610107662420460160L, container = 5610107662420460160L, user = true)
/* loaded from: classes.dex */
public final class FireBaseLogEvent {

    @dy(field = 5439055544819666505L)
    private static FirebaseAnalytics DW;

    @dy(field = -4694706514906550408L)
    private static boolean FH;

    @fy
    private static /* synthetic */ boolean Hw;

    @dy(field = -2978191133919069431L)
    private static b0 j6;

    @gy
    private static /* synthetic */ boolean v5;

    static {
        try {
            iy.Zo(FireBaseLogEvent.class);
            if (Hw) {
                iy.gn(1404809298436198767L, null);
            }
            FH = false;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 1404809298436198767L, null);
            }
            throw th;
        }
    }

    @ey(method = -1836758413888555827L)
    private FireBaseLogEvent() {
        try {
            if (Hw) {
                iy.gn(-3127245079101136995L, null);
            }
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -3127245079101136995L, null);
            }
            throw th;
        }
    }

    @ey(method = -2587309867208960980L)
    public static void DW(Activity activity, String str) {
        try {
            if (Hw) {
                iy.EQ(3767195592705722720L, null, activity, str);
            }
            if (!Hw()) {
            }
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, 3767195592705722720L, null, activity, str);
            }
            throw th;
        }
    }

    @ey(method = -1166545128825722800L)
    public static void EQ(String str, Map<String, String> map) {
        try {
            if (Hw) {
                iy.EQ(57942326873086708L, null, str, map);
            }
            if (Hw()) {
                j6("logEvent: " + str);
                Bundle bundle = new Bundle();
                bundle.putString("event_name", str);
                DW.j6("a4_legacy_event", bundle);
            }
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, 57942326873086708L, null, str, map);
            }
            throw th;
        }
    }

    @ey(method = 2572434545017960339L)
    public static void FH(Context context) {
        try {
            if (Hw) {
                iy.tp(1176169637272847721L, null, context);
            }
            if (Hw()) {
                j6("endSession");
            }
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 1176169637272847721L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 300248079910346667L)
    private static boolean Hw() {
        try {
            if (Hw) {
                iy.gn(880104102092781125L, null);
            }
            if (!FH) {
                throw new IllegalStateException("Analytics not initialized");
            }
            if (j6.j6()) {
                f00.j6();
            } else {
                f00.DW();
            }
            DW.DW(j6.j6());
            return j6.j6();
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 880104102092781125L, null);
            }
            throw th;
        }
    }

    @ey(method = 4916751117018343217L)
    public static void J0(String str) {
        try {
            if (Hw) {
                iy.tp(2923279749780514351L, null, str);
            }
            if (Hw()) {
                j6("logLevelStart: " + str);
                Bundle bundle = new Bundle();
                bundle.putString("level_name", str);
                DW.j6("level_start", bundle);
            }
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 2923279749780514351L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -451280832332993061L)
    public static void J8(String str) {
        try {
            if (Hw) {
                iy.tp(-557607551129886915L, null, str);
            }
            DW.FH("a4_os_arch", str);
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -557607551129886915L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -3153216629067275208L)
    public static void QX(String str) {
        try {
            if (Hw) {
                iy.tp(-3319366860714454768L, null, str);
            }
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -3319366860714454768L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -3269662903134856512L)
    public static void VH() {
        try {
            if (Hw) {
                iy.gn(-5328824661013866912L, null);
            }
            if (!FH) {
                throw new IllegalStateException("Analytics not initialized");
            }
            if (j6.j6()) {
                f00.j6();
            } else {
                f00.DW();
            }
            DW.DW(j6.j6());
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -5328824661013866912L, null);
            }
            throw th;
        }
    }

    @ey(method = 1254927389418422025L)
    public static void Ws(String str) {
        try {
            if (Hw) {
                iy.tp(1476114258858077195L, null, str);
            }
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 1476114258858077195L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -1547566495713809993L)
    public static void XL(Activity activity, String str) {
        try {
            if (Hw) {
                iy.EQ(1418056004630788889L, null, activity, str);
            }
            aM(activity, str, null);
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, 1418056004630788889L, null, activity, str);
            }
            throw th;
        }
    }

    @ey(method = 3462188481372595920L)
    public static void Zo(Context context, b0 b0Var) {
        try {
            if (Hw) {
                iy.EQ(1341088318444806360L, null, context, b0Var);
            }
            if (b0Var == null) {
                throw new IllegalArgumentException("Arguments may not be null");
            }
            j6("initialize");
            j6 = b0Var;
            try {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            DW = FirebaseAnalytics.getInstance(context);
            FH = true;
            Hw();
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, 1341088318444806360L, null, context, b0Var);
            }
            throw th;
        }
    }

    @ey(method = -159285497903088000L)
    public static void aM(Activity activity, String str, Map<String, String> map) {
        try {
            if (Hw) {
                iy.we(103294852219814992L, null, activity, str, map);
            }
            if (!Hw()) {
            }
        } catch (Throwable th) {
            if (v5) {
                iy.U2(th, 103294852219814992L, null, activity, str, map);
            }
            throw th;
        }
    }

    @ey(method = -1311444693672507051L)
    public static boolean gn() {
        try {
            if (Hw) {
                iy.gn(3963217086836114455L, null);
            }
            return FH;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 3963217086836114455L, null);
            }
            throw th;
        }
    }

    @ey(method = 3721430689376625156L)
    public static void j3(Context context) {
        try {
            if (Hw) {
                iy.tp(-3005592755486308344L, null, context);
            }
            if (Hw()) {
                j6("startSession");
            }
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -3005592755486308344L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 4725891368456651679L)
    private static void j6(String str) {
        try {
            if (Hw) {
                iy.tp(-5053611035144370651L, null, str);
            }
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, -5053611035144370651L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 1319937080796588485L)
    public static void tp(String str) {
        try {
            if (Hw) {
                iy.tp(839696905947546655L, null, str);
            }
            if (Hw()) {
                j6("logEvent: " + str);
                Bundle bundle = new Bundle();
                bundle.putString("event_name", str);
                DW.j6("a4_legacy_event", bundle);
            }
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 839696905947546655L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -1598005413613868808L)
    public static void u7(Context context, String str, String str2, String str3, String str4, String str5, double d, String str6) {
        try {
            if (Hw) {
                iy.QX(1354123103448276800L, null, new Object[]{context, str, str2, str3, str4, str5, new Double(d), str6});
            }
            if (!Hw()) {
            }
        } catch (Throwable th) {
            if (v5) {
                iy.rN(th, 1354123103448276800L, null, new Object[]{context, str, str2, str3, str4, str5, new Double(d), str6});
            }
            throw th;
        }
    }

    @ey(method = -6589988098649186872L)
    public static String v5(String str, String str2, String str3) {
        try {
            if (Hw) {
                iy.we(3335519145276727024L, null, str, str2, str3);
            }
            return "market://details?id=" + str2 + "&referrer=utm_source%3D" + str + "%26utm_medium%3Dinapplink%26utm_campaign%3D" + str3;
        } catch (Throwable th) {
            if (v5) {
                iy.U2(th, 3335519145276727024L, null, str, str2, str3);
            }
            throw th;
        }
    }

    @ey(method = 1423512480485508400L)
    public static void we(String str) {
        try {
            if (Hw) {
                iy.tp(1585715275549250560L, null, str);
            }
            if (Hw()) {
                j6("logLevelEnd: " + str);
                Bundle bundle = new Bundle();
                bundle.putString("level_name", str);
                DW.j6("level_end", bundle);
            }
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 1585715275549250560L, null, str);
            }
            throw th;
        }
    }
}
