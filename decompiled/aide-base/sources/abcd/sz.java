package abcd;

import android.provider.Settings;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.UUID;

/* loaded from: classes.dex */
public class sz {
    private static volatile long DW;
    private static volatile boolean FH;
    private static volatile String Hw;
    private static volatile UUID VH;
    private static volatile long Zo;
    private static volatile a gn;
    private static volatile long j6;
    private static volatile UUID v5;
    private static final Object u7 = new Object();
    private static final vz tp = new vz(Zo(), true);
    private static final vz EQ = new vz(Zo(), false);

    public static class a {
        public final boolean DW;
        public final long FH;
        public final long Hw;
        public final String j6;

        public a(String str, boolean z, boolean z2, long j) {
            this.j6 = str;
            this.DW = z;
            this.FH = j;
            this.Hw = j - 900000;
        }
    }

    public static a DW() {
        return gn;
    }

    private static boolean EQ() {
        return DW < System.currentTimeMillis() - 60000;
    }

    public static String FH() {
        return Hw;
    }

    private static File Hw() {
        return new File(d00.FH(iy.DW()), "sessionid.txt");
    }

    public static void VH() {
        String string = Settings.Secure.getString(iy.DW().getContentResolver(), "android_id");
        synchronized (u7) {
            Hw = string;
        }
    }

    private static File Zo() {
        return new File(d00.FH(iy.DW()), "sessionid.txt.lock");
    }

    private static boolean gn() {
        return System.currentTimeMillis() < j6 + 900000;
    }

    public static String j6() {
        return gn == null ? e00.j6(e00.j6) : gn.j6;
    }

    private static void tp() {
        if (EQ()) {
            b00.j6("SessionIds", "Session ID file may be outdated.");
            try {
                synchronized (u7) {
                    EQ.j6();
                    try {
                        File fileHw = Hw();
                        long jLastModified = fileHw.lastModified();
                        if (jLastModified == 0) {
                            throw new IOException("Session file vanished");
                        }
                        DW = jLastModified;
                        if (EQ()) {
                            b00.j6("SessionIds", "Session ID file is outdated - touching");
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (!fileHw.setLastModified(jCurrentTimeMillis)) {
                                throw new IOException("Could not touch session file");
                            }
                            DW = jCurrentTimeMillis;
                        }
                    } finally {
                        EQ.DW();
                    }
                }
            } catch (IOException e) {
                b00.VH("Error touching session ID file", e);
                FH = true;
                v5 = null;
            }
        }
    }

    private static boolean u7() {
        b00.j6("SessionIds", "Loading/updating session ID from/on disk");
        File fileHw = Hw();
        boolean z = false;
        try {
            tp.j6();
        } catch (IOException e) {
            b00.VH("Error reading, creating or updating session ID file", e);
            FH = true;
            v5 = null;
        }
        try {
            long jLastModified = fileHw.lastModified();
            if (jLastModified == 0 || System.currentTimeMillis() >= jLastModified + 900000) {
                tp.DW();
                EQ.j6();
                try {
                    long jLastModified2 = fileHw.lastModified();
                    if (jLastModified2 == 0 || System.currentTimeMillis() >= 900000 + jLastModified2) {
                        b00.j6("SessionIds", "Session ID file on disk does not exist or is outdated - updating");
                        File fileCreateTempFile = File.createTempFile("tmp", "txt", fileHw.getParentFile());
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                            try {
                                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
                                try {
                                    UUID uuidRandomUUID = UUID.randomUUID();
                                    outputStreamWriter.write(uuidRandomUUID.toString());
                                    outputStreamWriter.flush();
                                    fileOutputStream.getFD().sync();
                                    outputStreamWriter.close();
                                    fileOutputStream.close();
                                    if (!fileCreateTempFile.renameTo(fileHw)) {
                                        throw new IOException("Could not rename temp file over session ID file");
                                    }
                                    v5 = uuidRandomUUID;
                                    long jLastModified3 = fileHw.lastModified();
                                    if (jLastModified3 == 0) {
                                        throw new IOException("Session file vanished after creation");
                                    }
                                    DW = jLastModified3;
                                    try {
                                        z = true;
                                    } catch (Throwable th) {
                                        th = th;
                                        EQ.DW();
                                        throw th;
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } finally {
                            fileCreateTempFile.delete();
                        }
                    } else {
                        b00.j6("SessionIds", "Session ID file on disk seems to be valid, loading from disk (2)");
                        we();
                        DW = jLastModified2;
                    }
                    EQ.DW();
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                b00.j6("SessionIds", "Session ID file on disk seems to be valid, loading from disk");
                we();
                DW = jLastModified;
            }
            return z;
        } finally {
            tp.DW();
        }
    }

    public static a v5(long j, boolean z) {
        if (Math.abs(j - System.currentTimeMillis()) > 900000) {
            if (Math.abs(Zo - j) <= 900000 && VH != null) {
                return new a(e00.j6(VH), false, true, 0L);
            }
            Zo = j;
            VH = UUID.randomUUID();
            return new a(e00.j6(VH), true, true, 0L);
        }
        if (FH) {
            return new a(e00.j6(e00.j6), false, false, 0L);
        }
        boolean zU7 = false;
        if (!gn()) {
            synchronized (u7) {
                zU7 = u7();
            }
            j6 = System.currentTimeMillis();
        } else if (z) {
            j6 = System.currentTimeMillis();
        }
        tp();
        a aVar = new a(e00.j6(v5), zU7, false, j);
        if (zU7) {
            gn = aVar;
        }
        return aVar;
    }

    private static void we() throws IOException {
        BufferedReader bufferedReader;
        FileInputStream fileInputStream = new FileInputStream(Hw());
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, "UTF-8"));
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
        try {
            try {
                v5 = UUID.fromString(bufferedReader.readLine());
                bufferedReader.close();
                fileInputStream.close();
            } finally {
            }
        } catch (IllegalArgumentException e) {
            throw new IOException(e);
        }
    }
}
