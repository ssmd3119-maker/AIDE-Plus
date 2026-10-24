package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* loaded from: classes.dex */
public class q1 {
    private static volatile boolean DW = !Hw();
    private static volatile UserManager j6;

    private q1() {
    }

    @TargetApi(24)
    private static boolean DW(Context context) {
        boolean z = DW;
        if (!z) {
            for (int i = 1; i <= 2; i++) {
                UserManager userManagerFH = FH(context);
                if (userManagerFH == null) {
                    DW = true;
                    return true;
                }
                try {
                    z = userManagerFH.isUserUnlocked() || !userManagerFH.isUserRunning(Process.myUserHandle());
                    DW = z;
                    break;
                } catch (NullPointerException e) {
                    Log.w("DirectBootUtils", "Failed to check if user is unlocked", e);
                    j6 = null;
                }
            }
            if (z) {
                j6 = null;
            }
        }
        return z;
    }

    @TargetApi(24)
    private static UserManager FH(Context context) {
        UserManager userManager = j6;
        if (userManager == null) {
            synchronized (q1.class) {
                userManager = j6;
                if (userManager == null) {
                    UserManager userManager2 = (UserManager) context.getSystemService(UserManager.class);
                    j6 = userManager2;
                    userManager = userManager2;
                }
            }
        }
        return userManager;
    }

    public static boolean Hw() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean j6(Context context) {
        return !Hw() || DW(context);
    }
}
