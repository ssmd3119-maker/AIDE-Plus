package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class fn0 implements on0 {
    private final int DW;
    private final int[] FH;
    private final zzfs[] Hw;
    private int Zo;
    private final yk0 j6;
    private final long[] v5;

    public fn0(yk0 yk0Var, int... iArr) {
        int i = 0;
        ro0.Hw(iArr.length > 0);
        ro0.FH(yk0Var);
        this.j6 = yk0Var;
        int length = iArr.length;
        this.DW = length;
        this.Hw = new zzfs[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.Hw[i2] = yk0Var.j6(iArr[i2]);
        }
        Arrays.sort(this.Hw, new hn0());
        this.FH = new int[this.DW];
        while (true) {
            int i3 = this.DW;
            if (i >= i3) {
                this.v5 = new long[i3];
                return;
            } else {
                this.FH[i] = yk0Var.DW(this.Hw[i]);
                i++;
            }
        }
    }

    private final boolean we(int i, long j) {
        return this.v5[i] > j;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final int DW() {
        return this.FH.length;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final zzfs EQ() {
        return this.Hw[VH()];
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final zzfs Hw(int i) {
        return this.Hw[i];
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final boolean Zo(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zWe = we(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.DW && !zWe) {
            zWe = (i2 == i || we(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zWe) {
            return false;
        }
        long[] jArr = this.v5;
        jArr[i] = Math.max(jArr[i], jElapsedRealtime + 60000);
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fn0 fn0Var = (fn0) obj;
            if (this.j6 == fn0Var.j6 && Arrays.equals(this.FH, fn0Var.FH)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final int gn(int i) {
        return this.FH[i];
    }

    public int hashCode() {
        if (this.Zo == 0) {
            this.Zo = (System.identityHashCode(this.j6) * 31) + Arrays.hashCode(this.FH);
        }
        return this.Zo;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final int j6(zzfs zzfsVar) {
        for (int i = 0; i < this.DW; i++) {
            if (this.Hw[i] == zzfsVar) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final yk0 tp() {
        return this.j6;
    }
}
