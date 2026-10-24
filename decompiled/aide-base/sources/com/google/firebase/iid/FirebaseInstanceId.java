package com.google.firebase.iid;

import abcd.bx;
import abcd.cw;
import abcd.cx;
import abcd.gw;
import abcd.hw;
import abcd.ix;
import abcd.jw;
import abcd.jx;
import abcd.lx;
import abcd.uu;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public class FirebaseInstanceId {

    @GuardedBy("FirebaseInstanceId.class")
    private static ScheduledThreadPoolExecutor EQ;
    private static zzaw tp;
    private static final long u7 = TimeUnit.HOURS.toSeconds(8);
    private final cx DW;
    private final zzan FH;
    private b Hw;

    @GuardedBy("this")
    private boolean VH;
    private final a0 Zo;
    private final a gn;
    private final Executor j6;
    private final r v5;

    /* JADX INFO: Access modifiers changed from: private */
    class a {

        @GuardedBy("this")
        private jx<bx> DW;

        @GuardedBy("this")
        private Boolean FH;
        private final boolean j6 = FH();

        a(lx lxVar) {
            Boolean boolDW = DW();
            this.FH = boolDW;
            if (boolDW == null && this.j6) {
                jx<bx> jxVar = new jx(this) { // from class: com.google.firebase.iid.o0
                    private final FirebaseInstanceId.a j6;

                    {
                        this.j6 = this;
                    }

                    @Override // abcd.jx
                    public final void j6(ix ixVar) {
                        FirebaseInstanceId.a aVar = this.j6;
                        synchronized (aVar) {
                            if (aVar.j6()) {
                                FirebaseInstanceId.this.j3();
                            }
                        }
                    }
                };
                this.DW = jxVar;
                lxVar.j6(bx.class, jxVar);
            }
        }

        private final Boolean DW() {
            ApplicationInfo applicationInfo;
            Context contextDW = FirebaseInstanceId.this.DW.DW();
            SharedPreferences sharedPreferences = contextDW.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = contextDW.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextDW.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        private final boolean FH() throws ClassNotFoundException {
            try {
                Class.forName("com.google.firebase.messaging.FirebaseMessaging");
                return true;
            } catch (ClassNotFoundException unused) {
                Context contextDW = FirebaseInstanceId.this.DW.DW();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(contextDW.getPackageName());
                ResolveInfo resolveInfoResolveService = contextDW.getPackageManager().resolveService(intent, 0);
                return (resolveInfoResolveService == null || resolveInfoResolveService.serviceInfo == null) ? false : true;
            }
        }

        final synchronized boolean j6() {
            if (this.FH != null) {
                return this.FH.booleanValue();
            }
            return this.j6 && FirebaseInstanceId.this.DW.u7();
        }
    }

    FirebaseInstanceId(cx cxVar, lx lxVar) {
        this(cxVar, new zzan(cxVar.DW()), h0.Hw(), h0.Hw(), lxVar);
    }

    public static FirebaseInstanceId DW() {
        return getInstance(cx.FH());
    }

    private final synchronized void Hw() {
        if (!this.VH) {
            u7(0L);
        }
    }

    private static x J8(String str, String str2) {
        return tp.Zo("", str, str2);
    }

    private static String U2() {
        return zzan.DW(tp.u7("").j6());
    }

    private static String aM(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase(AppMeasurement.FCM_ORIGIN) || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    @Keep
    public static synchronized FirebaseInstanceId getInstance(cx cxVar) {
        return (FirebaseInstanceId) cxVar.j6(FirebaseInstanceId.class);
    }

    private final <T> T gn(gw<T> gwVar) throws IOException {
        try {
            return (T) jw.DW(gwVar, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    er();
                }
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j3() {
        x xVarA8 = a8();
        if (!gW() || xVarA8 == null || xVarA8.Hw(this.FH.Hw()) || this.Zo.DW()) {
            Hw();
        }
    }

    static boolean rN() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
    }

    static void tp(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (EQ == null) {
                EQ = new ScheduledThreadPoolExecutor(1, new uu("FirebaseInstanceId"));
            }
            EQ.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    private final gw<com.google.firebase.iid.a> v5(final String str, final String str2) {
        final String strAM = aM(str2);
        final hw hwVar = new hw();
        this.j6.execute(new Runnable(this, str, str2, hwVar, strAM) { // from class: com.google.firebase.iid.l0
            private final FirebaseInstanceId WB;
            private final hw fY;
            private final String jw;
            private final String mb;
            private final String qp;

            {
                this.WB = this;
                this.mb = str;
                this.jw = str2;
                this.fY = hwVar;
                this.qp = strAM;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.WB.EQ(this.mb, this.jw, this.fY, this.qp);
            }
        });
        return hwVar.j6();
    }

    final void BT() throws IOException {
        gn(this.Hw.v5(U2(), x.j6(a8())));
    }

    final /* synthetic */ void EQ(final String str, String str2, final hw hwVar, final String str3) {
        final String strU2 = U2();
        x xVarJ8 = J8(str, str2);
        if (xVarJ8 != null && !xVarJ8.Hw(this.FH.Hw())) {
            hwVar.FH(new v0(strU2, xVarJ8.j6));
        } else {
            final String strJ6 = x.j6(xVarJ8);
            this.v5.DW(str, str3, new t(this, strU2, strJ6, str, str3) { // from class: com.google.firebase.iid.m0
                private final String DW;
                private final String FH;
                private final String Hw;
                private final FirebaseInstanceId j6;
                private final String v5;

                {
                    this.j6 = this;
                    this.DW = strU2;
                    this.FH = strJ6;
                    this.Hw = str;
                    this.v5 = str3;
                }

                @Override // com.google.firebase.iid.t
                public final gw j6() {
                    return this.j6.Zo(this.DW, this.FH, this.Hw, this.v5);
                }
            }).DW(this.j6, new cw(this, str, str3, hwVar, strU2) { // from class: com.google.firebase.iid.n0
                private final String DW;
                private final String FH;
                private final hw Hw;
                private final FirebaseInstanceId j6;
                private final String v5;

                {
                    this.j6 = this;
                    this.DW = str;
                    this.FH = str3;
                    this.Hw = hwVar;
                    this.v5 = strU2;
                }

                @Override // abcd.cw
                public final void DW(gw gwVar) {
                    this.j6.we(this.DW, this.FH, this.Hw, this.v5, gwVar);
                }
            });
        }
    }

    public String FH(String str, String str2) throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((com.google.firebase.iid.a) gn(v5(str, str2))).j6();
        }
        throw new IOException("MAIN_THREAD");
    }

    final synchronized void J0(boolean z) {
        this.VH = z;
    }

    final cx Mr() {
        return this.DW;
    }

    final void QX(String str) throws IOException {
        x xVarA8 = a8();
        if (xVarA8 == null || xVarA8.Hw(this.FH.Hw())) {
            throw new IOException("token not available");
        }
        gn(this.Hw.DW(U2(), xVarA8.j6, str));
    }

    final void XL(String str) throws IOException {
        x xVarA8 = a8();
        if (xVarA8 == null || xVarA8.Hw(this.FH.Hw())) {
            throw new IOException("token not available");
        }
        gn(this.Hw.j6(U2(), xVarA8.j6, str));
    }

    final /* synthetic */ gw Zo(String str, String str2, String str3, String str4) {
        return this.Hw.Hw(str, str2, str3, str4);
    }

    final x a8() {
        return J8(zzan.j6(this.DW), "*");
    }

    final synchronized void er() {
        tp.v5();
        if (this.gn.j6()) {
            Hw();
        }
    }

    final boolean gW() {
        return this.Hw.FH();
    }

    public String j6() {
        j3();
        return U2();
    }

    final String lg() {
        return FH(zzan.j6(this.DW), "*");
    }

    final synchronized void u7(long j) {
        tp(new y(this, this.FH, this.Zo, Math.min(Math.max(30L, j << 1), u7)), j);
        this.VH = true;
    }

    final void vy() {
        tp.tp("");
        Hw();
    }

    final /* synthetic */ void we(String str, String str2, hw hwVar, String str3, gw gwVar) {
        if (!gwVar.we()) {
            hwVar.DW(gwVar.VH());
            return;
        }
        String str4 = (String) gwVar.gn();
        tp.FH("", str, str2, str4, this.FH.Hw());
        hwVar.FH(new v0(str3, str4));
    }

    final boolean yS() {
        return this.Hw.Zo();
    }

    private FirebaseInstanceId(cx cxVar, zzan zzanVar, Executor executor, Executor executor2, lx lxVar) {
        this.VH = false;
        if (zzan.j6(cxVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (tp == null) {
                    tp = new zzaw(cxVar.DW());
                }
            }
            this.DW = cxVar;
            this.FH = zzanVar;
            if (this.Hw == null) {
                b bVar = (b) cxVar.j6(b.class);
                if (bVar != null && bVar.Zo()) {
                    this.Hw = bVar;
                } else {
                    this.Hw = new p0(cxVar, zzanVar, executor);
                }
            }
            this.Hw = this.Hw;
            this.j6 = executor2;
            this.Zo = new a0(tp);
            this.gn = new a(lxVar);
            this.v5 = new r(executor);
            if (this.gn.j6()) {
                j3();
                return;
            }
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }
}
