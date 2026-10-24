package abcd;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class gx implements Executor {
    static final Executor j6 = new gx();

    private gx() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
