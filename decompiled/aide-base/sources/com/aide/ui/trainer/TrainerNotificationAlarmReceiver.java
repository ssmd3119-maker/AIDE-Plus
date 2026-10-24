package com.aide.ui.trainer;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import com.aide.ui.MainActivity;

@cy(clazz = -295995181194839715L, container = -295995181194839715L, user = true)
/* loaded from: classes.dex */
public class TrainerNotificationAlarmReceiver extends BroadcastReceiver {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(TrainerNotificationAlarmReceiver.class);
    }

    @ey(method = -2776766738118430624L)
    public TrainerNotificationAlarmReceiver() {
        try {
            if (j6) {
                iy.gn(-3035100436823965565L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3035100436823965565L, null);
            }
            throw th;
        }
    }

    @ey(method = -1666497021522522000L)
    public static void DW(Context context) {
        try {
            if (j6) {
                iy.tp(-2190014202467442005L, null, context);
            }
            ((AlarmManager) context.getSystemService("alarm")).cancel(PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) TrainerNotificationAlarmReceiver.class), 134217728));
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2190014202467442005L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -306212317470250980L)
    public static void FH(Context context, long j, int i, int i2, String str, String str2, String str3) {
        try {
            if (j6) {
                iy.QX(-129407593305664111L, null, new Object[]{context, new Long(j), new Integer(i), new Integer(i2), str, str2, str3});
            }
            Intent intent = new Intent(context, (Class<?>) TrainerNotificationAlarmReceiver.class);
            intent.putExtra("EXTRA_AFTER", j);
            intent.putExtra("EXTRA_REPEAT", i);
            intent.putExtra("EXTRA_MSG", str);
            intent.putExtra("EXTRA_TEXT", str3);
            intent.putExtra("EXTRA_TITLE", str2);
            intent.putExtra("EXTRA_ICON", i2);
            ((AlarmManager) context.getSystemService("alarm")).set(1, System.currentTimeMillis() + j, PendingIntent.getBroadcast(context, 0, intent, 134217728));
        } catch (Throwable th) {
            if (DW) {
                iy.rN(th, -129407593305664111L, null, new Object[]{context, new Long(j), new Integer(i), new Integer(i2), str, str2, str3});
            }
            throw th;
        }
    }

    @ey(method = 7295468428452186408L)
    private void Hw(Context context, int i, String str, String str2, String str3) {
        try {
            if (j6) {
                iy.J8(5368880537536353665L, this, context, new Integer(i), str, str2, str3);
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            long jCurrentTimeMillis = System.currentTimeMillis();
            PendingIntent pendingIntentLp = MainActivity.lp(context);
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "other");
            builder.setWhen(jCurrentTimeMillis);
            builder.setTicker(str);
            builder.setSmallIcon(i);
            builder.setContentTitle(str2);
            builder.setContentText(str3);
            builder.setContentIntent(pendingIntentLp);
            builder.setAutoCancel(true);
            builder.setDefaults(1);
            j6(notificationManager, 654805548, builder.build());
        } catch (Throwable th) {
            if (DW) {
                iy.lg(th, 5368880537536353665L, this, context, new Integer(i), str, str2, str3);
            }
            throw th;
        }
    }

    private static /* synthetic */ void j6(NotificationManager notificationManager, int i, Notification notification) {
        notificationManager.notify(i, notification);
        iy.gW(notificationManager, i, notification);
    }

    @Override // android.content.BroadcastReceiver
    @ey(method = -975675503476471337L)
    public void onReceive(Context context, Intent intent) {
        try {
            if (j6) {
                iy.EQ(-99499286398722552L, this, context, intent);
            }
            long longExtra = intent.getLongExtra("EXTRA_AFTER", 0L);
            int intExtra = intent.getIntExtra("EXTRA_REPEAT", 0);
            String stringExtra = intent.getStringExtra("EXTRA_MSG");
            String stringExtra2 = intent.getStringExtra("EXTRA_TITLE");
            String stringExtra3 = intent.getStringExtra("EXTRA_TEXT");
            int intExtra2 = intent.getIntExtra("EXTRA_ICON", 0);
            int i = intExtra - 1;
            if (i > 0) {
                FH(context, longExtra, i, intExtra2, stringExtra, stringExtra2, stringExtra3);
            }
            Hw(context, intExtra2, stringExtra, stringExtra2, stringExtra3);
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -99499286398722552L, this, context, intent);
            }
            throw th;
        }
    }
}
