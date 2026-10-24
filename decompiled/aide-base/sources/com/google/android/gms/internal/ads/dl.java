package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class dl implements gq<Void> {
    private final /* synthetic */ vq j6;

    dl(zk zkVar, vq vqVar) {
        this.j6 = vqVar;
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final /* synthetic */ void DW(Void r2) {
        zk.J8.remove(this.j6);
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final void j6(Throwable th) {
        zk.J8.remove(this.j6);
    }
}
