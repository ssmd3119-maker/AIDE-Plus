package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class ie {
    public static wn j6(Context context, com.google.android.gms.ads.internal.a aVar, zl zlVar, vb0 vb0Var, cv cvVar, ka kaVar, je jeVar, d0 d0Var) {
        zzasm zzasmVar = zlVar.DW;
        wn oeVar = zzasmVar.w9 ? new oe(context, zlVar, kaVar, jeVar, d0Var, cvVar) : (zzasmVar.sE || (aVar instanceof com.google.android.gms.ads.internal.c0)) ? (zzasmVar.sE && (aVar instanceof com.google.android.gms.ads.internal.c0)) ? new qe(context, (com.google.android.gms.ads.internal.c0) aVar, zlVar, vb0Var, jeVar, d0Var) : new le(zlVar, jeVar) : (!com.google.android.gms.common.util.o.Zo() || com.google.android.gms.common.util.o.gn() || cvVar == null || !cvVar.aq().v5()) ? new ke(context, zlVar, cvVar, jeVar) : new ne(context, zlVar, cvVar, jeVar);
        String strValueOf = String.valueOf(oeVar.getClass().getName());
        xp.VH(strValueOf.length() != 0 ? "AdRenderer: ".concat(strValueOf) : new String("AdRenderer: "));
        oeVar.VH();
        return oeVar;
    }
}
