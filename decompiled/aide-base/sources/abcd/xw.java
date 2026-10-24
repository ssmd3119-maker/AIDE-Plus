package abcd;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class xw<TResult> {

    @GuardedBy("mLock")
    private Queue<ww<TResult>> DW;

    @GuardedBy("mLock")
    private boolean FH;
    private final Object j6 = new Object();

    public final void DW(ww<TResult> wwVar) {
        synchronized (this.j6) {
            if (this.DW == null) {
                this.DW = new ArrayDeque();
            }
            this.DW.add(wwVar);
        }
    }

    public final void j6(gw<TResult> gwVar) {
        ww<TResult> wwVarPoll;
        synchronized (this.j6) {
            if (this.DW != null && !this.FH) {
                this.FH = true;
                while (true) {
                    synchronized (this.j6) {
                        wwVarPoll = this.DW.poll();
                        if (wwVarPoll == null) {
                            this.FH = false;
                            return;
                        }
                    }
                    wwVarPoll.DW(gwVar);
                }
            }
        }
    }
}
