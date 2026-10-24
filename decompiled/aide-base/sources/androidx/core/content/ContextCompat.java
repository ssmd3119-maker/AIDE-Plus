package androidx.core.content;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import android.util.TypedValue;
import java.io.File;

/* loaded from: classes.dex */
public class ContextCompat {
    private static TypedValue DW;
    private static final Object j6 = new Object();

    private static synchronized File DW(File file) {
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        if (file.exists()) {
            return file;
        }
        Log.w("ContextCompat", "Unable to create files subdir " + file.getPath());
        return null;
    }

    public static final int FH(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColor(i) : context.getResources().getColor(i);
    }

    public static File[] Zo(Context context, String str) {
        return Build.VERSION.SDK_INT >= 19 ? context.getExternalFilesDirs(str) : new File[]{context.getExternalFilesDir(str)};
    }

    public static int checkSelfPermission(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    public static final Drawable getDrawable(Context context, int i) {
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            return context.getDrawable(i);
        }
        if (i3 >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (j6) {
            if (DW == null) {
                DW = new TypedValue();
            }
            context.getResources().getValue(i, DW, true);
            i2 = DW.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    public static final File getNoBackupFilesDir(Context context) {
        return Build.VERSION.SDK_INT >= 21 ? context.getNoBackupFilesDir() : DW(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.isDeviceProtectedStorage();
        }
        return false;
    }

    public static File[] v5(Context context) {
        return Build.VERSION.SDK_INT >= 19 ? context.getExternalCacheDirs() : new File[]{context.getExternalCacheDir()};
    }
}
