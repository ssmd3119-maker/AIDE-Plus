package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.k00;
import com.google.android.gms.internal.ads.m10;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class az implements ky<dy> {
    az() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.ky
    /* renamed from: VH, reason: merged with bridge method [inline-methods] */
    public final dy Hw(i40 i40Var) throws GeneralSecurityException {
        try {
            k00 k00VarRo = k00.ro(i40Var);
            if (!(k00VarRo instanceof k00)) {
                throw new GeneralSecurityException("expected AesGcmKey proto");
            }
            r30.DW(k00VarRo.er(), 0);
            r30.j6(k00VarRo.P8().size());
            return new l20(k00VarRo.P8().j6());
        } catch (y50 unused) {
            throw new GeneralSecurityException("expected AesGcmKey proto");
        }
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final String DW() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final m10 FH(i40 i40Var) {
        k00 k00Var = (k00) v5(i40Var);
        m10.a aVarRo = m10.ro();
        aVarRo.U2("type.googleapis.com/google.crypto.tink.AesGcmKey");
        aVarRo.XL(k00Var.Hw());
        aVarRo.j3(m10.b.SYMMETRIC);
        return (m10) ((r50) aVarRo.Mr());
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final z60 Zo(z60 z60Var) throws GeneralSecurityException {
        if (!(z60Var instanceof m00)) {
            throw new GeneralSecurityException("expected AesGcmKeyFormat proto");
        }
        m00 m00Var = (m00) z60Var;
        r30.j6(m00Var.er());
        k00.a aVarEi = k00.ei();
        aVarEi.j3(i40.lg(l30.FH(m00Var.er())));
        aVarEi.XL(0);
        return (r50) aVarEi.Mr();
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final /* synthetic */ dy j6(z60 z60Var) throws GeneralSecurityException {
        if (!(z60Var instanceof k00)) {
            throw new GeneralSecurityException("expected AesGcmKey proto");
        }
        k00 k00Var = (k00) z60Var;
        r30.DW(k00Var.er(), 0);
        r30.j6(k00Var.P8().size());
        return new l20(k00Var.P8().j6());
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final z60 v5(i40 i40Var) throws GeneralSecurityException {
        try {
            return Zo(m00.gW(i40Var));
        } catch (y50 e) {
            throw new GeneralSecurityException("expected serialized AesGcmKeyFormat proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final int we() {
        return 0;
    }
}
