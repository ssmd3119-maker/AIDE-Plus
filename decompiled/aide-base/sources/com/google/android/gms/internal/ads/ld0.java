package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ld0 extends xd0 {
    private static volatile String gn;
    private static final Object u7 = new Object();

    public ld0(nc0 nc0Var, String str, String str2, sz szVar, int i, int i2) {
        super(nc0Var, str, str2, szVar, i, 1);
    }

    @Override // com.google.android.gms.internal.ads.xd0
    protected final void j6() {
        this.Hw.FH = "E";
        if (gn == null) {
            synchronized (u7) {
                if (gn == null) {
                    gn = (String) this.v5.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.Hw) {
            this.Hw.FH = gn;
        }
    }
}
