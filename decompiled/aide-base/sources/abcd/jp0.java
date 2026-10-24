package abcd;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class jp0 extends Provider implements cp0 {
    private static String WB = "BouncyCastle Security Provider v1.47";
    public static String mb = "SC";
    public static final dp0 jw = new kp0();
    private static final Map fY = new HashMap();
    private static final String[] qp = {"AES", "ARC4", "Blowfish", "Camellia", "CAST5", "CAST6", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Skipjack", "TEA", "Twofish", "VMPC", "VMPCKSA3", "XTEA"};
    private static final String[] k2 = {"X509"};
    private static final String[] zh = {"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal"};
    private static final String[] AL = {"GOST3411", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "Tiger", "Whirlpool"};

    class a implements PrivilegedAction {
        public a() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() throws ClassNotFoundException {
            jp0.this.gn();
            return null;
        }
    }

    public jp0() {
        super(mb, 1.47d, WB);
        AccessController.doPrivileged(new a());
    }

    private void Hw() {
        put("Mac.DESWITHISO9797", "org.spongycastle.jce.provider.JCEMac$DES9797Alg3");
        put("Alg.Alias.Mac.DESISO9797MAC", "DESWITHISO9797");
        put("Mac.ISO9797ALG3MAC", "org.spongycastle.jce.provider.JCEMac$DES9797Alg3");
        put("Alg.Alias.Mac.ISO9797ALG3", "ISO9797ALG3MAC");
        put("Mac.ISO9797ALG3WITHISO7816-4PADDING", "org.spongycastle.jce.provider.JCEMac$DES9797Alg3with7816d4");
        put("Alg.Alias.Mac.ISO9797ALG3MACWITHISO7816-4PADDING", "ISO9797ALG3WITHISO7816-4PADDING");
        put("Mac.OLDHMACSHA384", "org.spongycastle.jce.provider.JCEMac$OldSHA384");
        put("Mac.OLDHMACSHA512", "org.spongycastle.jce.provider.JCEMac$OldSHA512");
        put("Mac.PBEWITHHMACSHA", "org.spongycastle.jce.provider.JCEMac$PBEWithSHA");
        put("Mac.PBEWITHHMACSHA1", "org.spongycastle.jce.provider.JCEMac$PBEWithSHA");
        put("Mac.PBEWITHHMACRIPEMD160", "org.spongycastle.jce.provider.JCEMac$PBEWithRIPEMD160");
        put("Alg.Alias.Mac.1.3.14.3.2.26", "PBEWITHHMACSHA");
    }

    private void VH(String str, String[] strArr) throws ClassNotFoundException {
        for (int i = 0; i != strArr.length; i++) {
            Class<?> clsLoadClass = null;
            try {
                ClassLoader classLoader = getClass().getClassLoader();
                clsLoadClass = classLoader != null ? classLoader.loadClass(String.valueOf(str) + strArr[i] + "$Mappings") : Class.forName(String.valueOf(str) + strArr[i] + "$Mappings");
            } catch (ClassNotFoundException unused) {
            }
            if (clsLoadClass != null) {
                try {
                    ((fp0) clsLoadClass.newInstance()).configure(this);
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new InternalError("cannot create instance of " + str + strArr[i] + "$Mappings : " + e);
                }
            }
        }
    }

    public static PublicKey Zo(yl0 yl0Var) {
        hp0 hp0Var = (hp0) fY.get(yl0Var.VH().VH());
        if (hp0Var == null) {
            return null;
        }
        return hp0Var.generatePublic(yl0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gn() throws ClassNotFoundException {
        VH("org.spongycastle.jcajce.provider.digest.", AL);
        VH("org.spongycastle.jcajce.provider.symmetric.", qp);
        VH("org.spongycastle.jcajce.provider.asymmetric.", k2);
        VH("org.spongycastle.jcajce.provider.asymmetric.", zh);
        put("X509Store.CERTIFICATE/COLLECTION", "org.spongycastle.jce.provider.X509StoreCertCollection");
        put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.spongycastle.jce.provider.X509StoreAttrCertCollection");
        put("X509Store.CRL/COLLECTION", "org.spongycastle.jce.provider.X509StoreCRLCollection");
        put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.spongycastle.jce.provider.X509StoreCertPairCollection");
        put("X509Store.CERTIFICATE/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPCerts");
        put("X509Store.CRL/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPCRLs");
        put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPAttrCerts");
        put("X509Store.CERTIFICATEPAIR/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPCertPairs");
        put("X509StreamParser.CERTIFICATE", "org.spongycastle.jce.provider.X509CertParser");
        put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.spongycastle.jce.provider.X509AttrCertParser");
        put("X509StreamParser.CRL", "org.spongycastle.jce.provider.X509CRLParser");
        put("X509StreamParser.CERTIFICATEPAIR", "org.spongycastle.jce.provider.X509CertPairParser");
        put("KeyStore.BKS", "org.spongycastle.jce.provider.JDKKeyStore");
        put("KeyStore.BouncyCastle", "org.spongycastle.jce.provider.JDKKeyStore$BouncyCastleStore");
        put("KeyStore.PKCS12", "org.spongycastle.jce.provider.JDKPKCS12KeyStore$BCPKCS12KeyStore");
        put("KeyStore.BCPKCS12", "org.spongycastle.jce.provider.JDKPKCS12KeyStore$BCPKCS12KeyStore");
        put("KeyStore.PKCS12-DEF", "org.spongycastle.jce.provider.JDKPKCS12KeyStore$DefPKCS12KeyStore");
        put("KeyStore.PKCS12-3DES-40RC2", "org.spongycastle.jce.provider.JDKPKCS12KeyStore$BCPKCS12KeyStore");
        put("KeyStore.PKCS12-3DES-3DES", "org.spongycastle.jce.provider.JDKPKCS12KeyStore$BCPKCS12KeyStore3DES");
        put("KeyStore.PKCS12-DEF-3DES-40RC2", "org.spongycastle.jce.provider.JDKPKCS12KeyStore$DefPKCS12KeyStore");
        put("KeyStore.PKCS12-DEF-3DES-3DES", "org.spongycastle.jce.provider.JDKPKCS12KeyStore$DefPKCS12KeyStore3DES");
        put("Alg.Alias.KeyStore.UBER", "BouncyCastle");
        put("Alg.Alias.KeyStore.BOUNCYCASTLE", "BouncyCastle");
        put("Alg.Alias.KeyStore.spongycastle", "BouncyCastle");
        put("AlgorithmParameters.IES", "org.spongycastle.jce.provider.JDKAlgorithmParameters$IES");
        put("AlgorithmParameters.PKCS12PBE", "org.spongycastle.jce.provider.JDKAlgorithmParameters$PKCS12PBE");
        put("AlgorithmParameters." + hl0.rN, "org.spongycastle.jce.provider.JDKAlgorithmParameters$PBKDF2");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1ANDRC2", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND3-KEYTRIPLEDES", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND2-KEYTRIPLEDES", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDRC2", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDRC4", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1ANDRC2-CBC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDDES3KEY-CBC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDDES2KEY-CBC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND40BITRC2-CBC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND40BITRC4", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITRC2-CBC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITRC4", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH-CBC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.1", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.2", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.3", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.4", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.5", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.6", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWithSHAAnd3KeyTripleDES", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters." + kk0.VH.XL(), "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters." + kk0.gn.XL(), "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters." + kk0.u7.XL(), "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters." + kk0.tp.XL(), "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters." + kk0.EQ.XL(), "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters." + kk0.we.XL(), "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITAES-CBC-BC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND192BITAES-CBC-BC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND256BITAES-CBC-BC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND128BITAES-CBC-BC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND192BITAES-CBC-BC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND256BITAES-CBC-BC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND128BITAES-CBC-BC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND192BITAES-CBC-BC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND256BITAES-CBC-BC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND128BITAES-CBC-BC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND192BITAES-CBC-BC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND256BITAES-CBC-BC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND128BITAES-CBC-BC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND192BITAES-CBC-BC", "PKCS12PBE");
        put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND256BITAES-CBC-BC", "PKCS12PBE");
        put("AlgorithmParameters.SHA1WITHECDSA", "org.spongycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
        put("AlgorithmParameters.SHA224WITHECDSA", "org.spongycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
        put("AlgorithmParameters.SHA256WITHECDSA", "org.spongycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
        put("AlgorithmParameters.SHA384WITHECDSA", "org.spongycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
        put("AlgorithmParameters.SHA512WITHECDSA", "org.spongycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
        put("Alg.Alias.Cipher.PBEWithSHAAnd3KeyTripleDES", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        put("Cipher.ECIES", "org.spongycastle.jce.provider.JCEIESCipher$ECIES");
        put("Cipher.BrokenECIES", "org.spongycastle.jce.provider.JCEIESCipher$BrokenECIES");
        put("Cipher.IES", "org.spongycastle.jce.provider.JCEIESCipher$IES");
        put("Cipher.BrokenIES", "org.spongycastle.jce.provider.JCEIESCipher$BrokenIES");
        put("Cipher.PBEWITHMD5ANDDES", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithMD5AndDES");
        put("Cipher.BROKENPBEWITHMD5ANDDES", "org.spongycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        put("Cipher.PBEWITHMD5ANDRC2", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithMD5AndRC2");
        put("Cipher.PBEWITHSHA1ANDDES", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithSHA1AndDES");
        put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.spongycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        put("Cipher.PBEWITHSHA1ANDRC2", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithSHA1AndRC2");
        put("Cipher.PBEWITHSHAAND128BITRC2-CBC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithSHAAnd128BitRC2");
        put("Cipher.PBEWITHSHAAND40BITRC2-CBC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithSHAAnd40BitRC2");
        put("Cipher.PBEWITHSHAAND128BITRC4", "org.spongycastle.jce.provider.JCEStreamCipher$PBEWithSHAAnd128BitRC4");
        put("Cipher.PBEWITHSHAAND40BITRC4", "org.spongycastle.jce.provider.JCEStreamCipher$PBEWithSHAAnd40BitRC4");
        put("Alg.Alias.Cipher.PBEWITHSHA1AND128BITRC2-CBC", "PBEWITHSHAAND128BITRC2-CBC");
        put("Alg.Alias.Cipher.PBEWITHSHA1AND40BITRC2-CBC", "PBEWITHSHAAND40BITRC2-CBC");
        put("Alg.Alias.Cipher.PBEWITHSHA1AND128BITRC4", "PBEWITHSHAAND128BITRC4");
        put("Alg.Alias.Cipher.PBEWITHSHA1AND40BITRC4", "PBEWITHSHAAND40BITRC4");
        put("Alg.Alias.Cipher." + kk0.VH.XL(), "PBEWITHSHAAND128BITAES-CBC-BC");
        put("Alg.Alias.Cipher." + kk0.gn.XL(), "PBEWITHSHAAND192BITAES-CBC-BC");
        put("Alg.Alias.Cipher." + kk0.u7.XL(), "PBEWITHSHAAND256BITAES-CBC-BC");
        put("Alg.Alias.Cipher." + kk0.tp.XL(), "PBEWITHSHA256AND128BITAES-CBC-BC");
        put("Alg.Alias.Cipher." + kk0.EQ.XL(), "PBEWITHSHA256AND192BITAES-CBC-BC");
        put("Alg.Alias.Cipher." + kk0.we.XL(), "PBEWITHSHA256AND256BITAES-CBC-BC");
        put("Cipher.PBEWITHSHAAND128BITAES-CBC-BC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        put("Cipher.PBEWITHSHAAND192BITAES-CBC-BC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        put("Cipher.PBEWITHSHAAND256BITAES-CBC-BC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        put("Cipher.PBEWITHSHA256AND128BITAES-CBC-BC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        put("Cipher.PBEWITHSHA256AND192BITAES-CBC-BC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        put("Cipher.PBEWITHSHA256AND256BITAES-CBC-BC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        put("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
        put("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
        put("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
        put("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
        put("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
        put("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
        put("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
        put("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
        put("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
        put("Cipher.PBEWITHMD5AND128BITAES-CBC-OPENSSL", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        put("Cipher.PBEWITHMD5AND192BITAES-CBC-OPENSSL", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        put("Cipher.PBEWITHMD5AND256BITAES-CBC-OPENSSL", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        put("Cipher.PBEWITHSHAANDTWOFISH-CBC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithSHAAndTwofish");
        put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.spongycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        put("Alg.Alias.Cipher." + hl0.aM, "PBEWITHMD2ANDDES");
        put("Alg.Alias.Cipher." + hl0.j3, "PBEWITHMD2ANDRC2");
        put("Alg.Alias.Cipher." + hl0.Mr, "PBEWITHMD5ANDDES");
        put("Alg.Alias.Cipher." + hl0.U2, "PBEWITHMD5ANDDES");
        put("Alg.Alias.Cipher." + hl0.a8, "PBEWITHSHA1ANDDES");
        put("Alg.Alias.Cipher." + hl0.lg, "PBEWITHSHA1ANDRC2");
        put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.1", "PBEWITHSHAAND128BITRC4");
        put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.2", "PBEWITHSHAAND40BITRC4");
        put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.5", "PBEWITHSHAAND128BITRC2-CBC");
        put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.6", "PBEWITHSHAAND40BITRC2-CBC");
        put("SecretKeyFactory.PBEWITHMD2ANDDES", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithMD2AndDES");
        put("Alg.Alias.SecretKeyFactory." + hl0.aM, "PBEWITHMD2ANDDES");
        put("Alg.Alias.SecretKeyFactory." + hl0.j3, "PBEWITHMD2ANDRC2");
        put("Alg.Alias.SecretKeyFactory." + hl0.Mr, "PBEWITHMD5ANDDES");
        put("Alg.Alias.SecretKeyFactory." + hl0.U2, "PBEWITHMD5ANDDES");
        put("Alg.Alias.SecretKeyFactory." + hl0.a8, "PBEWITHSHA1ANDDES");
        put("Alg.Alias.SecretKeyFactory." + hl0.lg, "PBEWITHSHA1ANDRC2");
        put("SecretKeyFactory.PBEWITHMD2ANDRC2", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithMD2AndRC2");
        put("SecretKeyFactory.PBEWITHMD5ANDDES", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5AndDES");
        put("SecretKeyFactory.PBEWITHMD5ANDRC2", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5AndRC2");
        put("SecretKeyFactory.PBEWITHSHA1ANDDES", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA1AndDES");
        put("SecretKeyFactory.PBEWITHSHA1ANDRC2", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA1AndRC2");
        put("SecretKeyFactory.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAndDES3Key");
        put("SecretKeyFactory.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAndDES2Key");
        put("SecretKeyFactory.PBEWITHSHAAND128BITRC4", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd128BitRC4");
        put("SecretKeyFactory.PBEWITHSHAAND40BITRC4", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd40BitRC4");
        put("SecretKeyFactory.PBEWITHSHAAND128BITRC2-CBC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd128BitRC2");
        put("SecretKeyFactory.PBEWITHSHAAND40BITRC2-CBC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd40BitRC2");
        put("SecretKeyFactory.PBEWITHSHAANDTWOFISH-CBC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAndTwofish");
        put("SecretKeyFactory.PBEWITHHMACRIPEMD160", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithRIPEMD160");
        put("SecretKeyFactory.PBEWITHHMACSHA1", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA");
        put("SecretKeyFactory.PBEWITHHMACTIGER", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithTiger");
        put("SecretKeyFactory.PBEWITHMD5AND128BITAES-CBC-OPENSSL", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5And128BitAESCBCOpenSSL");
        put("SecretKeyFactory.PBEWITHMD5AND192BITAES-CBC-OPENSSL", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5And192BitAESCBCOpenSSL");
        put("SecretKeyFactory.PBEWITHMD5AND256BITAES-CBC-OPENSSL", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5And256BitAESCBCOpenSSL");
        put("Alg.Alias.SecretKeyFactory.PBE", "PBE/PKCS5");
        put("Alg.Alias.SecretKeyFactory.BROKENPBEWITHMD5ANDDES", "PBE/PKCS5");
        put("Alg.Alias.SecretKeyFactory.BROKENPBEWITHSHA1ANDDES", "PBE/PKCS5");
        put("Alg.Alias.SecretKeyFactory.OLDPBEWITHSHAAND3-KEYTRIPLEDES-CBC", "PBE/PKCS12");
        put("Alg.Alias.SecretKeyFactory.BROKENPBEWITHSHAAND3-KEYTRIPLEDES-CBC", "PBE/PKCS12");
        put("Alg.Alias.SecretKeyFactory.BROKENPBEWITHSHAAND2-KEYTRIPLEDES-CBC", "PBE/PKCS12");
        put("Alg.Alias.SecretKeyFactory.OLDPBEWITHSHAANDTWOFISH-CBC", "PBE/PKCS12");
        put("Alg.Alias.SecretKeyFactory.PBEWITHMD2ANDDES-CBC", "PBEWITHMD2ANDDES");
        put("Alg.Alias.SecretKeyFactory.PBEWITHMD2ANDRC2-CBC", "PBEWITHMD2ANDRC2");
        put("Alg.Alias.SecretKeyFactory.PBEWITHMD5ANDDES-CBC", "PBEWITHMD5ANDDES");
        put("Alg.Alias.SecretKeyFactory.PBEWITHMD5ANDRC2-CBC", "PBEWITHMD5ANDRC2");
        put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDDES-CBC", "PBEWITHSHA1ANDDES");
        put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDRC2-CBC", "PBEWITHSHA1ANDRC2");
        put("Alg.Alias.SecretKeyFactory." + hl0.aM, "PBEWITHMD2ANDDES");
        put("Alg.Alias.SecretKeyFactory." + hl0.j3, "PBEWITHMD2ANDRC2");
        put("Alg.Alias.SecretKeyFactory." + hl0.Mr, "PBEWITHMD5ANDDES");
        put("Alg.Alias.SecretKeyFactory." + hl0.U2, "PBEWITHMD5ANDRC2");
        put("Alg.Alias.SecretKeyFactory." + hl0.a8, "PBEWITHSHA1ANDDES");
        put("Alg.Alias.SecretKeyFactory." + hl0.lg, "PBEWITHSHA1ANDRC2");
        put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.1", "PBEWITHSHAAND128BITRC4");
        put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.2", "PBEWITHSHAAND40BITRC4");
        put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.3", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.4", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
        put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.5", "PBEWITHSHAAND128BITRC2-CBC");
        put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.6", "PBEWITHSHAAND40BITRC2-CBC");
        put("Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA", "PBEWITHHMACSHA1");
        put("Alg.Alias.SecretKeyFactory.1.3.14.3.2.26", "PBEWITHHMACSHA1");
        put("Alg.Alias.SecretKeyFactory.PBEWithSHAAnd3KeyTripleDES", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        put("SecretKeyFactory.PBEWITHSHAAND128BITAES-CBC-BC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd128BitAESBC");
        put("SecretKeyFactory.PBEWITHSHAAND192BITAES-CBC-BC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd192BitAESBC");
        put("SecretKeyFactory.PBEWITHSHAAND256BITAES-CBC-BC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd256BitAESBC");
        put("SecretKeyFactory.PBEWITHSHA256AND128BITAES-CBC-BC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA256And128BitAESBC");
        put("SecretKeyFactory.PBEWITHSHA256AND192BITAES-CBC-BC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA256And192BitAESBC");
        put("SecretKeyFactory.PBEWITHSHA256AND256BITAES-CBC-BC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA256And256BitAESBC");
        put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
        put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
        put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
        put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
        put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
        put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
        put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
        put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
        put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
        put("Alg.Alias.SecretKeyFactory." + kk0.VH.XL(), "PBEWITHSHAAND128BITAES-CBC-BC");
        put("Alg.Alias.SecretKeyFactory." + kk0.gn.XL(), "PBEWITHSHAAND192BITAES-CBC-BC");
        put("Alg.Alias.SecretKeyFactory." + kk0.u7.XL(), "PBEWITHSHAAND256BITAES-CBC-BC");
        put("Alg.Alias.SecretKeyFactory." + kk0.tp.XL(), "PBEWITHSHA256AND128BITAES-CBC-BC");
        put("Alg.Alias.SecretKeyFactory." + kk0.EQ.XL(), "PBEWITHSHA256AND192BITAES-CBC-BC");
        put("Alg.Alias.SecretKeyFactory." + kk0.we.XL(), "PBEWITHSHA256AND256BITAES-CBC-BC");
        Hw();
        put("CertPathValidator.RFC3281", "org.spongycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        put("CertPathBuilder.RFC3281", "org.spongycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        put("CertPathValidator.RFC3280", "org.spongycastle.jce.provider.PKIXCertPathValidatorSpi");
        put("CertPathBuilder.RFC3280", "org.spongycastle.jce.provider.PKIXCertPathBuilderSpi");
        put("CertPathValidator.PKIX", "org.spongycastle.jce.provider.PKIXCertPathValidatorSpi");
        put("CertPathBuilder.PKIX", "org.spongycastle.jce.provider.PKIXCertPathBuilderSpi");
        put("CertStore.Collection", "org.spongycastle.jce.provider.CertStoreCollectionSpi");
        put("CertStore.LDAP", "org.spongycastle.jce.provider.X509LDAPCertStoreSpi");
        put("CertStore.Multi", "org.spongycastle.jce.provider.MultiCertStoreSpi");
        put("Alg.Alias.CertStore.X509LDAP", "LDAP");
    }

    @Override // abcd.cp0
    public void j6(String str, String str2) {
        if (!containsKey(str)) {
            put(str, str2);
            return;
        }
        throw new IllegalStateException("duplicate provider key (" + str + ") found");
    }
}
