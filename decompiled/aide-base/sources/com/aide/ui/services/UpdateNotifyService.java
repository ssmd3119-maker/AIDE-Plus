package com.aide.ui.services;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.SharedPreferences;
import androidx.core.app.NotificationCompat;
import com.aide.ui.MainActivity;
import com.aide.ui.ServiceContainer;

@cy(clazz = 4451667395552514777L, container = 4451667395552514777L, user = true)
/* loaded from: classes.dex */
public class UpdateNotifyService {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(UpdateNotifyService.class);
    }

    @ey(method = -2097546166741827729L)
    public UpdateNotifyService() {
        try {
            if (j6) {
                iy.gn(1104285923352837792L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 1104285923352837792L, null);
            }
            throw th;
        }
    }

    @ey(method = 5423315418414977112L)
    private boolean Hw(boolean z, String str, long j, long j2) {
        try {
            if (j6) {
                iy.J0(-2035469416070650560L, this, new Boolean(z), str, new Long(j), new Long(j2));
            }
            SharedPreferences sharedPreferences = ServiceContainer.getContext().getSharedPreferences("UpdateNotifications", 0);
            String str2 = "UpdateTime" + str;
            long j3 = sharedPreferences.getLong(str2, -1L);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putLong(str2, j2);
            editorEdit.commit();
            if (j == j2) {
                return false;
            }
            return j3 == -1 ? !z : j3 < j2;
        } catch (Throwable th) {
            if (DW) {
                iy.a8(th, -2035469416070650560L, this, new Boolean(z), str, new Long(j), new Long(j2));
            }
            throw th;
        }
    }

    private static /* synthetic */ void j6(NotificationManager notificationManager, int i, Notification notification) {
        notificationManager.notify(i, notification);
        iy.gW(notificationManager, i, notification);
    }

    @ey(method = -434423611792093641L)
    public void DW() {
        try {
            if (j6) {
                iy.gn(-2033142320646761585L, this);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -2033142320646761585L, this);
            }
            throw th;
        }
    }

    @ey(method = -3368556038050946783L)
    public boolean FH() {
        try {
            if (j6) {
                iy.gn(-3398755850336432271L, this);
            }
            return ServiceContainer.getContext().getSharedPreferences("UpdateNotifications", 0).getAll().size() == 0;
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, -3398755850336432271L, this);
            }
            throw th;
        }
    }

    @ey(method = 414846940536111436L)
    public void v5(boolean z, String str, long j, long j2, int i, String[] strArr) {
        try {
            if (j6) {
                iy.QX(-1590190292538700164L, this, new Object[]{new Boolean(z), str, new Long(j), new Long(j2), new Integer(i), strArr});
            }
            if (Hw(z, str, j, j2)) {
                String str2 = strArr[0] + " " + strArr[1];
                long jCurrentTimeMillis = System.currentTimeMillis();
                PendingIntent pendingIntentOW = MainActivity.OW(ServiceContainer.getContext());
                NotificationCompat.Builder builder = new NotificationCompat.Builder(ServiceContainer.getContext(), "other");
                builder.setWhen(jCurrentTimeMillis);
                builder.setTicker("New " + str2 + " lessons!");
                builder.setSmallIcon(i);
                builder.setContentTitle(str2);
                builder.setContentText("Check out the new lessons");
                builder.setContentIntent(pendingIntentOW);
                builder.setAutoCancel(true);
                builder.setDefaults(1);
                j6((NotificationManager) ServiceContainer.getContext().getSystemService("notification"), str2.hashCode(), builder.build());
            }
        } catch (Throwable th) {
            if (DW) {
                iy.rN(th, -1590190292538700164L, this, new Object[]{new Boolean(z), str, new Long(j), new Long(j2), new Integer(i), strArr});
            }
            throw th;
        }
    }
}
