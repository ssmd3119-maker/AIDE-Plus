package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class q {
    private static int DW;
    private static String j6;

    @Nullable
    private static String DW(int i) throws Throwable {
        Throwable th;
        BufferedReader bufferedReaderFH;
        String strTrim = null;
        if (i <= 0) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("/proc/");
            sb.append(i);
            sb.append("/cmdline");
            bufferedReaderFH = FH(sb.toString());
            try {
                strTrim = bufferedReaderFH.readLine().trim();
                k.j6(bufferedReaderFH);
            } catch (IOException unused) {
                k.j6(bufferedReaderFH);
                return strTrim;
            } catch (Throwable th2) {
                th = th2;
                k.j6(bufferedReaderFH);
                throw th;
            }
        } catch (IOException unused2) {
            bufferedReaderFH = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedReaderFH = null;
        }
        return strTrim;
    }

    private static BufferedReader FH(String str) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    @Nullable
    public static String j6() {
        if (j6 == null) {
            if (DW == 0) {
                DW = Process.myPid();
            }
            j6 = DW(DW);
        }
        return j6;
    }
}
