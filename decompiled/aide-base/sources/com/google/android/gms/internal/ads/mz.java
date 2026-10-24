package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class mz {
    public static y20 DW(q00 q00Var) throws GeneralSecurityException {
        int i = nz.FH[q00Var.ordinal()];
        if (i == 1) {
            return y20.UNCOMPRESSED;
        }
        if (i == 2) {
            return y20.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        }
        if (i == 3) {
            return y20.COMPRESSED;
        }
        String strValueOf = String.valueOf(q00Var);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 22);
        sb.append("unknown point format: ");
        sb.append(strValueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    public static String FH(f10 f10Var) throws NoSuchAlgorithmException {
        int i = nz.j6[f10Var.ordinal()];
        if (i == 1) {
            return "HmacSha1";
        }
        if (i == 2) {
            return "HmacSha256";
        }
        if (i == 3) {
            return "HmacSha512";
        }
        String strValueOf = String.valueOf(f10Var);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 27);
        sb.append("hash unsupported for HMAC: ");
        sb.append(strValueOf);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    public static void Hw(w00 w00Var) throws GeneralSecurityException {
        v20.Hw(j6(w00Var.er().er()));
        FH(w00Var.er().yS());
        if (w00Var.gW() == q00.UNKNOWN_FORMAT) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        ty.DW(w00Var.yS().er());
    }

    public static x20 j6(e10 e10Var) throws GeneralSecurityException {
        int i = nz.DW[e10Var.ordinal()];
        if (i == 1) {
            return x20.NIST_P256;
        }
        if (i == 2) {
            return x20.NIST_P384;
        }
        if (i == 3) {
            return x20.NIST_P521;
        }
        String strValueOf = String.valueOf(e10Var);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 20);
        sb.append("unknown curve type: ");
        sb.append(strValueOf);
        throw new GeneralSecurityException(sb.toString());
    }
}
