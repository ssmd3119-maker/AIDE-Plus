package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: classes.dex */
public final class pf0 {
    private final of0 DW;
    private final Handler j6;

    public pf0(Handler handler, of0 of0Var) {
        Handler handler2;
        if (of0Var != null) {
            ro0.FH(handler);
            handler2 = handler;
        } else {
            handler2 = null;
        }
        this.j6 = handler2;
        this.DW = of0Var;
    }

    public final void DW(int i, long j, long j2) {
        if (this.DW != null) {
            this.j6.post(new tf0(this, i, j, j2));
        }
    }

    public final void FH(String str, long j, long j2) {
        if (this.DW != null) {
            this.j6.post(new rf0(this, str, j, j2));
        }
    }

    public final void Hw(sg0 sg0Var) {
        if (this.DW != null) {
            this.j6.post(new qf0(this, sg0Var));
        }
    }

    public final void VH(int i) {
        if (this.DW != null) {
            this.j6.post(new vf0(this, i));
        }
    }

    public final void Zo(sg0 sg0Var) {
        if (this.DW != null) {
            this.j6.post(new uf0(this, sg0Var));
        }
    }

    public final void v5(zzfs zzfsVar) {
        if (this.DW != null) {
            this.j6.post(new sf0(this, zzfsVar));
        }
    }
}
