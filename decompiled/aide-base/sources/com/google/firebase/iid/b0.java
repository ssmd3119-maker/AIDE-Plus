package com.google.firebase.iid;

import android.content.Intent;

/* loaded from: classes.dex */
public final class b0 implements Runnable {
    private final /* synthetic */ Intent WB;
    private final /* synthetic */ zzb jw;
    private final /* synthetic */ Intent mb;

    b0(zzb zzbVar, Intent intent, Intent intent2) {
        this.jw = zzbVar;
        this.WB = intent;
        this.mb = intent2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.jw.v5(this.WB);
        this.jw.j6(this.mb);
    }
}
