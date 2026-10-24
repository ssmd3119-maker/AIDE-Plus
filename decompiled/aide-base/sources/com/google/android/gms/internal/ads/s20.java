package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* loaded from: classes.dex */
public final class s20 implements jy {
    private static final byte[] Zo = new byte[0];
    private final String DW;
    private final byte[] FH;
    private final y20 Hw;
    private final t20 j6;
    private final q20 v5;

    public s20(ECPublicKey eCPublicKey, byte[] bArr, String str, y20 y20Var, q20 q20Var) throws GeneralSecurityException {
        v20.Zo(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.j6 = new t20(eCPublicKey);
        this.FH = bArr;
        this.DW = str;
        this.Hw = y20Var;
        this.v5 = q20Var;
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final byte[] j6(byte[] bArr, byte[] bArr2) throws IllegalStateException, GeneralSecurityException {
        u20 u20VarJ6 = this.j6.j6(this.DW, this.FH, bArr2, this.v5.DW(), this.Hw);
        byte[] bArrJ6 = this.v5.j6(u20VarJ6.DW()).j6(bArr, Zo);
        byte[] bArrJ62 = u20VarJ6.j6();
        return ByteBuffer.allocate(bArrJ62.length + bArrJ6.length).put(bArrJ62).put(bArrJ6).array();
    }
}
