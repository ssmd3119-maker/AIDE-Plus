package abcd;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
public class mp0 extends X509Certificate {
    private dm0 WB;
    private boolean fY;
    private boolean[] jw;
    private tl0 mb;
    private int qp;

    public mp0(dm0 dm0Var) throws CertificateParsingException {
        new bp0();
        this.WB = dm0Var;
        try {
            byte[] bArrFH = FH("2.5.29.19");
            if (bArrFH != null) {
                this.mb = tl0.VH(ai0.tp(bArrFH));
            }
            try {
                byte[] bArrFH2 = FH("2.5.29.15");
                if (bArrFH2 == null) {
                    this.jw = null;
                    return;
                }
                xi0 xi0VarXL = xi0.XL(ai0.tp(bArrFH2));
                byte[] bArrQX = xi0VarXL.QX();
                int length = (bArrQX.length * 8) - xi0VarXL.j3();
                int i = 9;
                if (length >= 9) {
                    i = length;
                }
                this.jw = new boolean[i];
                for (int i2 = 0; i2 != length; i2++) {
                    this.jw[i2] = (bArrQX[i2 / 8] & (128 >>> (i2 % 8))) != 0;
                }
            } catch (Exception e) {
                throw new CertificateParsingException("cannot construct KeyUsage: " + e);
            }
        } catch (Exception e2) {
            throw new CertificateParsingException("cannot construct BasicConstraints: " + e2);
        }
    }

    private void DW(PublicKey publicKey, Signature signature) throws NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, CertificateException, InvalidAlgorithmParameterException {
        if (!Hw(this.WB.EQ(), this.WB.Ws().J0())) {
            throw new CertificateException("signature algorithm in TBS cert not same as outer cert");
        }
        np0.FH(signature, this.WB.EQ().EQ());
        signature.initVerify(publicKey);
        signature.update(getTBSCertificate());
        if (!signature.verify(getSignature())) {
            throw new SignatureException("certificate does not verify with supplied key");
        }
    }

    private byte[] FH(String str) {
        em0 em0VarVH;
        fm0 fm0VarGn = this.WB.Ws().gn();
        if (fm0VarGn == null || (em0VarVH = fm0VarGn.VH(new jj0(str))) == null) {
            return null;
        }
        return em0VarVH.DW().Ws();
    }

    private boolean Hw(sl0 sl0Var, sl0 sl0Var2) {
        if (sl0Var.tp().equals(sl0Var2.tp())) {
            return sl0Var.EQ() == null ? sl0Var2.EQ() == null || sl0Var2.EQ().equals(hj0.WB) : sl0Var2.EQ() == null ? sl0Var.EQ() == null || sl0Var.EQ().equals(hj0.WB) : sl0Var.EQ().equals(sl0Var2.EQ());
        }
        return false;
    }

