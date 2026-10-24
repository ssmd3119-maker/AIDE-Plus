package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.e00;
import com.google.android.gms.internal.ads.m10;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zy implements ky<dy> {
    zy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.ky
    /* renamed from: VH, reason: merged with bridge method [inline-methods] */
    public final dy Hw(i40 i40Var) throws GeneralSecurityException {
        try {
            e00 e00VarCb = e00.cb(i40Var);
            if (!(e00VarCb instanceof e00)) {
                throw new GeneralSecurityException("expected AesEaxKey proto");
            }
            r30.DW(e00VarCb.er(), 0);
            r30.j6(e00VarCb.nw().size());
            if (e00VarCb.SI().er() != 12 && e00VarCb.SI().er() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
            return new k20(e00VarCb.nw().j6(), e00VarCb.SI().er());
        } catch (y50 e) {
            throw new GeneralSecurityException("expected serialized AesEaxKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final String DW() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final m10 FH(i40 i40Var) {
        e00 e00Var = (e00) v5(i40Var);
        m10.a aVarRo = m10.ro();
        aVarRo.U2("type.googleapis.com/google.crypto.tink.AesEaxKey");
        aVarRo.XL(e00Var.Hw());
        aVarRo.j3(m10.b.SYMMETRIC);
        return (m10) ((r50) aVarRo.Mr());
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final z60 Zo(z60 z60Var) throws GeneralSecurityException {
        if (!(z60Var instanceof g00)) {
            throw new GeneralSecurityException("expected AesEaxKeyFormat proto");
        }
        g00 g00Var = (g00) z60Var;
        r30.j6(g00Var.er());
        if (g00Var.yS().er() != 12 && g00Var.yS().er() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
        e00.a aVarRo = e00.ro();
        aVarRo.U2(i40.lg(l30.FH(g00Var.er())));
        aVarRo.XL(g00Var.yS());
        aVarRo.j3(0);
        return (r50) aVarRo.Mr();
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final /* synthetic */ dy j6(z60 z60Var) throws GeneralSecurityException {
        if (!(z60Var instanceof e00)) {
            throw new GeneralSecurityException("expected AesEaxKey proto");
        }
        e00 e00Var = (e00) z60Var;
        r30.DW(e00Var.er(), 0);
        r30.j6(e00Var.nw().size());
        if (e00Var.SI().er() == 12 || e00Var.SI().er() == 16) {
            return new k20(e00Var.nw().j6(), e00Var.SI().er());
        }
        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final z60 v5(i40 i40Var) throws GeneralSecurityException {
        try {
            return Zo(g00.BT(i40Var));
        } catch (y50 e) {
            throw new GeneralSecurityException("expected serialized AesEaxKeyFormat proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final int we() {
        return 0;
    }
}
