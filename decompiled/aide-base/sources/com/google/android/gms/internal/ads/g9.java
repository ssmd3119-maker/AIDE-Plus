package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class g9 {
    private static final ho<j7> DW = new h9();
    private static final ho<j7> FH = new i9();
    private final u7 j6;

    public g9(Context context, zzbbi zzbbiVar, String str) {
        this.j6 = new u7(context, zzbbiVar, str, DW, FH);
    }

    public final <I, O> x8<I, O> j6(String str, a9<I> a9Var, z8<O> z8Var) {
        return new j9(this.j6, str, a9Var, z8Var);
    }
}
