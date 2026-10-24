package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class op extends Thread {
    private final /* synthetic */ String WB;

    op(np npVar, String str) {
        this.WB = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new bq().j6(this.WB);
    }
}
