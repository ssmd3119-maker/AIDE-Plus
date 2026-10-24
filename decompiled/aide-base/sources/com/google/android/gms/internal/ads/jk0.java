package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;

/* loaded from: classes.dex */
public final class jk0 implements nk0, ok0 {
    private final int AL;
    private final Uri WB;
    private boolean cT;
    private gf0 hK;
    private final hh0 jw;
    private final kk0 k2;
    private final yn0 mb;
    private final Handler qp;
    private ok0 w9;
    private final int fY = -1;
    private final if0 zh = new if0();

    public jk0(Uri uri, yn0 yn0Var, hh0 hh0Var, int i, Handler handler, kk0 kk0Var, String str, int i2) {
        this.WB = uri;
        this.mb = yn0Var;
        this.jw = hh0Var;
        this.qp = handler;
        this.k2 = kk0Var;
        this.AL = i2;
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void DW() {
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void FH(lk0 lk0Var) {
        ((bk0) lk0Var).aM();
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final lk0 Hw(int i, vn0 vn0Var) {
        ro0.j6(i == 0);
        return new bk0(this.WB, this.mb.zzgs(), this.jw.j6(), this.fY, this.qp, this.k2, this, vn0Var, null, this.AL);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void Zo() {
        this.w9 = null;
    }

    @Override // com.google.android.gms.internal.ads.ok0
    public final void j6(gf0 gf0Var, Object obj) {
        boolean z = gf0Var.FH(0, this.zh, false).FH != -9223372036854775807L;
        if (!this.cT || z) {
            this.hK = gf0Var;
            this.cT = z;
            this.w9.j6(gf0Var, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void v5(ke0 ke0Var, boolean z, ok0 ok0Var) {
        this.w9 = ok0Var;
        xk0 xk0Var = new xk0(-9223372036854775807L, false);
        this.hK = xk0Var;
        ok0Var.j6(xk0Var, null);
    }
}
