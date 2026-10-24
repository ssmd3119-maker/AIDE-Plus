package abcd;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.PrivateKey;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
public class s00 {
    byte[] j6 = {48, 33};
    byte[] DW = {48, 9, 6, 5, 43, 14, 3, 2, 26, 5, 0};
    byte[] FH = {4, 20};
    MessageDigest v5 = MessageDigest.getInstance("SHA1");
    Cipher Hw = Cipher.getInstance("RSA/ECB/PKCS1Padding");

    public byte[] DW() {
        this.Hw.update(this.j6);
        this.Hw.update(this.DW);
        this.Hw.update(this.FH);
        this.Hw.update(this.v5.digest());
        return this.Hw.doFinal();
    }

    public void FH(byte[] bArr) {
        this.v5.update(bArr);
    }

    public void j6(PrivateKey privateKey) throws InvalidKeyException {
        this.Hw.init(1, privateKey);
    }
}
