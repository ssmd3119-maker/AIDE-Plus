package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class a implements ServiceConnection {
    private boolean WB = false;
    private final BlockingQueue<IBinder> mb = new LinkedBlockingQueue();

    public IBinder j6(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        com.google.android.gms.common.internal.p.gn("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.WB) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.WB = true;
        IBinder iBinderPoll = this.mb.poll(j, timeUnit);
        if (iBinderPoll != null) {
            return iBinderPoll;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.mb.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }
}
