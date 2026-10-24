package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.p3;
import com.google.android.gms.internal.measurement.p4;

/* loaded from: classes.dex */
public final class zzbk implements ServiceConnection {
    private final String packageName;
    final /* synthetic */ zzbj zzanz;

    zzbk(zzbj zzbjVar, String str) {
        this.zzanz = zzbjVar;
        this.packageName = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.zzanz.zzada.zzgt().zzjj().zzby("Install Referrer connection returned with null binder");
            return;
        }
        try {
            p3 p3VarSh = p4.sh(iBinder);
            if (p3VarSh == null) {
                this.zzanz.zzada.zzgt().zzjj().zzby("Install Referrer Service implementation was not found");
            } else {
                this.zzanz.zzada.zzgt().zzjm().zzby("Install Referrer Service connected");
                this.zzanz.zzada.zzgs().zzc(new zzbl(this, p3VarSh, this));
            }
        } catch (Exception e) {
            this.zzanz.zzada.zzgt().zzjj().zzg("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzanz.zzada.zzgt().zzjm().zzby("Install Referrer Service disconnected");
    }
}
