package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.util.o;

/* loaded from: classes.dex */
public class a {
    private static Boolean DW;
    private static Context j6;

    public static synchronized boolean j6(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (j6 != null && DW != null && j6 == applicationContext) {
            return DW.booleanValue();
        }
        DW = null;
        if (o.EQ()) {
            DW = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                DW = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                DW = Boolean.FALSE;
            }
        }
        j6 = applicationContext;
        return DW.booleanValue();
    }
}
