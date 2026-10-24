package com.google.firebase.iid;

import abcd.cx;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Base64;
import android.util.Log;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class zzan {

    @GuardedBy("this")
    private String DW;

    @GuardedBy("this")
    private String FH;

    @GuardedBy("this")
    private int Hw;
    private final Context j6;

    @GuardedBy("this")
    private int v5 = 0;

    public zzan(Context context) {
        this.j6 = context;
    }

    public static String DW(KeyPair keyPair) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            bArrDigest[0] = (byte) ((bArrDigest[0] & 15) + 112);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private final synchronized void VH() {
        PackageInfo packageInfoGn = gn(this.j6.getPackageName());
        if (packageInfoGn != null) {
            this.DW = Integer.toString(packageInfoGn.versionCode);
            this.FH = packageInfoGn.versionName;
        }
    }

    private final PackageInfo gn(String str) {
        try {
            return this.j6.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(strValueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    public static String j6(cx cxVar) {
        String strFH = cxVar.v5().FH();
        if (strFH != null) {
            return strFH;
        }
        String strDW = cxVar.v5().DW();
        if (!strDW.startsWith("1:")) {
            return strDW;
        }
        String[] strArrSplit = strDW.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public final synchronized int FH() {
        if (this.v5 != 0) {
            return this.v5;
        }
        PackageManager packageManager = this.j6.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!com.google.android.gms.common.util.o.EQ()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.v5 = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.v5 = 2;
            return 2;
        }
        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
        if (com.google.android.gms.common.util.o.EQ()) {
            this.v5 = 2;
        } else {
            this.v5 = 1;
        }
        return this.v5;
    }

    public final synchronized String Hw() {
        if (this.DW == null) {
            VH();
        }
        return this.DW;
    }

    public final synchronized int Zo() {
        PackageInfo packageInfoGn;
        if (this.Hw == 0 && (packageInfoGn = gn("com.google.android.gms")) != null) {
            this.Hw = packageInfoGn.versionCode;
        }
        return this.Hw;
    }

    public final synchronized String v5() {
        if (this.FH == null) {
            VH();
        }
        return this.FH;
    }
}
