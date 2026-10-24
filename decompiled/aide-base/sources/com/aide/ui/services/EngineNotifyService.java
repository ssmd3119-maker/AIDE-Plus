package com.aide.ui.services;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.R;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import androidx.core.app.NotificationCompat;
import com.aide.ui.MainActivity;
import com.aide.ui.R$drawable;
import com.aide.ui.ServiceContainer;
import com.aide.ui.build.BuildService;
import com.aide.ui.services.ErrorService;
import com.aide.ui.u;
import com.aide.ui.util.FileSystem;

@cy(clazz = 4054588976378657080L, container = 4054588976378657080L, user = true)
/* loaded from: classes.dex */
public class EngineNotifyService implements ErrorService.ErrorListener, BuildService.BuildListener {

    @gy
    private static /* synthetic */ boolean k2;

    @fy
    private static /* synthetic */ boolean qp;

    @dy(field = 2381136301853487376L)
    private int WB;

    @dy(field = -2105992180661918768L)
    private int fY;

    @dy(field = 2405099484224691912L)
    private String jw;

    @dy(field = 3457804499919213795L)
    private String mb;

    static {
        iy.Zo(EngineNotifyService.class);
    }

    @ey(method = -492183332685176067L)
    public EngineNotifyService() {
        try {
            if (qp) {
                iy.gn(-574871026712365600L, null);
            }
        } catch (Throwable th) {
            if (k2) {
                iy.aM(th, -574871026712365600L, null);
            }
            throw th;
        }
    }

    @ey(method = -327610019592678753L)
    private void VH(int i, String str, String str2, int i2) {
        try {
            if (qp) {
                iy.J0(7806115396853041152L, this, new Integer(i), str, str2, new Integer(i2));
            }
            if (i == this.WB && str.equals(this.mb) && str2.equals(this.jw) && i2 == this.fY) {
                return;
            }
            this.WB = i;
            this.jw = str2;
            this.mb = str;
            this.fY = i2;
            long jCurrentTimeMillis = System.currentTimeMillis();
            PendingIntent pendingIntentSy = MainActivity.sy(ServiceContainer.getContext());
            NotificationCompat.Builder builder = new NotificationCompat.Builder(ServiceContainer.getContext(), "engine");
            builder.setWhen(jCurrentTimeMillis);
            builder.setSmallIcon(i);
            builder.setContentTitle(str);
            builder.setContentText(str2);
            builder.setContentIntent(pendingIntentSy);
            if (i2 > 0) {
                builder.setNumber(i2);
            }
            j6((NotificationManager) ServiceContainer.getContext().getSystemService("notification"), 10, builder.build());
        } catch (Throwable th) {
            if (k2) {
                iy.a8(th, 7806115396853041152L, this, new Integer(i), str, str2, new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -2073959913125447256L)
    private void Zo() {
        String strKD;
        int i;
        try {
            if (qp) {
                iy.gn(-1948228798653855249L, this);
            }
            if (ServiceContainer.isTrainerMode()) {
                return;
            }
            int iGW = ServiceContainer.J0().gW();
            int iSh = ServiceContainer.J0().sh();
            int iCn = ServiceContainer.J0().cn();
            int i2 = 100;
            if (iSh != 0) {
                i2 = (iCn * 100) / iSh;
            }
            int i3 = (i2 / 10) * 10;
            boolean zVJ = ServiceContainer.J0().vJ();
            String strKD2 = "";
            if (ServiceContainer.Zo().tp()) {
                strKD = ServiceContainer.Zo().v5();
                i = R.drawable.stat_sys_download;
            } else if (iGW == 0) {
                strKD = ServiceContainer.KD(u.view_no_errors, new Object[0]);
                i = R$drawable.project_no_errors_stat;
            } else {
                if (iGW == 1) {
                    strKD = ServiceContainer.KD(u.view_one_error, new Object[0]);
                } else {
                    strKD = ServiceContainer.KD(u.view_errors, iGW + "");
                }
                i = R$drawable.project_errors_stat;
            }
            if (!zVJ || (iSh <= 10 && !ServiceContainer.Zo().tp())) {
                String currentAppHome = ServiceContainer.getProjectService().getCurrentAppHome();
                if (currentAppHome != null) {
                    strKD2 = ServiceContainer.KD(u.view_project, FileSystem.getName(currentAppHome));
                }
            } else {
                strKD2 = ServiceContainer.KD(u.view_percentage_done, i3 + "");
            }
            VH(i, strKD, strKD2, iGW);
        } catch (Throwable th) {
            if (k2) {
                iy.aM(th, -1948228798653855249L, this);
            }
            throw th;
        }
    }

    private static /* synthetic */ void j6(NotificationManager notificationManager, int i, Notification notification) {
        notificationManager.notify(i, notification);
        iy.gW(notificationManager, i, notification);
    }

    @Override // com.aide.ui.services.ErrorService.ErrorListener
    @ey(method = 5054797200506243505L)
    public void DW() {
        try {
            if (qp) {
                iy.gn(-841060016110968024L, this);
            }
            Zo();
        } catch (Throwable th) {
            if (k2) {
                iy.aM(th, -841060016110968024L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.build.BuildService.BuildListener
    @ey(method = 2522950777213215531L)
    public void FH() {
        try {
            if (qp) {
                iy.gn(-1744050092884320240L, this);
            }
            Zo();
        } catch (Throwable th) {
            if (k2) {
                iy.aM(th, -1744050092884320240L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.services.ErrorService.ErrorListener
    @ey(method = -2921987676850460393L)
    public void Hw(String str) {
        try {
            if (qp) {
                iy.tp(-3758895611660856900L, this, str);
            }
            Zo();
        } catch (Throwable th) {
            if (k2) {
                iy.j3(th, -3758895611660856900L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -24560686602977041L)
    public void gn() {
        try {
            if (qp) {
                iy.gn(-2457709077305374692L, this);
            }
            ((NotificationManager) ServiceContainer.getContext().getSystemService("notification")).cancel(10);
        } catch (Throwable th) {
            if (k2) {
                iy.aM(th, -2457709077305374692L, this);
            }
            throw th;
        }
    }

    @ey(method = -2580042322398559095L)
    public void v5() {
        try {
            if (qp) {
                iy.gn(1335255989958811280L, this);
            }
            ServiceContainer.J0().u7(this);
            ServiceContainer.Zo().FH(this);
        } catch (Throwable th) {
            if (k2) {
                iy.aM(th, 1335255989958811280L, this);
            }
            throw th;
        }
    }
}
