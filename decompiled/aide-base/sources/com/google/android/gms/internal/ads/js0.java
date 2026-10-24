package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class js0 implements Comparator<ps0> {
    js0(is0 is0Var) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(ps0 ps0Var, ps0 ps0Var2) {
        ps0 ps0Var3 = ps0Var;
        ps0 ps0Var4 = ps0Var2;
        int i = ps0Var3.FH - ps0Var4.FH;
        return i != 0 ? i : (int) (ps0Var3.j6 - ps0Var4.j6);
    }
}
