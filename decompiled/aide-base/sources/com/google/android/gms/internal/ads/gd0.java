package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class gd0 extends xd0 {
    private long gn;

    public gd0(nc0 nc0Var, String str, String str2, sz szVar, long j, int i, int i2) {
        super(nc0Var, str, str2, szVar, i, 25);
        this.gn = j;
    }

    @Override // com.google.android.gms.internal.ads.xd0
    protected final void j6() {
        long jLongValue = ((Long) this.v5.invoke(null, new Object[0])).longValue();
        synchronized (this.Hw) {
            this.Hw.ye = Long.valueOf(jLongValue);
            if (this.gn != 0) {
                this.Hw.j3 = Long.valueOf(jLongValue - this.gn);
                this.Hw.rN = Long.valueOf(this.gn);
            }
        }
    }
}
