package com.google.android.gms.internal.ads;

import java.util.Random;

/* loaded from: classes.dex */
public final class k6 extends kw0 {
    private final jw0 WB;

    k6(jw0 jw0Var) {
        this.WB = jw0Var;
    }

    @Override // com.google.android.gms.internal.ads.jw0
    public final void EQ() {
        this.WB.EQ();
    }

    @Override // com.google.android.gms.internal.ads.jw0
    public final void Gj(int i) {
        this.WB.Gj(i);
    }

    @Override // com.google.android.gms.internal.ads.jw0
    public final void fN() {
        if (t6.DW()) {
            int iIntValue = ((Integer) cw0.v5().FH(p.Q6)).intValue();
            int iIntValue2 = ((Integer) cw0.v5().FH(p.kf)).intValue();
            if (iIntValue <= 0 || iIntValue2 < 0) {
                com.google.android.gms.ads.internal.w0.j3().J0();
            } else {
                bn.gn.postDelayed(l6.WB, iIntValue + new Random().nextInt(iIntValue2 + 1));
            }
        }
        this.WB.fN();
    }

    @Override // com.google.android.gms.internal.ads.jw0
    public final void hK() {
        this.WB.hK();
    }

    @Override // com.google.android.gms.internal.ads.jw0
    public final void k2() {
        this.WB.k2();
    }

    @Override // com.google.android.gms.internal.ads.jw0
    public final void ko() {
        this.WB.ko();
    }

    @Override // com.google.android.gms.internal.ads.jw0
    public final void mb() {
        this.WB.mb();
    }
}
