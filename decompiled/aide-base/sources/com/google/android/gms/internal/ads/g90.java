package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public final class g90 {
    private final int DW;
    private s40 EQ;
    private final int FH;
    private int Hw;
    private int VH;
    private int Zo;
    private final byte[] j6;
    private int u7;
    private int v5;
    private int gn = Integer.MAX_VALUE;
    private int tp = 64;

    private g90(byte[] bArr, int i, int i2) {
        this.j6 = bArr;
        this.DW = i;
        int i3 = i2 + i;
        this.Hw = i3;
        this.FH = i3;
        this.Zo = i;
    }

    private final byte J0() throws o90 {
        int i = this.Zo;
        if (i == this.Hw) {
            throw o90.j6();
        }
        byte[] bArr = this.j6;
        this.Zo = i + 1;
        return bArr[i];
    }

    private final void U2(int i) throws o90 {
        if (i < 0) {
            throw o90.DW();
        }
        int i2 = this.Zo;
        int i3 = i2 + i;
        int i4 = this.gn;
        if (i3 > i4) {
            U2(i4 - i2);
            throw o90.j6();
        }
        if (i > this.Hw - i2) {
            throw o90.j6();
        }
        this.Zo = i2 + i;
    }

    public static g90 lg(byte[] bArr, int i, int i2) {
        return new g90(bArr, 0, i2);
    }

    private final void we() {
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

    public final byte[] DW() throws o90 {
        int iTp = tp();
        if (iTp < 0) {
            throw o90.DW();
        }
        if (iTp == 0) {
            return t90.v5;
        }
        int i = this.Hw;
        int i2 = this.Zo;
        if (iTp > i - i2) {
            throw o90.j6();
        }
        byte[] bArr = new byte[iTp];
        System.arraycopy(this.j6, i2, bArr, 0, iTp);
        this.Zo += iTp;
        return bArr;
    }

    public final long EQ() throws o90 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & 127) << i;
            if ((J0() & 128) == 0) {
                return j;
            }
        }
        throw o90.FH();
    }

    public final String FH() throws o90 {
        int iTp = tp();
        if (iTp < 0) {
            throw o90.DW();
        }
        if (iTp > this.Hw - this.Zo) {
            throw o90.j6();
        }
        String str = new String(this.j6, this.Zo, iTp, n90.j6);
        this.Zo += iTp;
        return str;
    }

    public final <T extends r50<T, ?>> T Hw(k70<T> k70Var) throws IOException {
        try {
            if (this.EQ == null) {
                this.EQ = s40.ei(this.j6, this.DW, this.FH);
            }
            int iU2 = this.EQ.U2();
            int i = this.Zo - this.DW;
            if (iU2 > i) {
                throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", Integer.valueOf(iU2), Integer.valueOf(i)));
            }
            this.EQ.vy(i - iU2);
            this.EQ.yS(this.tp - this.u7);
            T t = (T) this.EQ.Hw(k70Var, d50.v5());
            aM(this.VH);
            return t;
        } catch (y50 e) {
            throw new o90("", e);
        }
    }

    public final byte[] J8(int i, int i2) {
        if (i2 == 0) {
            return t90.v5;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.j6, this.DW + i, bArr, 0, i2);
        return bArr;
    }

    public final void Mr(int i) {
        this.gn = i;
        we();
    }

    public final int QX() {
        int i = this.gn;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.Zo;
    }

    public final long VH() {
        return EQ();
    }

    final void Ws(int i, int i2) {
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

    public final void XL(int i) throws o90 {
        if (this.VH != i) {
            throw new o90("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int Zo() throws o90 {
        if (this.Zo == this.Hw) {
            this.VH = 0;
            return 0;
        }
        int iTp = tp();
        this.VH = iTp;
        if (iTp != 0) {
            return iTp;
        }
        throw new o90("Protocol message contained an invalid tag (zero).");
    }

    public final void a8(int i) {
        Ws(i, this.VH);
    }

    public final boolean aM(int i) throws o90 {
        int iZo;
        int i2 = i & 7;
        if (i2 == 0) {
            tp();
            return true;
        }
        if (i2 == 1) {
            J0();
            J0();
            J0();
            J0();
            J0();
            J0();
            J0();
            J0();
            return true;
        }
        if (i2 == 2) {
            U2(tp());
            return true;
        }
        if (i2 == 3) {
            do {
                iZo = Zo();
                if (iZo == 0) {
                    break;
                }
            } while (aM(iZo));
            XL(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i2 == 4) {
            return false;
        }
        if (i2 != 5) {
            throw new o90("Protocol message tag had invalid wire type.");
        }
        J0();
        J0();
        J0();
        J0();
        return true;
    }

    public final int gn() {
        return tp();
    }

    public final int j3(int i) throws o90 {
        if (i < 0) {
            throw o90.DW();
        }
        int i2 = i + this.Zo;
        int i3 = this.gn;
        if (i2 > i3) {
            throw o90.j6();
        }
        this.gn = i2;
        we();
        return i3;
    }

    public final int j6() {
        return this.Zo - this.DW;
    }

    public final int tp() throws o90 {
        int i;
        byte bJ0 = J0();
        if (bJ0 >= 0) {
            return bJ0;
        }
        int i2 = bJ0 & 127;
        byte bJ02 = J0();
        if (bJ02 >= 0) {
            i = bJ02 << 7;
        } else {
            i2 |= (bJ02 & 127) << 7;
            byte bJ03 = J0();
            if (bJ03 >= 0) {
                i = bJ03 << 14;
            } else {
                i2 |= (bJ03 & 127) << 14;
                byte bJ04 = J0();
                if (bJ04 < 0) {
                    int i3 = i2 | ((bJ04 & 127) << 21);
                    byte bJ05 = J0();
                    int i4 = i3 | (bJ05 << 28);
                    if (bJ05 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        if (J0() >= 0) {
                            return i4;
                        }
                    }
                    throw o90.FH();
                }
                i = bJ04 << 21;
            }
        }
        return i2 | i;
    }

    public final boolean u7() {
        return tp() != 0;
    }

    public final void v5(p90 p90Var) throws o90 {
        int iTp = tp();
        if (this.u7 >= this.tp) {
            throw new o90("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iJ3 = j3(iTp);
        this.u7++;
        p90Var.j6(this);
        XL(0);
        this.u7--;
        Mr(iJ3);
    }
}
