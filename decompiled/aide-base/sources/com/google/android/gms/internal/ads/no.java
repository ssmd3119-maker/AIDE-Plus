package com.google.android.gms.internal.ads;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
public final class no<T> implements eq<Throwable, T> {
    private final /* synthetic */ ro j6;

    no(zzazs zzazsVar, ro roVar) {
        this.j6 = roVar;
    }

    @Override // com.google.android.gms.internal.ads.eq
    public final /* synthetic */ vq j6(Throwable th) {
        Throwable th2 = th;
        xp.Hw("Error occurred while dispatching http response in getter.", th2);
        com.google.android.gms.ads.internal.w0.u7().v5(th2, "HttpGetter.deliverResponse.1");
        return jq.J0(this.j6.j6());
    }
}
