package com.google.android.gms.internal.ads;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class u30 {
    private final ConcurrentHashMap<v30, List<Throwable>> j6 = new ConcurrentHashMap<>(16, 0.75f, 10);
    private final ReferenceQueue<Throwable> DW = new ReferenceQueue<>();

    u30() {
    }

    public final List<Throwable> j6(Throwable th, boolean z) {
        Reference<? extends Throwable> referencePoll = this.DW.poll();
        while (referencePoll != null) {
            this.j6.remove(referencePoll);
            referencePoll = this.DW.poll();
        }
        return this.j6.get(new v30(th, null));
    }
}
