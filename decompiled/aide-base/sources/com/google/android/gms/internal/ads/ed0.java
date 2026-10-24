package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ed0 extends xd0 {
    public ed0(nc0 nc0Var, String str, String str2, sz szVar, int i, int i2) {
        super(nc0Var, str, str2, szVar, i, 5);
    }

    @Override // com.google.android.gms.internal.ads.xd0
    protected final void j6() {
        this.Hw.VH = -1L;
        this.Hw.gn = -1L;
        int[] iArr = (int[]) this.v5.invoke(null, this.j6.j6());
        synchronized (this.Hw) {
            this.Hw.VH = Long.valueOf(iArr[0]);
            this.Hw.gn = Long.valueOf(iArr[1]);
            if (iArr[2] != Integer.MIN_VALUE) {
                this.Hw.XX = Long.valueOf(iArr[2]);
            }
        }
    }
}
