package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class sy<P> {
    private final byte[] DW;
    private final P j6;

    public sy(P p, byte[] bArr, o10 o10Var, g20 g20Var) {
        this.j6 = p;
        this.DW = Arrays.copyOf(bArr, bArr.length);
    }

    public final byte[] DW() {
        byte[] bArr = this.DW;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final P j6() {
        return this.j6;
    }
}
