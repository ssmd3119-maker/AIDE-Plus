package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class md0 extends xd0 {
    public md0(nc0 nc0Var, String str, String str2, sz szVar, int i, int i2) {
        super(nc0Var, str, str2, szVar, i, 3);
    }

    @Override // com.google.android.gms.internal.ads.xd0
    protected final void j6() {
        synchronized (this.Hw) {
            zb0 zb0Var = new zb0((String) this.v5.invoke(null, this.j6.j6()));
            synchronized (this.Hw) {
                this.Hw.v5 = Long.valueOf(zb0Var.DW);
                this.Hw.kQ = Long.valueOf(zb0Var.FH);
            }
        }
    }
}
