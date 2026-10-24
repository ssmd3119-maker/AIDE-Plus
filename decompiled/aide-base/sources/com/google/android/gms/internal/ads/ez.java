package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.c20;
import com.google.android.gms.internal.ads.m10;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class ez implements ky<dy> {
    ez() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.ky
    /* renamed from: VH, reason: merged with bridge method [inline-methods] */
    public final dy Hw(i40 i40Var) throws GeneralSecurityException {
        try {
            c20 c20VarRo = c20.ro(i40Var);
            if (!(c20VarRo instanceof c20)) {
                throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
            }
            r30.DW(c20VarRo.er(), 0);
            String strEr = c20VarRo.ei().er();
            return new dz(c20VarRo.ei().yS(), ny.j6(strEr).j6(strEr));
        } catch (y50 e) {
            throw new GeneralSecurityException("expected serialized KmSEnvelopeAeadKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final String DW() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final m10 FH(i40 i40Var) {
        c20 c20Var = (c20) v5(i40Var);
        m10.a aVarRo = m10.ro();
        aVarRo.U2("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        aVarRo.XL(c20Var.Hw());
        aVarRo.j3(m10.b.REMOTE);
        return (m10) ((r50) aVarRo.Mr());
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final z60 Zo(z60 z60Var) throws GeneralSecurityException {
        if (!(z60Var instanceof e20)) {
            throw new GeneralSecurityException("expected KmsEnvelopeAeadKeyFormat proto");
        }
        c20.a aVarNw = c20.nw();
        aVarNw.XL((e20) z60Var);
        aVarNw.j3(0);
        return (r50) aVarNw.Mr();
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final /* synthetic */ dy j6(z60 z60Var) throws GeneralSecurityException {
        if (!(z60Var instanceof c20)) {
            throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
        }
        c20 c20Var = (c20) z60Var;
        r30.DW(c20Var.er(), 0);
        String strEr = c20Var.ei().er();
        return new dz(c20Var.ei().yS(), ny.j6(strEr).j6(strEr));
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final z60 v5(i40 i40Var) throws GeneralSecurityException {
        try {
            return Zo(e20.P8(i40Var));
        } catch (y50 e) {
            throw new GeneralSecurityException("expected serialized KmsEnvelopeAeadKeyFormat proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final int we() {
        return 0;
    }
}
