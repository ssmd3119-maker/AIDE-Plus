package androidx.core.content;

import android.content.Context;
import android.os.Process;

/* loaded from: classes.dex */
public final class PermissionChecker {
    public static int checkSelfPermission(Context context, String str) {
        return j6(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    public static int j6(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String strDW = androidx.core.app.c.DW(str);
        if (strDW == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return androidx.core.app.c.j6(context, strDW, str2) != 0 ? -2 : 0;
    }
}
