package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class b0 {
    private final d0 DW;
    private final Map<String, a0> j6 = new HashMap();

    public b0(d0 d0Var) {
        this.DW = d0Var;
    }

    public final void DW(String str, String str2, long j) {
        d0 d0Var = this.DW;
        a0 a0Var = this.j6.get(str2);
        String[] strArr = {str};
        if (d0Var != null && a0Var != null) {
            d0Var.j6(a0Var, j, strArr);
        }
        Map<String, a0> map = this.j6;
        d0 d0Var2 = this.DW;
        map.put(str, d0Var2 == null ? null : d0Var2.FH(j));
    }

    public final d0 FH() {
        return this.DW;
    }

    public final void j6(String str, a0 a0Var) {
        this.j6.put(str, a0Var);
    }
}
