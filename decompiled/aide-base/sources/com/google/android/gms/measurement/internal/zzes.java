package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.aide.uidesigner.ProxyTextView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.stats.a;

/* loaded from: classes.dex */
public final class zzes implements ServiceConnection, c.a, c.b {
    final /* synthetic */ zzeb zzasi;
    private volatile boolean zzaso;
    private volatile zzar zzasp;

    protected zzes(zzeb zzebVar) {
        this.zzasi = zzebVar;
    }

    static /* synthetic */ boolean zza(zzes zzesVar, boolean z) {
        zzesVar.zzaso = false;
        return false;
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnected(Bundle bundle) {
        p.Hw("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.zzasi.zzgs().zzc(new zzev(this, this.zzasp.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.zzasp = null;
                this.zzaso = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.c.b
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        p.Hw("MeasurementServiceConnection.onConnectionFailed");
        zzas zzasVarZzkj = this.zzasi.zzada.zzkj();
        if (zzasVarZzkj != null) {
            zzasVarZzkj.zzjj().zzg("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.zzaso = false;
            this.zzasp = null;
        }
        this.zzasi.zzgs().zzc(new zzex(this));
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnectionSuspended(int i) {
        p.Hw("MeasurementServiceConnection.onConnectionSuspended");
        this.zzasi.zzgt().zzjn().zzby("Service connection suspended");
        this.zzasi.zzgs().zzc(new zzew(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        p.Hw("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.zzaso = false;
                this.zzasi.zzgt().zzjg().zzby("Service connected with null binder");
                return;
            }
            zzaj zzalVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    if (iBinder != null) {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                        zzalVar = iInterfaceQueryLocalInterface instanceof zzaj ? (zzaj) iInterfaceQueryLocalInterface : new zzal(iBinder);
                    }
                    this.zzasi.zzgt().zzjo().zzby("Bound to IMeasurementService interface");
                } else {
                    this.zzasi.zzgt().zzjg().zzg("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.zzasi.zzgt().zzjg().zzby("Service connect failed to get IMeasurementService");
            }
            if (zzalVar == null) {
                this.zzaso = false;
                try {
                    a.DW().FH(this.zzasi.getContext(), this.zzasi.zzasb);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.zzasi.zzgs().zzc(new zzet(this, zzalVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        p.Hw("MeasurementServiceConnection.onServiceDisconnected");
        this.zzasi.zzgt().zzjn().zzby("Service disconnected");
        this.zzasi.zzgs().zzc(new zzeu(this, componentName));
    }

    public final void zzb(Intent intent) {
        this.zzasi.zzaf();
        Context context = this.zzasi.getContext();
        a aVarDW = a.DW();
        synchronized (this) {
            if (this.zzaso) {
                this.zzasi.zzgt().zzjo().zzby("Connection attempt already in progress");
                return;
            }
            this.zzasi.zzgt().zzjo().zzby("Using local app measurement service");
            this.zzaso = true;
            aVarDW.j6(context, intent, this.zzasi.zzasb, ProxyTextView.INPUTTYPE_textPassword);
        }
    }

    public final void zzlk() {
        if (this.zzasp != null && (this.zzasp.isConnected() || this.zzasp.isConnecting())) {
            this.zzasp.disconnect();
        }
        this.zzasp = null;
    }

    public final void zzll() {
        this.zzasi.zzaf();
        Context context = this.zzasi.getContext();
        synchronized (this) {
            if (this.zzaso) {
                this.zzasi.zzgt().zzjo().zzby("Connection attempt already in progress");
                return;
            }
            if (this.zzasp != null && (this.zzasp.isConnecting() || this.zzasp.isConnected())) {
                this.zzasi.zzgt().zzjo().zzby("Already awaiting connection attempt");
                return;
            }
            this.zzasp = new zzar(context, Looper.getMainLooper(), this, this);
            this.zzasi.zzgt().zzjo().zzby("Connecting to remote service");
            this.zzaso = true;
            this.zzasp.checkAvailabilityAndConnect();
        }
    }
}
