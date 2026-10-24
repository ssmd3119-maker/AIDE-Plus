package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.c;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class xx implements c.a, c.b {
    private yx WB;
    private final LinkedBlockingQueue<sz> fY;
    private final String jw;
    private final String mb;
    private final HandlerThread qp;

    public xx(Context context, String str, String str2) {
        this.mb = str;
        this.jw = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.qp = handlerThread;
        handlerThread.start();
        this.WB = new yx(context, this.qp.getLooper(), this, this);
        this.fY = new LinkedBlockingQueue<>();
        this.WB.checkAvailabilityAndConnect();
    }

    private static sz DW() {
        sz szVar = new sz();
        szVar.a8 = 32768L;
        return szVar;
    }

    private final void Hw() {
        yx yxVar = this.WB;
        if (yxVar != null) {
            if (yxVar.isConnected() || this.WB.isConnecting()) {
                this.WB.disconnect();
            }
        }
    }

    private final by j6() {
        try {
            return this.WB.Hw();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    public final sz FH(int i) throws InterruptedException {
        sz szVarPoll;
        try {
            szVarPoll = this.fY.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            szVarPoll = null;
        }
        return szVarPoll == null ? DW() : szVarPoll;
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnected(Bundle bundle) {
        by byVarJ6 = j6();
        if (byVarJ6 != null) {
            try {
                try {
                    this.fY.put(byVarJ6.j7(new zzbjg(this.mb, this.jw)).gn());
                    Hw();
                    this.qp.quit();
                } catch (Throwable unused) {
                    this.fY.put(DW());
                    Hw();
                    this.qp.quit();
                }
            } catch (InterruptedException unused2) {
                Hw();
                this.qp.quit();
            } catch (Throwable th) {
                Hw();
                this.qp.quit();
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.c.b
    public final void onConnectionFailed(ConnectionResult connectionResult) throws InterruptedException {
        try {
            this.fY.put(DW());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnectionSuspended(int i) throws InterruptedException {
        try {
            this.fY.put(DW());
        } catch (InterruptedException unused) {
        }
    }
}
