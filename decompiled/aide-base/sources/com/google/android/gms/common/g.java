package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.aide.uidesigner.ProxyTextView;
import com.google.android.gms.common.internal.o0;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class g {
    private static boolean DW = false;
    private static boolean FH = false;

    @Deprecated
    public static final int j6 = 12451000;
    static final AtomicBoolean Hw = new AtomicBoolean();
    private static final AtomicBoolean v5 = new AtomicBoolean();

    @Deprecated
    public static String DW(int i) {
        return ConnectionResult.aM(i);
    }

    @TargetApi(19)
    @Deprecated
    public static boolean EQ(Context context, int i, String str) {
        return com.google.android.gms.common.util.t.DW(context, i, str);
    }

    public static Context FH(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources Hw(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Deprecated
    public static boolean VH(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return u7(context, "com.google.android.gms");
        }
        return false;
    }

    @Deprecated
    public static int Zo(Context context, int i) {
        try {
            context.getResources().getString(i.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !v5.get()) {
            int iDW = o0.DW(context);
            if (iDW == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
            if (iDW != j6) {
                int i2 = j6;
                StringBuilder sb = new StringBuilder(ModuleDescriptor.MODULE_VERSION);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(i2);
                sb.append(" but found ");
                sb.append(iDW);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new IllegalStateException(sb.toString());
            }
        }
        return we(context, (com.google.android.gms.common.util.i.v5(context) || com.google.android.gms.common.util.i.Zo(context)) ? false : true, i);
    }

    @TargetApi(ProxyTextView.INPUTTYPE_numberPassword)
    public static boolean gn(Context context) {
        Bundle applicationRestrictions;
        return com.google.android.gms.common.util.o.v5() && (applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName())) != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    public static int j6(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static boolean tp(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @TargetApi(21)
    static boolean u7(Context context, String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        boolean zEquals = str.equals("com.google.android.gms");
        if (com.google.android.gms.common.util.o.gn()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return zEquals ? applicationInfo.enabled : applicationInfo.enabled && !gn(context);
    }

    public static boolean v5(Context context) {
        try {
            if (!FH) {
                PackageInfo packageInfoV5 = com.google.android.gms.common.wrappers.b.j6(context).v5("com.google.android.gms", 64);
                h.j6(context);
                if (packageInfoV5 == null || h.VH(packageInfoV5, false) || !h.VH(packageInfoV5, true)) {
                    DW = false;
                } else {
                    DW = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
        } finally {
            FH = true;
        }
        return DW || !com.google.android.gms.common.util.i.FH();
    }

    private static int we(Context context, boolean z, int i) throws PackageManager.NameNotFoundException {
        com.google.android.gms.common.internal.p.j6(i >= 0);
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
                return 9;
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            h.j6(context);
            if (!h.VH(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            if (z && (!h.VH(packageInfo, true) || !packageInfo.signatures[0].equals(packageInfo2.signatures[0]))) {
                Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                return 9;
            }
            if (com.google.android.gms.common.util.u.j6(packageInfo2.versionCode) >= com.google.android.gms.common.util.u.j6(i)) {
                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                if (applicationInfo == null) {
                    try {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e);
                        return 1;
                    }
                }
                return !applicationInfo.enabled ? 3 : 0;
            }
            int i2 = packageInfo2.versionCode;
            StringBuilder sb = new StringBuilder(77);
            sb.append("Google Play services out of date.  Requires ");
            sb.append(i);
            sb.append(" but found ");
            sb.append(i2);
            Log.w("GooglePlayServicesUtil", sb.toString());
            return 2;
        } catch (PackageManager.NameNotFoundException unused2) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
    }
}
