package abcd;

import java.security.PrivateKey;
import java.security.cert.X509Certificate;

/* loaded from: classes.dex */
public class o00 {
    X509Certificate DW;
    PrivateKey FH;
    byte[] Hw;
    String j6;

    public o00() {
        this.DW = null;
        this.FH = null;
        this.Hw = null;
    }

    public PrivateKey DW() {
        return this.FH;
    }

    public X509Certificate FH() {
        return this.DW;
    }

    public byte[] Hw() {
        return this.Hw;
    }

    public void VH(X509Certificate x509Certificate) {
        this.DW = x509Certificate;
    }

    public void Zo(PrivateKey privateKey) {
        this.FH = privateKey;
    }

    public void gn(byte[] bArr) {
        this.Hw = bArr;
    }

    public String j6() {
        return this.j6;
    }

    public void v5(String str) {
        this.j6 = str;
    }

    public o00(String str, X509Certificate x509Certificate, PrivateKey privateKey, byte[] bArr) {
        this.DW = null;
        this.FH = null;
        this.Hw = null;
        this.j6 = str;
        this.DW = x509Certificate;
        this.FH = privateKey;
        this.Hw = bArr;
    }
}
