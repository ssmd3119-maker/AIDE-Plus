package com.aide.ui.services;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import com.aide.common.AppLog;
import com.aide.common.MessageBox;
import com.aide.ui.AppPreferences;
import com.aide.ui.ServiceContainer;
import com.aide.ui.firebase.FireBaseLogEvent;
import com.aide.ui.util.FileSystem;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;

@cy(clazz = -843596403928054707L, container = -843596403928054707L, user = true)
/* loaded from: classes.dex */
public class RunService {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = 3542630941687810280L)
    private boolean DW;

    @dy(field = 996150106863176160L)
    private boolean j6;

    @cy(clazz = -460190134519338760L, container = -843596403928054707L, user = true)
    class a implements Runnable {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = -3259206094387684257L)
        final /* synthetic */ String WB;

        @dy(field = -3297573100124803584L)
        final /* synthetic */ String mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -314592426811848900L)
        public a(String str, String str2) {
            this.WB = str;
            this.mb = str2;
        }

        @Override // java.lang.Runnable
        @ey(method = -1723852633842113048L)
        public void run() {
            try {
                if (fY) {
                    iy.gn(5539637517480330075L, this);
                }
                RunService.this.gn(this.WB, this.mb);
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, 5539637517480330075L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -460223381561057127L, container = -843596403928054707L, user = true)
    class b implements Runnable {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -2896837134762753897L)
        final /* synthetic */ String WB;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 4591980587609394672L)
        public b(String str) {
            this.WB = str;
        }

        @Override // java.lang.Runnable
        @ey(method = 2109205686535207480L)
        public void run() {
            try {
                if (jw) {
                    iy.gn(5542649861477778160L, this);
                }
                RunService.this.u7(this.WB);
            } catch (Throwable th) {
                if (fY) {
                    iy.aM(th, 5542649861477778160L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -460256628598712200L, container = -843596403928054707L, user = true)
    class c implements Runnable {

        @fy
        private static /* synthetic */ boolean fY;

        @gy
        private static /* synthetic */ boolean qp;

        @dy(field = -1403767917034444719L)
        final /* synthetic */ Runnable WB;

        @dy(field = -1341757249156847205L)
        final /* synthetic */ Runnable mb;

        @cy(clazz = 2408933586012736061L, container = -843596403928054707L, user = true)
        class a implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 153553215399289855L)
            public a() {
            }

            @Override // java.lang.Runnable
            @ey(method = 152926132909888080L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(-216868841697114696L, this);
                    }
                    if (RunService.this.j6) {
                        c.this.WB.run();
                    } else {
                        c.this.mb.run();
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, -216868841697114696L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(c.class);
        }

        @ey(method = 1291455101252034348L)
        public c(Runnable runnable, Runnable runnable2) {
            this.WB = runnable;
            this.mb = runnable2;
        }

        @Override // java.lang.Runnable
        @ey(method = 1405716372911714416L)
        public void run() {
            a aVar;
            try {
                if (fY) {
                    iy.gn(-216758816745068085L, this);
                }
                try {
                    Process processExec = Runtime.getRuntime().exec("su");
                    DataOutputStream dataOutputStream = new DataOutputStream(processExec.getOutputStream());
                    dataOutputStream.writeBytes("echo hello\n");
                    dataOutputStream.writeBytes("exit\n");
                    dataOutputStream.flush();
                    processExec.waitFor();
                    if (processExec.exitValue() == 0) {
                        RunService.this.j6 = true;
                    }
                    aVar = new a();
                } catch (Throwable unused) {
                    aVar = new a();
                }
                ServiceContainer.aj(aVar);
            } catch (Throwable th) {
                if (qp) {
                    iy.aM(th, -216758816745068085L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -460289875632303979L, container = -843596403928054707L, user = true)
    class d implements Runnable {

        @gy
        private static /* synthetic */ boolean fY;

        @fy
        private static /* synthetic */ boolean jw;

        @dy(field = -517068204803429112L)
        final /* synthetic */ String WB;

        @dy(field = 141672011852359677L)
        final /* synthetic */ String mb;

        @cy(clazz = 2409309569045961720L, container = -843596403928054707L, user = true)
        class a implements Runnable {

            @fy
            private static /* synthetic */ boolean WB;

            @gy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(a.class);
            }

            @ey(method = 17045009708893045L)
            public a(d dVar) {
            }

            @Override // java.lang.Runnable
            @ey(method = 2529983431785392721L)
            public void run() {
                try {
                    if (WB) {
                        iy.gn(-27091881510498000L, this);
                    }
                    MessageBox.BT(ServiceContainer.getMainActivity(), "Run Problem", "The app was not installed.");
                } catch (Throwable th) {
                    if (mb) {
                        iy.aM(th, -27091881510498000L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 2409420847570379185L, container = -843596403928054707L, user = true)
        class b implements Runnable {

            @fy
            private static /* synthetic */ boolean WB;

            @gy
            private static /* synthetic */ boolean mb;

            static {
                iy.Zo(b.class);
            }

            @ey(method = 110212427498762700L)
            public b(d dVar) {
            }

            @Override // java.lang.Runnable
            @ey(method = -2495274497125891932L)
            public void run() {
                try {
                    if (WB) {
                        iy.gn(-27466019293698445L, this);
                    }
                    MessageBox.BT(ServiceContainer.getMainActivity(), "Run Problem", "The App has been installed successfully but no launch intent was found in the manifest.");
                } catch (Throwable th) {
                    if (mb) {
                        iy.aM(th, -27466019293698445L, this);
                    }
                    throw th;
                }
            }
        }

        @cy(clazz = 2409532126098859944L, container = -843596403928054707L, user = true)
        class c implements Runnable {

            @gy
            private static /* synthetic */ boolean jw;

            @fy
            private static /* synthetic */ boolean mb;

            @dy(field = 479286246111210228L)
            final /* synthetic */ String WB;

            static {
                iy.Zo(c.class);
            }

            @ey(method = -95908799889038976L)
            public c(d dVar, String str) {
                this.WB = str;
            }

            @Override // java.lang.Runnable
            @ey(method = -1102319712666519960L)
            public void run() {
                try {
                    if (mb) {
                        iy.gn(-27839672884073800L, this);
                    }
                    MessageBox.BT(ServiceContainer.getMainActivity(), "Run Error", "Could not run the App directly as root. Consider disabling direct running in the settings.\n\n" + this.WB);
                } catch (Throwable th) {
                    if (jw) {
                        iy.aM(th, -27839672884073800L, this);
                    }
                    throw th;
                }
            }
        }

        static {
            iy.Zo(d.class);
        }

        @ey(method = -732980322727909531L)
        public d(RunService runService, String str, String str2) {
            this.WB = str;
            this.mb = str2;
        }

        @ey(method = -296986860053202048L)
        private void DW(String str) {
            try {
                if (jw) {
                    iy.tp(-433917874229451437L, this, str);
                }
                ServiceContainer.aj(new c(this, str));
            } catch (Throwable th) {
                if (fY) {
                    iy.j3(th, -433917874229451437L, this, str);
                }
                throw th;
            }
        }

        private static /* synthetic */ void j6(Object obj, Intent intent) {
            ((Context) obj).startActivity(intent);
            iy.BT(obj, intent);
        }

        @Override // java.lang.Runnable
        @ey(method = -816617430519500485L)
        public void run() {
            try {
                if (jw) {
                    iy.gn(-26717259534472465L, this);
                }
                try {
                    String str = "pm install -r \"" + this.WB + '\"';
                    Process processExec = Runtime.getRuntime().exec("su");
                    PrintStream printStream = null;
                    PackageInfo packageInfo = null;
                    try {
                        PrintStream printStream2 = new PrintStream(new BufferedOutputStream(processExec.getOutputStream(), 8192));
                        try {
                            printStream2.println(str);
                            printStream2.flush();
                            printStream2.close();
                            int iWaitFor = processExec.waitFor();
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getErrorStream()), 20);
                            StringBuffer stringBuffer = new StringBuffer();
                            while (true) {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                stringBuffer.append(line);
                                stringBuffer.append("\n");
                                AppLog.DW("pm: " + line);
                            }
                            stringBuffer.append("exited with " + iWaitFor);
                            AppLog.DW("pm: exited with " + iWaitFor);
                            String strTrim = stringBuffer.toString().trim();
                            if (iWaitFor == 0 && !strTrim.contains("Failure")) {
                                PackageManager packageManager = ServiceContainer.getContext().getPackageManager();
                                try {
                                    packageInfo = packageManager.getPackageInfo(this.mb, 64);
                                } catch (PackageManager.NameNotFoundException unused) {
                                }
                                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(this.mb);
                                if (launchIntentForPackage != null) {
                                    j6(ServiceContainer.getContext(), launchIntentForPackage);
                                    return;
                                } else if (packageInfo == null) {
                                    ServiceContainer.aj(new a(this));
                                    return;
                                } else {
                                    ServiceContainer.aj(new b(this));
                                    return;
                                }
                            }
                            DW(strTrim);
                        } catch (Throwable th) {
                            th = th;
                            printStream = printStream2;
                            if (printStream != null) {
                                printStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    AppLog.v5(th3);
                    DW(th3.getMessage());
                }
            } catch (Throwable th4) {
                if (fY) {
                    iy.aM(th4, -26717259534472465L, this);
                }
                throw th4;
            }
        }
    }

    static {
        iy.Zo(RunService.class);
    }

    @ey(method = 2884081739633296539L)
    public RunService() {
        try {
            if (FH) {
                iy.gn(-2673701869623466392L, null);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -2673701869623466392L, null);
            }
            throw th;
        }
    }

    @ey(method = 50355060517135400L)
    private void Zo(boolean z, Runnable runnable, Runnable runnable2) {
        try {
            if (FH) {
                iy.we(3154158015646723140L, this, new Boolean(z), runnable, runnable2);
            }
            if (!z) {
                runnable2.run();
                return;
            }
            if (!this.DW) {
                this.DW = true;
                new Thread(new c(runnable, runnable2)).start();
            } else if (this.j6) {
                runnable.run();
            } else {
                runnable2.run();
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 3154158015646723140L, this, new Boolean(z), runnable, runnable2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 489121587868889915L)
    public void gn(String str, String str2) {
        try {
            if (FH) {
                iy.EQ(-5478772013821762951L, this, str, str2);
            }
            FireBaseLogEvent.tp("Run app with root");
            new Thread(new d(this, str, str2)).start();
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -5478772013821762951L, this, str, str2);
            }
            throw th;
        }
    }

    private static /* synthetic */ void j6(Object obj, Intent intent) {
        ((Context) obj).startActivity(intent);
        iy.BT(obj, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = 5317307856483046095L)
    public void u7(String str) {
        Uri uriFromFile;
        try {
            if (FH) {
                iy.tp(-5404124222150917387L, this, str);
            }
            if (!ServiceContainer.isTrainerMode() || ServiceContainer.nw().Ws()) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(268435456);
                intent.addFlags(4096);
                if (Build.VERSION.SDK_INT >= 24) {
                    uriFromFile = FileProvider.getUriForFile(ServiceContainer.getContext(), FileSystem.j3(), new File(str));
                    intent.addFlags(1);
                } else {
                    uriFromFile = Uri.fromFile(new File(str));
                }
                intent.setDataAndType(uriFromFile, "application/vnd.android.package-archive");
                List<ResolveInfo> listQueryIntentActivities = ServiceContainer.getContext().getPackageManager().queryIntentActivities(intent, 0);
                if (listQueryIntentActivities != null && listQueryIntentActivities.size() > 1) {
                    Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ActivityInfo activityInfo = it.next().activityInfo;
                        if ("com.android.packageinstaller".equals(activityInfo.applicationInfo.packageName)) {
                            intent.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
                            break;
                        }
                    }
                }
                j6(ServiceContainer.getContext(), intent);
                FireBaseLogEvent.tp("Run app without root");
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -5404124222150917387L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 523364206803610515L)
    public void VH(String str, String str2) {
        try {
            if (FH) {
                iy.EQ(-112108143730738111L, this, str, str2);
            }
            ServiceContainer.getDebugger().sh();
            Zo(ServiceContainer.getLicenseService().Ws() && AppPreferences.dx(), new a(str, str2), new b(str));
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -112108143730738111L, this, str, str2);
            }
            throw th;
        }
    }
}
