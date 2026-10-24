package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class qd0 extends xd0 {
    public qd0(nc0 nc0Var, String str, String str2, sz szVar, int i, int i2) {
        super(nc0Var, str, str2, szVar, i, 51);
    }

    @Override // com.google.android.gms.internal.ads.xd0
    protected final void j6() {
        synchronized (this.Hw) {
            mc0 mc0Var = new mc0((String) this.v5.invoke(null, new Object[0]));
            this.Hw.Mz = mc0Var.DW;
            this.Hw.I = mc0Var.FH;
        }
    }
}
