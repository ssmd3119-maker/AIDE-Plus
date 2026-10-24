package abcd;

import android.os.Process;

/* loaded from: classes.dex */
public final class vu implements Runnable {
    private final Runnable WB;
    private final int mb;

    public vu(Runnable runnable, int i) {
        this.WB = runnable;
        this.mb = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.mb);
        this.WB.run();
    }
}
