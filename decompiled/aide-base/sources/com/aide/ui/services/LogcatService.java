package com.aide.ui.services;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.yf;
import android.app.ActivityManager;
import android.os.Build;
import com.aide.ui.ServiceContainer;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.List;

@cy(clazz = 5827383158220726803L, container = 5827383158220726803L, user = true)
/* loaded from: classes.dex */
public class LogcatService {

    @fy
    private static /* synthetic */ boolean EQ;

    @dy(field = -2244109930861963735L)
    private static yf<String> tp;

    @gy
    private static /* synthetic */ boolean we;

    @dy(field = 1185798508364642445L)
    private List<ActivityManager.RunningAppProcessInfo> DW;

    @dy(field = -3834852977415501340L)
    private long FH;

    @dy(field = 11200796840259975L)
    private Object Hw;

    @dy(field = -5810255028322359264L)
    private boolean VH;

    @dy(field = -2453399865829291125L)
    protected Process Zo;

    @dy(field = -5468323856734040405L)
    private boolean gn;

    @dy(field = -3847956905516000544L)
    private LogcatListener j6;

    @dy(field = 1966151969625646851L)
    private boolean u7;

    @dy(field = -3306528046854625005L)
    private boolean v5;

    @cy(clazz = 4101994665220528625L, container = 4101994665220528625L, user = true)
    public interface LogcatListener {
        @ey(method = 2667757643671793427L)
        void j6(b bVar);
    }

    @cy(clazz = -33568508796781632L, container = 5827383158220726803L, user = true)
    class a implements Runnable {

        @gy
        private static /* synthetic */ boolean jw;

        @fy
        private static /* synthetic */ boolean mb;

        static {
            iy.Zo(a.class);
        }

        @ey(method = 60234872770713163L)
        public a() {
        }

