package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public final class en implements o0 {
    private final /* synthetic */ n0 DW;
    private final /* synthetic */ Context FH;
    private final /* synthetic */ List j6;

    en(bn bnVar, List list, n0 n0Var, Context context) {
        this.j6 = list;
        this.DW = n0Var;
        this.FH = context;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void DW() {
        for (String str : this.j6) {
            String strValueOf = String.valueOf(str);
            xp.gn(strValueOf.length() != 0 ? "Pinging url: ".concat(strValueOf) : new String("Pinging url: "));
            this.DW.FH(Uri.parse(str), null, null);
        }
        this.DW.v5((Activity) this.FH);
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void j6() {
    }
}
