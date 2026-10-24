package abcd;

import java.io.IOException;
import java.util.Enumeration;

/* loaded from: classes.dex */
public class fk0 implements Enumeration {
    private Object DW = j6();
    private rh0 j6;

    public fk0(byte[] bArr) {
        this.j6 = new rh0(bArr, true);
    }

    private Object j6() {
        try {
            return this.j6.we();
        } catch (IOException e) {
            throw new zh0("malformed DER construction: " + e, e);
        }
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.DW != null;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        Object obj = this.DW;
        this.DW = j6();
        return obj;
    }
}
