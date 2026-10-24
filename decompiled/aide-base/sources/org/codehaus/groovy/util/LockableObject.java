package org.codehaus.groovy.util;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/* loaded from: classes.dex */
public class LockableObject extends AbstractQueuedSynchronizer {
    transient Thread WB;

    public final void DW() {
        release(1);
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    protected final boolean isHeldExclusively() {
        return getState() != 0 && this.WB == Thread.currentThread();
    }

    public final void j6() {
        if (compareAndSetState(0, 1)) {
            this.WB = Thread.currentThread();
        } else {
            acquire(1);
        }
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    protected final boolean tryAcquire(int i) {
        Thread threadCurrentThread = Thread.currentThread();
        int state = getState();
        if (state == 0) {
            if (compareAndSetState(0, i)) {
                this.WB = threadCurrentThread;
                return true;
            }
        } else if (threadCurrentThread == this.WB) {
            setState(state + i);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    protected final boolean tryRelease(int i) {
        int state = getState() - i;
        if (Thread.currentThread() != this.WB) {
            throw new IllegalMonitorStateException();
        }
        boolean z = false;
        if (state == 0) {
            z = true;
            this.WB = null;
        }
        setState(state);
        return z;
    }
}
