package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.uz;
import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class xy implements ky<dy> {
    static {
        Logger.getLogger(xy.class.getName());
    }

    xy() {
        ty.Zo(new yy());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.ky
    /* renamed from: VH, reason: merged with bridge method [inline-methods] */
    public final dy Hw(i40 i40Var) throws GeneralSecurityException {
        try {
            uz uzVarCb = uz.cb(i40Var);
            if (!(uzVarCb instanceof uz)) {
                throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
            }
            r30.DW(uzVarCb.er(), 0);
            return new z20((i30) ty.tp("type.googleapis.com/google.crypto.tink.AesCtrKey", uzVarCb.SI()), (oy) ty.tp("type.googleapis.com/google.crypto.tink.HmacKey", uzVarCb.ro()), uzVarCb.ro().SI().yS());
        } catch (y50 e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final String DW() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final m10 FH(i40 i40Var) {
        uz uzVar = (uz) v5(i40Var);
        m10.a aVarRo = m10.ro();
        aVarRo.U2("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        aVarRo.XL(uzVar.Hw());
        aVarRo.j3(m10.b.SYMMETRIC);
        return (m10) ((r50) aVarRo.Mr());
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final z60 Zo(z60 z60Var) throws GeneralSecurityException {
        if (!(z60Var instanceof wz)) {
            throw new GeneralSecurityException("expected AesCtrHmacAeadKeyFormat proto");
        }
        wz wzVar = (wz) z60Var;
        yz yzVar = (yz) ty.FH("type.googleapis.com/google.crypto.tink.AesCtrKey", wzVar.er());
        g10 g10Var = (g10) ty.FH("type.googleapis.com/google.crypto.tink.HmacKey", wzVar.yS());
        uz.a aVarCn = uz.cn();
        aVarCn.XL(yzVar);
        aVarCn.j3(g10Var);
        aVarCn.U2(0);
        return (r50) aVarCn.Mr();
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final /* synthetic */ dy j6(z60 z60Var) throws GeneralSecurityException {
        if (!(z60Var instanceof uz)) {
            throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
        }
        uz uzVar = (uz) z60Var;
        r30.DW(uzVar.er(), 0);
        return new z20((i30) ty.tp("type.googleapis.com/google.crypto.tink.AesCtrKey", uzVar.SI()), (oy) ty.tp("type.googleapis.com/google.crypto.tink.HmacKey", uzVar.ro()), uzVar.ro().SI().yS());
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final z60 v5(i40 i40Var) throws GeneralSecurityException {
        try {
            return Zo(wz.BT(i40Var));
        } catch (y50 e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKeyFormat proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ky
    public final int we() {
        return 0;
    }
}
