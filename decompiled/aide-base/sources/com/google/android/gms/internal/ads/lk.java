package com.google.android.gms.internal.ads;

import android.os.Bundle;

@jg
/* loaded from: classes.dex */
public final class lk extends uk {
    private volatile jk WB;
    private volatile qk fY;
    private volatile kk jw;
    private volatile mk mb;

    public lk(kk kkVar) {
        this.jw = kkVar;
    }

    public final void CO(mk mkVar) {
        this.mb = mkVar;
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void K3(abcd.wu wuVar, int i) {
        if (this.mb != null) {
            this.mb.Hw(abcd.xu.g3(wuVar).getClass().getName(), i);
        }
    }

    public final void MU(qk qkVar) {
        this.fY = qkVar;
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void N0(abcd.wu wuVar, int i) {
        if (this.WB != null) {
            this.WB.FH(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void N2(abcd.wu wuVar) {
        if (this.jw != null) {
            this.jw.P8();
        }
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void QM(abcd.wu wuVar, zzawd zzawdVar) {
        if (this.jw != null) {
            this.jw.MP(zzawdVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void Qk(abcd.wu wuVar) {
        if (this.jw != null) {
            this.jw.SI();
        }
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void Rd(abcd.wu wuVar) {
        if (this.jw != null) {
            this.jw.ca();
        }
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void Tc(abcd.wu wuVar) {
        if (this.jw != null) {
            this.jw.ei();
        }
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void ef(Bundle bundle) {
        if (this.fY != null) {
            this.fY.ef(bundle);
        }
    }

    public final void k6(jk jkVar) {
        this.WB = jkVar;
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void kM(abcd.wu wuVar) {
        if (this.mb != null) {
            this.mb.j6(abcd.xu.g3(wuVar).getClass().getName());
        }
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void l2(abcd.wu wuVar) {
        if (this.jw != null) {
            this.jw.Dr();
        }
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void qY(abcd.wu wuVar) {
        if (this.WB != null) {
            this.WB.DW();
        }
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void u9(abcd.wu wuVar) {
        if (this.jw != null) {
            this.jw.Mz();
        }
    }
}
