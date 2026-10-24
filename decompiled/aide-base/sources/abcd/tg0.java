package abcd;

import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public final class tg0 {
    private final b DW;
    final c FH;
    private final a j6;

    static final class a implements Runnable {
        private Thread WB = Thread.currentThread();
        private boolean jw;
        private long mb;

        private static long FH() {
            return System.currentTimeMillis();
        }

        public synchronized void DW() {
            if (0 == this.mb) {
                Thread.interrupted();
            } else {
                this.mb = 0L;
            }
            notifyAll();
        }

        public synchronized void Hw() {
            if (!this.jw) {
                this.mb = 0L;
                this.jw = true;
                notifyAll();
            }
        }

        public synchronized void j6(int i) {
            if (this.jw) {
                throw new IllegalStateException(JGitText.DW().timerAlreadyTerminated);
            }
            this.WB = Thread.currentThread();
            this.mb = FH() + i;
            notifyAll();
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            while (!this.jw && this.WB.isAlive()) {
                try {
                    if (0 < this.mb) {
                        long jFH = this.mb - FH();
                        if (jFH <= 0) {
                            this.mb = 0L;
                            this.WB.interrupt();
                        } else {
                            wait(jFH);
                        }
                    } else {
                        wait(1000L);
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    static final class b extends Thread {
        public b(String str, a aVar) {
            super(aVar);
            setName(str);
            setDaemon(true);
        }
    }

    private static final class c {
        private final a j6;

        public c(a aVar) {
            this.j6 = aVar;
        }

        public void finalize() {
            this.j6.Hw();
        }
    }

    public tg0(String str) {
        a aVar = new a();
        this.j6 = aVar;
        this.FH = new c(aVar);
        b bVar = new b(str, this.j6);
        this.DW = bVar;
        bVar.start();
    }

    public void DW() {
        this.j6.DW();
    }

    public void FH() throws InterruptedException {
        this.j6.Hw();
        try {
            this.DW.join();
        } catch (InterruptedException unused) {
        }
    }

    public void j6(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().invalidTimeout, Integer.valueOf(i)));
        }
        Thread.interrupted();
        this.j6.j6(i);
    }
}
