package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class rd0 extends xd0 {
    private final wc0 gn;
    private long u7;

    public rd0(nc0 nc0Var, String str, String str2, sz szVar, int i, int i2, wc0 wc0Var) {
        super(nc0Var, str, str2, szVar, i, 53);
        this.gn = wc0Var;
        if (wc0Var != null) {
            this.u7 = wc0Var.Hw();
        }
    }

    @Override // com.google.android.gms.internal.ads.xd0
    protected final void j6() {
        if (this.gn != null) {
            this.Hw.ca = (Long) this.v5.invoke(null, Long.valueOf(this.u7));
        }
    }
}
