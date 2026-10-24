package com.aide.licensing;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.j8;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

@cy(clazz = -1214724525099987816L, container = -1214724525099987816L, user = true)
/* loaded from: classes.dex */
public class LicenseUpdateAlarmReceiver extends BroadcastReceiver {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(LicenseUpdateAlarmReceiver.class);
    }

    @ey(method = 586432303454541159L)
    public LicenseUpdateAlarmReceiver() {
        try {
            if (j6) {
                iy.gn(242723384064248805L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 242723384064248805L, null);
            }
            throw th;
        }
    }

    @ey(method = -341753287749332060L)
    private static void DW(Context context, int i, boolean z) {
        try {
            if (j6) {
                iy.we(1162441539074843508L, null, context, new Integer(i), new Boolean(z));
            }
            a aVar = new a();
            aVar.EQ(context, true);
            if (aVar.VH()) {
                j8.j6("Restarting timer.");
                AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) LicenseUpdateAlarmReceiver.class), 0);
                if (z) {
                    alarmManager.setInexactRepeating(0, System.currentTimeMillis() + i, 3600000L, broadcast);
                } else {
                    alarmManager.setRepeating(0, System.currentTimeMillis() + i, 3600000L, broadcast);
                }
            }
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 1162441539074843508L, null, context, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -14965228001288928L)
    public static void FH(Context context) {
        try {
            if (j6) {
                iy.tp(-7397548022290710592L, null, context);
            }
            DW(context, 120000, false);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -7397548022290710592L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -1149392847172609468L)
    public static void j6(Context context) {
        try {
            if (j6) {
                iy.tp(-236552509058634860L, null, context);
            }
            DW(context, 3600000, true);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -236552509058634860L, null, context);
            }
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    @ey(method = 2101793244480836892L)
    public void onReceive(Context context, Intent intent) {
        try {
            if (j6) {
                iy.EQ(-934271877848022180L, this, context, intent);
            }
            j8.j6("Timer broadcast received.");
            context.startService(new Intent(context, (Class<?>) LicenseUpdateService.class));
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -934271877848022180L, this, context, intent);
            }
            throw th;
        }
    }
}
