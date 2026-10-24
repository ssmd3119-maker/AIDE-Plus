package abcd;

import com.google.android.gms.common.internal.p;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class jw {

    interface b extends bw, dw, ew<Object> {
    }

    public static <TResult> TResult DW(gw<TResult> gwVar, long j, TimeUnit timeUnit) throws TimeoutException {
        p.VH();
        p.tp(gwVar, "Task must not be null");
        p.tp(timeUnit, "TimeUnit must not be null");
        if (gwVar.EQ()) {
            return (TResult) v5(gwVar);
        }
        a aVar = new a(null);
        Hw(gwVar, aVar);
        if (aVar.v5(j, timeUnit)) {
            return (TResult) v5(gwVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static <TResult> gw<TResult> FH(TResult tresult) {
        zw zwVar = new zw();
        zwVar.J8(tresult);
        return zwVar;
    }

    private static void Hw(gw<?> gwVar, b bVar) {
        gwVar.Hw(iw.j6, bVar);
        gwVar.FH(iw.j6, bVar);
        gwVar.j6(iw.j6, bVar);
    }

    public static <TResult> TResult j6(gw<TResult> gwVar) throws InterruptedException {
        p.VH();
        p.tp(gwVar, "Task must not be null");
        if (gwVar.EQ()) {
            return (TResult) v5(gwVar);
        }
        a aVar = new a(null);
        Hw(gwVar, aVar);
        aVar.DW();
        return (TResult) v5(gwVar);
    }

    private static <TResult> TResult v5(gw<TResult> gwVar) throws ExecutionException {
        if (gwVar.we()) {
            return gwVar.gn();
        }
        if (gwVar.tp()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(gwVar.VH());
    }

    private static final class a implements b {
        private final CountDownLatch j6;

        private a() {
            this.j6 = new CountDownLatch(1);
        }

        public final void DW() throws InterruptedException {
            this.j6.await();
        }

        @Override // abcd.bw
        public final void FH() {
            this.j6.countDown();
        }

        @Override // abcd.dw
        public final void Hw(Exception exc) {
            this.j6.countDown();
        }

        @Override // abcd.ew
        public final void j6(Object obj) {
            this.j6.countDown();
        }

        public final boolean v5(long j, TimeUnit timeUnit) {
            return this.j6.await(j, timeUnit);
        }

        public /* synthetic */ a(ax axVar) {
            this();
        }
    }
}
