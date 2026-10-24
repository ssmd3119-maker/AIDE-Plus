package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class xk0 extends gf0 {
    private static final Object v5 = new Object();
    private final long DW;
    private final long FH;
    private final boolean Hw;

    public xk0(long j, boolean z) {
        this(j, j, 0L, 0L, z, false);
    }

    @Override // com.google.android.gms.internal.ads.gf0
    public final if0 FH(int i, if0 if0Var, boolean z) {
        ro0.Zo(i, 0, 1);
        Object obj = z ? v5 : null;
        if0Var.j6(obj, obj, 0, this.DW, 0L, false);
        return if0Var;
    }

    @Override // com.google.android.gms.internal.ads.gf0
    public final int VH() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.gf0
    public final int Zo(Object obj) {
        return v5.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.gf0
    public final int gn() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.gf0
    public final jf0 v5(int i, jf0 jf0Var, boolean z, long j) {
        ro0.Zo(i, 0, 1);
        jf0Var.j6(null, -9223372036854775807L, -9223372036854775807L, this.Hw, false, 0L, this.FH, 0, 0, 0L);
        return jf0Var;
    }

    private xk0(long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.DW = j;
        this.FH = j2;
        this.Hw = z;
    }
}
