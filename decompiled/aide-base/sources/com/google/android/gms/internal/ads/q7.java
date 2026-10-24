package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class q7 implements Runnable {
    private final /* synthetic */ String WB;
    private final /* synthetic */ l7 mb;

    q7(l7 l7Var, String str) {
        this.mb = l7Var;
        this.WB = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.mb.WB.loadData(this.WB, "text/html", "UTF-8");
    }
}
