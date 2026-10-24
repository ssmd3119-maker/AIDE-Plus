package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.internal.ads.zzwb;
import java.lang.ref.WeakReference;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class m0 {
    private final Runnable DW;
    private zzwb FH;
    private boolean Hw;
    private long Zo;
    private final o0 j6;
    private boolean v5;

    public m0(a aVar) {
        this(aVar, new o0(bn.gn));
    }

    static /* synthetic */ boolean v5(m0 m0Var, boolean z) {
        m0Var.Hw = false;
        return false;
    }

    public final void DW() {
        this.v5 = true;
        if (this.Hw) {
            this.j6.DW(this.DW);
        }
    }

    public final void FH() {
        this.v5 = false;
        if (this.Hw) {
            this.Hw = false;
            Hw(this.FH, this.Zo);
        }
    }

    public final void Hw(zzwb zzwbVar, long j) {
        if (this.Hw) {
            xp.u7("An ad refresh is already scheduled.");
            return;
        }
        this.FH = zzwbVar;
        this.Hw = true;
        this.Zo = j;
        if (this.v5) {
            return;
        }
        StringBuilder sb = new StringBuilder(65);
        sb.append("Scheduling ad refresh ");
        sb.append(j);
        sb.append(" milliseconds from now.");
        xp.gn(sb.toString());
        this.j6.j6(this.DW, j);
    }

    public final void VH(zzwb zzwbVar) {
        this.FH = zzwbVar;
    }

    public final void gn(zzwb zzwbVar) {
        Hw(zzwbVar, 60000L);
    }

    public final void j6() {
        this.Hw = false;
        this.j6.DW(this.DW);
    }

    public final boolean tp() {
        return this.Hw;
    }

    public final void u7() {
        Bundle bundle;
        this.v5 = false;
        this.Hw = false;
        zzwb zzwbVar = this.FH;
        if (zzwbVar != null && (bundle = zzwbVar.jw) != null) {
            bundle.remove("_ad");
        }
        Hw(this.FH, 0L);
    }

    private m0(a aVar, o0 o0Var) {
        this.Hw = false;
        this.v5 = false;
        this.Zo = 0L;
        this.j6 = o0Var;
        this.DW = new n0(this, new WeakReference(aVar));
    }
}
