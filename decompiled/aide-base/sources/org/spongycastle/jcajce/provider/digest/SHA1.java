package org.spongycastle.jcajce.provider.digest;

import abcd.ao0;
import abcd.cp0;
import abcd.fl0;
import abcd.hl0;
import abcd.xk0;

/* loaded from: classes.dex */
public class SHA1 {

    public static class Digest extends a implements Cloneable {
        public Digest() {
            super(new ao0());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.WB = new ao0((ao0) this.WB);
            return digest;
        }
    }

    public static class Mappings extends b {
        private static final String j6 = SHA1.class.getName();

        @Override // abcd.fp0
        public void configure(cp0 cp0Var) {
            cp0Var.j6("MessageDigest.SHA-1", String.valueOf(j6) + "$Digest");
            cp0Var.j6("Alg.Alias.MessageDigest.SHA1", "SHA-1");
            cp0Var.j6("Alg.Alias.MessageDigest.SHA", "SHA-1");
            cp0Var.j6("Alg.Alias.MessageDigest." + fl0.Hw, "SHA-1");
            j6(cp0Var, "SHA1", String.valueOf(j6) + "$HashMac", String.valueOf(j6) + "$KeyGenerator");
            DW(cp0Var, "SHA1", hl0.nw);
            DW(cp0Var, "SHA1", xk0.DW);
        }
    }
}
