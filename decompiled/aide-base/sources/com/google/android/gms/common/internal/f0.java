package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.h;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class f0 implements ServiceConnection {
    private IBinder fY;
    private boolean jw;
    private ComponentName k2;
    private final h.a qp;
    private final /* synthetic */ e0 zh;
    private final Set<ServiceConnection> WB = new HashSet();
    private int mb = 2;

    public f0(e0 e0Var, h.a aVar) {
        this.zh = e0Var;
        this.qp = aVar;
    }

    public final ComponentName DW() {
        return this.k2;
    }

    public final int FH() {
        return this.mb;
    }

    public final boolean Hw() {
        return this.jw;
    }

    public final void VH(ServiceConnection serviceConnection, String str) {
        com.google.android.gms.common.stats.a unused = this.zh.k2;
        Context unused2 = this.zh.fY;
        this.WB.remove(serviceConnection);
    }

    public final boolean Zo(ServiceConnection serviceConnection) {
        return this.WB.contains(serviceConnection);
    }

    public final void gn(String str) {
        this.mb = 3;
        boolean zHw = this.zh.k2.Hw(this.zh.fY, str, this.qp.FH(this.zh.fY), this, this.qp.Hw());
        this.jw = zHw;
        if (zHw) {
            this.zh.qp.sendMessageDelayed(this.zh.qp.obtainMessage(1, this.qp), this.zh.AL);
        } else {
            this.mb = 2;
            try {
                this.zh.k2.FH(this.zh.fY, this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final IBinder j6() {
        return this.fY;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.zh.jw) {
            this.zh.qp.removeMessages(1, this.qp);
            this.fY = iBinder;
            this.k2 = componentName;
            Iterator<ServiceConnection> it = this.WB.iterator();
            while (it.hasNext()) {
                it.next().onServiceConnected(componentName, iBinder);
            }
            this.mb = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.zh.jw) {
            this.zh.qp.removeMessages(1, this.qp);
            this.fY = null;
            this.k2 = componentName;
            Iterator<ServiceConnection> it = this.WB.iterator();
            while (it.hasNext()) {
                it.next().onServiceDisconnected(componentName);
            }
            this.mb = 2;
        }
    }

    public final boolean tp() {
        return this.WB.isEmpty();
    }

    public final void u7(String str) {
        this.zh.qp.removeMessages(1, this.qp);
        this.zh.k2.FH(this.zh.fY, this);
        this.jw = false;
        this.mb = 2;
    }

    public final void v5(ServiceConnection serviceConnection, String str) {
        com.google.android.gms.common.stats.a unused = this.zh.k2;
        Context unused2 = this.zh.fY;
        this.qp.FH(this.zh.fY);
        this.WB.add(serviceConnection);
    }
}
