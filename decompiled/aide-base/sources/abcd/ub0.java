package abcd;

import com.aide.uidesigner.ProxyTextView;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class ub0 {
    private final byte[] DW = new byte[32];
    private final int FH;
    private int Hw;
    private final OutputStream j6;

    public ub0(OutputStream outputStream, long j, long j2, int i) throws IOException {
        this.j6 = outputStream;
        this.FH = i;
        v5(j);
        v5(j2);
    }

    private int DW(int i, long j, int i2) {
        int i3;
        int i4 = i + 1;
        long j2 = j & 255;
        if (j2 != 0) {
            i3 = ProxyTextView.INPUTTYPE_textPassword;
            this.DW[i4] = (byte) j2;
            i4++;
        } else {
            i3 = 128;
        }
        if ((65280 & j) != 0) {
            i3 |= 2;
            this.DW[i4] = (byte) ((j >>> 8) & 255);
            i4++;
        }
        if ((16711680 & j) != 0) {
            i3 |= 4;
            this.DW[i4] = (byte) ((j >>> 16) & 255);
            i4++;
        }
        if (((-16777216) & j) != 0) {
            i3 |= 8;
            this.DW[i4] = (byte) ((j >>> 24) & 255);
            i4++;
        }
        if (i2 != 65536) {
            int i5 = i2 & 255;
            if (i5 != 0) {
                i3 |= 16;
                this.DW[i4] = (byte) i5;
                i4++;
            }
            if ((65280 & i2) != 0) {
                this.DW[i4] = (byte) ((i2 >>> 8) & 255);
                i3 |= 32;
                i4++;
            }
            if ((16711680 & i2) != 0) {
                i3 |= 64;
                this.DW[i4] = (byte) ((i2 >>> 16) & 255);
                i4++;
            }
        }
        this.DW[i] = (byte) i3;
        return i4;
    }

    private void v5(long j) throws IOException {
        int i = 0;
        while (j >= 128) {
            this.DW[i] = (byte) ((((int) j) & 127) | 128);
            j >>>= 7;
            i++;
        }
        int i2 = i + 1;
        this.DW[i] = (byte) (((int) j) & 127);
        int i3 = this.Hw + i2;
        this.Hw = i3;
        int i4 = this.FH;
        if (i4 <= 0 || i3 < i4) {
            this.j6.write(this.DW, 0, i2);
        }
    }

    public boolean FH(byte[] bArr) {
        return Hw(bArr, 0, bArr.length);
    }

    public boolean Hw(byte[] bArr, int i, int i2) throws IOException {
        if (i2 <= 0) {
            return true;
        }
        if (this.FH > 0) {
            int i3 = i2 / 127;
            if (i2 % 127 != 0) {
                i3++;
            }
            if (this.FH < this.Hw + i3 + i2) {
                return false;
            }
        }
        do {
            int iMin = Math.min(127, i2);
            this.j6.write((byte) iMin);
            this.j6.write(bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
            this.Hw += iMin + 1;
        } while (i2 > 0);
        return true;
    }

    public boolean j6(long j, int i) throws IOException {
        if (i == 0) {
            return true;
        }
        while (true) {
            int iDW = 0;
            while (65536 < i) {
                iDW = DW(iDW, j, 65536);
                j += 65536;
                i -= 65536;
                if (this.DW.length < iDW + 8) {
                    int i2 = this.FH;
                    if (i2 > 0 && i2 < this.Hw + iDW) {
                        return false;
                    }
                    this.j6.write(this.DW, 0, iDW);
                    this.Hw += iDW;
                }
            }
            int iDW2 = DW(iDW, j, i);
            int i3 = this.FH;
            if (i3 > 0 && i3 < this.Hw + iDW2) {
                return false;
            }
            this.j6.write(this.DW, 0, iDW2);
            this.Hw += iDW2;
            return true;
        }
    }
}
