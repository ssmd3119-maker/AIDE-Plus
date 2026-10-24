package abcd;

import java.io.IOException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public class pm0 extends fq0 {
    public pm0(Collection collection) {
        super(DW(collection));
    }

    private static Collection DW(Collection collection) throws CertificateEncodingException {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj instanceof X509Certificate) {
                try {
                    arrayList.add(new om0(((X509Certificate) obj).getEncoded()));
                } catch (IOException e) {
                    throw new CertificateEncodingException("unable to read encoding: " + e.getMessage());
                }
            } else {
                arrayList.add((om0) obj);
            }
        }
        return arrayList;
    }
}
