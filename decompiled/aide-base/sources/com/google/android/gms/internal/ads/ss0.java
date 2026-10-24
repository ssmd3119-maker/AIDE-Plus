package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class ss0 implements Comparator<gs0> {
    public ss0(rs0 rs0Var) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(gs0 gs0Var, gs0 gs0Var2) {
        gs0 gs0Var3 = gs0Var;
        gs0 gs0Var4 = gs0Var2;
        if (gs0Var3.DW() < gs0Var4.DW()) {
            return -1;
        }
        if (gs0Var3.DW() > gs0Var4.DW()) {
            return 1;
        }
        if (gs0Var3.j6() < gs0Var4.j6()) {
            return -1;
        }
        if (gs0Var3.j6() > gs0Var4.j6()) {
            return 1;
        }
        float fHw = (gs0Var3.Hw() - gs0Var3.DW()) * (gs0Var3.FH() - gs0Var3.j6());
        float fHw2 = (gs0Var4.Hw() - gs0Var4.DW()) * (gs0Var4.FH() - gs0Var4.j6());
        if (fHw > fHw2) {
            return -1;
        }
        return fHw < fHw2 ? 1 : 0;
    }
}
