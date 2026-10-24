package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

@jg
/* loaded from: classes.dex */
public final class nl implements jr0 {
    private final Context WB;
    private boolean fY;
    private String jw;
    private final Object mb;

    public nl(Context context, String str) {
        this.WB = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.jw = str;
        this.fY = false;
        this.mb = new Object();
    }

    public final void DW(boolean z) {
        if (com.google.android.gms.ads.internal.w0.ei().U2(this.WB)) {
            synchronized (this.mb) {
                if (this.fY == z) {
                    return;
                }
                this.fY = z;
                if (TextUtils.isEmpty(this.jw)) {
                    return;
                }
                if (this.fY) {
                    com.google.android.gms.ads.internal.w0.ei().EQ(this.WB, this.jw);
                } else {
                    com.google.android.gms.ads.internal.w0.ei().we(this.WB, this.jw);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jr0
    public final void J8(ir0 ir0Var) {
        DW(ir0Var.Zo);
    }

    public final void j6(String str) {
        this.jw = str;
    }
}
