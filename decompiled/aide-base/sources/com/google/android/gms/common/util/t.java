package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* loaded from: classes.dex */
public final class t {
    @TargetApi(19)
    public static boolean DW(Context context, int i, String str) {
        return com.google.android.gms.common.wrappers.b.j6(context).u7(i, str);
    }

    public static boolean j6(Context context, int i) throws PackageManager.NameNotFoundException {
        if (!DW(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return com.google.android.gms.common.h.j6(context).DW(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }
}
