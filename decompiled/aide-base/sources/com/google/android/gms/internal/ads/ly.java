package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class ly {
    private u10 j6;

    private ly(u10 u10Var) {
        this.j6 = u10Var;
    }

    static final ly j6(u10 u10Var) throws GeneralSecurityException {
        if (u10Var == null || u10Var.gW() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new ly(u10Var);
    }

    final u10 DW() {
        return this.j6;
    }

    public final String toString() {
        return uy.j6(this.j6).toString();
    }
}
