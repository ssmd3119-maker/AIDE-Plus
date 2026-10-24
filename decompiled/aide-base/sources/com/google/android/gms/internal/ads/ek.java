package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ek implements Runnable {
    private final /* synthetic */ zzwb WB;
    private final /* synthetic */ dk jw;
    private final /* synthetic */ na mb;

    ek(dk dkVar, zzwb zzwbVar, na naVar) {
        this.jw = dkVar;
        this.WB = zzwbVar;
        this.mb = naVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.jw.J0(this.WB, this.mb);
    }
}
