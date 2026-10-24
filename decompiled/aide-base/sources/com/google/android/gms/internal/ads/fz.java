package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.a10;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.y00;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;

/* loaded from: classes.dex */
public final class fz implements ky<iy> {
    fz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.ky
    /* renamed from: VH, reason: merged with bridge method [inline-methods] */
    public final iy Hw(i40 i40Var) throws GeneralSecurityException {
        try {
            y00 y00VarCb = y00.cb(i40Var);
            if (!(y00VarCb instanceof y00)) {
                throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
            }
            r30.DW(y00VarCb.er(), 0);
            mz.Hw(y00VarCb.SI().SI());
            w00 w00VarSI = y00VarCb.SI().SI();
            c10 c10VarEr = w00VarSI.er();
            x20 x20VarJ6 = mz.j6(c10VarEr.er());
            byte[] bArrJ6 = y00VarCb.nw().j6();
            return new r20((ECPrivateKey) a30.tp.DW("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArrJ6), v20.Hw(x20VarJ6))), c10VarEr.gW().j6(), mz.FH(c10VarEr.yS()), mz.DW(w00VarSI.gW()), new oz(w00VarSI.yS().er()));
        } catch (y50 e) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPrivateKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final String DW() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final m10 FH(i40 i40Var) {
        y00 y00Var = (y00) v5(i40Var);
        m10.a aVarRo = m10.ro();
        aVarRo.U2("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        aVarRo.XL(y00Var.Hw());
        aVarRo.j3(m10.b.ASYMMETRIC_PRIVATE);
        return (m10) ((r50) aVarRo.Mr());
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final z60 Zo(z60 z60Var) throws GeneralSecurityException {
        if (!(z60Var instanceof u00)) {
            throw new GeneralSecurityException("expected EciesAeadHkdfKeyFormat proto");
        }
        u00 u00Var = (u00) z60Var;
        mz.Hw(u00Var.er());
        KeyPair keyPairDW = v20.DW(v20.Hw(mz.j6(u00Var.er().er().er())));
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairDW.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairDW.getPrivate();
        ECPoint w = eCPublicKey.getW();
        a10.a aVarSh = a10.sh();
        aVarSh.lg(0);
        aVarSh.U2(u00Var.er());
        aVarSh.XL(i40.lg(w.getAffineX().toByteArray()));
        aVarSh.j3(i40.lg(w.getAffineY().toByteArray()));
        a10 a10Var = (a10) ((r50) aVarSh.Mr());
        y00.a aVarRo = y00.ro();
        aVarRo.j3(0);
        aVarRo.XL(a10Var);
        aVarRo.U2(i40.lg(eCPrivateKey.getS().toByteArray()));
        return (r50) aVarRo.Mr();
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final /* synthetic */ iy j6(z60 z60Var) throws GeneralSecurityException {
        if (!(z60Var instanceof y00)) {
            throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
        }
        y00 y00Var = (y00) z60Var;
        r30.DW(y00Var.er(), 0);
        mz.Hw(y00Var.SI().SI());
        w00 w00VarSI = y00Var.SI().SI();
        c10 c10VarEr = w00VarSI.er();
        x20 x20VarJ6 = mz.j6(c10VarEr.er());
        byte[] bArrJ6 = y00Var.nw().j6();
        return new r20((ECPrivateKey) a30.tp.DW("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArrJ6), v20.Hw(x20VarJ6))), c10VarEr.gW().j6(), mz.FH(c10VarEr.yS()), mz.DW(w00VarSI.gW()), new oz(w00VarSI.yS().er()));
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final z60 v5(i40 i40Var) throws GeneralSecurityException {
        try {
            return Zo(u00.gW(i40Var));
        } catch (y50 e) {
            throw new GeneralSecurityException("invalid EciesAeadHkdf key format", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final int we() {
        return 0;
    }
}
