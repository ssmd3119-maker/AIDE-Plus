package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;

/* loaded from: classes.dex */
public final class e0<O extends a.d> {
    private final int DW;
    private final com.google.android.gms.common.api.a<O> FH;
    private final O Hw;
    private final boolean j6;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return !this.j6 && !e0Var.j6 && com.google.android.gms.common.internal.o.j6(this.FH, e0Var.FH) && com.google.android.gms.common.internal.o.j6(this.Hw, e0Var.Hw);
    }

    public final int hashCode() {
        return this.DW;
    }

    public final String j6() {
        return this.FH.j6();
    }
}
