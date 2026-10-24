package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public final class y implements Runnable {
    private final long WB;
    private final zzan fY;
    private final FirebaseInstanceId jw;
    private final PowerManager.WakeLock mb;
    private final a0 qp;

    y(FirebaseInstanceId firebaseInstanceId, zzan zzanVar, a0 a0Var, long j) {
        this.jw = firebaseInstanceId;
        this.fY = zzanVar;
        this.qp = a0Var;
        this.WB = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) j6().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.mb = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    private final boolean DW() {
        try {
            if (this.jw.gW()) {
                return true;
            }
            this.jw.BT();
            return true;
        } catch (IOException e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.e("FirebaseInstanceId", strValueOf.length() != 0 ? "Build channel failed: ".concat(strValueOf) : new String("Build channel failed: "));
            return false;
        }
    }

    private final boolean FH() {
        x xVarA8 = this.jw.a8();
        if (xVarA8 != null && !xVarA8.Hw(this.fY.Hw())) {
            return true;
        }
        try {
            String strLg = this.jw.lg();
            if (strLg == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            if (xVarA8 == null || (xVarA8 != null && !strLg.equals(xVarA8.j6))) {
                Context contextJ6 = j6();
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", strLg);
                w.v5(contextJ6, intent);
                w.Hw(contextJ6, new Intent("com.google.firebase.iid.TOKEN_REFRESH"));
            }
            return true;
        } catch (IOException | SecurityException e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.e("FirebaseInstanceId", strValueOf.length() != 0 ? "Token retrieval failed: ".concat(strValueOf) : new String("Token retrieval failed: "));
            return false;
        }
    }

    final boolean Hw() {
        ConnectivityManager connectivityManager = (ConnectivityManager) j6().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    final Context j6() {
        return this.jw.Mr().DW();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.mb.acquire();
        try {
            this.jw.J0(true);
            if (!this.jw.yS()) {
                this.jw.J0(false);
                return;
            }
            if (!Hw()) {
                new z(this).j6();
                return;
            }
            if (DW() && FH() && this.qp.Hw(this.jw)) {
                this.jw.J0(false);
            } else {
                this.jw.u7(this.WB);
            }
        } finally {
            this.mb.release();
        }
    }
}
