package abcd;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes.dex */
public class r30 {
    private static final a Zo = new a();
    private int DW;
    private long j6;
    private int v5 = 8;
    private long[] Hw = new long[1 << 8];
    private int FH = VH(8);

    static class a extends Exception {
    }

    private static int EQ(long j) {
        return (int) (j >>> 32);
    }

    private static long FH(r30 r30Var, r30 r30Var2) {
        return Hw(r30Var.Hw, r30Var.we(0), r30Var2.Hw, r30Var2.we(0));
    }

    private static long Hw(long[] jArr, int i, long[] jArr2, int i2) {
        long jMin = 0;
        if (i == jArr.length || i2 == jArr2.length) {
            return 0L;
        }
        int iEQ = EQ(jArr[i]);
        int iEQ2 = EQ(jArr2[i2]);
        while (true) {
            if (iEQ == iEQ2) {
                jMin += Math.min(v5(jArr[i]), v5(jArr2[i2]));
                i++;
                if (i == jArr.length) {
                    break;
                }
                iEQ = EQ(jArr[i]);
                i2++;
                if (i2 == jArr2.length) {
                    break;
                }
                iEQ2 = EQ(jArr2[i2]);
            } else if (iEQ < iEQ2) {
                i++;
                if (i == jArr.length) {
                    break;
                }
                iEQ = EQ(jArr[i]);
            } else {
                i2++;
                if (i2 == jArr2.length) {
                    break;
                }
                iEQ2 = EQ(jArr2[i2]);
            }
        }
        return jMin;
    }

    private static long J0(int i, long j) throws a {
        if (4294967295L >= j) {
            return j | (i << 32);
        }
        throw new a();
    }

    private int QX(int i) {
        return i >>> (31 - this.v5);
    }

    private static int VH(int i) {
        return ((1 << i) * (i - 3)) / i;
    }

    private void Zo() throws a {
        long[] jArr;
        int i = this.v5;
        if (i == 30) {
            throw new a();
        }
        long[] jArr2 = this.Hw;
        int i2 = i + 1;
        this.v5 = i2;
        this.FH = VH(i2);
        try {
            this.Hw = new long[1 << this.v5];
            for (long j : jArr2) {
                if (j != 0) {
                    int iQX = QX(EQ(j));
                    while (true) {
                        jArr = this.Hw;
                        if (jArr[iQX] == 0) {
                            break;
                        }
                        iQX++;
                        if (iQX >= jArr.length) {
                            iQX = 0;
                        }
                    }
                    jArr[iQX] = j;
                }
            }
        } catch (OutOfMemoryError unused) {
            throw Zo;
        }
    }

    private static long v5(long j) {
        return j & 4294967295L;
    }

    private int we(int i) {
        return (this.Hw.length - this.DW) + i;
    }

    public long DW(r30 r30Var) {
        return FH(this, r30Var);
    }

    public int J8(r30 r30Var, int i) {
        long jMax = Math.max(this.j6, r30Var.j6);
        return jMax == 0 ? i : (int) ((DW(r30Var) * i) / jMax);
    }

    public void Ws(long j) {
        this.j6 = j;
    }

    public void XL() {
        Arrays.sort(this.Hw);
    }

    public void gn(InputStream inputStream, long j) throws a, IOException {
        int i;
        byte[] bArr = new byte[4096];
        int i2 = 0;
        int i3 = 0;
        while (0 < j) {
            int i4 = 5381;
            int i5 = 0;
            while (true) {
                if (i2 == i3) {
                    int i6 = inputStream.read(bArr, 0, 4096);
                    if (i6 <= 0) {
                        throw new EOFException();
                    }
                    i3 = i6;
                    i2 = 0;
                }
                i5++;
                i = i2 + 1;
                int i7 = bArr[i2] & 255;
                if (i7 == 10) {
                    break;
                }
                i4 = (i4 << 5) + i4 + i7;
                if (i5 >= 64 || i5 >= j) {
                    break;
                } else {
                    i2 = i;
                }
            }
            j6(i4, i5);
            j -= i5;
            i2 = i;
        }
    }

    public void j6(int i, int i2) throws a {
        int i3 = (i * (-1640562687)) >>> 1;
        int iQX = QX(i3);
        while (true) {
            long[] jArr = this.Hw;
            long j = jArr[iQX];
            if (j == 0) {
                if (this.FH > this.DW) {
                    jArr[iQX] = J0(i3, i2);
                    this.DW++;
                    return;
                } else {
                    Zo();
                    iQX = QX(i3);
                }
            } else if (EQ(j) == i3) {
                this.Hw[iQX] = J0(i3, v5(j) + i2);
                return;
            } else {
                iQX++;
                if (iQX >= this.Hw.length) {
                    iQX = 0;
                }
            }
        }
    }

    public void tp(byte[] bArr, int i, int i2) throws a {
        int i3;
        while (i < i2) {
            int i4 = 5381;
            int i5 = i;
            while (true) {
                i3 = i5 + 1;
                int i6 = bArr[i5] & 255;
                if (i6 == 10) {
                    break;
                }
                i4 = (i4 << 5) + i4 + i6;
                if (i3 >= i2 || i3 - i >= 64) {
                    break;
                } else {
                    i5 = i3;
                }
            }
            j6(i4, i3 - i);
            i = i3;
        }
    }

    public void u7(f70 f70Var) throws a, IOException {
        if (!f70Var.gn()) {
            byte[] bArrHw = f70Var.Hw();
            Ws(bArrHw.length);
            tp(bArrHw, 0, bArrHw.length);
        } else {
            h70 h70VarU7 = f70Var.u7();
            try {
                Ws(h70VarU7.j6());
                gn(h70VarU7, this.j6);
            } finally {
                h70VarU7.close();
            }
        }
    }
}
