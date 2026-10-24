package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class o0 {

    @GuardedBy("sLock")
    private static boolean DW;
    private static String FH;
    private static int Hw;
    private static Object j6 = new Object();

    public static int DW(Context context) {
        FH(context);
        return Hw;
    }

    private static void FH(Context context) {
        Bundle bundle;
        synchronized (j6) {
            if (DW) {
                return;
            }
            DW = true;
            try {
                bundle = com.google.android.gms.common.wrappers.b.j6(context).FH(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("MetadataValueReader", "This should never happen.", e);
            }
            if (bundle == null) {
                return;
            }
            FH = bundle.getString("com.google.app.id");
            Hw = bundle.getInt("com.google.android.gms.version");
        }
    }

    public static String j6(Context context) {
        FH(context);
        return FH;
    }
}
