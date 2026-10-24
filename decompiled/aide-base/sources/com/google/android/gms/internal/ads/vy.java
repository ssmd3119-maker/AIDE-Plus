package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class vy implements ey<dy> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.ey
    public final ky<dy> j6(String str, String str2, int i) throws GeneralSecurityException {
        ky<dy> xyVar;
        String lowerCase = str2.toLowerCase();
        char c = 65535;
        if (((lowerCase.hashCode() == 2989895 && lowerCase.equals("aead")) ? (char) 0 : (char) 65535) != 0) {
            throw new GeneralSecurityException(String.format("No support for primitive '%s'.", str2));
        }
        switch (str.hashCode()) {
            case 360753376:
                if (str.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    c = 3;
                    break;
                }
                break;
            case 1215885937:
                if (str.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    c = 0;
                    break;
                }
                break;
            case 1469984853:
                if (str.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    c = 4;
                    break;
                }
                break;
            case 1797113348:
                if (str.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    c = 1;
                    break;
                }
                break;
            case 1855890991:
                if (str.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    c = 2;
                    break;
                }
                break;
            case 2079211877:
                if (str.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    c = 5;
                    break;
                }
                break;
        }
        if (c == 0) {
            xyVar = new xy();
        } else if (c == 1) {
            xyVar = new zy();
        } else if (c == 2) {
            xyVar = new az();
        } else if (c == 3) {
            xyVar = new bz();
        } else if (c == 4) {
            xyVar = new cz();
        } else {
            if (c != 5) {
                throw new GeneralSecurityException(String.format("No support for primitive 'Aead' with key type '%s'.", str));
            }
            xyVar = new ez();
        }
        if (xyVar.we() >= i) {
            return xyVar;
        }
        throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", str, Integer.valueOf(i)));
    }
}
