package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class e8 implements Runnable {
    private final /* synthetic */ o8 WB;
    private final /* synthetic */ u7 jw;
    private final /* synthetic */ j7 mb;

    e8(u7 u7Var, o8 o8Var, j7 j7Var) {
        this.jw = u7Var;
        this.WB = o8Var;
        this.mb = j7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.jw.j6) {
            if (this.WB.FH() != -1 && this.WB.FH() != 1) {
                this.WB.Hw();
                Executor executor = ar.j6;
                j7 j7Var = this.mb;
                j7Var.getClass();
                executor.execute(f8.j6(j7Var));
                sm.we("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}
