package abcd;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class yh0 {
    private OutputStream j6;

    private class a extends yh0 {
        private boolean DW;

        public a(yh0 yh0Var, OutputStream outputStream) {
            super(outputStream);
            this.DW = true;
        }

        @Override // abcd.yh0
        public void FH(int i) {
            if (this.DW) {
                this.DW = false;
            } else {
                super.FH(i);
            }
        }
    }

    public yh0(OutputStream outputStream) {
        this.j6 = outputStream;
    }

    public yh0 DW() {
        return new yj0(this.j6);
    }

    public void EQ(int i, int i2) throws IOException {
        if (i2 < 31) {
            FH(i | i2);
            return;
        }
        FH(i | 31);
        if (i2 < 128) {
            FH(i2);
            return;
        }
        byte[] bArr = new byte[5];
        int i3 = 4;
        bArr[4] = (byte) (i2 & 127);
        do {
            i2 >>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | 128);
        } while (i2 > 127);
        v5(bArr, i3, 5 - i3);
    }

    public void FH(int i) {
        this.j6.write(i);
    }

    public void Hw(byte[] bArr) {
        this.j6.write(bArr);
    }

    public void VH(int i, byte[] bArr) {
        FH(i);
        u7(bArr.length);
        Hw(bArr);
    }

    public void Zo(int i, int i2, byte[] bArr) throws IOException {
        EQ(i, i2);
        u7(bArr.length);
        Hw(bArr);
    }

    public void gn(ai0 ai0Var) throws IOException {
        if (ai0Var == null) {
            throw new IOException("null object detected");
        }
        ai0Var.gn(new a(this, this.j6));
    }

    public yh0 j6() {
        return new mj0(this.j6);
    }

    public void tp(mh0 mh0Var) throws IOException {
        if (mh0Var == null) {
            throw new IOException("null object detected");
        }
        mh0Var.DW().gn(this);
    }

    public void u7(int i) {
        if (i <= 127) {
            FH((byte) i);
            return;
        }
        int i2 = i;
        int i3 = 1;
        while (true) {
            i2 >>>= 8;
            if (i2 == 0) {
                break;
            } else {
                i3++;
            }
        }
        FH((byte) (i3 | 128));
        for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
            FH((byte) (i >> i4));
        }
    }

    public void v5(byte[] bArr, int i, int i2) throws IOException {
        this.j6.write(bArr, i, i2);
    }
}
