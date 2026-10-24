package abcd;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class yw implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
