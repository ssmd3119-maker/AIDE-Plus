package com.jcraft.jsch.jgss;

import com.jcraft.jsch.GSSContext;
import com.jcraft.jsch.JSchException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.ietf.jgss.GSSCredential;
import org.ietf.jgss.GSSException;
import org.ietf.jgss.GSSManager;
import org.ietf.jgss.MessageProp;
import org.ietf.jgss.Oid;

/* loaded from: classes.dex */
public class GSSContextKrb5 implements GSSContext {
    private static String DW = Zo("javax.security.auth.useSubjectCredsOnly");
    private org.ietf.jgss.GSSContext j6 = null;

    private static void VH(String str, String str2) {
        try {
            System.setProperty(str, str2);
        } catch (Exception unused) {
        }
    }

    private static String Zo(String str) {
        try {
            return System.getProperty(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.jcraft.jsch.GSSContext
    public boolean DW() {
        return this.j6.isEstablished();
    }

    @Override // com.jcraft.jsch.GSSContext
    public void FH(String str, String str2) throws JSchException {
        try {
            Oid oid = new Oid("1.2.840.113554.1.2.2");
            Oid oid2 = new Oid("1.2.840.113554.1.2.2.1");
            GSSManager gSSManager = GSSManager.getInstance();
            try {
                str2 = InetAddress.getByName(str2).getCanonicalHostName();
            } catch (UnknownHostException unused) {
            }
            org.ietf.jgss.GSSContext gSSContextCreateContext = gSSManager.createContext(gSSManager.createName("host/" + str2, oid2), oid, (GSSCredential) null, 0);
            this.j6 = gSSContextCreateContext;
            gSSContextCreateContext.requestMutualAuth(true);
            this.j6.requestConf(true);
            this.j6.requestInteg(true);
            this.j6.requestCredDeleg(true);
            this.j6.requestAnonymity(false);
        } catch (GSSException e) {
            throw new JSchException(e.toString());
        }
    }

    @Override // com.jcraft.jsch.GSSContext
    public void Hw() {
        try {
            this.j6.dispose();
        } catch (GSSException unused) {
        }
    }

    @Override // com.jcraft.jsch.GSSContext
    public byte[] j6(byte[] bArr, int i, int i2) {
        try {
            try {
                if (DW == null) {
                    VH("javax.security.auth.useSubjectCredsOnly", "false");
                }
                return this.j6.initSecContext(bArr, 0, i2);
            } catch (GSSException e) {
                throw new JSchException(e.toString());
            } catch (SecurityException e2) {
                throw new JSchException(e2.toString());
            }
        } finally {
            if (DW == null) {
                VH("javax.security.auth.useSubjectCredsOnly", "true");
            }
        }
    }

    @Override // com.jcraft.jsch.GSSContext
    public byte[] v5(byte[] bArr, int i, int i2) {
        try {
            return this.j6.getMIC(bArr, i, i2, new MessageProp(0, true));
        } catch (GSSException unused) {
            return null;
        }
    }
}
