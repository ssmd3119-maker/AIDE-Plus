package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class z20 implements dy {
    private final oy DW;
    private final i30 j6;

    public z20(i30 i30Var, oy oyVar, int i) {
        this.j6 = i30Var;
        this.DW = oyVar;
    }

    @Override // com.google.android.gms.internal.ads.dy
    public final byte[] j6(byte[] bArr, byte[] bArr2) {
        byte[] bArrJ6 = this.j6.j6(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return m20.DW(bArrJ6, this.DW.j6(m20.DW(bArr2, bArrJ6, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }
}
