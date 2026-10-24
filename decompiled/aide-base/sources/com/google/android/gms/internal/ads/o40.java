package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class o40 {
    private final byte[] DW;
    private final x40 j6;

    private o40(int i) {
        byte[] bArr = new byte[i];
        this.DW = bArr;
        this.j6 = x40.hK(bArr);
    }

    public final x40 DW() {
        return this.j6;
    }

    public final i40 j6() {
        this.j6.XL();
        return new q40(this.DW);
    }

    /* synthetic */ o40(int i, j40 j40Var) {
        this(i);
    }
}
