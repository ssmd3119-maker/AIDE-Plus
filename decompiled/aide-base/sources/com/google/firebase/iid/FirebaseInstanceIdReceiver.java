package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends WakefulBroadcastReceiver {

    @GuardedBy("FirebaseInstanceIdReceiver.class")
    private static g0 DW;

    @GuardedBy("FirebaseInstanceIdReceiver.class")
    private static g0 j6;

    private static synchronized g0 DW(Context context, String str) {
        if ("com.google.firebase.MESSAGING_EVENT".equals(str)) {
            if (DW == null) {
                DW = new g0(context, str);
            }
            return DW;
        }
        if (j6 == null) {
            j6 = new g0(context, str);
        }
        return j6;
    }

    private final void FH(Context context, Intent intent, String str) {
        String str2 = null;
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if (Build.VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        if ("google.com/iid".equals(intent.getStringExtra("from")) || "com.google.firebase.INSTANCE_ID_EVENT".equals(str)) {
            str2 = "com.google.firebase.INSTANCE_ID_EVENT";
        } else if ("com.google.android.c2dm.intent.RECEIVE".equals(str) || "com.google.firebase.MESSAGING_EVENT".equals(str)) {
            str2 = "com.google.firebase.MESSAGING_EVENT";
        } else {
            Log.d("FirebaseInstanceId", "Unexpected intent");
        }
        int iJ6 = str2 != null ? j6(this, context, str2, intent) : -1;
        if (isOrderedBroadcast()) {
            setResultCode(iJ6);
        }
    }

    private static int Hw(BroadcastReceiver broadcastReceiver, Context context, String str, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String strValueOf = String.valueOf(str);
            Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? "Binding to service: ".concat(strValueOf) : new String("Binding to service: "));
        }
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        DW(context, str).j6(intent, broadcastReceiver.goAsync());
        return -1;
    }

    @SuppressLint({"InlinedApi"})
    public static int j6(BroadcastReceiver broadcastReceiver, Context context, String str, Intent intent) {
        boolean z = com.google.android.gms.common.util.o.EQ() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z2 = (intent.getFlags() & 268435456) != 0;
        if (z && !z2) {
            return Hw(broadcastReceiver, context, str, intent);
        }
        int iFH = w.DW().FH(context, str, intent);
        if (!com.google.android.gms.common.util.o.EQ() || iFH != 402) {
            return iFH;
        }
        Hw(broadcastReceiver, context, str, intent);
        return 403;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
        Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
        if (intent2 != null) {
            FH(context, intent2, intent.getAction());
        } else {
            FH(context, intent, intent.getAction());
        }
    }
}
