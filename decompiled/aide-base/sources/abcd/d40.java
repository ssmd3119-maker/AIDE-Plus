package abcd;

import java.io.OutputStream;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public class d40 {
    private int DW;
    private a70 FH;
    private d40[] Hw;
    private byte[] j6;
    private int v5;
    private static final byte[] Zo = new byte[0];
    private static final d40[] VH = new d40[0];
    private static final Comparator<d40> gn = new a();

    class a implements Comparator<d40> {
        @Override // java.util.Comparator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compare(d40 d40Var, d40 d40Var2) {
            byte[] bArr = d40Var.j6;
            byte[] bArr2 = d40Var2.j6;
            int length = bArr.length;
            int length2 = bArr2.length;
            int i = 0;
            while (i < length && i < length2) {
                int i2 = (bArr[i] & 255) - (bArr2[i] & 255);
                if (i2 != 0) {
                    return i2;
                }
                i++;
            }
            if (length == length2) {
                return 0;
            }
            return length < length2 ? 47 - (bArr2[i] & 255) : (bArr[i] & 255) - 47;
        }
    }

    public d40() {
        this.j6 = Zo;
        this.Hw = VH;
        this.v5 = 0;
        this.DW = -1;
    }

    private int DW(b40[] b40VarArr, int i, int i2, e70 e70Var) throws k50 {
        int i3 = this.DW + i;
        int iHw = 0;
        int i4 = 0;
        while (i < i3) {
            b40 b40Var = b40VarArr[i];
            if (b40Var.we() != 0) {
                throw new k50(b40Var);
            }
            byte[] bArr = b40Var.FH;
            if (i4 < this.v5) {
                d40 d40Var = this.Hw[i4];
                if (d40Var.FH(bArr, i2, bArr.length)) {
                    d40Var.XL(b40VarArr, i, d40Var.tp() + i2 + 1, e70Var);
                    iHw += w70.Hw(t60.Hw, d40Var.tp());
                    i += d40Var.DW;
                    i4++;
                }
            }
            iHw += w70.Hw(b40Var.v5(), bArr.length - i2);
            i++;
        }
        return iHw;
    }

    private static int EQ(byte[] bArr, int i, d40 d40Var) {
        if (d40Var == null) {
            return -1;
        }
        byte[] bArr2 = d40Var.j6;
        int length = bArr.length;
        int length2 = bArr2.length;
        int i2 = 0;
        while (i < length && i2 < length2) {
            int i3 = (bArr[i] & 255) - (bArr2[i2] & 255);
            if (i3 != 0) {
                return i3;
            }
            i++;
            i2++;
        }
        return i2 == length2 ? bArr[i] == 47 ? 0 : -1 : length - length2;
    }

    private void J0(int i) {
        int i2 = this.v5 - 1;
        this.v5 = i2;
        if (i < i2) {
            d40[] d40VarArr = this.Hw;
            System.arraycopy(d40VarArr, i + 1, d40VarArr, i, i2 - i);
        }
        this.Hw[i2] = null;
    }

    private static int J8(byte[] bArr, int i) {
        int length = bArr.length;
        while (i < length) {
            if (bArr[i] == 47) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private void gn(int i, d40 d40Var) {
        d40[] d40VarArr = this.Hw;
        int i2 = this.v5;
        if (i2 + 1 <= d40VarArr.length) {
            if (i < i2) {
                System.arraycopy(d40VarArr, i, d40VarArr, i + 1, i2 - i);
            }
            d40VarArr[i] = d40Var;
            this.v5++;
            return;
        }
        int length = d40VarArr.length;
        d40[] d40VarArr2 = new d40[length + 1];
        if (i > 0) {
            System.arraycopy(d40VarArr, 0, d40VarArr2, 0, i);
        }
        d40VarArr2[i] = d40Var;
        if (i < length) {
            System.arraycopy(d40VarArr, i, d40VarArr2, i + 1, length - i);
        }
        this.Hw = d40VarArr2;
        this.v5++;
    }

    public static boolean we(byte[] bArr, byte[] bArr2, int i) {
        if (bArr2.length < i) {
            return false;
        }
        do {
            i--;
            if (i < 0) {
                return true;
            }
        } while (bArr[i] == bArr2[i]);
        return false;
    }

    public final boolean FH(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.j6;
        int length = bArr2.length;
        int i3 = 0;
        while (i3 < length && i < i2) {
            if (bArr2[i3] != bArr[i]) {
                return false;
            }
            i3++;
            i++;
        }
        return i != i2 && bArr[i] == 47;
    }

    public d40 Hw(int i) {
        return this.Hw[i];
    }

    public void QX(byte[] bArr, OutputStream outputStream) {
        int length = bArr.length - 1;
        bArr[length] = 10;
        int iJ0 = kg0.J0(bArr, length, this.v5) - 1;
        bArr[iJ0] = 32;
        int iJ02 = kg0.J0(bArr, iJ0, u7() ? this.DW : -1) - 1;
        bArr[iJ02] = 0;
        outputStream.write(this.j6);
        outputStream.write(bArr, iJ02, bArr.length - iJ02);
        if (u7()) {
            this.FH.tp(bArr, 0);
            outputStream.write(bArr, 0, 20);
        }
        for (int i = 0; i < this.v5; i++) {
            this.Hw[i].QX(bArr, outputStream);
        }
    }

    public a70 VH() {
        return this.FH;
    }

    public void Ws(b40[] b40VarArr, int i, int i2, int i3) {
        if (this.DW >= 0) {
            return;
        }
        int i4 = 0;
        this.DW = 0;
        if (i == 0) {
            return;
        }
        byte[] bArr = b40VarArr[i2].FH;
        while (i2 < i) {
            byte[] bArr2 = b40VarArr[i2].FH;
            if (i3 > 0 && !we(bArr, bArr2, i3)) {
                break;
            }
            d40 d40Var = i4 < this.v5 ? this.Hw[i4] : null;
            int iEQ = EQ(bArr2, i3, d40Var);
            if (iEQ > 0) {
                J0(i4);
            } else {
                if (iEQ < 0) {
                    int iJ8 = J8(bArr2, i3);
                    if (iJ8 < 0) {
                        i2++;
                        this.DW++;
                    } else {
                        d40 d40Var2 = new d40(this, bArr2, i3, iJ8 - i3);
                        gn(i4, d40Var2);
                        d40Var = d40Var2;
                    }
                }
                d40Var.Ws(b40VarArr, i, i2, d40Var.tp() + i3 + 1);
                int i5 = d40Var.DW;
                i2 += i5;
                this.DW += i5;
                i4++;
            }
        }
        while (true) {
            int i6 = this.v5;
            if (i4 >= i6) {
                return;
            } else {
                J0(i6 - 1);
            }
        }
    }

    public a70 XL(b40[] b40VarArr, int i, int i2, e70 e70Var) {
        if (this.FH == null) {
            int i3 = this.DW + i;
            w70 w70Var = new w70(DW(b40VarArr, i, i2, e70Var));
            int i4 = 0;
            while (i < i3) {
                b40 b40Var = b40VarArr[i];
                byte[] bArr = b40Var.FH;
                if (i4 < this.v5) {
                    d40 d40Var = this.Hw[i4];
                    if (d40Var.FH(bArr, i2, bArr.length)) {
                        w70Var.FH(d40Var.j6, t60.Hw, d40Var.FH);
                        i += d40Var.DW;
                        i4++;
                    }
                }
                w70Var.DW(bArr, i2, bArr.length - i2, b40Var.v5(), b40Var.J0(), b40Var.J8());
                i++;
            }
            this.FH = e70Var.tp(w70Var);
        }
        return this.FH;
    }

    public int Zo() {
        return this.DW;
    }

    public final int tp() {
        return this.j6.length;
    }

    public boolean u7() {
        return this.FH != null;
    }

    public int v5() {
        return this.v5;
    }

    private d40(d40 d40Var, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.j6 = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.Hw = VH;
        this.v5 = 0;
        this.DW = -1;
    }

    public d40(byte[] bArr, hg0 hg0Var, d40 d40Var) {
        int iXL = kg0.XL(bArr, hg0Var.j6, (char) 0);
        int i = hg0Var.j6;
        boolean z = true;
        int i2 = (iXL - i) - 1;
        if (i2 > 0) {
            byte[] bArr2 = new byte[i2];
            this.j6 = bArr2;
            System.arraycopy(bArr, i, bArr2, 0, i2);
        } else {
            this.j6 = Zo;
        }
        this.DW = kg0.Mr(bArr, iXL, hg0Var);
        int iMr = kg0.Mr(bArr, hg0Var.j6, hg0Var);
        int iXL2 = kg0.XL(bArr, hg0Var.j6, '\n');
        hg0Var.j6 = iXL2;
        if (this.DW >= 0) {
            this.FH = a70.ef(bArr, iXL2);
            hg0Var.j6 += 20;
        }
        if (iMr > 0) {
            this.Hw = new d40[iMr];
            for (int i3 = 0; i3 < iMr; i3++) {
                this.Hw[i3] = new d40(bArr, hg0Var, this);
                if (z && i3 > 0) {
                    Comparator<d40> comparator = gn;
                    d40[] d40VarArr = this.Hw;
                    if (comparator.compare(d40VarArr[i3 - 1], d40VarArr[i3]) > 0) {
                        z = false;
                    }
                }
            }
            if (!z) {
                Arrays.sort(this.Hw, 0, iMr, gn);
            }
        } else {
            this.Hw = VH;
        }
        this.v5 = iMr;
    }
}