        @Override // java.lang.Runnable
        @ey(method = -2268433727670628820L)
        public void run() {
            try {
                if (mb) {
                    iy.gn(-6601447001292854932L, this);
                }
                for (int i = 0; i < LogcatService.tp.Zo(); i++) {
                    LogcatService.Ws((String) LogcatService.tp.FH(i));
                }
                LogcatService.tp.DW();
                try {
                    LogcatService.this.Zo = LogcatService.this.u7("logcat -v threadtime");
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(LogcatService.this.Zo.getInputStream()), 20);
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            return;
                        }
                        synchronized (LogcatService.this.Hw) {
                            while (LogcatService.this.v5) {
                                try {
                                    LogcatService.this.Hw.wait(1000L);
                                } catch (InterruptedException unused) {
                                }
                            }
                        }
                        LogcatService.this.J8(line);
                    }
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                if (jw) {
                    iy.aM(th, -6601447001292854932L, this);
                }
                throw th;
            }
        }
    }

    @cy(clazz = -5476579603494541425L, container = -5476579603494541425L, user = true)
    public static class b {

        @gy
        private static /* synthetic */ boolean EQ;

        @fy
        private static /* synthetic */ boolean tp;

        @dy(field = -2404171730427034420L)
        public int DW;

        @dy(field = -2405608057157225940L)
        public int FH;

        @dy(field = -1928600926635933253L)
        public String Hw;

        @dy(field = 421647949192035412L)
        public String VH;

        @dy(field = -2622529409293989045L)
        public String Zo;

        @dy(field = -456140509760876928L)
        private int gn;

        @dy(field = 848736893472589500L)
        public String j6;

        @dy(field = -2755871502836362249L)
        private int u7;

        @dy(field = -2403906558170848705L)
        public String v5;

        static {
            iy.Zo(b.class);
        }

        @ey(method = 659696339451925152L)
        public b(String str, int i, int i2, String str2, String str3, String str4, String str5) {
            try {
                if (tp) {
                    iy.QX(-916506451485677963L, null, new Object[]{str, new Integer(i), new Integer(i2), str2, str3, str4, str5});
                }
                this.j6 = str;
                this.DW = i;
                this.FH = i2;
                this.Hw = str2;
                this.v5 = str3;
                this.Zo = str4;
                this.VH = str5;
            } catch (Throwable th) {
                if (EQ) {
                    iy.rN(th, -916506451485677963L, null, new Object[]{str, new Integer(i), new Integer(i2), str2, str3, str4, str5});
                }
                throw th;
            }
        }

        @ey(method = 173291279289525280L)
        public boolean DW(int i) {
            try {
                if (tp) {
                    iy.u7(9949744801380109L, this, i);
                }
                if (i >= this.gn) {
                    if (i <= this.u7) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                if (EQ) {
                    iy.j3(th, 9949744801380109L, this, new Integer(i));
                }
                throw th;
            }
        }

        @ey(method = -2820290151855235920L)
        public boolean FH() {
            try {
                if (tp) {
                    iy.gn(2878535152080193725L, this);
                }
                return "E".equals(this.Hw);
            } catch (Throwable th) {
                if (EQ) {
                    iy.aM(th, 2878535152080193725L, this);
                }
                throw th;
            }
        }

        @ey(method = -56577595582502280L)
        public boolean Hw(String str) {
            try {
                if (tp) {
                    iy.tp(4235370577166563037L, this, str);
                }
                if (!this.Zo.equals(str)) {
                    if (this.Zo.startsWith(str)) {
                        if (this.Zo.charAt(str.length()) == ':') {
                        }
                    }
                    return false;
                }
                return true;
            } catch (Throwable th) {
                if (EQ) {
                    iy.j3(th, 4235370577166563037L, this, str);
                }
                throw th;
            }
        }

        @ey(method = -1626560870916452565L)
        public boolean Zo() {
            try {
                if (tp) {
                    iy.gn(-225884827926077748L, this);
                }
                return "W".equals(this.Hw);
            } catch (Throwable th) {
                if (EQ) {
                    iy.aM(th, -225884827926077748L, this);
                }
                throw th;
            }
        }

        @ey(method = 2066800797386222712L)
        public CharSequence j6() {
            try {
                if (tp) {
                    iy.gn(-3252660072877600797L, this);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.j6);
                sb.append(" ");
                sb.append(this.DW);
                sb.append(" ");
                sb.append(this.FH);
                sb.append(" ");
                sb.append(this.Hw);
                sb.append(" ");
                while (sb.length() < 35) {
                    sb.append(" ");
                }
                this.gn = sb.length();
                sb.append(this.v5);
                sb.append(" ");
                sb.append(this.Zo);
                this.u7 = sb.length();
                sb.append("     ");
                while (sb.length() < 80) {
                    sb.append(" ");
                }
                sb.append(this.VH);
                return sb;
            } catch (Throwable th) {
                if (EQ) {
                    iy.aM(th, -3252660072877600797L, this);
                }
                throw th;
            }
        }

        @ey(method = -1787452893740224672L)
        public boolean v5() {
            try {
                if (tp) {
                    iy.gn(-1332897614417259471L, this);
                }
                return "I".equals(this.Hw);
            } catch (Throwable th) {
                if (EQ) {
                    iy.aM(th, -1332897614417259471L, this);
                }
                throw th;
            }
        }
    }

    static {
        try {
            iy.Zo(LogcatService.class);
            if (EQ) {
                iy.gn(2035765975397142664L, null);
            }
            tp = new yf<>(1000);
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 2035765975397142664L, null);
            }
            throw th;
        }
    }

    @ey(method = -369182063859855885L)
    public LogcatService() {
        try {
            if (EQ) {
                iy.gn(2538405879814266651L, null);
            }
            this.Hw = new Object();
            this.v5 = false;
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 2538405879814266651L, null);
            }
            throw th;
        }
    }

    @ey(method = 2555501780006587687L)
    private int J0(String str, int i) {
        try {
            if (EQ) {
                iy.EQ(1568566303419111696L, this, str, new Integer(i));
            }
            while (i < str.length() && str.charAt(i) == ' ') {
                i++;
            }
            while (i < str.length() && str.charAt(i) != ' ') {
                i++;
            }
            if (i >= str.length()) {
                return -1;
            }
            return i;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -2418176190170086720L)
    public void J8(String str) {
        try {
            if (EQ) {
                iy.tp(4029791327465206743L, this, str);
            }
            b bVarXL = XL(str);
            if (bVarXL != null) {
                this.gn = true;
                if (this.j6 != null) {
                    this.j6.j6(bVarXL);
                }
            }
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, 4029791327465206743L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -6858052508855145749L)
    private void QX(String str) {
        b bVarXL;
        try {
            if (EQ) {
                iy.tp(-5908318332914564928L, this, str);
            }
            if (Zo() || (bVarXL = XL(str)) == null || this.j6 == null) {
                return;
            }
            this.j6.j6(bVarXL);
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -5908318332914564928L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 526750315029411335L)
    private static boolean VH() {
        try {
            if (EQ) {
                iy.gn(-1907953341876552740L, null);
            }
            if (Build.VERSION.SDK_INT < 16) {
                return true;
            }
            return ServiceContainer.getContext().getPackageManager().checkPermission("android.permission.READ_LOGS", ServiceContainer.getContext().getPackageName()) == 0;
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -1907953341876552740L, null);
            }
            throw th;
        }
    }

    @ey(method = 2929553453755925823L)
    public static void Ws(String str) {
        try {
            if (EQ) {
                iy.tp(2972534690733552384L, null, str);
            }
            if (ServiceContainer.vJ()) {
                tp.j6(str);
            } else {
                ServiceContainer.lg().QX(str);
            }
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, 2972534690733552384L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -669640562146992800L)
    private b XL(String str) {
        int iJ0;
        try {
            if (EQ) {
                iy.tp(1687160379743615833L, this, str);
            }
            try {
                int iJ02 = J0(str, 0);
                if (iJ02 <= 0 || (iJ0 = J0(str, iJ02 + 1)) <= 0) {
                    return null;
                }
                String strTrim = str.substring(0, iJ0).trim();
                int i = iJ0 + 1;
                int iJ03 = J0(str, i);
                if (iJ03 <= 0) {
                    return null;
                }
                int i2 = Integer.parseInt(str.substring(i, iJ03).trim());
                int i3 = iJ03 + 1;
                int iJ04 = J0(str, i3);
                if (iJ04 <= 0) {
                    return null;
                }
                int i4 = Integer.parseInt(str.substring(i3, iJ04).trim());
                int i5 = iJ04 + 1;
                int iJ05 = J0(str, i5);
                if (iJ05 <= 0) {
                    return null;
                }
                String strTrim2 = str.substring(i5, iJ05).trim();
                int i6 = iJ05 + 1;
                int iIndexOf = str.indexOf(58, i6);
                if (iIndexOf > 0) {
                    return new b(strTrim, i2, i4, strTrim2, str.substring(i6, iIndexOf).trim(), tp(i2, false), str.substring(iIndexOf + 1, str.length()).trim());
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, 1687160379743615833L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -5676385917625624245L)
    private String tp(int i, boolean z) {
        try {
            if (EQ) {
                iy.EQ(3058159976950399040L, this, new Integer(i), new Boolean(z));
            }
            if (this.DW == null || (z && System.currentTimeMillis() - this.FH > 1000)) {
                this.DW = ((ActivityManager) ServiceContainer.getContext().getSystemService("activity")).getRunningAppProcesses();
                this.FH = System.currentTimeMillis();
            }
            for (int i2 = 0; i2 < this.DW.size(); i2++) {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = this.DW.get(i2);
                if (runningAppProcessInfo.pid == i) {
                    return runningAppProcessInfo.processName;
                }
            }
            return !z ? tp(i, true) : "";
        } catch (Throwable th) {
            if (we) {
                iy.Mr(th, 3058159976950399040L, this, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ey(method = -4160842422009100824L)
    public Process u7(String str) {
        try {
            if (EQ) {
                iy.tp(-463693879722909825L, this, str);
            }
            if (EQ()) {
                return Runtime.getRuntime().exec(str);
            }
            Process processExec = Runtime.getRuntime().exec("su");
            PrintStream printStream = null;
            try {
                PrintStream printStream2 = new PrintStream(new BufferedOutputStream(processExec.getOutputStream(), 8192));
                try {
                    printStream2.println(str);
                    printStream2.flush();
                    printStream2.close();
                    return processExec;
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
            if (we) {
                iy.j3(th3, -463693879722909825L, this, str);
            }
            throw th3;
        }
    }

    @ey(method = -2233580319169481925L)
    public boolean EQ() {
        try {
            if (EQ) {
                iy.gn(6006243227602003360L, this);
            }
            return this.VH;
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 6006243227602003360L, this);
            }
            throw th;
        }
    }

    @ey(method = 4108724509255986240L)
    public void Mr() {
        try {
            if (EQ) {
                iy.gn(4953981501149514955L, this);
            }
            if (this.u7) {
                return;
            }
            this.u7 = true;
            new Thread(new a()).start();
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, 4953981501149514955L, this);
            }
            throw th;
        }
    }

    @ey(method = -5179537260810135776L)
    public boolean Zo() {
        try {
            if (EQ) {
                iy.gn(-6172605605127542693L, this);
            }
            if (!EQ()) {
                if (!this.gn) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -6172605605127542693L, this);
            }
            throw th;
        }
    }

    @ey(method = 3288449568471805024L)
    public void aM(LogcatListener logcatListener) {
        try {
            if (EQ) {
                iy.tp(29465742653545461L, this, logcatListener);
            }
            this.j6 = logcatListener;
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, 29465742653545461L, this, logcatListener);
            }
            throw th;
        }
    }

    @ey(method = 976669609519530624L)
    public void gn(boolean z) {
        try {
            if (EQ) {
                iy.Ws(2445964835656656239L, this, z);
            }
            synchronized (this.Hw) {
                boolean z2 = !z;
                if (this.v5 != z2) {
                    this.v5 = z2;
                    this.Hw.notify();
                }
            }
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, 2445964835656656239L, this, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -2371691069369827235L)
    public void j3() {
        try {
            if (EQ) {
                iy.gn(-3154680247799968548L, this);
            }
            if (this.Zo != null) {
                this.Zo.destroy();
                this.Zo = null;
            }
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -3154680247799968548L, this);
            }
            throw th;
        }
    }

    @ey(method = 2453087085830258955L)
    public void we() {
        try {
            if (EQ) {
                iy.gn(-591183211369941064L, this);
            }
            this.VH = VH();
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -591183211369941064L, this);
            }
            throw th;
        }
    }
}
