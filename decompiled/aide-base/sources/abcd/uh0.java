package abcd;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class uh0 implements mh0 {
    @Override // abcd.mh0
    public abstract ai0 DW();

    public byte[] Zo(String str) {
        if (str.equals("DER")) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new mj0(byteArrayOutputStream).tp(this);
            return byteArrayOutputStream.toByteArray();
        }
        if (!str.equals("DL")) {
            return v5();
        }
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        new yj0(byteArrayOutputStream2).tp(this);
        return byteArrayOutputStream2.toByteArray();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mh0) {
            return DW().equals(((mh0) obj).DW());
        }
        return false;
    }

    public int hashCode() {
        return DW().hashCode();
    }

    public byte[] v5() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new yh0(byteArrayOutputStream).tp(this);
        return byteArrayOutputStream.toByteArray();
    }
}
