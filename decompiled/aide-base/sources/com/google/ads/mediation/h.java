package com.google.ads.mediation;

import abcd.nu;

/* loaded from: classes.dex */
public final class h extends nu {
    private final /* synthetic */ AbstractAdViewAdapter j6;

    h(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.j6 = abstractAdViewAdapter;
    }

    @Override // abcd.nu
    public final void j6() {
        if (this.j6.zzhw == null || this.j6.zzhx == null) {
            return;
        }
        this.j6.zzhx.ef(this.j6.zzhw.j6());
    }
}
