package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class z extends BroadcastReceiver {

    @Nullable
    private y j6;

    public z(y yVar) {
        this.j6 = yVar;
    }

    public final void j6() {
        if (FirebaseInstanceId.rN()) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        this.j6.j6().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        y yVar = this.j6;
        if (yVar != null && yVar.Hw()) {
            if (FirebaseInstanceId.rN()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.tp(this.j6, 0L);
            this.j6.j6().unregisterReceiver(this);
            this.j6 = null;
        }
    }
}
