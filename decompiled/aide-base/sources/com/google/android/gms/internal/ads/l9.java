package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class l9 implements ir {
    private final /* synthetic */ k8 DW;
    private final /* synthetic */ fr j6;

    l9(j9 j9Var, fr frVar, k8 k8Var) {
        this.j6 = frVar;
        this.DW = k8Var;
    }

    @Override // com.google.android.gms.internal.ads.ir
    public final void run() {
        this.j6.Hw(new w8("Unable to obtain a JavascriptEngine."));
        this.DW.v5();
    }
}
