package com.google.android.gms.ads;

import abcd.nu;
import abcd.pu;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.internal.ads.hv0;
import com.google.android.gms.internal.ads.zzzb;

/* loaded from: classes.dex */
public final class InterstitialAd {
    private final zzzb j6;

    public InterstitialAd(Context context) {
        this.j6 = new zzzb(context);
        p.tp(context, "Context cannot be null");
    }

    public final void DW(c cVar) {
        this.j6.u7(cVar.j6());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void FH(a aVar) {
        this.j6.DW(aVar);
        if (aVar != 0 && (aVar instanceof hv0)) {
            this.j6.gn((hv0) aVar);
        } else if (aVar == 0) {
            this.j6.gn(null);
        }
    }

    public final void Hw(nu nuVar) {
        this.j6.FH(nuVar);
    }

    public final void VH(pu puVar) {
        this.j6.Zo(puVar);
    }

    public final void Zo(boolean z) {
        this.j6.v5(z);
    }

    public final void gn() {
        this.j6.VH();
    }

    public final Bundle j6() {
        return this.j6.j6();
    }

    public final void u7(boolean z) {
        this.j6.tp(true);
    }

    public final void v5(String str) {
        this.j6.Hw(str);
    }
}
