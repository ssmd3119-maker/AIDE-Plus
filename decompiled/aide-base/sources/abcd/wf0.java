package abcd;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class wf0 {
    public static final wf0 FH = DW();
    private volatile c<File> DW;
    private volatile c<File> j6;

    class a implements PrivilegedAction<String> {
        public a(wf0 wf0Var) {
        }

        @Override // java.security.PrivilegedAction
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public String run() {
            return System.getProperty("user.home");
        }
    }

    class b extends Thread {
        private final /* synthetic */ Process WB;
        private final /* synthetic */ AtomicBoolean jw;
        private final /* synthetic */ boolean mb;

        public b(Process process, boolean z, AtomicBoolean atomicBoolean) {
            this.WB = process;
            this.mb = z;
            this.jw = atomicBoolean;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws IOException {
            InputStream errorStream = this.WB.getErrorStream();
            try {
                if (this.mb) {
                    while (true) {
                        int i = errorStream.read();
                        if (i == -1) {
                            break;
                        } else {
                            System.err.print((char) i);
                        }
                    }
                } else {
                    while (errorStream.read() != -1) {
                    }
                }
            } catch (IOException e) {
                if (this.mb) {
                    e.printStackTrace(System.err);
                }
                this.jw.set(true);
            }
            try {
                errorStream.close();
            } catch (IOException e2) {
                if (this.mb) {
                    e2.printStackTrace(System.err);
                }
                this.jw.set(true);
            }
        }
    }

    private static class c<V> {
        final V j6;

        public c(V v) {
            this.j6 = v;
        }
    }

    public static wf0 DW() {
        return FH(null);
    }

    public static wf0 FH(Boolean bool) {
        if (!ag0.QX()) {
            return zf0.XL() ? new zf0() : new yf0();
        }
        if (bool == null) {
            bool = Boolean.valueOf(bg0.XL());
        }
        return bool.booleanValue() ? new bg0() : new ag0();
    }

    public static String Zo(File file, String[] strArr, String str) throws InterruptedException, IOException {
        boolean z = Boolean.parseBoolean(og0.FH().Hw("jgit.fs.debug"));
        if (z) {
            try {
                System.err.println("readpipe " + Arrays.asList(strArr) + "," + file);
            } catch (IOException e) {
                if (z) {
                    System.err.println(e);
                }
            }
        }
        Process processExec = Runtime.getRuntime().exec(strArr, (String[]) null, file);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream(), str));
        processExec.getOutputStream().close();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        b bVar = new b(processExec, z, atomicBoolean);
        bVar.start();
        try {
            String line = bufferedReader.readLine();
            if (z) {
                System.err.println("readpipe may return '" + line + "'");
                System.err.println("(ignoring remaing output:");
            }
            while (true) {
                String line2 = bufferedReader.readLine();
                if (line2 == null) {
                    break;
                }
                if (z) {
                    System.err.println(line2);
                }
            }
            while (true) {
                try {
                    int iWaitFor = processExec.waitFor();
                    bVar.join();
                    if (iWaitFor == 0 && line != null && line.length() > 0 && !atomicBoolean.get()) {
                        return line;
                    }
                    if (!z) {
                        break;
                    }
                    System.err.println("readpipe rc=" + iWaitFor);
                    break;
                } catch (InterruptedException unused) {
                }
            }
            if (z) {
                System.err.println("readpipe returns null");
            }
            return null;
        } finally {
            processExec.getErrorStream().close();
            bufferedReader.close();
        }
    }

    public static File tp(String str, String... strArr) {
        if (str == null) {
            return null;
        }
        for (String str2 : str.split(File.pathSeparator)) {
            for (String str3 : strArr) {
                File file = new File(str2, str3);
                if (file.isFile()) {
                    return file.getAbsoluteFile();
                }
            }
        }
        return null;
    }

    public abstract boolean EQ(File file, boolean z);

    public abstract File Hw();

    public abstract boolean J0();

    public File J8() {
        c<File> cVar = this.j6;
        if (cVar == null) {
            cVar = new c<>(Ws());
            this.j6 = cVar;
        }
        return cVar.j6;
    }

    public File VH(File file, String str) {
        File file2 = new File(str);
        return file2.isAbsolute() ? file2 : new File(file, str);
    }

    public File Ws() {
        String str = (String) AccessController.doPrivileged(new a(this));
        if (str == null || str.length() == 0) {
            return null;
        }
        return new File(str).getAbsoluteFile();
    }

    public abstract boolean gn();

    public abstract boolean j6(File file);

    public abstract ProcessBuilder u7(String str, String[] strArr);

    public File v5() {
        c<File> cVar = this.DW;
        if (cVar == null) {
            String strHw = og0.FH().Hw("jgit.gitprefix");
            cVar = strHw != null ? new c<>(new File(strHw)) : new c<>(Hw());
            this.DW = cVar;
        }
        return cVar.j6;
    }

    public wf0 we(File file) {
        this.j6 = new c<>(file);
        return this;
    }
}
