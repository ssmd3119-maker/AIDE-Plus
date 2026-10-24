package com.google.android.gms.internal.ads;

import android.content.Context;

@jg
/* loaded from: classes.dex */
public final class fh extends ch {
    private final Context fY;

    public fh(Context context, hr<zzasi> hrVar, ah ahVar) {
        super(hrVar, ahVar);
        this.fY = context;
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final void DW() {
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final nh FH() {
        Context context = this.fY;
        return li.CO(context, ki.j6(context));
    }
}
