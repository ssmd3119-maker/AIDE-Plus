package com.google.android.gms.common;

import abcd.iy;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.g0;

/* loaded from: classes.dex */
public class c {
    public static final int j6 = g.j6;
    private static final c DW = new c();

    c() {
    }

    private static String EQ(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(j6);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(com.google.android.gms.common.wrappers.b.j6(context).v5(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    public static c VH() {
        return DW;
    }

    public int DW(Context context) {
        return g.j6(context);
    }

    public Intent FH(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            return (context == null || !com.google.android.gms.common.util.i.v5(context)) ? g0.j6("com.google.android.gms", EQ(context, str)) : g0.FH();
        }
        if (i != 3) {
            return null;
        }
        return g0.DW("com.google.android.gms");
    }

    public PendingIntent Hw(Context context, int i, int i2) {
        return v5(context, i, i2, null);
    }

    public String Zo(int i) {
        return g.DW(i);
    }

    public int gn(Context context) {
        return u7(context, j6);
    }

    public boolean tp(int i) {
        return g.tp(i);
    }

    public int u7(Context context, int i) {
        int iZo = g.Zo(context, i);
        if (g.VH(context, iZo)) {
            return 18;
        }
        return iZo;
    }

    public PendingIntent v5(Context context, int i, int i2, String str) {
        Intent intentFH = FH(context, i, str);
        if (intentFH == null) {
            return null;
        }
        return iy.j6(context, i2, intentFH, 134217728);
    }
}
