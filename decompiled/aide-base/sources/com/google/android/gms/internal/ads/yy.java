package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.yz;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class yy implements ky<i30> {
    yy() {
    }

    private static void VH(c00 c00Var) throws GeneralSecurityException {
        if (c00Var.er() < 12 || c00Var.er() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.ky
    /* renamed from: gn, reason: merged with bridge method [inline-methods] */
    public final j20 Hw(i40 i40Var) throws GeneralSecurityException {
        try {
            yz yzVarDx = yz.dx(i40Var);
            if (!(yzVarDx instanceof yz)) {
                throw new GeneralSecurityException("expected AesCtrKey proto");
            }
            r30.DW(yzVarDx.er(), 0);
            r30.j6(yzVarDx.nw().size());
            VH(yzVarDx.ei());
            return new j20(yzVarDx.nw().j6(), yzVarDx.ei().er());
        } catch (y50 e) {
            throw new GeneralSecurityException("expected serialized AesCtrKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final String DW() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final m10 FH(i40 i40Var) {
        yz yzVar = (yz) v5(i40Var);
        m10.a aVarRo = m10.ro();
        aVarRo.U2("type.googleapis.com/google.crypto.tink.AesCtrKey");
        aVarRo.XL(yzVar.Hw());
        aVarRo.j3(m10.b.SYMMETRIC);
        return (m10) ((r50) aVarRo.Mr());
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final z60 Zo(z60 z60Var) throws GeneralSecurityException {
        if (!(z60Var instanceof a00)) {
            throw new GeneralSecurityException("expected AesCtrKeyFormat proto");
        }
        a00 a00Var = (a00) z60Var;
        r30.j6(a00Var.er());
        VH(a00Var.yS());
        yz.a aVarSI = yz.SI();
        aVarSI.XL(a00Var.yS());
        aVarSI.U2(i40.lg(l30.FH(a00Var.er())));
        aVarSI.j3(0);
        return (r50) aVarSI.Mr();
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final /* synthetic */ i30 j6(z60 z60Var) throws GeneralSecurityException {
        if (!(z60Var instanceof yz)) {
            throw new GeneralSecurityException("expected AesCtrKey proto");
        }
        yz yzVar = (yz) z60Var;
        r30.DW(yzVar.er(), 0);
        r30.j6(yzVar.nw().size());
        VH(yzVar.ei());
        return new j20(yzVar.nw().j6(), yzVar.ei().er());
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final z60 v5(i40 i40Var) throws GeneralSecurityException {
        try {
            return Zo(a00.P8(i40Var));
        } catch (y50 e) {
            throw new GeneralSecurityException("expected serialized AesCtrKeyFormat proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final int we() {
        return 0;
    }
}
