package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class id0 implements Callable {
    private final sz DW;
    private final nc0 j6;

    public id0(nc0 nc0Var, sz szVar) {
        this.j6 = nc0Var;
        this.DW = szVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: j6, reason: merged with bridge method [inline-methods] */
    public final Void call() throws ExecutionException, InterruptedException {
        if (this.j6.Mr() != null) {
            this.j6.Mr().get();
        }
        sz szVarJ3 = this.j6.j3();
        if (szVarJ3 == null) {
            return null;
        }
        try {
            synchronized (this.DW) {
                p90.DW(this.DW, p90.VH(szVarJ3));
            }
            return null;
        } catch (o90 unused) {
            return null;
        }
    }
}
