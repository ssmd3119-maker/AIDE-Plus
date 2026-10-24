package abcd;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import com.aide.ui.ServiceContainer;

@cy(clazz = -495786187121037287L, container = -495786187121037287L, user = true)
/* loaded from: classes.dex */
public class df {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(df.class);
    }

    @ey(method = -72456500848558737L)
    public df() {
        try {
            if (j6) {
                iy.gn(-1322339339664368060L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -1322339339664368060L, null);
            }
            throw th;
        }
    }

    @ey(method = -2207084599969325960L)
    private void FH(Context context) {
        try {
            if (j6) {
                iy.tp(-1911362321980657488L, this, context);
            }
            j6(context, "engine", "Code Analysis Notifications", "Notifications showing error checking progress and statistics.", 2);
            j6(context, "other", "Other Notifications", "All other notifications.", 3);
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1911362321980657488L, this, context);
            }
            throw th;
        }
    }

    @ey(method = 1445762437662561304L)
    private void j6(Context context, String str, String str2, String str3, int i) {
        try {
            if (j6) {
                iy.J8(-1405744868706864096L, this, context, str, str2, str3, new Integer(i));
            }
            if (Build.VERSION.SDK_INT < 26) {
                return;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            NotificationChannel notificationChannel = new NotificationChannel(str, str2, i);
            notificationChannel.setDescription(str3);
            notificationManager.createNotificationChannel(notificationChannel);
        } catch (Throwable th) {
            if (DW) {
                iy.lg(th, -1405744868706864096L, this, context, str, str2, str3, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2769605920445239743L)
    public void DW() {
        try {
            if (j6) {
                iy.gn(2465520606808208779L, this);
            }
            FH(ServiceContainer.getContext());
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2465520606808208779L, this);
            }
            throw th;
        }
    }
}
