package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class td0 extends xd0 {
    public td0(nc0 nc0Var, String str, String str2, sz szVar, int i, int i2) {
        super(nc0Var, str, str2, szVar, i, 48);
    }

    @Override // com.google.android.gms.internal.ads.xd0
    protected final void j6() {
        this.Hw.vJ = 2;
        boolean zBooleanValue = ((Boolean) this.v5.invoke(null, this.j6.j6())).booleanValue();
        synchronized (this.Hw) {
            if (zBooleanValue) {
                this.Hw.vJ = 1;
            } else {
                this.Hw.vJ = 0;
            }
        }
    }
}
