package abcd;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class v70 implements j70 {
    private final j70 j6;
    private final ReentrantLock DW = new ReentrantLock();
    private final Thread FH = Thread.currentThread();
    private final AtomicInteger Hw = new AtomicInteger(0);
    private final AtomicInteger v5 = new AtomicInteger(0);
    private final Semaphore Zo = new Semaphore(0);

    public v70(j70 j70Var) {
        this.j6 = j70Var;
    }

    private void Hw() {
        int andSet = this.v5.getAndSet(0);
        if (andSet > 0) {
            this.j6.v5(andSet);
        }
    }

    private boolean VH() {
        return Thread.currentThread() == this.FH;
    }

    @Override // abcd.j70
    public void DW(int i) {
        if (!VH()) {
            throw new IllegalStateException();
        }
        this.j6.DW(i);
    }

    @Override // abcd.j70
    public void FH() {
        if (!VH()) {
            throw new IllegalStateException();
        }
        this.j6.FH();
    }

    public void Zo() {
        if (this.Hw.decrementAndGet() == 0) {
            this.Zo.release();
        }
    }

    public void gn(int i) {
        this.Hw.addAndGet(i);
    }

    @Override // abcd.j70
    public boolean isCancelled() {
        this.DW.lock();
        try {
            return this.j6.isCancelled();
        } finally {
            this.DW.unlock();
        }
    }

    @Override // abcd.j70
    public void j6(String str, int i) {
        if (!VH()) {
            throw new IllegalStateException();
        }
        this.j6.j6(str, i);
    }

    public void u7() throws InterruptedException {
        while (this.Hw.get() > 0) {
            Hw();
            this.Zo.acquire();
        }
        Hw();
    }

    @Override // abcd.j70
    public void v5(int i) {
        int andAdd = this.v5.getAndAdd(i);
        if (VH()) {
            Hw();
        } else if (andAdd == 0) {
            this.Zo.release();
        }
    }
}
