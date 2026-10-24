package com.aide.ui;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.app.ActivityManager;
import android.os.Process;
import androidx.multidex.MultiDexApplication;
import com.aide.ui.marketing.b;
import java.util.Iterator;

@cy(clazz = 1065319494111370971L, container = 1065319494111370971L, user = true)
/* loaded from: classes.dex */
public class AIDEApplication extends MultiDexApplication {

    @fy
    private static /* synthetic */ boolean WB;

    @gy
    private static /* synthetic */ boolean mb;

    static {
        iy.Zo(AIDEApplication.class);
    }

    @ey(method = -121640325556619400L)
    public AIDEApplication() {
        try {
            if (WB) {
                iy.gn(-5416299027244692041L, null);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, -5416299027244692041L, null);
            }
            throw th;
        }
    }

    @ey(method = 912515893424268100L)
    private boolean DW() {
        try {
            if (WB) {
                iy.gn(-3468928647262445676L, this);
            }
            int iMyPid = Process.myPid();
            Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) getSystemService("activity")).getRunningAppProcesses().iterator();
            while (it.hasNext()) {
                if (it.next().pid == iMyPid) {
                    return !r4.processName.contains(":");
                }
            }
            return true;
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, -3468928647262445676L, this);
            }
            throw th;
        }
    }

    @ey(method = -3049527737687236309L)
    private void j6() {
        try {
            if (WB) {
                iy.gn(-2913545304546855693L, this);
            }
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, -2913545304546855693L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Application
    @ey(method = -1658610373383307725L)
    public void onCreate() {
        try {
            iy.VH(this, 1615898270903L, "androidRelease", "fe5d2222", true, false, "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/dev/current.probes", "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/public/current.probes", "https://ingest.probelytics.com/api/report/v1alpha1/data/project/iF0snISTR5Ko3hbTUY88bg");
            if (WB) {
                iy.gn(-1010737715683701269L, this);
            }
            super.onCreate();
            j6();
            ServiceContainer.lp(getPackageName());
            if (DW()) {
                if (ServiceContainer.P8.equals("com.aide.ui")) {
                    b.j6(this, 43453, 2131165304, "New version of AIDE installed", "Check out what's new!", MainActivity.Mz(this));
                } else if (ServiceContainer.P8.equals("com.aide.web")) {
                    b.j6(this, 43453, R$drawable.ic_launcher_web, "New version of AIDE Web installed", "Check out what's new!", MainActivity.Mz(this));
                }
            }
        } catch (Throwable th) {
            if (mb) {
                iy.aM(th, -1010737715683701269L, this);
            }
            throw th;
        }
    }
}
