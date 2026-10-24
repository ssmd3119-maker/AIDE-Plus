package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class a8 implements Runnable {
    private final j7 WB;

    private a8(j7 j7Var) {
        this.WB = j7Var;
    }

    static Runnable j6(j7 j7Var) {
        return new a8(j7Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.WB.destroy();
    }
}
