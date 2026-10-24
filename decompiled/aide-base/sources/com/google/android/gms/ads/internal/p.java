package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.om;
import com.google.android.gms.internal.ads.yl;

@jg
/* loaded from: classes.dex */
public final class p extends om {
    private final int fY;
    final /* synthetic */ m qp;

    public p(m mVar, int i) {
        this.qp = mVar;
        this.fY = i;
    }

    @Override // com.google.android.gms.internal.ads.om
    public final void gn() {
        boolean z = this.qp.k2.AE;
        w0.v5();
        boolean zSf = bn.Sf(this.qp.k2.jw);
        boolean z2 = this.qp.iW;
        float f = this.qp.eU;
        int i = this.qp.k2.AE ? this.fY : -1;
        boolean z3 = this.qp.e3;
        yl ylVar = this.qp.k2.hK;
        zzaq zzaqVar = new zzaq(z, zSf, z2, f, i, z3, ylVar.dx, ylVar.Sf);
        int requestedOrientation = this.qp.k2.hK.DW.getRequestedOrientation();
        if (requestedOrientation == -1) {
            requestedOrientation = this.qp.k2.hK.gn;
        }
        int i2 = requestedOrientation;
        m mVar = this.qp;
        x0 x0Var = mVar.k2;
        yl ylVar2 = x0Var.hK;
        bn.gn.post(new q(this, new AdOverlayInfoParcel(mVar, mVar, mVar, ylVar2.DW, i2, x0Var.qp, ylVar2.BT, zzaqVar)));
    }

    @Override // com.google.android.gms.internal.ads.om
    public final void v5() {
    }
}
