package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public final class q7 {
    private final int DW;
    private f3 EQ;
    private final int FH;
    private int Hw;
    private int VH;
    private int Zo;
    private final byte[] j6;
    private int u7;
    private int v5;
    private int gn = Integer.MAX_VALUE;
    private int tp = 64;

    private q7(byte[] bArr, int i, int i2) {
        this.j6 = bArr;
        this.DW = i;
        int i3 = i2 + i;
        this.Hw = i3;
        this.FH = i3;
        this.Zo = i;
    }

    public static q7 EQ(byte[] bArr, int i, int i2) {
        return new q7(bArr, 0, i2);
    }

    private final void Mr() {
        int i = this.Hw + this.v5;
        this.Hw = i;
        int i2 = this.gn;
        if (i <= i2) {
            this.v5 = 0;
            return;
        }
        int i3 = i - i2;
        this.v5 = i3;
        this.Hw = i - i3;
    }

    private final byte U2() throws y7 {
        int i = this.Zo;
        if (i == this.Hw) {
            throw y7.j6();
        }
        byte[] bArr = this.j6;
        this.Zo = i + 1;
        return bArr[i];
    }

    private final f3 a8() throws IOException {
        if (this.EQ == null) {
            this.EQ = f3.we(this.j6, this.DW, this.FH);
        }
        int iVy = this.EQ.vy();
        int i = this.Zo - this.DW;
        if (iVy > i) {
            throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", Integer.valueOf(iVy), Integer.valueOf(i)));
        }
        this.EQ.EQ(i - iVy);
        this.EQ.gn(this.tp - this.u7);
        return this.EQ;
    }

    private final void u7(int i) throws y7 {
        if (i < 0) {
            throw y7.DW();
        }
        int i2 = this.Zo;
        int i3 = i2 + i;
        int i4 = this.gn;
        if (i3 > i4) {
            u7(i4 - i2);
            throw y7.j6();
        }
        if (i > this.Hw - i2) {
            throw y7.j6();
        }
        this.Zo = i2 + i;
    }

    public final String DW() throws y7 {
        int iQX = QX();
        if (iQX < 0) {
            throw y7.DW();
        }
        if (iQX > this.Hw - this.Zo) {
            throw y7.j6();
        }
        String str = new String(this.j6, this.Zo, iQX, x7.j6);
        this.Zo += iQX;
        return str;
    }

    public final <T extends e4<T, ?>> T FH(w5<T> w5Var) throws y7 {
        try {
            T t = (T) a8().v5(w5Var, r3.v5());
            Zo(this.VH);
            return t;
        } catch (k4 e) {
            throw new y7("", e);
        }
    }

    public final void Hw(z7 z7Var) throws y7 {
        int iQX = QX();
        if (this.u7 >= this.tp) {
            throw y7.Hw();
        }
        int iVH = VH(iQX);
        this.u7++;
        z7Var.j6(this);
        v5(0);
        this.u7--;
        gn(iVH);
    }

    final void J0(int i, int i2) {
        int i3 = this.Zo;
        int i4 = this.DW;
        if (i > i3 - i4) {
            int i5 = this.Zo - this.DW;
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(i);
            sb.append(" is beyond current ");
            sb.append(i5);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i >= 0) {
            this.Zo = i4 + i;
            this.VH = i2;
        } else {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final int J8() throws y7 {
        if (this.Zo == this.Hw) {
            this.VH = 0;
            return 0;
        }
        int iQX = QX();
        this.VH = iQX;
        if (iQX != 0) {
            return iQX;
        }
        throw new y7("Protocol message contained an invalid tag (zero).");
    }

    public final int QX() throws y7 {
        int i;
        byte bU2 = U2();
        if (bU2 >= 0) {
            return bU2;
        }
        int i2 = bU2 & 127;
        byte bU22 = U2();
        if (bU22 >= 0) {
            i = bU22 << 7;
        } else {
            i2 |= (bU22 & 127) << 7;
            byte bU23 = U2();
            if (bU23 >= 0) {
                i = bU23 << 14;
            } else {
                i2 |= (bU23 & 127) << 14;
                byte bU24 = U2();
                if (bU24 < 0) {
                    int i3 = i2 | ((bU24 & 127) << 21);
                    byte bU25 = U2();
                    int i4 = i3 | (bU25 << 28);
                    if (bU25 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        if (U2() >= 0) {
                            return i4;
                        }
                    }
                    throw y7.FH();
                }
                i = bU24 << 21;
            }
        }
        return i2 | i;
    }

    public final int VH(int i) throws y7 {
        if (i < 0) {
            throw y7.DW();
        }
        int i2 = i + this.Zo;
        int i3 = this.gn;
        if (i2 > i3) {
            throw y7.j6();
        }
        this.gn = i2;
        Mr();
        return i3;
    }

    public final boolean Ws() {
        return QX() != 0;
    }

    public final long XL() throws y7 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & 127) << i;
            if ((U2() & 128) == 0) {
                return j;
            }
        }
        throw y7.FH();
    }

    public final boolean Zo(int i) throws y7 {
        int iJ8;
        int i2 = i & 7;
        if (i2 == 0) {
            QX();
            return true;
        }
        if (i2 == 1) {
            j3();
            return true;
        }
        if (i2 == 2) {
            u7(QX());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw new y7("Protocol message tag had invalid wire type.");
            }
            aM();
            return true;
        }
        do {
            iJ8 = J8();
            if (iJ8 == 0) {
                break;
            }
        } while (Zo(iJ8));
        v5(((i >>> 3) << 3) | 4);
        return true;
    }

    public final int aM() throws y7 {
        return (U2() & 255) | ((U2() & 255) << 8) | ((U2() & 255) << 16) | ((U2() & 255) << 24);
    }

    public final void gn(int i) {
        this.gn = i;
        Mr();
    }

    public final long j3() throws y7 {
        return ((U2() & 255) << 8) | (U2() & 255) | ((U2() & 255) << 16) | ((U2() & 255) << 24) | ((U2() & 255) << 32) | ((U2() & 255) << 40) | ((U2() & 255) << 48) | ((U2() & 255) << 56);
    }

    public final int j6() {
        return this.Zo - this.DW;
    }

    public final int lg() {
        int i = this.gn;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.Zo;
    }

    public final void tp(int i) {
        J0(i, this.VH);
    }

    public final void v5(int i) throws y7 {
        if (this.VH != i) {
            throw new y7("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final byte[] we(int i, int i2) {
        if (i2 == 0) {
            return c8.Hw;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.j6, this.DW + i, bArr, 0, i2);
        return bArr;
    }
}
