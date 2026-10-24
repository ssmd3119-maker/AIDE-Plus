package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class am0 extends Thread {
    private final BlockingQueue<bq0<?>> WB;
    private final b fY;
    private final to jw;
    private final zk0 mb;
    private volatile boolean qp = false;

    public am0(BlockingQueue<bq0<?>> blockingQueue, zk0 zk0Var, to toVar, b bVar) {
        this.WB = blockingQueue;
        this.mb = zk0Var;
        this.jw = toVar;
        this.fY = bVar;
    }

    private final void j6() throws InterruptedException {
        bq0<?> bq0VarTake = this.WB.take();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            bq0VarTake.Mr("network-queue-take");
            bq0VarTake.v5();
            TrafficStats.setThreadStatsTag(bq0VarTake.rN());
            co0 co0VarJ6 = this.mb.j6(bq0VarTake);
            bq0VarTake.Mr("network-http-complete");
            if (co0VarJ6.v5 && bq0VarTake.cb()) {
                bq0VarTake.U2("not-modified");
                bq0VarTake.dx();
                return;
            }
            iw0<?> iw0VarWe = bq0VarTake.we(co0VarJ6);
            bq0VarTake.Mr("network-parse-complete");
            if (bq0VarTake.KD() && iw0VarWe.DW != null) {
                this.jw.ys(bq0VarTake.yS(), iw0VarWe.DW);
                bq0VarTake.Mr("network-cache-written");
            }
            bq0VarTake.sh();
            this.fY.DW(bq0VarTake, iw0VarWe);
            bq0VarTake.QX(iw0VarWe);
        } catch (e3 e) {
            e.j6(SystemClock.elapsedRealtime() - jElapsedRealtime);
            this.fY.FH(bq0VarTake, e);
            bq0VarTake.dx();
        } catch (Exception e2) {
            e4.v5(e2, "Unhandled exception %s", e2.toString());
            e3 e3Var = new e3(e2);
            e3Var.j6(SystemClock.elapsedRealtime() - jElapsedRealtime);
            this.fY.FH(bq0VarTake, e3Var);
            bq0VarTake.dx();
        }
    }

    public final void DW() {
        this.qp = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            try {
                j6();
            } catch (InterruptedException unused) {
                if (this.qp) {
                    Thread.currentThread().interrupt();
                    return;
                }
                e4.DW("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
