package abcd;

import java.io.IOException;
import java.math.BigInteger;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Date;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
public class qq0 {
    private jj0 DW;
    private sl0 FH;
    private String Hw;
    private cm0 j6 = new cm0();
    private gm0 v5 = new gm0();

    private X509Certificate FH(zl0 zl0Var, byte[] bArr) {
        nh0 nh0Var = new nh0();
        nh0Var.j6(zl0Var);
        nh0Var.j6(this.FH);
        nh0Var.j6(new xi0(bArr));
        return new mp0(new dm0(new oj0(nh0Var)));
    }

    private zl0 Hw() {
        if (!this.v5.DW()) {
            this.j6.Hw(this.v5.j6());
        }
        return this.j6.j6();
    }

    public X509Certificate DW(PrivateKey privateKey, String str, SecureRandom secureRandom) throws oq0 {
        zl0 zl0VarHw = Hw();
        try {
            try {
                return FH(zl0VarHw, pq0.j6(this.DW, this.Hw, str, privateKey, secureRandom, zl0VarHw));
            } catch (CertificateParsingException e) {
                throw new oq0("exception producing certificate object", e);
            }
        } catch (IOException e2) {
            throw new oq0("exception encoding TBS cert", e2);
        }
    }

    public void EQ(X500Principal x500Principal) {
        try {
            this.j6.u7(new ip0(x500Principal.getEncoded()));
        } catch (IOException e) {
            throw new IllegalArgumentException("can't process principal: " + e);
        }
    }

    public void VH(Date date) {
        this.j6.gn(new bm0(date));
    }

    public void Zo(Date date) {
        this.j6.DW(new bm0(date));
    }

    public void gn(PublicKey publicKey) {
        try {
            this.j6.tp(yl0.gn(new rh0(publicKey.getEncoded()).we()));
        } catch (Exception e) {
            throw new IllegalArgumentException("unable to process key - " + e.toString());
        }
    }

    public X509Certificate j6(PrivateKey privateKey, String str) {
        return DW(privateKey, str, null);
    }

    public void tp(String str) {
        this.Hw = str;
        try {
            jj0 jj0VarFH = pq0.FH(str);
            this.DW = jj0VarFH;
            sl0 sl0VarHw = pq0.Hw(jj0VarFH, str);
            this.FH = sl0VarHw;
            this.j6.VH(sl0VarHw);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Unknown signature type requested: " + str);
        }
    }

    public void u7(BigInteger bigInteger) {
        if (bigInteger.compareTo(BigInteger.ZERO) <= 0) {
            throw new IllegalArgumentException("serial number must be a positive integer");
        }
        this.j6.Zo(new sh0(bigInteger));
    }

    public void v5(X500Principal x500Principal) {
        try {
            this.j6.v5(new ip0(x500Principal.getEncoded()));
        } catch (IOException e) {
            throw new IllegalArgumentException("can't process principal: " + e);
        }
    }
}
