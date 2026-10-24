package abcd;

import java.io.IOException;
import java.security.Principal;

/* loaded from: classes.dex */
public class ip0 extends hm0 implements Principal {
    public ip0(byte[] bArr) {
        super(Ws(new rh0(bArr)));
    }

    private static bi0 Ws(rh0 rh0Var) throws IOException {
        try {
            return bi0.J8(rh0Var.we());
        } catch (IllegalArgumentException e) {
            throw new IOException("not an ASN.1 Sequence: " + e);
        }
    }

    @Override // java.security.Principal
    public String getName() {
        return toString();
    }

    @Override // abcd.uh0
    public byte[] v5() {
        try {
            return Zo("DER");
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }

    public ip0(ol0 ol0Var) {
        super((bi0) ol0Var.DW());
    }
}
