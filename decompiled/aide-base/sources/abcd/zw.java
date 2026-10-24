package abcd;

import com.google.android.gms.common.internal.p;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class zw<TResult> extends gw<TResult> {

    @GuardedBy("mLock")
    private boolean FH;
    private volatile boolean Hw;

    @GuardedBy("mLock")
    private Exception Zo;

    @GuardedBy("mLock")
    private TResult v5;
    private final Object j6 = new Object();
    private final xw<TResult> DW = new xw<>();

    @GuardedBy("mLock")
    private final void Mr() {
        if (this.Hw) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void U2() {
        synchronized (this.j6) {
            if (this.FH) {
                this.DW.j6(this);
            }
        }
    }

    @GuardedBy("mLock")
    private final void aM() {
        p.J0(this.FH, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    private final void j3() {
        p.J0(!this.FH, "Task is already complete");
    }

    @Override // abcd.gw
    public final gw<TResult> DW(Executor executor, cw<TResult> cwVar) {
        this.DW.DW(new qw(executor, cwVar));
        U2();
        return this;
    }

    @Override // abcd.gw
    public final boolean EQ() {
        boolean z;
        synchronized (this.j6) {
            z = this.FH;
        }
        return z;
    }

    @Override // abcd.gw
    public final gw<TResult> FH(Executor executor, dw dwVar) {
        this.DW.DW(new sw(executor, dwVar));
        U2();
        return this;
    }

    @Override // abcd.gw
    public final gw<TResult> Hw(Executor executor, ew<? super TResult> ewVar) {
        this.DW.DW(new uw(executor, ewVar));
        U2();
        return this;
    }

    public final void J0(Exception exc) {
        p.tp(exc, "Exception must not be null");
        synchronized (this.j6) {
            j3();
            this.FH = true;
            this.Zo = exc;
        }
        this.DW.j6(this);
    }

    public final void J8(TResult tresult) {
        synchronized (this.j6) {
            j3();
            this.FH = true;
            this.v5 = tresult;
        }
        this.DW.j6(this);
    }

    public final boolean QX(TResult tresult) {
        synchronized (this.j6) {
            if (this.FH) {
                return false;
            }
            this.FH = true;
            this.v5 = tresult;
            this.DW.j6(this);
            return true;
        }
    }

    @Override // abcd.gw
    public final Exception VH() {
        Exception exc;
        synchronized (this.j6) {
            exc = this.Zo;
        }
        return exc;
    }

    public final boolean Ws(Exception exc) {
        p.tp(exc, "Exception must not be null");
        synchronized (this.j6) {
            if (this.FH) {
                return false;
            }
            this.FH = true;
            this.Zo = exc;
            this.DW.j6(this);
            return true;
        }
    }

    public final boolean XL() {
        synchronized (this.j6) {
            if (this.FH) {
                return false;
            }
            this.FH = true;
            this.Hw = true;
            this.DW.j6(this);
            return true;
        }
    }

    @Override // abcd.gw
    public final <TContinuationResult> gw<TContinuationResult> Zo(Executor executor, aw<TResult, gw<TContinuationResult>> awVar) {
        zw zwVar = new zw();
        this.DW.DW(new mw(executor, awVar, zwVar));
        U2();
        return zwVar;
    }

    @Override // abcd.gw
    public final TResult gn() {
        TResult tresult;
        synchronized (this.j6) {
            aM();
            Mr();
            if (this.Zo != null) {
                throw new fw(this.Zo);
            }
            tresult = this.v5;
        }
        return tresult;
    }

    @Override // abcd.gw
    public final gw<TResult> j6(Executor executor, bw bwVar) {
        this.DW.DW(new ow(executor, bwVar));
        U2();
        return this;
    }

    @Override // abcd.gw
    public final boolean tp() {
        return this.Hw;
    }

    @Override // abcd.gw
    public final <X extends Throwable> TResult u7(Class<X> cls) {
        TResult tresult;
        synchronized (this.j6) {
            aM();
            Mr();
            if (cls.isInstance(this.Zo)) {
                throw cls.cast(this.Zo);
            }
            if (this.Zo != null) {
                throw new fw(this.Zo);
            }
            tresult = this.v5;
        }
        return tresult;
    }

    @Override // abcd.gw
    public final <TContinuationResult> gw<TContinuationResult> v5(Executor executor, aw<TResult, TContinuationResult> awVar) {
        zw zwVar = new zw();
        this.DW.DW(new kw(executor, awVar, zwVar));
        U2();
        return zwVar;
    }

    @Override // abcd.gw
    public final boolean we() {
        boolean z;
        synchronized (this.j6) {
            z = this.FH && !this.Hw && this.Zo == null;
        }
        return z;
    }
}
