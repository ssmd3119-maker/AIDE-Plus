package abcd;

import android.R;
import android.os.Handler;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class oz {
    private static long DW;
    private static boolean VH;
    private static boolean gn;
    private static final List<mz> j6 = new ArrayList();
    private static Object FH = new Object();
    private static Object Hw = new Object();
    private static Object v5 = new Object();
    private static Object Zo = new Object();

    static class a implements Runnable {
        final /* synthetic */ String WB;
        final /* synthetic */ long jw;
        final /* synthetic */ String mb;

        public a(String str, String str2, long j) {
            this.WB = str;
            this.mb = str2;
            this.jw = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            synchronized (oz.Zo) {
            }
            while (true) {
                try {
                    uz.Hw();
                    String str = uz.DW() ? this.WB : this.mb;
                    File fileWe = oz.we();
                    File fileEQ = oz.EQ();
                    long jMax = Math.max(fileEQ.exists() ? fileEQ.lastModified() : 0L, this.jw);
                    b00.j6("Probes", "Checking " + str);
                    fileWe.delete();
                    jz.DW(str, fileWe, jMax);
                    if (fileWe.exists()) {
                        synchronized (oz.Zo) {
                            z = true;
                            if (oz.VH) {
                                boolean unused = oz.gn = true;
                                fileEQ.delete();
                                fileWe.renameTo(fileEQ);
                                z = false;
                            }
                        }
                        if (z) {
                            b00.j6("Probes", "Opening new probes " + fileWe + " " + fileWe.length());
                            oz.Ws(fileWe, false);
                            fileEQ.delete();
                            fileWe.renameTo(fileEQ);
                            if (uz.DW()) {
                                zz.DW(1278935723, R.drawable.stat_sys_download_done, "probelytics test probes loaded");
                            }
                        }
                    }
                } catch (Throwable th) {
                    b00.VH("Error loading probes", th);
                }
                synchronized (oz.Zo) {
                    oz.Zo.notify();
                }
                synchronized (oz.Hw) {
                    try {
                        oz.Hw.wait(uz.DW() ? 10000L : 60000L);
                    } catch (InterruptedException e) {
                        b00.DW("Probes", "Unexpected InterruptedException", e);
                    }
                }
                synchronized (oz.v5) {
                    try {
                        oz.v5.wait(uz.DW() ? 50000L : 240000L);
                    } catch (InterruptedException e2) {
                        b00.DW("Probes", "Unexpected InterruptedException", e2);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static File EQ() {
        return new File(tz.Ws(), uz.DW() ? "dev.current.probes" : "public.current.probes");
    }

    public static void J0(boolean z, long j, String str, String str2) {
        new Handler();
        DW = j;
        synchronized (Zo) {
            new Thread(new a(str, str2, j)).start();
            if (z) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                boolean z2 = true;
                try {
                    try {
                        VH = true;
                        Zo.wait(1000L);
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        yy yyVarV5 = zy.lp().v5();
                        if (!gn && jCurrentTimeMillis2 >= 1000) {
                            z2 = false;
                        }
                        yyVarV5.j6(z2, jCurrentTimeMillis2);
                        b00.j6("Probes", "Waited for load " + zy.lp().v5().getInitialProbesLoadTime() + "ms");
                    } catch (InterruptedException e) {
                        b00.DW("Probes", "Unexpected InterruptedException", e);
                    }
                } finally {
                    VH = false;
                }
            }
            File fileEQ = EQ();
            File fileTp = tp();
            if (fileEQ.exists() && fileEQ.lastModified() > j) {
                b00.j6("Probes", "Opening downloaded probes " + fileEQ);
                Ws(fileEQ, z);
            } else if (fileTp != null) {
                b00.j6("Probes", "Opening built-in probes " + fileTp.getName());
                Ws(fileTp, z);
            } else {
                b00.j6("Probes", "Opening no probes");
                Ws(null, z);
            }
        }
    }

    public static boolean J8(String str) {
        synchronized (FH) {
            Iterator<mz> it = j6.iterator();
            while (it.hasNext()) {
                if (it.next().FH().equals(str)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void QX(mz mzVar, long j, Throwable th) {
        kz.Zo(mzVar, j, th);
        if (uz.DW()) {
            if (th instanceof InvocationTargetException) {
                th = th.getCause();
            }
            zz.DW(mzVar.FH().hashCode() + 346546, R.drawable.stat_notify_error, "probelytics probes event error: " + mzVar.FH() + ": " + th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Ws(File file, boolean z) {
        try {
            u7(qz.FH(file), new ArrayList(), z);
        } catch (Throwable th) {
            b00.VH("Probe loading", th);
        }
    }

    public static void XL() {
        synchronized (v5) {
            v5.notifyAll();
        }
    }

    private static File tp() throws IOException {
        File file;
        try {
            file = new File(tz.Ws(), uz.DW() ? "dev.builtin.probes" : "public.builtin.probes");
        } catch (IOException unused) {
        }
        if (file.exists() && file.lastModified() == DW) {
            return file;
        }
        file.delete();
        InputStream resourceAsStream = iy.DW().getClassLoader().getResourceAsStream(uz.DW() ? "dev.probes" : "public.probes");
        if (resourceAsStream == null) {
            return null;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[16000];
        while (true) {
            int i = resourceAsStream.read(bArr);
            if (i == -1) {
                break;
            }
            fileOutputStream.write(bArr, 0, i);
        }
        fileOutputStream.close();
        if (file.exists()) {
            file.setLastModified(DW);
            return file;
        }
        return null;
    }

    private static void u7(List<mz> list, List<String> list2, boolean z) {
        long jMax;
        synchronized (FH) {
            b00.j6("Probes", "Opening probes " + list.size());
            zy.lp().hz(list2);
            Iterator<mz> it = j6.iterator();
            while (it.hasNext()) {
                py.v5(it.next().DW());
            }
            j6.clear();
            long jLg = (!z || by.j6().aM()) ? by.j6().lg() : 0L;
            long jFH = py.FH();
            if (!z) {
                py.DW();
            }
            for (mz mzVar : list) {
                j6.add(mzVar);
                if (!tz.aM(mzVar)) {
                    if (z) {
                        jMax = jLg;
                    } else {
                        Iterator<my> it2 = mzVar.DW().iterator();
                        jMax = jLg;
                        while (it2.hasNext()) {
                            jMax = Math.max(py.VH(it2.next(), jFH, jLg), jMax);
                        }
                    }
                    tz.Hw(mzVar);
                    kz.v5(mzVar, jFH, jMax);
                }
            }
            Iterator<mz> it3 = list.iterator();
            while (it3.hasNext()) {
                Iterator<my> it4 = it3.next().DW().iterator();
                while (it4.hasNext()) {
                    py.j6(it4.next());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static File we() {
        return new File(tz.Ws(), uz.DW() ? "dev.download.probes" : "public.download.probes");
    }
}
