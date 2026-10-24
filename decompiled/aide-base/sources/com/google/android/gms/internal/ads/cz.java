package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.y10;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class cz implements ky<dy> {
    cz() {
    }

    private static dy VH(z60 z60Var) throws GeneralSecurityException {
        if (!(z60Var instanceof y10)) {
            throw new GeneralSecurityException("expected KmsAeadKey proto");
        }
        y10 y10Var = (y10) z60Var;
        r30.DW(y10Var.er(), 0);
        String strEr = y10Var.nw().er();
        return ny.j6(strEr).j6(strEr);
    }

    private static dy gn(i40 i40Var) throws GeneralSecurityException {
        try {
            return VH(y10.ei(i40Var));
        } catch (y50 e) {
            throw new GeneralSecurityException("expected KmsAeadKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final String DW() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final m10 FH(i40 i40Var) {
        y10 y10Var = (y10) v5(i40Var);
        m10.a aVarRo = m10.ro();
        aVarRo.U2("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        aVarRo.XL(y10Var.Hw());
        aVarRo.j3(m10.b.REMOTE);
        return (m10) ((r50) aVarRo.Mr());
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final /* synthetic */ dy Hw(i40 i40Var) {
        return gn(i40Var);
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final z60 Zo(z60 z60Var) throws GeneralSecurityException {
        if (!(z60Var instanceof a20)) {
            throw new GeneralSecurityException("expected KmsAeadKeyFormat proto");
        }
        y10.a aVarSI = y10.SI();
        aVarSI.XL((a20) z60Var);
        aVarSI.j3(0);
        return (r50) aVarSI.Mr();
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final /* synthetic */ dy j6(z60 z60Var) {
        return VH(z60Var);
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final z60 v5(i40 i40Var) throws GeneralSecurityException {
        try {
            return Zo(a20.BT(i40Var));
        } catch (y50 e) {
            throw new GeneralSecurityException("expected serialized KmsAeadKeyFormat proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final int we() {
        return 0;
    }
}
