package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class bf implements Runnable {
    private final /* synthetic */ AtomicInteger WB;
    private final /* synthetic */ List fY;
    private final /* synthetic */ fr jw;
    private final /* synthetic */ int mb;

    bf(AtomicInteger atomicInteger, int i, fr frVar, List list) {
        this.WB = atomicInteger;
        this.mb = i;
        this.jw = frVar;
        this.fY = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.WB.incrementAndGet() >= this.mb) {
            try {
                this.jw.FH(te.j3(this.fY));
            } catch (InterruptedException | ExecutionException e) {
                xp.v5("Unable to convert list of futures to a future of list", e);
            }
        }
    }
}
