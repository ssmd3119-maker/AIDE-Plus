package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class o6 {
    private zzwb DW;
    private final String FH;
    private final int Hw;
    private final LinkedList<p6> j6;
    private boolean v5;

    o6(zzwb zzwbVar, String str, int i) {
        com.google.android.gms.common.internal.p.u7(zzwbVar);
        com.google.android.gms.common.internal.p.u7(str);
        this.j6 = new LinkedList<>();
        this.DW = zzwbVar;
        this.FH = str;
        this.Hw = i;
    }

    final int DW() {
        return this.Hw;
    }

    final int EQ() {
        Iterator<p6> it = this.j6.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().j6()) {
                i++;
            }
        }
        return i;
    }

    final int FH() {
        return this.j6.size();
    }

    final boolean J0() {
        return this.v5;
    }

    final boolean VH(h5 h5Var) {
        p6 p6Var = new p6(this, h5Var);
        this.j6.add(p6Var);
        return p6Var.j6();
    }

    final p6 gn(zzwb zzwbVar) {
        if (zzwbVar != null) {
            this.DW = zzwbVar;
        }
        return this.j6.remove();
    }

    final String j6() {
        return this.FH;
    }

    final int tp() {
        Iterator<p6> it = this.j6.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().v5) {
                i++;
            }
        }
        return i;
    }

    final zzwb u7() {
        return this.DW;
    }

    final void v5(h5 h5Var, zzwb zzwbVar) {
        this.j6.add(new p6(this, h5Var, zzwbVar));
    }

    final void we() {
        this.v5 = true;
    }
}
