package abcd;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class m30 extends p30 {
    public static final m30 FH = new m30(new byte[0]);
    protected final fg0 DW;
    protected final byte[] j6;

    public m30(byte[] bArr) {
        this.j6 = bArr;
        this.DW = kg0.Ws(bArr, 0, bArr.length);
    }

    private int DW(int i) {
        return this.DW.Hw(i + 2);
    }

    private int FH(int i) {
        return this.DW.Hw(i + 1);
    }

    public static boolean Hw(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[8000];
        int i = 0;
        while (i < 8000) {
            int i2 = inputStream.read(bArr, i, 8000 - i);
            if (i2 == -1) {
                break;
            }
            i += i2;
        }
        return Zo(bArr, i);
    }

    public static boolean Zo(byte[] bArr, int i) {
        if (i > 8000) {
            i = 8000;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean v5(byte[] bArr) {
        return Zo(bArr, bArr.length);
    }

    public boolean VH() {
        fg0 fg0Var = this.DW;
        int iHw = fg0Var.Hw(fg0Var.VH() - 1);
        return iHw == 0 || this.j6[iHw - 1] != 10;
    }

    public void gn(OutputStream outputStream, int i) throws IOException {
        int iFH = FH(i);
        int iDW = DW(i);
        if (this.j6[iDW - 1] == 10) {
            iDW--;
        }
        outputStream.write(this.j6, iFH, iDW - iFH);
    }

    @Override // abcd.p30
    public int j6() {
        return this.DW.VH() - 2;
    }
}
