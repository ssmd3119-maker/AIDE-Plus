package com.google.firebase.iid;

import abcd.ov;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class g implements ServiceConnection {

    @GuardedBy("this")
    int WB;

    @GuardedBy("this")
    final Queue<m<?>> fY;
    l jw;
    final /* synthetic */ e k2;
    final Messenger mb;

    @GuardedBy("this")
    final SparseArray<m<?>> qp;

    private g(e eVar) {
        this.k2 = eVar;
        this.WB = 0;
        this.mb = new Messenger(new ov(Looper.getMainLooper(), new Handler.Callback(this) { // from class: com.google.firebase.iid.h
            private final g WB;

            {
                this.WB = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.WB.FH(message);
            }
        }));
        this.fY = new ArrayDeque();
        this.qp = new SparseArray<>();
    }

    private final void Zo() {
        this.k2.DW.execute(new Runnable(this) { // from class: com.google.firebase.iid.j
            private final g WB;

            {
                this.WB = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final m<?> mVarPoll;
                final g gVar = this.WB;
                while (true) {
                    synchronized (gVar) {
                        if (gVar.WB != 2) {
                            return;
                        }
                        if (gVar.fY.isEmpty()) {
                            gVar.VH();
                            return;
                        } else {
                            mVarPoll = gVar.fY.poll();
                            gVar.qp.put(mVarPoll.j6, mVarPoll);
                            gVar.k2.DW.schedule(new Runnable(gVar, mVarPoll) { // from class: com.google.firebase.iid.k
                                private final g WB;
                                private final m mb;

                                {
                                    this.WB = gVar;
                                    this.mb = mVarPoll;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.WB.j6(this.mb.j6);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String strValueOf = String.valueOf(mVarPoll);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 8);
                        sb.append("Sending ");
                        sb.append(strValueOf);
                        Log.d("MessengerIpcClient", sb.toString());
                    }
                    Context context = gVar.k2.j6;
                    Messenger messenger = gVar.mb;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = mVarPoll.FH;
                    messageObtain.arg1 = mVarPoll.j6;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", mVarPoll.FH());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", mVarPoll.Hw);
                    messageObtain.setData(bundle);
                    try {
                        gVar.jw.j6(messageObtain);
                    } catch (RemoteException e) {
                        gVar.DW(2, e.getMessage());
                    }
                }
            }
        });
    }

    final synchronized void DW(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", strValueOf.length() != 0 ? "Disconnected: ".concat(strValueOf) : new String("Disconnected: "));
        }
        int i2 = this.WB;
        if (i2 == 0) {
            throw new IllegalStateException();
        }
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                this.WB = 4;
                return;
            } else {
                if (i2 == 4) {
                    return;
                }
                int i3 = this.WB;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i3);
                throw new IllegalStateException(sb.toString());
            }
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.WB = 4;
        com.google.android.gms.common.stats.a.DW().FH(this.k2.j6, this);
        n nVar = new n(i, str);
        Iterator<m<?>> it = this.fY.iterator();
        while (it.hasNext()) {
            it.next().DW(nVar);
        }
        this.fY.clear();
        for (int i4 = 0; i4 < this.qp.size(); i4++) {
            this.qp.valueAt(i4).DW(nVar);
        }
        this.qp.clear();
    }

    final boolean FH(Message message) {
        int i = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Received response to request: ");
            sb.append(i);
            Log.d("MessengerIpcClient", sb.toString());
        }
        synchronized (this) {
            m<?> mVar = this.qp.get(i);
            if (mVar == null) {
                StringBuilder sb2 = new StringBuilder(50);
                sb2.append("Received response for unknown request: ");
                sb2.append(i);
                Log.w("MessengerIpcClient", sb2.toString());
                return true;
            }
            this.qp.remove(i);
            VH();
            Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                mVar.DW(new n(4, "Not supported by GmsCore"));
            } else {
                mVar.Hw(data);
            }
            return true;
        }
    }

    final synchronized void Hw() {
        if (this.WB == 1) {
            DW(1, "Timed out while binding");
        }
    }

    final synchronized void VH() {
        if (this.WB == 2 && this.fY.isEmpty() && this.qp.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.WB = 3;
            com.google.android.gms.common.stats.a.DW().FH(this.k2.j6, this);
        }
    }

    final synchronized void j6(int i) {
        m<?> mVar = this.qp.get(i);
        if (mVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            Log.w("MessengerIpcClient", sb.toString());
            this.qp.remove(i);
            mVar.DW(new n(3, "Timed out waiting for response"));
            VH();
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        if (iBinder == null) {
            DW(0, "Null service connection");
            return;
        }
        try {
            this.jw = new l(iBinder);
            this.WB = 2;
            Zo();
        } catch (RemoteException e) {
            DW(0, e.getMessage());
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        DW(2, "Service disconnected");
    }

    final synchronized boolean v5(m mVar) {
        int i = this.WB;
        if (i == 0) {
            this.fY.add(mVar);
            com.google.android.gms.common.internal.p.we(this.WB == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.WB = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            if (com.google.android.gms.common.stats.a.DW().j6(this.k2.j6, intent, this, 1)) {
                this.k2.DW.schedule(new Runnable(this) { // from class: com.google.firebase.iid.i
                    private final g WB;

                    {
                        this.WB = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.WB.Hw();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                DW(0, "Unable to bind to service");
            }
            return true;
        }
        if (i == 1) {
            this.fY.add(mVar);
            return true;
        }
        if (i == 2) {
            this.fY.add(mVar);
            Zo();
            return true;
        }
        if (i != 3 && i != 4) {
            int i2 = this.WB;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i2);
            throw new IllegalStateException(sb.toString());
        }
        return false;
    }
}
