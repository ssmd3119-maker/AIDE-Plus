package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class dz implements dy {
    private static final byte[] FH = new byte[0];
    private final dy DW;
    private final q10 j6;

    public dz(q10 q10Var, dy dyVar) {
        this.j6 = q10Var;
        this.DW = dyVar;
    }

    @Override // com.google.android.gms.internal.ads.dy
    public final byte[] j6(byte[] bArr, byte[] bArr2) {
        byte[] bArrGn = ty.u7(this.j6).gn();
        byte[] bArrJ6 = this.DW.j6(bArrGn, FH);
        byte[] bArrJ62 = ((dy) ty.v5(this.j6.er(), bArrGn)).j6(bArr, bArr2);
        return ByteBuffer.allocate(bArrJ6.length + 4 + bArrJ62.length).putInt(bArrJ6.length).put(bArrJ6).put(bArrJ62).array();
    }
}
