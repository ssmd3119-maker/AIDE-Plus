package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class we implements Runnable {
    private final /* synthetic */ fr WB;
    private final /* synthetic */ te jw;
    private final /* synthetic */ String mb;

    we(te teVar, fr frVar, String str) {
        this.jw = teVar;
        this.WB = frVar;
        this.mb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.WB.FH(this.jw.FH.dm().get(this.mb));
    }
}
