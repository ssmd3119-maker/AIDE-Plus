package abcd;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class uw<TResult> implements ww<TResult> {
    private final Object DW = new Object();

    @GuardedBy("mLock")
    private ew<? super TResult> FH;
    private final Executor j6;

    public uw(Executor executor, ew<? super TResult> ewVar) {
        this.j6 = executor;
        this.FH = ewVar;
    }

    @Override // abcd.ww
    public final void DW(gw<TResult> gwVar) {
        if (gwVar.we()) {
            synchronized (this.DW) {
                if (this.FH == null) {
                    return;
                }
                this.j6.execute(new vw(this, gwVar));
            }
        }
    }
}
