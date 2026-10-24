package abcd;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public abstract class xb0 extends InputStream {
    private long AL;
    private final InputStream WB;
    private int cT;
    private final byte[] fY;
    private long hK;
    private long jw;
    private int k2;
    private long mb;
    private int qp;
    private int w9;
    private InputStream zh;

    public xb0(InputStream inputStream) throws EOFException {
        int i;
        int i2;
        byte[] bArr = new byte[512];
        this.fY = bArr;
        this.WB = inputStream;
        if (!j6(bArr.length)) {
            throw new EOFException();
        }
        int i3 = 0;
        int i4 = 0;
        do {
            byte[] bArr2 = this.fY;
            int i5 = this.qp;
            this.qp = i5 + 1;
            i = bArr2[i5] & 255;
            this.mb |= (i & 127) << i4;
            i4 += 7;
        } while ((i & 128) != 0);
        do {
            byte[] bArr3 = this.fY;
            int i6 = this.qp;
            this.qp = i6 + 1;
            i2 = bArr3[i6] & 255;
            this.jw |= (i2 & 127) << i3;
            i3 += 7;
        } while ((i2 & 128) != 0);
        this.w9 = Zo();
    }

    private int Hw() {
        return this.k2 - this.qp;
    }

    private int Zo() throws IOException {
        if (!j6(8)) {
            return 2;
        }
        byte[] bArr = this.fY;
        int i = this.qp;
        int i2 = i + 1;
        this.qp = i2;
        int i3 = bArr[i] & 255;
        if ((i3 & 128) == 0) {
            if (i3 == 0) {
                throw new i40(JGitText.DW().unsupportedCommand0);
            }
            j6(i3);
            this.cT = i3;
            return 1;
        }
        this.hK = 0L;
        if ((i3 & 1) != 0) {
            this.qp = i2 + 1;
            this.hK = bArr[i2] & 255;
        }
        if ((i3 & 2) != 0) {
            long j = this.hK;
            byte[] bArr2 = this.fY;
            this.qp = this.qp + 1;
            this.hK = j | ((bArr2[r5] & 255) << 8);
        }
        if ((i3 & 4) != 0) {
            long j2 = this.hK;
            byte[] bArr3 = this.fY;
            this.qp = this.qp + 1;
            this.hK = j2 | ((bArr3[r5] & 255) << 16);
        }
        if ((i3 & 8) != 0) {
            long j3 = this.hK;
            byte[] bArr4 = this.fY;
            this.qp = this.qp + 1;
            this.hK = j3 | ((bArr4[r5] & 255) << 24);
        }
        this.cT = 0;
        if ((i3 & 16) != 0) {
            byte[] bArr5 = this.fY;
            int i4 = this.qp;
            this.qp = i4 + 1;
            this.cT = bArr5[i4] & 255;
        }
        if ((i3 & 32) != 0) {
            int i5 = this.cT;
            byte[] bArr6 = this.fY;
            int i6 = this.qp;
            this.qp = i6 + 1;
            this.cT = ((bArr6[i6] & 255) << 8) | i5;
        }
        if ((i3 & 64) != 0) {
            int i7 = this.cT;
            byte[] bArr7 = this.fY;
            int i8 = this.qp;
            this.qp = i8 + 1;
            this.cT = i7 | ((bArr7[i8] & 255) << 16);
        }
        if (this.cT == 0) {
            this.cT = 65536;
        }
        return 0;
    }

    private boolean j6(int i) throws IOException {
        int i2;
        int iHw = Hw();
        if (i < iHw) {
            return true;
        }
        if (iHw == 0) {
            this.qp = 0;
            this.k2 = 0;
        } else {
            byte[] bArr = this.fY;
            int length = bArr.length;
            int i3 = this.qp;
            if (length - i3 < i) {
                System.arraycopy(bArr, i3, bArr, 0, iHw);
                this.qp = 0;
                this.k2 = iHw;
            }
        }
        do {
            InputStream inputStream = this.WB;
            byte[] bArr2 = this.fY;
            int i4 = this.k2;
            int i5 = inputStream.read(bArr2, i4, bArr2.length - i4);
            if (i5 < 0) {
                return Hw() > 0;
            }
            i2 = this.k2 + i5;
            this.k2 = i2;
        } while (i2 < this.fY.length);
        return true;
    }

    private void u7() throws IOException {
        InputStream inputStream = this.zh;
        if (inputStream == null) {
            this.zh = gn();
            if (DW() != this.mb) {
                throw new i40(JGitText.DW().baseLengthIncorrect);
            }
            eg0.VH(this.zh, this.hK);
            this.AL = this.hK;
            return;
        }
        long j = this.AL;
        long j2 = this.hK;
        if (j < j2) {
            eg0.VH(inputStream, j2 - j);
            this.AL = this.hK;
        } else if (j > j2) {
            inputStream.close();
            InputStream inputStreamGn = gn();
            this.zh = inputStreamGn;
            eg0.VH(inputStreamGn, this.hK);
            this.AL = this.hK;
        }
    }

    public abstract long DW();

    public long FH() {
        return this.jw;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.WB.close();
        InputStream inputStream = this.zh;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public abstract InputStream gn();

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == 1) {
            return bArr[0] & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws i40 {
        long j2 = 0;
        while (0 < j) {
            long jMin = Math.min(j, this.cT);
            int i = this.w9;
            if (i == 0) {
                this.hK += jMin;
            } else {
                if (i != 1) {
                    if (i == 2) {
                        return j2;
                    }
                    throw new i40(JGitText.DW().unsupportedCommand0);
                }
                this.qp = (int) (this.qp + jMin);
            }
            j2 += jMin;
            j -= jMin;
            int i2 = (int) (this.cT - jMin);
            this.cT = i2;
            if (i2 == 0) {
                this.w9 = Zo();
            }
        }
        return j2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i2 > 0) {
            int iMin = Math.min(i2, this.cT);
            int i4 = this.w9;
            if (i4 == 0) {
                u7();
                iMin = this.zh.read(bArr, i, iMin);
                if (iMin >= 0) {
                    long j = this.hK + iMin;
                    this.hK = j;
                    this.AL = j;
                } else {
                    throw new i40(JGitText.DW().baseLengthIncorrect);
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new i40(JGitText.DW().unsupportedCommand0);
                    }
                    if (i3 > 0) {
                        return i3;
                    }
                    return -1;
                }
                System.arraycopy(this.fY, this.qp, bArr, i, iMin);
                this.qp += iMin;
            }
            i3 += iMin;
            i += iMin;
            i2 -= iMin;
            int i5 = this.cT - iMin;
            this.cT = i5;
            if (i5 == 0) {
                this.w9 = Zo();
            }
        }
        return i3;
    }
}
