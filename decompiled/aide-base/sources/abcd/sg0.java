package abcd;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class sg0 extends InputStream {
    private int fY;
    private final InputStream jw;
    private boolean k2;
    private int qp;
    private boolean zh;
    private final byte[] WB = new byte[1];
    private final byte[] mb = new byte[8096];

    public sg0(InputStream inputStream) {
        this.jw = inputStream;
    }

    private boolean j6() throws IOException {
        InputStream inputStream = this.jw;
        byte[] bArr = this.mb;
        int i = inputStream.read(bArr, 0, bArr.length);
        this.fY = i;
        if (i < 1) {
            return false;
        }
        if (!this.zh) {
            this.k2 = m30.Zo(this.mb, i);
            this.zh = true;
        }
        this.qp = 0;
        return true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.jw.close();
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.WB, 0, 1) == 1) {
            return this.WB[0] & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        if (this.fY == -1) {
            return -1;
        }
        int i4 = i2 + i;
        int i5 = i;
        while (true) {
            if (i5 >= i4 || (this.qp == this.fY && !j6())) {
                break;
            }
            byte[] bArr2 = this.mb;
            int i6 = this.qp;
            int i7 = i6 + 1;
            this.qp = i7;
            byte b = bArr2[i6];
            if (!this.k2 && b == 13) {
                if (i7 == this.fY && !j6()) {
                    bArr[i5] = 13;
                    i5++;
                    break;
                }
                byte[] bArr3 = this.mb;
                int i8 = this.qp;
                if (bArr3[i8] == 10) {
                    i3 = i5 + 1;
                    bArr[i5] = 10;
                    this.qp = i8 + 1;
                } else {
                    i3 = i5 + 1;
                    bArr[i5] = 13;
                }
                i5 = i3;
            } else {
                bArr[i5] = b;
                i5++;
            }
        }
        if (i == i5) {
            return -1;
        }
        return i5 - i;
    }
}
