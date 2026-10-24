package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.util.Arrays;

@jg
/* loaded from: classes.dex */
public final class ls extends ds {
    @Override // com.google.android.gms.internal.ads.ds
    public final zzbdi j6(Context context, ss ssVar, int i, boolean z, d0 d0Var, rs rsVar) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (com.google.android.gms.common.util.o.j6() && (applicationInfo == null || applicationInfo.targetSdkVersion >= 11)) {
            return ((Build.VERSION.SDK_INT >= 16 && i == 2) && Arrays.asList(rsVar.v5.split(",")).contains("3")) ? new ys(context, new us(context, ssVar.sy(), ssVar.gG(), d0Var, ssVar.QO()), ssVar, z, ds.DW(ssVar), rsVar) : new rr(context, z, ds.DW(ssVar), rsVar, new us(context, ssVar.sy(), ssVar.gG(), d0Var, ssVar.QO()));
        }
        return null;
    }
}
