package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class w9 extends ra {
    private final Object WB = new Object();

    @GuardedBy("mLock")
    private v9 jw;

    @GuardedBy("mLock")
    private ba mb;

    public final void CO(ba baVar) {
        synchronized (this.WB) {
            this.mb = baVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void EQ() {
        synchronized (this.WB) {
            if (this.jw != null) {
                this.jw.Lx();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void Gj(int i) {
        synchronized (this.WB) {
            if (this.mb != null) {
                this.mb.DW(i == 3 ? 1 : 2);
                this.mb = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void MP(zzawd zzawdVar) {
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void PT() {
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void Rf(String str) {
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void U2(String str, String str2) {
        synchronized (this.WB) {
            if (this.jw != null) {
                this.jw.BN(str, str2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void fN() {
        synchronized (this.WB) {
            if (this.jw != null) {
                this.jw.Yx();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void hK() {
        synchronized (this.WB) {
            if (this.jw != null) {
                this.jw.z5();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void k2() {
        synchronized (this.WB) {
            if (this.mb != null) {
                this.mb.DW(0);
                this.mb = null;
            } else {
                if (this.jw != null) {
                    this.jw.ni();
                }
            }
        }
    }

    public final void k6(v9 v9Var) {
        synchronized (this.WB) {
            this.jw = v9Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void ko() {
        synchronized (this.WB) {
            if (this.jw != null) {
                this.jw.e4();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void l3(ta taVar) {
        synchronized (this.WB) {
            if (this.mb != null) {
                this.mb.j6(0, taVar);
                this.mb = null;
            } else {
                if (this.jw != null) {
                    this.jw.ni();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void lp(b3 b3Var, String str) {
        synchronized (this.WB) {
            if (this.jw != null) {
                this.jw.A0(b3Var, str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void mb() {
        synchronized (this.WB) {
            if (this.jw != null) {
                this.jw.qI();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void w9() {
        synchronized (this.WB) {
            if (this.jw != null) {
                this.jw.Yi();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void yO() {
    }
}
