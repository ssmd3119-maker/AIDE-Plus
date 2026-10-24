package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
public final class g {
    private static boolean DW(Context context, Throwable th, int i) {
        try {
            com.google.android.gms.common.internal.p.u7(context);
            com.google.android.gms.common.internal.p.u7(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }

    public static boolean j6(Context context, Throwable th) {
        return DW(context, th, 536870912);
    }
}
