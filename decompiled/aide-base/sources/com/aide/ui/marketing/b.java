package com.aide.ui.marketing;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.aide.ui.PackageUpgradedBroadcastReceiver;
import com.aide.ui.UserPresent;

@cy(clazz = 2573400133095991248L, container = 2573400133095991248L, user = true)
/* loaded from: classes.dex */
public class b {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    @cy(clazz = -2757814003230063351L, container = 2573400133095991248L, user = true)
    static class a implements UserPresent {

        @gy
        private static /* synthetic */ boolean VH;

        @fy
        private static /* synthetic */ boolean Zo;

        @dy(field = 874246082607453472L)
        final /* synthetic */ String DW;

        @dy(field = -3279283882660395296L)
        final /* synthetic */ int FH;

        @dy(field = -461322319177498136L)
        final /* synthetic */ PendingIntent Hw;

        @dy(field = -2770661063546633025L)
        final /* synthetic */ String j6;

        @dy(field = -1410306595839804768L)
        final /* synthetic */ int v5;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -4144506402346726647L)
        a(String str, String str2, int i, PendingIntent pendingIntent, int i2) {
            this.j6 = str;
            this.DW = str2;
            this.FH = i;
            this.Hw = pendingIntent;
            this.v5 = i2;
        }

        private static /* synthetic */ void DW(NotificationManager notificationManager, int i, Notification notification) {
            notificationManager.notify(i, notification);
            iy.gW(notificationManager, i, notification);
        }

        @Override // com.aide.ui.UserPresent
        @ey(method = 3186090975791496123L)
        public void j6(Context context) {
            try {
                if (Zo) {
                    iy.tp(-3147066609708981785L, this, context);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                SharedPreferences sharedPreferences = context.getSharedPreferences("WhatsNewNotification", 0);
                String string = sharedPreferences.getString("lastText", "");
                String strJ6 = com.aide.ui.marketing.a.j6(context);
                if (string.equals(strJ6)) {
                    return;
                }
                sharedPreferences.edit().putLong("lastShown", jCurrentTimeMillis).putString("lastText", strJ6).commit();
                NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "other");
                builder.setContentTitle(this.j6);
                builder.setContentText(this.DW);
                builder.setSmallIcon(this.FH);
                builder.setContentIntent(this.Hw);
                builder.setAutoCancel(true);
                if (Build.VERSION.SDK_INT < 19) {
                    builder.setDefaults(5);
                } else {
                    builder.setDefaults(-1);
                }
                DW((NotificationManager) context.getSystemService("notification"), this.v5, builder.build());
            } catch (Throwable th) {
                if (VH) {
                    iy.j3(th, -3147066609708981785L, this, context);
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(b.class);
    }

    @ey(method = -2434788463362349997L)
    public b() {
        try {
            if (j6) {
                iy.gn(-4430980824286472003L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -4430980824286472003L, null);
            }
            throw th;
        }
    }

    @ey(method = -711635125940444760L)
    public static void j6(Context context, int i, int i2, String str, String str2, PendingIntent pendingIntent) {
        try {
            if (j6) {
                iy.QX(80035777607334780L, null, new Object[]{context, new Integer(i), new Integer(i2), str, str2, pendingIntent});
            }
            PackageUpgradedBroadcastReceiver.j6(new a(str, str2, i2, pendingIntent, i));
        } catch (Throwable th) {
            if (DW) {
                iy.rN(th, 80035777607334780L, null, new Object[]{context, new Integer(i), new Integer(i2), str, str2, pendingIntent});
            }
            throw th;
        }
    }
}
