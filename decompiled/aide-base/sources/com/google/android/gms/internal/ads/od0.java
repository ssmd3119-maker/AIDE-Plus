package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class od0 extends xd0 {
    private final boolean gn;

    public od0(nc0 nc0Var, String str, String str2, sz szVar, int i, int i2) {
        super(nc0Var, str, str2, szVar, i, 61);
        this.gn = nc0Var.aM();
    }

    @Override // com.google.android.gms.internal.ads.xd0
    protected final void j6() {
        long jLongValue = ((Long) this.v5.invoke(null, this.j6.j6(), Boolean.valueOf(this.gn))).longValue();
        synchronized (this.Hw) {
            this.Hw.yO = Long.valueOf(jLongValue);
        }
    }
}
