package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class iz implements ey<iy> {
    @Override // com.google.android.gms.internal.ads.ey
    public final ky<iy> j6(String str, String str2, int i) throws GeneralSecurityException {
        String lowerCase = str2.toLowerCase();
        char c = 65535;
        if (((lowerCase.hashCode() == 275448849 && lowerCase.equals("hybriddecrypt")) ? (char) 0 : (char) 65535) != 0) {
            throw new GeneralSecurityException(String.format("No support for primitive '%s'.", str2));
        }
        if (str.hashCode() == -80133005 && str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            c = 0;
        }
        if (c != 0) {
            throw new GeneralSecurityException(String.format("No support for primitive 'HybridEncrypt' with key type '%s'.", str));
        }
        fz fzVar = new fz();
        if (i <= 0) {
            return fzVar;
        }
        throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", str, Integer.valueOf(i)));
    }
}
