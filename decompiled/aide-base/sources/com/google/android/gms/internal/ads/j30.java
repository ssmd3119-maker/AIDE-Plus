package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class j30 implements oy {
    private final int DW;
    private final String FH;
    private final Key Hw;
    private Mac j6;

    public j30(String str, Key key, int i) throws GeneralSecurityException {
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        char c = 65535;
        int iHashCode = str.hashCode();
        if (iHashCode != -1823053428) {
            if (iHashCode != 392315118) {
                if (iHashCode == 392317873 && str.equals("HMACSHA512")) {
                    c = 2;
                }
            } else if (str.equals("HMACSHA256")) {
                c = 1;
            }
        } else if (str.equals("HMACSHA1")) {
            c = 0;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    String strValueOf = String.valueOf(str);
                    throw new NoSuchAlgorithmException(strValueOf.length() != 0 ? "unknown Hmac algorithm: ".concat(strValueOf) : new String("unknown Hmac algorithm: "));
                }
                if (i > 64) {
                    throw new InvalidAlgorithmParameterException("tag size too big");
                }
            } else if (i > 32) {
                throw new InvalidAlgorithmParameterException("tag size too big");
            }
        } else if (i > 20) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.FH = str;
        this.DW = i;
        this.Hw = key;
        Mac macDW = a30.VH.DW(str);
        this.j6 = macDW;
        macDW.init(key);
    }

    @Override // com.google.android.gms.internal.ads.oy
    public final byte[] j6(byte[] bArr) throws IllegalStateException, GeneralSecurityException {
        Mac macDW;
        try {
            macDW = (Mac) this.j6.clone();
        } catch (CloneNotSupportedException unused) {
            macDW = a30.VH.DW(this.FH);
            macDW.init(this.Hw);
        }
        macDW.update(bArr);
        byte[] bArr2 = new byte[this.DW];
        System.arraycopy(macDW.doFinal(), 0, bArr2, 0, this.DW);
        return bArr2;
    }
}
