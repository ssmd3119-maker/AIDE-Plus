package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class qs0 extends hs0 {
    private MessageDigest FH;
    private final int Hw;
    private final int v5;

    public qs0(int i) {
        int i2 = i / 8;
        this.Hw = i % 8 > 0 ? i2 + 1 : i2;
        this.v5 = i;
    }

    @Override // com.google.android.gms.internal.ads.hs0
    public final byte[] j6(String str) {
        synchronized (this.j6) {
            MessageDigest messageDigestDW = DW();
            this.FH = messageDigestDW;
            if (messageDigestDW == null) {
                return new byte[0];
            }
            messageDigestDW.reset();
            this.FH.update(str.getBytes(Charset.forName("UTF-8")));
            byte[] bArrDigest = this.FH.digest();
            int length = bArrDigest.length > this.Hw ? this.Hw : bArrDigest.length;
            byte[] bArr = new byte[length];
            System.arraycopy(bArrDigest, 0, bArr, 0, length);
            if (this.v5 % 8 > 0) {
                long j = 0;
                for (int i = 0; i < length; i++) {
                    if (i > 0) {
                        j <<= 8;
                    }
                    j += bArr[i] & 255;
                }
                long j2 = j >>> (8 - (this.v5 % 8));
                for (int i2 = this.Hw - 1; i2 >= 0; i2--) {
                    bArr[i2] = (byte) (255 & j2);
                    j2 >>>= 8;
                }
            }
            return bArr;
        }
    }
}
