package abcd;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class ow<TResult> implements ww<TResult> {
    private final Object DW = new Object();

    @GuardedBy("mLock")
    private bw FH;
    private final Executor j6;

    public ow(Executor executor, bw bwVar) {
        this.j6 = executor;
        this.FH = bwVar;
    }

    @Override // abcd.ww
    public final void DW(gw gwVar) {
        if (gwVar.tp()) {
            synchronized (this.DW) {
                if (this.FH == null) {
                    return;
                }
                this.j6.execute(new pw(this));
            }
        }
    }
}
