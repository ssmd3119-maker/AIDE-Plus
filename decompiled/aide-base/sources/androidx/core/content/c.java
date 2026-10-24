package androidx.core.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class c<Params, Progress, Result> {
    private static f w9;
    private static final ThreadFactory k2 = new a();
    private static final BlockingQueue<Runnable> zh = new LinkedBlockingQueue(10);
    public static final Executor AL = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, zh, k2);
    private volatile g jw = g.PENDING;
    private final AtomicBoolean fY = new AtomicBoolean();
    private final AtomicBoolean qp = new AtomicBoolean();
    private final h<Params, Result> WB = new b();
    private final FutureTask<Result> mb = new C0028c(this.WB);

    static class a implements ThreadFactory {
        private final AtomicInteger j6 = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.j6.getAndIncrement());
        }
    }

    class b extends h<Params, Result> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() {
            c.this.qp.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) c.this.Hw(this.j6);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* renamed from: androidx.core.content.c$c, reason: collision with other inner class name */
    class C0028c extends FutureTask<Result> {
        C0028c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                c.this.XL(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (CancellationException unused) {
                c.this.XL(null);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    static /* synthetic */ class d {
        static final /* synthetic */ int[] j6;

        static {
            int[] iArr = new int[g.values().length];
            j6 = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                j6[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static class e<Data> {
        final Data[] DW;
        final c j6;

        e(c cVar, Data... dataArr) {
            this.j6 = cVar;
            this.DW = dataArr;
        }
    }

    private static class f extends Handler {
        public f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i = message.what;
            if (i == 1) {
                eVar.j6.gn(eVar.DW[0]);
            } else {
                if (i != 2) {
                    return;
                }
                eVar.j6.Ws(eVar.DW);
            }
        }
    }

    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    private static abstract class h<Params, Result> implements Callable<Result> {
        Params[] j6;

        h() {
        }
    }

    private static Handler u7() {
        f fVar;
        synchronized (c.class) {
            if (w9 == null) {
                w9 = new f();
            }
            fVar = w9;
        }
        return fVar;
    }

    protected void EQ() {
    }

    public final boolean FH(boolean z) {
        this.fY.set(true);
        return this.mb.cancel(z);
    }

    protected abstract Result Hw(Params... paramsArr);

    protected void J0(Result result) {
    }

    protected void J8() {
    }

    Result QX(Result result) {
        u7().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    public final c<Params, Progress, Result> VH(Executor executor, Params... paramsArr) {
        if (this.jw == g.PENDING) {
            this.jw = g.RUNNING;
            J8();
            this.WB.j6 = paramsArr;
            executor.execute(this.mb);
            return this;
        }
        int i = d.j6[this.jw.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    protected void Ws(Progress... progressArr) {
    }

    void XL(Result result) {
        if (this.qp.get()) {
            return;
        }
        QX(result);
    }

    void gn(Result result) {
        if (tp()) {
            we(result);
        } else {
            J0(result);
        }
        this.jw = g.FINISHED;
    }

    public final boolean tp() {
        return this.fY.get();
    }

    protected void we(Result result) {
        EQ();
    }
}
