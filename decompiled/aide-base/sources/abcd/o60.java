package abcd;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class o60 implements j70 {
    private static final ScheduledThreadPoolExecutor Hw;
    static final Object v5;
    private TimeUnit DW = TimeUnit.MILLISECONDS;
    private c FH;
    private long j6;

    class a implements ThreadFactory {
        private final ThreadFactory j6 = Executors.defaultThreadFactory();

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.j6.newThread(runnable);
            threadNewThread.setName("JGit-AlarmQueue");
            threadNewThread.setDaemon(true);
            return threadNewThread;
        }
    }

    class b {
        public void finalize() {
            o60.Hw.shutdownNow();
        }
    }

    private static class c implements Runnable {
        private final String WB;
        private Future<?> fY;
        private volatile boolean jw = true;
        private int k2;
        private final int mb;
        private boolean qp;
        private int zh;

        public c(String str, int i) {
            this.WB = str;
            this.mb = i;
        }

        private void FH() {
            this.jw = false;
            this.fY = o60.Hw.schedule(this, 1L, TimeUnit.SECONDS);
        }

        public void DW(o60 o60Var) {
            if (this.qp) {
                int i = this.mb;
                if (i == 0) {
                    o60Var.Zo(this.WB, this.k2);
                } else {
                    int i2 = this.k2;
                    o60Var.VH(this.WB, i2, i, (i2 * 100) / i);
                }
            }
            Future<?> future = this.fY;
            if (future != null) {
                future.cancel(false);
            }
        }

        public void Hw(o60 o60Var, int i) {
            int i2 = this.k2 + i;
            this.k2 = i2;
            int i3 = this.mb;
            if (i3 == 0) {
                if (this.jw) {
                    o60Var.gn(this.WB, this.k2);
                    this.qp = true;
                    FH();
                    return;
                }
                return;
            }
            int i4 = (i2 * 100) / i3;
            if (this.jw) {
                o60Var.u7(this.WB, this.k2, this.mb, i4);
                this.qp = true;
                FH();
                this.zh = i4;
                return;
            }
            if (i4 != this.zh) {
                o60Var.u7(this.WB, this.k2, this.mb, i4);
                this.qp = true;
                this.zh = i4;
            }
        }

        public void j6(long j, TimeUnit timeUnit) {
            this.jw = false;
            this.fY = o60.Hw.schedule(this, j, timeUnit);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.jw = true;
        }
    }

    static {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new a());
        Hw = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.setContinueExistingPeriodicTasksAfterShutdownPolicy(false);
        Hw.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
        Hw.prestartAllCoreThreads();
        Hw.setThreadFactory(Executors.defaultThreadFactory());
        v5 = new b();
    }

    @Override // abcd.j70
    public void DW(int i) {
    }

    @Override // abcd.j70
    public void FH() {
        c cVar = this.FH;
        if (cVar != null) {
            cVar.DW(this);
            this.FH = null;
        }
    }

    public abstract void VH(String str, int i, int i2, int i3);

    public abstract void Zo(String str, int i);

    public abstract void gn(String str, int i);

    @Override // abcd.j70
    public boolean isCancelled() {
        return false;
    }

    @Override // abcd.j70
    public void j6(String str, int i) {
        FH();
        c cVar = new c(str, i);
        this.FH = cVar;
        long j = this.j6;
        if (j != 0) {
            cVar.j6(j, this.DW);
        }
    }

    public void tp(long j, TimeUnit timeUnit) {
        this.j6 = j;
        this.DW = timeUnit;
    }

    public abstract void u7(String str, int i, int i2, int i3);

    @Override // abcd.j70
    public void v5(int i) {
        c cVar = this.FH;
        if (cVar != null) {
            cVar.Hw(this, i);
        }
    }
}
