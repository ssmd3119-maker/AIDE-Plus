package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class hm0 implements rl0 {
    private final int DW;
    private final yn0 j6;

    public hm0(yn0 yn0Var) {
        this(yn0Var, 1);
    }

    @Override // com.google.android.gms.internal.ads.rl0
    public final ql0 j6(no0 no0Var, km0 km0Var, int i, int[] iArr, on0 on0Var, int i2, long j, boolean z, boolean z2) {
        return new gm0(no0Var, km0Var, i, iArr, on0Var, i2, this.j6.zzgs(), j, this.DW, z, z2);
    }

    private hm0(yn0 yn0Var, int i) {
        this.j6 = yn0Var;
        this.DW = 1;
    }
}
