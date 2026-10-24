package com.google.firebase.iid;

import abcd.hw;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class a0 {
    private final zzaw FH;
    private int j6 = 0;
    private final Map<Integer, hw<Void>> DW = new ArrayMap();

    a0(zzaw zzawVar) {
        this.FH = zzawVar;
    }

    private final String FH() {
        String strHw;
        synchronized (this.FH) {
            strHw = this.FH.Hw();
        }
        if (TextUtils.isEmpty(strHw)) {
            return null;
        }
        String[] strArrSplit = strHw.split(",");
        if (strArrSplit.length <= 1 || TextUtils.isEmpty(strArrSplit[1])) {
            return null;
        }
        return strArrSplit[1];
    }

    private static boolean j6(FirebaseInstanceId firebaseInstanceId, String str) {
        String[] strArrSplit = str.split("!");
        if (strArrSplit.length == 2) {
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[1];
            char c = 65535;
            try {
                int iHashCode = str2.hashCode();
                if (iHashCode != 83) {
                    if (iHashCode == 85 && str2.equals("U")) {
                        c = 1;
                    }
                } else if (str2.equals("S")) {
                    c = 0;
                }
                if (c == 0) {
                    firebaseInstanceId.QX(str3);
                    if (FirebaseInstanceId.rN()) {
                        Log.d("FirebaseInstanceId", "subscribe operation succeeded");
                    }
                } else if (c == 1) {
                    firebaseInstanceId.XL(str3);
                    if (FirebaseInstanceId.rN()) {
                        Log.d("FirebaseInstanceId", "unsubscribe operation succeeded");
                    }
                }
            } catch (IOException e) {
                String strValueOf = String.valueOf(e.getMessage());
                Log.e("FirebaseInstanceId", strValueOf.length() != 0 ? "Topic sync failed: ".concat(strValueOf) : new String("Topic sync failed: "));
                return false;
            }
        }
        return true;
    }

    private final synchronized boolean v5(String str) {
        synchronized (this.FH) {
            String strHw = this.FH.Hw();
            String strValueOf = String.valueOf(str);
            if (!strHw.startsWith(strValueOf.length() != 0 ? ",".concat(strValueOf) : new String(","))) {
                return false;
            }
            String strValueOf2 = String.valueOf(str);
            this.FH.gn(strHw.substring((strValueOf2.length() != 0 ? ",".concat(strValueOf2) : new String(",")).length()));
            return true;
        }
    }

    final synchronized boolean DW() {
        return FH() != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (com.google.firebase.iid.FirebaseInstanceId.rN() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
    
        android.util.Log.d("FirebaseInstanceId", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean Hw(com.google.firebase.iid.FirebaseInstanceId r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            java.lang.String r0 = r4.FH()     // Catch: java.lang.Throwable -> L42
            r1 = 1
            if (r0 != 0) goto L17
            boolean r5 = com.google.firebase.iid.FirebaseInstanceId.rN()     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L15
            java.lang.String r5 = "FirebaseInstanceId"
            java.lang.String r0 = "topic sync succeeded"
            android.util.Log.d(r5, r0)     // Catch: java.lang.Throwable -> L42
        L15:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            return r1
        L17:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            boolean r2 = j6(r5, r0)
            if (r2 != 0) goto L20
            r5 = 0
            return r5
        L20:
            monitor-enter(r4)
            java.util.Map<java.lang.Integer, abcd.hw<java.lang.Void>> r2 = r4.DW     // Catch: java.lang.Throwable -> L3f
            int r3 = r4.j6     // Catch: java.lang.Throwable -> L3f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r2 = r2.remove(r3)     // Catch: java.lang.Throwable -> L3f
            abcd.hw r2 = (abcd.hw) r2     // Catch: java.lang.Throwable -> L3f
            r4.v5(r0)     // Catch: java.lang.Throwable -> L3f
            int r0 = r4.j6     // Catch: java.lang.Throwable -> L3f
            int r0 = r0 + r1
            r4.j6 = r0     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L0
            r0 = 0
            r2.FH(r0)
            goto L0
        L3f:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3f
            throw r5
        L42:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            goto L46
        L45:
            throw r5
        L46:
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.a0.Hw(com.google.firebase.iid.FirebaseInstanceId):boolean");
    }
}
