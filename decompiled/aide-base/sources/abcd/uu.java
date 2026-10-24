package abcd;

import com.google.android.gms.common.internal.p;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class uu implements ThreadFactory {
    private final ThreadFactory DW;
    private final String j6;

    public uu(String str) {
        this(str, 0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.DW.newThread(new vu(runnable, 0));
        threadNewThread.setName(this.j6);
        return threadNewThread;
    }

    private uu(String str, int i) {
        this.DW = Executors.defaultThreadFactory();
        p.tp(str, "Name must not be null");
        this.j6 = str;
    }
}
