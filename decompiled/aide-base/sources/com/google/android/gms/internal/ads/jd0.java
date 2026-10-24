package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class jd0 extends xd0 {
    private static volatile Long gn;
    private static final Object u7 = new Object();

    public jd0(nc0 nc0Var, String str, String str2, sz szVar, int i, int i2) {
        super(nc0Var, str, str2, szVar, i, 22);
    }

    @Override // com.google.android.gms.internal.ads.xd0
    protected final void j6() {
        if (gn == null) {
            synchronized (u7) {
                if (gn == null) {
                    gn = (Long) this.v5.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.Hw) {
            this.Hw.lg = gn;
        }
    }
}
