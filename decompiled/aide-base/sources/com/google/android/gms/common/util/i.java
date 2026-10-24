package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.aide.uidesigner.ProxyTextView;

/* loaded from: classes.dex */
public final class i {
    private static Boolean DW;
    private static Boolean FH;
    private static Boolean Hw;
    private static Boolean j6;

    @TargetApi(21)
    public static boolean DW(Context context) {
        if (DW == null) {
            DW = Boolean.valueOf(o.gn() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return DW.booleanValue();
    }

    public static boolean FH() {
        return "user".equals(Build.TYPE);
    }

    @TargetApi(ProxyTextView.INPUTTYPE_date)
    public static boolean Hw(Context context) {
        if (j6 == null) {
            j6 = Boolean.valueOf(o.VH() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return j6.booleanValue();
    }

    public static boolean Zo(Context context) {
        if (Hw == null) {
            Hw = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return Hw.booleanValue();
    }

    public static boolean j6(Context context) {
        if (FH == null) {
            PackageManager packageManager = context.getPackageManager();
            FH = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services"));
        }
        return FH.booleanValue();
    }

    @TargetApi(26)
    public static boolean v5(Context context) {
        if (!Hw(context)) {
            return false;
        }
        if (o.tp()) {
            return DW(context) && !o.EQ();
        }
        return true;
    }
}
