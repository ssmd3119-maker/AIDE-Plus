package com.google.android.gms.internal.ads;

@jg
/* loaded from: classes.dex */
public final class cu extends om {
    final ss fY;
    private final String k2;
    final fu qp;

    cu(ss ssVar, fu fuVar, String str) {
        this.fY = ssVar;
        this.qp = fuVar;
        this.k2 = str;
        com.google.android.gms.ads.internal.w0.vy().j6(this);
    }

    @Override // com.google.android.gms.internal.ads.om
    public final void gn() {
        try {
            this.qp.U2(this.k2);
        } finally {
            bn.gn.post(new du(this));
        }
    }

    @Override // com.google.android.gms.internal.ads.om
    public final void v5() {
        this.qp.gn();
    }
}
