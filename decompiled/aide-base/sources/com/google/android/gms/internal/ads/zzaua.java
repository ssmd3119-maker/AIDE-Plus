package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzaua {
    private String BT;
    private boolean DW;
    private boolean EQ;
    private boolean FH;
    private int Hw;
    private double J0;
    private boolean J8;
    private boolean Mr;
    private String QX;
    private final boolean U2;
    private String VH;
    private String Ws;
    private boolean XL;
    private int Zo;
    private boolean a8;
    private boolean aM;
    private float er;
    private int gW;
    private int gn;
    private String j3;
    private int j6;
    private String lg;
    private String rN;
    private int tp;
    private int u7;
    private int v5;
    private boolean vy;
    private int we;
    private int yS;

    public zzaua(Context context) {
        DisplayMetrics displayMetrics;
        PackageManager packageManager = context.getPackageManager();
        FH(context);
        Hw(context);
        v5(context);
        Locale locale = Locale.getDefault();
        this.XL = j6(packageManager, "geo:0,0?q=donuts") != null;
        this.aM = j6(packageManager, "http://www.google.com") != null;
        this.j3 = locale.getCountry();
        cw0.j6();
        this.Mr = mp.tp();
        this.U2 = com.google.android.gms.common.util.i.j6(context);
        this.a8 = com.google.android.gms.common.util.i.DW(context);
        this.lg = locale.getLanguage();
        this.rN = DW(context, packageManager);
        this.BT = Zo(context);
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return;
        }
        this.er = displayMetrics.density;
        this.yS = displayMetrics.widthPixels;
        this.gW = displayMetrics.heightPixels;
    }

    private static String DW(Context context, PackageManager packageManager) {
        ActivityInfo activityInfo;
        ResolveInfo resolveInfoJ6 = j6(packageManager, "market://details?id=com.google.android.gms.ads");
        if (resolveInfoJ6 == null || (activityInfo = resolveInfoJ6.activityInfo) == null) {
            return null;
        }
        try {
            PackageInfo packageInfoV5 = com.google.android.gms.common.wrappers.b.j6(context).v5(activityInfo.packageName, 0);
            if (packageInfoV5 != null) {
                int i = packageInfoV5.versionCode;
                String str = activityInfo.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    private final void FH(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.j6 = audioManager.getMode();
                this.DW = audioManager.isMusicActive();
                this.FH = audioManager.isSpeakerphoneOn();
                this.Hw = audioManager.getStreamVolume(3);
                this.v5 = audioManager.getRingerMode();
                this.Zo = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.w0.u7().v5(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.j6 = -2;
        this.DW = false;
        this.FH = false;
        this.Hw = 0;
        this.v5 = 0;
        this.Zo = 0;
    }

    @TargetApi(16)
    private final void Hw(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.VH = telephonyManager.getNetworkOperator();
        this.u7 = telephonyManager.getNetworkType();
        this.tp = telephonyManager.getPhoneType();
        this.gn = -2;
        this.EQ = false;
        this.we = -1;
        com.google.android.gms.ads.internal.w0.v5();
        if (bn.Xa(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.gn = activeNetworkInfo.getType();
                this.we = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.gn = -1;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                this.EQ = connectivityManager.isActiveNetworkMetered();
            }
        }
    }

    private static String Zo(Context context) {
        try {
            PackageInfo packageInfoV5 = com.google.android.gms.common.wrappers.b.j6(context).v5("com.android.vending", 128);
            if (packageInfoV5 != null) {
                int i = packageInfoV5.versionCode;
                String str = packageInfoV5.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private static ResolveInfo j6(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.w0.u7().v5(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    private final void v5(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            this.J0 = -1.0d;
            this.J8 = false;
        } else {
            int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
            this.J0 = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
            this.J8 = intExtra == 2 || intExtra == 5;
        }
    }

    public final ui VH() {
        return new ui(this.j6, this.XL, this.aM, this.VH, this.j3, this.Mr, this.U2, this.a8, this.DW, this.FH, this.lg, this.rN, this.BT, this.Hw, this.gn, this.u7, this.tp, this.v5, this.Zo, this.er, this.yS, this.gW, this.J0, this.J8, this.EQ, this.we, this.Ws, this.vy, this.QX);
    }

    public zzaua(Context context, ui uiVar) {
        FH(context);
        Hw(context);
        v5(context);
        this.Ws = Build.FINGERPRINT;
        this.QX = Build.DEVICE;
        this.vy = com.google.android.gms.common.util.o.DW() && n0.VH(context);
        this.XL = uiVar.DW;
        this.aM = uiVar.FH;
        this.j3 = uiVar.v5;
        this.Mr = uiVar.Zo;
        this.U2 = uiVar.VH;
        this.a8 = uiVar.gn;
        this.lg = uiVar.EQ;
        this.rN = uiVar.we;
        this.BT = uiVar.J0;
        this.er = uiVar.Mr;
        this.yS = uiVar.U2;
        this.gW = uiVar.a8;
    }
}
