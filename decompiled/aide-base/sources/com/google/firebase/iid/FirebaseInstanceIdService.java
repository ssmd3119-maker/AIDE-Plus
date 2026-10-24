package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

@Deprecated
/* loaded from: classes.dex */
public class FirebaseInstanceIdService extends zzb {
    @Override // com.google.firebase.iid.zzb
    protected final Intent FH(Intent intent) {
        return w.DW().FH.poll();
    }

    @Deprecated
    public void Zo() {
    }

    @Override // com.google.firebase.iid.zzb
    public final void v5(Intent intent) {
        if ("com.google.firebase.iid.TOKEN_REFRESH".equals(intent.getAction())) {
            Zo();
            return;
        }
        String stringExtra = intent.getStringExtra("CMD");
        if (stringExtra != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(intent.getExtras());
                StringBuilder sb = new StringBuilder(String.valueOf(stringExtra).length() + 21 + String.valueOf(strValueOf).length());
                sb.append("Received command: ");
                sb.append(stringExtra);
                sb.append(" - ");
                sb.append(strValueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                FirebaseInstanceId.DW().er();
            } else if ("SYNC".equals(stringExtra)) {
                FirebaseInstanceId.DW().vy();
            }
        }
    }
}
