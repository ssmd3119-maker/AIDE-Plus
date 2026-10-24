package abcd;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class ck0 extends hk0 {
    private static final byte[] qp = new byte[0];
    private int fY;
    private final int jw;

    public ck0(InputStream inputStream, int i) {
        super(inputStream, i);
        if (i < 0) {
            throw new IllegalArgumentException("negative lengths not allowed");
        }
        this.jw = i;
        this.fY = i;
        if (i == 0) {
            DW(true);
        }
    }

    public byte[] FH() throws EOFException {
        int i = this.fY;
        if (i == 0) {
            return qp;
        }
        byte[] bArr = new byte[i];
        int iFH = i - mq0.FH(this.WB, bArr);
        this.fY = iFH;
        if (iFH == 0) {
            DW(true);
            return bArr;
        }
        throw new EOFException("DEF length " + this.jw + " object truncated by " + this.fY);
    }

    @Override // abcd.hk0
    public int j6() {
        return this.fY;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.fY == 0) {
            return -1;
        }
        int i = this.WB.read();
        if (i >= 0) {
            int i2 = this.fY - 1;
            this.fY = i2;
            if (i2 == 0) {
                DW(true);
            }
            return i;
        }
        throw new EOFException("DEF length " + this.jw + " object truncated by " + this.fY);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.fY;
        if (i3 == 0) {
            return -1;
        }
        int i4 = this.WB.read(bArr, i, Math.min(i2, i3));
        if (i4 >= 0) {
            int i5 = this.fY - i4;
            this.fY = i5;
            if (i5 == 0) {
                DW(true);
            }
            return i4;
        }
        throw new EOFException("DEF length " + this.jw + " object truncated by " + this.fY);
    }
}
