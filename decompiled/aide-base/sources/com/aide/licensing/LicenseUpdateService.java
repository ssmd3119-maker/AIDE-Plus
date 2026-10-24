package com.aide.licensing;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.j8;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

@cy(clazz = 221629680785965347L, container = 221629680785965347L, user = true)
/* loaded from: classes.dex */
public class LicenseUpdateService extends Service {

    @gy
    private static /* synthetic */ boolean jw;

    @fy
    private static /* synthetic */ boolean mb;

    @dy(field = -1949494959873280733L)
    private a WB;

    static {
        iy.Zo(LicenseUpdateService.class);
    }

    @ey(method = 2099393973383801472L)
    public LicenseUpdateService() {
        try {
            if (mb) {
                iy.gn(-1577699399604077049L, null);
            }
        } catch (Throwable th) {
            if (jw) {
                iy.aM(th, -1577699399604077049L, null);
            }
            throw th;
        }
    }

    @Override // android.app.Service
    @ey(method = -254184338452659604L)
    public IBinder onBind(Intent intent) {
        try {
            iy.VH(this, 1615898270903L, "androidRelease", "fe5d2222", true, false, "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/dev/current.probes", "https://probes.probelytics.com/project/iF0snISTR5Ko3hbTUY88bg/audience/public/current.probes", "https://ingest.probelytics.com/api/report/v1alpha1/data/project/iF0snISTR5Ko3hbTUY88bg");
            if (!mb) {
                return null;
            }
            iy.tp(1231784234591097528L, this, intent);
            return null;
        } catch (Throwable th) {
            if (jw) {
                iy.j3(th, 1231784234591097528L, this, intent);
            }
            throw th;
        }
    }

    @Override // android.app.Service
    @ey(method = 3620863152391556043L)
    public void onDestroy() {
        try {
            if (mb) {
                iy.gn(981325962915423853L, this);
            }
            j8.j6("License Update service: onDestroy");
            this.WB.QX();
            this.WB = null;
        } catch (Throwable th) {
            if (jw) {
                iy.aM(th, 981325962915423853L, this);
            }
            throw th;
        }
    }

    @Override // android.app.Service
    @ey(method = 2065482233730437144L)
    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            if (mb) {
                iy.we(-592375986889337440L, this, intent, new Integer(i), new Integer(i2));
            }
            j8.j6("License Update service: onStartCommand");
            a aVar = new a();
            this.WB = aVar;
            aVar.EQ(this, true);
            this.WB.Ws();
            return 1;
        } catch (Throwable th) {
            if (jw) {
                iy.U2(th, -592375986889337440L, this, intent, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }
}
