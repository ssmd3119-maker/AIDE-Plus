package abcd;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class iw {
    static final Executor j6;

    private static final class a implements Executor {
        private final Handler j6 = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.j6.post(runnable);
        }
    }

    static {
        new a();
        j6 = new yw();
    }
}
