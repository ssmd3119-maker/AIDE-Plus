package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class gz implements ky<jy> {
    gz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.ky
    /* renamed from: VH, reason: merged with bridge method [inline-methods] */
    public final jy Hw(i40 i40Var) throws GeneralSecurityException {
        try {
            a10 a10VarNw = a10.nw(i40Var);
            if (!(a10VarNw instanceof a10)) {
                throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
            }
            r30.DW(a10VarNw.er(), 0);
            mz.Hw(a10VarNw.SI());
            w00 w00VarSI = a10VarNw.SI();
            c10 c10VarEr = w00VarSI.er();
            return new s20(v20.FH(mz.j6(c10VarEr.er()), a10VarNw.ro().j6(), a10VarNw.cn().j6()), c10VarEr.gW().j6(), mz.FH(c10VarEr.yS()), mz.DW(w00VarSI.gW()), new oz(w00VarSI.yS().er()));
        } catch (y50 e) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPublicKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final String DW() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final m10 FH(i40 i40Var) throws GeneralSecurityException {
        throw new GeneralSecurityException("Not implemented.");
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final z60 Zo(z60 z60Var) throws GeneralSecurityException {
        throw new GeneralSecurityException("Not implemented.");
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final /* synthetic */ jy j6(z60 z60Var) throws GeneralSecurityException {
        if (!(z60Var instanceof a10)) {
            throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
        }
        a10 a10Var = (a10) z60Var;
        r30.DW(a10Var.er(), 0);
        mz.Hw(a10Var.SI());
        w00 w00VarSI = a10Var.SI();
        c10 c10VarEr = w00VarSI.er();
        return new s20(v20.FH(mz.j6(c10VarEr.er()), a10Var.ro().j6(), a10Var.cn().j6()), c10VarEr.gW().j6(), mz.FH(c10VarEr.yS()), mz.DW(w00VarSI.gW()), new oz(w00VarSI.yS().er()));
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final z60 v5(i40 i40Var) throws GeneralSecurityException {
        throw new GeneralSecurityException("Not implemented.");
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final int we() {
        return 0;
    }
}
