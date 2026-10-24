package abcd;

import java.security.cert.CertificateEncodingException;

/* loaded from: classes.dex */
public class oq0 extends CertificateEncodingException {
    Throwable WB;

    public oq0(String str, Throwable th) {
        super(str);
        this.WB = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.WB;
    }
}
