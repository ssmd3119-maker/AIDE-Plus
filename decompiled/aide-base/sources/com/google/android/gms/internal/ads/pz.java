package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.g10;
import com.google.android.gms.internal.ads.m10;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class pz implements ky<oy> {
    pz() {
    }

    private static void VH(k10 k10Var) throws GeneralSecurityException {
        if (k10Var.yS() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i = qz.j6[k10Var.er().ordinal()];
        if (i == 1) {
            if (k10Var.yS() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i == 2) {
            if (k10Var.yS() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (i != 3) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (k10Var.yS() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.ky
    /* renamed from: gn, reason: merged with bridge method [inline-methods] */
    public final oy Hw(i40 i40Var) throws GeneralSecurityException {
        try {
            g10 g10VarEi = g10.ei(i40Var);
            if (!(g10VarEi instanceof g10)) {
                throw new GeneralSecurityException("expected HmacKey proto");
            }
            r30.DW(g10VarEi.er(), 0);
            if (g10VarEi.nw().size() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            VH(g10VarEi.SI());
            f10 f10VarEr = g10VarEi.SI().er();
            SecretKeySpec secretKeySpec = new SecretKeySpec(g10VarEi.nw().j6(), "HMAC");
            int iYS = g10VarEi.SI().yS();
            int i = qz.j6[f10VarEr.ordinal()];
            if (i == 1) {
                return new j30("HMACSHA1", secretKeySpec, iYS);
            }
            if (i == 2) {
                return new j30("HMACSHA256", secretKeySpec, iYS);
            }
            if (i == 3) {
                return new j30("HMACSHA512", secretKeySpec, iYS);
            }
            throw new GeneralSecurityException("unknown hash");
        } catch (y50 e) {
            throw new GeneralSecurityException("expected serialized HmacKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final String DW() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final m10 FH(i40 i40Var) {
        g10 g10Var = (g10) v5(i40Var);
        m10.a aVarRo = m10.ro();
        aVarRo.U2("type.googleapis.com/google.crypto.tink.HmacKey");
        aVarRo.XL(g10Var.Hw());
        aVarRo.j3(m10.b.SYMMETRIC);
        return (m10) ((r50) aVarRo.Mr());
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final z60 Zo(z60 z60Var) throws GeneralSecurityException {
        if (!(z60Var instanceof i10)) {
            throw new GeneralSecurityException("expected HmacKeyFormat proto");
        }
        i10 i10Var = (i10) z60Var;
        if (i10Var.er() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        VH(i10Var.gW());
        g10.a aVarRo = g10.ro();
        aVarRo.U2(0);
        aVarRo.j3(i10Var.gW());
        aVarRo.XL(i40.lg(l30.FH(i10Var.er())));
        return (r50) aVarRo.Mr();
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final /* synthetic */ oy j6(z60 z60Var) throws GeneralSecurityException {
        if (!(z60Var instanceof g10)) {
            throw new GeneralSecurityException("expected HmacKey proto");
        }
        g10 g10Var = (g10) z60Var;
        r30.DW(g10Var.er(), 0);
        if (g10Var.nw().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        VH(g10Var.SI());
        f10 f10VarEr = g10Var.SI().er();
        SecretKeySpec secretKeySpec = new SecretKeySpec(g10Var.nw().j6(), "HMAC");
        int iYS = g10Var.SI().yS();
        int i = qz.j6[f10VarEr.ordinal()];
        if (i == 1) {
            return new j30("HMACSHA1", secretKeySpec, iYS);
        }
        if (i == 2) {
            return new j30("HMACSHA256", secretKeySpec, iYS);
        }
        if (i == 3) {
            return new j30("HMACSHA512", secretKeySpec, iYS);
        }
        throw new GeneralSecurityException("unknown hash");
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final z60 v5(i40 i40Var) throws GeneralSecurityException {
        try {
            return Zo(i10.yS(i40Var));
        } catch (y50 e) {
            throw new GeneralSecurityException("expected serialized HmacKeyFormat proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final int we() {
        return 0;
    }
}
