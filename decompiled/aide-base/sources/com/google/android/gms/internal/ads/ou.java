package com.google.android.gms.internal.ads;

@jg
/* loaded from: classes.dex */
public final class ou extends fu {
    public ou(ss ssVar) {
        super(ssVar);
    }

    @Override // com.google.android.gms.internal.ads.fu
    public final boolean U2(String str) {
        ss ssVar = this.jw.get();
        if (ssVar != null) {
            ssVar.oy(a8(str), this);
        }
        xp.u7("VideoStreamNoopCache is doing nothing.");
        J0(str, a8(str), "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.fu
    public final void gn() {
    }
}
