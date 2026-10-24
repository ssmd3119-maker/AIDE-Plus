package com.google.android.gms.ads.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class a1 implements Runnable {
    private final m0 WB;

    private a1(m0 m0Var) {
        this.WB = m0Var;
    }

    static Runnable j6(m0 m0Var) {
        return new a1(m0Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.WB.DW();
    }
}
