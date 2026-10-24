package abcd;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class sw<TResult> implements ww<TResult> {
    private final Object DW = new Object();

    @GuardedBy("mLock")
    private dw FH;
    private final Executor j6;

    public sw(Executor executor, dw dwVar) {
        this.j6 = executor;
        this.FH = dwVar;
    }

    @Override // abcd.ww
    public final void DW(gw<TResult> gwVar) {
        if (gwVar.we() || gwVar.tp()) {
            return;
        }
        synchronized (this.DW) {
            if (this.FH == null) {
                return;
            }
            this.j6.execute(new tw(this, gwVar));
        }
    }
}
