package com.google.firebase.components;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class n {
    private final Set<n> DW = new HashSet();
    private final Set<n> FH = new HashSet();
    private final a<?> j6;

    n(a<?> aVar) {
        this.j6 = aVar;
    }

    final void DW(n nVar) {
        this.DW.add(nVar);
    }

    final a<?> FH() {
        return this.j6;
    }

    final void Hw(n nVar) {
        this.FH.add(nVar);
    }

    final boolean VH() {
        return this.DW.isEmpty();
    }

    final boolean Zo() {
        return this.FH.isEmpty();
    }

    final Set<n> j6() {
        return this.DW;
    }

    final void v5(n nVar) {
        this.FH.remove(nVar);
    }
}
