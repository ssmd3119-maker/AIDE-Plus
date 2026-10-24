package com.google.android.gms.common.api.internal;

import abcd.hw;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class f0 {
    private final ArrayMap<e0<?>, String> DW;
    private final hw<Map<e0<?>, String>> FH;
    private int Hw;
    private final ArrayMap<e0<?>, ConnectionResult> j6;
    private boolean v5;

    public final Set<e0<?>> DW() {
        return this.j6.keySet();
    }

    public final void j6(e0<?> e0Var, ConnectionResult connectionResult, String str) {
        this.j6.put(e0Var, connectionResult);
        this.DW.put(e0Var, str);
        this.Hw--;
        if (!connectionResult.QX()) {
            this.v5 = true;
        }
        if (this.Hw == 0) {
            if (!this.v5) {
                this.FH.FH(this.DW);
            } else {
                this.FH.DW(new com.google.android.gms.common.api.c(this.j6));
            }
        }
    }
}
