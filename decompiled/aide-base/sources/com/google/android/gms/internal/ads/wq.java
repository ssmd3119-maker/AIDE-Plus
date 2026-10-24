package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

@jg
/* loaded from: classes.dex */
public final class wq {
    private final Object j6 = new Object();
    private final List<Runnable> DW = new ArrayList();
    private boolean FH = false;

    public final void DW() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.j6) {
            if (this.FH) {
                return;
            }
            arrayList.addAll(this.DW);
            this.DW.clear();
            this.FH = true;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
    }

    public final void j6(final Runnable runnable, final Executor executor) {
        synchronized (this.j6) {
            if (this.FH) {
                executor.execute(runnable);
            } else {
                this.DW.add(new Runnable(executor, runnable) { // from class: com.google.android.gms.internal.ads.xq
                    private final Executor WB;
                    private final Runnable mb;

                    {
                        this.WB = executor;
                        this.mb = runnable;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.WB.execute(this.mb);
                    }
                });
            }
        }
    }
}
