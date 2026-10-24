package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;

/* loaded from: classes.dex */
public final class wp0 {
    private final vp0 DW;
    private final Handler j6;

    public wp0(Handler handler, vp0 vp0Var) {
        Handler handler2;
        if (vp0Var != null) {
            ro0.FH(handler);
            handler2 = handler;
        } else {
            handler2 = null;
        }
        this.j6 = handler2;
        this.DW = vp0Var;
    }

    public final void DW(int i, int i2, int i3, float f) {
        if (this.DW != null) {
            this.j6.post(new cq0(this, i, i2, i3, f));
        }
    }

    public final void FH(Surface surface) {
        if (this.DW != null) {
            this.j6.post(new dq0(this, surface));
        }
    }

    public final void Hw(String str, long j, long j2) {
        if (this.DW != null) {
            this.j6.post(new yp0(this, str, j, j2));
        }
    }

    public final void VH(sg0 sg0Var) {
        if (this.DW != null) {
            this.j6.post(new eq0(this, sg0Var));
        }
    }

    public final void Zo(zzfs zzfsVar) {
        if (this.DW != null) {
            this.j6.post(new zp0(this, zzfsVar));
        }
    }

    public final void gn(int i, long j) {
        if (this.DW != null) {
            this.j6.post(new aq0(this, i, j));
        }
    }

    public final void v5(sg0 sg0Var) {
        if (this.DW != null) {
            this.j6.post(new xp0(this, sg0Var));
        }
    }
}
