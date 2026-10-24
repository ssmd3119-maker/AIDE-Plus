package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class w {
    private static w v5;

    @GuardedBy("serviceClassNames")
    private final SimpleArrayMap<String, String> j6 = new SimpleArrayMap<>();
    private Boolean DW = null;
    final Queue<Intent> FH = new ArrayDeque();
    private final Queue<Intent> Hw = new ArrayDeque();

    private w() {
    }

    public static synchronized w DW() {
        if (v5 == null) {
            v5 = new w();
        }
        return v5;
    }

    public static void Hw(Context context, Intent intent) {
        context.sendBroadcast(j6(context, "com.google.firebase.INSTANCE_ID_EVENT", intent));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int Zo(android.content.Context r7, android.content.Intent r8) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.w.Zo(android.content.Context, android.content.Intent):int");
    }

    private static Intent j6(Context context, String str, Intent intent) {
        Intent intent2 = new Intent(context, (Class<?>) FirebaseInstanceIdReceiver.class);
        intent2.setAction(str);
        intent2.putExtra("wrapped_intent", intent);
        return intent2;
    }

    public static void v5(Context context, Intent intent) {
        context.sendBroadcast(j6(context, "com.google.firebase.MESSAGING_EVENT", intent));
    }

    public final int FH(Context context, String str, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String strValueOf = String.valueOf(str);
            Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? "Starting service: ".concat(strValueOf) : new String("Starting service: "));
        }
        char c = 65535;
        int iHashCode = str.hashCode();
        if (iHashCode != -842411455) {
            if (iHashCode == 41532704 && str.equals("com.google.firebase.MESSAGING_EVENT")) {
                c = 1;
            }
        } else if (str.equals("com.google.firebase.INSTANCE_ID_EVENT")) {
            c = 0;
        }
        if (c == 0) {
            this.FH.offer(intent);
        } else {
            if (c != 1) {
                String strValueOf2 = String.valueOf(str);
                Log.w("FirebaseInstanceId", strValueOf2.length() != 0 ? "Unknown service action: ".concat(strValueOf2) : new String("Unknown service action: "));
                return 500;
            }
            this.Hw.offer(intent);
        }
        Intent intent2 = new Intent(str);
        intent2.setPackage(context.getPackageName());
        return Zo(context, intent2);
    }
}
