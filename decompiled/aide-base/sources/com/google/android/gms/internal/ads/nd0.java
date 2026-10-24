package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class nd0 extends xd0 {
    private List<Long> gn;

    public nd0(nc0 nc0Var, String str, String str2, sz szVar, int i, int i2) {
        super(nc0Var, str, str2, szVar, i, 31);
        this.gn = null;
    }

    @Override // com.google.android.gms.internal.ads.xd0
    protected final void j6() {
        this.Hw.gW = -1L;
        this.Hw.BT = -1L;
        if (this.gn == null) {
            this.gn = (List) this.v5.invoke(null, this.j6.j6());
        }
        List<Long> list = this.gn;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.Hw) {
            this.Hw.gW = Long.valueOf(this.gn.get(0).longValue());
            this.Hw.BT = Long.valueOf(this.gn.get(1).longValue());
        }
    }
}
