package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.s10;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class fy {
    public static void DW(h20 h20Var) throws GeneralSecurityException {
        for (s10 s10Var : h20Var.BT()) {
            if (s10Var.BT().isEmpty()) {
                throw new GeneralSecurityException("Missing type_url.");
            }
            if (s10Var.P8().isEmpty()) {
                throw new GeneralSecurityException("Missing primitive_name.");
            }
            if (s10Var.SI().isEmpty()) {
                throw new GeneralSecurityException("Missing catalogue_name.");
            }
            ty.VH(ty.EQ(s10Var.SI()).j6(s10Var.BT(), s10Var.P8(), s10Var.ei()), s10Var.nw());
        }
    }

    public static s10 j6(String str, String str2, String str3, int i, boolean z) {
        s10.a aVarRo = s10.ro();
        aVarRo.U2(str2);
        String strValueOf = String.valueOf(str3);
        aVarRo.lg(strValueOf.length() != 0 ? "type.googleapis.com/google.crypto.tink.".concat(strValueOf) : new String("type.googleapis.com/google.crypto.tink."));
        aVarRo.j3(0);
        aVarRo.XL(true);
        aVarRo.rN(str);
        return (s10) ((r50) aVarRo.Mr());
    }
}
