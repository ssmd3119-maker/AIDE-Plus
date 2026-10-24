package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class fm extends om {
    private final /* synthetic */ dm fY;

    fm(dm dmVar) {
        this.fY = dmVar;
    }

    @Override // com.google.android.gms.internal.ads.om
    public final void gn() {
        r rVar = new r(this.fY.Zo, this.fY.VH.WB);
        synchronized (this.fY.j6) {
            try {
                com.google.android.gms.ads.internal.w0.J8();
                u.j6(this.fY.gn, rVar);
            } catch (IllegalArgumentException e) {
                xp.v5("Cannot config CSI reporter.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.om
    public final void v5() {
    }
}
