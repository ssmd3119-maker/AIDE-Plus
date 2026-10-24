package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class cr0 implements Runnable {
    private final /* synthetic */ String WB;
    private final /* synthetic */ bq0 jw;
    private final /* synthetic */ long mb;

    cr0(bq0 bq0Var, String str, long j) {
        this.jw = bq0Var;
        this.WB = str;
        this.mb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.jw.WB.j6(this.WB, this.mb);
        this.jw.WB.DW(this.jw.toString());
    }
}
