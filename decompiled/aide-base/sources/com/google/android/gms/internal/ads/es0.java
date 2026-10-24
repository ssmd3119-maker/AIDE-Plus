package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

/* loaded from: classes.dex */
public final class es0 implements ValueCallback<String> {
    private final /* synthetic */ cs0 j6;

    es0(cs0 cs0Var) {
        this.j6 = cs0Var;
    }

    @Override // android.webkit.ValueCallback
    public final /* synthetic */ void onReceiveValue(String str) {
        cs0 cs0Var = this.j6;
        cs0Var.qp.FH(cs0Var.mb, cs0Var.jw, str, cs0Var.fY);
    }
}
