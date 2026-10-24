package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;

/* loaded from: classes.dex */
public final class zc0 extends xd0 {
    private final Activity gn;
    private final View u7;

    public zc0(nc0 nc0Var, String str, String str2, sz szVar, int i, int i2, View view, Activity activity) {
        super(nc0Var, str, str2, szVar, i, 62);
        this.u7 = view;
        this.gn = activity;
    }

    @Override // com.google.android.gms.internal.ads.xd0
    protected final void j6() {
        if (this.u7 == null) {
            return;
        }
        boolean zBooleanValue = ((Boolean) cw0.v5().FH(p.BR)).booleanValue();
        Object[] objArr = (Object[]) this.v5.invoke(null, this.u7, this.gn, Boolean.valueOf(zBooleanValue));
        synchronized (this.Hw) {
            this.Hw.XG = Long.valueOf(((Long) objArr[0]).longValue());
            this.Hw.jJ = Long.valueOf(((Long) objArr[1]).longValue());
            if (zBooleanValue) {
                this.Hw.wc = (String) objArr[2];
            }
        }
    }
}