    private int j6() {
        try {
            byte[] encoded = getEncoded();
            int i = 0;
            for (int i2 = 1; i2 < encoded.length; i2++) {
                i += encoded[i2] * i2;
            }
            return i;
        } catch (CertificateEncodingException unused) {
            return 0;
        }
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() throws CertificateNotYetValidException, CertificateExpiredException {
        checkValidity(new Date());
    }

    @Override // java.security.cert.Certificate
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Certificate)) {
            return false;
        }
        try {
            return dq0.j6(getEncoded(), ((Certificate) obj).getEncoded());
        } catch (CertificateEncodingException unused) {
            return false;
        }
    }

    @Override // java.security.cert.X509Certificate
    public int getBasicConstraints() {
        tl0 tl0Var = this.mb;
        if (tl0Var == null || !tl0Var.u7()) {
            return -1;
        }
        if (this.mb.gn() == null) {
            return Integer.MAX_VALUE;
        }
        return this.mb.gn().intValue();
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        HashSet hashSet = new HashSet();
        fm0 fm0VarGn = this.WB.Ws().gn();
        if (fm0VarGn == null) {
            return null;
        }
        Enumeration enumerationU7 = fm0VarGn.u7();
        while (enumerationU7.hasMoreElements()) {
            jj0 jj0Var = (jj0) enumerationU7.nextElement();
            if (fm0VarGn.VH(jj0Var).FH()) {
                hashSet.add(jj0Var.XL());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() throws CertificateEncodingException {
        try {
            return this.WB.Zo("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public List getExtendedKeyUsage() throws CertificateParsingException {
        byte[] bArrFH = FH("2.5.29.37");
        if (bArrFH == null) {
            return null;
        }
        try {
            bi0 bi0Var = (bi0) new rh0(bArrFH).we();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i != bi0Var.j3(); i++) {
                arrayList.add(((jj0) bi0Var.XL(i)).XL());
            }
            return Collections.unmodifiableList(arrayList);
        } catch (Exception unused) {
            throw new CertificateParsingException("error processing extended key usage extension");
        }
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        em0 em0VarVH;
        fm0 fm0VarGn = this.WB.Ws().gn();
        if (fm0VarGn == null || (em0VarVH = fm0VarGn.VH(new jj0(str))) == null) {
            return null;
        }
        try {
            return em0VarVH.DW().v5();
        } catch (Exception e) {
            throw new IllegalStateException("error parsing " + e.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public Principal getIssuerDN() {
        try {
            return new ip0(ol0.VH(this.WB.gn().v5()));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
        xi0 xi0VarEQ = this.WB.Ws().EQ();
        if (xi0VarEQ == null) {
            return null;
        }
        byte[] bArrQX = xi0VarEQ.QX();
        int length = (bArrQX.length * 8) - xi0VarEQ.j3();
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = (bArrQX[i / 8] & (128 >>> (i % 8))) != 0;
        }
        return zArr;
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new yh0(byteArrayOutputStream).tp(this.WB.gn());
            return new X500Principal(byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
        return this.jw;
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        HashSet hashSet = new HashSet();
        fm0 fm0VarGn = this.WB.Ws().gn();
        if (fm0VarGn == null) {
            return null;
        }
        Enumeration enumerationU7 = fm0VarGn.u7();
        while (enumerationU7.hasMoreElements()) {
            jj0 jj0Var = (jj0) enumerationU7.nextElement();
            if (!fm0VarGn.VH(jj0Var).FH()) {
                hashSet.add(jj0Var.XL());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotAfter() {
        return this.WB.VH().VH();
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotBefore() {
        return this.WB.we().VH();
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        try {
            return jp0.Zo(this.WB.J8());
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public BigInteger getSerialNumber() {
        return this.WB.u7().XL();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgName() {
        Provider provider = Security.getProvider(jp0.mb);
        if (provider != null) {
            String property = provider.getProperty("Alg.Alias.Signature." + getSigAlgOID());
            if (property != null) {
                return property;
            }
        }
        Provider[] providers = Security.getProviders();
        for (int i = 0; i != providers.length; i++) {
            String property2 = providers[i].getProperty("Alg.Alias.Signature." + getSigAlgOID());
            if (property2 != null) {
                return property2;
            }
        }
        return getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgOID() {
        return this.WB.EQ().tp().XL();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        if (this.WB.EQ().EQ() != null) {
            try {
                return this.WB.EQ().EQ().DW().Zo("DER");
            } catch (IOException unused) {
            }
        }
        return null;
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
        return this.WB.tp().QX();
    }

    @Override // java.security.cert.X509Certificate
    public Principal getSubjectDN() {
        return new ip0(ol0.VH(this.WB.J0().DW()));
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
        xi0 xi0VarXL = this.WB.Ws().XL();
        if (xi0VarXL == null) {
            return null;
        }
        byte[] bArrQX = xi0VarXL.QX();
        int length = (bArrQX.length * 8) - xi0VarXL.j3();
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = (bArrQX[i / 8] & (128 >>> (i % 8))) != 0;
        }
        return zArr;
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new yh0(byteArrayOutputStream).tp(this.WB.J0());
            return new X500Principal(byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() throws CertificateEncodingException {
        try {
            return this.WB.Ws().Zo("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
        return this.WB.QX();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        fm0 fm0VarGn;
        if (getVersion() != 3 || (fm0VarGn = this.WB.Ws().gn()) == null) {
            return false;
        }
        Enumeration enumerationU7 = fm0VarGn.u7();
        while (enumerationU7.hasMoreElements()) {
            jj0 jj0Var = (jj0) enumerationU7.nextElement();
            String strXL = jj0Var.XL();
            if (!strXL.equals(lp0.EQ) && !strXL.equals(lp0.j6) && !strXL.equals(lp0.DW) && !strXL.equals(lp0.FH) && !strXL.equals(lp0.gn) && !strXL.equals(lp0.Hw) && !strXL.equals(lp0.v5) && !strXL.equals(lp0.Zo) && !strXL.equals(lp0.VH) && !strXL.equals(lp0.u7) && !strXL.equals(lp0.tp) && fm0VarGn.VH(jj0Var).FH()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.cert.Certificate
    public synchronized int hashCode() {
        if (!this.fY) {
            this.qp = j6();
            this.fY = true;
        }
        return this.qp;
    }

    @Override // java.security.cert.Certificate
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String property = System.getProperty("line.separator");
        stringBuffer.append("  [0]         Version: ");
        stringBuffer.append(getVersion());
        stringBuffer.append(property);
        stringBuffer.append("         SerialNumber: ");
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(property);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(property);
        stringBuffer.append("           Start Date: ");
        stringBuffer.append(getNotBefore());
        stringBuffer.append(property);
        stringBuffer.append("           Final Date: ");
        stringBuffer.append(getNotAfter());
        stringBuffer.append(property);
        stringBuffer.append("            SubjectDN: ");
        stringBuffer.append(getSubjectDN());
        stringBuffer.append(property);
        stringBuffer.append("           Public Key: ");
        stringBuffer.append(getPublicKey());
        stringBuffer.append(property);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(getSigAlgName());
        stringBuffer.append(property);
        byte[] signature = getSignature();
        stringBuffer.append("            Signature: ");
        stringBuffer.append(new String(kq0.FH(signature, 0, 20)));
        stringBuffer.append(property);
        for (int i = 20; i < signature.length; i += 20) {
            if (i < signature.length - 20) {
                stringBuffer.append("                       ");
                stringBuffer.append(new String(kq0.FH(signature, i, 20)));
                stringBuffer.append(property);
            } else {
                stringBuffer.append("                       ");
                stringBuffer.append(new String(kq0.FH(signature, i, signature.length - i)));
                stringBuffer.append(property);
            }
        }
        fm0 fm0VarGn = this.WB.Ws().gn();
        if (fm0VarGn != null) {
            Enumeration enumerationU7 = fm0VarGn.u7();
            if (enumerationU7.hasMoreElements()) {
                stringBuffer.append("       Extensions: \n");
            }
            while (enumerationU7.hasMoreElements()) {
                jj0 jj0Var = (jj0) enumerationU7.nextElement();
                em0 em0VarVH = fm0VarGn.VH(jj0Var);
                if (em0VarVH.DW() != null) {
                    rh0 rh0Var = new rh0(em0VarVH.DW().Ws());
                    stringBuffer.append("                       critical(");
                    stringBuffer.append(em0VarVH.FH());
                    stringBuffer.append(") ");
                    try {
                        if (jj0Var.equals(em0.Hw)) {
                            stringBuffer.append(tl0.VH(rh0Var.we()));
                            stringBuffer.append(property);
                        } else if (jj0Var.equals(em0.FH)) {
                            stringBuffer.append(new xl0((xi0) rh0Var.we()));
                            stringBuffer.append(property);
                        } else if (jj0Var.equals(zk0.DW)) {
                            stringBuffer.append(new al0((xi0) rh0Var.we()));
                            stringBuffer.append(property);
                        } else if (jj0Var.equals(zk0.FH)) {
                            stringBuffer.append(new bl0((fj0) rh0Var.we()));
                            stringBuffer.append(property);
                        } else if (jj0Var.equals(zk0.v5)) {
                            stringBuffer.append(new cl0((fj0) rh0Var.we()));
                            stringBuffer.append(property);
                        } else {
                            stringBuffer.append(jj0Var.XL());
                            stringBuffer.append(" value = ");
                            stringBuffer.append(ll0.FH(rh0Var.we()));
                            stringBuffer.append(property);
                        }
                    } catch (Exception unused) {
                        stringBuffer.append(jj0Var.XL());
                        stringBuffer.append(" value = ");
                        stringBuffer.append("*****");
                        stringBuffer.append(property);
                    }
                } else {
                    stringBuffer.append(property);
                }
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        Signature signature;
        String strDW = np0.DW(this.WB.EQ());
        try {
            signature = Signature.getInstance(strDW, jp0.mb);
        } catch (Exception unused) {
            signature = Signature.getInstance(strDW);
        }
        DW(publicKey, signature);
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        if (date.getTime() > getNotAfter().getTime()) {
            throw new CertificateExpiredException("certificate expired on " + this.WB.VH().u7());
        }
        if (date.getTime() >= getNotBefore().getTime()) {
            return;
        }
        throw new CertificateNotYetValidException("certificate not valid till " + this.WB.we().u7());
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, CertificateException, InvalidAlgorithmParameterException {
        DW(publicKey, Signature.getInstance(np0.DW(this.WB.EQ()), str));
    }
}
