package abcd;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Handler;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public class zz {
    private static Handler j6;

    static class a implements Runnable {
        final /* synthetic */ int WB;
        final /* synthetic */ String jw;
        final /* synthetic */ int mb;

        public a(int i, int i2, String str) {
            this.WB = i;
            this.mb = i2;
            this.jw = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String strU7 = by.j6().u7();
                if (!by.j6().FH()) {
                    strU7 = ((Object) strU7) + ":" + by.j6().J8();
                }
                int iHashCode = this.WB + strU7.hashCode();
                if (Build.VERSION.SDK_INT >= 26) {
                    NotificationManager notificationManager = (NotificationManager) iy.DW().getSystemService("notification");
                    notificationManager.createNotificationChannel(new NotificationChannel("probelytics", "probelytics developer notifications", 3));
                    notificationManager.notify(iHashCode, new Notification.Builder(iy.DW(), "probelytics").setWhen(System.currentTimeMillis()).setSmallIcon(this.mb).setContentTitle(strU7).setContentText(this.jw).setStyle(new Notification.BigTextStyle().bigText(this.jw)).build());
                    return;
                }
                try {
                    NotificationManager notificationManager2 = (NotificationManager) iy.DW().getSystemService("notification");
                    NotificationCompat.Builder builder = new NotificationCompat.Builder(iy.DW(), "probelytics");
                    builder.setWhen(System.currentTimeMillis());
                    builder.setSmallIcon(this.mb);
                    builder.setContentTitle(strU7);
                    builder.setContentText(this.jw);
                    notificationManager2.notify(iHashCode, builder.build());
                } catch (NoClassDefFoundError unused) {
                    Toast.makeText(iy.DW(), ((Object) strU7) + ": " + this.jw, 1).show();
                }
            } catch (Throwable th) {
                b00.VH("Probe notification", th);
            }
        }
    }

    public static void DW(int i, int i2, String str) {
        j6.post(new a(i, i2, str));
    }

    public static void j6() {
        j6 = new Handler();
    }
}
