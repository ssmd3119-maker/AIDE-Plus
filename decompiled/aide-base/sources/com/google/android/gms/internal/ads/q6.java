package com.google.android.gms.internal.ads;

import android.os.Bundle;

@jg
/* loaded from: classes.dex */
public final class q6 {
    private static q6 Zo = new q6();
    private int DW;
    private int FH;
    private int Hw;
    private int j6;
    private int v5;

    public static q6 DW() {
        return Zo;
    }

    public final Bundle EQ() {
        Bundle bundle = new Bundle();
        bundle.putInt("ipl", this.j6);
        bundle.putInt("ipds", this.DW);
        bundle.putInt("ipde", this.FH);
        bundle.putInt("iph", this.Hw);
        bundle.putInt("ipm", this.v5);
        return bundle;
    }

    final void FH() {
        this.DW++;
    }

    final void Hw() {
        this.FH++;
    }

    public final int VH() {
        return this.DW;
    }

    final void Zo() {
        this.v5++;
    }

    public final int gn() {
        return this.FH;
    }

    final void j6(int i) {
        this.j6 += i;
    }

    public final int tp() {
        return this.v5;
    }

    public final int u7() {
        return this.Hw;
    }

    final void v5() {
        this.Hw++;
    }
}
