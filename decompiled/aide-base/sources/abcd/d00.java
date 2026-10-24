package abcd;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes.dex */
public class d00 {
    private static String DW;
    private static final Object j6 = new Object();

    public static File DW(Context context, String str) {
        try {
            String[] strArrSplit = new URL(str).getPath().split("/");
            if (strArrSplit.length > 3 && strArrSplit[3].length() > 0) {
                return new File(v5(context, "gone"), strArrSplit[3]);
            }
        } catch (MalformedURLException unused) {
        }
        return null;
    }

    public static File FH(Context context) {
        return j6(Hw(context));
    }

    private static File Hw(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new File(context.getNoBackupFilesDir(), "probelytics_" + DW);
        }
        return new File(context.getApplicationInfo().dataDir, "no_backup/probelytics_" + DW);
    }

    public static void VH(String str) {
        DW = str;
    }

    public static SharedPreferences Zo() {
        return iy.DW().getSharedPreferences("probelytics_" + DW + "_" + by.j6().J8(), 0);
    }

    private static File j6(File file) {
        if (!file.exists()) {
            synchronized (j6) {
                if (!file.exists() && !file.mkdirs()) {
                    if (file.exists()) {
                        return file;
                    }
                    return null;
                }
            }
        }
        return file;
    }

    public static File v5(Context context, String str) {
        return j6(new File(Hw(context), str));
    }
}
