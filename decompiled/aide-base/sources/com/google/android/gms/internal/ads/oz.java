package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.g10;
import com.google.android.gms.internal.ads.k00;
import com.google.android.gms.internal.ads.uz;
import com.google.android.gms.internal.ads.yz;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class oz implements q20 {
    private final int DW;
    private k00 FH;
    private uz Hw;
    private final String j6;
    private int v5;

    oz(q10 q10Var) throws GeneralSecurityException {
        String strEr = q10Var.er();
        this.j6 = strEr;
        if (strEr.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                m00 m00VarGW = m00.gW(q10Var.yS());
                this.FH = (k00) ty.u7(q10Var);
                this.DW = m00VarGW.er();
                return;
            } catch (y50 e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        }
        if (!this.j6.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            String strValueOf = String.valueOf(this.j6);
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(strValueOf) : new String("unsupported AEAD DEM key type: "));
        }
        try {
            wz wzVarBT = wz.BT(q10Var.yS());
            this.Hw = (uz) ty.u7(q10Var);
            this.v5 = wzVarBT.er().er();
            this.DW = this.v5 + wzVarBT.yS().er();
        } catch (y50 e2) {
            throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.q20
    public final int DW() {
        return this.DW;
    }

    @Override // com.google.android.gms.internal.ads.q20
    public final dy j6(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.DW) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.j6.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            k00.a aVarEi = k00.ei();
            aVarEi.EQ(this.FH);
            k00.a aVar = aVarEi;
            aVar.j3(i40.a8(bArr, 0, this.DW));
            return (dy) ty.tp(this.j6, (k00) ((r50) aVar.Mr()));
        }
        if (!this.j6.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new GeneralSecurityException("unknown DEM key type");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, this.v5);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, this.v5, this.DW);
        yz.a aVarSI = yz.SI();
        aVarSI.EQ(this.Hw.SI());
        yz.a aVar2 = aVarSI;
        aVar2.U2(i40.lg(bArrCopyOfRange));
        yz yzVar = (yz) ((r50) aVar2.Mr());
        g10.a aVarRo = g10.ro();
        aVarRo.EQ(this.Hw.ro());
        g10.a aVar3 = aVarRo;
        aVar3.XL(i40.lg(bArrCopyOfRange2));
        g10 g10Var = (g10) ((r50) aVar3.Mr());
        uz.a aVarCn = uz.cn();
        aVarCn.U2(this.Hw.er());
        aVarCn.XL(yzVar);
        aVarCn.j3(g10Var);
        return (dy) ty.tp(this.j6, (uz) ((r50) aVarCn.Mr()));
    }
}
