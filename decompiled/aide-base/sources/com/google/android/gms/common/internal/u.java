package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
public final class u extends f {
    private final /* synthetic */ Intent WB;
    private final /* synthetic */ int jw;
    private final /* synthetic */ Activity mb;

    u(Intent intent, Activity activity, int i) {
        this.WB = intent;
        this.mb = activity;
        this.jw = i;
    }

    @Override // com.google.android.gms.common.internal.f
    public final void DW() {
        Intent intent = this.WB;
        if (intent != null) {
            this.mb.startActivityForResult(intent, this.jw);
        }
    }
}
