package abcd;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class qw<TResult> implements ww<TResult> {
    private final Object DW = new Object();

    @GuardedBy("mLock")
    private cw<TResult> FH;
    private final Executor j6;

    public qw(Executor executor, cw<TResult> cwVar) {
        this.j6 = executor;
        this.FH = cwVar;
    }

    @Override // abcd.ww
    public final void DW(gw<TResult> gwVar) {
        synchronized (this.DW) {
            if (this.FH == null) {
                return;
            }
            this.j6.execute(new rw(this, gwVar));
        }
    }
}
