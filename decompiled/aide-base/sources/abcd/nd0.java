package abcd;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class nd0 {
    private static final byte[] Hw = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    private final byte[] DW = new byte[5];
    private boolean FH = true;
    private final OutputStream j6;

    public nd0(OutputStream outputStream) {
        this.j6 = outputStream;
    }

    private void FH(int i) {
        Hw(this.DW, i);
    }

    public static void Hw(byte[] bArr, int i) {
        int i2 = 3;
        while (i2 >= 0 && i != 0) {
            bArr[i2] = Hw[i & 15];
            i >>>= 4;
            i2--;
        }
        while (i2 >= 0) {
            bArr[i2] = 48;
            i2--;
        }
    }

    public void DW() throws IOException {
        this.j6.flush();
    }

    public void VH(String str) throws IOException {
        Zo(r60.DW(str));
    }

    public void Zo(byte[] bArr) throws IOException {
        FH(bArr.length + 4);
        this.j6.write(this.DW, 0, 4);
        this.j6.write(bArr);
    }

    public void j6() throws IOException {
        FH(0);
        this.j6.write(this.DW, 0, 4);
        if (this.FH) {
            DW();
        }
    }

    public void v5(boolean z) {
        this.FH = z;
    }
}
