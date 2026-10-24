package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class bc0 extends Thread {
    private static final boolean zh = e4.DW;
    private final BlockingQueue<bq0<?>> WB;
    private final b fY;
    private final to jw;
    private final BlockingQueue<bq0<?>> mb;
    private volatile boolean qp = false;
    private final de0 k2 = new de0(this);

    public bc0(BlockingQueue<bq0<?>> blockingQueue, BlockingQueue<bq0<?>> blockingQueue2, to toVar, b bVar) {
        this.WB = blockingQueue;
        this.mb = blockingQueue2;
        this.jw = toVar;
        this.fY = bVar;
    }

    private final void j6() throws InterruptedException {
        bq0<?> bq0VarTake = this.WB.take();
        bq0VarTake.Mr("cache-queue-take");
        bq0VarTake.v5();
        ab0 ab0VarIS = this.jw.IS(bq0VarTake.yS());
        if (ab0VarIS == null) {
            bq0VarTake.Mr("cache-miss");
            if (this.k2.Hw(bq0VarTake)) {
                return;
            }
            this.mb.put(bq0VarTake);
            return;
        }
        if (ab0VarIS.j6()) {
            bq0VarTake.Mr("cache-hit-expired");
            bq0VarTake.u7(ab0VarIS);
            if (this.k2.Hw(bq0VarTake)) {
                return;
            }
            this.mb.put(bq0VarTake);
            return;
        }
        bq0VarTake.Mr("cache-hit");
        iw0<?> iw0VarWe = bq0VarTake.we(new co0(ab0VarIS.j6, ab0VarIS.VH));
        bq0VarTake.Mr("cache-hit-parsed");
        if (ab0VarIS.Zo < System.currentTimeMillis()) {
            bq0VarTake.Mr("cache-hit-refresh-needed");
            bq0VarTake.u7(ab0VarIS);
            iw0VarWe.Hw = true;
            if (!this.k2.Hw(bq0VarTake)) {
                this.fY.j6(bq0VarTake, iw0VarWe, new cd0(this, bq0VarTake));
                return;
            }
        }
        this.fY.DW(bq0VarTake, iw0VarWe);
    }

    public final void DW() {
        this.qp = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        if (zh) {
            e4.FH("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.jw.a5();
        while (true) {
            try {
                j6();
            } catch (InterruptedException unused) {
                if (this.qp) {
                    Thread.currentThread().interrupt();
                    return;
                }
                e4.DW("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
