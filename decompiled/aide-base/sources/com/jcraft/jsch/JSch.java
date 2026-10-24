package com.jcraft.jsch;

import com.jcraft.jsch.IdentityRepository;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes.dex */
public class JSch {
    private static final Logger VH;
    static Hashtable Zo;
    static Logger gn;
    private IdentityRepository DW;
    private IdentityRepository FH;
    private ConfigRepository Hw;
    private Vector j6 = new Vector();
    private HostKeyRepository v5;

    static {
        Hashtable hashtable = new Hashtable();
        Zo = hashtable;
        hashtable.put("kex", "diffie-hellman-group1-sha1,diffie-hellman-group14-sha1,diffie-hellman-group-exchange-sha1");
        Zo.put("server_host_key", "ssh-rsa,ssh-dss");
        Zo.put("cipher.s2c", "aes128-ctr,aes128-cbc,3des-ctr,3des-cbc,blowfish-cbc,aes192-cbc,aes256-cbc");
        Zo.put("cipher.c2s", "aes128-ctr,aes128-cbc,3des-ctr,3des-cbc,blowfish-cbc,aes192-cbc,aes256-cbc");
        Zo.put("mac.s2c", "hmac-md5,hmac-sha1,hmac-sha2-256,hmac-sha1-96,hmac-md5-96");
        Zo.put("mac.c2s", "hmac-md5,hmac-sha1,hmac-sha2-256,hmac-sha1-96,hmac-md5-96");
        Zo.put("compression.s2c", "none");
        Zo.put("compression.c2s", "none");
        Zo.put("lang.s2c", "");
        Zo.put("lang.c2s", "");
        Zo.put("compression_level", "6");
        Zo.put("diffie-hellman-group-exchange-sha1", "com.jcraft.jsch.DHGEX");
        Zo.put("diffie-hellman-group1-sha1", "com.jcraft.jsch.DHG1");
        Zo.put("diffie-hellman-group14-sha1", "com.jcraft.jsch.DHG14");
        Zo.put("diffie-hellman-group-exchange-sha256", "com.jcraft.jsch.DHGEX256");
        Zo.put("dh", "com.jcraft.jsch.jce.DH");
        Zo.put("3des-cbc", "com.jcraft.jsch.jce.TripleDESCBC");
        Zo.put("blowfish-cbc", "com.jcraft.jsch.jce.BlowfishCBC");
        Zo.put("hmac-sha1", "com.jcraft.jsch.jce.HMACSHA1");
        Zo.put("hmac-sha1-96", "com.jcraft.jsch.jce.HMACSHA196");
        Zo.put("hmac-sha2-256", "com.jcraft.jsch.jce.HMACSHA256");
        Zo.put("hmac-md5", "com.jcraft.jsch.jce.HMACMD5");
        Zo.put("hmac-md5-96", "com.jcraft.jsch.jce.HMACMD596");
        Zo.put("sha-1", "com.jcraft.jsch.jce.SHA1");
        Zo.put("sha-256", "com.jcraft.jsch.jce.SHA256");
        Zo.put("md5", "com.jcraft.jsch.jce.MD5");
        Zo.put("signature.dss", "com.jcraft.jsch.jce.SignatureDSA");
        Zo.put("signature.rsa", "com.jcraft.jsch.jce.SignatureRSA");
        Zo.put("keypairgen.dsa", "com.jcraft.jsch.jce.KeyPairGenDSA");
        Zo.put("keypairgen.rsa", "com.jcraft.jsch.jce.KeyPairGenRSA");
        Zo.put("random", "com.jcraft.jsch.jce.Random");
        Zo.put("none", "com.jcraft.jsch.CipherNone");
        Zo.put("aes128-cbc", "com.jcraft.jsch.jce.AES128CBC");
        Zo.put("aes192-cbc", "com.jcraft.jsch.jce.AES192CBC");
        Zo.put("aes256-cbc", "com.jcraft.jsch.jce.AES256CBC");
        Zo.put("aes128-ctr", "com.jcraft.jsch.jce.AES128CTR");
        Zo.put("aes192-ctr", "com.jcraft.jsch.jce.AES192CTR");
        Zo.put("aes256-ctr", "com.jcraft.jsch.jce.AES256CTR");
        Zo.put("3des-ctr", "com.jcraft.jsch.jce.TripleDESCTR");
        Zo.put("arcfour", "com.jcraft.jsch.jce.ARCFOUR");
        Zo.put("arcfour128", "com.jcraft.jsch.jce.ARCFOUR128");
        Zo.put("arcfour256", "com.jcraft.jsch.jce.ARCFOUR256");
        Zo.put("userauth.none", "com.jcraft.jsch.UserAuthNone");
        Zo.put("userauth.password", "com.jcraft.jsch.UserAuthPassword");
        Zo.put("userauth.keyboard-interactive", "com.jcraft.jsch.UserAuthKeyboardInteractive");
        Zo.put("userauth.publickey", "com.jcraft.jsch.UserAuthPublicKey");
        Zo.put("userauth.gssapi-with-mic", "com.jcraft.jsch.UserAuthGSSAPIWithMIC");
        Zo.put("gssapi-with-mic.krb5", "com.jcraft.jsch.jgss.GSSContextKrb5");
        Zo.put("zlib", "com.jcraft.jsch.jcraft.Compression");
        Zo.put("zlib@openssh.com", "com.jcraft.jsch.jcraft.Compression");
        Zo.put("pbkdf", "com.jcraft.jsch.jce.PBKDF");
        Zo.put("StrictHostKeyChecking", "ask");
        Zo.put("HashKnownHosts", "no");
        Zo.put("PreferredAuthentications", "gssapi-with-mic,publickey,keyboard-interactive,password");
        Zo.put("CheckCiphers", "aes256-ctr,aes192-ctr,aes128-ctr,aes256-cbc,aes192-cbc,aes128-cbc,3des-ctr,arcfour,arcfour128,arcfour256");
        Zo.put("CheckKexes", "diffie-hellman-group14-sha1");
        Zo.put("MaxAuthTries", "6");
        Zo.put("ClearAllForwardings", "no");
        Logger logger = new Logger() { // from class: com.jcraft.jsch.JSch.1
            @Override // com.jcraft.jsch.Logger
            public boolean isEnabled(int i) {
                return false;
            }

            @Override // com.jcraft.jsch.Logger
            public void j6(int i, String str) {
            }
        };
        VH = logger;
        gn = logger;
    }

