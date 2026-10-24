package abcd;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class vm0 implements bn0 {
    private final byte[] DW;
    private final vh0 j6;

    public vm0(byte[] bArr) {
        this(new vh0(ok0.j6.XL()), bArr);
    }

    @Override // abcd.bn0
    public vh0 getContentType() {
        return this.j6;
    }

    @Override // abcd.um0
    public void j6(OutputStream outputStream) throws IOException {
        outputStream.write(this.DW);
    }

    public vm0(vh0 vh0Var, byte[] bArr) {
        this.j6 = vh0Var;
        this.DW = bArr;
    }
}
