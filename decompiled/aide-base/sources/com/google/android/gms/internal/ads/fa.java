package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class fa implements Callable<aa> {
    private final /* synthetic */ ea DW;
    private final /* synthetic */ x9 j6;

    fa(ea eaVar, x9 x9Var) {
        this.DW = eaVar;
        this.j6 = x9Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: j6, reason: merged with bridge method [inline-methods] */
    public final aa call() {
        synchronized (this.DW.u7) {
            if (this.DW.tp) {
                return null;
            }
            return this.j6.aM(this.DW.Zo, this.DW.VH);
        }
    }
}