    public JSch() {
        LocalIdentityRepository localIdentityRepository = new LocalIdentityRepository(this);
        this.DW = localIdentityRepository;
        this.FH = localIdentityRepository;
        this.Hw = null;
        this.v5 = null;
    }

    static Logger tp() {
        return gn;
    }

    public static String v5(String str) {
        String str2;
        synchronized (Zo) {
            str2 = (String) Zo.get(str);
        }
        return str2;
    }

    public void DW(String str) {
        FH(str, null);
    }

    public Session EQ(String str, String str2, int i) throws JSchException {
        if (str2 != null) {
            return new Session(this, str, str2, i);
        }
        throw new JSchException("host must not be null.");
    }

    public void FH(String str, byte[] bArr) throws Throwable {
        j6(IdentityFile.VH(str, null, this), bArr);
    }

    protected void Hw(Session session) {
        synchronized (this.j6) {
            this.j6.addElement(session);
        }
    }

    public void J0(HostKeyRepository hostKeyRepository) {
        this.v5 = hostKeyRepository;
    }

    public synchronized void J8(IdentityRepository identityRepository) {
        if (identityRepository == null) {
            this.FH = this.DW;
        } else {
            this.FH = identityRepository;
        }
    }

    public HostKeyRepository VH() {
        if (this.v5 == null) {
            this.v5 = new KnownHosts(this);
        }
        return this.v5;
    }

    public void Ws(InputStream inputStream) {
        if (this.v5 == null) {
            this.v5 = new KnownHosts(this);
        }
        HostKeyRepository hostKeyRepository = this.v5;
        if (hostKeyRepository instanceof KnownHosts) {
            synchronized (hostKeyRepository) {
                ((KnownHosts) this.v5).J0(inputStream);
            }
        }
    }

    public ConfigRepository Zo() {
        return this.Hw;
    }

    public Vector gn() {
        Vector vector = new Vector();
        Vector vectorJ6 = this.FH.j6();
        for (int i = 0; i < vectorJ6.size(); i++) {
            vector.addElement(((Identity) vectorJ6.elementAt(i)).getName());
        }
        return vector;
    }

    public void j6(Identity identity, byte[] bArr) throws Throwable {
        if (bArr != null) {
            try {
                byte[] bArr2 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                try {
                    identity.Hw(bArr2);
                    Util.Zo(bArr2);
                } catch (Throwable th) {
                    th = th;
                    bArr = bArr2;
                    Util.Zo(bArr);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        IdentityRepository identityRepository = this.FH;
        if (identityRepository instanceof LocalIdentityRepository) {
            ((LocalIdentityRepository) identityRepository).v5(identity);
            return;
        }
        if ((identity instanceof IdentityFile) && !identity.DW()) {
            this.FH.DW(((IdentityFile) identity).Zo().VH());
            return;
        }
        synchronized (this) {
            if (!(this.FH instanceof IdentityRepository.Wrapper)) {
                J8(new IdentityRepository.Wrapper(this.FH));
            }
        }
        ((IdentityRepository.Wrapper) this.FH).v5(identity);
    }

    public synchronized IdentityRepository u7() {
        return this.FH;
    }

    protected boolean we(Session session) {
        boolean zRemove;
        synchronized (this.j6) {
            zRemove = this.j6.remove(session);
        }
        return zRemove;
    }
}
