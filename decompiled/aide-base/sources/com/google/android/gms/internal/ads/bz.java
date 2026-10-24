package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.o00;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class bz implements ky<dy> {
    bz() {
    }

    private static o00 VH() {
        o00.a aVarEi = o00.ei();
        aVarEi.XL(0);
        aVarEi.j3(i40.lg(l30.FH(32)));
        return (o00) ((r50) aVarEi.Mr());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.ky
    /* renamed from: gn, reason: merged with bridge method [inline-methods] */
    public final dy Hw(i40 i40Var) throws GeneralSecurityException {
        try {
            o00 o00VarRo = o00.ro(i40Var);
            if (!(o00VarRo instanceof o00)) {
                throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
            }
            r30.DW(o00VarRo.er(), 0);
            if (o00VarRo.P8().size() == 32) {
                return new o20(o00VarRo.P8().j6());
            }
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        } catch (y50 e) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305 key", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final String DW() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final m10 FH(i40 i40Var) {
        o00 o00VarVH = VH();
        m10.a aVarRo = m10.ro();
        aVarRo.U2("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        aVarRo.XL(o00VarVH.Hw());
        aVarRo.j3(m10.b.SYMMETRIC);
        return (m10) ((r50) aVarRo.Mr());
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final z60 Zo(z60 z60Var) {
        return VH();
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final /* synthetic */ dy j6(z60 z60Var) throws GeneralSecurityException {
        if (!(z60Var instanceof o00)) {
            throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
        }
        o00 o00Var = (o00) z60Var;
        r30.DW(o00Var.er(), 0);
        if (o00Var.P8().size() == 32) {
            return new o20(o00Var.P8().j6());
        }
        throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final z60 v5(i40 i40Var) {
        return VH();
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final int we() {
        return 0;
    }
}
