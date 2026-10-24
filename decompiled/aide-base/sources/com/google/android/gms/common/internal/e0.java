package com.google.android.gms.common.internal;

import abcd.nv;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.h;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class e0 extends h implements Handler.Callback {
    private final Context fY;
    private final Handler qp;

    @GuardedBy("mConnectionStatus")
    private final HashMap<h.a, f0> jw = new HashMap<>();
    private final com.google.android.gms.common.stats.a k2 = com.google.android.gms.common.stats.a.DW();
    private final long zh = 5000;
    private final long AL = 300000;

    e0(Context context) {
        this.fY = context.getApplicationContext();
        this.qp = new nv(context.getMainLooper(), this);
    }

    @Override // com.google.android.gms.common.internal.h
    protected final boolean FH(h.a aVar, ServiceConnection serviceConnection, String str) {
        boolean zHw;
        p.tp(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.jw) {
            f0 f0Var = this.jw.get(aVar);
            if (f0Var == null) {
                f0Var = new f0(this, aVar);
                f0Var.v5(serviceConnection, str);
                f0Var.gn(str);
                this.jw.put(aVar, f0Var);
            } else {
                this.qp.removeMessages(0, aVar);
                if (f0Var.Zo(serviceConnection)) {
                    String strValueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(strValueOf);
                    throw new IllegalStateException(sb.toString());
                }
                f0Var.v5(serviceConnection, str);
                int iFH = f0Var.FH();
                if (iFH == 1) {
                    serviceConnection.onServiceConnected(f0Var.DW(), f0Var.j6());
                } else if (iFH == 2) {
                    f0Var.gn(str);
                }
            }
            zHw = f0Var.Hw();
        }
        return zHw;
    }

    @Override // com.google.android.gms.common.internal.h
    protected final void Hw(h.a aVar, ServiceConnection serviceConnection, String str) {
        p.tp(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.jw) {
            f0 f0Var = this.jw.get(aVar);
            if (f0Var == null) {
                String strValueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(strValueOf);
                throw new IllegalStateException(sb.toString());
            }
            if (!f0Var.Zo(serviceConnection)) {
                String strValueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(strValueOf2);
                throw new IllegalStateException(sb2.toString());
            }
            f0Var.VH(serviceConnection, str);
            if (f0Var.tp()) {
                this.qp.sendMessageDelayed(this.qp.obtainMessage(0, aVar), this.zh);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.jw) {
                h.a aVar = (h.a) message.obj;
                f0 f0Var = this.jw.get(aVar);
                if (f0Var != null && f0Var.tp()) {
                    if (f0Var.Hw()) {
                        f0Var.u7("GmsClientSupervisor");
                    }
                    this.jw.remove(aVar);
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        synchronized (this.jw) {
            h.a aVar2 = (h.a) message.obj;
            f0 f0Var2 = this.jw.get(aVar2);
            if (f0Var2 != null && f0Var2.FH() == 3) {
                String strValueOf = String.valueOf(aVar2);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 47);
                sb.append("Timeout waiting for ServiceConnection callback ");
                sb.append(strValueOf);
                Log.wtf("GmsClientSupervisor", sb.toString(), new Exception());
                ComponentName componentNameDW = f0Var2.DW();
                if (componentNameDW == null) {
                    componentNameDW = aVar2.j6();
                }
                if (componentNameDW == null) {
                    componentNameDW = new ComponentName(aVar2.DW(), "unknown");
                }
                f0Var2.onServiceDisconnected(componentNameDW);
            }
        }
        return true;
    }
}
