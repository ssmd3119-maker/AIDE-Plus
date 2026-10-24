package kellinwood.sigblock;

import abcd.bq0;
import abcd.gn0;
import abcd.jn0;
import abcd.jp0;
import abcd.op0;
import abcd.pm0;
import abcd.qp0;
import abcd.sl0;
import abcd.tm0;
import abcd.up0;
import abcd.vm0;
import abcd.ym0;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Collections;

/* loaded from: classes.dex */
public class SignatureBlockWriter {
    private static boolean j6;

    class a implements op0 {
        private final /* synthetic */ byte[] j6;

        a(byte[] bArr) {
            this.j6 = bArr;
        }

        @Override // abcd.op0
        public sl0 FH() {
            return new qp0().DW("SHA1withRSA");
        }

        @Override // abcd.op0
        public byte[] Hw() {
            return this.j6;
        }

        @Override // abcd.op0
        public OutputStream j6() {
            return new ByteArrayOutputStream();
        }
    }

    public static synchronized void writeSignatureBlock(byte[] bArr, X509Certificate x509Certificate, OutputStream outputStream) {
        if (!j6) {
            Security.addProvider(new jp0());
            j6 = true;
        }
        ym0 ym0Var = new ym0();
        try {
            try {
                ym0Var.j6(new pm0(Collections.singleton(x509Certificate)));
                a aVar = new a(bArr);
                bq0 bq0Var = new bq0();
                bq0Var.FH("SC");
                ym0Var.DW(new gn0(new jn0(bq0Var.DW()).j6(aVar, x509Certificate), null, null));
                outputStream.write(ym0Var.FH("1.2.840.113549.1.7.1", new vm0(new byte[0]), false, "SC", false).j6().Zo("DER"));
            } catch (tm0 e) {
                System.err.println(e);
                throw new GeneralSecurityException(e);
            } catch (Error e2) {
                System.err.println(e2);
                throw e2;
            }
        } catch (up0 e3) {
            System.err.println(e3);
            throw new GeneralSecurityException(e3);
        } catch (RuntimeException e4) {
            System.err.println(e4);
            throw e4;
        }
    }
}
