package abcd;

import java.io.DataInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class os {
    private final int DW;
    private final int FH;
    private final byte[] j6;

    public static class a extends DataInputStream {
        private final b WB;

        public a(b bVar) {
            super(bVar);
            this.WB = bVar;
        }
    }

    public os(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("bytes == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start < 0");
        }
        if (i2 < i) {
            throw new IllegalArgumentException("end < start");
        }
        if (i2 > bArr.length) {
            throw new IllegalArgumentException("end > bytes.length");
        }
        this.j6 = bArr;
        this.DW = i;
        this.FH = i2 - i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int J0(int i) {
        return this.j6[this.DW + i] & 255;
    }

    private int VH(int i) {
        return this.j6[this.DW + i];
    }

    private void v5(int i, int i2) {
        if (i < 0 || i2 < i || i2 > this.FH) {
            throw new IllegalArgumentException("bad range: " + i + ".." + i2 + "; actual size " + this.FH);
        }
    }

    public int EQ(int i) {
        v5(i, i + 2);
        return J0(i + 1) | (VH(i) << 8);
    }

    public int J8(int i) {
        v5(i, i + 2);
        return J0(i + 1) | (J0(i) << 8);
    }

    public b QX() {
        return new b();
    }

    public a Ws() {
        return new a(QX());
    }

    public int XL() {
        return this.FH;
    }

    public int Zo(int i) {
        v5(i, i + 1);
        return VH(i);
    }

    public os aM(int i, int i2) {
        v5(i, i2);
        byte[] bArr = this.j6;
        int i3 = this.DW;
        return new os(bArr, i + i3, i2 + i3);
    }

    public void gn(byte[] bArr, int i) {
        int length = bArr.length - i;
        int i2 = this.FH;
        if (length < i2) {
            throw new IndexOutOfBoundsException("(out.length - offset) < size()");
        }
        System.arraycopy(this.j6, this.DW, bArr, i, i2);
    }

    public long tp(int i) {
        v5(i, i + 8);
        return ((J0(i + 7) | (VH(i + 4) << 24) | (J0(i + 5) << 16) | (J0(i + 6) << 8)) & 4294967295L) | (((((VH(i) << 24) | (J0(i + 1) << 16)) | (J0(i + 2) << 8)) | J0(i + 3)) << 32);
    }

    public int u7(int i) {
        v5(i, i + 4);
        return J0(i + 3) | (VH(i) << 24) | (J0(i + 1) << 16) | (J0(i + 2) << 8);
    }

    public int we(int i) {
        v5(i, i + 1);
        return J0(i);
    }

    public class b extends InputStream {
        private int WB = 0;
        private int mb = 0;

        public b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return os.this.FH - this.WB;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.mb = this.WB;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.WB >= os.this.FH) {
                return -1;
            }
            int iJ0 = os.this.J0(this.WB);
            this.WB++;
            return iJ0;
        }

        @Override // java.io.InputStream
        public void reset() {
            this.WB = this.mb;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            int i3 = os.this.FH - this.WB;
            if (i2 > i3) {
                i2 = i3;
            }
            System.arraycopy(os.this.j6, this.WB + os.this.DW, bArr, i, i2);
            this.WB += i2;
            return i2;
        }
    }

    public os(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }
}
