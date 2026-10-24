package abcd;

import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ym0 extends zm0 {
    private List a8 = new ArrayList();

    class a implements bn0 {
        private final /* synthetic */ um0 DW;
        private final /* synthetic */ vh0 j6;

        public a(ym0 ym0Var, vh0 vh0Var, um0 um0Var) {
            this.j6 = vh0Var;
            this.DW = um0Var;
        }

        @Override // abcd.bn0
        public vh0 getContentType() {
            return this.j6;
        }

        @Override // abcd.um0
        public void j6(OutputStream outputStream) {
            this.DW.j6(outputStream);
        }
    }

    private class b {
        final Object DW;
        final String FH;
        final String Hw;
        final sm0 Zo;
        final PrivateKey j6;
        final sm0 v5;

        public gn0 j6(SecureRandom secureRandom, Provider provider, boolean z) throws up0, NoSuchAlgorithmException, InvalidKeyException {
            String str = String.valueOf(an0.j6.FH(this.FH)) + "with" + an0.j6.Hw(this.Hw);
            jn0 jn0Var = new jn0(new yp0());
            if (z) {
                jn0Var.v5(this.v5);
            }
            jn0Var.Hw(!z);
            jn0Var.Zo(this.Zo);
            try {
                aq0 aq0Var = new aq0(str);
                aq0Var.Hw(secureRandom);
                if (provider != null) {
                    aq0Var.FH(provider);
                }
                op0 op0VarDW = aq0Var.DW(this.j6);
                Object obj = this.DW;
                return obj instanceof X509Certificate ? jn0Var.j6(op0VarDW, (X509Certificate) obj) : jn0Var.FH(op0VarDW, (byte[]) obj);
            } catch (IllegalArgumentException e) {
                throw new NoSuchAlgorithmException(e.getMessage());
            }
        }
    }

    public xm0 FH(String str, um0 um0Var, boolean z, String str2, boolean z2) {
        return Hw(str, um0Var, z, cn0.Hw(str2), z2);
    }

    public xm0 Hw(String str, um0 um0Var, boolean z, Provider provider, boolean z2) throws tm0 {
        vh0 vh0Var = str == null ? null : new vh0(str);
        Iterator it = this.a8.iterator();
        while (it.hasNext()) {
            try {
                this.Hw.add(((b) it.next()).j6(this.Zo, provider, z2));
            } catch (up0 e) {
                throw new tm0("exception creating signerInf", e);
            } catch (IOException e2) {
                throw new tm0("exception encoding attributes", e2);
            } catch (CertificateEncodingException e3) {
                throw new tm0("error creating sid.", e3);
            }
        }
        this.a8.clear();
        return um0Var != null ? v5(new a(this, vh0Var, um0Var), z) : v5(new rm0(vh0Var), z);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public abcd.xm0 v5(abcd.bn0 r13, boolean r14) throws abcd.tm0, java.io.IOException {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.ym0.v5(abcd.bn0, boolean):abcd.xm0");
    }
}
