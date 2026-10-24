package com.google.android.gms.internal.ads;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* loaded from: classes.dex */
public final class h90 {
    private x40 DW;
    private int FH;
    private final ByteBuffer j6;

    private h90(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    public static int BT(byte[] bArr) {
        return J8(bArr.length) + bArr.length;
    }

    public static int J0(int i) {
        if (i >= 0) {
            return J8(i);
        }
        return 10;
    }

    public static int J8(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int QX(int i, String str) {
        return we(i) + Ws(str);
    }

    public static int U2(int i, long j) {
        return we(i) + gn(j);
    }

    private final void VH(long j) throws i90 {
        while (((-128) & j) != 0) {
            XL((((int) j) & 127) | 128);
            j >>>= 7;
        }
        XL((int) j);
    }

    public static int Ws(String str) {
        int iJ6 = j6(str);
        return J8(iJ6) + iJ6;
    }

    private final void XL(int i) throws i90 {
        byte b = (byte) i;
        if (!this.j6.hasRemaining()) {
            throw new i90(this.j6.position(), this.j6.limit());
        }
        this.j6.put(b);
    }

    public static int Zo(int i, byte[] bArr) {
        return we(i) + BT(bArr);
    }

    public static int a8(int i, long j) {
        return we(i) + gn(j);
    }

    public static h90 gW(byte[] bArr) {
        return lg(bArr, 0, bArr.length);
    }

    public static int gn(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    private static int j6(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char cCharAt2 = charSequence.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        long j = i3 + 4294967296L;
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static h90 lg(byte[] bArr, int i, int i2) {
        return new h90(bArr, 0, i2);
    }

    private static void u7(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int i2;
        char cCharAt;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        int i3 = 0;
        if (!byteBuffer.hasArray()) {
            int length = charSequence.length();
            while (i3 < length) {
                char cCharAt2 = charSequence.charAt(i3);
                if (cCharAt2 < 128) {
                    byteBuffer.put((byte) cCharAt2);
                } else if (cCharAt2 < 2048) {
                    byteBuffer.put((byte) ((cCharAt2 >>> 6) | 960));
                    byteBuffer.put((byte) ((cCharAt2 & '?') | 128));
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        int i4 = i3 + 1;
                        if (i4 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i4);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                                byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                                byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                                byteBuffer.put((byte) ((codePoint & 63) | 128));
                                i3 = i4;
                            } else {
                                i3 = i4;
                            }
                        }
                        StringBuilder sb = new StringBuilder(39);
                        sb.append("Unpaired surrogate at index ");
                        sb.append(i3 - 1);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    byteBuffer.put((byte) ((cCharAt2 >>> '\f') | 480));
                    byteBuffer.put((byte) (((cCharAt2 >>> 6) & 63) | 128));
                    byteBuffer.put((byte) ((cCharAt2 & '?') | 128));
                }
                i3++;
            }
            return;
        }
        try {
            byte[] bArrArray = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            int iRemaining = byteBuffer.remaining();
            int length2 = charSequence.length();
            int i5 = iRemaining + iArrayOffset;
            while (i3 < length2) {
                int i6 = i3 + iArrayOffset;
                if (i6 >= i5 || (cCharAt = charSequence.charAt(i3)) >= 128) {
                    break;
                }
                bArrArray[i6] = (byte) cCharAt;
                i3++;
            }
            if (i3 == length2) {
                i = iArrayOffset + length2;
            } else {
                i = iArrayOffset + i3;
                while (i3 < length2) {
                    char cCharAt4 = charSequence.charAt(i3);
                    if (cCharAt4 >= 128 || i >= i5) {
                        if (cCharAt4 < 2048 && i <= i5 - 2) {
                            int i7 = i + 1;
                            bArrArray[i] = (byte) ((cCharAt4 >>> 6) | 960);
                            i = i7 + 1;
                            bArrArray[i7] = (byte) ((cCharAt4 & '?') | 128);
                        } else {
                            if ((cCharAt4 >= 55296 && 57343 >= cCharAt4) || i > i5 - 3) {
                                if (i > i5 - 4) {
                                    StringBuilder sb2 = new StringBuilder(37);
                                    sb2.append("Failed writing ");
                                    sb2.append(cCharAt4);
                                    sb2.append(" at index ");
                                    sb2.append(i);
                                    throw new ArrayIndexOutOfBoundsException(sb2.toString());
                                }
                                int i8 = i3 + 1;
                                if (i8 != charSequence.length()) {
                                    char cCharAt5 = charSequence.charAt(i8);
                                    if (Character.isSurrogatePair(cCharAt4, cCharAt5)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt4, cCharAt5);
                                        int i9 = i + 1;
                                        bArrArray[i] = (byte) ((codePoint2 >>> 18) | 240);
                                        int i10 = i9 + 1;
                                        bArrArray[i9] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                        int i11 = i10 + 1;
                                        bArrArray[i10] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                        i = i11 + 1;
                                        bArrArray[i11] = (byte) ((codePoint2 & 63) | 128);
                                        i3 = i8;
                                    } else {
                                        i3 = i8;
                                    }
                                }
                                StringBuilder sb3 = new StringBuilder(39);
                                sb3.append("Unpaired surrogate at index ");
                                sb3.append(i3 - 1);
                                throw new IllegalArgumentException(sb3.toString());
                            }
                            int i12 = i + 1;
                            bArrArray[i] = (byte) ((cCharAt4 >>> '\f') | 480);
                            int i13 = i12 + 1;
                            bArrArray[i12] = (byte) (((cCharAt4 >>> 6) & 63) | 128);
                            i2 = i13 + 1;
                            bArrArray[i13] = (byte) ((cCharAt4 & '?') | 128);
                        }
                        i3++;
                    } else {
                        i2 = i + 1;
                        bArrArray[i] = (byte) cCharAt4;
                    }
                    i = i2;
                    i3++;
                }
            }
            byteBuffer.position(i - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e);
            throw bufferOverflowException;
        }
    }

    public static int v5(int i, p90 p90Var) {
        int iWe = we(i);
        int iV5 = p90Var.v5();
        return iWe + J8(iV5) + iV5;
    }

    public static int vy(int i, int i2) {
        return we(i) + J0(i2);
    }

    public static int we(int i) {
        return J8(i << 3);
    }

    public final void DW(int i, p90 p90Var) throws i90 {
        er(i, 2);
        if (p90Var.j6 < 0) {
            p90Var.v5();
        }
        aM(p90Var.j6);
        p90Var.Hw(this);
    }

    public final void EQ(int i, String str) throws i90 {
        er(i, 2);
        try {
            int iJ8 = J8(str.length());
            if (iJ8 != J8(str.length() * 3)) {
                aM(j6(str));
                u7(str, this.j6);
                return;
            }
            int iPosition = this.j6.position();
            if (this.j6.remaining() < iJ8) {
                throw new i90(iPosition + iJ8, this.j6.limit());
            }
            this.j6.position(iPosition + iJ8);
            u7(str, this.j6);
            int iPosition2 = this.j6.position();
            this.j6.position(iPosition);
            aM((iPosition2 - iPosition) - iJ8);
            this.j6.position(iPosition2);
        } catch (BufferOverflowException e) {
            i90 i90Var = new i90(this.j6.position(), this.j6.limit());
            i90Var.initCause(e);
            throw i90Var;
        }
    }

    public final void FH(int i, byte[] bArr) throws i90 {
        er(i, 2);
        aM(bArr.length);
        P8(bArr);
    }

    public final void Hw() {
        if (this.j6.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", Integer.valueOf(this.j6.remaining())));
        }
    }

    public final void Mr(int i, boolean z) throws i90 {
        er(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        if (!this.j6.hasRemaining()) {
            throw new i90(this.j6.position(), this.j6.limit());
        }
        this.j6.put(b);
    }

    public final void P8(byte[] bArr) throws i90 {
        int length = bArr.length;
        if (this.j6.remaining() < length) {
            throw new i90(this.j6.position(), this.j6.limit());
        }
        this.j6.put(bArr, 0, length);
    }

    public final void aM(int i) throws i90 {
        while ((i & (-128)) != 0) {
            XL((i & 127) | 128);
            i >>>= 7;
        }
        XL(i);
    }

    public final void er(int i, int i2) throws i90 {
        aM((i << 3) | i2);
    }

    public final void j3(int i, long j) throws i90 {
        er(i, 0);
        VH(j);
    }

    public final void rN(int i, long j) throws i90 {
        er(i, 0);
        VH(j);
    }

    public final void tp(int i, z60 z60Var) {
        if (this.DW == null) {
            this.DW = x40.k2(this.j6);
            this.FH = this.j6.position();
        } else if (this.FH != this.j6.position()) {
            this.DW.FH(this.j6.array(), this.FH, this.j6.position() - this.FH);
            this.FH = this.j6.position();
        }
        x40 x40Var = this.DW;
        x40Var.gn(i, z60Var);
        x40Var.DW();
        this.FH = this.j6.position();
    }

    public final void yS(int i, int i2) throws i90 {
        er(i, 0);
        if (i2 >= 0) {
            aM(i2);
        } else {
            VH(i2);
        }
    }

    private h90(ByteBuffer byteBuffer) {
        this.j6 = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }
}
