package abcd;

import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;

/* loaded from: classes.dex */
public class aq0 {
    private SecureRandom DW;
    private sl0 FH;
    private cq0 j6 = new cq0(new vo0());

    class a implements op0 {
        private b j6;

        public a(Signature signature) {
            this.j6 = new b(aq0.this, signature);
        }

        @Override // abcd.op0
        public sl0 FH() {
            return aq0.this.FH;
        }

        @Override // abcd.op0
        public byte[] Hw() {
            try {
                return this.j6.j6();
            } catch (SignatureException e) {
                throw new xp0("exception obtaining signature: " + e.getMessage(), e);
            }
        }

        @Override // abcd.op0
        public OutputStream j6() {
            return this.j6;
        }
    }

    public aq0(String str) {
        this.FH = new qp0().DW(str);
    }

    public op0 DW(PrivateKey privateKey) throws up0, InvalidKeyException {
        try {
            Signature signatureDW = this.j6.DW(this.FH);
            if (this.DW != null) {
                signatureDW.initSign(privateKey, this.DW);
            } else {
                signatureDW.initSign(privateKey);
            }
            return new a(signatureDW);
        } catch (GeneralSecurityException e) {
            throw new up0("cannot create signer: " + e.getMessage(), e);
        }
    }

    public aq0 FH(Provider provider) {
        this.j6 = new cq0(new yo0(provider));
        return this;
    }

    public aq0 Hw(SecureRandom secureRandom) {
        this.DW = secureRandom;
        return this;
    }

    private class b extends OutputStream {
        private Signature WB;

        public b(aq0 aq0Var, Signature signature) {
            this.WB = signature;
        }

        public byte[] j6() {
            return this.WB.sign();
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws SignatureException, wp0 {
            try {
                this.WB.update(bArr, i, i2);
            } catch (SignatureException e) {
                throw new wp0("exception in content signer: " + e.getMessage(), e);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws SignatureException, wp0 {
            try {
                this.WB.update(bArr);
            } catch (SignatureException e) {
                throw new wp0("exception in content signer: " + e.getMessage(), e);
            }
        }

        @Override // java.io.OutputStream
        public void write(int i) throws SignatureException, wp0 {
            try {
                this.WB.update((byte) i);
            } catch (SignatureException e) {
                throw new wp0("exception in content signer: " + e.getMessage(), e);
            }
        }
    }
}
