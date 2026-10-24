package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;

@TargetApi(19)
/* loaded from: classes.dex */
public class sn extends qn {
    @Override // com.google.android.gms.internal.ads.qn, com.google.android.gms.internal.ads.jn
    public final boolean DW(View view) {
        return view.isAttachedToWindow();
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final ViewGroup.LayoutParams rN() {
        return new ViewGroup.LayoutParams(-1, -1);
    }
}
