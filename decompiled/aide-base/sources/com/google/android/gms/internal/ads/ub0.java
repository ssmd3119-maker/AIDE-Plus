package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class ub0 extends tb0 {
    private ub0(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static ub0 XL(String str, Context context, boolean z) {
        tb0.J8(context, z);
        return new ub0(context, str, z);
    }

    @Override // com.google.android.gms.internal.ads.tb0
    protected final List<Callable<Void>> J0(nc0 nc0Var, Context context, sz szVar, ww wwVar) {
        if (nc0Var.we() == null || !this.sE) {
            return super.J0(nc0Var, context, szVar, wwVar);
        }
        int iVy = nc0Var.vy();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.J0(nc0Var, context, szVar, wwVar));
        arrayList.add(new hd0(nc0Var, "DPtJycwRqj/e0TdTHULzeUhZhWJ1IU3iwhH90sUbn4eYKEdB5HI7UC0PtJgg2RSN", "Ye7G7hL63+8nOBoyCAHdjfK62rvCOKz3+aC1KA/K9CI=", szVar, iVy, 24));
        return arrayList;
    }
}
